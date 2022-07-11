package com.dj.linkedin.ui.theme

import androidx.compose.ui.graphics.Color
import com.dj.registration.theme.ExtendedColors
import com.dj.registration.theme.InputFieldColors

val Purple200 = Color(0xFFF44336)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)
val Red = Color(0xFFF44336)

val LinkedInExtendedColors = ExtendedColors(
    inputFieldColors = InputFieldColors(
        focusedBorderColor = Red,
        focusedLabelColor = Red,
        cursorColor = Red
    )
)