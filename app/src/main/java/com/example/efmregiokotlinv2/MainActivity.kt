package com.example.efmregiokotlinv2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var inputText: EditText
    private lateinit var buttonDisplaySigle: Button
    private lateinit var textViewResult: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        inputText = findViewById(R.id.edit)
        buttonDisplaySigle = findViewById(R.id.button_display_sigle)
        textViewResult = findViewById(R.id.text)

        buttonDisplaySigle.setOnClickListener {
            val inputString = inputText.text.toString().trim()

            if (inputString.isEmpty()) {
                textViewResult.text = "La chaîne saisie est vide ou blanche."
            } else {
                val sigle = inputString.substring(0, 2).uppercase()
                textViewResult.text = "Le sigle de la chaîne saisie est $sigle."
            }
        }
    }
}