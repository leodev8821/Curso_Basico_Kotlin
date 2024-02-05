package com.example.geometry_excersise

import kotlin.math.PI
import kotlin.math.pow

interface FormaGeometrica {

    fun calcularArea()

    fun calcularPerimetro()
}

class Circulo (private val radius:Double) : FormaGeometrica{
    override fun calcularArea() {
        val area = String.format("%.2f", PI * radius.pow(2))
        println("El área del circulo es: $area")
    }

    override fun calcularPerimetro() {
        val perimetro = String.format("%.2f", 2* PI * radius)
        println("El perímetro del círculo es: $perimetro")
    }

}

class Rectangulo (private val base:Double, private val altura:Double) : FormaGeometrica{
    override fun calcularArea() {
        val area = String.format("%.2f", base * altura)
        println("El área del rectangulo es: $area")
    }

    override fun calcularPerimetro() {
        val perimetro = String.format("%.2f", (2*base)+(2*altura))
        println("El perímetro del círculo es: $perimetro")
    }

}

class Triangulo (private val base:Double, private val altura:Double, private val lado1:Double, private val lado2:Double, private val lado3:Double) : FormaGeometrica{
    override fun calcularArea() {
        val area = String.format("%.2f", (base * altura) / 2)
        println("\nEl área del triángulo equilátero es: $area")
    }

    override fun calcularPerimetro() {
        val perimetro = String.format("%.2f", (lado1+lado2+lado3))
        println("El perímetro del triángulo equilátero es: $perimetro")
    }

}