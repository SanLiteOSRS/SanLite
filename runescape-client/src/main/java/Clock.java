import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1541664401"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "64"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lmt;IIIB)V",
		garbageValue = "-28"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3657 == null) { // L: 1226
			throw new RuntimeException(); // L: 1227
		} else {
			var0.field3657[var1] = var2; // L: 1229
			var0.field3630[var1] = var3; // L: 1230
		}
	} // L: 1231

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Lmt;II)I",
		garbageValue = "-1427021078"
	)
	static final int method3568(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11276
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11278
				int var3 = 0; // L: 11279
				int var4 = 0; // L: 11280
				byte var5 = 0; // L: 11281

				while (true) {
					int var6 = var2[var4++]; // L: 11283
					int var7 = 0; // L: 11284
					byte var8 = 0; // L: 11285
					if (var6 == 0) { // L: 11286
						return var3;
					}

					if (var6 == 1) { // L: 11287
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11288
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11289
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11290
						var9 = var2[var4++] << 16; // L: 11291
						var9 += var2[var4++]; // L: 11292
						var10 = VarbitComposition.getWidget(var9); // L: 11293
						var11 = var2[var4++]; // L: 11294
						if (var11 != -1 && (!class125.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11295
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11296
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11297
									var7 += var10.field3755[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11301
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11302
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11303
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11304
						var7 = class136.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11305
						for (var9 = 0; var9 < 25; ++var9) { // L: 11306
							if (Skills.Skills_enabled[var9]) { // L: 11307
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11310
						var9 = var2[var4++] << 16; // L: 11311
						var9 += var2[var4++]; // L: 11312
						var10 = VarbitComposition.getWidget(var9); // L: 11313
						var11 = var2[var4++]; // L: 11314
						if (var11 != -1 && (!class125.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11315
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11316
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11317
									var7 = 999999999; // L: 11318
									break; // L: 11319
								}
							}
						}
					}

					if (var6 == 11) { // L: 11324
						var7 = Client.field690;
					}

					if (var6 == 12) { // L: 11325
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11326
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11327
						int var13 = var2[var4++]; // L: 11328
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11329
					}

					if (var6 == 14) { // L: 11331
						var9 = var2[var4++]; // L: 11332
						var7 = DecorativeObject.getVarbit(var9); // L: 11333
					}

					if (var6 == 15) { // L: 11335
						var8 = 1;
					}

					if (var6 == 16) { // L: 11336
						var8 = 2;
					}

					if (var6 == 17) { // L: 11337
						var8 = 3;
					}

					if (var6 == 18) { // L: 11338
						var7 = AbstractArchive.baseX * 64 + (class136.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11339
						var7 = class148.baseY * 64 + (class136.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11340
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11341
						if (var5 == 0) { // L: 11342
							var3 += var7;
						}

						if (var5 == 1) { // L: 11343
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11344
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11345
							var3 *= var7;
						}

						var5 = 0; // L: 11346
					} else {
						var5 = var8; // L: 11348
					}
				}
			} catch (Exception var14) { // L: 11351
				return -1; // L: 11352
			}
		} else {
			return -2;
		}
	}
}
