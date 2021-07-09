package com.example.demo.controller;

import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping
    List<Person> getPerson() {
        return personService.getAll();
    }

    @GetMapping("{}ngersonId")
    Person getPerson (@PathVariable int personId){
        return personService.getStudent(personId);
    }
}
