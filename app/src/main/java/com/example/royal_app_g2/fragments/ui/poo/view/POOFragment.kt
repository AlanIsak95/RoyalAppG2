package com.example.royal_app_g2.fragments.ui.poo.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.royal_app_g2.data.retrofit.RetrofitConnection
import com.example.royal_app_g2.data.retrofit.entity.ApiResponse
import com.example.royal_app_g2.data.retrofit.entity.Result
import com.example.royal_app_g2.databinding.FragmentPooBinding
import com.example.royal_app_g2.fragments.ui.poo.CarColor
import com.example.royal_app_g2.fragments.ui.poo.CarModel
import com.example.royal_app_g2.fragments.ui.poo.Combustion
import com.example.royal_app_g2.fragments.ui.poo.adapter.DetailApiAdapter
import com.example.royal_app_g2.fragments.ui.poo.clases.Alumno
import com.example.royal_app_g2.fragments.ui.poo.clases.Car
import com.example.royal_app_g2.fragments.ui.poo.funciones_extension.showToast
import com.example.royal_app_g2.tools.utils.Tools
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
        setUpRecyclerView()

    }

    private fun setUpRecyclerView() {

        val almunoList = listOf(
            Alumno(nombre = "Juan", edad = 35, matricula = "FAASDF", dinero = "40.0"),
            Alumno(nombre = "Alan", edad = 35, matricula = "FAASDF", dinero = "40.0"),
            Alumno(nombre = "Isaac", edad = 35, matricula = "FAASDF", dinero = "40.0")
        )

        val alumnoStringList = listOf("Alan","Ernesto","Jonathan","dasd","dadssad","Juan","Sol","Marisol","Fanny")
        //binding.rvFragmentPoo.layoutManager = LinearLayoutManager(requireContext())
        //val myAdapter  = AlumnoAdapter(listaAlumnos = almunoList)
        //binding.rvFragmentPoo.adapter = myAdapter

    }


    private fun setUpListeners() {

        /* Son instancias/objeto de la clase Alumno*/
        val ernesto = Alumno(nombre = "Alan", edad = 18, matricula = "ABC")
        val jonathan = Alumno(nombre = "Alan", edad = 18, matricula = "ABC")
        val alan = Alumno(nombre = "Alan", edad = 18, matricula = "ABC")
        val persona1 = Alumno(nombre = "Alan", edad = 30, matricula = "ASDdC", dinero = null)

        val mensaje = persona1.getMessage()
        //showToast(mensaje)

        //val dinero : Double? = persona1.dinero?.toDouble()
        //val dinero : Double = persona1.dinero!!.toDouble()

        //Elvis Operator
        val dineroString : String = persona1.dinero?:"0.0"
        val dineroDoble : Double = dineroString.toDouble()


        val carro1 = createCar(Combustion.Diesel, CarColor.Red)

        binding.fragmentPooBtn.setOnClickListener {

            RetrofitConnection().rickAndMortyApiService.getCharacters().enqueue(object : Callback<ApiResponse> {
                override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {

                    val listaDeObjetos : List<Result?>? = response.body()?.results

                    // TODO: LLenar Adapter con listaDeObjetos...
                    // TODO: AlumnoAdapter Crear uno similar...

                    binding.rvFragmentPoo.layoutManager = LinearLayoutManager(requireContext())
                    //val myAdapter  = ApiAdapter( listaDeObjetos )
                    //binding.rvFragmentPoo.adapter = myAdapter

                    val myAdapter  = DetailApiAdapter( listaDeObjetos )
                    binding.rvFragmentPoo.adapter = myAdapter


                }

                override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                    showToast("Error al consumir el API")
                }

            })

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

        showToast("Hola")

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



