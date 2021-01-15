package com.example.ddm_atividade5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun proxima(view: View) {
        val valor = entrada.text.toString()
        val i = Intent(this, MainActivity2::class.java)
        i.putExtra("nome", valor)
        startActivity(i)

    }
}
