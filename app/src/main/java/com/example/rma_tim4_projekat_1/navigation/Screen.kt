package com.example.rma_tim4_projekat_1.navigation


sealed class Screen (val route : String){
    object Login : Screen("Login")
    object LoginEkran : Screen("LoginEkran")
    object SmjeroviEkran : Screen("SmjeroviEkran")
}