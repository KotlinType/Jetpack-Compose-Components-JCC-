package ru.jcc.jetpackcomponents.ui.theme.model

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

val LocalJCCTypography = staticCompositionLocalOf<JCCTypography> {
    error("No typography provided")
}

data class JCCTypography(
    val header: TextStyle,
    val title: TextStyle,
    val bodyLarge: TextStyle,
    val bodyMedium: TextStyle,
    val bodySmall: TextStyle,
    val label: TextStyle
)
