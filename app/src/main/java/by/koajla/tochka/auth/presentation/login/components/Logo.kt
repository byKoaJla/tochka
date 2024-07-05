package by.koajla.tochka.auth.presentation.login.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import by.koajla.tochka.R

@Composable
fun Logo() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement  = Arrangement.spacedBy(10.dp),
    ) {
        Icon(painter =
        painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier  = Modifier.size(35.dp),
            tint = Color.Unspecified
        )
        Text(
            text = stringResource(id = R.string.app_name),
            style  = MaterialTheme.typography.titleMedium,
        )
    }
}