package com.example.royal_app_g2.fragments.ui.e1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.royal_app_g2.R
import com.example.royal_app_g2.databinding.FragmentE1Binding

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

        binding.goToNewView.setOnClickListener {

        }

    }

}