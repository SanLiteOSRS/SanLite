import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
public class class388 {
	@ObfuscatedName("aq")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("al")
	int[] field4473;
	@ObfuscatedName("ai")
	int[] field4470;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 450207765
	)
	int field4472;

	public class388() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field4473 = new int[2048]; // L: 12
		this.field4470 = new int[2048]; // L: 13
		this.field4472 = 0; // L: 14
		UserComparator8.field1457 = new int[2000]; // L: 22
		int var1 = 0; // L: 23
		int var2 = 240; // L: 24

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) { // L: 25
			var4 = class103.method2747((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)((float)var1 * 0.425F / 16.0F + 0.075F)); // L: 27
			UserComparator8.field1457[var1] = var4; // L: 28
			++var1; // L: 26
		}

		var2 = 48; // L: 30

		for (int var6 = var2 / 6; var1 < UserComparator8.field1457.length; var2 -= var6) { // L: 31 32 38
			var4 = var1 * 2; // L: 33

			for (int var5 = class103.method2747((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < UserComparator8.field1457.length; ++var1) { // L: 34 35
				UserComparator8.field1457[var1] = var5; // L: 36
			}
		}

	} // L: 41

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-9"
	)
	void method7338(int var1) {
		int var2 = var1 * 2 + 1; // L: 44
		double[] var3 = VertexNormal.method5839(0.0D, (double)((float)var1 / 3.0F), var1); // L: 45
		double var4 = var3[var1] * var3[var1]; // L: 46
		int[] var6 = new int[var2 * var2]; // L: 47
		boolean var7 = false; // L: 48

		for (int var8 = 0; var8 < var2; ++var8) { // L: 49
			for (int var9 = 0; var9 < var2; ++var9) { // L: 50
				int var10 = var6[var9 + var2 * var8] = (int)(var3[var8] * var3[var9] / var4 * 256.0D); // L: 51
				if (!var7 && var10 > 0) { // L: 52
					var7 = true; // L: 53
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2); // L: 57
		this.spriteMap.put(var1, var11); // L: 58
	} // L: 59

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lvd;",
		garbageValue = "-1639040198"
	)
	SpritePixels method7328(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 62
			this.method7338(var1); // L: 63
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 65
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "101"
	)
	public final void method7320(int var1, int var2) {
		if (this.field4472 < this.field4473.length) { // L: 69
			this.field4473[this.field4472] = var1; // L: 70
			this.field4470[this.field4472] = var2; // L: 71
			++this.field4472; // L: 72
		}
	} // L: 73

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-378916128"
	)
	public final void method7322() {
		this.field4472 = 0; // L: 76
	} // L: 77

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILvd;FB)V",
		garbageValue = "-16"
	)
	public final void method7323(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4); // L: 80
		SpritePixels var6 = this.method7328(var5); // L: 81
		int var7 = var5 * 2 + 1; // L: 82
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 83
		Bounds var9 = new Bounds(0, 0); // L: 84
		this.bounds.setHigh(var7, var7); // L: 85
		System.nanoTime(); // L: 86

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4472; ++var10) { // L: 87
			var11 = this.field4473[var10]; // L: 88
			var12 = this.field4470[var10]; // L: 89
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5; // L: 90
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 91
			this.bounds.setLow(var13, var14); // L: 92
			this.bounds.method8550(var8, var9); // L: 93
			this.method7324(var6, var3, var9); // L: 94
		}

		System.nanoTime(); // L: 96
		System.nanoTime(); // L: 97

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 98
			if (var3.pixels[var10] == 0) { // L: 99
				var3.pixels[var10] = -16777216; // L: 100
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 103
				if (var11 <= 0) { // L: 104
					var3.pixels[var10] = -16777216; // L: 105
				} else {
					if (var11 > UserComparator8.field1457.length) { // L: 108
						var11 = UserComparator8.field1457.length;
					}

					var12 = UserComparator8.field1457[var11 - 1]; // L: 109
					var3.pixels[var10] = -16777216 | var12; // L: 110
				}
			}
		}

		System.nanoTime(); // L: 112
	} // L: 113

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvd;Lvd;Lrc;I)V",
		garbageValue = "1201645068"
	)
	void method7324(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 116
			int var4 = 0; // L: 117
			int var5 = 0; // L: 118
			if (var3.lowX == 0) { // L: 119
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 120
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var2.subWidth * var3.lowY + var3.lowX;

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 123
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 124
					int[] var10000 = var2.pixels; // L: 125
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 127
				var7 += var2.subWidth - var3.highX; // L: 128
			}

		}
	} // L: 130

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "121"
	)
	static final void method7344(String var0) {
		SecureRandomCallable.method2319("Please remove " + var0 + " from your ignore list first"); // L: 121
	} // L: 122

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILdj;B)V",
		garbageValue = "55"
	)
	static void method7327(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = class127.getObjectDefinition(var6); // L: 8435
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) { // L: 8438
			var15 = var14.sizeX; // L: 8443
			var16 = var14.sizeY; // L: 8444
		} else {
			var15 = var14.sizeY; // L: 8439
			var16 = var14.sizeX; // L: 8440
		}

		int var17 = (var15 >> 1) + var1; // L: 8446
		int var18 = (var15 + 1 >> 1) + var1; // L: 8447
		int var19 = (var16 >> 1) + var2; // L: 8448
		int var20 = var2 + (var16 + 1 >> 1); // L: 8449
		int[][] var21 = Tiles.Tiles_heights[var0]; // L: 8450
		int var22 = var21[var18][var19] + var21[var17][var19] + var21[var17][var20] + var21[var18][var20] >> 2; // L: 8451
		int var23 = (var1 << 7) + (var15 << 6); // L: 8452
		int var24 = (var2 << 7) + (var16 << 6); // L: 8453
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24); // L: 8454
		if (var25 != null) { // L: 8455
			class91.method2381(var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1); // L: 8456
			var13.animationCycleStart = var7 + Client.cycle; // L: 8457
			var13.animationCycleEnd = var8 + Client.cycle; // L: 8458
			var13.model0 = var25; // L: 8459
			var13.field1144 = var1 * 128 + var15 * 64; // L: 8460
			var13.field1146 = var2 * 128 + var16 * 64; // L: 8461
			var13.tileHeight2 = var22; // L: 8462
			int var26;
			if (var9 > var11) { // L: 8463
				var26 = var9; // L: 8464
				var9 = var11; // L: 8465
				var11 = var26; // L: 8466
			}

			if (var10 > var12) { // L: 8468
				var26 = var10; // L: 8469
				var10 = var12; // L: 8470
				var12 = var26; // L: 8471
			}

			var13.minX = var9 + var1; // L: 8473
			var13.maxX = var11 + var1; // L: 8474
			var13.minY = var10 + var2; // L: 8475
			var13.maxY = var2 + var12; // L: 8476
		}

	} // L: 8478
}
