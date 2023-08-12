package com.example.royal_app_g2.fragments.ui.e1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.royal_app_g2.databinding.FragmentE1Binding
import com.google.android.material.textfield.TextInputEditText

class E1Fragment : Fragment() {

    private lateinit var binding : FragmentE1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentE1Binding.inflate(inflater,container,false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpListeners()
    }

    private fun setUpListeners() {

        binding.btnFragmentE1Add.setOnClickListener {

            val number : String = binding.tiedFragmentE1Ed.text.toString()

            val result : Double = 10.0 + number.toDouble()

            binding.tvFragmentE1Result.text = "El resultado de sumar $number mas 10.0 es : $result"

        }

    }

}