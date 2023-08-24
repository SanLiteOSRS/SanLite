import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 759892495
	)
	@Export("id")
	int id;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 766318001
	)
	@Export("count")
	int count;
	@ObfuscatedName("ap")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("aa")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	class227 field2560;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2560 = new class227(var3, var4); // L: 32
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "657439907"
	)
	public int method4520() {
		return this.count;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lim;",
		garbageValue = "-896390577"
	)
	public class227 method4517() {
		return this.field2560;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lfh;FB)F",
		garbageValue = "0"
	)
	static float method4516(class130 var0, float var1) {
		if (var0 != null && var0.method3000() != 0) { // L: 20
			if (var1 < (float)var0.field1551[0].field1492) { // L: 23
				return var0.field1549 == class128.field1530 ? var0.field1551[0].field1495 : UserComparator4.method2864(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1551[var0.method3000() - 1].field1492) { // L: 29
				return var0.field1571 == class128.field1530 ? var0.field1551[var0.method3000() - 1].field1495 : UserComparator4.method2864(var0, var1, false); // L: 30 31 33
			} else if (var0.field1548) { // L: 35
				return var0.field1551[0].field1495; // L: 36
			} else {
				class125 var2 = var0.method2999(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) { // L: 41
					return 0.0F; // L: 190
				} else {
					float var5;
					float var6;
					if (0.0D == (double)var2.field1496 && (double)var2.field1497 == 0.0D) { // L: 42
						var3 = true; // L: 43
					} else if (Float.MAX_VALUE == var2.field1496 && Float.MAX_VALUE == var2.field1497) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1498 != null) { // L: 48
						if (var0.field1564) { // L: 49
							var5 = (float)var2.field1492; // L: 58
							float var9 = var2.field1495; // L: 59
							var6 = 0.33333334F * var2.field1496 + var5; // L: 60
							float var10 = var2.field1497 * 0.33333334F + var9; // L: 61
							float var8 = (float)var2.field1498.field1492; // L: 62
							float var12 = var2.field1498.field1495; // L: 63
							float var7 = var8 - var2.field1498.field1503 * 0.33333334F; // L: 64
							float var11 = var12 - var2.field1498.field1493 * 0.33333334F; // L: 65
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1563) { // L: 66
								var15 = var10; // L: 69
								var16 = var11; // L: 70
								if (var0 != null) { // L: 72
									var17 = var8 - var5; // L: 75
									if ((double)var17 != 0.0D) { // L: 76
										var18 = var6 - var5; // L: 79
										var19 = var7 - var5; // L: 80
										float[] var29 = new float[]{var18 / var17, var19 / var17}; // L: 81 82 83
										var0.field1550 = 0.33333334F == var29[0] && var29[1] == 0.6666667F; // L: 84
										float var21 = var29[0]; // L: 85
										float var22 = var29[1]; // L: 86
										if ((double)var29[0] < 0.0D) { // L: 87
											var29[0] = 0.0F;
										}

										if ((double)var29[1] > 1.0D) { // L: 88
											var29[1] = 1.0F;
										}

										if ((double)var29[0] > 1.0D || var29[1] < -1.0F) { // L: 89
											class160.method3282(var29); // L: 90
										}

										float var10000;
										if (var29[0] != var21) { // L: 92
											var10000 = var5 + var17 * var29[0]; // L: 93
											if (0.0D != (double)var21) { // L: 94
												var15 = (var10 - var9) * var29[0] / var21 + var9; // L: 95
											}
										}

										if (var22 != var29[1]) { // L: 98
											var10000 = var5 + var17 * var29[1]; // L: 99
											if (1.0D != (double)var22) { // L: 100
												var16 = (float)((double)var12 - (1.0D - (double)var29[1]) * (double)(var12 - var11) / (1.0D - (double)var22)); // L: 101
											}
										}

										var0.field1553 = var5; // L: 104
										var0.field1554 = var8; // L: 105
										float var23 = var29[0]; // L: 106
										float var24 = var29[1]; // L: 107
										float var25 = var23 - 0.0F; // L: 109
										float var26 = var24 - var23; // L: 110
										float var27 = 1.0F - var24; // L: 111
										float var28 = var26 - var25; // L: 112
										var0.field1552 = var27 - var26 - var28; // L: 113
										var0.field1557 = var28 + var28 + var28; // L: 114
										var0.field1556 = var25 + var25 + var25; // L: 115
										var0.field1555 = 0.0F; // L: 116
										var25 = var15 - var9; // L: 119
										var26 = var16 - var15; // L: 120
										var27 = var12 - var16; // L: 121
										var28 = var26 - var25; // L: 122
										var0.field1547 = var27 - var26 - var28; // L: 123
										var0.field1561 = var28 + var28 + var28; // L: 124
										var0.field1560 = var25 + var25 + var25; // L: 125
										var0.field1572 = var9; // L: 126
									}
								}
							} else if (var0 != null) { // L: 132
								var0.field1553 = var5; // L: 135
								float var13 = var8 - var5; // L: 136
								float var14 = var12 - var9; // L: 137
								var15 = var6 - var5; // L: 138
								var16 = 0.0F; // L: 139
								var17 = 0.0F; // L: 140
								if ((double)var15 != 0.0D) { // L: 141
									var16 = (var10 - var9) / var15; // L: 142
								}

								var15 = var8 - var7; // L: 144
								if ((double)var15 != 0.0D) { // L: 145
									var17 = (var12 - var11) / var15; // L: 146
								}

								var18 = 1.0F / (var13 * var13); // L: 148
								var19 = var16 * var13; // L: 149
								float var20 = var17 * var13; // L: 150
								var0.field1555 = var18 * (var19 + var20 - var14 - var14) / var13; // L: 151
								var0.field1556 = var18 * (var14 + var14 + var14 - var19 - var19 - var20); // L: 152
								var0.field1557 = var16; // L: 153
								var0.field1552 = var9; // L: 154
							}

							var0.field1564 = false; // L: 157
						}
					} else {
						var3 = true; // L: 161
					}

					if (var3) { // L: 163
						return var2.field1495; // L: 164
					} else if (var4) { // L: 166
						return (float)var2.field1492 != var1 && var2.field1498 != null ? var2.field1498.field1495 : var2.field1495; // L: 167 168 171
					} else if (var0.field1563) { // L: 174
						return class454.method8290(var0, var1); // L: 175
					} else {
						if (var0 == null) { // L: 180
							var5 = 0.0F; // L: 181
						} else {
							var6 = var1 - var0.field1553; // L: 184
							var5 = var0.field1552 + var6 * ((var6 * var0.field1555 + var0.field1556) * var6 + var0.field1557); // L: 185
						}

						return var5; // L: 187
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1406508387"
	)
	public static void method4523(int var0) {
		if (var0 != -1) { // L: 266
			if (class316.Widget_loadedInterfaces[var0]) { // L: 267
				Decimator.Widget_archive.clearFilesGroup(var0); // L: 268
				if (PacketBufferNode.Widget_interfaceComponents[var0] != null) { // L: 269
					for (int var1 = 0; var1 < PacketBufferNode.Widget_interfaceComponents[var0].length; ++var1) { // L: 270
						if (PacketBufferNode.Widget_interfaceComponents[var0][var1] != null) { // L: 271
							PacketBufferNode.Widget_interfaceComponents[var0][var1] = null; // L: 272
						}
					}

					PacketBufferNode.Widget_interfaceComponents[var0] = null; // L: 275
					class316.Widget_loadedInterfaces[var0] = false; // L: 276
				}
			}
		}
	} // L: 277
}
