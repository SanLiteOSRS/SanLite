import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class127 extends class126 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1638542091
	)
	int field1523;
	@ObfuscatedName("l")
	boolean field1520;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldk;)V"
	)
	class127(class129 var1) {
		this.this$0 = var1;
		this.field1523 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "703192976"
	)
	void vmethod3019(Buffer var1) {
		this.field1523 = var1.readUnsignedShort();
		this.field1520 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "750335300"
	)
	void vmethod3020(ClanSettings var1) {
		var1.method2883(this.field1523, this.field1520);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldt;FB)F",
		garbageValue = "32"
	)
	static float method2767(class115 var0, float var1) {
		if (var0 != null && var0.method2617() != 0) {
			if (var1 < (float)var0.field1430[0].field1377) {
				return var0.field1422 == class114.field1408 ? var0.field1430[0].field1384 : LoginType.method7148(var0, var1, true);
			} else if (var1 > (float)var0.field1430[var0.method2617() - 1].field1377) {
				return var0.field1420 == class114.field1408 ? var0.field1430[var0.method2617() - 1].field1384 : LoginType.method7148(var0, var1, false);
			} else if (var0.field1418) {
				return var0.field1430[0].field1384;
			} else {
				class111 var2 = var0.method2616(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (0.0D == (double)var2.field1381 && (double)var2.field1378 == 0.0D) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1381 && Float.MAX_VALUE == var2.field1378) {
						var4 = true;
					} else if (var2.field1383 != null) {
						if (var0.field1419) {
							float[] var5 = new float[4];
							float[] var6 = new float[4];
							var5[0] = (float)var2.field1377;
							var6[0] = var2.field1384;
							var5[1] = var5[0] + var2.field1381 * 0.33333334F;
							var6[1] = var6[0] + 0.33333334F * var2.field1378;
							var5[3] = (float)var2.field1383.field1377;
							var6[3] = var2.field1383.field1384;
							var5[2] = var5[3] - 0.33333334F * var2.field1383.field1379;
							var6[2] = var6[3] - 0.33333334F * var2.field1383.field1380;
							if (var0.field1434) {
								if (var0 != null) {
									float var7 = var5[3] - var5[0];
									if ((double)var7 != 0.0D) {
										float var8 = var5[1] - var5[0];
										float var9 = var5[2] - var5[0];
										Float var10 = var8 / var7;
										Float var11 = var9 / var7;
										var0.field1421 = var10 == 0.33333334F && var11 == 0.6666667F;
										float var12 = var10;
										float var13 = var11;
										if ((double)var10 < 0.0D) {
											var10 = 0.0F;
										}

										if ((double)var11 > 1.0D) {
											var11 = 1.0F;
										}

										if ((double)var10 > 1.0D || var11 < -1.0F) {
											Float var14 = var10;
											Float var15 = 1.0F - var11;
											if (var10 < 0.0F) {
												var14 = 0.0F;
											}

											if (var15 < 0.0F) {
												var15 = 0.0F;
											}

											if (var14 > 1.0F || var15 > 1.0F) {
												float var16 = (float)((double)(var14 * (var14 - 2.0F + var15)) + (double)var15 * ((double)var15 - 2.0D) + 1.0D);
												if (class112.field1386 + var16 > 0.0F) {
													class12.method155(var14, var15);
												}
											}

											var15 = 1.0F - var15;
										}

										if (var10 != var12) {
											var5[1] = var5[0] + var10 * var7;
											if ((double)var12 != 0.0D) {
												var6[1] = var6[0] + (var6[1] - var6[0]) * var10 / var12;
											}
										}

										if (var11 != var13) {
											var5[2] = var5[0] + var11 * var7;
											if (1.0D != (double)var13) {
												var6[2] = (float)((double)var6[3] - (double)(var6[3] - var6[2]) * (1.0D - (double)var11) / (1.0D - (double)var13));
											}
										}

										var0.field1423 = var5[0];
										var0.field1424 = var5[3];
										class344.method6252(0.0F, var10, var11, 1.0F, var0.field1425);
										class344.method6252(var6[0], var6[1], var6[2], var6[3], var0.field1426);
									}
								}
							} else {
								class147.method2998(var0, var5, var6);
							}

							var0.field1419 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1384;
					} else if (var4) {
						return var1 != (float)var2.field1377 && var2.field1383 != null ? var2.field1383.field1384 : var2.field1384;
					} else {
						return var0.field1434 ? class252.method4974(var0, var1) : SecureRandomFuture.method1973(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1705912467"
	)
	static final void method2765(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field714[var4] = true;
			}
		}

	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lcf;ZI)V",
		garbageValue = "-243703217"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			MusicPatchNode.method5276(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) {
			if ((long)var2 == (var4.key >> 48 & 65535L)) {
				var4.remove();
			}
		}

		Widget var5 = class130.getWidget(var3);
		if (var5 != null) {
			class112.invalidateWidget(var5);
		}

		FontName.decrementMenuEntries();
		if (Client.rootInterface != -1) {
			DevicePcmPlayerProvider.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
