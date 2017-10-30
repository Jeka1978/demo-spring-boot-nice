package com.nice.demospring.dao;

import com.nice.demospring.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface EmployeeCoolRepo extends CrudRepository<Employee,Integer> {

    List<Employee> findByAgeLessThan(int age);

    @RestResource(path = "name")
    List<Employee> findPleeeeeeeeaseByNameStartsWith(@Param("name") String prefix);
}
