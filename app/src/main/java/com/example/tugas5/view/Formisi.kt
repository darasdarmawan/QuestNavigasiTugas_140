package com.example.tugas5.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormisiScreen(navController: NavController) {
    val context = LocalContext.current
    var nama by remember { mutableStateOf("") }
    val genderList = listOf("Laki-laki", "Perempuan")
    var jenisKelamin by remember { mutableStateOf("") }
    val statusList = listOf("Janda", "Lajang", "Duda")
    var status by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
}