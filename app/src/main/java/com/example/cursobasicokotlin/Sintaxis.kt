package com.example.cursobasicokotlin

fun main() {

    println("Introduce el primer número: ")
    var val1 = readlnOrNull()
    println("Introduce el segundo número: ")
    var val2 = readlnOrNull()

    if (val1 != null && val2 != null) {
        val1 = val1.trim()
        val2 = val2.trim()
        println("Valor1: $val1 y Valor2: $val2")
        println(sum(val1, val2))
    } else {
        println("Los valores ingresados no son válidos")
    }

    fun noSpace(x: String): String {
        val x = x
        x.replace("\\s".toRegex(), "")
        return x
    }

    println( noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"))

}

fun sum(a: String, b: String) :String{
    val value1 = a.toInt()
    val value2 = b.toInt()
    val result: Int = value1 + value2

    return "La suma de $a y $b es: $result"

}

