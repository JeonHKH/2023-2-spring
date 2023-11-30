// /sbootblog/src/test/java/com/sg/leo/UserDAOTest.java

package com.sg.leo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sg.leo.domain.User;
import com.sg.leo.repository.UserDAO;



@SpringBootTest
public class MyspringApplicationTests {

	@Autowired
	private UserDAO userDAO;
	
	@Test
	void getUserListTest() {
		User user = new User();
		user.setUsername("testy1");
		user.setPassword("testy123");
		user.setEmail("testy@h.com");
		
		int before = userDAO.getUserList().size();
		userDAO.insertUser(user);
		int after = userDAO.getUserList().size();
		assertEquals(before+1, after);
	}
}