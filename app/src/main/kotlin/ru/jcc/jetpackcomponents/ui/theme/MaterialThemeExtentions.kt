package ru.jcc.jetpackcomponents.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import ru.jcc.jetpackcomponents.ui.theme.model.LocalJCCTypography

val MaterialTheme.jccTypography
    @Composable
    get() = LocalJCCTypography.current
