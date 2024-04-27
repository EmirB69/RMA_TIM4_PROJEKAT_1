package com.example.rma_tim4_projekat_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.rma_tim4_projekat_1.ekrani.SmjeroviEkran
import com.example.rma_tim4_projekat_1.navigation.Navigation
import com.example.rma_tim4_projekat_1.ui.theme.RMA_TIM4_PROJEKAT_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RMA_TIM4_PROJEKAT_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    val lifecycleOwner = this
                    Navigation(applicationContext, lifecycleOwner = lifecycleOwner)
                }
            }
        }
    }
}

