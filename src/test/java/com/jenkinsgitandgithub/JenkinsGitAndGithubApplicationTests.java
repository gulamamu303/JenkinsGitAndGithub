package com.jenkinsgitandgithub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsGitAndGithubApplicationTests {

	static Logger logger=(Logger) LoggerFactory.getLogger(JenkinsGitAndGithubApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
		
	}

}
