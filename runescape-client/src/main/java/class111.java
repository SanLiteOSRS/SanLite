import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class111 implements class110 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;B)V",
		garbageValue = "22"
	)
	public static void method2466(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIILfw;Lfk;B)Z",
		garbageValue = "70"
	)
	static final boolean method2467(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0;
		int var6 = var1;
		byte var7 = 64;
		byte var8 = 64;
		int var9 = var0 - var7;
		int var10 = var1 - var8;
		class174.directions[var7][var8] = 99;
		class174.distances[var7][var8] = 0;
		byte var11 = 0;
		int var12 = 0;
		class174.bufferX[var11] = var0;
		int var20 = var11 + 1;
		class174.bufferY[var11] = var1;
		int[][] var13 = var4.flags;

		while (true) {
			label307:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label284:
							do {
								if (var12 == var20) {
									class150.field1601 = var5;
									class174.field1991 = var6;
									return false;
								}

								var5 = class174.bufferX[var12];
								var6 = class174.bufferY[var12];
								var12 = var12 + 1 & 4095;
								var18 = var5 - var9;
								var19 = var6 - var10;
								var14 = var5 - var4.xInset;
								var15 = var6 - var4.yInset;
								if (var3.hasArrived(var2, var5, var6, var4)) {
									class150.field1601 = var5;
									class174.field1991 = var6;
									return true;
								}

								var16 = class174.distances[var18][var19] + 1;
								if (var18 > 0 && class174.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class174.bufferX[var20] = var5 - 1;
											class174.bufferY[var20] = var6;
											var20 = var20 + 1 & 4095;
											class174.directions[var18 - 1][var19] = 2;
											class174.distances[var18 - 1][var19] = var16;
											break;
										}

										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 < 128 - var2 && class174.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class174.bufferX[var20] = var5 + 1;
											class174.bufferY[var20] = var6;
											var20 = var20 + 1 & 4095;
											class174.directions[var18 + 1][var19] = 8;
											class174.distances[var18 + 1][var19] = var16;
											break;
										}

										if ((var13[var14 + var2][var15 + var17] & 19136995) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var19 > 0 && class174.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class174.bufferX[var20] = var5;
											class174.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class174.directions[var18][var19 - 1] = 1;
											class174.distances[var18][var19 - 1] = var16;
											break;
										}

										if ((var13[var17 + var14][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var19 < 128 - var2 && class174.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class174.bufferX[var20] = var5;
											class174.bufferY[var20] = var6 + 1;
											var20 = var20 + 1 & 4095;
											class174.directions[var18][var19 + 1] = 4;
											class174.distances[var18][var19 + 1] = var16;
											break;
										}

										if ((var13[var14 + var17][var15 + var2] & 19137016) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 > 0 && var19 > 0 && class174.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class174.bufferX[var20] = var5 - 1;
											class174.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class174.directions[var18 - 1][var19 - 1] = 3;
											class174.distances[var18 - 1][var19 - 1] = var16;
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class174.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class174.bufferX[var20] = var5 + 1;
											class174.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class174.directions[var18 + 1][var19 - 1] = 9;
											class174.distances[var18 + 1][var19 - 1] = var16;
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var17 + var14][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class174.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) {
									for (var17 = 1; var17 < var2; ++var17) {
										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) {
											continue label284;
										}
									}

									class174.bufferX[var20] = var5 - 1;
									class174.bufferY[var20] = var6 + 1;
									var20 = var20 + 1 & 4095;
									class174.directions[var18 - 1][var19 + 1] = 6;
									class174.distances[var18 - 1][var19 + 1] = var16;
								}
							} while(var18 >= 128 - var2);
						} while(var19 >= 128 - var2);
					} while(class174.directions[var18 + 1][var19 + 1] != 0);
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0);

				for (var17 = 1; var17 < var2; ++var17) {
					if ((var13[var17 + var14][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var17 + var15] & 19136995) != 0) {
						continue label307;
					}
				}

				class174.bufferX[var20] = var5 + 1;
				class174.bufferY[var20] = var6 + 1;
				var20 = var20 + 1 & 4095;
				class174.directions[var18 + 1][var19 + 1] = 12;
				class174.distances[var18 + 1][var19 + 1] = var16;
			}
		}
	}
}
