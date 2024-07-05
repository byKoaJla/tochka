package by.koajla.tochka.auth.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import by.koajla.tochka.ui.theme.spacing

@Composable
fun EmailField(
    modifier: Modifier = Modifier,
    label: String,
    value: String,
    hint: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(
                text = label,
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        placeholder = {
            Text(text = hint)
        },
        modifier  =  Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
private fun EmailFieldPreview() {
    EmailField(label = "Email", value = "", hint = "test@gmail.com", onValueChange = {})
}