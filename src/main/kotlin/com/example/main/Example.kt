package com.example.main

import com.example.beans.Vehicle
import com.example.config.ProjectConfig
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val context = AnnotationConfigApplicationContext(ProjectConfig::class.java)

    val veh1 = context.getBean("audiVehicle", Vehicle::class.java)
    println("Vehicle name from spring context is: ${veh1.getName()}")

    val veh2 = context.getBean("hondaVehicle", Vehicle::class.java)
    println("Vehicle name from spring context is: ${veh2.getName()}")

    val veh3 = context.getBean("ferrariVehicle", Vehicle::class.java)
    println("Vehicle name from spring context is: ${veh3.getName()}")
}