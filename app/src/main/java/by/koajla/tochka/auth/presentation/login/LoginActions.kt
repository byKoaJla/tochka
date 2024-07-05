package by.koajla.tochka.auth.presentation.login

import android.content.Context

/**
 * @author by.koajla
 */
sealed interface LoginActions {
    data class SetEmail(val email: String) : LoginActions
    data class SetPassword(val password: String)  : LoginActions
    data class ChangeTheme(val context: Context): LoginActions
    data object ToggleShowPassword: LoginActions
    data object ForgotPassword: LoginActions
    data object LoginWithGoogle: LoginActions
    data object Login: LoginActions
    data object Registration: LoginActions
}