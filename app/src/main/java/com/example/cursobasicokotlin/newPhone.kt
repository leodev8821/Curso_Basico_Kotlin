package com.example.cursobasicokotlin

import com.example.devices.Phone as MyPhone

fun main(){
    val phone1 = MyPhone("Samsung", "GT-I9800", 720.20f)
    phone1.model = "iPhone"
    phone1.yearOfManufacturing = 2012

    println(phone1.model)
    println(phone1.yearOfManufacturing)
}