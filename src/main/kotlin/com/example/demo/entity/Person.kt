package com.example.demo.entity

import javax.persistence.*

@Entity
@Table(name = "person")
data class Person(
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    val id: Long,


    @Column(name = "name")
    val name: String?,


    @Column(name = "age")
    val age: Long?

)


