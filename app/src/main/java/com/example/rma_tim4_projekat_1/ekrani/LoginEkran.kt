package com.example.rma_tim4_projekat_1.ekrani

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.rma_tim4_projekat_1.R
import com.example.rma_tim4_projekat_1.navigation.Screen

@Composable
fun LoginEkran(navController: NavHostController) {
    var emailAddress by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.offset(y = (30).dp)
    ) {
        Image(
            contentDescription = "Slika",
            painter = painterResource(id = R.drawable.logo),
            modifier = Modifier.size(150.dp)
        )

        Spacer(modifier = Modifier.height(70.dp))

        Box {
            Column {
                Text(
                    text = "ADRESA E-POSTE",
                    fontFamily = jomhuriaFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                OutlinedTextField(
                    value = emailAddress,
                    onValueChange = { emailAddress = it },
                    singleLine = true
                )
            }
        }

        Spacer(modifier = Modifier.height(50.dp))

        Box {
            Column {
                Text(
                    text = "LOZINKA",
                    fontFamily = jomhuriaFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    singleLine = true
                )
            }
        }

        Spacer(modifier = Modifier.height(140.dp))

        Column(
            modifier = Modifier.offset(y = (-60).dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(
                onClick = {
                    if (emailAddress.isNotBlank() && password.isNotBlank()) {
                        navController.navigate(Screen.SmjeroviEkran.route)
                    }
                },
                enabled = emailAddress.isNotBlank() && password.isNotBlank(), // Enable button only if both fields are filled
                border = BorderStroke(5.dp, Color.Black),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White),
                modifier = Modifier.width(300.dp).height(100.dp),
                shape = RoundedCornerShape(4.dp)
            ) {
                Text(
                    text = "LOGIN",
                    fontFamily = jomhuriaFontFamily,
                    color = Color.Black,
                    fontSize = 40.sp
                )
            }
        }
    }
}

val jomhuriaFontFamily = FontFamily(
    Font(R.font.jomhuriaa)
)


