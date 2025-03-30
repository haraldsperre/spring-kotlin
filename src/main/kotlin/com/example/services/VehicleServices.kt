package com.example.services

import com.example.interfaces.Speakers
import com.example.interfaces.Tyres
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
class VehicleServices(
    val speakers: Speakers,
    var tyres: Tyres
) {
    init {
        println("Vehicle Service Bean created by Spring")
    }

    fun playMusic() {
        println(speakers.makeSound())
    }

    fun moveVehicle() {
        println(tyres.rotate())
    }

}