package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "mainPage" ){


        composable("mainPage"){
            MainPage()
        }

        composable("detailsPage/{videoTitle}",
        arguments = listOf(navArgument("videoTitle"){ type = NavType.StringType })

        ){backStackEntry ->
            val foodinfo = backStackEntry.arguments?.getString("videoTitle")
            DetailsPage(navController = navController, foodinfo)

        }

        composable("search/{args}",
            arguments = listOf(navArgument("args"){ type= NavType.StringType})
        ) { backStackEntry->

            SearchPage(navController = navController,backStackEntry.arguments?.getString("args") )
        }


    }


}