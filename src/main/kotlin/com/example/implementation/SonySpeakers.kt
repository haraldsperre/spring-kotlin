package com.example.implementation

import com.example.interfaces.Speakers
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class SonySpeakers: Speakers {
    override fun makeSound(): String {
        return "Making SONY sounds"
    }
}