package com.example.beans

class Vehicle {
    init {
        println("Vehicle bean created by Spring")
    }

    private var name: String? = null

    fun getName() = name

    fun setName(name: String) {
        this.name = name
    }

    fun printHello() {
        println("Printing Hello from Component Vehicle Bean")
    }

    override fun toString(): String {
        return "Vehicle name is - $name"
    }
}