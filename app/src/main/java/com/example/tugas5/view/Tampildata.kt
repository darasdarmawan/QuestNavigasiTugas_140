package com.example.tugas5.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugas5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilDataScreen(
    navController: NavController
) {
    val dataEntries = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Dara Darmawan"),
        Pair(stringResource(id = R.string.jenis_kelamin), "Perempuan"),
        Pair("STATUS PERKAWINAN", "Lajang"),
        Pair(stringResource(id = R.string.alamat), "Yogyakarta")
    )
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "List Daftar Peserta",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.ungu_terang)
                )
            )
        }
    ) {

    }
}