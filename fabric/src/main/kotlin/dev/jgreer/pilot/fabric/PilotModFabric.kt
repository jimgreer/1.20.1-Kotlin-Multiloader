package dev.jgreer.pilot.fabric

import dev.jgreer.pilot.common.PilotMod
import net.fabricmc.api.ModInitializer

object PilotModFabric : ModInitializer {
    override fun onInitialize() {
        PilotMod.init()
    }
}