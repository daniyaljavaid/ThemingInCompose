package com.dj.facebook.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.dj.registration.theme.LocalExtendedColors
import com.dj.registration.theme.LocalExtendedTypography

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200
)


@Composable
fun FacebookTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    CompositionLocalProvider(
        LocalExtendedTypography provides FacebookExtendedTypography,
        LocalExtendedColors provides FacebookExtendedColors
    ) {
        MaterialTheme(
            colors = colors,
            typography = FacebookTypography,
            content = content
        )
    }
}