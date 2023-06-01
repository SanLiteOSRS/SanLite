import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("World")
public class World {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1336557459
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1445618927
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("aj")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ac")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1375981415
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -318959193
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 553732239
	)
	@Export("population")
	int population;
	@ObfuscatedName("ah")
	@Export("host")
	String host;
	@ObfuscatedName("ap")
	@Export("activity")
	String activity;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 373379099
	)
	@Export("location")
	int location;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1480549353
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-480632127"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 257
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1254167677"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (65536 & this.properties) != 0; // L: 261
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "32376"
	)
	boolean method1773() {
		return (2 & this.properties) != 0; // L: 265
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-476187612"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 269
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-267801086"
	)
	boolean method1809() {
		return (8 & this.properties) != 0; // L: 273
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1724740497"
	)
	boolean method1776() {
		return (536870912 & this.properties) != 0; // L: 277
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1434156893"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 281
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "789296600"
	)
	boolean method1778() {
		return (1073741824 & this.properties) != 0; // L: 285
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method1775() {
		return (256 & this.properties) != 0; // L: 289
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "24"
	)
	boolean method1814() {
		return (134217728 & this.properties) != 0; // L: 293
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ler;FB)F",
		garbageValue = "30"
	)
	static float method1794(class129 var0, float var1) {
		if (var0 != null && var0.method2970() != 0) { // L: 20
			if (var1 < (float)var0.field1509[0].field1454) { // L: 23
				return var0.field1507 == class127.field1492 ? var0.field1509[0].field1457 : class157.method3279(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1509[var0.method2970() - 1].field1454) { // L: 29
				return var0.field1508 == class127.field1492 ? var0.field1509[var0.method2970() - 1].field1457 : class157.method3279(var0, var1, false); // L: 30 31 33
			} else if (var0.field1506) { // L: 35
				return var0.field1509[0].field1457; // L: 36
			} else {
				class124 var2 = var0.method2969(var1); // L: 38
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) { // L: 41
					return 0.0F; // L: 186
				} else {
					float var5;
					float var6;
					float var7;
					if (0.0D == (double)var2.field1460 && 0.0D == (double)var2.field1459) { // L: 42
						var3 = true; // L: 43
					} else if (Float.MAX_VALUE == var2.field1460 && var2.field1459 == Float.MAX_VALUE) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1455 != null) { // L: 48
						if (var0.field1520) { // L: 49
							var5 = (float)var2.field1454; // L: 58
							float var9 = var2.field1457; // L: 59
							var6 = var5 + 0.33333334F * var2.field1460; // L: 60
							float var10 = 0.33333334F * var2.field1459 + var9; // L: 61
							float var8 = (float)var2.field1455.field1454;
							float var12 = var2.field1455.field1457;
							var7 = var8 - 0.33333334F * var2.field1455.field1458;
							float var11 = var12 - var2.field1455.field1456 * 0.33333334F;
							if (var0.field1517) {
								float var15 = var10;
								float var16 = var11;
								if (var0 != null) { // L: 72
									float var17 = var8 - var5;
									if (0.0D != (double)var17) { // L: 76
										float var18 = var6 - var5; // L: 79
										float var19 = var7 - var5; // L: 80
										float[] var20 = new float[]{var18 / var17, var19 / var17}; // L: 81 82 83
										var0.field1510 = 0.33333334F == var20[0] && 0.6666667F == var20[1]; // L: 84
										float var21 = var20[0]; // L: 85
										float var22 = var20[1]; // L: 86
										if ((double)var20[0] < 0.0D) {
											var20[0] = 0.0F;
										}

										if ((double)var20[1] > 1.0D) {
											var20[1] = 1.0F;
										}

										if ((double)var20[0] > 1.0D || var20[1] < -1.0F) {
											ClanSettings.method3251(var20);
										}

										if (var21 != var20[0]) { // L: 92
											float var10000 = var5 + var17 * var20[0];
											if ((double)var21 != 0.0D) { // L: 94
												var15 = var20[0] * (var10 - var9) / var21 + var9;
											}
										}

										if (var20[1] != var22) {
											float var14 = var17 * var20[1] + var5; // L: 99
											if ((double)var22 != 1.0D) { // L: 100
												var16 = (float)((double)var12 - (double)(var12 - var11) * (1.0D - (double)var20[1]) / (1.0D - (double)var22)); // L: 101
											}
										}

										var0.field1511 = var5; // L: 104
										var0.field1512 = var8; // L: 105
										class386.method7204(0.0F, var20[0], var20[1], 1.0F, var0); // L: 106
										float var23 = var15 - var9; // L: 108
										float var24 = var16 - var15; // L: 109
										float var25 = var12 - var16; // L: 110
										float var26 = var24 - var23; // L: 111
										var0.field1513 = var25 - var24 - var26; // L: 112
										var0.field1519 = var26 + var26 + var26; // L: 113
										var0.field1518 = var23 + var23 + var23; // L: 114
										var0.field1521 = var9; // L: 115
									}
								}
							} else {
								HealthBarUpdate.method2387(var0, var5, var6, var7, var8, var9, var10, var11, var12); // L: 120
							}

							var0.field1520 = false; // L: 122
						}
					} else {
						var3 = true; // L: 126
					}

					if (var3) { // L: 128
						return var2.field1457; // L: 129
					} else if (var4) { // L: 131
						return (float)var2.field1454 != var1 && var2.field1455 != null ? var2.field1455.field1457 : var2.field1457; // L: 132 133 136
					} else if (var0.field1517) { // L: 139
						if (var0 == null) { // L: 142
							var5 = 0.0F; // L: 143
						} else {
							if (var1 == var0.field1511) { // L: 147
								var6 = 0.0F; // L: 148
							} else if (var0.field1512 == var1) { // L: 150
								var6 = 1.0F; // L: 151
							} else {
								var6 = (var1 - var0.field1511) / (var0.field1512 - var0.field1511); // L: 154
							}

							if (var0.field1510) { // L: 157
								var7 = var6; // L: 158
							} else {
								class125.field1473[3] = var0.field1516; // L: 161
								class125.field1473[2] = var0.field1515; // L: 162
								class125.field1473[1] = var0.field1514; // L: 163
								class125.field1473[0] = var0.field1526 - var6; // L: 164
								class125.field1471[0] = 0.0F; // L: 165
								class125.field1471[1] = 0.0F; // L: 166
								class125.field1471[2] = 0.0F; // L: 167
								class125.field1471[3] = 0.0F; // L: 168
								class125.field1471[4] = 0.0F; // L: 169
								int var27 = class226.method4430(class125.field1473, 3, 0.0F, true, 1.0F, true, class125.field1471); // L: 170
								if (var27 == 1) { // L: 171
									var7 = class125.field1471[0]; // L: 172
								} else {
									var7 = 0.0F; // L: 175
								}
							}

							var5 = var0.field1521 + var7 * (var0.field1518 + (var7 * var0.field1513 + var0.field1519) * var7); // L: 178
						}

						return var5; // L: 180
					} else {
						return ApproximateRouteStrategy.method1194(var0, var1); // L: 183
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "0"
	)
	static String method1827(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 62

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 63
			int var5 = var0[var4] & 255; // L: 64
			var3.append(class383.field4408[var5 >>> 2]); // L: 65
			if (var4 < var2 - 1) { // L: 66
				int var6 = var0[var4 + 1] & 255; // L: 67
				var3.append(class383.field4408[(var5 & 3) << 4 | var6 >>> 4]); // L: 68
				if (var4 < var2 - 2) { // L: 69
					int var7 = var0[var4 + 2] & 255; // L: 70
					var3.append(class383.field4408[(var6 & 15) << 2 | var7 >>> 6]).append(class383.field4408[var7 & 63]); // L: 71
				} else {
					var3.append(class383.field4408[(var6 & 15) << 2]).append("="); // L: 73
				}
			} else {
				var3.append(class383.field4408[(var5 & 3) << 4]).append("=="); // L: 75
			}
		}

		return var3.toString(); // L: 77
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnv;IB)V",
		garbageValue = "107"
	)
	public static void method1826(Archive var0, int var1) {
		Huffman.field3767.offset = var1 * 8 + 5; // L: 87
		if (Huffman.field3767.offset >= Huffman.field3767.array.length) { // L: 88
			if (var0.field4250) { // L: 89
				var0.method6680(); // L: 90
			} else {
				throw new RuntimeException(""); // L: 93
			}
		} else {
			int var2 = Huffman.field3767.readInt(); // L: 95
			int var3 = Huffman.field3767.readInt(); // L: 96
			var0.loadIndex(var2, var3); // L: 97
		}
	} // L: 91 98

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Lco;",
		garbageValue = "-1315866484"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 39
		return var2.getMessage(var1); // L: 40
	}
}
