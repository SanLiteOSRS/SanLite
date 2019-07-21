![](https://i.imgur.com/DrOHIyS.png)
# SanLite [![Discord](https://img.shields.io/discord/301755382160818177.svg)](https://discord.gg/rRMNYz8)

SanLite is a custom version of the popular OldSchool RuneScape client RuneLite.

If you have any questions, please join our [Discord](https://discord.gg/rRMNYz8) server.

## Project Layout

- [bootstrapper](bootstrapper/src/main/java/net/runelite/bootstrap) - Generates bootstrap file used for retrieving launcher dependencies
- [cache](cache/src/main/java/net/runelite/cache) - Libraries used for reading/writing cache files, as well as the data in it
- [deobfuscator](deobfuscator/src/main/java/net/runelite/deob) - Deobfuscates OSRS gamepacks & updating runescape-client mappings
- [http-api](http-api/src/main/java/net/runelite/http/api) - API for api.runelite.net
- [http-service](http-service/src/main/java/net/runelite/http/service) - Service for api.runelite.net
- [injected-client](injected-client) - OSRS client with mixins injected
- [injector-plugin](injector-plugin/src/main/java/net/runelite/injector) - Injects mixins into the OSRS client
- [runelite-api](runelite-api/src/main/java/net/runelite/api) - RuneLite API, interfaces for accessing the client
- [runelite-mixins](runelite-mixins/src/main/java/net/runelite) - Mixins which are injected into the injected client's classes	
- [runescape-api](runescape-api/src/main/java/net/runelite) - Mappings correspond to these interfaces, runelite-api is a subset of this
- [runelite-client](runelite-client/src/main/java/net/runelite/client) - Game client with plugins
- [runescape-client](runescape-client/src/main/java) - Refactored RuneScape client

## Usage

Open the project in your IDE as a Maven project, build the root module and then run the RuneLite class in runelite-client.  
For more information visit the [RuneLite Wiki](https://github.com/runelite/runelite/wiki).

### License

SanLite is a custom version of RuneLite which is licensed under the BSD 2-clause license. See the license header in the respective file to be sure.

## Contribute and Develop

We've set up a separate document for our [contribution guidelines](https://github.com/runelite/runelite/blob/master/.github/CONTRIBUTING.md).
