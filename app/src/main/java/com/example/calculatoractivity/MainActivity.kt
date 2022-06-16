package com.example.calculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etnum1:EditText
    lateinit var etnum2:EditText
    lateinit var btnadd:Button
    lateinit var btnsubtract:Button
    lateinit var btndivide:Button
    lateinit var btnmodulus:Button
    lateinit var tvresult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etnum1=findViewById(R.id.etnum1)
        etnum2=findViewById(R.id.etnum2)
        btnadd=findViewById(R.id.btnadd)
        btnsubtract=findViewById(R.id.btnsubtract)
        btndivide=findViewById(R.id.btndivide)
        btnmodulus=findViewById(R.id.btnmodulus)
        tvresult=findViewById(R.id.tvresult)

        btnadd.setOnClickListener {
            var num1=etnum1.text.toString().toInt()
            var num2=etnum2.text.toString().toInt()
            addition(num1,num2)
        }
        btnsubtract.setOnClickListener {
            var num1=etnum1.text.toString().toInt()
            var num2=etnum2.text.toString().toInt()
            subtraction(num1,num2)
        }
        btndivide.setOnClickListener {
            var num1=etnum1.text.toString().toInt()
            var num2=etnum2.text.toString().toInt()
            division(num1,num2)
        }
        btnmodulus.setOnClickListener {
            var num1=etnum1.text.toString().toInt()
            var num2=etnum2.text.toString().toInt()
            modulus(num1,num2)
        }

    }

     fun addition(num1: Int, num2: Int) {
         var addition=num1+num2
         tvresult.text=addition.toString()

    }
    fun subtraction(num1: Int,num2: Int){
        var subtraction=num1-num2
        tvresult.text=subtraction.toString()
    }
    fun  division(num1:Int,num2:Int){
        var division=num1/num2
        tvresult.text=division.toString()
    }
    fun modulus(num1: Int,num2: Int){
        var  mod=num1%num2
        tvresult.text.toString()
    }
}