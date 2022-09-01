import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class78 {
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfw;",
		garbageValue = "-14"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 25
			var1 = new VarpDefinition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 28
			return var1; // L: 29
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1585294077"
	)
	public static boolean method2054(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field126[var0] : false; // L: 246 247
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2035745879"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 152
	}
}
