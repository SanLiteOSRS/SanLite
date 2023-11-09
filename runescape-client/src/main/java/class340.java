import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class340 {
	@ObfuscatedName("a")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("c")
	int[] field4224;
	@ObfuscatedName("x")
	int[] field4225;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -268698711
	)
	int field4226;

	public class340() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field4224 = new int[2048]; // L: 12
		this.field4225 = new int[2048]; // L: 13
		this.field4226 = 0; // L: 14
		Messages.method2645(); // L: 21
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-720689240"
	)
	void method6535(int var1) {
		int var2 = var1 * 2 + 1; // L: 46
		double var4 = (double)((float)var1 / 3.0F); // L: 48
		int var6 = var1 * 2 + 1; // L: 50
		double[] var7 = new double[var6]; // L: 51
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var16 = (double)(var8 - 0) / var4; // L: 58
			double var14 = Math.exp(var16 * -var16 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 60
			double var24 = var14 / var4; // L: 62
			var7[var9] = var24; // L: 64
			++var8; // L: 52
		}

		double[] var18 = var7; // L: 68
		double var19 = var7[var1] * var7[var1]; // L: 69
		int[] var21 = new int[var2 * var2]; // L: 70
		boolean var10 = false; // L: 71

		for (int var11 = 0; var11 < var2; ++var11) { // L: 72
			for (int var12 = 0; var12 < var2; ++var12) { // L: 73
				int var13 = var21[var12 + var11 * var2] = (int)(var18[var11] * var18[var12] / var19 * 256.0D); // L: 74
				if (!var10 && var13 > 0) { // L: 75
					var10 = true; // L: 76
				}
			}
		}

		SpritePixels var22 = new SpritePixels(var21, var2, var2); // L: 80
		this.spriteMap.put(var1, var22); // L: 81
	} // L: 82

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lri;",
		garbageValue = "-34097789"
	)
	SpritePixels method6540(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 85
			this.method6535(var1); // L: 86
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 88
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-605935669"
	)
	public final void method6537(int var1, int var2) {
		if (this.field4226 < this.field4224.length) { // L: 92
			this.field4224[this.field4226] = var1; // L: 93
			this.field4225[this.field4226] = var2; // L: 94
			++this.field4226; // L: 95
		}
	} // L: 96

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public final void method6538() {
		this.field4226 = 0; // L: 99
	} // L: 100

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILri;FI)V",
		garbageValue = "-570834065"
	)
	public final void method6539(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4); // L: 103
		SpritePixels var6 = this.method6540(var5); // L: 104
		int var7 = var5 * 2 + 1; // L: 105
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 106
		Bounds var9 = new Bounds(0, 0); // L: 107
		this.bounds.setHigh(var7, var7); // L: 108
		System.nanoTime(); // L: 109

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4226; ++var10) { // L: 110
			var11 = this.field4224[var10]; // L: 111
			var12 = this.field4225[var10]; // L: 112
			int var13 = (int)((float)(var11 - var1) * var4) - var5; // L: 113
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 114
			this.bounds.setLow(var13, var14); // L: 115
			this.bounds.method7575(var8, var9); // L: 116
			this.method6547(var6, var3, var9); // L: 117
		}

		System.nanoTime(); // L: 119
		System.nanoTime(); // L: 120

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 121
			if (var3.pixels[var10] == 0) { // L: 122
				var3.pixels[var10] = -16777216; // L: 123
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 126
				if (var11 <= 0) { // L: 127
					var3.pixels[var10] = -16777216; // L: 128
				} else {
					if (var11 > InvDefinition.field1862.length) { // L: 131
						var11 = InvDefinition.field1862.length;
					}

					var12 = InvDefinition.field1862[var11 - 1]; // L: 132
					var3.pixels[var10] = -16777216 | var12; // L: 133
				}
			}
		}

		System.nanoTime(); // L: 135
	} // L: 136

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;Loq;B)V",
		garbageValue = "87"
	)
	void method6547(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 139
			int var4 = 0; // L: 140
			int var5 = 0; // L: 141
			if (var3.lowX == 0) { // L: 142
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 143
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 144
			int var7 = var3.lowX + var2.subWidth * var3.lowY; // L: 145

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 146
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 147
					int[] var10000 = var2.pixels; // L: 148
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 150
				var7 += var2.subWidth - var3.highX; // L: 151
			}

		}
	} // L: 153

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1261503165"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 221
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true; // L: 222
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 223
		}
	}
}
