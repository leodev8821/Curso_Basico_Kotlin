package com.example.cursobasicokotlin

/*   Internet profile
Complete the showProfile() function so that the program prints these lines:

Name: Amanda
Age: 33
Likes to play tennis. Doesn't have a referrer.

Name: Atiqah
Age: 28
Likes to climb. Has a referrer named Amanda, who likes to play tennis.
 */
fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(private val name: String, private val age: Int, private val hobby: String?, private val referrer: Person?) {
    fun showProfile() {
        println("\nName: $name")
        println("Age: $age")
        if (referrer != null) {
            println("Likes to ${hobby}. Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}")
        } else {
            println("Likes to ${hobby}. Doesn't have a referrer.")
        }

    }
}