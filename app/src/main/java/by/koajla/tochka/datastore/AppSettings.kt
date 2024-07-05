package by.koajla.tochka.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.dataStore
import by.koajla.tochka.AppSettings

val Context.appSettings: DataStore<AppSettings> by dataStore(
    fileName =  "app_settings.pb",
    serializer = AppSettingsSerializer
)