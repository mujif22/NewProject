package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@SpringBootApplication
public class SbStudentDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbStudentDataJpaApplication.class, args);
			StudentRepo bean = run.getBean(StudentRepo.class);
			Student s = new Student();
			s.setSName("mujif");
			s.setSAddress("Ieet");
			bean.save(s);
			run.close();
	}

}
