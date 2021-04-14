import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class283 {
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive19")
	static Archive archive19;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-587146564"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-644454381"
	)
	static void method4987() {
		if (Varcs.localPlayer.x >> 7 == Client.destinationX && Varcs.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

	}
}
