package com.example.main

import com.example.beans.Vehicle
import org.springframework.context.support.ClassPathXmlApplicationContext


fun main() {

    val context = ClassPathXmlApplicationContext("beans.xml")
    val vehicle = context.getBean(Vehicle::class.java)
    println("Vehicle name from Spring context is: ${vehicle.getName()}")

}