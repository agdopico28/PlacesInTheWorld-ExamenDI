package com.example.placesintheworldexamendi

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.placesintheworldexamendi.ui.theme.BlueI
import com.example.placesintheworldexamendi.ui.theme.FontTitle

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Ammpliacion(navControllerName:String, navControllerImagen: Int, navController: NavHostController){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val textContacto = navBackStackEntry?.arguments?.getString("textoContacto") ?: ""
    Scaffold(
        topBar = { MyTopAppBar(navHostController = navController) }
    ) {
        Column {
            Box(
                modifier= Modifier
                    .fillMaxWidth().background(BlueI)
                    .padding(top = 60.dp), contentAlignment = Alignment.Center
            )
            {
                Text(
                    text = textContacto,
                    fontFamily = FontTitle,
                    fontSize = 50.sp,
                    color = Color.White,

                )

            }

                Image(
                    painter = painterResource(id = navControllerImagen),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }



    MyFLoadinActionButton(navHostController = navController)
}