package by.koajla.tochka.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import by.koajla.tochka.auth.navigation.AuthScreen
import by.koajla.tochka.auth.navigation.authGroupRoutes
import by.koajla.tochka.auth.presentation.login.LoginActions
import by.koajla.tochka.auth.presentation.login.LoginUiState

@Composable
fun AppNavGraph(
    navHostController: NavHostController,
    loginScreen: @Composable (LoginUiState, (LoginActions) -> Unit) -> Unit
) {
    NavHost(
        navController = navHostController,
        startDestination = AuthScreen.Auth.route)
    {
        authGroupRoutes (
            loginScreen = loginScreen
        )
    }
}