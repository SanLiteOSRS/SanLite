import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class311 {
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "17"
	)
	static void method5486(int var0, int var1) {
		if (class12.clientPreferences.musicVolume != 0 && var0 != -1) {
			World.method1684(KeyHandler.archive11, var0, 0, class12.clientPreferences.musicVolume, false);
			Client.field866 = true;
		}

	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "2108216334"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuShiftClick[Client.menuOptionsCount] = var6;
				++Client.menuOptionsCount;
			}

		}
	}
}
