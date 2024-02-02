package com.example.geometry_excersise

import com.example.geometry_excersise.*
fun main(){
    val circulo = Circulo(5.0)
    val rectangulo = Rectangulo(4.0, 6.0)
    val triangulo = Triangulo(3.0, 4.0, 5.0, 4.0, 3.0)

    circulo.calcularArea()
    circulo.calcularPerimetro()

    println("-+-+-+-+-+-+-+-+-+-+-+-+-+")

    rectangulo.calcularArea()
    rectangulo.calcularPerimetro()

    println("-+-+-+-+-+-+-+-+-+-+-+-+-+")

    triangulo.calcularArea()
    triangulo.calcularPerimetro()
}