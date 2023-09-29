package com.aibiblegames.aibiblegames

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aibiblegames.aibiblegames.ui.theme.AIBibleGamesTheme

class GameChoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_choice)

        val edtName: EditText = findViewById(R.id.edtName)
        val btnAdultGame: Button = findViewById(R.id.btnAdultGame)
        val btnChildGame: Button = findViewById(R.id.btnChildGame)

        btnAdultGame.setOnClickListener {
            // Logic to start adult game
            Log.d("debug name",edtName.text.toString())
            val intent = Intent(this, ChatgptActivity::class.java)
            intent.putExtra("USERNAME", edtName.text.toString())
            intent.putExtra("Type", "Adult")
            startActivity(intent)
        }

        btnChildGame.setOnClickListener {
            // Logic to start child game
            val intent = Intent(this, ChatgptActivity::class.java)
            intent.putExtra("USERNAME", edtName.text.toString())
            intent.putExtra("Type", "Child")
            startActivity(intent)
        }
    }
}