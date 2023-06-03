package com.example.royal_app_g2.activity_lifecycle

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.royal_app_g2.constraint.ConstraintActivity
import com.example.royal_app_g2.databinding.ActivityMainBinding
import com.example.royal_app_g2.tools.utils.Tools

class MainActivity : AppCompatActivity() {

    /** */
    private lateinit var binding : ActivityMainBinding

    /** On Create */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showLog("OnCreate")

        binding.activityBtn.setOnClickListener{

            val otherView = Intent(this,ConstraintActivity::class.java)
            startActivity(otherView)

        }

    }

    override fun onStart() {
        super.onStart()
        showLog("On Start")
    }

    override fun onResume() {
        super.onResume()
        Tools.showToast(this,"Resumiendo actividad")
        showLog("OnResume")
    }

    override fun onPause() {
        super.onPause()
        showLog("OnPause")
    }

    override fun onStop() {
        super.onStop()
        showLog("OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        showLog("OnDestroy")
    }


    /* */
    private fun showLog( text : String ) = Log.e("MiPrimerApp",text)


}
