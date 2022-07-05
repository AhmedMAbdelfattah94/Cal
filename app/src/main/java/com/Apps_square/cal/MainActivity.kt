package com.Apps_square.cal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val first = findViewById<EditText>(R.id.first)
        val second = findViewById<EditText>(R.id.Second)
        val cal = findViewById<Button>(R.id.cal)
        cal.setOnClickListener{
            if (first.text.isNotBlank() && second.text.isNotBlank())
                Toast.makeText(this, "the sum: ${first.text.toString().toInt().plus(second.text.toString().toInt())}", Toast.LENGTH_LONG).show()
        }
    }
}