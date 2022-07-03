package com.example.radiusxoxo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculararea(view: View) {
        val edtRadioap : EditText = findViewById(R.id.txt_radio_plantar)
        val resultado: TextView = findViewById(R.id.txt_result)
        var radio_ap : Double = edtRadioap.text.toString().toDouble()
        var pi : Double = 3.1416
        var num_faroles : Int = 7
        var radio_farol : Double = 1.0
        var area_farol : Double = 0.0
        var resta_area : Double = 0.0
        var area_plantar : Double = 0.0
        if (radio_ap>=100&&radio_ap<=300){
            area_farol= pi* Math.pow(radio_farol, 2.0)* 7
           area_plantar= pi* Math.pow(radio_ap, 2.0)
            resta_area= area_plantar-area_farol
            var reducir_v= DecimalFormat("#.0000")
          var decimal_red = reducir_v.format(resta_area)
           // resta_area.toString()
            resultado.text = "EL AREA DE LA ZONA A PLANTAR ES : $decimal_red m2"

        }
        else {
            Toast.makeText(this,"POR FAVOR INGRESE UN RADIO ENTRE 100 Y 300 M", Toast.LENGTH_SHORT).show()
        }


        
    }
}