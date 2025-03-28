package com.example.implementation

import com.example.interfaces.Tyres
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class MichelinTyres: Tyres {
    override fun rotate(): String {
        return "Tyres go to the restaurant"
    }
}