import java.awt.Component;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	static StudioGame field461;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = -27903763
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			class266.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Leo;",
		garbageValue = "-1234409963"
	)
	public static FloorOverlayDefinition method807(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class142.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILfc;Lfz;Z[I[II)I",
		garbageValue = "1972841264"
	)
	public static int method808(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) {
			for (var9 = 0; var9 < 128; ++var9) {
				class159.directions[var8][var9] = 0;
				class159.distances[var8][var9] = 99999999;
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
			class159.directions[var12][var13] = 99;
			class159.distances[var12][var13] = 0;
			var16 = 0;
			var17 = 0;
			class159.bufferX[var16] = var0;
			var33 = var16 + 1;
			class159.bufferY[var16] = var1;
			var18 = var4.flags;

			while (true) {
				if (var33 == var17) {
					UserComparator10.field1457 = var10;
					FaceNormal.field2363 = var11;
					var29 = false;
					break;
				}

				var10 = class159.bufferX[var17];
				var11 = class159.bufferY[var17];
				var17 = var17 + 1 & 4095;
				var30 = var10 - var14;
				var31 = var11 - var15;
				var19 = var10 - var4.xInset;
				var20 = var11 - var4.yInset;
				if (var3.hasArrived(1, var10, var11, var4)) {
					UserComparator10.field1457 = var10;
					FaceNormal.field2363 = var11;
					var29 = true;
					break;
				}

				var21 = class159.distances[var30][var31] + 1;
				if (var30 > 0 && class159.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136776) == 0) {
					class159.bufferX[var33] = var10 - 1;
					class159.bufferY[var33] = var11;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 - 1][var31] = 2;
					class159.distances[var30 - 1][var31] = var21;
				}

				if (var30 < 127 && class159.directions[var30 + 1][var31] == 0 && (var18[var19 + 1][var20] & 19136896) == 0) {
					class159.bufferX[var33] = var10 + 1;
					class159.bufferY[var33] = var11;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 + 1][var31] = 8;
					class159.distances[var30 + 1][var31] = var21;
				}

				if (var31 > 0 && class159.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
					class159.bufferX[var33] = var10;
					class159.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30][var31 - 1] = 1;
					class159.distances[var30][var31 - 1] = var21;
				}

				if (var31 < 127 && class159.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
					class159.bufferX[var33] = var10;
					class159.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30][var31 + 1] = 4;
					class159.distances[var30][var31 + 1] = var21;
				}

				if (var30 > 0 && var31 > 0 && class159.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
					class159.bufferX[var33] = var10 - 1;
					class159.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 - 1][var31 - 1] = 3;
					class159.distances[var30 - 1][var31 - 1] = var21;
				}

				if (var30 < 127 && var31 > 0 && class159.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
					class159.bufferX[var33] = var10 + 1;
					class159.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 + 1][var31 - 1] = 9;
					class159.distances[var30 + 1][var31 - 1] = var21;
				}

				if (var30 > 0 && var31 < 127 && class159.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
					class159.bufferX[var33] = var10 - 1;
					class159.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 - 1][var31 + 1] = 6;
					class159.distances[var30 - 1][var31 + 1] = var21;
				}

				if (var30 < 127 && var31 < 127 && class159.directions[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 1] & 19136992) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
					class159.bufferX[var33] = var10 + 1;
					class159.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 + 1][var31 + 1] = 12;
					class159.distances[var30 + 1][var31 + 1] = var21;
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
			class159.directions[var12][var13] = 99;
			class159.distances[var12][var13] = 0;
			var16 = 0;
			var17 = 0;
			class159.bufferX[var16] = var0;
			var33 = var16 + 1;
			class159.bufferY[var16] = var1;
			var18 = var4.flags;

			while (true) {
				if (var33 == var17) {
					UserComparator10.field1457 = var10;
					FaceNormal.field2363 = var11;
					var29 = false;
					break;
				}

				var10 = class159.bufferX[var17];
				var11 = class159.bufferY[var17];
				var17 = var17 + 1 & 4095;
				var30 = var10 - var14;
				var31 = var11 - var15;
				var19 = var10 - var4.xInset;
				var20 = var11 - var4.yInset;
				if (var3.hasArrived(2, var10, var11, var4)) {
					UserComparator10.field1457 = var10;
					FaceNormal.field2363 = var11;
					var29 = true;
					break;
				}

				var21 = class159.distances[var30][var31] + 1;
				if (var30 > 0 && class159.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0) {
					class159.bufferX[var33] = var10 - 1;
					class159.bufferY[var33] = var11;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 - 1][var31] = 2;
					class159.distances[var30 - 1][var31] = var21;
				}

				if (var30 < 126 && class159.directions[var30 + 1][var31] == 0 && (var18[var19 + 2][var20] & 19136899) == 0 && (var18[var19 + 2][var20 + 1] & 19136992) == 0) {
					class159.bufferX[var33] = var10 + 1;
					class159.bufferY[var33] = var11;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 + 1][var31] = 8;
					class159.distances[var30 + 1][var31] = var21;
				}

				if (var31 > 0 && class159.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0) {
					class159.bufferX[var33] = var10;
					class159.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30][var31 - 1] = 1;
					class159.distances[var30][var31 - 1] = var21;
				}

				if (var31 < 126 && class159.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + 2] & 19136824) == 0 && (var18[var19 + 1][var20 + 2] & 19136992) == 0) {
					class159.bufferX[var33] = var10;
					class159.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30][var31 + 1] = 4;
					class159.distances[var30][var31 + 1] = var21;
				}

				if (var30 > 0 && var31 > 0 && class159.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20] & 19136830) == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19][var20 - 1] & 19136911) == 0) {
					class159.bufferX[var33] = var10 - 1;
					class159.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 - 1][var31 - 1] = 3;
					class159.distances[var30 - 1][var31 - 1] = var21;
				}

				if (var30 < 126 && var31 > 0 && class159.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136911) == 0 && (var18[var19 + 2][var20 - 1] & 19136899) == 0 && (var18[var19 + 2][var20] & 19136995) == 0) {
					class159.bufferX[var33] = var10 + 1;
					class159.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 + 1][var31 - 1] = 9;
					class159.distances[var30 + 1][var31 - 1] = var21;
				}

				if (var30 > 0 && var31 < 126 && class159.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136830) == 0 && (var18[var19 - 1][var20 + 2] & 19136824) == 0 && (var18[var19][var20 + 2] & 19137016) == 0) {
					class159.bufferX[var33] = var10 - 1;
					class159.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 - 1][var31 + 1] = 6;
					class159.distances[var30 - 1][var31 + 1] = var21;
				}

				if (var30 < 126 && var31 < 126 && class159.directions[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 2] & 19137016) == 0 && (var18[var19 + 2][var20 + 2] & 19136992) == 0 && (var18[var19 + 2][var20 + 1] & 19136995) == 0) {
					class159.bufferX[var33] = var10 + 1;
					class159.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 + 1][var31 + 1] = 12;
					class159.distances[var30 + 1][var31 + 1] = var21;
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
			class159.directions[var12][var13] = 99;
			class159.distances[var12][var13] = 0;
			var16 = 0;
			var17 = 0;
			class159.bufferX[var16] = var0;
			var33 = var16 + 1;
			class159.bufferY[var16] = var1;
			var18 = var4.flags;

			label768:
			while (true) {
				label766:
				while (true) {
					do {
						do {
							do {
								label743:
								do {
									if (var17 == var33) {
										UserComparator10.field1457 = var10;
										FaceNormal.field2363 = var11;
										var29 = false;
										break label768;
									}

									var10 = class159.bufferX[var17];
									var11 = class159.bufferY[var17];
									var17 = var17 + 1 & 4095;
									var30 = var10 - var14;
									var31 = var11 - var15;
									var19 = var10 - var4.xInset;
									var20 = var11 - var4.yInset;
									if (var3.hasArrived(var2, var10, var11, var4)) {
										UserComparator10.field1457 = var10;
										FaceNormal.field2363 = var11;
										var29 = true;
										break label768;
									}

									var21 = class159.distances[var30][var31] + 1;
									if (var30 > 0 && class159.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + var2 - 1] & 19136824) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class159.bufferX[var33] = var10 - 1;
												class159.bufferY[var33] = var11;
												var33 = var33 + 1 & 4095;
												class159.directions[var30 - 1][var31] = 2;
												class159.distances[var30 - 1][var31] = var21;
												break;
											}

											if ((var18[var19 - 1][var22 + var20] & 19136830) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var30 < 128 - var2 && class159.directions[var30 + 1][var31] == 0 && (var18[var19 + var2][var20] & 19136899) == 0 && (var18[var19 + var2][var20 + var2 - 1] & 19136992) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class159.bufferX[var33] = var10 + 1;
												class159.bufferY[var33] = var11;
												var33 = var33 + 1 & 4095;
												class159.directions[var30 + 1][var31] = 8;
												class159.distances[var30 + 1][var31] = var21;
												break;
											}

											if ((var18[var19 + var2][var22 + var20] & 19136995) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var31 > 0 && class159.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + var2 - 1][var20 - 1] & 19136899) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class159.bufferX[var33] = var10;
												class159.bufferY[var33] = var11 - 1;
												var33 = var33 + 1 & 4095;
												class159.directions[var30][var31 - 1] = 1;
												class159.distances[var30][var31 - 1] = var21;
												break;
											}

											if ((var18[var19 + var22][var20 - 1] & 19136911) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var31 < 128 - var2 && class159.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + var2] & 19136824) == 0 && (var18[var19 + var2 - 1][var20 + var2] & 19136992) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class159.bufferX[var33] = var10;
												class159.bufferY[var33] = var11 + 1;
												var33 = var33 + 1 & 4095;
												class159.directions[var30][var31 + 1] = 4;
												class159.distances[var30][var31 + 1] = var21;
												break;
											}

											if ((var18[var22 + var19][var20 + var2] & 19137016) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var30 > 0 && var31 > 0 && class159.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2) {
												class159.bufferX[var33] = var10 - 1;
												class159.bufferY[var33] = var11 - 1;
												var33 = var33 + 1 & 4095;
												class159.directions[var30 - 1][var31 - 1] = 3;
												class159.distances[var30 - 1][var31 - 1] = var21;
												break;
											}

											if ((var18[var19 - 1][var22 + (var20 - 1)] & 19136830) != 0 || (var18[var22 + (var19 - 1)][var20 - 1] & 19136911) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var30 < 128 - var2 && var31 > 0 && class159.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + var2][var20 - 1] & 19136899) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2) {
												class159.bufferX[var33] = var10 + 1;
												class159.bufferY[var33] = var11 - 1;
												var33 = var33 + 1 & 4095;
												class159.directions[var30 + 1][var31 - 1] = 9;
												class159.distances[var30 + 1][var31 - 1] = var21;
												break;
											}

											if ((var18[var19 + var2][var22 + (var20 - 1)] & 19136995) != 0 || (var18[var19 + var22][var20 - 1] & 19136911) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var30 > 0 && var31 < 128 - var2 && class159.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + var2] & 19136824) == 0) {
										for (var22 = 1; var22 < var2; ++var22) {
											if ((var18[var19 - 1][var20 + var22] & 19136830) != 0 || (var18[var22 + (var19 - 1)][var20 + var2] & 19137016) != 0) {
												continue label743;
											}
										}

										class159.bufferX[var33] = var10 - 1;
										class159.bufferY[var33] = var11 + 1;
										var33 = var33 + 1 & 4095;
										class159.directions[var30 - 1][var31 + 1] = 6;
										class159.distances[var30 - 1][var31 + 1] = var21;
									}
								} while(var30 >= 128 - var2);
							} while(var31 >= 128 - var2);
						} while(class159.directions[var30 + 1][var31 + 1] != 0);
					} while((var18[var19 + var2][var20 + var2] & 19136992) != 0);

					for (var22 = 1; var22 < var2; ++var22) {
						if ((var18[var22 + var19][var20 + var2] & 19137016) != 0 || (var18[var19 + var2][var22 + var20] & 19136995) != 0) {
							continue label766;
						}
					}

					class159.bufferX[var33] = var10 + 1;
					class159.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 + 1][var31 + 1] = 12;
					class159.distances[var30 + 1][var31 + 1] = var21;
				}
			}

			var28 = var29;
		}

		var9 = var0 - 64;
		var10 = var1 - 64;
		var11 = UserComparator10.field1457;
		var30 = FaceNormal.field2363;
		if (!var28) {
			var31 = Integer.MAX_VALUE;
			var14 = Integer.MAX_VALUE;
			byte var32 = 10;
			var33 = var3.approxDestinationX;
			var17 = var3.approxDestinationY;
			int var27 = var3.approxDestinationSizeX;
			var19 = var3.approxDestinationSizeY;

			for (var20 = var33 - var32; var20 <= var33 + var32; ++var20) {
				for (var21 = var17 - var32; var21 <= var32 + var17; ++var21) {
					var22 = var20 - var9;
					int var23 = var21 - var10;
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class159.distances[var22][var23] < 100) {
						int var24 = 0;
						if (var20 < var33) {
							var24 = var33 - var20;
						} else if (var20 > var33 + var27 - 1) {
							var24 = var20 - (var33 + var27 - 1);
						}

						int var25 = 0;
						if (var21 < var17) {
							var25 = var17 - var21;
						} else if (var21 > var17 + var19 - 1) {
							var25 = var21 - (var19 + var17 - 1);
						}

						int var26 = var25 * var25 + var24 * var24;
						if (var26 < var31 || var31 == var26 && class159.distances[var22][var23] < var14) {
							var31 = var26;
							var14 = class159.distances[var22][var23];
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
			class159.bufferX[var13] = var11;
			var31 = var13 + 1;
			class159.bufferY[var13] = var30;

			for (var14 = var15 = class159.directions[var11 - var9][var30 - var10]; var0 != var11 || var30 != var1; var14 = class159.directions[var11 - var9][var30 - var10]) {
				if (var14 != var15) {
					var15 = var14;
					class159.bufferX[var31] = var11;
					class159.bufferY[var31++] = var30;
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
				var6[var33] = class159.bufferX[var31];
				var7[var33++] = class159.bufferY[var31];
				if (var33 >= var6.length) {
					break;
				}
			}

			return var33;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2145982637"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (MilliClock.World_request == null) {
				MilliClock.World_request = ServerPacket.urlRequester.request(new URL(class6.field58));
			} else if (MilliClock.World_request.isDone()) {
				byte[] var0 = MilliClock.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				Tiles.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = Tiles.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				SoundCache.sortWorlds(Tiles.World_worlds, 0, Tiles.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				MilliClock.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			MilliClock.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-28"
	)
	static void method803(Component var0) {
		var0.removeKeyListener(KeyHandler.KeyHandler_instance);
		var0.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field288 = -1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-61"
	)
	static final int method806(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(ZLnb;I)V",
		garbageValue = "-964489928"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field762 = 0;
		Client.field685 = 0;
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < Client.npcCount) {
			for (var4 = var3; var4 < Client.npcCount; ++var4) {
				Client.field771[++Client.field762 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			int var5;
			int var7;
			int var8;
			int var9;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = Client.npcIndices[var4];
				NPC var14 = Client.npcs[var5];
				var7 = var2.readBits(1);
				if (var7 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var5;
					var14.npcCycle = Client.cycle;
				} else {
					var8 = var2.readBits(2);
					if (var8 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var14.npcCycle = Client.cycle;
						Client.field686[++Client.field685 - 1] = var5;
					} else {
						int var10;
						if (var8 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
							var14.npcCycle = Client.cycle;
							var9 = var2.readBits(3);
							var14.method2259(var9, (byte)1);
							var10 = var2.readBits(1);
							if (var10 == 1) {
								Client.field686[++Client.field685 - 1] = var5;
							}
						} else if (var8 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
							var14.npcCycle = Client.cycle;
							var9 = var2.readBits(3);
							var14.method2259(var9, (byte)2);
							var10 = var2.readBits(3);
							var14.method2259(var10, (byte)2);
							int var11 = var2.readBits(1);
							if (var11 == 1) {
								Client.field686[++Client.field685 - 1] = var5;
							}
						} else if (var8 == 3) {
							Client.field771[++Client.field762 - 1] = var5;
						}
					}
				}
			}

			int var12;
			while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
				var12 = var1.readBits(15);
				if (var12 == 32767) {
					break;
				}

				boolean var15 = false;
				if (Client.npcs[var12] == null) {
					Client.npcs[var12] = new NPC();
					var15 = true;
				}

				NPC var13 = Client.npcs[var12];
				Client.npcIndices[++Client.npcCount - 1] = var12;
				var13.npcCycle = Client.cycle;
				var13.definition = StructComposition.getNpcDefinition(var1.readBits(14));
				if (var0) {
					var7 = var1.readBits(8);
					if (var7 > 127) {
						var7 -= 256;
					}
				} else {
					var7 = var1.readBits(5);
					if (var7 > 15) {
						var7 -= 32;
					}
				}

				int var6;
				if (var0) {
					var6 = var1.readBits(8);
					if (var6 > 127) {
						var6 -= 256;
					}
				} else {
					var6 = var1.readBits(5);
					if (var6 > 15) {
						var6 -= 32;
					}
				}

				var8 = Client.defaultRotations[var1.readBits(3)];
				if (var15) {
					var13.orientation = var13.rotation = var8;
				}

				var9 = var1.readBits(1);
				if (var9 == 1) {
					Client.field686[++Client.field685 - 1] = var12;
				}

				boolean var16 = var1.readBits(1) == 1;
				if (var16) {
					var1.readBits(32);
				}

				var5 = var1.readBits(1);
				var13.field1239 = var13.definition.size;
				var13.field1289 = var13.definition.rotation;
				if (var13.field1289 == 0) {
					var13.rotation = 0;
				}

				var13.walkSequence = var13.definition.walkSequence;
				var13.walkBackSequence = var13.definition.walkBackSequence;
				var13.walkLeftSequence = var13.definition.walkLeftSequence;
				var13.walkRightSequence = var13.definition.walkRightSequence;
				var13.idleSequence = var13.definition.idleSequence;
				var13.turnLeftSequence = var13.definition.turnLeftSequence;
				var13.turnRightSequence = var13.definition.turnRightSequence;
				var13.method2260(class93.localPlayer.pathX[0] + var6, class93.localPlayer.pathY[0] + var7, var5 == 1);
			}

			var1.exportIndex();
			ScriptEvent.method2094(var1);

			for (var12 = 0; var12 < Client.field762; ++var12) {
				var3 = Client.field771[var12];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var12 = 0; var12 < Client.npcCount; ++var12) {
					if (Client.npcs[Client.npcIndices[var12]] == null) {
						throw new RuntimeException(var12 + "," + Client.npcCount);
					}
				}

			}
		}
	}
}
