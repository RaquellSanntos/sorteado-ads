package com.softwaresolutions.sorteadoads

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt_firts = findViewById<RadioButton>(R.id.bt_first_semester)
        val bt_second = findViewById<RadioButton>(R.id.bt_second_semester)
        val radioGroup = findViewById<RadioGroup>(R.id.radio_group)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            if (selectedRadioButtonId == bt_firts.id) {
                val intent = Intent(this, FirstSemesterActivity::class.java)
                startActivity(intent)
            } else if (selectedRadioButtonId == bt_second.id) {
                val intent = Intent(this, SecondSemesterActivity::class.java)
                startActivity(intent)
            }
        }

    }
}