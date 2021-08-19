package com.example.demo.service

import com.example.demo.entity.Person
import com.example.demo.repository.PersonRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class PersonService(private val personRepository: PersonRepository) {

    fun findAllPerson(): List<Person> = personRepository.findAll()

    fun findPersonById(id: Long): Person? = personRepository.findById(id).orElse(null)

    fun createPerson(person: Person) = personRepository.save(person)

    fun updatePerson(id: Long, newPerson: Person) {

        personRepository.findById(id).ifPresentOrElse(

            { existingPerson ->

                val updatedPerson = existingPerson.copy(name = newPerson.name, age = newPerson.age)

                personRepository.save(updatedPerson)
            },

            {
                throw Exception("person not found")
            }
        )

    }

    fun deletePerson(id: Long) = personRepository.deleteById(id)

}
