package com.example.interfaces

import com.example.model.Song

interface Speakers {
    fun makeSound(song: Song): String
}