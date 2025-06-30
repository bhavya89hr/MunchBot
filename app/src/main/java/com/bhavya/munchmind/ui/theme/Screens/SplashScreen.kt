package com.bhavya.munchmind.ui.theme.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.bhavya.munchmind.R
import com.bhavya.munchmind.navigation.AppScreen


@Composable
fun SplashScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB3E5FC)), // sky blue
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            // App icon (replace with your actual drawable)
            Image(
                painter = painterResource(id = R.drawable.chatbot),
                contentDescription = "App Icon",
                modifier = Modifier.size(120.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "MunchBot",
                color = Color.DarkGray,
                fontSize = 48.sp,
                fontWeight = FontWeight.SemiBold,
            )





            Spacer(modifier = Modifier.height(15.dp))
            Button(onClick = {
                navController.navigate(AppScreen.ChatbotScreen.route)
            }) {
                Text("Get Started")
            }
        }
    }
}
