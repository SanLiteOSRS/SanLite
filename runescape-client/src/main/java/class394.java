import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public class class394 extends class395 {
	public class394(int var1) {
		super(var1); // L: 7
	} // L: 8

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "-1563970648"
	)
	void vmethod7115(Buffer var1, int var2) {
	} // L: 12

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "1613525807"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 97
		if (var3) { // L: 98
			var5 |= 65536L;
		}

		return var5; // L: 99
	}
}
