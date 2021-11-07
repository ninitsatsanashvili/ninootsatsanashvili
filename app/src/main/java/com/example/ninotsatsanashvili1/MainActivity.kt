package com.example.ninotsatsanashvili1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {

    private lateinit var text: EditText
    private lateinit var text1: EditText
    private lateinit var text2: EditText
    private lateinit var text3: EditText
    private lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.edittext)
        text1 = findViewById(R.id.edittext1)
        text2 = findViewById(R.id.edittext2)
        text3 = findViewById(R.id.text3)
        button1 = findViewById(R.id.button1)

    }

    fun button(clickedView: View) {
        if (text1.text.isDigitsOnly() && text1.text.length == 3) {
                Toast.makeText(this, "თქვენ არ გაქვთ ჯარიმები", Toast.LENGTH_SHORT).show()
            }
        }

    }

