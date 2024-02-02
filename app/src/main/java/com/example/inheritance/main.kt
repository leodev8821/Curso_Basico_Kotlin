package com.example.inheritance

import com.example.inheritance.*
fun main(){
    val coche1 = Coche("BMW", "Z500")
    val moto1 = Moto("Susuki", "Vivaz", true)
    val bicicleta1 = Bicicleta("JM", "BMX", false, true)

    coche1.reparar()
    moto1.reparar()
    bicicleta1.reparar()
}