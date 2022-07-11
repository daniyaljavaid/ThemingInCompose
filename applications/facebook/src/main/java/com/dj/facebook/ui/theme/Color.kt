package com.dj.facebook.ui.theme

import androidx.compose.ui.graphics.Color
import com.dj.registration.theme.ExtendedColors
import com.dj.registration.theme.InputFieldColors

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val FacebookExtendedColors = ExtendedColors(
    inputFieldColors = InputFieldColors(
        focusedBorderColor = Purple700,
        focusedLabelColor = Purple500,
        cursorColor = Purple200,
    )
)