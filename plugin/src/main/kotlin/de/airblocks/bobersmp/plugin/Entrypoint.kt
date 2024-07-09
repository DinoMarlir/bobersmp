package de.airblocks.bobersmp.plugin

import net.axay.kspigot.main.KSpigot

@Suppress("unused")
class Entrypoint: KSpigot() {

    companion object {
        lateinit var instance: Entrypoint
    }

    override fun load() {
        instance = this
        BoberApiImpl()
    }
}