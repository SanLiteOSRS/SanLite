import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1250509033
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -714916873
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -961502115
	)
	@Export("y")
	int y;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1006789137
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("wallObject")
	WallObject wallObject;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("decorativeObject")
	DecorativeObject decorativeObject;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("groundObject")
	GroundObject groundObject;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1884419007
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lla;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("aj")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1588374161
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1842825159
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("an")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ag")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("am")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 707406203
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -556659883
	)
	int field2811;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -342018933
	)
	int field2794;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -685978953
	)
	int field2813;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5]; // L: 17
		this.gameObjectEdgeMasks = new int[5]; // L: 18
		this.gameObjectsEdgeMask = 0; // L: 19
		this.originalPlane = this.plane = var1;
		this.x = var2; // L: 32
		this.y = var3;
	} // L: 34

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FB)F",
		garbageValue = "2"
	)
	static float method5276(class132 var0, float var1) {
		if (var0 != null && var0.method3091() != 0) { // L: 20
			if (var1 < (float)var0.field1559[0].field1501) { // L: 23
				return var0.field1557 == class130.field1548 ? var0.field1559[0].field1500 : class297.method5965(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1559[var0.method3091() - 1].field1501) { // L: 29
				return var0.field1574 == class130.field1548 ? var0.field1559[var0.method3091() - 1].field1500 : class297.method5965(var0, var1, false); // L: 30 31 33
			} else if (var0.field1555) { // L: 35
				return var0.field1559[0].field1500; // L: 36
			} else {
				class127 var2 = var0.method3090(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) { // L: 41
					return 0.0F; // L: 208
				} else {
					float var5;
					float var6;
					float var7;
					if ((double)var2.field1499 == 0.0D && 0.0D == (double)var2.field1506) { // L: 42
						var3 = true; // L: 43
					} else if (Float.MAX_VALUE == var2.field1499 && Float.MAX_VALUE == var2.field1506) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1505 != null) { // L: 48
						if (var0.field1571) { // L: 49
							var5 = (float)var2.field1501; // L: 58
							float var9 = var2.field1500; // L: 59
							var6 = var2.field1499 * 0.33333334F + var5; // L: 60
							float var10 = var2.field1506 * 0.33333334F + var9; // L: 61
							float var8 = (float)var2.field1505.field1501; // L: 62
							float var12 = var2.field1505.field1500; // L: 63
							var7 = var8 - var2.field1505.field1503 * 0.33333334F; // L: 64
							float var11 = var12 - var2.field1505.field1502 * 0.33333334F; // L: 65
							if (var0.field1565) { // L: 66
								float var15 = var10; // L: 69
								float var16 = var11; // L: 70
								if (var0 != null) { // L: 72
									float var17 = var8 - var5; // L: 75
									if ((double)var17 != 0.0D) { // L: 76
										float var18 = var6 - var5; // L: 79
										float var19 = var7 - var5; // L: 80
										float[] var20 = new float[]{var18 / var17, var19 / var17}; // L: 81 82 83
										var0.field1560 = 0.33333334F == var20[0] && 0.6666667F == var20[1]; // L: 84
										float var21 = var20[0]; // L: 85
										float var22 = var20[1]; // L: 86
										if ((double)var20[0] < 0.0D) { // L: 87
											var20[0] = 0.0F;
										}

										if ((double)var20[1] > 1.0D) { // L: 88
											var20[1] = 1.0F;
										}

										if ((double)var20[0] > 1.0D || var20[1] < -1.0F) { // L: 89
											var20[1] = 1.0F - var20[1]; // L: 91
											if (var20[0] < 0.0F) { // L: 92
												var20[0] = 0.0F;
											}

											if (var20[1] < 0.0F) { // L: 93
												var20[1] = 0.0F;
											}

											if (var20[0] > 1.0F || var20[1] > 1.0F) { // L: 94
												float var23 = (float)((double)var20[1] * ((double)var20[1] - 2.0D) + (double)((var20[0] - 2.0F + var20[1]) * var20[0]) + 1.0D); // L: 95
												if (class128.field1512 + var23 > 0.0F) { // L: 96
													if (var20[0] + class128.field1512 < 1.3333334F) { // L: 98
														float var24 = var20[0] - 2.0F; // L: 99
														float var25 = var20[0] - 1.0F; // L: 100
														float var26 = (float)Math.sqrt((double)(var24 * var24 - var25 * var25 * 4.0F)); // L: 101
														float var27 = (var26 + -var24) * 0.5F; // L: 102
														if (class128.field1512 + var20[1] > var27) { // L: 103
															var20[1] = var27 - class128.field1512; // L: 104
														} else {
															var27 = (-var24 - var26) * 0.5F; // L: 107
															if (var20[1] < var27 + class128.field1512) { // L: 108
																var20[1] = class128.field1512 + var27; // L: 109
															}
														}
													} else {
														var20[0] = 1.3333334F - class128.field1512; // L: 114
														var20[1] = 0.33333334F - class128.field1512; // L: 115
													}
												}
											}

											var20[1] = 1.0F - var20[1]; // L: 120
										}

										if (var21 != var20[0]) { // L: 123
											float var13 = var17 * var20[0] + var5; // L: 124
											if (0.0D != (double)var21) { // L: 125
												var15 = var9 + var20[0] * (var10 - var9) / var21; // L: 126
											}
										}

										if (var22 != var20[1]) { // L: 129
											float var14 = var20[1] * var17 + var5; // L: 130
											if ((double)var22 != 1.0D) { // L: 131
												var16 = (float)((double)var12 - (double)(var12 - var11) * (1.0D - (double)var20[1]) / (1.0D - (double)var22)); // L: 132
											}
										}

										var0.field1561 = var5; // L: 135
										var0.field1556 = var8; // L: 136
										class9.method67(0.0F, var20[0], var20[1], 1.0F, var0); // L: 137
										class93.method2443(var9, var15, var16, var12, var0); // L: 138
									}
								}
							} else {
								class143.method3208(var0, var5, var6, var7, var8, var9, var10, var11, var12); // L: 142
							}

							var0.field1571 = false; // L: 144
						}
					} else {
						var3 = true; // L: 148
					}

					if (var3) { // L: 150
						return var2.field1500; // L: 151
					} else if (var4) { // L: 153
						return (float)var2.field1501 != var1 && var2.field1505 != null ? var2.field1505.field1500 : var2.field1500; // L: 154 155 158
					} else if (var0.field1565) { // L: 161
						if (var0 == null) { // L: 164
							var5 = 0.0F; // L: 165
						} else {
							if (var0.field1561 == var1) { // L: 169
								var6 = 0.0F; // L: 170
							} else if (var1 == var0.field1556) { // L: 172
								var6 = 1.0F; // L: 173
							} else {
								var6 = (var1 - var0.field1561) / (var0.field1556 - var0.field1561); // L: 176
							}

							if (var0.field1560) { // L: 179
								var7 = var6; // L: 180
							} else {
								class128.field1511[3] = var0.field1566; // L: 183
								class128.field1511[2] = var0.field1562; // L: 184
								class128.field1511[1] = var0.field1564; // L: 185
								class128.field1511[0] = var0.field1563 - var6; // L: 186
								class128.field1510[0] = 0.0F; // L: 187
								class128.field1510[1] = 0.0F; // L: 188
								class128.field1510[2] = 0.0F; // L: 189
								class128.field1510[3] = 0.0F; // L: 190
								class128.field1510[4] = 0.0F; // L: 191
								int var28 = class148.method3244(class128.field1511, 3, 0.0F, true, 1.0F, true, class128.field1510); // L: 192
								if (var28 == 1) { // L: 193
									var7 = class128.field1510[0]; // L: 194
								} else {
									var7 = 0.0F; // L: 197
								}
							}

							var5 = var0.field1567 + var7 * (var0.field1569 + var7 * (var0.field1573 + var0.field1570 * var7)); // L: 200
						}

						return var5; // L: 202
					} else {
						return ArchiveLoader.method2325(var0, var1); // L: 205
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}
}
