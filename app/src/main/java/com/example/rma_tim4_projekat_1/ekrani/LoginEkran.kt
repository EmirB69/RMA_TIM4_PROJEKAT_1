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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rma_tim4_projekat_1.R

@Composable
fun LoginEkran(){

    Column (verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.offset(y = (30).dp))
    {
        Image(contentDescription = "Slika", painter = painterResource(id = R.drawable.logo),
            modifier = Modifier.size(150.dp) )

        Spacer(modifier = Modifier.height(70.dp))
        Box{
            Column {
                Text(text = "ADRESA E-POSTE", fontFamily = jomhuriaFontFamily, fontWeight = FontWeight.Bold, fontSize = 25.sp)
                OutlinedTextField(value = "", onValueChange = { }, singleLine = true)
            }
        }

        Spacer(modifier = Modifier.height(50.dp))

        Box{
            Column {
                Text(text = "LOZINKA", fontFamily = jomhuriaFontFamily, fontWeight = FontWeight.Bold, fontSize = 25.sp)
                OutlinedTextField(value = "", onValueChange = {}, singleLine = true)
            }
        }

        Spacer(modifier = Modifier.height(140.dp))

        Box{
            Column (modifier = Modifier.offset(y = (-60).dp)){
                Text(
                    text = "Zaboravili ste lozinku?",
                    fontFamily = jomhuriaFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    modifier = Modifier.offset(x = (-50).dp),
                )
            }
        }

        Column(
            //modifier = Modifier.fillMaxSize(),
            modifier = Modifier.offset(y = (-60).dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

        )
        {
            Button(
                onClick = {},
                border = BorderStroke(5.dp, Color.Black),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White ),
                modifier = Modifier.width(300.dp).height(100.dp),
                shape = RoundedCornerShape(4.dp)
            )
            {

                Text(text = "LOGIN", fontFamily = jomhuriaFontFamily, color = Color.Black, fontSize = 40.sp)
            }
        }
    }
}

val jomhuriaFontFamily = FontFamily(
    Font(R.font.jomhuriaa)
)

