package com.example.demo.service

import com.example.demo.entity.Person
import com.example.demo.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService (private val personRepository: PersonRepository) {

    fun findAll(): List<Person> = personRepository.findAll()
    
}
