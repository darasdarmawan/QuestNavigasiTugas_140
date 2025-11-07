package com.example.tugas5.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import  com.example.tugas5.R

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

    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Formulir Pendaftaran",
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.ungu_terang)
                )
            )
        },

    )
}