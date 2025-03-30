package com.example.main

import com.example.config.ProjectConfig
import com.example.services.VehicleServices
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val context = AnnotationConfigApplicationContext(ProjectConfig::class.java)

    val vehicleService1 = context.getBean(VehicleServices::class.java)
    val vehicleService2 = context.getBean("vehicleServices", VehicleServices::class.java)

    println("Hashcode of the object vehicleServices1: ${vehicleService1.hashCode()}")
    println("Hashcode of the object vehicleServices2: ${vehicleService2.hashCode()}")

    if (vehicleService1 == vehicleService2) {
        println("VehicleServices bean is a singleton scope bean")
    }
}