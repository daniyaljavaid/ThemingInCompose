package com.dj.components

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun InputField(
    text: String,
    label: String,
    onValueChange: (value: String) -> Unit,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions,
    textStyle: TextStyle,
    labelTextStyle: TextStyle,
    colors: TextFieldColors
) {
    val keyboardController = LocalSoftwareKeyboardController.current

    OutlinedTextField(
        value = text,
        onValueChange = onValueChange,
        label = { Text(label, style = labelTextStyle) },
        modifier = modifier,
        keyboardOptions = keyboardOptions,
        keyboardActions = KeyboardActions(
            onDone = { keyboardController?.hide() }
        ),
        visualTransformation = if (keyboardOptions.keyboardType == KeyboardType.Password)
            PasswordVisualTransformation()
        else VisualTransformation.None,
        textStyle = textStyle,
        colors = colors
    )
}