package dev.jgreer.pilot.common

object PilotMod {
    const val MOD_ID = "pilot"
    
    private var instance: PilotMod? = null
    
    fun getInstance(): PilotMod = instance ?: throw IllegalStateException("PilotMod not initialized!")
    
    fun init() {
        println("==========================================")
        println("Initializing Pilot Mod!")
        println("==========================================")
        instance = this
    }
}
