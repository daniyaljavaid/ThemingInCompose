package com.dj.registration.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

@Immutable
data class ExtendedTypography(
    val inputLabel: TextStyle,
    val inputText: TextStyle
)

// Note: accessible using -==- LocalExtendedTypography.current.inputField -==-
// LocalExtendedTypography is to be provided by applications, else these default values will be used
val LocalExtendedTypography = staticCompositionLocalOf {
    ExtendedTypography(
        inputLabel = TextStyle.Default,
        inputText = TextStyle.Default
    )
}
