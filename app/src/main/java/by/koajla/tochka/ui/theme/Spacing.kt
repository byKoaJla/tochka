package by.koajla.tochka.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Spacing (
    val default: Dp  = 0.dp,
    val extraSmall: Dp = 2.dp,
    val small: Dp = 5.dp,
    val medium: Dp  =  10.dp,
    val large: Dp  =  20.dp,
    val extraLarge: Dp  =  30.dp
)

val LocalSpacing = compositionLocalOf { Spacing() }

val MaterialTheme.spacing: Spacing
@Composable
@ReadOnlyComposable
    get() = LocalSpacing.current