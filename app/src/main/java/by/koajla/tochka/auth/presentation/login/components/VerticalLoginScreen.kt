package by.koajla.tochka.auth.presentation.login.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight


import androidx.compose.ui.tooling.preview.Preview
import by.koajla.tochka.R
import by.koajla.tochka.auth.presentation.components.GoogleButton
import by.koajla.tochka.ui.theme.Green40
import by.koajla.tochka.ui.theme.spacing


@Composable
fun VerticalLoginScreen(modifier: Modifier = Modifier) {
   Column(modifier = modifier) {
       Logo()
       ContentImage(Modifier.weight(1f))

       Column(
           modifier = Modifier
               .weight(1f)
               .fillMaxWidth(),
           horizontalAlignment = Alignment.CenterHorizontally,
       ) {
           Text(
               text = stringResource(id = R.string.login_title),
               style = MaterialTheme.typography.titleLarge.copy(
                   fontWeight  = FontWeight.Bold,
               ),
           )
           Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
           Text(
               text = stringResource(id  = R.string.credentials),
               style = MaterialTheme.typography.labelMedium,
           )
           Spacer(modifier = Modifier.height(MaterialTheme.spacing.large))
           GoogleButton { }
           Button(
               onClick = { },
               modifier = Modifier.fillMaxWidth(),
               shape = RoundedCornerShape(MaterialTheme.spacing.small),
               colors = ButtonDefaults.buttonColors(
                   containerColor = Green40
               )
           ) {
               Text(
                   text = stringResource(id = R.string.button_login),
                   style = MaterialTheme.typography.titleSmall.copy(
                       color = MaterialTheme.colorScheme.onSurface,
                   )
               )
           }
       }
   }
}



@Preview
@Composable
private fun VerticalLoginScreenPreview() {
    MaterialTheme {
        Scaffold { pv ->
            VerticalLoginScreen(Modifier.padding(pv))
        }
    }
}
