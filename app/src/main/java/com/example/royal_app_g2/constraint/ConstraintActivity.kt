package com.example.royal_app_g2.constraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.royal_app_g2.databinding.ActivityConstraintBinding
import com.example.royal_app_g2.tools.utils.Tools

class ConstraintActivity : AppCompatActivity() {

    /* */
    private lateinit var binding : ActivityConstraintBinding

    /** */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConstraintBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpView()
        setUpListeners()

    }

    /** */
    private fun setUpListeners() {

        /* */
        binding.btnActivityGo.setOnClickListener {
            Tools.showToast(this,"click me")
        }
    }

    /** */
    private fun setUpView() {

        binding.tvActivityConstraintExample1.text = "Texto1 desde codigo"
        binding.tvActivityConstraintExample2.text = "Texto2 desde codigo"

    }

}