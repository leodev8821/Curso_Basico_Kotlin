package com.example.devices

class Phone (
    var brand:String,
    var model:String,
    var price:Float
) {
    var yearOfManufacturing:Int = 0
        set(value) {
            if (value in 0..10000) {
                field = value
            }
        }

    // Interaction Methods
    fun turnOn():String{
        return "The phone $model is turn on"
    }

    fun turnOff():String{
        return "The phone $model is turn off"
    }

    fun makeCall():String{
        return "Making call..."
    }

    fun finishCall():String{
        return "The call has ended!"
    }
}