package by.koajla.tochka

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.collectAsState
import androidx.navigation.compose.rememberNavController
import by.koajla.tochka.auth.presentation.login.LoginScreen
import by.koajla.tochka.datastore.appSettings

import by.koajla.tochka.navigation.AppNavGraph
import by.koajla.tochka.ui.theme.TochkaTheme
import kotlinx.coroutines.flow.map

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val darkTheme = applicationContext.appSettings.data
                .map { settings ->
                    settings.darkTheme
                }.collectAsState(initial = isSystemInDarkTheme())

            TochkaTheme(darkTheme = darkTheme.value) {
                val navController = rememberNavController()
                AppNavGraph(
                    navHostController = navController,
                    loginScreen = { state, action ->
                        LoginScreen(uiState= state, onAction = action)
                    }
                )
            }
        }
    }
}

