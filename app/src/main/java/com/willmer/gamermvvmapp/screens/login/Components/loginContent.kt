package com.willmer.gamermvvmapp.screens.login.Components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
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
import com.willmer.gamermvvmapp.ui.theme.Darkgray500
import com.willmer.gamermvvmapp.ui.theme.Darkgray700
import com.willmer.gamermvvmapp.ui.theme.GammerMVVMAppTheme
import com.willmer.gamermvvmapp.ui.theme.Red500

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginContent () {
    Box(
        modifier = Modifier
            .fillMaxHeight()
        //.wrapContentHeight()
        //.background(color = Color.Red)

    ) {
        BoxHeader()
        CardForm()
    }


}

@Composable
fun BoxHeader() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(280.dp)
        .background(Red500)
    ){
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
            modifier = Modifier.height(130.dp),
            painter = painterResource(id = R.drawable.control ) ,
            contentDescription ="Control Xbox360"
        )
            Text(text = "Firebase MVVM")
        }

    }
}

@Composable
fun CardForm(){
    Card(modifier =Modifier.padding(start =40.dp, end = 40.dp, top = 170.dp ),
        backgroundColor = Darkgray700
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Text(
                //modifier = Modifier.padding(25.dp),
                modifier = Modifier.padding(
                    top = 40.dp,
                    bottom = 0.dp,
                    start = 0.dp,
                    end = 0.dp
                ),
                text = "LOGIN",
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                //modifier = Modifier.padding(
                //top = 30.dp,
                //bottom = 0.dp,
                //start = 0.dp,
                //end = 0.dp
                //),
                text = "Por favor inicia sesiòn para continuar",
                fontSize = 16.sp,
                //fontWeight = FontWeight.Bold,
                color=Color.Gray,
            )
            OutlinedTextField(
                modifier = Modifier.padding(top= 25.dp),
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Correo electronico")
                },
                //trailingIcon = {
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Email,
                         contentDescription ="",
                         tint = Color.White
                    )
                }
            )
            Spacer(modifier = Modifier.height(5.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Contraseña")
                }
                ,
                //trailingIcon = {
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Lock,
                        contentDescription ="",
                        tint = Color.White
                    )
                }
            )
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 45.dp),
                onClick = {  }) {
                Icon(imageVector = Icons.Default.ArrowForward,
                    contentDescription ="",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "INICIAR SESION")
            }
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