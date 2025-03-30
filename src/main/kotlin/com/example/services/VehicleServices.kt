package com.example.services

import com.example.interfaces.Speakers
import com.example.interfaces.Tyres
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
// Singleton is default, but can be included for clarity
@Scope(BeanDefinition.SCOPE_SINGLETON)
class VehicleServices(
    val speakers: Speakers,
    var tyres: Tyres
) {

    fun playMusic() {
        println(speakers.makeSound())
    }

    fun moveVehicle() {
        println(tyres.rotate())
    }

}