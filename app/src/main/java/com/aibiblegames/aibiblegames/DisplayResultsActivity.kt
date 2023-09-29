package com.aibiblegames.aibiblegames

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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

class DisplayResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_results)

        val tvResults: TextView = findViewById(R.id.tvResults)

        // For demonstration purposes
        tvResults.text = "Your ChatGPT results will be displayed here."

        // In reality, you would get the response from ChatGPT and then set it to this TextView.
    }
}