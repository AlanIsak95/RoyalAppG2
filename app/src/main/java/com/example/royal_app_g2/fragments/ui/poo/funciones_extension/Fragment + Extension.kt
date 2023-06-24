package com.example.royal_app_g2.fragments.ui.poo.funciones_extension

import android.widget.Toast
import androidx.fragment.app.Fragment

fun Fragment.showToast(message : String){
    Toast.makeText(requireContext(),message,Toast.LENGTH_LONG).show()
}