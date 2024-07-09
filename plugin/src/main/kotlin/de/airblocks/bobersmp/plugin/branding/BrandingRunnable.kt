package de.airblocks.bobersmp.plugin.branding

import net.axay.kspigot.chat.KColors
import net.axay.kspigot.chat.literalText
import net.axay.kspigot.extensions.onlinePlayers
import net.axay.kspigot.extensions.server
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.scheduler.BukkitRunnable
import kotlin.math.roundToInt

class BrandingRunnable: BukkitRunnable() {

    override fun run() {
        onlinePlayers.forEach {
            it.sendPlayerListHeaderAndFooter(
                getHeader(),
                getFooter()
            )
        }
    }

    private fun getHeader(): Component {
        return literalText {
            text("» ") { color = KColors.DARKGRAY }
            text("Bober") { color = KColors.ORANGERED }
            text("SMP") { color = KColors.DARKORANGE }
            text(" «") { color = KColors.DARKGRAY }
            newLine()
        }
    }

    private fun getFooter(): Component {
        return literalText {
            newLine()
            text("TPS") { color = KColors.DARKRED }
            text(" » ") { color = KColors.DARKGRAY }
            text(server.tps[0].roundToInt().toString()) { color = KColors.GREEN }
            newLine()
            text("Playercount") { color = KColors.ORANGERED }
            text(" » ") { color = KColors.DARKGRAY }
            text(onlinePlayers.size.toString()) { color = KColors.GREEN }
            text(" / ") { color = KColors.DARKGRAY }
            text(server.maxPlayers.toString()) { color = KColors.RED }
            newLine()
            newLine()
            text("Powered ") { color = KColors.BLUE }
            legacyText("§3by ")
        }.append(MiniMessage.miniMessage().deserialize("<gradient:#00a5ff:#0077b7>AirBlocks.de</gradient>"))
    }
}