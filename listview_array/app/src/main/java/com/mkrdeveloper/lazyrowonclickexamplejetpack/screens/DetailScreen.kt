package com.mkrdeveloper.lazyrowonclickexamplejetpack.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    photos: Array<Int>,
    names: Array<String>,
    ingredients: Array<String>,
    itemIndex: Int?
) {
    Column(
        modifier
            .fillMaxSize()
            .padding(25.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

       Box(modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center
       ){
           Image(painter = painterResource(id = photos[itemIndex!!]),
               contentDescription = names[itemIndex],
               modifier.clip(RoundedCornerShape(16.dp))
           )
       }
        Text(text = names[itemIndex!!], fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Text(text = ingredients[itemIndex], fontSize = 18.sp)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun DetailScreenPreview() {
    DetailScreen(
        modifier = Modifier,
        photos = arrayOf(
            com.mkrdeveloper.lazyrowonclickexamplejetpack.R.drawable.p1,
            com.mkrdeveloper.lazyrowonclickexamplejetpack.R.drawable.p2,
            com.mkrdeveloper.lazyrowonclickexamplejetpack.R.drawable.p3
        ),
        names = arrayOf("Item 1", "Item 2", "Item 3"),
        ingredients = arrayOf(
            "Ingredient 1, Ingredient 2, Ingredient 3",
            "Ingredient 4, Ingredient 5, Ingredient 6",
            "Ingredient 7, Ingredient 8, Ingredient 9"
        ),
        itemIndex = 0
    )
}