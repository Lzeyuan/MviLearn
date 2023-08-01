package com.example.mvilearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvilearn.config.AppRouter
import com.example.mvilearn.ui.screen.MainNavView
import com.example.mvilearn.ui.screen.start.StartPageView
import com.example.mvilearn.ui.theme.MviLearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MviLearnTheme {
                val appNavController = rememberNavController()
                NavHost(navController = appNavController, startDestination = AppRouter.kStartScreen) {
                    composable(AppRouter.kStartScreen) {
                        StartPageView(appNavController)
                    }
                    composable(AppRouter.kMainNav) {
                        MainNavView()
                    }
                }
            }
        }
    }
}