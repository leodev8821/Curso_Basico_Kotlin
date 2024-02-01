package com.example.cursobasicokotlin

class Human (var name:String, var age:Int) {
    var hobby:String? = null
    var registered:Boolean = true
    lateinit var mother:Human
    lateinit var father:Human

    constructor(name: String, age: Int, hobby: String) : this(name, age){
        this.hobby = hobby
    }

    constructor(name: String, age: Int, hobby: String, mother: Human, father: Human) : this (name, age, hobby){
        this.mother = mother
        this.father = father
    }
}