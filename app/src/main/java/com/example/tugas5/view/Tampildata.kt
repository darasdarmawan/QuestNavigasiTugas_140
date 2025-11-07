package com.example.tugas5.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
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
}