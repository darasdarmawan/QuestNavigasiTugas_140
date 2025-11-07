package com.example.tugas5

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tugas5.view.FormisiScreen
import com.example.tugas5.view.HomeScreen
import com.example.tugas5.view.TampilDataScreen

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object Formisi : Screen("formisi_screen")
    object Tampildata : Screen("tampildata_screen")
}

@Composable
fun AppNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(Screen.Formisi.route) {
            FormisiScreen(navController = navController)
        }
        composable(Screen.Tampildata.route) {
            TampilDataScreen(navController = navController)
        }
    }
}