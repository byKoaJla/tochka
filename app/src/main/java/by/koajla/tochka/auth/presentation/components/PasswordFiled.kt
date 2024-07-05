package by.koajla.tochka.auth.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import by.koajla.tochka.R

@Composable
fun PasswordFiled(
    modifier: Modifier = Modifier,
    password: String,
    onPasswordChange: (String) -> Unit,
    hint: String,
    label: String,
    isShowPassword: Boolean = false,
    changeVisibilityPassword: () -> Unit,
) {
    OutlinedTextField (
        value = password,
        onValueChange = onPasswordChange,
        label = {
            Text(text = label)
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        modifier = modifier
            .fillMaxWidth(),
        visualTransformation = if(!isShowPassword) PasswordVisualTransformation()
            else VisualTransformation.None,
        placeholder =  {
            Text(text = hint)
        },
        trailingIcon =  {
           IconButton(onClick = changeVisibilityPassword) {
               Icon(
                   painter = painterResource(id =
                   if(!isShowPassword) R.drawable.outline_visibility_24
                   else R.drawable.outline_visibility_off_24),
                   contentDescription = null
               )
           }
        }
    )
}