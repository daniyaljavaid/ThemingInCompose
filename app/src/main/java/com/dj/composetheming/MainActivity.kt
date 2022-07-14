package com.dj.composetheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dj.facebook.FacebookApp
import com.dj.linkedin.LinkedInApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            LinkedInApp()
            FacebookApp()
        }
    }
}
