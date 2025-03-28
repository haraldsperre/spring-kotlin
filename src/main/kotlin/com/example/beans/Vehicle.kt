package com.example.beans

import jakarta.annotation.PostConstruct
import jakarta.annotation.PreDestroy
import org.springframework.stereotype.Component

@Component
class Vehicle {

    private var name: String? = null

    fun getName() = name

    fun setName(name: String) {
        this.name = name
    }

    @PostConstruct
    fun initialize() {
        this.name = "Honda"
    }

    @PreDestroy
    fun destroy() {
        println("Destroying Vehicle Bean")
    }

    fun printHello() {
        println("Printing Hello from Component Vehicle Bean")
    }
}