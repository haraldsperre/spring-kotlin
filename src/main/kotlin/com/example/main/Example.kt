package com.example.main

import com.example.beans.Vehicle
import com.example.config.ProjectConfig
import org.springframework.beans.factory.NoSuchBeanDefinitionException
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.util.*
import java.util.function.Supplier

fun main() {

    val context = AnnotationConfigApplicationContext(ProjectConfig::class.java)

    val volkswagen = Vehicle()
    volkswagen.setName("Volkswagen")
    val volkswagenSupplier = Supplier { volkswagen }

    val audiSupplier = Supplier {
        val audi = Vehicle()
        audi.setName("Audi")
        audi
    }

    val random = Random()
    val randomNumber = random.nextInt(10)
    println("randomNumber = $randomNumber")

    if (randomNumber % 2 == 0) {
        context.registerBean("volkswagen", Vehicle::class.java, volkswagenSupplier)
    } else {
        context.registerBean("audi", Vehicle::class.java, audiSupplier)
    }

    var volksVehicle: Vehicle? = null
    var audiVehicle: Vehicle? = null
    try {
        volksVehicle = context.getBean("volkswagen", Vehicle::class.java)
    } catch (noSuchBeanDefinitionException: NoSuchBeanDefinitionException) {
        println("Error while creating Volkswagen vehicle")
    }

    try {
        audiVehicle = context.getBean("audi", Vehicle::class.java)
    } catch (noSuchBeanDefinitionException: NoSuchBeanDefinitionException) {
        println("Error while creating audi vehicle")
    }

    if (volksVehicle != null) {
        println("Programming Vehicle name from Spring Context is: ${volksVehicle.getName()}")
    } else {
        println("Programming Vehicle Name from Spring Context is: ${audiVehicle!!.getName()}")
    }

}