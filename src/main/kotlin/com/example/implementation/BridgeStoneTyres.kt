package com.example.implementation

import com.example.interfaces.Tyres
import org.springframework.stereotype.Component

@Component
class BridgeStoneTyres: Tyres {
    override fun rotate(): String {
        return "Vehicle moving with the help of BridgeStone tyres"
    }

    override fun stop(): String {
        return "Vehicle stopped with the help of BridgeStone tyres"
    }
}