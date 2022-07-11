package com.dj.registration

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.dj.registration.common.UserInput

@Composable
fun RegistrationScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Text(
            text = "Register",
            style = MaterialTheme.typography.h4,
            modifier = Modifier
                .padding(top = 60.dp, bottom = 20.dp)
                .align(Alignment.CenterHorizontally)
        )
        UserInput(
            "Name",
            KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            )
        )
        UserInput(
            "Email",
            KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            )
        )
        UserInput(
            "Password",
            KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            )
        )
        Button(
            shape = RoundedCornerShape(100f),
            elevation = ButtonDefaults.elevation(10.dp),
            content = {
                Text("Submit")
            }, onClick = {}, modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .height(90.dp)
                .padding(top = 40.dp, start = 30.dp, end = 30.dp)
        )

    }
}
