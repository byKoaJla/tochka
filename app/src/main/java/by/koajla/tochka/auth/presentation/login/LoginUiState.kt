package by.koajla.tochka.auth.presentation.login

/**
 * @author by.koajla
 */
data class LoginUiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val email: String  = "",
    val password: String = "",
    val isSuccess: Boolean  = false,
    val showPassword: Boolean= false,
    val changeToDark: Boolean = false
)