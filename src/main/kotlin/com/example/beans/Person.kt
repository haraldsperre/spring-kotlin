package com.example.beans

import org.springframework.stereotype.Component

@Component(value="personBean")
class Person(
    private val vehicle: Vehicle
) {
    private var name: String = "Lucy"

    fun getName() = name

    fun setName(name: String) {
        this.name = name
    }

    fun getVehicle() = vehicle

}