package com.dj.composetheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dj.composetheming.ui.theme.ComposeThemingTheme
import com.dj.facebook.FacebookApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeThemingTheme {
                FacebookApp()
            }
        }
    }
}
