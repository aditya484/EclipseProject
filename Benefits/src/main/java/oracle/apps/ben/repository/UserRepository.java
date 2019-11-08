package oracle.apps.ben.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import oracle.apps.ben.model.Enrollment;
import oracle.apps.ben.model.User;

@Repository
public class UserRepository{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	private MessageSource messageSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	

	public User getUserInfo(String userId) {
		String sql = "SELECT  person_id" + 
				"       ,first_name" + 
				"       ,last_name" + 
				"       ,full_name" + 
				"       ,employee_number" + 
				"       ,business_group_id" + 
				"       ,date_of_birth" + 
				"       ,national_identifier" + 
				"       ,sex" + 
				"       ,email_address " + 
				"FROM    per_all_people_f " + 
				"WHERE   person_id = ? " + 
				"AND     sysdate BETWEEN effective_start_date " + 
				"                AND     effective_end_date";
		return jdbcTemplate.queryForObject(sql, new Object[] {userId}, 	new UserMapper());
	}



	
	public List<Enrollment> getUserEnrollments(String userId) {
		String sql = messageSource.getMessage("user.enrollment",null,null);
		
		return jdbcTemplate.query(sql, new Object[] {8906,userId}, new EnrollmentMapper());
		
	}

	public Enrollment getEnrollmentById(String userId, String prttEnrtRsltId) {
		String sql = messageSource.getMessage("user.enrollment.byId",null,null);
		
		return jdbcTemplate.queryForObject(sql, new Object[] {8906,userId, prttEnrtRsltId}, new EnrollmentMapper());
	}
}
