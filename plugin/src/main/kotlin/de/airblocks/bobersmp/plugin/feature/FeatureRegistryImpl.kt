package de.airblocks.bobersmp.plugin.feature

import de.airblocks.bobersmp.api.feature.AbstractFeature
import de.airblocks.bobersmp.api.feature.AbstractFeatureRegistry

class FeatureRegistryImpl: AbstractFeatureRegistry() {
    private val features: MutableMap<AbstractFeature, Boolean> = mutableMapOf()

    override fun registerFeature(feature: AbstractFeature) {
        TODO("Not yet implemented")
    }

    override fun enableFeature(feature: AbstractFeature) {
        TODO("Not yet implemented")
    }

    override fun disableFeature(feature: AbstractFeature) {
        TODO("Not yet implemented")
    }

    override fun getFeatures(): Map<AbstractFeature, Boolean> {
        TODO("Not yet implemented")
    }

    override fun getEnabledFeatures(): Map<AbstractFeature, Boolean> {
        TODO("Not yet implemented")
    }

    override fun getDisabledFeatures(): Map<AbstractFeature, Boolean> {
        TODO("Not yet implemented")
    }

    override fun getFeatureById(id: String): AbstractFeature? {
        TODO("Not yet implemented")
    }
}