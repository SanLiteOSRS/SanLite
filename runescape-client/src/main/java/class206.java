import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class206 {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 892952431
	)
	static int field2094;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -4123509286183528355L
	)
	public long field2101;
	@ObfuscatedName("ah")
	int[] field2093;
	@ObfuscatedName("af")
	short[] field2092;
	@ObfuscatedName("at")
	short[] field2098;
	@ObfuscatedName("an")
	public boolean field2096;

	public class206(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.field2096 = false; // L: 8
		this.field2101 = var1; // L: 11
		this.field2093 = var3; // L: 12
		this.field2092 = var4;
		this.field2098 = var5; // L: 14
		this.field2096 = var6; // L: 15
	} // L: 16

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1074875981"
	)
	static final int method3857(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 9
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "18"
	)
	public static int method3858(int var0) {
		return var0 >> 17 & 7; // L: 13
	}

	@ObfuscatedName("ab")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 68
	}
}
