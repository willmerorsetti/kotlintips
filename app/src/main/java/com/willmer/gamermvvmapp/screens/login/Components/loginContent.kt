package com.willmer.gamermvvmapp.screens.login.Components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.willmer.gamermvvmapp.R
import com.willmer.gamermvvmapp.screens.login.LoginScreen
import com.willmer.gamermvvmapp.ui.theme.GammerMVVMAppTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginContent () {
    Column(
        modifier = Modifier
            .padding()
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

    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    GammerMVVMAppTheme (darkTheme = true) {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            LoginContent()
            LoginBottomBar()
        }
    }
}