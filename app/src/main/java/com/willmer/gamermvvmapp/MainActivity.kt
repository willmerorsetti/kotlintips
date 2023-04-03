package com.willmer.gamermvvmapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.willmer.gamermvvmapp.ui.theme.GammerMVVMAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GammerMVVMAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    //Greeting("Android")
                    BodyContent()
                }
            }
        }
    }
}

@Composable
fun BodyContent() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            //.wrapContentHeight()
            //.background(color = Color.Red)
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.control ) ,
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
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        //modifier = Modifier.padding(25.dp),
        modifier = Modifier.padding(top = 30.dp),
        text = "Hello $name!"
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    GammerMVVMAppTheme {
        //Greeting("World")
        BodyContent()
    }
}