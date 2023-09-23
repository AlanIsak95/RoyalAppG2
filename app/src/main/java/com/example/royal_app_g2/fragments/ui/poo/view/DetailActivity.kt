package com.example.royal_app_g2.fragments.ui.poo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.royal_app_g2.R
import com.example.royal_app_g2.databinding.ActivityDetailBinding
import com.example.royal_app_g2.databinding.ActivityHomeNcactivityBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpView()
    }

    /** */
    private fun setUpView() {

        binding.tvActivityDetailTitle.text = intent.getStringExtra("name")?:"Sin Nombre"

    }

}