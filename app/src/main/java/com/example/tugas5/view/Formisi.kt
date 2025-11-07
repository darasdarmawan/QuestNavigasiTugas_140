package com.example.tugas5.view

import android.app.AlertDialog
import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(id = R.color.light_purple))
                    .padding(paddingValues)
                    .padding(horizontal = 24.dp, vertical = dimensionResource(id = R.dimen.padding_medium)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = dimensionResource(id = R.dimen.padding_medium)),
                    colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.9f)),
                    shape = RoundedCornerShape(dimensionResource(id = R.dimen.padding_medium)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ) {
                    Column (
                        modifier = Modifier.padding(20.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            stringResource(R.string.nama_lengkap),
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                        OutlinedTextField(
                            value = nama,
                            onValueChange = { nama = it },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = dimensionResource(id = R.dimen.padding_medium)),
                            placeholder = { Text("Isian nama lengkap", color = Color.Black) },
                            shape = RoundedCornerShape(8.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = Color.Gray.copy(alpha = 0.5f),
                                focusedBorderColor = colorResource(id = R.color.dark_purple)
                            )
                        )
                        Text(
                            stringResource(R.string.jenis_kelamin),
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                        Column(modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.padding_medium))) {
                            genderList.forEach { item ->
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .selectable(
                                            selected = jenisKelamin == item,
                                            onClick = { jenisKelamin = item }
                                        )
                                        .padding(vertical = 4.dp)
                                ) {
                                    RadioButton(
                                        selected = jenisKelamin == item,
                                        onClick = { jenisKelamin = item },
                                        colors = RadioButtonDefaults.colors(
                                            selectedColor = colorResource(id = R.color.dark_purple),
                                            unselectedColor = Color.Gray
                                        )
                                    )
                                    Text(
                                        item,
                                        modifier = Modifier.padding(start = 8.dp),
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                        Text(
                            "STATUS PERKAWINAN",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                        Column(modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.padding_medium))) {
                            statusList.forEach { item ->
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .selectable(
                                            selected = status == item,
                                            onClick = { status = item }
                                        )
                                        .padding(vertical = 4.dp)
                                ) {
                                    RadioButton(
                                        selected = status == item,
                                        onClick = { status = item },
                                        colors = RadioButtonDefaults.colors(
                                            selectedColor = colorResource(id = R.color.dark_purple),
                                            unselectedColor = Color.Gray
                                        )
                                    )
                                    Text(
                                        item,
                                        modifier = Modifier.padding(start = 8.dp),
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                        Text(
                            stringResource(R.string.alamat),
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                        OutlinedTextField(
                            value = alamat,
                            onValueChange = { alamat = it },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 20.dp),
                            placeholder = { Text(stringResource(R.string.alamat), color = Color.Black) },
                            shape = RoundedCornerShape(8.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = Color.Gray.copy(alpha = 0.5f),
                                focusedBorderColor = colorResource(id = R.color.dark_purple)
                            )
                        )
                        Button(
                            onClick = {
                                showDataPopup(context, nama, jenisKelamin, status, alamat) {
                                    navController.navigate(Screen.Tampildata.route)
                                }
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.dark_purple)
                            ),
                            shape = RoundedCornerShape(25.dp)
                        ) {
                            Text(
                                text = stringResource(R.string.submit),
                                fontSize = 18.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }
            }
        }
    )
}

private fun showDataPopup(
    context: Context,
    fullName: String,
    gender: String,
    maritalStatus: String,
    address: String,
    onDismiss: () -> Unit
) {
    val message = "Nama Lengkap: $fullName\n" +
            "Jenis Kelamin: $gender\n" +
            "Status Perkawinan: $maritalStatus\n" +
            "Alamat: $address"

    AlertDialog.Builder(context)
        .setTitle("Data Pendaftaran")
        .setMessage(message)
        .setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()
            onDismiss()
        }
        .show()
}