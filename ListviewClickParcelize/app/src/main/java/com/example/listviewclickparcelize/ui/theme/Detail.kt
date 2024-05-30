package com.example.listviewclickparcelize.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.listviewclickparcelize.LoadImage
import com.example.listviewclickparcelize.Person

@Composable
fun Detail(navController: NavController, person: Person) {
   Card(modifier = Modifier
       .padding(8.dp)){
       Column(modifier = Modifier.fillMaxWidth()) {
           LoadImage(person.image)
           Spacer(modifier = Modifier.height(15.dp))
           Text(text = "${person.name}")
           Spacer(modifier = Modifier.height(15.dp))
           Text(text = "${person.id}", style = TextStyle(fontSize = 16.sp))

           Spacer(modifier = Modifier.height(30.dp))
           Button(onClick = { navController.popBackStack() }) {
               Text(text = "Go Back")
           }
       }
   }
}