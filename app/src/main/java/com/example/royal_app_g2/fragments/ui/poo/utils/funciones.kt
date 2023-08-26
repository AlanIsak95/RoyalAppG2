package com.example.royal_app_g2.fragments.ui.poo.utils

import android.content.Context
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import com.example.royal_app_g2.fragments.ui.poo.clases.Alumno
import com.example.royal_app_g2.fragments.ui.poo.funciones_extension.showToast

fun sayHello(
    context: Context,
    message : String
){
    Toast.makeText(context,message, Toast.LENGTH_LONG).show()
}

fun getAlanString(
    lastName : String
):String{
    val name : String = "Alan $lastName"
    return name
}

fun getAlanEdad() : Int{
    return 18
}

fun String.addHernandez(){

}

fun getStudent(){

    val student1 = Alumno(
        "Juan",
    19,
    "FASFFF3",
    "94"
    )

    student1.showData()

    val student2 = Alumno(
        "Juan",
    19,
    "FASFFF3",
    "94"
    )

    student2.showData()
}

//student1
fun Alumno.showData(){

    //val nombre : String? = null,
    //val edad : Int = 0,
    //val matricula : String = "SIN MATRICULA",
    //val dinero : String? = "0.0"

    val nombreAl  = this.nombre
    val edadAl = this.edad
    val matricula = this.matricula
    val dinero = this.dinero

}


fun showMessageFromFragment(context: Context,message: String){
    context.showToast(message)
}

fun Fragment.showMessageFromFragment(message: String){
    requireContext().showToast(message)
}

fun Fragment.getStringFragment() : String{
    return "Algo"
}

fun String.printValue(context: Context){
    // TODO: usar showToast()
}

// TODO: Hacer func ext que imprima el valor de un String
// Tener en cuenta que estamos en un Fragmento.
