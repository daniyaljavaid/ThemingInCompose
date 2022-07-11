package com.dj.registration.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color


@Immutable
data class ExtendedColors(
    val inputFieldColors: InputFieldColors,
)

@Immutable
data class InputFieldColors(
    val focusedBorderColor: Color,
    val focusedLabelColor: Color,
    val cursorColor: Color
)

// if no app provides LocalExtendedColors object then this default instance
// will be used within this module
val LocalExtendedColors = staticCompositionLocalOf {
    ExtendedColors(
        inputFieldColors = InputFieldColors(
            focusedBorderColor = Color.Gray,
            focusedLabelColor = Color.Gray,
            cursorColor = Color.Gray
        )
    )
}