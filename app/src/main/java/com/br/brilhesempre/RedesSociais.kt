package com.br.brilhesempre

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RedesSociais : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_redes_sociais)

        // Button Loja Digital
        // A variavél BTNLOJADIGITAL vai receber a chamada do SetOnclickListener
        // /////////////////
        val btnLojaDigital = findViewById<Button>(R.id.btnProximo) as Button

        btnLojaDigital.setOnClickListener {
            val intentlojadigital = Intent(this, LojaDigital::class.java).apply {
            }
            startActivity(intentlojadigital)
        }
    }
}