package com.dj.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun InputField(
    text: String,
    label: String,
    onValueChange: (value: String) -> Unit,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions
) {

    OutlinedTextField(
        value = text,
        onValueChange = onValueChange,
        label = { Text(label) },
        modifier = modifier,
        keyboardOptions = keyboardOptions
    )
}