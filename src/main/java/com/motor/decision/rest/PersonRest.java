package com.motor.decision.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motor.decision.dto.PersonDTO;
import com.motor.decision.service.DroolsService;

@RestController
@RequestMapping("/api/person")
public class PersonRest {

    private final DroolsService service;

    public PersonRest(DroolsService service) {
        this.service = service;
    }

    @PostMapping("/process")
    public PersonDTO processPerson(@RequestBody PersonDTO person) {
        return service.evaluatePerson(person);
    }
}
