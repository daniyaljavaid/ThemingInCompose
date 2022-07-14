package com.dj.linkedin.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.dj.registration.theme.LocalComponentTypes
import com.dj.registration.theme.LocalExtendedColors
import com.dj.registration.theme.LocalExtendedTypography

private val DarkColorPalette = darkColors(
    primary = Red200,
    primaryVariant = Red700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Red500,
    primaryVariant = Red700,
    secondary = Teal200
)

@Composable
fun LinkedInTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    CompositionLocalProvider(
        LocalExtendedTypography provides LinkedInExtendedTypography,
        LocalExtendedColors provides LinkedInExtendedColors,
        LocalComponentTypes provides LinkedInComponentTypes
    ) {
        MaterialTheme(
            colors = colors,
            typography = LinkedInTypography,
            content = content
        )
    }
}