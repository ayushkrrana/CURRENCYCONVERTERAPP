package com.example.currencyconverterapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Here we connect the UI WITH the main XML file
       val edttext: EditText=findViewById(R.id.id_1)
        val button1: Button=findViewById(R.id.bt_1)
        val button2: Button=findViewById(R.id.bt_2)
        val textt: TextView=findViewById(R.id.txt)
        val ayush: TextView=findViewById(R.id.ak)

        ////////------->>>>>>>>>>>>>>>>SECTION FOR BUTTONS

        button1.setOnClickListener() {//this button converts dollar amount into rupees
            //whatever we write here will be executed when button rupee is clicked
            val amount = edttext.text.toString().toFloat()
            val rupeeamount = 83 * amount
            textt.text = "Converted Amount is: $rupeeamount"
        }
        button2.setOnClickListener(){//this button converts ruppeees into dollar
            val amount=edttext.text.toString().toFloat()
            val dollaramount=0.012*amount
            textt.text="Converted Amount is: $dollaramount"
        }
    }
}