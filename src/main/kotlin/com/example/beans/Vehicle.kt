package com.example.beans

class Vehicle {

    private var name: String? = null

    fun getName() = name

    fun setName(name: String) {
        this.name = name
    }

    fun printHello() {
        println("Printing Hello from Component Vehicle Bean")
    }
}