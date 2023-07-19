import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public class class369 {
	@ObfuscatedName("ai")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("ac")
	int[] field4337;
	@ObfuscatedName("aw")
	int[] field4340;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -860834813
	)
	int field4341;

	public class369() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field4337 = new int[2048]; // L: 12
		this.field4340 = new int[2048]; // L: 13
		this.field4341 = 0; // L: 14
		class490.field4980 = new int[2000]; // L: 22
		int var1 = 0; // L: 23
		int var2 = 240; // L: 24

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) { // L: 25
			var4 = MouseRecorder.method2319((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var1 * 0.425F / 16.0F)); // L: 27
			class490.field4980[var1] = var4; // L: 28
			++var1; // L: 26
		}

		var2 = 48; // L: 30

		for (int var6 = var2 / 6; var1 < class490.field4980.length; var2 -= var6) { // L: 31 32 38
			var4 = var1 * 2; // L: 33

			for (int var5 = MouseRecorder.method2319((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class490.field4980.length; ++var1) { // L: 34 35
				class490.field4980[var1] = var5; // L: 36
			}
		}

	} // L: 41

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-987564185"
	)
	void method6999(int var1) {
		int var2 = var1 * 2 + 1; // L: 44
		double var4 = (double)((float)var1 / 3.0F); // L: 46
		int var6 = var1 * 2 + 1; // L: 48
		double[] var7 = new double[var6]; // L: 49
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var16 = (double)(var8 - 0) / var4; // L: 56
			double var14 = Math.exp(var16 * -var16 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 58
			double var24 = var14 / var4; // L: 60
			var7[var9] = var24; // L: 62
			++var8; // L: 50
		}

		double[] var18 = var7; // L: 66
		double var19 = var7[var1] * var7[var1]; // L: 67
		int[] var21 = new int[var2 * var2]; // L: 68
		boolean var10 = false; // L: 69

		for (int var11 = 0; var11 < var2; ++var11) { // L: 70
			for (int var12 = 0; var12 < var2; ++var12) { // L: 71
				int var13 = var21[var12 + var2 * var11] = (int)(256.0D * (var18[var11] * var18[var12] / var19)); // L: 72
				if (!var10 && var13 > 0) { // L: 73
					var10 = true; // L: 74
				}
			}
		}

		SpritePixels var22 = new SpritePixels(var21, var2, var2); // L: 78
		this.spriteMap.put(var1, var22); // L: 79
	} // L: 80

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Luq;",
		garbageValue = "1391744734"
	)
	SpritePixels method6982(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 83
			this.method6999(var1); // L: 84
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 86
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "623117145"
	)
	public final void method6983(int var1, int var2) {
		if (this.field4341 < this.field4337.length) { // L: 90
			this.field4337[this.field4341] = var1; // L: 91
			this.field4340[this.field4341] = var2; // L: 92
			++this.field4341; // L: 93
		}
	} // L: 94

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	public final void method6984() {
		this.field4341 = 0; // L: 97
	} // L: 98

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILuq;FB)V",
		garbageValue = "-68"
	)
	public final void method6985(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F); // L: 101
		SpritePixels var6 = this.method6982(var5); // L: 102
		int var7 = var5 * 2 + 1; // L: 103
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 104
		Bounds var9 = new Bounds(0, 0); // L: 105
		this.bounds.setHigh(var7, var7); // L: 106
		System.nanoTime(); // L: 107

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4341; ++var10) { // L: 108
			var11 = this.field4337[var10]; // L: 109
			var12 = this.field4340[var10]; // L: 110
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5; // L: 111
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5; // L: 112
			this.bounds.setLow(var13, var14); // L: 113
			this.bounds.method8148(var8, var9); // L: 114
			this.method6986(var6, var3, var9); // L: 115
		}

		System.nanoTime(); // L: 117
		System.nanoTime(); // L: 118

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 119
			if (var3.pixels[var10] == 0) { // L: 120
				var3.pixels[var10] = -16777216; // L: 121
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 124
				if (var11 <= 0) { // L: 125
					var3.pixels[var10] = -16777216; // L: 126
				} else {
					if (var11 > class490.field4980.length) { // L: 129
						var11 = class490.field4980.length;
					}

					var12 = class490.field4980[var11 - 1]; // L: 130
					var3.pixels[var10] = -16777216 | var12; // L: 131
				}
			}
		}

		System.nanoTime(); // L: 133
	} // L: 134

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luq;Luq;Lrh;B)V",
		garbageValue = "111"
	)
	void method6986(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 137
			int var4 = 0; // L: 138
			int var5 = 0; // L: 139
			if (var3.lowX == 0) { // L: 140
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 141
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 142
			int var7 = var3.lowX + var2.subWidth * var3.lowY; // L: 143

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 144
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 145
					int[] var10000 = var2.pixels; // L: 146
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 148
				var7 += var2.subWidth - var3.highX; // L: 149
			}

		}
	} // L: 151
}
