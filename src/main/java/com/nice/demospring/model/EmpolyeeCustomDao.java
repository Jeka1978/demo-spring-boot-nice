package com.nice.demospring.model;

import com.nice.demospring.controllers.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmpolyeeCustomDao {
    @PersistenceContext
    private EntityManager entityManager;

   @PostConstruct
   public void init(){
       System.out.println();
   }


   @Transactional
    public void saveEmployee(Employee employee){

       employee.setAge(10);
       entityManager.persist(employee);
       employee.setAge(120);
    }

    @Transactional
    public void add10ToAgeOfAllEmployees() {
        List<Employee> employees = entityManager.
                createQuery("from Employee e where e.age>:myAge").
                setParameter("myAge", 12).
                getResultList();

        employees.forEach(e->e.setAge(e.getAge()+10));

    }
}
