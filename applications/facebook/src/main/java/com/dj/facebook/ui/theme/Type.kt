package com.dj.facebook.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.dj.facebook.R
import com.dj.registration.theme.ExtendedTypography

// Set of Material typography styles to start with
val FacebookTypography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

val FacebookExtendedTypography = ExtendedTypography(
    label = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.interregular)
        ),
        fontWeight = FontWeight.Normal
    ),
    inputField = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.interregular)
        ),
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)