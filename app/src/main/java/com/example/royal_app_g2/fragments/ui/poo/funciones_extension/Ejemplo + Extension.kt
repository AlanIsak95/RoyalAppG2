package com.example.royal_app_g2.fragments.ui.poo.funciones_extension

fun Int.toStringRoyal() : String{
    return "El valor del numero es : $this"
}

fun Any.show(){
    println("El valor es : $this")
}

fun main() {

    123.show()
    "dsa".show()
    123.3.show()
    false.show()

}