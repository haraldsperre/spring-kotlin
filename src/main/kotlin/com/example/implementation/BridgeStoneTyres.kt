package com.example.implementation

import com.example.interfaces.Tyres
import org.springframework.stereotype.Component

@Component
class BridgeStoneTyres: Tyres {
    override fun rotate(): String {
        return "Tyres go round round round"
    }
}