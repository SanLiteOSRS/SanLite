import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class350 {
	@ObfuscatedName("aj")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("ac")
	int[] field4270;
	@ObfuscatedName("ab")
	int[] field4273;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 910924827
	)
	int field4274;

	public class350() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field4270 = new int[2048]; // L: 12
		this.field4273 = new int[2048]; // L: 13
		this.field4274 = 0; // L: 14
		class320.method6305(); // L: 21
	} // L: 22

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1800570311"
	)
	void method6605(int var1) {
		int var2 = var1 * 2 + 1; // L: 46
		double[] var3 = class293.method5519(0.0D, (double)((float)var1 / 3.0F), var1); // L: 47
		double var4 = var3[var1] * var3[var1]; // L: 48
		int[] var6 = new int[var2 * var2]; // L: 49
		boolean var7 = false; // L: 50

		for (int var8 = 0; var8 < var2; ++var8) { // L: 51
			for (int var9 = 0; var9 < var2; ++var9) { // L: 52
				int var10 = var6[var9 + var8 * var2] = (int)(var3[var9] * var3[var8] / var4 * 256.0D); // L: 53
				if (!var7 && var10 > 0) { // L: 54
					var7 = true; // L: 55
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2); // L: 59
		this.spriteMap.put(var1, var11); // L: 60
	} // L: 61

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lsn;",
		garbageValue = "2120633980"
	)
	SpritePixels method6606(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 64
			this.method6605(var1); // L: 65
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 67
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1905943490"
	)
	public final void method6607(int var1, int var2) {
		if (this.field4274 < this.field4270.length) { // L: 71
			this.field4270[this.field4274] = var1; // L: 72
			this.field4273[this.field4274] = var2; // L: 73
			++this.field4274; // L: 74
		}
	} // L: 75

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2035050037"
	)
	public final void method6622() {
		this.field4274 = 0; // L: 78
	} // L: 79

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILsn;FI)V",
		garbageValue = "2073173460"
	)
	public final void method6617(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		SpritePixels var6 = this.method6606(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime(); // L: 88

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4274; ++var10) { // L: 89
			var11 = this.field4270[var10]; // L: 90
			var12 = this.field4273[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5; // L: 92
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 93
			this.bounds.setLow(var13, var14); // L: 94
			this.bounds.method7793(var8, var9); // L: 95
			this.method6610(var6, var3, var9); // L: 96
		}

		System.nanoTime(); // L: 98
		System.nanoTime(); // L: 99

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 100
			if (var3.pixels[var10] == 0) { // L: 101
				var3.pixels[var10] = -16777216; // L: 102
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 105
				if (var11 <= 0) { // L: 106
					var3.pixels[var10] = -16777216; // L: 107
				} else {
					if (var11 > class150.field1680.length) { // L: 110
						var11 = class150.field1680.length;
					}

					var12 = class150.field1680[var11 - 1]; // L: 111
					var3.pixels[var10] = -16777216 | var12; // L: 112
				}
			}
		}

		System.nanoTime(); // L: 114
	} // L: 115

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsn;Lsn;Lqy;I)V",
		garbageValue = "1656372641"
	)
	void method6610(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 118
			int var4 = 0; // L: 119
			int var5 = 0; // L: 120
			if (var3.lowX == 0) { // L: 121
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 122
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 123
			int var7 = var2.subWidth * var3.lowY + var3.lowX; // L: 124

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 125
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 126
					int[] var10000 = var2.pixels; // L: 127
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 129
				var7 += var2.subWidth - var3.highX; // L: 130
			}

		}
	} // L: 132

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lre;",
		garbageValue = "-2099916897"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(SoundCache.cacheDir, "preferences" + var0 + ".dat"); // L: 252
		if (var3.exists()) { // L: 253
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 255
				return var10; // L: 256
			} catch (IOException var9) { // L: 258
			}
		}

		String var4 = ""; // L: 260
		if (class7.cacheGamebuild == 33) { // L: 261
			var4 = "_rc";
		} else if (class7.cacheGamebuild == 34) { // L: 262
			var4 = "_wip";
		}

		File var5 = new File(class16.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 263
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 264
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 266
				return var6; // L: 267
			} catch (IOException var8) { // L: 269
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 272
			return var6; // L: 273
		} catch (IOException var7) { // L: 275
			throw new RuntimeException(); // L: 276
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-238829147"
	)
	static final void method6634(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 80
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 81
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 82
					Decimator.field405[0][var5][var4] = 127; // L: 83
					if (var0 == var5 && var5 > 0) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) { // L: 87
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 91
}
