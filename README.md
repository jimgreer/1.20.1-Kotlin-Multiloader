# Minecraft Mod Template

## Managing External Mod Dependencies

Some mods are required at runtime but aren't available through Maven repositories. These mods should be managed as follows:

1. Place any required mod JAR files in the `libs` directory at the root of the project
2. The build system will automatically copy these mods to the run directory when you run the client

The `libs` directory is version controlled, while the `run` directory is not. This ensures that all developers have access to the same set of required mods.

### Current Required Mods
- Create Fabric (0.5.1-d-build.1161+mc1.20.1)
- Indium (1.0.18+mc1.20)
- Sodium (mc1.20-0.4.10+build.27)

These specific versions are required for compatibility. Place the JAR files for these mods in the `libs` directory before running the client.

Download links:
- Create: https://modrinth.com/mod/create-fabric/version/0.5.1-d-build.1161+mc1.20.1
- Indium: https://modrinth.com/mod/indium/version/1.0.18+mc1.20
- Sodium: https://modrinth.com/mod/sodium/version/mc1.20.1-0.4.10
