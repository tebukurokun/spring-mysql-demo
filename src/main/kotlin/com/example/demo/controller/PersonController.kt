package com.example.demo.controller

import com.example.demo.entity.Person
import com.example.demo.service.PersonService
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/person")
class PersonController(private val personService: PersonService) {

    @GetMapping("/all")
    fun findAllPerson(): List<Person> {
        return personService.findAllPerson()
    }
    
    @PostMapping
    fun createPerson(@RequestBody newPerson: Person): Person {
        return personService.createPerson(newPerson)
    }

    @PutMapping("/{id}")
    fun updatePerson(@PathVariable(value = "id") id: Long, @RequestBody newPerson: Person) {
        return personService.updatePerson(id, newPerson)
    }
    
    @DeleteMapping("/{id}")
    fun deletePerson(@PathVariable(value = "id") id: Long) {
        return personService.deletePerson(id)
    }
}
