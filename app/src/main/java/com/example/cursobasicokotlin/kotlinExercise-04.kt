package com.example.cursobasicokotlin
/*   Song catalog
Create a class that can represent the structure of a song. The Song class must include these code elements:

Properties for the title, artist, year published, and play count
A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
A method that prints a song description in this format:
"[Title], performed by [artist], was released in [year published]."
 */
class Song(
    var title:String,
    var artist:String,
    var publishedYear:Int,
    var playCount:Int
){


    fun popularityOfSong():Boolean{
        return playCount >= 1000
    }

    fun printSongDescription():String{
        return "$title, performed by $artist, was released in $publishedYear"
    }
}

fun main(){
    val song1 = Song("Thriller", "Michael Jackson", 1980, 3000)
    val song2 = Song("Roar", "Kathy Perry", 2014, 300
    )
    println( "Is the song popular? "+song1.popularityOfSong())
    println(song1.printSongDescription())
    println("---------------------------------")
    println( "Is the song popular? "+song2.popularityOfSong())
    println(song2.printSongDescription())
}

