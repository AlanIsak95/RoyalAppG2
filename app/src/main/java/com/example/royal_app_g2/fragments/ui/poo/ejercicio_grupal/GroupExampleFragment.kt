package com.example.royal_app_g2.fragments.ui.poo.ejercicio_grupal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.royal_app_g2.databinding.FragmentGroupExampleBinding

class GroupExampleFragment : Fragment() {

    /** */
    private lateinit var binding : FragmentGroupExampleBinding

    /** */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentGroupExampleBinding.inflate(inflater)
        return binding.root
    }

    /** */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpView()
        setUpListeners()

    }

    /** */
    private fun setUpView() {

        binding.btnFragmentGroupExample.text = "Mostrar valor"

    }

    /** */
    private fun setUpListeners() {

        /* */
        binding.btnFragmentGroupExample.setOnClickListener{

                binding.etFragmentGroupExample.text.clear()
                showMessage()

        }

    }

    /** */
    private fun showMessage(){

        with(binding){

            val editTextValue = etFragmentGroupExample.text.toString()
            val editTextInt  = editTextValue.ifEmpty{ "0" }.toInt()

            tvFragmentGroupExample.text = when(editTextInt){
                in 0..10   -> "No tienes la edad"
                in 11..17  -> "Casi pero no"
                18  -> "Apenas y entras"
                in 19..150 -> "Eres adulto"
                else -> "que ingresaste?"
            }

        }


    }

}