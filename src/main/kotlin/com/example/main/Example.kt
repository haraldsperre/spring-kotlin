package com.example.main

import com.example.config.ProjectConfig
import com.example.model.Song
import com.example.services.VehicleServices
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val context = AnnotationConfigApplicationContext(ProjectConfig::class.java)

    val vehicleServices = context.getBean(VehicleServices::class.java)
    println(vehicleServices.javaClass)

    val song = Song()
    song.setTitle("Blank Space")
    song.setSingerName("Taylor Swift")
    val vehicleStarted = true

    val moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted)
    val playMusicStatus = vehicleServices.playMusic(vehicleStarted, song)
    val applyBrakeStatus = vehicleServices.applyBrakes(vehicleStarted)
}