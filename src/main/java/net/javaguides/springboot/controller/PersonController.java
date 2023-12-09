package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    @GetMapping("person")
    public Person getPerson(){


        Person person = new Person(
                "Abelardo",
                20
        );
                return person;
    }

    @GetMapping("persons")
    public List<Person> getPersons(){
        List<Person> persons= new ArrayList<>();
        persons.add(new Person("Jhon",20));
        persons.add(new Person("Alex",20));
        return persons;
    }
}
