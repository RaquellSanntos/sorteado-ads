package com.softwaresolutions.sorteadoads

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FirstSemesterActivity : AppCompatActivity() {

    lateinit var sorteado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_semester)
        sorteado = findViewById(R.id.tx_sorteado) as TextView

    }

}