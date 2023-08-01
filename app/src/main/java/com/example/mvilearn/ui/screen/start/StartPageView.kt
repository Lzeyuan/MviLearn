package com.example.mvilearn.ui.screen.start

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import com.example.mvilearn.config.AppRouter
import kotlinx.coroutines.delay

@Composable
fun StartPageView(appNavController: NavHostController) {
    LaunchedEffect(Unit) {
        delay(1500)
        appNavController.navigate(AppRouter.kMainNav)
    }
    Text(text = "启动页")
}