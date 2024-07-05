package by.koajla.tochka.auth.navigation

sealed class AuthScreen(val route: String) {
    data object Auth: AuthScreen(AUTH_ROUTE)
    data object Login : AuthScreen(LOGIN_ROUTE)
    companion object {
        private const val LOGIN_ROUTE = "login_screen"
        private const val AUTH_ROUTE = "auth_group"
    }
}