package com.example.main

import com.example.beans.Vehicle
import com.example.config.ProjectConfig
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val context = AnnotationConfigApplicationContext(ProjectConfig::class.java)

    val vehicle = context.getBean(Vehicle::class.java)
    println("Primary Vehicle name from spring context is: ${vehicle.getName()}")

}