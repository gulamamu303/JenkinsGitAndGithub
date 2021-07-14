package com.jenkinsgitandgithub;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsGitAndGithubApplication {

	public static Logger logger=(Logger) LoggerFactory.getLogger(JenkinsGitAndGithubApplication.class);
	@PostConstruct
	public void intt()
	{
		logger.info("Application Started...");
	}
	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(JenkinsGitAndGithubApplication.class, args);
	}

}
