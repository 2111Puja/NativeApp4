package com.puja.nativeapp4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Declare variables

    private lateinit var ageInput: EditText
    private lateinit var textView: TextView
    private lateinit var clearButton: Button
    private lateinit var searchButton: Button


    //@SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize variables
        ageInput = findViewById(R.id.ageInput)
        textView = findViewById(R.id.textView)
        clearButton = findViewById(R.id.clearButton)
        searchButton = findViewById(R.id.searchButton)

        searchButton.setOnClickListener {

            val ageInput = ageInput.text.toString().toIntOrNull()
            if (ageInput != null && ageInput in 20..100) {

                val ageInput = when (ageInput) {
                    20 -> "Cameron Boyce"
                    30 -> "Lisa Lopes"
                    40 -> "Paul Walker"
                    48 -> "Whitney Houston"
                    50 -> "Michael Jackson"
                    60 -> "Carrie Fisher"
                    70 -> "David Bowie"
                    80 -> "Leonardo Fibonacci"
                    90 -> "Winston Churchill"
                    100 -> "Prince Philip"

                    else -> null
                }

                //This checks the age is not null and if it is within
                //the range of 20 and 100

                val message = if (ageInput !=null) "Your age matches with the famous person name is $ageInput"
                else  "No famous person found with entered age."
                textView.text = message

            } else {
                textView.text = "Invalid input. Please enter a valid age between 20 and 100"


            }
        }

        clearButton.setOnClickListener {
            ageInput.text.clear()
            textView.text =""
        }
    }
}
