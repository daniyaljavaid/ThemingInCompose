package com.dj.linkedin.ui.theme

import androidx.compose.ui.graphics.Color
import com.dj.registration.theme.ExtendedColors
import com.dj.registration.theme.InputFieldColors
import com.dj.registration.theme.SubmitButtonColors

val Red200 = Color(0xFFEF9A9A)
val Red500 = Color(0xFFF44336)
val Red700 = Color(0xFFD32F2F)
val Teal200 = Color(0xFF03DAC5)

val LinkedInExtendedColors = ExtendedColors(
    inputFieldColors = InputFieldColors(
        unFocusedBorderColor = Red200,
        focusedBorderColor = Red500,
        focusedLabelColor = Red500,
        cursorColor = Red500,
        backgroundColor = Color.Transparent
    ),
    submitButtonColors = SubmitButtonColors(
        bgColor = Red500,
        textColor = Color.White
    )
)