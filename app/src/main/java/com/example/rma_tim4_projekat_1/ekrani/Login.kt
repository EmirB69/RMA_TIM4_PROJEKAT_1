package com.example.rma_tim4_projekat_1.ekrani

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.rma_tim4_projekat_1.R
import com.example.rma_tim4_projekat_1.navigation.Screen


@Composable
fun Login(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize().clickable {
            navController.navigate(Screen.LoginEkran.route)
        },
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
        )
    }
}

