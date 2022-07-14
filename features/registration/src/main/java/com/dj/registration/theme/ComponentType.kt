package com.dj.registration.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf


enum class InputFieldType {
    Filled, Outlined
}

@Immutable
data class ComponentType(
    val inputField: InputFieldType
)

val LocalComponentTypes = staticCompositionLocalOf {
    ComponentType(
        inputField = InputFieldType.Filled
    )
}