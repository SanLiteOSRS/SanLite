import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("d")
	static String field642;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive6")
	static Archive archive6;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIILfh;I)Z",
		garbageValue = "-1510519179"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "14"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var7 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitComposition();
			if (var7 != null) {
				var2.decode(new Buffer(var7));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0);
			var1 = var2;
		}

		int var3 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return Varps.Varps_main[var3] >> var4 & var6;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIILgm;Lfh;Z[I[II)I",
		garbageValue = "-1489955053"
	)
	public static int method1321(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) {
			for (var9 = 0; var9 < 128; ++var9) {
				class182.directions[var8][var9] = 0;
				class182.distances[var8][var9] = 99999999;
			}
		}

		int var10;
		int var11;
		byte var12;
		byte var13;
		int var14;
		int var15;
		byte var16;
		int var17;
		int[][] var18;
		int var19;
		int var20;
		int var21;
		int var22;
		boolean var28;
		boolean var29;
		int var30;
		int var31;
		int var33;
		if (var2 == 1) {
			var10 = var0;
			var11 = var1;
			var12 = 64;
			var13 = 64;
			var14 = var0 - var12;
			var15 = var1 - var13;
			class182.directions[var12][var13] = 99;
			class182.distances[var12][var13] = 0;
			var16 = 0;
			var17 = 0;
			class182.bufferX[var16] = var0;
			var33 = var16 + 1;
			class182.bufferY[var16] = var1;
			var18 = var4.flags;

			while (true) {
				if (var17 == var33) {
					Ignored.field3637 = var10;
					class182.field2122 = var11;
					var29 = false;
					break;
				}

				var10 = class182.bufferX[var17];
				var11 = class182.bufferY[var17];
				var17 = var17 + 1 & 4095;
				var30 = var10 - var14;
				var31 = var11 - var15;
				var19 = var10 - var4.xInset;
				var20 = var11 - var4.yInset;
				if (var3.hasArrived(1, var10, var11, var4)) {
					Ignored.field3637 = var10;
					class182.field2122 = var11;
					var29 = true;
					break;
				}

				var21 = class182.distances[var30][var31] + 1;
				if (var30 > 0 && class182.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136776) == 0) {
					class182.bufferX[var33] = var10 - 1;
					class182.bufferY[var33] = var11;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 - 1][var31] = 2;
					class182.distances[var30 - 1][var31] = var21;
				}

				if (var30 < 127 && class182.directions[var30 + 1][var31] == 0 && (var18[var19 + 1][var20] & 19136896) == 0) {
					class182.bufferX[var33] = var10 + 1;
					class182.bufferY[var33] = var11;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 + 1][var31] = 8;
					class182.distances[var30 + 1][var31] = var21;
				}

				if (var31 > 0 && class182.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
					class182.bufferX[var33] = var10;
					class182.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30][var31 - 1] = 1;
					class182.distances[var30][var31 - 1] = var21;
				}

				if (var31 < 127 && class182.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
					class182.bufferX[var33] = var10;
					class182.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30][var31 + 1] = 4;
					class182.distances[var30][var31 + 1] = var21;
				}

				if (var30 > 0 && var31 > 0 && class182.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
					class182.bufferX[var33] = var10 - 1;
					class182.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 - 1][var31 - 1] = 3;
					class182.distances[var30 - 1][var31 - 1] = var21;
				}

				if (var30 < 127 && var31 > 0 && class182.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
					class182.bufferX[var33] = var10 + 1;
					class182.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 + 1][var31 - 1] = 9;
					class182.distances[var30 + 1][var31 - 1] = var21;
				}

				if (var30 > 0 && var31 < 127 && class182.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
					class182.bufferX[var33] = var10 - 1;
					class182.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 - 1][var31 + 1] = 6;
					class182.distances[var30 - 1][var31 + 1] = var21;
				}

				if (var30 < 127 && var31 < 127 && class182.directions[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 1] & 19136992) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
					class182.bufferX[var33] = var10 + 1;
					class182.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 + 1][var31 + 1] = 12;
					class182.distances[var30 + 1][var31 + 1] = var21;
				}
			}

			var28 = var29;
		} else if (var2 == 2) {
			var10 = var0;
			var11 = var1;
			var12 = 64;
			var13 = 64;
			var14 = var0 - var12;
			var15 = var1 - var13;
			class182.directions[var12][var13] = 99;
			class182.distances[var12][var13] = 0;
			var16 = 0;
			var17 = 0;
			class182.bufferX[var16] = var0;
			var33 = var16 + 1;
			class182.bufferY[var16] = var1;
			var18 = var4.flags;

			while (true) {
				if (var33 == var17) {
					Ignored.field3637 = var10;
					class182.field2122 = var11;
					var29 = false;
					break;
				}

				var10 = class182.bufferX[var17];
				var11 = class182.bufferY[var17];
				var17 = var17 + 1 & 4095;
				var30 = var10 - var14;
				var31 = var11 - var15;
				var19 = var10 - var4.xInset;
				var20 = var11 - var4.yInset;
				if (var3.hasArrived(2, var10, var11, var4)) {
					Ignored.field3637 = var10;
					class182.field2122 = var11;
					var29 = true;
					break;
				}

				var21 = class182.distances[var30][var31] + 1;
				if (var30 > 0 && class182.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0) {
					class182.bufferX[var33] = var10 - 1;
					class182.bufferY[var33] = var11;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 - 1][var31] = 2;
					class182.distances[var30 - 1][var31] = var21;
				}

				if (var30 < 126 && class182.directions[var30 + 1][var31] == 0 && (var18[var19 + 2][var20] & 19136899) == 0 && (var18[var19 + 2][var20 + 1] & 19136992) == 0) {
					class182.bufferX[var33] = var10 + 1;
					class182.bufferY[var33] = var11;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 + 1][var31] = 8;
					class182.distances[var30 + 1][var31] = var21;
				}

				if (var31 > 0 && class182.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0) {
					class182.bufferX[var33] = var10;
					class182.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30][var31 - 1] = 1;
					class182.distances[var30][var31 - 1] = var21;
				}

				if (var31 < 126 && class182.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + 2] & 19136824) == 0 && (var18[var19 + 1][var20 + 2] & 19136992) == 0) {
					class182.bufferX[var33] = var10;
					class182.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30][var31 + 1] = 4;
					class182.distances[var30][var31 + 1] = var21;
				}

				if (var30 > 0 && var31 > 0 && class182.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20] & 19136830) == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19][var20 - 1] & 19136911) == 0) {
					class182.bufferX[var33] = var10 - 1;
					class182.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 - 1][var31 - 1] = 3;
					class182.distances[var30 - 1][var31 - 1] = var21;
				}

				if (var30 < 126 && var31 > 0 && class182.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136911) == 0 && (var18[var19 + 2][var20 - 1] & 19136899) == 0 && (var18[var19 + 2][var20] & 19136995) == 0) {
					class182.bufferX[var33] = var10 + 1;
					class182.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 + 1][var31 - 1] = 9;
					class182.distances[var30 + 1][var31 - 1] = var21;
				}

				if (var30 > 0 && var31 < 126 && class182.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136830) == 0 && (var18[var19 - 1][var20 + 2] & 19136824) == 0 && (var18[var19][var20 + 2] & 19137016) == 0) {
					class182.bufferX[var33] = var10 - 1;
					class182.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 - 1][var31 + 1] = 6;
					class182.distances[var30 - 1][var31 + 1] = var21;
				}

				if (var30 < 126 && var31 < 126 && class182.directions[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 2] & 19137016) == 0 && (var18[var19 + 2][var20 + 2] & 19136992) == 0 && (var18[var19 + 2][var20 + 1] & 19136995) == 0) {
					class182.bufferX[var33] = var10 + 1;
					class182.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 + 1][var31 + 1] = 12;
					class182.distances[var30 + 1][var31 + 1] = var21;
				}
			}

			var28 = var29;
		} else {
			var10 = var0;
			var11 = var1;
			var12 = 64;
			var13 = 64;
			var14 = var0 - var12;
			var15 = var1 - var13;
			class182.directions[var12][var13] = 99;
			class182.distances[var12][var13] = 0;
			var16 = 0;
			var17 = 0;
			class182.bufferX[var16] = var0;
			var33 = var16 + 1;
			class182.bufferY[var16] = var1;
			var18 = var4.flags;

			label818:
			while (true) {
				label816:
				while (true) {
					do {
						do {
							do {
								label793:
								do {
									if (var17 == var33) {
										Ignored.field3637 = var10;
										class182.field2122 = var11;
										var29 = false;
										break label818;
									}

									var10 = class182.bufferX[var17];
									var11 = class182.bufferY[var17];
									var17 = var17 + 1 & 4095;
									var30 = var10 - var14;
									var31 = var11 - var15;
									var19 = var10 - var4.xInset;
									var20 = var11 - var4.yInset;
									if (var3.hasArrived(var2, var10, var11, var4)) {
										Ignored.field3637 = var10;
										class182.field2122 = var11;
										var29 = true;
										break label818;
									}

									var21 = class182.distances[var30][var31] + 1;
									if (var30 > 0 && class182.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + var2 - 1] & 19136824) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class182.bufferX[var33] = var10 - 1;
												class182.bufferY[var33] = var11;
												var33 = var33 + 1 & 4095;
												class182.directions[var30 - 1][var31] = 2;
												class182.distances[var30 - 1][var31] = var21;
												break;
											}

											if ((var18[var19 - 1][var22 + var20] & 19136830) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var30 < 128 - var2 && class182.directions[var30 + 1][var31] == 0 && (var18[var19 + var2][var20] & 19136899) == 0 && (var18[var19 + var2][var20 + var2 - 1] & 19136992) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class182.bufferX[var33] = var10 + 1;
												class182.bufferY[var33] = var11;
												var33 = var33 + 1 & 4095;
												class182.directions[var30 + 1][var31] = 8;
												class182.distances[var30 + 1][var31] = var21;
												break;
											}

											if ((var18[var19 + var2][var20 + var22] & 19136995) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var31 > 0 && class182.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + var2 - 1][var20 - 1] & 19136899) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class182.bufferX[var33] = var10;
												class182.bufferY[var33] = var11 - 1;
												var33 = var33 + 1 & 4095;
												class182.directions[var30][var31 - 1] = 1;
												class182.distances[var30][var31 - 1] = var21;
												break;
											}

											if ((var18[var22 + var19][var20 - 1] & 19136911) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var31 < 128 - var2 && class182.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + var2] & 19136824) == 0 && (var18[var19 + var2 - 1][var20 + var2] & 19136992) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class182.bufferX[var33] = var10;
												class182.bufferY[var33] = var11 + 1;
												var33 = var33 + 1 & 4095;
												class182.directions[var30][var31 + 1] = 4;
												class182.distances[var30][var31 + 1] = var21;
												break;
											}

											if ((var18[var19 + var22][var20 + var2] & 19137016) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var30 > 0 && var31 > 0 && class182.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2) {
												class182.bufferX[var33] = var10 - 1;
												class182.bufferY[var33] = var11 - 1;
												var33 = var33 + 1 & 4095;
												class182.directions[var30 - 1][var31 - 1] = 3;
												class182.distances[var30 - 1][var31 - 1] = var21;
												break;
											}

											if ((var18[var19 - 1][var22 + (var20 - 1)] & 19136830) != 0 || (var18[var22 + (var19 - 1)][var20 - 1] & 19136911) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var30 < 128 - var2 && var31 > 0 && class182.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + var2][var20 - 1] & 19136899) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2) {
												class182.bufferX[var33] = var10 + 1;
												class182.bufferY[var33] = var11 - 1;
												var33 = var33 + 1 & 4095;
												class182.directions[var30 + 1][var31 - 1] = 9;
												class182.distances[var30 + 1][var31 - 1] = var21;
												break;
											}

											if ((var18[var19 + var2][var22 + (var20 - 1)] & 19136995) != 0 || (var18[var22 + var19][var20 - 1] & 19136911) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var30 > 0 && var31 < 128 - var2 && class182.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + var2] & 19136824) == 0) {
										for (var22 = 1; var22 < var2; ++var22) {
											if ((var18[var19 - 1][var22 + var20] & 19136830) != 0 || (var18[var22 + (var19 - 1)][var20 + var2] & 19137016) != 0) {
												continue label793;
											}
										}

										class182.bufferX[var33] = var10 - 1;
										class182.bufferY[var33] = var11 + 1;
										var33 = var33 + 1 & 4095;
										class182.directions[var30 - 1][var31 + 1] = 6;
										class182.distances[var30 - 1][var31 + 1] = var21;
									}
								} while(var30 >= 128 - var2);
							} while(var31 >= 128 - var2);
						} while(class182.directions[var30 + 1][var31 + 1] != 0);
					} while((var18[var19 + var2][var20 + var2] & 19136992) != 0);

					for (var22 = 1; var22 < var2; ++var22) {
						if ((var18[var19 + var22][var20 + var2] & 19137016) != 0 || (var18[var19 + var2][var22 + var20] & 19136995) != 0) {
							continue label816;
						}
					}

					class182.bufferX[var33] = var10 + 1;
					class182.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class182.directions[var30 + 1][var31 + 1] = 12;
					class182.distances[var30 + 1][var31 + 1] = var21;
				}
			}

			var28 = var29;
		}

		var9 = var0 - 64;
		var10 = var1 - 64;
		var11 = Ignored.field3637;
		var30 = class182.field2122;
		if (!var28) {
			var31 = Integer.MAX_VALUE;
			var14 = Integer.MAX_VALUE;
			byte var32 = 10;
			var33 = var3.approxDestinationX;
			var17 = var3.approxDestinationY;
			int var27 = var3.approxDestinationSizeX;
			var19 = var3.approxDestinationSizeY;

			for (var20 = var33 - var32; var20 <= var32 + var33; ++var20) {
				for (var21 = var17 - var32; var21 <= var17 + var32; ++var21) {
					var22 = var20 - var9;
					int var23 = var21 - var10;
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class182.distances[var22][var23] < 100) {
						int var24 = 0;
						if (var20 < var33) {
							var24 = var33 - var20;
						} else if (var20 > var27 + var33 - 1) {
							var24 = var20 - (var33 + var27 - 1);
						}

						int var25 = 0;
						if (var21 < var17) {
							var25 = var17 - var21;
						} else if (var21 > var19 + var17 - 1) {
							var25 = var21 - (var17 + var19 - 1);
						}

						int var26 = var25 * var25 + var24 * var24;
						if (var26 < var31 || var31 == var26 && class182.distances[var22][var23] < var14) {
							var31 = var26;
							var14 = class182.distances[var22][var23];
							var11 = var20;
							var30 = var21;
						}
					}
				}
			}

			if (var31 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var0 == var11 && var30 == var1) {
			return 0;
		} else {
			var13 = 0;
			class182.bufferX[var13] = var11;
			var31 = var13 + 1;
			class182.bufferY[var13] = var30;

			for (var14 = var15 = class182.directions[var11 - var9][var30 - var10]; var0 != var11 || var30 != var1; var14 = class182.directions[var11 - var9][var30 - var10]) {
				if (var14 != var15) {
					var15 = var14;
					class182.bufferX[var31] = var11;
					class182.bufferY[var31++] = var30;
				}

				if ((var14 & 2) != 0) {
					++var11;
				} else if ((var14 & 8) != 0) {
					--var11;
				}

				if ((var14 & 1) != 0) {
					++var30;
				} else if ((var14 & 4) != 0) {
					--var30;
				}
			}

			var33 = 0;

			while (var31-- > 0) {
				var6[var33] = class182.bufferX[var31];
				var7[var33++] = class182.bufferY[var31];
				if (var33 >= var6.length) {
					break;
				}
			}

			return var33;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-1942502942"
	)
	public static String method1324(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var3 = var0[var1];
			return var3 == null ? "null" : var3.toString();
		} else {
			int var8 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var8; ++var5) {
				CharSequence var6 = var0[var5];
				if (var6 == null) {
					var4 += 4;
				} else {
					var4 += var6.length();
				}
			}

			StringBuilder var9 = new StringBuilder(var4);

			for (int var10 = var1; var10 < var8; ++var10) {
				CharSequence var7 = var0[var10];
				if (var7 == null) {
					var9.append("null");
				} else {
					var9.append(var7);
				}
			}

			return var9.toString();
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "16"
	)
	static final void method1317() {
		int[] var0 = Players.Players_indices;

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) {
			Player var2 = Client.players[var0[var1]];
			if (var2 != null && var2.overheadTextCyclesRemaining > 0) {
				--var2.overheadTextCyclesRemaining;
				if (var2.overheadTextCyclesRemaining == 0) {
					var2.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) {
			int var4 = Client.npcIndices[var1];
			NPC var3 = Client.npcs[var4];
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) {
				--var3.overheadTextCyclesRemaining;
				if (var3.overheadTextCyclesRemaining == 0) {
					var3.overheadText = null;
				}
			}
		}

	}
}
