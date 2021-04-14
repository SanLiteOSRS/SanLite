import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class60 {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lkq;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("ao")
	@Export("null_string")
	protected static String null_string;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)Lbh;",
		garbageValue = "87"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		signature = "(Lcs;IIBI)V",
		garbageValue = "761999327"
	)
	static final void method470(Player var0, int var1, int var2, byte var3) {
		int var4 = var0.pathX[0];
		int var5 = var0.pathY[0];
		int var6 = var0.transformedSize();
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
				int var8 = var0.transformedSize();
				RouteStrategy var9 = Renderable.method3628(var1, var2);
				CollisionMap var10 = Client.collisionMaps[var0.plane];
				int[] var11 = Client.field879;
				int[] var12 = Client.field726;

				int var13;
				int var14;
				for (var13 = 0; var13 < 128; ++var13) {
					for (var14 = 0; var14 < 128; ++var14) {
						class137.directions[var13][var14] = 0;
						class137.distances[var13][var14] = 99999999;
					}
				}

				int var15;
				int var16;
				byte var17;
				byte var18;
				int var19;
				int var20;
				byte var21;
				int var22;
				int[][] var23;
				int var24;
				int var25;
				int var26;
				int var27;
				boolean var33;
				boolean var34;
				int var35;
				int var36;
				int var38;
				if (var8 == 1) {
					var15 = var4;
					var16 = var5;
					var17 = 64;
					var18 = 64;
					var19 = var4 - var17;
					var20 = var5 - var18;
					class137.directions[var17][var18] = 99;
					class137.distances[var17][var18] = 0;
					var21 = 0;
					var22 = 0;
					class137.bufferX[var21] = var4;
					var38 = var21 + 1;
					class137.bufferY[var21] = var5;
					var23 = var10.flags;

					while (true) {
						if (var38 == var22) {
							Messages.field1377 = var15;
							CollisionMap.field1535 = var16;
							var34 = false;
							break;
						}

						var15 = class137.bufferX[var22];
						var16 = class137.bufferY[var22];
						var22 = var22 + 1 & 4095;
						var35 = var15 - var19;
						var36 = var16 - var20;
						var24 = var15 - var10.xInset;
						var25 = var16 - var10.yInset;
						if (var9.hasArrived(1, var15, var16, var10)) {
							Messages.field1377 = var15;
							CollisionMap.field1535 = var16;
							var34 = true;
							break;
						}

						var26 = class137.distances[var35][var36] + 1;
						if (var35 > 0 && class137.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136776) == 0) {
							class137.bufferX[var38] = var15 - 1;
							class137.bufferY[var38] = var16;
							var38 = var38 + 1 & 4095;
							class137.directions[var35 - 1][var36] = 2;
							class137.distances[var35 - 1][var36] = var26;
						}

						if (var35 < 127 && class137.directions[var35 + 1][var36] == 0 && (var23[var24 + 1][var25] & 19136896) == 0) {
							class137.bufferX[var38] = var15 + 1;
							class137.bufferY[var38] = var16;
							var38 = var38 + 1 & 4095;
							class137.directions[var35 + 1][var36] = 8;
							class137.distances[var35 + 1][var36] = var26;
						}

						if (var36 > 0 && class137.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136770) == 0) {
							class137.bufferX[var38] = var15;
							class137.bufferY[var38] = var16 - 1;
							var38 = var38 + 1 & 4095;
							class137.directions[var35][var36 - 1] = 1;
							class137.distances[var35][var36 - 1] = var26;
						}

						if (var36 < 127 && class137.directions[var35][var36 + 1] == 0 && (var23[var24][var25 + 1] & 19136800) == 0) {
							class137.bufferX[var38] = var15;
							class137.bufferY[var38] = var16 + 1;
							var38 = var38 + 1 & 4095;
							class137.directions[var35][var36 + 1] = 4;
							class137.distances[var35][var36 + 1] = var26;
						}

						if (var35 > 0 && var36 > 0 && class137.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0 && (var23[var24 - 1][var25] & 19136776) == 0 && (var23[var24][var25 - 1] & 19136770) == 0) {
							class137.bufferX[var38] = var15 - 1;
							class137.bufferY[var38] = var16 - 1;
							var38 = var38 + 1 & 4095;
							class137.directions[var35 - 1][var36 - 1] = 3;
							class137.distances[var35 - 1][var36 - 1] = var26;
						}

						if (var35 < 127 && var36 > 0 && class137.directions[var35 + 1][var36 - 1] == 0 && (var23[var24 + 1][var25 - 1] & 19136899) == 0 && (var23[var24 + 1][var25] & 19136896) == 0 && (var23[var24][var25 - 1] & 19136770) == 0) {
							class137.bufferX[var38] = var15 + 1;
							class137.bufferY[var38] = var16 - 1;
							var38 = var38 + 1 & 4095;
							class137.directions[var35 + 1][var36 - 1] = 9;
							class137.distances[var35 + 1][var36 - 1] = var26;
						}

						if (var35 > 0 && var36 < 127 && class137.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + 1] & 19136824) == 0 && (var23[var24 - 1][var25] & 19136776) == 0 && (var23[var24][var25 + 1] & 19136800) == 0) {
							class137.bufferX[var38] = var15 - 1;
							class137.bufferY[var38] = var16 + 1;
							var38 = var38 + 1 & 4095;
							class137.directions[var35 - 1][var36 + 1] = 6;
							class137.distances[var35 - 1][var36 + 1] = var26;
						}

						if (var35 < 127 && var36 < 127 && class137.directions[var35 + 1][var36 + 1] == 0 && (var23[var24 + 1][var25 + 1] & 19136992) == 0 && (var23[var24 + 1][var25] & 19136896) == 0 && (var23[var24][var25 + 1] & 19136800) == 0) {
							class137.bufferX[var38] = var15 + 1;
							class137.bufferY[var38] = var16 + 1;
							var38 = var38 + 1 & 4095;
							class137.directions[var35 + 1][var36 + 1] = 12;
							class137.distances[var35 + 1][var36 + 1] = var26;
						}
					}

					var33 = var34;
				} else if (var8 == 2) {
					var33 = Decimator.method1113(var4, var5, var9, var10);
				} else {
					var15 = var4;
					var16 = var5;
					var17 = 64;
					var18 = 64;
					var19 = var4 - var17;
					var20 = var5 - var18;
					class137.directions[var17][var18] = 99;
					class137.distances[var17][var18] = 0;
					var21 = 0;
					var22 = 0;
					class137.bufferX[var21] = var4;
					var38 = var21 + 1;
					class137.bufferY[var21] = var5;
					var23 = var10.flags;

					label646:
					while (true) {
						label644:
						while (true) {
							do {
								do {
									do {
										label621:
										do {
											if (var38 == var22) {
												Messages.field1377 = var15;
												CollisionMap.field1535 = var16;
												var34 = false;
												break label646;
											}

											var15 = class137.bufferX[var22];
											var16 = class137.bufferY[var22];
											var22 = var22 + 1 & 4095;
											var35 = var15 - var19;
											var36 = var16 - var20;
											var24 = var15 - var10.xInset;
											var25 = var16 - var10.yInset;
											if (var9.hasArrived(var8, var15, var16, var10)) {
												Messages.field1377 = var15;
												CollisionMap.field1535 = var16;
												var34 = true;
												break label646;
											}

											var26 = class137.distances[var35][var36] + 1;
											if (var35 > 0 && class137.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var25 + var8 - 1] & 19136824) == 0) {
												var27 = 1;

												while (true) {
													if (var27 >= var8 - 1) {
														class137.bufferX[var38] = var15 - 1;
														class137.bufferY[var38] = var16;
														var38 = var38 + 1 & 4095;
														class137.directions[var35 - 1][var36] = 2;
														class137.distances[var35 - 1][var36] = var26;
														break;
													}

													if ((var23[var24 - 1][var25 + var27] & 19136830) != 0) {
														break;
													}

													++var27;
												}
											}

											if (var35 < 128 - var8 && class137.directions[var35 + 1][var36] == 0 && (var23[var8 + var24][var25] & 19136899) == 0 && (var23[var24 + var8][var25 + var8 - 1] & 19136992) == 0) {
												var27 = 1;

												while (true) {
													if (var27 >= var8 - 1) {
														class137.bufferX[var38] = var15 + 1;
														class137.bufferY[var38] = var16;
														var38 = var38 + 1 & 4095;
														class137.directions[var35 + 1][var36] = 8;
														class137.distances[var35 + 1][var36] = var26;
														break;
													}

													if ((var23[var8 + var24][var27 + var25] & 19136995) != 0) {
														break;
													}

													++var27;
												}
											}

											if (var36 > 0 && class137.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var8 + var24 - 1][var25 - 1] & 19136899) == 0) {
												var27 = 1;

												while (true) {
													if (var27 >= var8 - 1) {
														class137.bufferX[var38] = var15;
														class137.bufferY[var38] = var16 - 1;
														var38 = var38 + 1 & 4095;
														class137.directions[var35][var36 - 1] = 1;
														class137.distances[var35][var36 - 1] = var26;
														break;
													}

													if ((var23[var27 + var24][var25 - 1] & 19136911) != 0) {
														break;
													}

													++var27;
												}
											}

											if (var36 < 128 - var8 && class137.directions[var35][var36 + 1] == 0 && (var23[var24][var25 + var8] & 19136824) == 0 && (var23[var8 + var24 - 1][var25 + var8] & 19136992) == 0) {
												var27 = 1;

												while (true) {
													if (var27 >= var8 - 1) {
														class137.bufferX[var38] = var15;
														class137.bufferY[var38] = var16 + 1;
														var38 = var38 + 1 & 4095;
														class137.directions[var35][var36 + 1] = 4;
														class137.distances[var35][var36 + 1] = var26;
														break;
													}

													if ((var23[var27 + var24][var25 + var8] & 19137016) != 0) {
														break;
													}

													++var27;
												}
											}

											if (var35 > 0 && var36 > 0 && class137.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0) {
												var27 = 1;

												while (true) {
													if (var27 >= var8) {
														class137.bufferX[var38] = var15 - 1;
														class137.bufferY[var38] = var16 - 1;
														var38 = var38 + 1 & 4095;
														class137.directions[var35 - 1][var36 - 1] = 3;
														class137.distances[var35 - 1][var36 - 1] = var26;
														break;
													}

													if ((var23[var24 - 1][var27 + (var25 - 1)] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var25 - 1] & 19136911) != 0) {
														break;
													}

													++var27;
												}
											}

											if (var35 < 128 - var8 && var36 > 0 && class137.directions[var35 + 1][var36 - 1] == 0 && (var23[var24 + var8][var25 - 1] & 19136899) == 0) {
												var27 = 1;

												while (true) {
													if (var27 >= var8) {
														class137.bufferX[var38] = var15 + 1;
														class137.bufferY[var38] = var16 - 1;
														var38 = var38 + 1 & 4095;
														class137.directions[var35 + 1][var36 - 1] = 9;
														class137.distances[var35 + 1][var36 - 1] = var26;
														break;
													}

													if ((var23[var8 + var24][var27 + (var25 - 1)] & 19136995) != 0 || (var23[var27 + var24][var25 - 1] & 19136911) != 0) {
														break;
													}

													++var27;
												}
											}

											if (var35 > 0 && var36 < 128 - var8 && class137.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + var8] & 19136824) == 0) {
												for (var27 = 1; var27 < var8; ++var27) {
													if ((var23[var24 - 1][var27 + var25] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var25 + var8] & 19137016) != 0) {
														continue label621;
													}
												}

												class137.bufferX[var38] = var15 - 1;
												class137.bufferY[var38] = var16 + 1;
												var38 = var38 + 1 & 4095;
												class137.directions[var35 - 1][var36 + 1] = 6;
												class137.distances[var35 - 1][var36 + 1] = var26;
											}
										} while(var35 >= 128 - var8);
									} while(var36 >= 128 - var8);
								} while(class137.directions[var35 + 1][var36 + 1] != 0);
							} while((var23[var24 + var8][var25 + var8] & 19136992) != 0);

							for (var27 = 1; var27 < var8; ++var27) {
								if ((var23[var24 + var27][var8 + var25] & 19137016) != 0 || (var23[var8 + var24][var27 + var25] & 19136995) != 0) {
									continue label644;
								}
							}

							class137.bufferX[var38] = var15 + 1;
							class137.bufferY[var38] = var16 + 1;
							var38 = var38 + 1 & 4095;
							class137.directions[var35 + 1][var36 + 1] = 12;
							class137.distances[var35 + 1][var36 + 1] = var26;
						}
					}

					var33 = var34;
				}

				int var7;
				label702: {
					var14 = var4 - 64;
					var15 = var5 - 64;
					var16 = Messages.field1377;
					var35 = CollisionMap.field1535;
					if (!var33) {
						var36 = Integer.MAX_VALUE;
						var19 = Integer.MAX_VALUE;
						byte var37 = 10;
						var38 = var9.approxDestinationX;
						var22 = var9.approxDestinationY;
						int var32 = var9.approxDestinationSizeX;
						var24 = var9.approxDestinationSizeY;

						for (var25 = var38 - var37; var25 <= var38 + var37; ++var25) {
							for (var26 = var22 - var37; var26 <= var37 + var22; ++var26) {
								var27 = var25 - var14;
								int var28 = var26 - var15;
								if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class137.distances[var27][var28] < 100) {
									int var29 = 0;
									if (var25 < var38) {
										var29 = var38 - var25;
									} else if (var25 > var38 + var32 - 1) {
										var29 = var25 - (var32 + var38 - 1);
									}

									int var30 = 0;
									if (var26 < var22) {
										var30 = var22 - var26;
									} else if (var26 > var24 + var22 - 1) {
										var30 = var26 - (var22 + var24 - 1);
									}

									int var31 = var29 * var29 + var30 * var30;
									if (var31 < var36 || var31 == var36 && class137.distances[var27][var28] < var19) {
										var36 = var31;
										var19 = class137.distances[var27][var28];
										var16 = var25;
										var35 = var26;
									}
								}
							}
						}

						if (var36 == Integer.MAX_VALUE) {
							var7 = -1;
							break label702;
						}
					}

					if (var4 == var16 && var35 == var5) {
						var7 = 0;
					} else {
						var18 = 0;
						class137.bufferX[var18] = var16;
						var36 = var18 + 1;
						class137.bufferY[var18] = var35;

						for (var19 = var20 = class137.directions[var16 - var14][var35 - var15]; var16 != var4 || var35 != var5; var19 = class137.directions[var16 - var14][var35 - var15]) {
							if (var20 != var19) {
								var20 = var19;
								class137.bufferX[var36] = var16;
								class137.bufferY[var36++] = var35;
							}

							if ((var19 & 2) != 0) {
								++var16;
							} else if ((var19 & 8) != 0) {
								--var16;
							}

							if ((var19 & 1) != 0) {
								++var35;
							} else if ((var19 & 4) != 0) {
								--var35;
							}
						}

						var38 = 0;

						while (var36-- > 0) {
							var11[var38] = class137.bufferX[var36];
							var12[var38++] = class137.bufferY[var36];
							if (var38 >= var11.length) {
								break;
							}
						}

						var7 = var38;
					}
				}

				var13 = var7;
				if (var7 >= 1) {
					for (var14 = 0; var14 < var13 - 1; ++var14) {
						var0.method2142(Client.field879[var14], Client.field726[var14], var3);
					}

				}
			}
		}
	}
}
