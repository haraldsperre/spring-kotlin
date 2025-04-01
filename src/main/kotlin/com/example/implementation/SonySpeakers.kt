package com.example.implementation

import com.example.interfaces.Speakers
import com.example.model.Song
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class SonySpeakers: Speakers {
    override fun makeSound(song: Song): String {
        return "Playing the song ${song.getTitle()} by " +
                song.getSingerName() +
                " with SONY speakers"
    }
}