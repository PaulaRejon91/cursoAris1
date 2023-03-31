package com.example.androidmaster.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.androidmaster.R
import com.example.androidmaster.imccalculator.imcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescrption: TextView
    private lateinit var btnRecalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)

        val result: Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0

        initCompontents()
        initUI(result)
        initListeners()


    }

    private fun initListeners() {
        //onBackPressed() para volver atrás al pulsar
        btnRecalculate.setOnClickListener{onBackPressedDispatcher.onBackPressed()}
    }

    private fun initUI(result: Double) {
        tvIMC.text= result.toString()

        when (result) {
            in 0.00..18.50 -> { //bajo peso

                tvResult.text=getString(R.string.title_bajo_peso)
                tvDescrption.text=getString(R.string.description_bajo_peso)
            }
            in 18.50..24.99 -> { //peso normal

                tvResult.text=getString(R.string.title_normal_peso)
                tvDescrption.text=getString(R.string.description_normal_peso)
            }
            in 24.99..29.99 -> { // Sobrepeso

                tvResult.text=getString(R.string.title_sobre_peso)
                tvDescrption.text=getString(R.string.description_sobre_peso)
            }
            in 30.00..99.00 -> { // obesidad

                tvResult.text=getString(R.string.title_obesito)
                tvDescrption.text=getString(R.string.description_obesito)
            }
            else -> { //error
                tvIMC.text = getString(R.string.error)
                tvResult.text=getString(R.string.error)
                tvDescrption.text=getString(R.string.error)
            }
        }

    }

    private fun initCompontents() {
        tvIMC = findViewById((R.id.tvIMC))
        tvResult = findViewById((R.id.tvResult))
        tvDescrption = findViewById(R.id.tvDescription)
        btnRecalculate=findViewById(R.id.btnRecalculate)
    }
}