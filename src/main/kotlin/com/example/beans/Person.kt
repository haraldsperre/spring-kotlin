package com.example.beans

class Person {
    init {
        println("Person bean created by Spring")
    }

    private var name: String? = null
    private var vehicle: Vehicle? = null

    fun getName() = name

    fun setName(name: String) {
        this.name = name
    }

    fun getVehicle() = vehicle

    fun setVehicle(vehicle: Vehicle) {
        this.vehicle = vehicle
    }
}