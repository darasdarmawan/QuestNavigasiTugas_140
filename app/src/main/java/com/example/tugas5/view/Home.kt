package com.example.tugas5.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugas5.R
import com.example.tugas5.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold (
        content = { paddingValues ->
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(id = R.color.light_purple))
                    .padding(paddingValues)
                    .padding(horizontal = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Selamat Datang",
                    fontSize = 32.sp,
                    fontFamily = FontFamily.Monospace,
                    color = colorResource(id = R.color.purple_500),
                    modifier = Modifier.padding(bottom = 32.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.aurora),
                    contentDescription = "App Logo",
                    modifier = Modifier
                        .size(150.dp)
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = "Dara Syauqi Darmawan\n20230140140",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Monospace,
                    color = colorResource(id = R.color.purple_500),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 64.dp)
                )
                Button(
                    onClick = { navController.navigate(Screen.Formisi.route) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.dark_purple))
                ) {
                    Text(text = stringResource(R.string.submit), fontSize = 18.sp, color = Color.White)
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    com.example.tugas5.view.HomeScreen(navController = rememberNavController())
}