package oracle.apps.ben.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import oracle.apps.ben.model.Enrollment;
import oracle.apps.ben.model.User;
import oracle.apps.ben.service.UserService;

@RequestMapping(value =  "/api",produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
@RestController
public class BenefitsService {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public User getUser() {
		
		System.out.println("I am here..");
		if(userService == null) {
			System.out.println("Userservice not Autowired");
			return null;
		}
			
		return userService.getUserInfo("33794");
	}
	
	@RequestMapping(value="/enrollments/{userId}", method = RequestMethod.GET)
	public List<Enrollment> getEnrollments(@PathVariable String userId){
		//Enrollments enrollments = new Enrollments(); 
		//enrollments.setEnrollments(userService.getUserEnrollments(userId));
		//return enrollments;
		return userService.getUserEnrollments(userId);
	}
	
	@RequestMapping(value="/enrollments/{userId}/{prttEnrtRsltId}", method = RequestMethod.GET)
	public Enrollment getEnrollmentById(@PathVariable("userId") String userId,@PathVariable("prttEnrtRsltId") String prttEnrtRsltId){
		return userService.getUserEnrollmentById(userId,prttEnrtRsltId);
		
	}
	
	
}
