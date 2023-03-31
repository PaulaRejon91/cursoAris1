package com.example.androidmaster.sintaxis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidmaster.FirstApp.FisrtAppActivity
import com.example.androidmaster.R
import com.example.androidmaster.imccalculator.imcCalculatorActivity
import com.example.androidmaster.superheroesapp.SuperHeroListActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp= findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp= findViewById<Button>(R.id.btnIMCApp)
        val btnSuperhero=findViewById<Button>(R.id.btnSuperhero)

        btnSaludApp.setOnClickListener{  navigateToSaludApp()  }
        btnImcApp.setOnClickListener{  navigateToIMCApp()  }
        btnSuperhero.setOnClickListener{ navigateToSuperheroApp()}
    }

    private fun navigateToSuperheroApp() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIMCApp() {
        val intent =Intent(this, imcCalculatorActivity::class.java)

        startActivity(intent)
    }

    private fun navigateToSaludApp(){
        val intent = Intent(this, FisrtAppActivity::class.java)

        startActivity(intent)
    }
}