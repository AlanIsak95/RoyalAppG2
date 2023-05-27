package com.example.royal_app_g2.constraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.royal_app_g2.databinding.ActivityConstraintBinding

class ConstraintActivity : AppCompatActivity() {

    /* */
    private lateinit var binding : ActivityConstraintBinding

    /** */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConstraintBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}