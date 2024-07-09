package de.airblocks.bobersmp.plugin.branding

import de.airblocks.bobersmp.api.feature.AbstractFeature
import de.airblocks.bobersmp.api.feature.FeatureInfo
import de.airblocks.bobersmp.plugin.Entrypoint

@FeatureInfo(
    id = "branding",
)
class BrandingFeature: AbstractFeature() {

    override fun enable() {
        BrandingRunnable().runTaskTimer(Entrypoint.instance, 0, 20)
    }
}