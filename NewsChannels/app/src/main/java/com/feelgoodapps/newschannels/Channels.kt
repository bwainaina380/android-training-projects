package com.feelgoodapps.newschannels

class Channels {
    fun getChannels(category: String): String {
        var newsChannels: String = ""

        if (category == "Global News") {
            newsChannels = "Al Jazeera\nCNN\nSky News\nBBC World"
        } else if (category == "Sports News") {
            newsChannels = "ESPN\nSuper Sports\nNBC Sports"
        } else {
            newsChannels = "Bloomberg\nFox News\nMSNBC"
        }

        return  newsChannels
    }
}