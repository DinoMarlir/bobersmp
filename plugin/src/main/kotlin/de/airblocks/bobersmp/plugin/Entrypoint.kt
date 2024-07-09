package de.airblocks.bobersmp.plugin

import de.airblocks.bobersmp.api.BoberApi
import de.airblocks.bobersmp.plugin.branding.BrandingFeature
import net.axay.kspigot.main.KSpigot

@Suppress("unused")
class Entrypoint: KSpigot() {

    companion object {
        lateinit var instance: Entrypoint
    }

    override fun load() {
        instance = this
        BoberApiImpl()

        with(BoberApi.getInstance().getFeatureRegistry()) {
            registerFeature(BrandingFeature())
        }
    }

    override fun startup() {
        BrandingFeature().enable() //TODO: use registry
    }
}