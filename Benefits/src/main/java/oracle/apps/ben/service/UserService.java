package oracle.apps.ben.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oracle.apps.ben.model.Enrollment;
import oracle.apps.ben.model.User;
import oracle.apps.ben.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User getUserInfo(String userId) {
		return userRepository.getUserInfo(userId);
	}
	
	public List<Enrollment> getUserEnrollments(String userId) {
		return userRepository.getUserEnrollments(userId);
	}

	public Enrollment getUserEnrollmentById(String userId, String prttEnrtRsltId) {
		return userRepository.getEnrollmentById(userId, prttEnrtRsltId);
	}

}
