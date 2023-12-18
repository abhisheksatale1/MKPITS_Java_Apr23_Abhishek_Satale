package com.example.SpringBoot_AdvanceMapping;

import com.example.SpringBoot_AdvanceMapping.Entity.Address;
import com.example.SpringBoot_AdvanceMapping.Entity.Student;
import com.example.SpringBoot_AdvanceMapping.Service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAdvanceMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdvanceMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		savedata();
	}
	private StudentService studentService;

	public SpringBootAdvanceMappingApplication(StudentService studentService) {
		this.studentService = studentService;
	}

	public String savedata(){
		Address address = new Address("new nanded", "Nashik");
		Student student = new Student(12,"abhi",address);
		String msg=studentService.save(student);
		System.out.println(address);
		System.out.println(student);
		System.out.println(msg);
				return msg;

	}

}
