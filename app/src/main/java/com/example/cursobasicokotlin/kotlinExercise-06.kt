package com.example.cursobasicokotlin

/*    Foldable phones
In the initial code provided in the following code snippet, write a FoldablePhone class that inherits
from the Phone class. It should contain the following:

- A property that indicates whether the phone is folded.
- A different switchOn() function behavior than the Phone class so that it only turns the screen on
when the phone isn't folded.
- Methods to change the folding state.
 */

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() :String{
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        return "The phone screen's light is $phoneScreenLight."
    }
}

class FoldablePhone(var isFolded:Boolean) : Phone(){

    override fun switchOn(){
        if(!isFolded) isScreenLightOn = true
    }

    override fun switchOff(){
        if(isFolded) isScreenLightOn = false
    }

    fun foldPhone():String{
        isFolded = true
        switchOff()
        return "The phone has been folded. ${checkPhoneScreenLight()}"
    }
     fun unfoldPhone():String{
         isFolded = false
         switchOn()
         return "The phone has been unfolded. ${checkPhoneScreenLight()}"
     }
}

fun main(){
    val phone1 = FoldablePhone(true)

    println(phone1.foldPhone())
    println(phone1.unfoldPhone())



}