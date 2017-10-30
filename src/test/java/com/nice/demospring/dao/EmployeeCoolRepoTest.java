package com.nice.demospring.dao;

import com.nice.demospring.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeCoolRepoTest {

    @Autowired
    private EmployeeCoolRepo employeeCoolRepo;

    @Test
    @Transactional
    public void test() throws Exception {


        employeeCoolRepo.save(new Employee("Michal", 25));
        employeeCoolRepo.save(new Employee("Michael", 48));
        employeeCoolRepo.save(new Employee("Rafi", 48));
        employeeCoolRepo.save(new Employee("Uri", 58));
        employeeCoolRepo.save(new Employee("Gogi", 38));
        long count = employeeCoolRepo.count();
        System.out.println("count = " + count);
        List<Employee> employees = employeeCoolRepo.findByAgeLessThan(40);
        System.out.println("employees = " + employees);

        employeeCoolRepo.findPleeeeeeeeaseByNameStartsWith("Mich");

    }
}




