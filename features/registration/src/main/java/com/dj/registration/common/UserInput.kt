package com.dj.registration.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dj.components.InputField


@Composable
fun UserInput(label: String, keyboardOptions: KeyboardOptions) {
    var text by remember { mutableStateOf("") }

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
        textStyle = MaterialTheme.typography.body1
    )

}