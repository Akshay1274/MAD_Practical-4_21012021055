package com.example.mad_practical_4_21012021055

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtn : Button = findViewById<Button>(R.id.button);
        val sign : Button= findViewById<Button>(R.id.button2)

        loginBtn.setOnClickListener {
            intent(this@MainActivity ,LoginActivity::class.java).also{
                startActivity(it)
            }
        }



    }

}