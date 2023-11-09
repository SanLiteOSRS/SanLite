import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class130 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class130 field1534;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class130 field1529;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class130 field1530;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class130 field1531;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class130 field1532;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class130 field1533;
	@ObfuscatedName("jg")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -681546351
	)
	final int field1538;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -419437913
	)
	final int field1535;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1959675603
	)
	final int field1536;

	static {
		field1534 = new class130(0, 0, (String)null, 0); // L: 14
		field1529 = new class130(1, 1, (String)null, 9); // L: 15
		field1530 = new class130(2, 2, (String)null, 3); // L: 16
		field1531 = new class130(3, 3, (String)null, 6); // L: 17
		field1532 = new class130(4, 4, (String)null, 1); // L: 18
		field1533 = new class130(5, 5, (String)null, 3); // L: 19
	}

	class130(int var1, int var2, String var3, int var4) {
		this.field1538 = var1;
		this.field1535 = var2;
		this.field1536 = var4;
	} // L: 32

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1535;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1244171306"
	)
	int method3003() {
		return this.field1536;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Leq;FB)F",
		garbageValue = "-5"
	)
	static float method3002(class129 var0, float var1) {
		if (var0 != null && var0.method2981() != 0) { // L: 20
			if (var1 < (float)var0.field1510[0].field1457) { // L: 23
				return var0.field1506 == class127.field1494 ? var0.field1510[0].field1455 : class72.method2050(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1510[var0.method2981() - 1].field1457) { // L: 29
				return var0.field1507 == class127.field1494 ? var0.field1510[var0.method2981() - 1].field1455 : class72.method2050(var0, var1, false); // L: 30 31 33
			} else if (var0.field1505) { // L: 35
				return var0.field1510[0].field1455; // L: 36
			} else {
				class124 var2 = var0.method2980(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) { // L: 41
					return 0.0F; // L: 206
				} else {
					float var5;
					float var6;
					float var7;
					if (0.0D == (double)var2.field1458 && (double)var2.field1459 == 0.0D) { // L: 42
						var3 = true; // L: 43
					} else if (Float.MAX_VALUE == var2.field1458 && var2.field1459 == Float.MAX_VALUE) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1460 != null) { // L: 48
						if (var0.field1520) { // L: 49
							var5 = (float)var2.field1457; // L: 58
							float var9 = var2.field1455; // L: 59
							var6 = var2.field1458 * 0.33333334F + var5; // L: 60
							float var10 = var9 + var2.field1459 * 0.33333334F; // L: 61
							float var8 = (float)var2.field1460.field1457; // L: 62
							float var12 = var2.field1460.field1455; // L: 63
							var7 = var8 - var2.field1460.field1456 * 0.33333334F; // L: 64
							float var11 = var12 - 0.33333334F * var2.field1460.field1461; // L: 65
							if (var0.field1516) { // L: 66
								float var15 = var10; // L: 69
								float var16 = var11; // L: 70
								if (var0 != null) { // L: 72
									float var17 = var8 - var5; // L: 75
									if (0.0D != (double)var17) { // L: 76
										float var18 = var6 - var5; // L: 79
										float var19 = var7 - var5; // L: 80
										float[] var20 = new float[]{var18 / var17, var19 / var17}; // L: 81 82 83
										var0.field1508 = 0.33333334F == var20[0] && 0.6666667F == var20[1]; // L: 84
										float var21 = var20[0]; // L: 85
										float var22 = var20[1]; // L: 86
										if ((double)var20[0] < 0.0D) { // L: 87
											var20[0] = 0.0F;
										}

										if ((double)var20[1] > 1.0D) { // L: 88
											var20[1] = 1.0F;
										}

										if ((double)var20[0] > 1.0D || var20[1] < -1.0F) { // L: 89
											SoundSystem.method815(var20); // L: 90
										}

										if (var20[0] != var21) { // L: 92
											float var10000 = var5 + var17 * var20[0]; // L: 93
											if ((double)var21 != 0.0D) { // L: 94
												var15 = var9 + (var10 - var9) * var20[0] / var21; // L: 95
											}
										}

										if (var22 != var20[1]) { // L: 98
											float var14 = var17 * var20[1] + var5; // L: 99
											if ((double)var22 != 1.0D) { // L: 100
												var16 = (float)((double)var12 - (double)(var12 - var11) * (1.0D - (double)var20[1]) / (1.0D - (double)var22)); // L: 101
											}
										}

										var0.field1519 = var5; // L: 104
										var0.field1511 = var8; // L: 105
										float var23 = var20[0]; // L: 106
										float var24 = var20[1]; // L: 107
										float var25 = var23 - 0.0F; // L: 109
										float var26 = var24 - var23; // L: 110
										float var27 = 1.0F - var24; // L: 111
										float var28 = var26 - var25; // L: 112
										var0.field1515 = var27 - var26 - var28; // L: 113
										var0.field1514 = var28 + var28 + var28; // L: 114
										var0.field1504 = var25 + var25 + var25; // L: 115
										var0.field1522 = 0.0F; // L: 116
										var25 = var15 - var9; // L: 119
										var26 = var16 - var15; // L: 120
										var27 = var12 - var16; // L: 121
										var28 = var26 - var25; // L: 122
										var0.field1527 = var27 - var26 - var28; // L: 123
										var0.field1518 = var28 + var28 + var28; // L: 124
										var0.field1512 = var25 + var25 + var25; // L: 125
										var0.field1509 = var9; // L: 126
									}
								}
							} else {
								class370.method6901(var0, var5, var6, var7, var8, var9, var10, var11, var12); // L: 131
							}

							var0.field1520 = false; // L: 133
						}
					} else {
						var3 = true; // L: 137
					}

					if (var3) { // L: 139
						return var2.field1455; // L: 140
					} else if (var4) { // L: 142
						return var1 != (float)var2.field1457 && var2.field1460 != null ? var2.field1460.field1455 : var2.field1455; // L: 143 144 147
					} else if (var0.field1516) { // L: 150
						if (var0 == null) { // L: 153
							var5 = 0.0F; // L: 154
						} else {
							if (var1 == var0.field1519) { // L: 158
								var6 = 0.0F; // L: 159
							} else if (var0.field1511 == var1) { // L: 161
								var6 = 1.0F; // L: 162
							} else {
								var6 = (var1 - var0.field1519) / (var0.field1511 - var0.field1519); // L: 165
							}

							if (var0.field1508) { // L: 168
								var7 = var6; // L: 169
							} else {
								class125.field1465[3] = var0.field1515; // L: 172
								class125.field1465[2] = var0.field1514; // L: 173
								class125.field1465[1] = var0.field1504; // L: 174
								class125.field1465[0] = var0.field1522 - var6; // L: 175
								class125.field1462[0] = 0.0F; // L: 176
								class125.field1462[1] = 0.0F; // L: 177
								class125.field1462[2] = 0.0F; // L: 178
								class125.field1462[3] = 0.0F; // L: 179
								class125.field1462[4] = 0.0F; // L: 180
								int var29 = class72.method2044(class125.field1465, 3, 0.0F, true, 1.0F, true, class125.field1462); // L: 181
								if (var29 == 1) { // L: 182
									var7 = class125.field1462[0]; // L: 183
								} else {
									var7 = 0.0F; // L: 186
								}
							}

							var5 = var0.field1509 + var7 * (var0.field1512 + var7 * (var7 * var0.field1527 + var0.field1518)); // L: 189
						}

						return var5; // L: 191
					} else {
						if (var0 == null) { // L: 196
							var5 = 0.0F; // L: 197
						} else {
							var6 = var1 - var0.field1519; // L: 200
							var5 = var6 * ((var0.field1504 + var6 * var0.field1522) * var6 + var0.field1514) + var0.field1515; // L: 201
						}

						return var5; // L: 203
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "109"
	)
	static int method3007(int var0, Script var1, boolean var2) {
		if (var0 == 7108) { // L: 5061
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class327.method6088() ? 1 : 0; // L: 5062
			return 1; // L: 5063
		} else {
			return 2; // L: 5065
		}
	}
}
