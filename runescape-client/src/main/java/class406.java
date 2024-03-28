import java.util.regex.Pattern;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@mq
@ObfuscatedName("pw")
public final class class406 {
	static {
		Pattern.compile("^\\D*(\\d+)\\D*$"); // L: 9
	} // L: 10

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FI)F",
		garbageValue = "888334248"
	)
	static float method7449(class131 var0, float var1) {
		if (var0 != null && var0.method3020() != 0) { // L: 20
			if (var1 < (float)var0.field1562[0].field1512) { // L: 23
				return var0.field1573 == class129.field1548 ? var0.field1562[0].field1516 : class185.method3680(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1562[var0.method3020() - 1].field1512) { // L: 29
				return var0.field1561 == class129.field1548 ? var0.field1562[var0.method3020() - 1].field1516 : class185.method3680(var0, var1, false); // L: 30 31 33
			} else if (var0.field1559) { // L: 35
				return var0.field1562[0].field1516; // L: 36
			} else {
				class126 var2 = var0.method3035(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) { // L: 41
					return 0.0F; // L: 201
				} else {
					if (0.0D == (double)var2.field1509 && (double)var2.field1514 == 0.0D) { // L: 42
						var3 = true; // L: 43
					} else if (var2.field1509 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field1514) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1515 != null) { // L: 48
						if (var0.field1574) { // L: 49
							float var5 = (float)var2.field1512; // L: 58
							float var9 = var2.field1516; // L: 59
							float var6 = 0.33333334F * var2.field1509 + var5; // L: 60
							float var10 = var2.field1514 * 0.33333334F + var9; // L: 61
							float var8 = (float)var2.field1515.field1512; // L: 62
							float var12 = var2.field1515.field1516; // L: 63
							float var7 = var8 - 0.33333334F * var2.field1515.field1511; // L: 64
							float var11 = var12 - var2.field1515.field1510 * 0.33333334F; // L: 65
							float var13;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1558) { // L: 66
								var15 = var10; // L: 69
								var16 = var11; // L: 70
								if (var0 != null) { // L: 72
									var17 = var8 - var5; // L: 75
									if ((double)var17 != 0.0D) { // L: 76
										var18 = var6 - var5; // L: 79
										var19 = var7 - var5; // L: 80
										float[] var28 = new float[]{var18 / var17, var19 / var17}; // L: 81 82 83
										var0.field1563 = 0.33333334F == var28[0] && var28[1] == 0.6666667F; // L: 84
										float var21 = var28[0]; // L: 85
										float var22 = var28[1]; // L: 86
										if ((double)var28[0] < 0.0D) { // L: 87
											var28[0] = 0.0F;
										}

										if ((double)var28[1] > 1.0D) { // L: 88
											var28[1] = 1.0F;
										}

										float var23;
										float var24;
										float var25;
										float var26;
										if ((double)var28[0] > 1.0D || var28[1] < -1.0F) { // L: 89
											var28[1] = 1.0F - var28[1]; // L: 91
											if (var28[0] < 0.0F) { // L: 92
												var28[0] = 0.0F;
											}

											if (var28[1] < 0.0F) { // L: 93
												var28[1] = 0.0F;
											}

											if (var28[0] > 1.0F || var28[1] > 1.0F) { // L: 94
												var23 = (float)((double)(var28[0] * (var28[1] + (var28[0] - 2.0F))) + (double)var28[1] * ((double)var28[1] - 2.0D) + 1.0D); // L: 95
												if (class127.field1518 + var23 > 0.0F) { // L: 96
													if (var28[0] + class127.field1518 < 1.3333334F) { // L: 98
														var24 = var28[0] - 2.0F; // L: 99
														var25 = var28[0] - 1.0F; // L: 100
														var26 = (float)Math.sqrt((double)(var24 * var24 - 4.0F * var25 * var25)); // L: 101
														float var27 = 0.5F * (var26 + -var24); // L: 102
														if (class127.field1518 + var28[1] > var27) { // L: 103
															var28[1] = var27 - class127.field1518; // L: 104
														} else {
															var27 = 0.5F * (-var24 - var26); // L: 107
															if (var28[1] < class127.field1518 + var27) { // L: 108
																var28[1] = var27 + class127.field1518; // L: 109
															}
														}
													} else {
														var28[0] = 1.3333334F - class127.field1518; // L: 114
														var28[1] = 0.33333334F - class127.field1518; // L: 115
													}
												}
											}

											var28[1] = 1.0F - var28[1]; // L: 120
										}

										if (var21 != var28[0]) { // L: 123
											var13 = var28[0] * var17 + var5; // L: 124
											if ((double)var21 != 0.0D) { // L: 125
												var15 = (var10 - var9) * var28[0] / var21 + var9; // L: 126
											}
										}

										if (var28[1] != var22) { // L: 129
											float var10000 = var5 + var17 * var28[1]; // L: 130
											if (1.0D != (double)var22) { // L: 131
												var16 = (float)((double)var12 - (1.0D - (double)var28[1]) * (double)(var12 - var11) / (1.0D - (double)var22)); // L: 132
											}
										}

										var0.field1560 = var5; // L: 135
										var0.field1565 = var8; // L: 136
										MenuAction.method2087(0.0F, var28[0], var28[1], 1.0F, var0); // L: 137
										var23 = var15 - var9; // L: 139
										var24 = var16 - var15; // L: 140
										var25 = var12 - var16; // L: 141
										var26 = var24 - var23; // L: 142
										var0.field1570 = var25 - var24 - var26; // L: 143
										var0.field1572 = var26 + var26 + var26; // L: 144
										var0.field1571 = var23 + var23 + var23; // L: 145
										var0.field1577 = var9; // L: 146
									}
								}
							} else if (var0 != null) { // L: 152
								var0.field1560 = var5; // L: 155
								var13 = var8 - var5; // L: 156
								float var14 = var12 - var9; // L: 157
								var15 = var6 - var5; // L: 158
								var16 = 0.0F; // L: 159
								var17 = 0.0F; // L: 160
								if ((double)var15 != 0.0D) { // L: 161
									var16 = (var10 - var9) / var15; // L: 162
								}

								var15 = var8 - var7; // L: 164
								if ((double)var15 != 0.0D) { // L: 165
									var17 = (var12 - var11) / var15; // L: 166
								}

								var18 = 1.0F / (var13 * var13); // L: 168
								var19 = var13 * var16; // L: 169
								float var20 = var17 * var13; // L: 170
								var0.field1581 = (var20 + var19 - var14 - var14) * var18 / var13; // L: 171
								var0.field1580 = var18 * (var14 + var14 + var14 - var19 - var19 - var20); // L: 172
								var0.field1564 = var16; // L: 173
								var0.field1569 = var9; // L: 174
							}

							var0.field1574 = false; // L: 177
						}
					} else {
						var3 = true; // L: 181
					}

					if (var3) { // L: 183
						return var2.field1516; // L: 184
					} else if (var4) { // L: 186
						return (float)var2.field1512 != var1 && var2.field1515 != null ? var2.field1515.field1516 : var2.field1516; // L: 187 188 191
					} else {
						return var0.field1558 ? class179.method3545(var0, var1) : Occluder.method4897(var0, var1); // L: 194 195 198
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}
}
