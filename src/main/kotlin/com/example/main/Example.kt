package com.example.main

import com.example.beans.Vehicle
import com.example.config.ProjectConfig
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val context = AnnotationConfigApplicationContext(ProjectConfig::class.java)

    val veh = context.getBean("vehicle1", Vehicle::class.java)
    println("Vehicle name from spring context is: ${veh.getName()}")
}