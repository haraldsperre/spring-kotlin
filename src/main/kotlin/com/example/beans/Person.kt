package com.example.beans

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Component

@Component(value="personBean")
@Lazy
class Person @Autowired constructor(private val vehicle: Vehicle) {
    private var name: String = "Lucy"

    init {
        println("Person bean created by Spring")
    }

    fun getName() = name

    fun setName(name: String) {
        this.name = name
    }

    fun getVehicle() = vehicle

}