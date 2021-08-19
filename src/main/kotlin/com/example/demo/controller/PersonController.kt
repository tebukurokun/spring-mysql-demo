package com.example.demo.controller

import com.example.demo.entity.Person
import com.example.demo.service.PersonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/person")
class PersonController(private val personService: PersonService) {

    @GetMapping("/all")
    fun findAll(): List<Person> {
        return personService.findAll()
    }
}
