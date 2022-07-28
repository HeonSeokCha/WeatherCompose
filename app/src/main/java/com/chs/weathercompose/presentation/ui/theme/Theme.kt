package com.chs.weathercompose.presentation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable


@Composable
fun WeatherComposeTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}