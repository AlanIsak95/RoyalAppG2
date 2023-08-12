package com.example.royal_app_g2.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.example.royal_app_g2.R
import com.example.royal_app_g2.databinding.ActivityHomeNcactivityBinding
import com.example.royal_app_g2.tools.utils.Tools

/** */
class HomeNCActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomeNcactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeNcactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpListeners()

    }

    /** */
    private fun setUpListeners() {

        binding.clActivityHomeContainer.setOnClickListener {
            Tools.showToast(this,"CLICK EN ACTIVITY")
        }

    }


}