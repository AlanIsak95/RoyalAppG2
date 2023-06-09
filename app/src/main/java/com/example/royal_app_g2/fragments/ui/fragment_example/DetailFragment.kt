package com.example.royal_app_g2.fragments.ui.fragment_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.royal_app_g2.databinding.FragmentDetailBinding
import com.example.royal_app_g2.tools.utils.Tools

class DetailFragment : Fragment() {

    private lateinit var binding : FragmentDetailBinding

    /** */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentDetailBinding.inflate(inflater,container,false)
        return binding.root
    }

    /** */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Tools.showToast(requireContext(),"Soy otro fragmento")
    }

}