package com.example.buttomnavigationmodel

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val lable: String,
    val icon: ImageVector,
    val route: String

)

val listOfNavItem = listOf(
    NavItem(
        lable = "Home",
        icon = Icons.Default.Home,
        route = Screens.HomeScreen.name
    ),
    NavItem(
        lable = "Profile",
        icon = Icons.Default.Person,
        route = Screens.ProfileScreen.name
    ),
    NavItem(
    lable = "Setting",
    icon = Icons.Default.Settings,
    route = Screens.SettingScreen.name
    ),
)