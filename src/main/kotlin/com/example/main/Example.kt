package com.example.main

import com.example.beans.Person
import com.example.config.ProjectConfig
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val context = AnnotationConfigApplicationContext(ProjectConfig::class.java)

    println("Before retrieving the Person Bean from the Spring Context")
    val person = context.getBean(Person::class.java)
    println("After retrieving the Person Bean from the Spring Context")
}