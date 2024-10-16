package com.example.actpraktikumpam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.actpraktikumpam.ui.theme.ActPraktikumPAMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActPraktikumPAMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BasicCompose( modifier: Modifier = Modifier){

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Indonesia",
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue)
        )
        Text(
            text = "0",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
        Image(painter = painterResource(id = R.drawable.logofifa3),
            contentDescription = null
        )
        Text(
            text = "Nama",
            fontSize = 15.sp
        )
        Text(text = "Namira Anjani",
            fontWeight = FontWeight.SemiBold,
            fontSize = 25.sp
        )
        Text(text = "20220140081",
            fontWeight = FontWeight.Bold,)
        Image(painter = painterResource(id = R.drawable.foto),
            contentDescription = null,
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ActPraktikumPAMTheme {
        Greeting("Android")
    }
}