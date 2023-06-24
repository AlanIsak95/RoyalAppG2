package com.example.royal_app_g2.fragments.ui.crear_data_class

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.royal_app_g2.R
import com.example.royal_app_g2.databinding.FragmentCreateDataClassBinding
import com.example.royal_app_g2.databinding.FragmentDetailBinding
import com.example.royal_app_g2.fragments.ui.crear_data_class.data.User
import com.example.royal_app_g2.fragments.ui.poo.funciones_extension.show


class CreateDataClassFragment : Fragment() {

    /** */
    private lateinit var binding : FragmentCreateDataClassBinding

    /** */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateDataClassBinding.inflate(inflater,container,false)
        return binding.root
    }

    /** */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpListeners()
    }

    /** */
    private fun setUpListeners() {
        //evento del btn
    }

    /** Mandar a llamar la funcion despues de crear su persona*/
    fun showData(user : User){
        user.toString()
    }

}

// TODO: agregar listener del btn dentro de setUpListeners, crear un usuario con los datos de la vista y mandar
// a llamar la funcion showData(user)