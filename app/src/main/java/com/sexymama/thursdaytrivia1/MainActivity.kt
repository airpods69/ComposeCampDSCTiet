package com.sexymama.thursdaytrivia1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sexymama.thursdaytrivia1.ui.theme.Blue200
import com.sexymama.thursdaytrivia1.ui.theme.ThursdayTrivia1Theme
import java.security.AllPermission

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TriviaCompose("DSC TIET")
        }
    }
}

@Composable
fun TriviaCompose(name: String) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Jetpack Logo")
        Text("$name", fontSize = 50.sp, fontWeight = FontWeight.Bold, color = Blue200)
        Text("\uD83D\uDC95", fontSize = 40.sp)
        Text("JetPack Compose", fontSize = 30.sp, fontWeight = FontWeight.Bold, color = Color.Black)
    }
}