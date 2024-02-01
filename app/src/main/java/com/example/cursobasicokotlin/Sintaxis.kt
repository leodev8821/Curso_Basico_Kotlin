package com.example.cursobasicokotlin

fun main() {

    println("Introduce el primer número: ")
    val val1 = readLine()
    println("Introduce el segundo número: ")
    val val2 = readLine()
    if (val1 != null && val2 != null) {
        sum(val1, val2)
    } else {
        println("Los valores ingresados no son válidos")
    }

    println("--------------------*************+--------------")
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            println("valor de i $i, valor de j $j")
            //break@loop
        }
        //break@loop
    }
}

fun sum(a: String, b: String) {

    val value1 = a.toInt()
    val value2 = b.toInt()
    val result: Int = value1 + value2

    println("La suma de $a y $b es: " + result)

}
