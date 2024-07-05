package by.koajla.tochka.auth.presentation.login

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.datastore.preferences.core.edit
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import by.koajla.tochka.datastore.appSettings
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.newCoroutineContext

/**
 * @author: by.koajla
 */
class LoginViewModel : ViewModel() {
    private val _loginUiState = MutableStateFlow(LoginUiState())
    val loginUiState = _loginUiState.asStateFlow()

    fun onAction(event: LoginActions) {
        when(event) {
            LoginActions.Login -> {}
            LoginActions.LoginWithGoogle -> {}
            LoginActions.Registration -> {
                Log.d("New Account", "CLICKED")
            }
            LoginActions.ToggleShowPassword -> _loginUiState.update  { it.copy(
                showPassword = !it.showPassword
            ) }
            is LoginActions.SetEmail -> _loginUiState.update { it.copy(
                email = event.email
            ) }
            is LoginActions.SetPassword -> _loginUiState.update  { it.copy(
                password = event.password
            ) }

            LoginActions.ForgotPassword -> {}
            is LoginActions.ChangeTheme -> {
                viewModelScope.launch {
                    changeTheme(context = event.context)
                    _loginUiState.update { it.copy(
                        changeToDark = !it.changeToDark
                    ) }
                }
            }
        }
    }

    private suspend fun changeTheme(context: Context) {
        context.appSettings.updateData { currentSettings ->
            currentSettings.toBuilder()
                .setDarkTheme(!currentSettings.darkTheme)
                .build()
        }
    }
}