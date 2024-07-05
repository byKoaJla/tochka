package by.koajla.tochka.auth.presentation.login

import android.content.res.Configuration
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import by.koajla.tochka.auth.presentation.login.components.VerticalLoginScreen
import by.koajla.tochka.ui.theme.TochkaTheme
import by.koajla.tochka.ui.theme.WindowInfo
import by.koajla.tochka.ui.theme.rememberWindowInfo


@Composable
fun LoginScreen(
    uiState: LoginUiState,
    onAction: (LoginActions) -> Unit
) {
    val windowInfo = rememberWindowInfo()
    Scaffold(
        contentWindowInsets =  WindowInsets(left = 10.dp, right  =  10.dp, bottom =  10.dp, top  =  10.dp,)
    ) { pv ->
        if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact) {
            VerticalLoginScreen(Modifier.padding(pv))
        }
        else  {

        }
    }
}

@Preview
@Composable
private fun LoginScreenPreviewLight() {
    TochkaTheme(darkTheme = false) {
        LoginScreen(uiState = LoginUiState(), onAction = {})
    }
}

@Preview
@Composable
private fun LoginScreenPreviewDark() {
    TochkaTheme(darkTheme = true) {
        LoginScreen(uiState = LoginUiState(), onAction = {})
    }
}