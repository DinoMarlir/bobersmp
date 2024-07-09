package de.airblocks.bobersmp.api.feature

abstract class AbstractFeatureRegistry {
    abstract fun registerFeature(feature: AbstractFeature)

    abstract fun enableFeature(feature: AbstractFeature)

    abstract fun disableFeature(feature: AbstractFeature)

    abstract fun getFeatures(): Map<AbstractFeature, Boolean>

    abstract fun getEnabledFeatures(): Map<AbstractFeature, Boolean>

    abstract fun getDisabledFeatures(): Map<AbstractFeature, Boolean>

    abstract fun getFeatureById(id: String): AbstractFeature?
}