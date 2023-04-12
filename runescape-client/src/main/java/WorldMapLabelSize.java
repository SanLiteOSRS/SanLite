import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -736489631
	)
	final int field2816;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1775270611
	)
	final int field2817;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1071305795
	)
	final int field2813;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2816 = var1;
		this.field2817 = var2;
		this.field2813 = var3;
	} // L: 22

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-160354962"
	)
	boolean method4794(float var1) {
		return var1 >= (float)this.field2813; // L: 25
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljd;",
		garbageValue = "280981839"
	)
	static WorldMapLabelSize[] method4795() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_medium, WorldMapLabelSize_large};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-20257"
	)
	static int method4800(int var0, int var1) {
		if (var0 == -2) { // L: 15
			return 12345678;
		} else if (var0 == -1) { // L: 16
			if (var1 < 0) { // L: 17
				var1 = 0; // L: 18
			} else if (var1 > 127) {
				var1 = 127; // L: 21
			}

			var1 = 127 - var1; // L: 23
			return var1; // L: 24
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 26
			if (var1 < 2) { // L: 27
				var1 = 2;
			} else if (var1 > 126) { // L: 28
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 29
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljn;",
		garbageValue = "-999397643"
	)
	static WorldMapSprite method4796(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class139.method3105(var0).pixels); // L: 19 20
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lhe;",
		garbageValue = "-106"
	)
	static VerticalAlignment[] method4799() {
		return new VerticalAlignment[]{VerticalAlignment.field2036, VerticalAlignment.field2034, VerticalAlignment.VerticalAlignment_centered}; // L: 14
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "16256"
	)
	public static int method4793(int var0) {
		--var0; // L: 66
		var0 |= var0 >>> 1; // L: 67
		var0 |= var0 >>> 2; // L: 68
		var0 |= var0 >>> 4; // L: 69
		var0 |= var0 >>> 8; // L: 70
		var0 |= var0 >>> 16; // L: 71
		return var0 + 1; // L: 72
	}
}
