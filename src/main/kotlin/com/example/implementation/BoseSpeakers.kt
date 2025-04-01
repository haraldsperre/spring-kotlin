package com.example.implementation

import com.example.interfaces.Speakers
import com.example.model.Song
import org.springframework.stereotype.Component

@Component
class BoseSpeakers: Speakers {
    override fun makeSound(song: Song): String {
        return "Playing the song ${song.getTitle()} by " +
                song.getSingerName() +
                " with Bose speakers"
    }
}