package com.example.rma_tim4_projekat_1.ekrani

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.rma_tim4_projekat_1.R


@Composable
fun Login()
{
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
        )
    {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
        )
    }
}