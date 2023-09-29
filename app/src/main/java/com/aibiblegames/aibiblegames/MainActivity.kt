package com.aibiblegames.aibiblegames

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSevenTurns: Button = findViewById(R.id.btnSevenTurns)
        val btnAdFreeSubscription: Button = findViewById(R.id.btnAdFreeSubscription)

        btnSevenTurns.setOnClickListener {
            // Logic to show ad
            val intent = Intent(this, GameChoiceActivity::class.java)
            startActivity(intent)
        }

        btnAdFreeSubscription.setOnClickListener {
            // Logic to initiate the subscription flow
            val intent = Intent(this, GameChoiceActivity::class.java)
            startActivity(intent)
        }
    }
}