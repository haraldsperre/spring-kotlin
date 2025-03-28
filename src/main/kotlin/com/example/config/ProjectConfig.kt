package com.example.config

import com.example.beans.Vehicle
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
@Configuration
open class ProjectConfig {

    /*
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes its context and adds the returned
    value to the context.
    * */
    @Bean
    open fun vehicle1(): Vehicle {
        val veh = Vehicle()
        veh.setName("Audi")
        return veh
    }

    @Bean
    open fun vehicle2(): Vehicle {
        val veh = Vehicle()
        veh.setName("Honda")
        return veh
    }

    @Bean
    open fun vehicle3(): Vehicle {
        val veh = Vehicle()
        veh.setName("Ferrari")
        return veh
    }



}