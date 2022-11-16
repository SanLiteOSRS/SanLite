import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class132 extends class135 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1557466625
	)
	int field1568;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -781866971
	)
	int field1570;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 570600793
	)
	int field1569;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1326345317
	)
	int field1571;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	final class138 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lel;)V"
	)
	class132(class138 var1) {
		this.this$0 = var1;
		this.field1568 = -1; // L: 158
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1428026624"
	)
	void vmethod3254(Buffer var1) {
		this.field1568 = var1.readUnsignedShort(); // L: 166
		this.field1570 = var1.readInt(); // L: 167
		this.field1569 = var1.readUnsignedByte(); // L: 168
		this.field1571 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "-110"
	)
	void vmethod3248(ClanSettings var1) {
		var1.method3088(this.field1568, this.field1570, this.field1569, this.field1571); // L: 173
	} // L: 174

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ldb;FB)F",
		garbageValue = "-55"
	)
	static float method2966(class124 var0, float var1) {
		if (var0 != null && var0.method2880() != 0) { // L: 18
			if (var1 < (float)var0.field1493[0].field1441) { // L: 21
				return var0.field1490 == class123.field1470 ? var0.field1493[0].field1438 : class404.method7600(var0, var1, true); // L: 22 23 25
			} else if (var1 > (float)var0.field1493[var0.method2880() - 1].field1441) { // L: 27
				return var0.field1489 == class123.field1470 ? var0.field1493[var0.method2880() - 1].field1438 : class404.method7600(var0, var1, false); // L: 28 29 31
			} else if (var0.field1480) { // L: 33
				return var0.field1493[0].field1438; // L: 34
			} else {
				class120 var2 = var0.method2879(var1); // L: 36
				boolean var3 = false; // L: 37
				boolean var4 = false; // L: 38
				if (var2 == null) { // L: 39
					return 0.0F; // L: 163
				} else {
					if ((double)var2.field1442 == 0.0D && 0.0D == (double)var2.field1443) { // L: 40
						var3 = true; // L: 41
					} else if (Float.MAX_VALUE == var2.field1442 && Float.MAX_VALUE == var2.field1443) { // L: 43
						var4 = true; // L: 44
					} else if (var2.field1444 != null) { // L: 46
						if (var0.field1483) { // L: 47
							float[] var5 = new float[4]; // L: 48
							float[] var6 = new float[4]; // L: 49
							var5[0] = (float)var2.field1441; // L: 50
							var6[0] = var2.field1438; // L: 51
							var5[1] = var5[0] + 0.33333334F * var2.field1442; // L: 52
							var6[1] = 0.33333334F * var2.field1443 + var6[0]; // L: 53
							var5[3] = (float)var2.field1444.field1441; // L: 54
							var6[3] = var2.field1444.field1438; // L: 55
							var5[2] = var5[3] - var2.field1444.field1440 * 0.33333334F; // L: 56
							var6[2] = var6[3] - var2.field1444.field1439 * 0.33333334F; // L: 57
							if (var0.field1481) { // L: 58
								if (var0 != null) { // L: 60
									float var7 = var5[3] - var5[0]; // L: 63
									if ((double)var7 != 0.0D) { // L: 64
										float var8 = var5[1] - var5[0]; // L: 67
										float var9 = var5[2] - var5[0]; // L: 68
										Float var10 = var8 / var7; // L: 69
										Float var11 = var9 / var7; // L: 70
										var0.field1484 = var10 == 0.33333334F && var11 == 0.6666667F; // L: 71
										float var12 = var10; // L: 72
										float var13 = var11; // L: 73
										if ((double)var10 < 0.0D) { // L: 74
											var10 = 0.0F;
										}

										if ((double)var11 > 1.0D) { // L: 75
											var11 = 1.0F;
										}

										if ((double)var10 > 1.0D || var11 < -1.0F) { // L: 76
											Float var14 = var10; // L: 77
											Float var15 = 1.0F - var11; // L: 80
											if (var10 < 0.0F) { // L: 81
												var14 = 0.0F;
											}

											if (var15 < 0.0F) { // L: 82
												var15 = 0.0F;
											}

											if (var14 > 1.0F || var15 > 1.0F) { // L: 83
												float var16 = (float)((double)(var14 * (var14 - 2.0F + var15)) + (double)var15 * ((double)var15 - 2.0D) + 1.0D); // L: 84
												if (class121.field1454 + var16 > 0.0F) { // L: 85
													WorldMapEvent.method5310(var14, var15); // L: 86
												}
											}

											var15 = 1.0F - var15; // L: 89
										}

										if (var10 != var12) { // L: 92
											var5[1] = var5[0] + var10 * var7; // L: 93
											if (0.0D != (double)var12) { // L: 94
												var6[1] = var6[0] + (var6[1] - var6[0]) * var10 / var12; // L: 95
											}
										}

										if (var11 != var13) { // L: 98
											var5[2] = var5[0] + var11 * var7; // L: 99
											if ((double)var13 != 1.0D) { // L: 100
												var6[2] = (float)((double)var6[3] - (double)(var6[3] - var6[2]) * (1.0D - (double)var11) / (1.0D - (double)var13)); // L: 101
											}
										}

										var0.field1485 = var5[0]; // L: 104
										var0.field1486 = var5[3]; // L: 105
										float var26 = var10; // L: 106
										float var27 = var11; // L: 107
										float[] var28 = var0.field1487; // L: 108
										float var17 = var26 - 0.0F; // L: 110
										float var18 = var27 - var26; // L: 111
										float var19 = 1.0F - var27; // L: 112
										float var20 = var18 - var17; // L: 113
										var28[3] = var19 - var18 - var20; // L: 114
										var28[2] = var20 + var20 + var20; // L: 115
										var28[1] = var17 + var17 + var17; // L: 116
										var28[0] = 0.0F; // L: 117
										var17 = var6[0]; // L: 119
										var18 = var6[1]; // L: 120
										var19 = var6[2]; // L: 121
										var20 = var6[3]; // L: 122
										float[] var21 = var0.field1488; // L: 123
										float var22 = var18 - var17; // L: 125
										float var23 = var19 - var18; // L: 126
										float var24 = var20 - var19; // L: 127
										float var25 = var23 - var22; // L: 128
										var21[3] = var24 - var23 - var25; // L: 129
										var21[2] = var25 + var25 + var25; // L: 130
										var21[1] = var22 + var22 + var22; // L: 131
										var21[0] = var17; // L: 132
									}
								}
							} else {
								class150.method3171(var0, var5, var6); // L: 137
							}

							var0.field1483 = false; // L: 139
						}
					} else {
						var3 = true; // L: 143
					}

					if (var3) { // L: 145
						return var2.field1438; // L: 146
					} else if (var4) { // L: 148
						return (float)var2.field1441 != var1 && var2.field1444 != null ? var2.field1444.field1438 : var2.field1438; // L: 149 150 153
					} else {
						return var0.field1481 ? Interpreter.method1891(var0, var1) : WorldMapDecoration.method5149(var0, var1); // L: 156 157 160
					}
				}
			}
		} else {
			return 0.0F; // L: 19
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-1954783269"
	)
	static Date method2964() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1019
		var0.set(2, 0); // L: 1020
		var0.set(5, 1); // L: 1021
		var0.set(1, 1900); // L: 1022
		return var0.getTime(); // L: 1023
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-558415644"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5540
		int var4 = var1 >> 7; // L: 5541
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5542
			int var5 = var2; // L: 5543
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5544
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5545
			int var7 = var1 & 127; // L: 5546
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7; // L: 5547
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7; // L: 5548
			return var8 * (128 - var7) + var9 * var7 >> 7; // L: 5549
		} else {
			return 0;
		}
	}
}
