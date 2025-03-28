package com.example.main

import com.example.beans.Person
import com.example.config.ProjectConfig
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val context = AnnotationConfigApplicationContext(ProjectConfig::class.java)
    val person = context.getBean(Person::class.java)

    println("Person name from Spring Context is: ${person.getName()}")
    println("Vehicle that Person owns is: ${person.getVehicle()}")
}