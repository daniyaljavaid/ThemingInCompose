package com.dj.registration.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Immutable
data class ExtendedShape(
    val submitButtonShape: Shape
)

val LocalExtendedShapes = staticCompositionLocalOf {
    ExtendedShape(
        submitButtonShape = RoundedCornerShape(4.dp)
    )
}