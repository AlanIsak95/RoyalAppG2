package com.example.royal_app_g2.fragments.ui.poo.clases

import android.util.Log

data class Alumno(
    /* Atributos */
    val nombre : String? = null,
    val edad : Int = 0,
    val matricula : String = "SIN MATRICULA",
    val dinero : String? = "0.0"
){

    fun sayHello(){
        Log.e("TAG1","Hola mi nombre es $nombre")
    }

    fun getMessage() = "Mi nombre es $nombre"

    fun showToastFromAlumno(){

    }

    // TODO: crear una funcion en la clase Alumno1 y mostrar un Toast con el nombre del Alumno.
    // TODO: Mostrar un toast en un dataclass
}

