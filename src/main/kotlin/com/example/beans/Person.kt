package com.example.beans

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class Person @Autowired constructor(vehicle: Vehicle) {

    private var name: String = "Lucy"
    private var vehicle: Vehicle? = vehicle

    init {
        println("Person bean created by Spring")
    }

    fun getName() = name

    fun setName(name: String) {
        this.name = name
    }

    fun getVehicle() = vehicle

    fun setVehicle(vehicle: Vehicle) {
        this.vehicle = vehicle
    }
}