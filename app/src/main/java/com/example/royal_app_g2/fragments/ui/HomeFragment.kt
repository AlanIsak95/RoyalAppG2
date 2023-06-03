package com.example.royal_app_g2.fragments.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.royal_app_g2.R
import com.example.royal_app_g2.databinding.FragmentHomeBinding

/** */
class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    /** */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    /** */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpListeners()

    }


    /** */
    private fun setUpListeners() {

        binding.tvFragmentHomeText.setOnClickListener {
            findNavController().navigate(R.id.home_to_detail)
        }

    }

}