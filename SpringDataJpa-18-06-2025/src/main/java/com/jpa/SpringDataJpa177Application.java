package com.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import com.jpa.jpa.Student;
import com.jpa.jpa.StudentRepo;

@SpringBootApplication
public class SpringDataJpa177Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext stud = SpringApplication.run(SpringDataJpa177Application.class, args);
		StudentRepo sr = stud.getBean(StudentRepo.class);

		// QueryByExample
		Student s = new Student();

		s.setStudentId(102);
		s.setStudentName("ram");

		Example<Student> example = Example.of(s);
		List<Student> all = sr.findAll(example);

		for (Student stu : all) {
			System.out.println(stu);
		}

//		Student s1 = new Student();
//		s1.setStudentId(101);
//		s1.setStudentAddress("nlg");
//		s1.setStudentName("raha");
//
//	   sr.save(s1);

//		Student s1 = new Student();
//		s1.setStudentId(102);
//		s1.setStudentAddress("vkp");
//		s1.setStudentName("Ram");
//
//	   sr.save(s1);

	}

}
