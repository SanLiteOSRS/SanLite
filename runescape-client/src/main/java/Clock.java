import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1677705643"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "929339531"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfp;FI)F",
		garbageValue = "1021716951"
	)
	static float method3657(class130 var0, float var1) {
		if (var0 != null && var0.method3085() != 0) { // L: 20
			if (var1 < (float)var0.field1534[0].field1489) { // L: 23
				return var0.field1532 == class128.field1516 ? var0.field1534[0].field1485 : class92.method2405(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1534[var0.method3085() - 1].field1489) { // L: 29
				return var0.field1544 == class128.field1516 ? var0.field1534[var0.method3085() - 1].field1485 : class92.method2405(var0, var1, false); // L: 30 31 33
			} else if (var0.field1542) { // L: 35
				return var0.field1534[0].field1485; // L: 36
			} else {
				class125 var2 = var0.method3064(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) { // L: 41
					return 0.0F; // L: 210
				} else {
					float var5;
					float var6;
					float var7;
					if ((double)var2.field1482 == 0.0D && (double)var2.field1486 == 0.0D) { // L: 42
						var3 = true; // L: 43
					} else if (Float.MAX_VALUE == var2.field1482 && Float.MAX_VALUE == var2.field1486) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1488 != null) { // L: 48
						if (var0.field1546) { // L: 49
							var5 = (float)var2.field1489;
							float var9 = var2.field1485;
							var6 = var2.field1482 * 0.33333334F + var5;
							float var10 = var9 + 0.33333334F * var2.field1486;
							float var8 = (float)var2.field1488.field1489;
							float var12 = var2.field1488.field1485;
							var7 = var8 - var2.field1488.field1484 * 0.33333334F;
							float var11 = var12 - 0.33333334F * var2.field1488.field1487;
							float var14;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1531) {
								var15 = var10;
								var16 = var11; // L: 70
								if (var0 != null) { // L: 72
									var17 = var8 - var5; // L: 75
									if (0.0D != (double)var17) { // L: 76
										var18 = var6 - var5; // L: 79
										var19 = var7 - var5; // L: 80
										float[] var27 = new float[]{var18 / var17, var19 / var17}; // L: 81 82 83
										var0.field1535 = 0.33333334F == var27[0] && 0.6666667F == var27[1]; // L: 84
										float var21 = var27[0]; // L: 85
										float var22 = var27[1]; // L: 86
										if ((double)var27[0] < 0.0D) { // L: 87
											var27[0] = 0.0F;
										}

										if ((double)var27[1] > 1.0D) { // L: 88
											var27[1] = 1.0F;
										}

										if ((double)var27[0] > 1.0D || var27[1] < -1.0F) { // L: 89
											class93.method2408(var27); // L: 90
										}

										if (var21 != var27[0]) { // L: 92
											float var10000 = var5 + var27[0] * var17; // L: 93
											if (0.0D != (double)var21) { // L: 94
												var15 = var27[0] * (var10 - var9) / var21 + var9; // L: 95
											}
										}

										if (var27[1] != var22) { // L: 98
											var14 = var17 * var27[1] + var5; // L: 99
											if (1.0D != (double)var22) { // L: 100
												var16 = (float)((double)var12 - (1.0D - (double)var27[1]) * (double)(var12 - var11) / (1.0D - (double)var22)); // L: 101
											}
										}

										var0.field1536 = var5; // L: 104
										var0.field1537 = var8; // L: 105
										PacketWriter.method2869(0.0F, var27[0], var27[1], 1.0F, var0); // L: 106
										float var23 = var15 - var9; // L: 108
										float var24 = var16 - var15; // L: 109
										float var25 = var12 - var16; // L: 110
										float var26 = var24 - var23; // L: 111
										var0.field1533 = var25 - var24 - var26; // L: 112
										var0.field1530 = var26 + var26 + var26; // L: 113
										var0.field1543 = var23 + var23 + var23; // L: 114
										var0.field1545 = var9; // L: 115
									}
								}
							} else if (var0 != null) { // L: 121
								var0.field1536 = var5; // L: 124
								float var13 = var8 - var5; // L: 125
								var14 = var12 - var9; // L: 126
								var15 = var6 - var5; // L: 127
								var16 = 0.0F; // L: 128
								var17 = 0.0F; // L: 129
								if (0.0D != (double)var15) { // L: 130
									var16 = (var10 - var9) / var15; // L: 131
								}

								var15 = var8 - var7; // L: 133
								if (0.0D != (double)var15) { // L: 134
									var17 = (var12 - var11) / var15; // L: 135
								}

								var18 = 1.0F / (var13 * var13); // L: 137
								var19 = var13 * var16;
								float var20 = var13 * var17; // L: 139
								var0.field1538 = (var19 + var20 - var14 - var14) * var18 / var13; // L: 140
								var0.field1549 = var18 * (var14 + var14 + var14 - var19 - var19 - var20); // L: 141
								var0.field1540 = var16; // L: 142
								var0.field1541 = var9; // L: 143
							}

							var0.field1546 = false; // L: 146
						}
					} else {
						var3 = true; // L: 150
					}

					if (var3) { // L: 152
						return var2.field1485; // L: 153
					} else if (var4) { // L: 155
						return var1 != (float)var2.field1489 && var2.field1488 != null ? var2.field1488.field1485 : var2.field1485; // L: 156 157 160
					} else if (var0.field1531) { // L: 163
						if (var0 == null) { // L: 166
							var5 = 0.0F; // L: 167
						} else {
							if (var0.field1536 == var1) { // L: 171
								var6 = 0.0F; // L: 172
							} else if (var0.field1537 == var1) { // L: 174
								var6 = 1.0F; // L: 175
							} else {
								var6 = (var1 - var0.field1536) / (var0.field1537 - var0.field1536); // L: 178
							}

							if (var0.field1535) { // L: 181
								var7 = var6; // L: 182
							} else {
								class126.field1492[3] = var0.field1541; // L: 185
								class126.field1492[2] = var0.field1540; // L: 186
								class126.field1492[1] = var0.field1549; // L: 187
								class126.field1492[0] = var0.field1538 - var6; // L: 188
								class126.field1491[0] = 0.0F; // L: 189
								class126.field1491[1] = 0.0F; // L: 190
								class126.field1491[2] = 0.0F; // L: 191
								class126.field1491[3] = 0.0F; // L: 192
								class126.field1491[4] = 0.0F; // L: 193
								int var28 = class383.method7205(class126.field1492, 3, 0.0F, true, 1.0F, true, class126.field1491); // L: 194
								if (var28 == 1) { // L: 195
									var7 = class126.field1491[0]; // L: 196
								} else {
									var7 = 0.0F; // L: 199
								}
							}

							var5 = var0.field1545 + var7 * ((var0.field1530 + var0.field1533 * var7) * var7 + var0.field1543); // L: 202
						}

						return var5; // L: 204
					} else {
						return class159.method3383(var0, var1); // L: 207
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1566233867"
	)
	public static String method3656(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 58

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 59
			int var5 = var0[var4] & 255; // L: 60
			var3.append(class385.field4413[var5 >>> 2]); // L: 61
			if (var4 < var2 - 1) { // L: 62
				int var6 = var0[var4 + 1] & 255; // L: 63
				var3.append(class385.field4413[(var5 & 3) << 4 | var6 >>> 4]); // L: 64
				if (var4 < var2 - 2) { // L: 65
					int var7 = var0[var4 + 2] & 255; // L: 66
					var3.append(class385.field4413[(var6 & 15) << 2 | var7 >>> 6]).append(class385.field4413[var7 & 63]); // L: 67
				} else {
					var3.append(class385.field4413[(var6 & 15) << 2]).append("="); // L: 69
				}
			} else {
				var3.append(class385.field4413[(var5 & 3) << 4]).append("=="); // L: 71
			}
		}

		return var3.toString(); // L: 73
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "94909611"
	)
	protected static final int method3649() {
		return GameEngine.field210.method369(); // L: 138
	}
}
