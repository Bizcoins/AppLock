package com.pranavpurwar.applock.data.datastore

import androidx.datastore.preferences.core.booleanPreferencesKey

/**
 * Defines all keys used for storing user preferences in DataStore.
 */
object PreferencesKeys {
    // This key will store a boolean: true if Fingerprint Only is selected, false otherwise.
    val FINGERPRINT_ONLY_BIOMETRICS = booleanPreferencesKey("fingerprint_only_biometrics")
}