package com.nice.demospring;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nice.demospring.controllers.Person;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@SpringBootApplication
public class DemoSpringApplication {

	@Autowired
	private ObjectMapper mapper;




	@PostConstruct

	@SneakyThrows
	public void stam() {
		ObjectMapper objectMapper = new ObjectMapper();
		Person person = new Person();
		person.setName("Amir");
		person.setAge(39);
		person.setName("asdas");
		String json = objectMapper.writeValueAsString(person);
		System.out.println("json = " + json);
		Person person1 = objectMapper.readValue("{\"name\":\"jeka\",\"age\":39}", Person.class);
		System.out.println("person1 = " + person1);
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}
}
