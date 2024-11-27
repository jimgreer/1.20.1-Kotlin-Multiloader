package dev.jgreer.pilot.common

object PilotMod {
    const val MOD_ID = "pilot"
    
    // Example of nullable type
    private var instance: PilotMod? = null
    
    // Example of non-null assertion and null check
    fun getInstance(): PilotMod = instance ?: throw IllegalStateException("PilotMod not initialized!")
    
    fun init() {
        println("Hello from Pilot Mod!")
        instance = this
    }
    
    // Example of nullable parameter with safe call
    fun processSignal(signal: String?) {
        signal?.let { s ->
            println("Processing signal: $s")
        } ?: println("No signal to process")
    }
}
