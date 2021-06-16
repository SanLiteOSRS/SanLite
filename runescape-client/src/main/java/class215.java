import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public abstract class class215 implements class217 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("soundCache")
	static SoundCache soundCache;
	@ObfuscatedName("ag")
	static String field2557;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1817479427
	)
	protected int field2559;

	@ObfuscatedSignature(
		descriptor = "(Ljl;Lkn;I)V"
	)
	protected class215(StudioGame var1, Language var2, int var3) {
		this.field2559 = var3;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "-125"
	)
	public static void method4434(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method4434(var0, var1, var2, var5 - 1);
			method4434(var0, var1, var5 + 1, var3);
		}

	}
}
