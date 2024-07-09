package de.airblocks.bobersmp.plugin.feature

import de.airblocks.bobersmp.api.feature.AbstractFeature
import de.airblocks.bobersmp.api.feature.AbstractFeatureRegistry

class FeatureRegistryImpl: AbstractFeatureRegistry() {
    private val features: MutableMap<AbstractFeature, Boolean> = mutableMapOf()

    override fun registerFeature(feature: AbstractFeature) {
        features[feature] = feature.getFeatureInfo().defaultlyEnabled
    }

    override fun enableFeature(feature: AbstractFeature) {
        feature.enable()
        features[feature] = true
    }

    override fun disableFeature(feature: AbstractFeature) {
        feature.disable()
        features[feature] = false
    }

    override fun getFeatures(): Map<AbstractFeature, Boolean> {
        return features
    }

    override fun getEnabledFeatures(): Map<AbstractFeature, Boolean> {
        return features.filter { it.value }
    }

    override fun getDisabledFeatures(): Map<AbstractFeature, Boolean> {
        return features.filter { !it.value }
    }

    override fun getFeatureById(id: String): AbstractFeature? {
        return features.keys.find { it.getFeatureInfo().id == id }
    }
}