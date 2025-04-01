package com.example.services

import com.example.interfaces.Speakers
import com.example.interfaces.Tyres
import com.example.model.Song
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
open class VehicleServices {

    @Autowired
    private var speakers: Speakers? = null
    private var tyres: Tyres? = null

    fun playMusic(vehicleStarted: Boolean, song: Song): String? {
        return speakers?.makeSound(song)
    }

    fun moveVehicle(vehicleStarted: Boolean): String? {
        return tyres?.rotate()
    }

    fun applyBrakes(vehicleStarted: Boolean): String? {
        return tyres?.stop()
    }

    fun getSpeakers() = speakers

    fun setSpeakers(speakers: Speakers) {
        this.speakers = speakers
    }

    fun getTyres() = tyres

    @Autowired
    fun setTyres(tyres: Tyres) {
        this.tyres = tyres
    }
}