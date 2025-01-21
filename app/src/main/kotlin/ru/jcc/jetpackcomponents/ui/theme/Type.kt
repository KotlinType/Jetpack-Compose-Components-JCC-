package ru.jcc.jetpackcomponents.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ru.jcc.jetpackcomponents.ui.theme.model.JCCTypography
import ru.jcc.jetpackcomponents.R

private val roboto = FontFamily(
    Font(R.font.font_roboto_regular, FontWeight.Normal),
    Font(R.font.font_roboto_medium, FontWeight.Medium),
)

val jccTypography = JCCTypography(
    header =  TextStyle(
        fontFamily = roboto,
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 32.sp,
    ),
    title =  TextStyle(
        fontFamily = roboto,
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 28.sp,
    ),
    bodyLarge =  TextStyle(
        fontFamily = roboto,
        fontSize = 18.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 26.sp,
    ),
    bodyMedium =  TextStyle(
        fontFamily = roboto,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp,
    ),
    bodySmall =  TextStyle(
        fontFamily = roboto,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 20.sp,
    ),
    label =  TextStyle(
        fontFamily = roboto,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 16.sp,
    )
)
