package com.dj.facebook

import androidx.compose.runtime.Composable
import com.dj.facebook.ui.theme.FacebookTheme
import com.dj.registration.RegistrationScreen

@Composable
fun FacebookApp() {
    FacebookTheme {
        RegistrationScreen()
    }
}