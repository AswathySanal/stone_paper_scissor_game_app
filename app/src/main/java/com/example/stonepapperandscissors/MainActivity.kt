package com.example.stonepapperandscissors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
var noOfRound="3";
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioBtn5 = findViewById< RadioButton>(R.id.radioButton4)
        val radioBtn3 = findViewById< RadioButton>(R.id.radioButton3)
        val radioBtn7 = findViewById< RadioButton>(R.id.radioButton5)

        btn.setOnClickListener() {
            if(radioBtn3.isChecked){
                noOfRound="3"
            }
            if(radioBtn5.isChecked){
                noOfRound="5"
            }
            if(radioBtn7.isChecked){
                noOfRound="7"
            }
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("number",noOfRound)
            startActivity(intent)
        }
    }

}