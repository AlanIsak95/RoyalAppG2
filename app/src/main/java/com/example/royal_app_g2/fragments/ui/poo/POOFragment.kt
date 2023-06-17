package com.example.royal_app_g2.fragments.ui.poo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.royal_app_g2.databinding.FragmentPooBinding
import com.example.royal_app_g2.fragments.ui.poo.clases.Car
import com.example.royal_app_g2.tools.utils.Tools

class POOFragment : Fragment() {

    /* */
    private lateinit var binding : FragmentPooBinding

    /** */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPooBinding.inflate(inflater)
        return binding.root
    }

    /** */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpListeners()

    }



    private fun setUpListeners() {

        val carro = createCar(Combustion.Diesel,CarColor.Red)

        binding.fragmentPooBtn.setOnClickListener {
            binding.fragmentPooText.text = carro.getModelName()
        }

    }

    fun createCar(combustion : Combustion, color : CarColor):Car{
        return Car(
            modelo = CarModel.Model2022,
            combustion = combustion,
            color = color)
    }


    // region function
    fun getName():String{
        return "Alan"
    }

    fun getName(edad : Int):String{
        return "Alan tu edad es$edad"
    }

    fun getName(name : String ,edad : Int):String{
        return "$name tu edad es $edad"
    }


    @SuppressLint("SetTextI18n")
    fun showUserData(
        name : String = "Sin Nombre",
        age : Int = 10,
        address : String = "Sin direccion",
        lastName : String = "Sin Apellido"
    ){
        binding.fragmentPooText.text = "$name, $age, $address, $lastName"
    }


    //Fun sin parametros ni valor de retorno
    fun decirHola(){

        Tools.showToast(requireContext(),"Hola")

    }

    //Funcion con parametro sin valor de retorno
    fun muestraEnToast(message : String){
        Tools.showToast(requireContext(),message)
    }

    //Funcion con parametros sin valor de retorno
    fun muestraEnToast2(mensaje1 : String, edad : Int){
        Tools.showToast(requireContext(),"$mensaje1 y edad : $edad")
    }

    fun regresameUnString():String{
        return "Alan desde Fun"
    }
    fun regresameUnString2() = "Alan desde Fun"

    fun sumaDosNumeros(num1 : Int, num2 : Int):Int{
        return num1 + num2
    }

    fun sumaDosNumeros1Linea(num1 : Int, num2 : Int) = num1 + num2


    /** */
    fun showNumber(){

        val name : String = "Hola!"
        var name2 : String = "Hola!"

        val intValue : Int = 10 //2,147,483,647 max value
        val logValue : Long = 2_147_483_650L //9,223,372,036,854,775,807. max

        val floatValue : Float = 10.5F // -3.4 x 10^38 a 3.4 x 10^38.
        val doubleValue : Double = 10.543545 // -1.7 x 10^308 a 1.7 x 10^308.

        var booleanValue1 : Boolean = true
        val booleanValue2 : Boolean = false

        val charValue : Char = 'A'

    }

    /** */
    private fun booleanCase(){

        val edad = 18

        if (edad == 18)
            Tools.showToast(requireContext(),"Eres mayor")
        else
            Tools.showToast(requireContext(),"Eres menor")

    }

    /** */
    private fun switchCase(codigoError : Int){

        if (codigoError == 500)
            Tools.showToast(requireContext(),"Error de Red")
            else if (codigoError == 400)
                    Tools.showToast(requireContext(),"Es error 400")
                else if (codigoError == 300)
                        Tools.showToast(requireContext(),"Es error 300")


        when(codigoError){
            in 501..1200-> Tools.showToast(requireContext(),"Error sobre 500")
            500 -> Tools.showToast(requireContext(),"Error de Red")
            400 -> Tools.showToast(requireContext(),"Es error 400")
            300 -> Tools.showToast(requireContext(),"Es error 300")
            250,280,4,6,2,5,8,67 -> Tools.showToast(requireContext(),"Es error Generico")
            else -> Tools.showToast(requireContext(),"Error")
        }



        val stringError = "Error 500 fallo en capa 8"

        if (stringError.contains("Error"))
            Tools.showToast(requireContext(),"Error en algun lado")
        else
            Tools.showToast(requireContext(),"Todo bien")


    }


    /** */
    private fun showList(){

        val name1 = "Juan"//0
        val name2 = "Erick"//1
        val name3 = "Angel"//2
        val name4 = "Alma"//3

        val list = listOf(name1,name2,name3,name4)
        val mutableList = mutableListOf(name1,name2,name3,name4)

        val array = arrayListOf(name1,name2,name3,name4)

        println(list.size)

        println(list[0])
        println(list[1])
        println(list[2])
        println(list[3])

        println(list.toString())


        list.forEach { nombreDeTrabajadores ->
            println("Hola! $nombreDeTrabajadores")
        }

        list.forEachIndexed{index, nombreDeTrabajadores ->
            println("Hola! $nombreDeTrabajadores tu id es $index")
        }

        mutableList.add("Nuevo Nombre")
        mutableList.removeAt(1)

        array.add("Nuevo Nombre")
        array.removeAt(1)

        array.forEach{
            println("Hola $it")
        }

        println(mutableList.toString())

    }

    //endregion

}



