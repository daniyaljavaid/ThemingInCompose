package com.dj.linkedin

import androidx.compose.runtime.Composable
import com.dj.linkedin.ui.theme.LinkedInTheme
import com.dj.registration.RegistrationScreen

@Composable
fun LinkedInApp() {
    LinkedInTheme {
        RegistrationScreen()
    }
}