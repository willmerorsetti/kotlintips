package com.willmer.gamermvvmapp.screens.login

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
import com.willmer.gamermvvmapp.screens.login.Components.LoginBottomBar
import com.willmer.gamermvvmapp.screens.login.Components.LoginContent
import com.willmer.gamermvvmapp.ui.theme.GammerMVVMAppTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginScreen() {
    Scaffold(
        topBar = {},
        content = {
            LoginContent()
        },
        bottomBar = {
            LoginBottomBar()
        }
    )
}





