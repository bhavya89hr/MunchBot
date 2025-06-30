package com.bhavya.munchmind.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bhavya.munchmind.ui.theme.Screens.ChatbotScreen
import com.bhavya.munchmind.ui.theme.Screens.SplashScreen

@Composable
fun navigation(){
val navController = rememberNavController()

NavHost(
navController = navController,
startDestination = AppScreen.SplashScreen.route
) {
    composable(AppScreen.SplashScreen.route) {
        SplashScreen(navController=navController)
    }
    composable(AppScreen.ChatbotScreen.route) {
        ChatbotScreen(navController=navController)
    }}}