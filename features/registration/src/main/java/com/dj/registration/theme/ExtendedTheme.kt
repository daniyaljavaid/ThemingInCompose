package com.dj.registration.theme

import androidx.compose.runtime.Composable

// Note: accessible using -==- ExtendedTheme.typography.inputField -==-
object ExtendedTheme {
    val typography: ExtendedTypography
        @Composable
        get() = LocalExtendedTypography.current

    val colors: ExtendedColors
        @Composable
        get() = LocalExtendedColors.current
}