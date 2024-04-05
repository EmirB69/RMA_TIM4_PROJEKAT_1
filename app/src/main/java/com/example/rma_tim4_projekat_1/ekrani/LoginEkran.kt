package com.example.rma_tim4_projekat_1.ekrani

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rma_tim4_projekat_1.R
import javax.security.auth.login.LoginException

@Composable
fun LoginEkran(){
    Column (verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(contentDescription = "Slika", painter = painterResource(id = R.drawable.logo),
            modifier = Modifier.size(180.dp) )

        Spacer(modifier = Modifier.height(20.dp))
        Box{
            Column {
                Text(text = "ADRESA E-POSTE", fontWeight = FontWeight.Bold, fontSize = 25.sp)
                OutlinedTextField(value = "", onValueChange = { }, singleLine = true)
            }
        }

        Spacer(modifier = Modifier.height(50.dp))

        Box{
            Column {
                Text(text = "LOZINKA", fontWeight = FontWeight.Bold, fontSize = 25.sp)
                OutlinedTextField(value = "", onValueChange = {}, singleLine = true)
            }
        }

        Spacer(modifier = Modifier.height(150.dp))

        Box{
            Column (){
                Text(text = "Zaboravili ste lozinku?", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            }
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Button(
                onClick = {},
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black)

            )
            {

                Text(text = "Login", color = Color.Black)
            }
        }


    }

}
