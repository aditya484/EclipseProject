package oracle.apps.ben.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import oracle.apps.ben.model.User;

public class UserMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUserId(rs.getInt(1));
		user.setFirstName(rs.getString(2));
		user.setLastName(rs.getString(3));
		user.setFullName(rs.getString(4));
		user.setEmpNum(rs.getInt(5));
		user.setBgId(rs.getInt(6));
		user.setDob(rs.getDate(7));
		user.setNationalIdentifier(rs.getString(8));
		user.setSex(rs.getString(9));
		user.setEmail(rs.getString(10));
		return user;
	}
}
