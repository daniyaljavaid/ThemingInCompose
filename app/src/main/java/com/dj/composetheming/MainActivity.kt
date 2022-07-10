package com.dj.composetheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dj.components.InputField
import com.dj.composetheming.ui.theme.ComposeThemingTheme
import com.dj.composetheming.ui.theme.CustomTypography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeThemingTheme {
                Column {
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
                }
            }
        }
    }
}

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

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeThemingTheme {
        Greeting("Android")
    }
}