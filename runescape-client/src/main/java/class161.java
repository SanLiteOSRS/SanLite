import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class161 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Les;",
		garbageValue = "-1661347291"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-2066180942"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Liv;II)I",
		garbageValue = "-1689981377"
	)
	static final int method3150(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = DevicePcmPlayerProvider.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!Strings.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = class35.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = DevicePcmPlayerProvider.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!Strings.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = ObjectComposition.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = JagexCache.baseX * 64 + (class35.localPlayer.x >> 7);
					}

					if (var6 == 19) {
						var7 = Messages.baseY * 64 + (class35.localPlayer.y >> 7);
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
