package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    @GetMapping("person")
    public Person getPerson(){


        Person person = new Person(
                "Abelardo",
                20,
                1
        );
                return person;
    }

    @GetMapping("persons")
    public List<Person> getPersons(){
        List<Person> persons= new ArrayList<>();
        persons.add(new Person("Jhon",20, 2));
        persons.add(new Person("Alex",20,3));
        return persons;
    }

    @GetMapping("persons/{id}")
    public Person personPathVariable(@PathVariable("id") int personId){
        return new Person ("Jhon",20, personId);
    }

    @GetMapping("persons/query")
    public Person personRequestVariable(@RequestParam int id){
        return new Person("Cuesta",60,id);
    }
}
