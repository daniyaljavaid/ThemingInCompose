package com.dj.registration.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

// Note: accessible using -==- MaterialTheme.customTypography.* -==-
// Note: accessible using -==- MaterialTheme.customColors.* -==-
// Note: accessible using -==- MaterialTheme.componentTypes.* -==-
val MaterialTheme.customTypography: ExtendedTypography
    @Composable
    get() = LocalExtendedTypography.current

val MaterialTheme.customColors: ExtendedColors
    @Composable
    get() = LocalExtendedColors.current

val MaterialTheme.componentTypes: ComponentType
    @Composable
    get() = LocalComponentTypes.current
