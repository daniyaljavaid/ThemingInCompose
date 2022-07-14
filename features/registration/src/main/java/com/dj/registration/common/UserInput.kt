package com.dj.registration.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dj.components.InputField
import com.dj.components.OutlinedInputField
import com.dj.registration.theme.InputFieldType
import com.dj.registration.theme.componentTypes
import com.dj.registration.theme.customColors
import com.dj.registration.theme.customTypography


@Composable
fun UserInput(label: String, keyboardOptions: KeyboardOptions) {
    var text by remember { mutableStateOf("") }
    val inputFieldColors = MaterialTheme.customColors.inputFieldColors
    if (MaterialTheme.componentTypes.inputField == InputFieldType.Outlined) {
        OutlinedInputField(
            text = text,
            onValueChange = {
                text = it
            },
            label = label,
            modifier = Modifier
                .padding(top = 20.dp, start = 30.dp, end = 30.dp)
                .fillMaxWidth(),
            keyboardOptions = keyboardOptions,
            labelTextStyle = MaterialTheme.customTypography.inputFieldTypography.label,
            textStyle = MaterialTheme.customTypography.inputFieldTypography.text,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = inputFieldColors.backgroundColor,
                unfocusedBorderColor = inputFieldColors.unFocusedBorderColor,
                focusedBorderColor = inputFieldColors.focusedBorderColor,
                focusedLabelColor = inputFieldColors.focusedLabelColor,
                cursorColor = inputFieldColors.cursorColor
            )
        )
    } else {
        InputField(
            text = text,
            onValueChange = {
                text = it
            },
            label = label,
            modifier = Modifier
                .padding(top = 20.dp, start = 30.dp, end = 30.dp)
                .fillMaxWidth(),
            keyboardOptions = keyboardOptions,
            labelTextStyle = MaterialTheme.customTypography.inputFieldTypography.label,
            textStyle = MaterialTheme.customTypography.inputFieldTypography.text,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = inputFieldColors.backgroundColor,
                unfocusedIndicatorColor = inputFieldColors.unFocusedBorderColor,
                focusedIndicatorColor = inputFieldColors.focusedBorderColor,
                focusedLabelColor = inputFieldColors.focusedLabelColor,
                cursorColor = inputFieldColors.cursorColor
            )
        )
    }
}