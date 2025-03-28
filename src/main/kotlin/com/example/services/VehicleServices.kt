package com.example.services

import com.example.interfaces.Speakers
import com.example.interfaces.Tyres
import org.springframework.stereotype.Component

@Component
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