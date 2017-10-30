package com.nice.demospring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Employee implements Serializable{
    @Id
    @GeneratedValue
    private int id;

    private int age;

    private String name;

    public Employee(String name,int age) {
        this.age = age;
        this.name = name;
    }
}
