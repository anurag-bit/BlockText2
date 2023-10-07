package com.anurag.slimchat2


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anurag.slimchat2.ui.theme.Slimchat2Theme

class OnboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Slimchat2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    OnboardsScreen()
                }
            }
        }
    }
}

@Composable
fun OnboardsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()


    ) {
        Text(
            text = "Make it yours!",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp,
            modifier = Modifier
                .padding(start = 10.dp)
                .padding(top = 30.dp)
                .padding(bottom = 2.dp)

        )
        Text(
            text = "Add a profile picture",
            fontWeight = FontWeight.Light,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(start = 10.dp)
                .padding(top = 8.dp)
                .padding(bottom = 40.dp)

        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = " place holder image",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 40.dp)
                .padding(bottom = 120.dp)
        )
        Row(
            modifier = Modifier
                .padding(14.dp)
                .padding(top = 100.dp)
                .align(Alignment.End)
        ) {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Add, "Button adding a profile picture")


            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    Slimchat2Theme {
        OnboardsScreen()
    }
}