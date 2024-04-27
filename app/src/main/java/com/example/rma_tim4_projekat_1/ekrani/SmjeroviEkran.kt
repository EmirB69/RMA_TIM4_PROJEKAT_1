package com.example.rma_tim4_projekat_1.ekrani

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.rma_tim4_projekat_1.R

@Composable
fun SmjeroviEkran(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            contentDescription = "Slika", painter = painterResource(id = R.drawable.skola),
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
        )
        {
            Spacer(modifier = Modifier.height(220.dp))
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .width(300.dp)
                    .height(100.dp)
                    .border(3.dp, Color.Black),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "SMJEROVI",
                    fontFamily = jomhuriaFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 50.sp
                )
            }

            Spacer(modifier = Modifier.height(60.dp))
            Box {
                Column(modifier = Modifier.offset(y = (-60).dp)) {
                    Text(
                        text = "Informacione tehnologije",
                        fontFamily = jomhuriaFontFamily,
                        color = Color.Black,
                        fontSize = 40.sp
                    )
                }
            }

            Box {
                Column(modifier = Modifier.offset(y = (-60).dp)) {
                    Text(
                        text = "Jezički smjer",
                        fontFamily = jomhuriaFontFamily,
                        color = Color.Black,
                        fontSize = 40.sp
                    )
                }
            }

            Box {
                Column(modifier = Modifier.offset(y = (-60).dp)) {
                    Text(
                        text = "Matematički smjer",
                        fontFamily = jomhuriaFontFamily,
                        color = Color.Black,
                        fontSize = 40.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Box {
                Column(modifier = Modifier.offset(y = (-75).dp).offset(x = 25.dp)) {
                    Text(
                        text = "Prirodni smjer",
                        fontFamily = jomhuriaFontFamily,
                        color = Color.Black,
                        fontSize = 40.sp
                    )
                }
                Image(
                    contentDescription = "Slika",
                    painter = painterResource(id = R.drawable.logo),
                    modifier = Modifier.width(200.dp).height(200.dp).offset(y = (-10).dp)
                )
            }
        }
    }
}