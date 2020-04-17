package com.capg.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.capg.springboot.model.User;

@SpringBootTest
class SpringBootGithubClientApplicationTests {

	@Autowired
	RestTemplate rt;
	@Test
	void contextLoads() {
		ResponseEntity<User> userEntity=rt.getForEntity("https://api.github.com/users/ram1ujdx",User.class);
		System.out.println(userEntity.getBody());
	}

}
