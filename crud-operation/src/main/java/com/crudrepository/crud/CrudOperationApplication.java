package com.crudrepository.crud;

import com.crudrepository.crud.model.Employee;
import com.crudrepository.crud.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudOperationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationApplication.class, args);
	}
	@Autowired
	private EmployeeRepo employeeRepo;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("swagat");
		employee.setLastName("patil");
		employee.setEmailId("swagatpatil@gmail.com");
		employeeRepo.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("amit");
		employee1.setLastName("patil");
		employee1.setEmailId("amitpatil@gmail.com");
		employeeRepo.save(employee1);

		Employee employee2 = new Employee();
		employee2.setFirstName("anil");
		employee2.setLastName("sutar");
		employee2.setEmailId("anilsutar@gmail.com");
		employeeRepo.save(employee2);
	}
}
