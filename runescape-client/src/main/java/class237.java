import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
public class class237 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-409091178"
	)
	public static boolean method4616(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) { // L: 45
			if (var0 != 0) { // L: 46
				char[] var1 = class403.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) {
						return true; // L: 52
					}
				}
			}

			return false; // L: 57
		} else {
			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[II)V",
		garbageValue = "-2012068"
	)
	public static void method4614(String[] var0, int[] var1) {
		class389.method7345(var0, var1, 0, var0.length - 1); // L: 39
	} // L: 40

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1102655541"
	)
	public static void method4617() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 61
	} // L: 62

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-462290629"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 155
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1896988471"
	)
	static final boolean method4615(int var0, int var1) {
		ObjectComposition var2 = class127.getObjectDefinition(var0); // L: 1030
		if (var1 == 11) { // L: 1031
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 1032
		}

		return var2.method3925(var1); // L: 1033
	}
}
