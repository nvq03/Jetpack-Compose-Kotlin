package com.example.listviewclickparcelize

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.ImageLoader
import coil.compose.rememberImagePainter
import com.example.listviewclickparcelize.ui.theme.Detail
import com.example.listviewclickparcelize.ui.theme.ListviewClickParcelizeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val persons = arrayListOf<Person>()
        var section = 1
        for (i in 1..200){

            if (i%15 == 0){
                section++
            }

            persons.add(
                Person(
                    id = i,
                    section = section,
                    name = "quy",
                    image = "https://fileinfo.com/img/ss/xl/jpg_44-2.jpg"
                )
            )
        }
        setContent {
            ListviewClickParcelizeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigation(persons)
                }
            }
        }
    }
}

@Composable
fun ListClick(persons: List<Person>, navController: NavController) {
    LazyColumn{
        items(items = persons,
            itemContent = {
                ListItem(it, navController)
              }
            )
    }
}

@Composable
fun LoadImage(image: String) {
    Image(painter = rememberImagePainter(image), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier.size(120.dp))
}

@Composable
fun ListItem(person: Person, navController: NavController){
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable {
                navController.currentBackStackEntry?.savedStateHandle?.set("person", person)
                navController.navigate("detail") }
    ) {
        Row{
            LoadImage(person.image)
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                person.name+' '+person.id,
                style = TextStyle(fontSize = 16.sp),
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun Navigation(person: List<Person>) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main_screen" ){
        composable("main_screen"){
            ListClick(person, navController)
        }
        composable("detail"){
            val person = navController.previousBackStackEntry?.savedStateHandle?.get<Person>("person")
            person?.let {
                Detail(navController, person)
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListviewClickParcelizeTheme {
        
    }
}