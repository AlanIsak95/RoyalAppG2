package com.example.royal_app_g2.fragments.ui.poo.clases

import android.content.Context
import com.example.royal_app_g2.fragments.ui.poo.CarColor
import com.example.royal_app_g2.fragments.ui.poo.CarModel
import com.example.royal_app_g2.fragments.ui.poo.Combustion
import com.example.royal_app_g2.tools.utils.Tools

data class Car(
    val modelo : CarModel,
    val combustion : Combustion,
    val numLlantas : Int = 4,
    private var color : CarColor
){

    /* */
    fun setColor(color : CarColor) {
        this.color = color
    }


    /* */
    fun getColor() = this.color

    /* */
    fun encender(context : Context){
        Tools.showToast(context,"El carro con modelo: ${modelo.model} se prendio y usa ${combustion.getString}")
    }

    fun getModelName(): String{

        return when(modelo){
            CarModel.Model2023 -> "Este es el modelo 2023"
            CarModel.Model2022 -> "Este es el modelo 2022"
            CarModel.Model2021 -> "Este es el modelo 2021"
        }

    }

}