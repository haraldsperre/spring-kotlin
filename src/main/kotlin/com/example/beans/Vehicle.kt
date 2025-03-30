package com.example.beans

import com.example.services.VehicleServices
import org.springframework.stereotype.Component

@Component(value="vehicleBean")
class Vehicle(
    private val vehicleServices: VehicleServices
) {
    private var name: String = "Honda"

    init {
        println("Vehicle Bean created by Spring")
    }

    fun getName() = name

    fun setName(name: String) {
        this.name = name
    }

    fun getVehicleService() = vehicleServices

    fun printHello() {
        println("Printing Hello from Component Vehicle Bean")
    }

    override fun toString(): String {
        return "Vehicle name is - $name"
    }
}