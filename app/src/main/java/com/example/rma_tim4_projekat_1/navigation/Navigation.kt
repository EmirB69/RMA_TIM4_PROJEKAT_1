package com.example.rma_tim4_projekat_1.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rma_tim4_projekat_1.ekrani.Login
import com.example.rma_tim4_projekat_1.ekrani.LoginEkran
import com.example.rma_tim4_projekat_1.ekrani.SmjeroviEkran

@Composable
fun Navigation(
    context: Context,
    lifecycleOwner: LifecycleOwner
){
    val navController = rememberNavController();

    NavHost(navController = navController, startDestination = Screen.Login.route) {
        composable(
            route = Screen.Login.route, ){
            Login(
                navController = navController,
            )
        }
        composable(
            route = Screen.LoginEkran.route){
            LoginEkran(
                navController = navController,
            )
        }
        composable(
            route = Screen.SmjeroviEkran.route){
            SmjeroviEkran(
                navController = navController,
            )
        }
    }
}