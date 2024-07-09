package de.airblocks.bobersmp.plugin.utils

import kotlinx.serialization.json.Json

val JSON = Json {
    prettyPrint = true
    isLenient = true
    ignoreUnknownKeys = true
}