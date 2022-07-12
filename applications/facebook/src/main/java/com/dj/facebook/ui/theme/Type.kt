package com.dj.facebook.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.dj.facebook.R
import com.dj.registration.theme.ExtendedTypography
import com.dj.registration.theme.InputFieldTypography

// Set of Material typography styles to start with
val FacebookTypography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.interregular)
        ),
        fontWeight = FontWeight.Bold,
        fontSize = 72.sp
    ),
    h2 = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.interregular)
        ),
        fontWeight = FontWeight.Bold,
        fontSize = 60.sp
    ),
    h3 = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.interregular)
        ),
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp
    ),
    h4 = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.interregular)
        ),
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    h5 = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.interregular)
        ),
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    h6 = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.interregular)
        ),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
)

val FacebookExtendedTypography = ExtendedTypography(
    inputFieldTypography = InputFieldTypography(
        label = TextStyle(
            fontFamily = FontFamily(
                Font(R.font.interregular)
            ),
            fontWeight = FontWeight.Normal
        ),
        text = TextStyle(
            fontFamily = FontFamily(
                Font(R.font.interregular)
            ),
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    )
)