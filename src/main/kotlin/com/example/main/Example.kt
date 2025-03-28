package com.example.main

import com.example.beans.Vehicle
import com.example.config.ProjectConfig
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val vehicle = Vehicle()
    vehicle.setName("Honda City")
    println("Vehicle name from non-spring context is: ${vehicle.getName()}")

    val context = AnnotationConfigApplicationContext(ProjectConfig::class.java)

    val veh = context.getBean(Vehicle::class.java)
    println("Vehicle name from spring context is: ${veh.getName()}")

    val hello = context.getBean(String::class.java)
    println("String value from Spring Context is: $hello")

    val num = context.getBean(Number::class.java)
    println("Number value from Spring Context is: $num")
}