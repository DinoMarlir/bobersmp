package de.airblocks.bobersmp.plugin

import de.airblocks.bobersmp.api.BoberApi
import de.airblocks.bobersmp.api.feature.AbstractFeatureRegistry
import de.airblocks.bobersmp.plugin.feature.FeatureRegistryImpl

class BoberApiImpl: BoberApi() {

    override fun getFeatureRegistry(): AbstractFeatureRegistry {
        return FeatureRegistryImpl()
    }
}