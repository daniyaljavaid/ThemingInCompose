package com.dj.facebook.ui.theme

import androidx.compose.ui.graphics.Color
import com.dj.registration.theme.ExtendedColors
import com.dj.registration.theme.InputFieldColors
import com.dj.registration.theme.SubmitButtonColors

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val FacebookExtendedColors = ExtendedColors(
    inputFieldColors = InputFieldColors(
        unFocusedBorderColor = Purple200,
        focusedBorderColor = Purple700,
        focusedLabelColor = Purple500,
        cursorColor = Purple200,
    ),
    submitButtonColors = SubmitButtonColors(
        bgColor = Purple700,
        textColor = Color.White
    )
)