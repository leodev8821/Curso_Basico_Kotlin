package com.example.inheritance

interface MedioDeTransporte {
    fun reparar()
}

open class Coche (val brand:String, val model:String) : MedioDeTransporte{
    override fun reparar() {
        println("\nEl vehículo de marca $brand y modelo $model ha sido reparado.")
    }

}

open class Moto (brand:String, model:String, var isElectric:Boolean ) : Coche(brand, model), MedioDeTransporte{
    override fun reparar() {
        if (isElectric){
            println("\nLa moto de marca $brand y modelo $model ha sido reparada. Su batería es nueva.")
        }else {
            println("\nLa moto de marca $brand y modelo $model ha sido reparada. Se ha cambiado el aceite.")
        }
    }
}

class Bicicleta (brand: String, model: String, isElectric: Boolean, val hasChain:Boolean) : Moto(brand, model, isElectric), MedioDeTransporte{
    override fun reparar() {
        if (isElectric && hasChain){
            println("\nLa bicicleta de marca $brand y modelo $model ha sido reparada. Su batería es nueva.")
        }else{
            println("\nLa bicicleta de marca $brand y modelo $model ha sido reparada. Los engranajes han sido lubricados.")
        }
    }
}