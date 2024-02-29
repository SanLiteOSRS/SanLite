import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class246 {
	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	static SpritePixels[] field2581;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)V",
		garbageValue = "992572456"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1988
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1989
			boolean var1 = var0.isMembersOnly(); // L: 1990
			if (var1 != HealthBarUpdate.ItemComposition_inMembersWorld) { // L: 1992
				class190.method3773(); // L: 1993
				HealthBarUpdate.ItemComposition_inMembersWorld = var1; // L: 1994
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 1998
			class213.method4205(class311.field3274, var0.properties); // L: 1999
		}

		class183.worldHost = var0.host; // L: 2001
		Client.worldId = var0.id; // L: 2002
		Client.worldProperties = var0.properties; // L: 2003
		KeyHandler.field152 = var0.field850; // L: 2004
		class211.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2005
		class150.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2006
		class316.currentPort = class211.worldPort; // L: 2007
	} // L: 2008

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "264064121"
	)
	static final void method4955(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 10279
			if (Client.menuOptionsCount < 500) { // L: 10280
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 10281
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 10282
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 10283
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 10284
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 10285
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 10286
				Client.field680[Client.menuOptionsCount] = var6; // L: 10287
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 10288
				++Client.menuOptionsCount; // L: 10289
			}

		}
	} // L: 10291
}
