package com.example.demo.entity

import javax.persistence.*

@Entity
@Table(name = "person")
data class Person(
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    val id: Long,


    @Column(name = "name", nullable = false)
    val name: String,


    @Column(name = "age", nullable = false)
    val age: Long

)


