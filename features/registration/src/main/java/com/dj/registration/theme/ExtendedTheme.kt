package com.dj.registration.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

// Note: accessible using -==- MaterialTheme.customTypography.* -==-
// Note: accessible using -==- MaterialTheme.customColors.* -==-
val MaterialTheme.customTypography: ExtendedTypography
    @Composable
    get() = LocalExtendedTypography.current

val MaterialTheme.customColors: ExtendedColors
    @Composable
    get() = LocalExtendedColors.current
