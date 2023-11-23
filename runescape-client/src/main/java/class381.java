import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public class class381 {
	@ObfuscatedName("at")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrv;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("ar")
	int[] field4385;
	@ObfuscatedName("ao")
	int[] field4386;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1596078923
	)
	int field4388;

	public class381() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field4385 = new int[2048]; // L: 12
		this.field4386 = new int[2048]; // L: 13
		this.field4388 = 0; // L: 14
		class162.method3451(); // L: 21
	} // L: 22

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-18604685"
	)
	void method7157(int var1) {
		int var2 = var1 * 2 + 1; // L: 46
		double[] var3 = class384.method7186(0.0D, (double)((float)var1 / 3.0F), var1); // L: 47
		double var4 = var3[var1] * var3[var1]; // L: 48
		int[] var6 = new int[var2 * var2]; // L: 49
		boolean var7 = false; // L: 50

		for (int var8 = 0; var8 < var2; ++var8) { // L: 51
			for (int var9 = 0; var9 < var2; ++var9) { // L: 52
				int var10 = var6[var9 + var2 * var8] = (int)(256.0D * (var3[var9] * var3[var8] / var4)); // L: 53
				if (!var7 && var10 > 0) { // L: 54
					var7 = true; // L: 55
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2); // L: 59
		this.spriteMap.put(var1, var11); // L: 60
	} // L: 61

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Luz;",
		garbageValue = "1127436045"
	)
	SpritePixels method7175(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 64
			this.method7157(var1); // L: 65
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 67
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1542973383"
	)
	public final void method7159(int var1, int var2) {
		if (this.field4388 < this.field4385.length) { // L: 71
			this.field4385[this.field4388] = var1; // L: 72
			this.field4386[this.field4388] = var2; // L: 73
			++this.field4388; // L: 74
		}
	} // L: 75

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-26946"
	)
	public final void method7163() {
		this.field4388 = 0; // L: 78
	} // L: 79

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILuz;FB)V",
		garbageValue = "127"
	)
	public final void method7160(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F); // L: 82
		SpritePixels var6 = this.method7175(var5); // L: 83
		int var7 = var5 * 2 + 1; // L: 84
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 85
		Bounds var9 = new Bounds(0, 0); // L: 86
		this.bounds.setHigh(var7, var7); // L: 87
		System.nanoTime(); // L: 88

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4388; ++var10) { // L: 89
			var11 = this.field4385[var10]; // L: 90
			var12 = this.field4386[var10]; // L: 91
			int var13 = (int)((float)(var11 - var1) * var4) - var5; // L: 92
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 93
			this.bounds.setLow(var13, var14); // L: 94
			this.bounds.method8375(var8, var9); // L: 95
			this.method7161(var6, var3, var9); // L: 96
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
					if (var11 > ChatChannel.field996.length) { // L: 110
						var11 = ChatChannel.field996.length;
					}

					var12 = ChatChannel.field996[var11 - 1]; // L: 111
					var3.pixels[var10] = -16777216 | var12; // L: 112
				}
			}
		}

		System.nanoTime(); // L: 114
	} // L: 115

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luz;Luz;Lrv;I)V",
		garbageValue = "-1645913083"
	)
	void method7161(SpritePixels var1, SpritePixels var2, Bounds var3) {
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
			int var7 = var3.lowX + var2.subWidth * var3.lowY; // L: 124

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
}
