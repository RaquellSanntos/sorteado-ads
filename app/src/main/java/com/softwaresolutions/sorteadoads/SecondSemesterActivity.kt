package com.softwaresolutions.sorteadoads

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_semester.*
import kotlinx.android.synthetic.main.activity_second_semester.*

class SecondSemesterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_semester)

        bt_secondary.setOnClickListener {
            tx_sorteado2.setText("A lista de alunos está vazia!")
        }
    }
}