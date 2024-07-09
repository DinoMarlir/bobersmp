package de.airblocks.bobersmp.plugin.feature

import de.airblocks.bobersmp.plugin.Entrypoint
import de.airblocks.bobersmp.plugin.utils.AbstractCachedConfig
import kotlinx.serialization.Serializable
import java.nio.file.Path

@Serializable
data class FeatureConfigData(
    val features: HashMap<String, Boolean>
) {
    companion object {
        val DEFAULT = FeatureConfigData(hashMapOf())
    }
}

class FeatureConfig: AbstractCachedConfig<FeatureConfigData>(
    path = Path.of("${Entrypoint.instance.dataFolder}/BoberSMP/features.json"),
    default = FeatureConfigData.DEFAULT,
    serializer = FeatureConfigData.serializer(),
    deserializer = FeatureConfigData.serializer()
) {
    companion object {
        val instance = FeatureConfig()
    }
}