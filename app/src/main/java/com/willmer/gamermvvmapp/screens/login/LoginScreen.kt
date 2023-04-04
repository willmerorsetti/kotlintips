package com.willmer.gamermvvmapp.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.willmer.gamermvvmapp.R

@Composable
fun LoginScreen() {
    Scaffold(
        topBar = {},
        content = {
            BodyContent(it)
        },
        bottomBar = {}
    )
}


@Composable
fun BodyContent(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier.padding(paddingValues = paddingValues)
            .fillMaxHeight()
        //.wrapContentHeight()
        //.background(color = Color.Red)
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.height(130.dp),
            painter = painterResource(id = R.drawable.control ) ,
            contentDescription ="Control Xbox360"
        )
        Text(text = "Firebase MVVM")
        Text(
            //modifier = Modifier.padding(25.dp),
            modifier = Modifier.padding(top = 30.dp, bottom = 0.dp, start = 0.dp, end = 0.dp),
            text = "LOGIN"
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Por favor inicia sesiòn para continuar")
        TextField(
            modifier = Modifier.padding(top= 25.dp),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text = "Correo electronico")
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text = "Contraseña")
            }
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 15.dp),
            onClick = {  }) {
            Text(text = "INICIAR SESION")
        }
        Row() {
            Text(
                text = "Notienes cuenta",
                fontSize = 14.sp,
                color= Color.Gray
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "REGISTRATE AQUI!",
                fontSize = 14.sp,
                color= Color.Red, fontWeight = FontWeight.Bold
            )
        }
    }
}