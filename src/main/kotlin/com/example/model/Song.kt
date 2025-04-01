package com.example.model

class Song {

    private var title: String = ""
    private var singerName: String = ""

    fun getTitle(): String = title

    fun setTitle(title: String) {
        this.title = title
    }

    fun getSingerName(): String = singerName

    fun setSingerName(singerName: String) {
        this.singerName = singerName
    }
}