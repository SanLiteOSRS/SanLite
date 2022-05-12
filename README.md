![](https://i.imgur.com/Kk1sml0.png)
# SanLite [![Actions Status](https://github.com/SanLiteOSRS/SanLite/workflows/SanLite%20CI%20-%20Push/badge.svg)](https://github.com/SanLiteOSRS/SanLite/actions) [![Discord](https://img.shields.io/discord/634166880411713576?style=flat&logo=discord)](https://discord.gg/hNgWmk6)

SanLite is a custom version of the popular Old School RuneScape client RuneLite.

If you have any questions, please join our [Discord](https://discord.gg/hNgWmk6) server.

## Project Layout

- [cache](cache/src/main/java/net/runelite/cache) - Libraries used for reading/writing cache files, as well as the data in it
- [deobfuscator](deobfuscator/src/main/java/net/runelite/deob) - Deobfuscates OSRS gamepacks & updating the runescape-client mappings
- [injector](injector/src/main/java/net/runelite/injector) - Injects mixins into the OSRS client
- [runelite-api](runelite-api/src/main/java/net/runelite/api) - RuneLite API, interfaces for accessing the client
- [runelite-mixins](runelite-mixins/src/main/java/net/runelite) - Mixins which are injected into the injected client's classes	
- [runescape-api](runescape-api/src/main/java/net/runelite) - Mappings correspond to these interfaces, runelite-api is a subset of this
- [runelite-client](runelite-client/src/main/java/net/runelite/client) - Game client with plugins
- [runescape-client](runescape-client/src/main/java) - Refactored Old School RuneScape client

## Usage

Open the project in your IDE as a Maven project, build the root module and then run the RuneLite class in runelite-client.  
For more information visit the [RuneLite Wiki](https://github.com/runelite/runelite/wiki).

### License

SanLite is a custom version of RuneLite which is licensed under the BSD 2-clause license. See the license header in the respective file to be sure.

## Contribute and Develop

We've set up a separate document for our [contribution guidelines](https://github.com/sanliteosrs/SanLite/blob/master/.github/CONTRIBUTING.md).
