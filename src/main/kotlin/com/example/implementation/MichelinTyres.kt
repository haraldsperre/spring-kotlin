package com.example.implementation

import com.example.interfaces.Tyres
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class MichelinTyres: Tyres {
    override fun rotate(): String {
        return "Vehicle moving with the help of Michelin tyres"
    }

    override fun stop(): String {
        return "Vehicle stopped with the help of Michelin tyres"
    }
}