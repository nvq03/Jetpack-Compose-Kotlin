package com.example.newsroom.util.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.newsroom.presentation.Login.LoginScreen
import com.example.newsroom.presentation.Signup.SingupScreen
import com.example.newsroom.presentation.Splash.SplashScreen


fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.SPLASH.route
    ) {

        composable(route = AuthScreen.SPLASH.route) {
            SplashScreen(navController = navController)
        }

        composable(route = AuthScreen.Login.route) {
            LoginScreen(navController = navController)
        }
        composable(route = AuthScreen.SignUp.route) {
            SingupScreen(navController = navController)
        }
    }
}

sealed class AuthScreen(val route: String) {
    object SPLASH : AuthScreen(route = "Splash")
    object Login : AuthScreen(route = "Login")
    object SignUp : AuthScreen(route = "Signup")
}