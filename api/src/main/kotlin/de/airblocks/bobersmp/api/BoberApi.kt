package de.airblocks.bobersmp.api

import de.airblocks.bobersmp.api.feature.AbstractFeatureRegistry

abstract class BoberApi {

    abstract fun getFeatureRegistry(): AbstractFeatureRegistry

    companion object {
        private lateinit var instance: BoberApi

        fun getInstance(): BoberApi {
            return instance
        }
    }

    init {
        instance = this
    }
}