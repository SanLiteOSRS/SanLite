import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public class class347 {
	@ObfuscatedName("l")
	static int[] field4307;
	@ObfuscatedName("f")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("v")
	int[] field4302;
	@ObfuscatedName("s")
	int[] field4304;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1580575271
	)
	int field4301;

	public class347() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field4302 = new int[2048]; // L: 12
		this.field4304 = new int[2048]; // L: 13
		this.field4301 = 0; // L: 14
		field4307 = new int[2000]; // L: 22
		int var1 = 0; // L: 23
		int var2 = 240; // L: 24

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) { // L: 25
			var4 = SecureRandomCallable.method2282((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var1 / 16.0F + 0.075F)); // L: 27
			field4307[var1] = var4; // L: 28
			++var1; // L: 26
		}

		var2 = 48; // L: 30

		for (int var6 = var2 / 6; var1 < field4307.length; var2 -= var6) { // L: 31 32 38
			var4 = var1 * 2; // L: 33

			for (int var5 = SecureRandomCallable.method2282((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < field4307.length; ++var1) { // L: 34 35
				field4307[var1] = var5; // L: 36
			}
		}

	} // L: 41

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	void method6740(int var1) {
		int var2 = var1 * 2 + 1; // L: 44
		double var4 = (double)((float)var1 / 3.0F); // L: 46
		int var6 = var1 * 2 + 1; // L: 48
		double[] var7 = new double[var6]; // L: 49
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var20 = class6.method46((double)(var8 - 0) / var4) / var4; // L: 55
			var7[var9] = var20; // L: 57
			++var8; // L: 50
		}

		double[] var14 = var7; // L: 61
		double var15 = var7[var1] * var7[var1]; // L: 62
		int[] var17 = new int[var2 * var2]; // L: 63
		boolean var10 = false; // L: 64

		for (int var11 = 0; var11 < var2; ++var11) { // L: 65
			for (int var12 = 0; var12 < var2; ++var12) { // L: 66
				int var13 = var17[var12 + var2 * var11] = (int)(256.0D * (var14[var11] * var14[var12] / var15)); // L: 67
				if (!var10 && var13 > 0) { // L: 68
					var10 = true; // L: 69
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2); // L: 73
		this.spriteMap.put(var1, var18); // L: 74
	} // L: 75

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrs;",
		garbageValue = "-1"
	)
	SpritePixels method6742(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 78
			this.method6740(var1); // L: 79
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 81
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-699862924"
	)
	public final void method6744(int var1, int var2) {
		if (this.field4301 < this.field4302.length) { // L: 85
			this.field4302[this.field4301] = var1; // L: 86
			this.field4304[this.field4301] = var2; // L: 87
			++this.field4301; // L: 88
		}
	} // L: 89

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1874686349"
	)
	public final void method6759() {
		this.field4301 = 0; // L: 92
	} // L: 93

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILrs;FI)V",
		garbageValue = "582476905"
	)
	public final void method6760(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F); // L: 96
		SpritePixels var6 = this.method6742(var5); // L: 97
		int var7 = var5 * 2 + 1; // L: 98
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 99
		Bounds var9 = new Bounds(0, 0); // L: 100
		this.bounds.setHigh(var7, var7); // L: 101
		System.nanoTime(); // L: 102

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4301; ++var10) { // L: 103
			var11 = this.field4302[var10]; // L: 104
			var12 = this.field4304[var10]; // L: 105
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5; // L: 106
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 107
			this.bounds.setLow(var13, var14); // L: 108
			this.bounds.method7852(var8, var9); // L: 109
			this.method6745(var6, var3, var9); // L: 110
		}

		System.nanoTime(); // L: 112
		System.nanoTime(); // L: 113

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 114
			if (var3.pixels[var10] == 0) { // L: 115
				var3.pixels[var10] = -16777216; // L: 116
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 119
				if (var11 <= 0) { // L: 120
					var3.pixels[var10] = -16777216; // L: 121
				} else {
					if (var11 > field4307.length) { // L: 124
						var11 = field4307.length;
					}

					var12 = field4307[var11 - 1]; // L: 125
					var3.pixels[var10] = -16777216 | var12; // L: 126
				}
			}
		}

		System.nanoTime(); // L: 128
	} // L: 129

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lrs;Lrs;Loj;B)V",
		garbageValue = "44"
	)
	void method6745(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 132
			int var4 = 0; // L: 133
			int var5 = 0; // L: 134
			if (var3.lowX == 0) { // L: 135
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 136
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 137
			int var7 = var2.subWidth * var3.lowY + var3.lowX; // L: 138

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 139
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 140
					int[] var10000 = var2.pixels; // L: 141
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 143
				var7 += var2.subWidth - var3.highX; // L: 144
			}

		}
	} // L: 146
}
