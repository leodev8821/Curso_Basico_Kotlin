package com.example.cursobasicokotlin

/* Temperature converter
Escribe un programa que convierta una temperatura de una escala a otra con estas fórmulas:

De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
Kelvin a Celsius: °C = K - 273.15
De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
Ten en cuenta que el método String.format("%.2f", /* measurement */ ) se usa para convertir un número en un tipo String con 2 decimales.


27.0 degrees Celsius is 80.60 degrees Fahrenheit.
350.0 degrees Kelvin is 76.85 degrees Celsius.
10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
 */
const val DEGREES_CELSIUS = "Celsius"
const val DEGREES_KELVIN = "Kelvin"
const val DEGREES_FAHRENHEIT = "Fahrenheit"
fun main() {


    printFinalTemperature(27.0, DEGREES_CELSIUS, DEGREES_FAHRENHEIT, ::celsiusToFahrenheit)


    printFinalTemperature(350.0, DEGREES_KELVIN, DEGREES_CELSIUS, ::kelvinToCelsius)


    printFinalTemperature(10.0, DEGREES_FAHRENHEIT, DEGREES_KELVIN, ::fahrenheitToKelvin)


}

fun celsiusToFahrenheit(measure:Double):Double{
    return (9.0/5.0)*measure+32.0
}

fun kelvinToCelsius(measure: Double):Double{
    return (measure - 273.15)
}

fun fahrenheitToKelvin(measure: Double):Double{
    return (5.0/9.0*(measure - 32.0)) + 273.15
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
