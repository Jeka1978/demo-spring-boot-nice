package com.nice.demospring.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.SneakyThrows;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NiceController {


    @PostMapping("/checkbeer")
    public boolean isBeerAllowed(@RequestBody Person person) {
        if (person.getName().toLowerCase().startsWith("j")) {
            return true;
        }
        else {
            return person.getAge() > 18;
        }

    }


    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping() {
        return "שלום";
    }


    @GetMapping("/person/{name}")   // localhost:808?/api/person/moshe
    public Person personWithNameByPathVariable(@PathVariable("name") String name) {
        Person person = new Person(name, 39);
        return person;
    }


    @GetMapping("/person")   // localhost:808?/api/person?name=shlomo
    public Person personWithNameByRequestParam(@RequestParam(value = "name", defaultValue = "ozzy",required = false) String name) {
        Person person = new Person(name, 39);
        return person;
    }

    @SneakyThrows
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jeka = objectMapper.writeValueAsString(new Person("Jeka", 39));
        objectMapper.readValue(jeka, Person.class);
        System.out.println(jeka);
    }


}
