package com.example.main

import com.example.beans.Person
import com.example.config.ProjectConfig
import com.example.services.VehicleServices
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val context = AnnotationConfigApplicationContext(ProjectConfig::class.java)

    val vehicleServices1 = context.getBean(VehicleServices::class.java)
    val vehicleServices2 = context.getBean(VehicleServices::class.java)

    println("Object hashCode of vehicleServices1: ${vehicleServices1.hashCode()}")
    println("Object hashCode of vehicleServices2: ${vehicleServices2.hashCode()}")

    if (vehicleServices1 == vehicleServices2) {
        println("Vehicle Services is Singleton Scope")
    } else {
        println("Vehicle Services is Prototype Scope")
    }
}