package com.example.cursobasicokotlin

class SmartDevice {

    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }

    var speakerVolume: Int = 2
        get() = field
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
}

fun main() {
    val smartTvDevice = SmartDevice()
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
    println(smartTvDevice.speakerVolume)

    val person1:Human = Human("Pedro", 36)
    val person2:Human = Human("Ruben", 45, "Futbol")
    val person3:Human = Human("Jose", 78, "Voleyball")

    println("Nombre ${person1.name} con edad ${person1.age}")
}