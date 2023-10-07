package com.anurag.slimchat2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anurag.slimchat2.ui.theme.Slimchat2Theme

class SignupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Slimchat2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}





@Composable
fun SignupScreen() {

    // Display the UI
    Column(
        modifier = Modifier
            .padding(top = 0.dp)
            .padding(bottom = 60.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.untitled__2_),
            contentDescription = "App logo",
            modifier = Modifier
                .padding(bottom = 10.dp)
                .padding(top = 0.dp)


        )
        Text(
            text = "Sign Up",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            modifier = Modifier
                .padding(top = 2.dp)
                .padding(bottom = 0.dp)
                .padding(start = 15.dp)
                .align(Alignment.Start)


        )
        Column(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(top = 0.dp)
                .padding(bottom = 10.dp)

        ) {


            TextField(
                value = "",
                onValueChange = { },
                placeholder = { Text("Name") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 19.dp)
                    .fillMaxWidth()
                    .padding(start = 15.dp)
                    .fillMaxWidth()
                    .padding(end = 15.dp)
            )
            TextField(
                value = "",
                onValueChange = { },
                placeholder = { Text("Email address") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .fillMaxWidth()
                    .padding(start = 15.dp)
                    .fillMaxWidth()
                    .padding(end = 15.dp)
            )
            TextField(
                value = "",
                onValueChange = { },
                placeholder = { Text("Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 0.dp)
                    .fillMaxWidth()
                    .padding(start = 15.dp)
                    .fillMaxWidth()
                    .padding(end = 15.dp)
            )
        }
        Button(
            onClick = { },
            modifier = Modifier
                .padding(top = 15.dp)
                .padding(end = 10.dp)
                .align(Alignment.End)

        ) {
            Text("Sign Up!")
        }

    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    Slimchat2Theme {
        SignupScreen()
    }
}

