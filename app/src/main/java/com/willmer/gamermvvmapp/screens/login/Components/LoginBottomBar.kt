package com.willmer.gamermvvmapp.screens.login.Components

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.willmer.gamermvvmapp.ui.theme.GammerMVVMAppTheme

@Composable
fun LoginBottomBar () {
    Row(
        modifier= Modifier.fillMaxWidth().padding(bottom = 20.dp),
        horizontalArrangement = Arrangement.Center
    ) {

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

@Preview(showBackground = true)
@Composable
fun PreviewLoginBottomBar() {
    LoginBottomBar ()
}