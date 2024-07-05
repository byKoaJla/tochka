package by.koajla.tochka.auth.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import by.koajla.tochka.auth.presentation.login.LoginActions
import by.koajla.tochka.auth.presentation.login.LoginUiState
import by.koajla.tochka.auth.presentation.login.LoginViewModel

fun NavGraphBuilder.authGroupRoutes(
    loginScreen: @Composable (LoginUiState, (LoginActions) -> Unit)  -> Unit
) {
    navigation(startDestination = AuthScreen.Login.route, route = AuthScreen.Auth.route) {
        composable(
            route = AuthScreen.Login.route
        ) {
            val viewmodel = viewModel<LoginViewModel>()
            val uiState by viewmodel.loginUiState.collectAsState()

            loginScreen(uiState) { action ->
                viewmodel.onAction(action)
            }
        }
    }
}