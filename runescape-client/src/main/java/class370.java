import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
public class class370 {
	@ObfuscatedName("aw")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("ar")
	int[] field4360;
	@ObfuscatedName("am")
	int[] field4366;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -720294865
	)
	int field4362;

	public class370() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field4360 = new int[2048]; // L: 12
		this.field4366 = new int[2048]; // L: 13
		this.field4362 = 0; // L: 14
		ModelData0.field2804 = new int[2000]; // L: 22
		int var1 = 0; // L: 23
		int var2 = 240; // L: 24

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) { // L: 25
			var4 = Archive.method6745((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)((float)var1 * 0.425F / 16.0F + 0.075F)); // L: 27
			ModelData0.field2804[var1] = var4; // L: 28
			++var1; // L: 26
		}

		var2 = 48; // L: 30

		for (int var6 = var2 / 6; var1 < ModelData0.field2804.length; var2 -= var6) { // L: 31 32 38
			var4 = var1 * 2; // L: 33

			for (int var5 = Archive.method6745((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < ModelData0.field2804.length; ++var1) { // L: 34 35
				ModelData0.field2804[var1] = var5; // L: 36
			}
		}

	} // L: 41

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method6963(int var1) {
		int var2 = var1 * 2 + 1; // L: 44
		double var4 = (double)((float)var1 / 3.0F); // L: 46
		int var6 = var1 * 2 + 1; // L: 48
		double[] var7 = new double[var6]; // L: 49
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = class14.method190((double)var8, 0.0D, var4); // L: 51
			++var8; // L: 50
		}

		double[] var14 = var7; // L: 55
		double var15 = var7[var1] * var7[var1]; // L: 56
		int[] var17 = new int[var2 * var2]; // L: 57
		boolean var10 = false; // L: 58

		for (int var11 = 0; var11 < var2; ++var11) { // L: 59
			for (int var12 = 0; var12 < var2; ++var12) { // L: 60
				int var13 = var17[var12 + var2 * var11] = (int)(256.0D * (var14[var12] * var14[var11] / var15)); // L: 61
				if (!var10 && var13 > 0) { // L: 62
					var10 = true; // L: 63
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2); // L: 67
		this.spriteMap.put(var1, var18); // L: 68
	} // L: 69

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lud;",
		garbageValue = "1395339509"
	)
	SpritePixels method6964(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 72
			this.method6963(var1); // L: 73
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 75
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-205352827"
	)
	public final void method6965(int var1, int var2) {
		if (this.field4362 < this.field4360.length) { // L: 79
			this.field4360[this.field4362] = var1; // L: 80
			this.field4366[this.field4362] = var2; // L: 81
			++this.field4362; // L: 82
		}
	} // L: 83

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1967755634"
	)
	public final void method6966() {
		this.field4362 = 0; // L: 86
	} // L: 87

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILud;FI)V",
		garbageValue = "-114256156"
	)
	public final void method6967(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F); // L: 90
		SpritePixels var6 = this.method6964(var5); // L: 91
		int var7 = var5 * 2 + 1; // L: 92
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 93
		Bounds var9 = new Bounds(0, 0); // L: 94
		this.bounds.setHigh(var7, var7); // L: 95
		System.nanoTime(); // L: 96

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4362; ++var10) { // L: 97
			var11 = this.field4360[var10]; // L: 98
			var12 = this.field4366[var10]; // L: 99
			int var13 = (int)((float)(var11 - var1) * var4) - var5; // L: 100
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 101
			this.bounds.setLow(var13, var14); // L: 102
			this.bounds.method8195(var8, var9); // L: 103
			this.method6968(var6, var3, var9); // L: 104
		}

		System.nanoTime(); // L: 106
		System.nanoTime(); // L: 107

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 108
			if (var3.pixels[var10] == 0) { // L: 109
				var3.pixels[var10] = -16777216; // L: 110
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 113
				if (var11 <= 0) { // L: 114
					var3.pixels[var10] = -16777216; // L: 115
				} else {
					if (var11 > ModelData0.field2804.length) { // L: 118
						var11 = ModelData0.field2804.length;
					}

					var12 = ModelData0.field2804[var11 - 1]; // L: 119
					var3.pixels[var10] = -16777216 | var12; // L: 120
				}
			}
		}

		System.nanoTime(); // L: 122
	} // L: 123

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lud;Lud;Lrk;S)V",
		garbageValue = "-20246"
	)
	void method6968(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 126
			int var4 = 0; // L: 127
			int var5 = 0; // L: 128
			if (var3.lowX == 0) { // L: 129
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 130
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 131
			int var7 = var3.lowX + var2.subWidth * var3.lowY; // L: 132

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 133
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 134
					int[] var10000 = var2.pixels; // L: 135
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 137
				var7 += var2.subWidth - var3.highX; // L: 138
			}

		}
	} // L: 140
}
