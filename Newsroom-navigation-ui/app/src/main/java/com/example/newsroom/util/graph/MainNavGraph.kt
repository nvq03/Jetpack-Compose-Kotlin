package com.example.newsroom.util.graph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.newsroom.domain.model.BottomBarScreen
import com.example.newsroom.presentation.Profile.ProfileScreen
import com.example.newsroom.presentation.news_screen.NewsScreen
import com.example.newsroom.presentation.news_screen.NewsScreenViewModel
import com.example.newsroom.presentation.video.VideoScreen

@Composable
fun MainNavGraph(navController: NavHostController) {

    val argKey = "web_url"

    NavHost(
        navController = navController,
        route = Graph.MAIN_SCREEN_PAGE,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {

            val viewModel: NewsScreenViewModel = hiltViewModel()
            NewsScreen(
                state = viewModel.state,
                onEvent = viewModel::onEvent,
                onReadFullStoryButtonClick = { url ->
                    navController.navigate("article_screen?$argKey=$url")
                }
            )

            }

        composable(route = BottomBarScreen.Foods.route) {
            VideoScreen(navController = navController)
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen(navController = navController)

        }
        }
    }