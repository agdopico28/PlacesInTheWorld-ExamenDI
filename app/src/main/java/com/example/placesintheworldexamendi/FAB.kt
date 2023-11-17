package com.example.placesintheworldexamendi

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.placesintheworldexamendi.ui.theme.BlueBotton

@Composable
fun MyFLoadinActionButton(navHostController: NavHostController){
    Box (Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd){
        FloatingActionButton(
            onClick = {
                navHostController.navigate("Sitios")
            },
            containerColor = BlueBotton,
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 10.dp)
                .height(50.dp)
                .width(50.dp))
        {

            Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "check" )
        }

    }
}