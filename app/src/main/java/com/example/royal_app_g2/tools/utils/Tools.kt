package com.example.royal_app_g2.tools.utils

import android.content.Context
import android.widget.Toast

object Tools {

    /* */
    fun showToast(context: Context, text: String) = Toast.makeText(context,text, Toast.LENGTH_LONG).show()

}