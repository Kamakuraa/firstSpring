package com.example.demo.domain;

import com.sun.jdi.request.StepRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Person {
    private int id;
    private String name;
    private int age;
}
