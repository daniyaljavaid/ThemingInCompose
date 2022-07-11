package com.dj.registration.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dj.components.InputField
import com.dj.registration.theme.ExtendedTheme


@Composable
fun UserInput(label: String, keyboardOptions: KeyboardOptions) {
    var text by remember { mutableStateOf("") }
    val inputFieldColors = ExtendedTheme.colors.inputFieldColors
    InputField(
        text = text,
        onValueChange = {
            text = it
        },
        label = label,
        modifier = Modifier
            .padding(all = 10.dp)
            .fillMaxWidth(),
        keyboardOptions = keyboardOptions,
        labelTextStyle = ExtendedTheme.typography.label,
        textStyle = ExtendedTheme.typography.inputField, // or LocalExtendedTypography.current.inputField || Before: MaterialTheme.typography.body1
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = inputFieldColors.focusedBorderColor,
            focusedLabelColor = inputFieldColors.focusedLabelColor,
            cursorColor = inputFieldColors.cursorColor
        )
    )

}