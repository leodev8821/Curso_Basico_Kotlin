package com.example.cursobasicokotlin
/* Mobile notifications
La cantidad exacta de notificaciones cuando haya menos de 100
99+ como cantidad de notificaciones cuando haya 100 o más
 */

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100){
        println("You have $numberOfMessages notifications.")
    }else{
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}