package com.anurag.slimchat2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.anurag.slimchat2.ui.theme.Slimchat2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Slimchat2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
//implement the navigation bar and the defualt home activity for user!
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Slimchat2Theme {
      Main()
    }
}