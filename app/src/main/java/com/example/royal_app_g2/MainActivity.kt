package com.example.royal_app_g2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.example.royal_app_g2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /** */
    private lateinit var binding : ActivityMainBinding

    /** On Create */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.e("MiPrimerApp","Hola desde codigo")

        binding.activityText.text = "Hola desde codigo"

        Toast.makeText(this,"Soy Toast",Toast.LENGTH_SHORT).show()

    }
}