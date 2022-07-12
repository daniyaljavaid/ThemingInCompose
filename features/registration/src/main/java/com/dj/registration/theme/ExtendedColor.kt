package com.dj.registration.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color


@Immutable
data class ExtendedColors(
    val inputFieldColors: InputFieldColors,
    val submitButtonColors: SubmitButtonColors
)

@Immutable
data class InputFieldColors(
    val unFocusedBorderColor: Color,
    val focusedBorderColor: Color,
    val focusedLabelColor: Color,
    val cursorColor: Color
)

@Immutable
data class SubmitButtonColors(
    val bgColor: Color,
    val textColor: Color
)

// if no app provides LocalExtendedColors object then this default instance
// will be used within this module
val LocalExtendedColors = staticCompositionLocalOf {
    ExtendedColors(
        inputFieldColors = InputFieldColors(
            unFocusedBorderColor = Color.Gray,
            focusedBorderColor = Color.Gray,
            focusedLabelColor = Color.Gray,
            cursorColor = Color.Gray
        ),
        submitButtonColors = SubmitButtonColors(
            bgColor = Color.Gray,
            textColor = Color.White
        )
    )
}