package com.example.demo.service;

import com.example.demo.domain.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    public List<Person> getAll(){
        return List.of(new Person(1, "Alex", 36));
    }

    public Person getStudent(int personId){
        return new Person(1, "Alex", 36);
    }
}
