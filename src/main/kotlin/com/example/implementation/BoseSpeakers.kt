package com.example.implementation

import com.example.interfaces.Speakers
import org.springframework.stereotype.Component

@Component
class BoseSpeakers: Speakers {
    override fun makeSound(): String {
        return "Making Bose Sounds"
    }
}