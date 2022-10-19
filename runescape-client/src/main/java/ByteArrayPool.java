import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1718281099
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1986520623
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 233896657
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 842882659
	)
	static int field4384;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -642521471
	)
	static int field4385;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 580082705
	)
	static int field4386;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 327199293
	)
	static int field4387;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1792853587
	)
	static int field4392;
	@ObfuscatedName("p")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("b")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("o")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("u")
	static byte[][] field4390;
	@ObfuscatedName("m")
	public static ArrayList field4393;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4384 = 0; // L: 16
		field4385 = 1000; // L: 17
		field4386 = 250; // L: 18
		field4387 = 100; // L: 19
		field4392 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4390 = new byte[50][]; // L: 24
		field4393 = new ArrayList(); // L: 28
		Skills.method6245(); // L: 31
		new HashMap();
	} // L: 36

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1189793860"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) { // L: 52
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 53
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 54
			return var4; // L: 55
		}

		if (var0 != 5000) { // L: 57
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 58
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 59
			return var4; // L: 60
		}

		if (var0 != 10000) { // L: 62
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 63
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 64
			return var4; // L: 65
		}

		if (var0 != 30000) { // L: 67
			if (var0 < 30000) {
			}
		} else if (field4384 > 0) {
			var4 = field4390[--field4384]; // L: 68
			field4390[field4384] = null; // L: 69
			return var4; // L: 70
		}

		if (class357.ByteArrayPool_arrays != null) { // L: 72
			for (int var2 = 0; var2 < WallObject.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 73
				if (WallObject.ByteArrayPool_alternativeSizes[var2] != var0) { // L: 74
					if (var0 < WallObject.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (class239.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = class357.ByteArrayPool_arrays[var2][--class239.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 75
					class357.ByteArrayPool_arrays[var2][class239.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 76
					return var3; // L: 77
				}
			}
		}

		return new byte[var0]; // L: 90
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;IIB)Lnl;",
		garbageValue = "-62"
	)
	public static Font method7165(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3); // L: 120
		boolean var4;
		if (var5 == null) { // L: 121
			var4 = false; // L: 122
		} else {
			class335.SpriteBuffer_decode(var5); // L: 125
			var4 = true; // L: 126
		}

		if (!var4) { // L: 128
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3); // L: 130
			Font var8;
			if (var6 == null) { // L: 132
				var8 = null; // L: 133
			} else {
				Font var7 = new Font(var6, class451.SpriteBuffer_xOffsets, class319.SpriteBuffer_yOffsets, class450.SpriteBuffer_spriteWidths, class477.SpriteBuffer_spriteHeights, class477.SpriteBuffer_spritePalette, class453.SpriteBuffer_pixels); // L: 136
				class451.SpriteBuffer_xOffsets = null; // L: 138
				class319.SpriteBuffer_yOffsets = null; // L: 139
				class450.SpriteBuffer_spriteWidths = null; // L: 140
				class477.SpriteBuffer_spriteHeights = null; // L: 141
				class477.SpriteBuffer_spritePalette = null; // L: 142
				class453.SpriteBuffer_pixels = null; // L: 143
				var8 = var7; // L: 145
			}

			return var8; // L: 147
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-5"
	)
	static final void method7164(int var0) {
		if (WorldMapManager.loadInterface(var0)) { // L: 12090
			MenuAction.drawModelComponents(Widget.Widget_interfaceComponents[var0], -1); // L: 12091
		}
	} // L: 12092
}
