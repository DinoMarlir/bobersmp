package de.airblocks.bobersmp.api.feature

abstract class AbstractFeature {

    open fun enable() = Unit
    open fun disable() = Unit

    fun getFeatureInfo(): FeatureInfo {
        return this::class.java.getAnnotation(FeatureInfo::class.java)
    }
}