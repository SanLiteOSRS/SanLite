import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public enum class216 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field2382((byte)-1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field2380((byte)0),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field2381((byte)1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field2384((byte)2);

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1482767433
	)
	static int field2385;
	@ObfuscatedName("at")
	public byte field2383;

	class216(byte var3) {
		this.field2383 = var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2383;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "1067986658"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) { // L: 26
			var1 = -111;
		} else if (var0 == 8217) { // L: 27
			var1 = -110;
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-1449529411"
	)
	static int method4198(int var0, Script var1, boolean var2) {
		return 2; // L: 3199
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Lmo;IB)I",
		garbageValue = "-49"
	)
	static final int method4197(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10952
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10954
				int var3 = 0; // L: 10955
				int var4 = 0; // L: 10956
				byte var5 = 0; // L: 10957

				while (true) {
					int var6 = var2[var4++]; // L: 10959
					int var7 = 0; // L: 10960
					byte var8 = 0; // L: 10961
					if (var6 == 0) { // L: 10962
						return var3;
					}

					if (var6 == 1) { // L: 10963
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10964
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10965
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10966
						var9 = var2[var4++] << 16; // L: 10967
						var9 += var2[var4++]; // L: 10968
						var10 = ArchiveDiskActionHandler.getWidget(var9); // L: 10969
						var11 = var2[var4++]; // L: 10970
						if (var11 != -1 && (!class230.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10971
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10972
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10973
									var7 += var10.field3740[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10977
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10978
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10979
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10980
						var7 = HitSplatDefinition.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10981
						for (var9 = 0; var9 < 25; ++var9) { // L: 10982
							if (Skills.Skills_enabled[var9]) { // L: 10983
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10986
						var9 = var2[var4++] << 16; // L: 10987
						var9 += var2[var4++]; // L: 10988
						var10 = ArchiveDiskActionHandler.getWidget(var9); // L: 10989
						var11 = var2[var4++]; // L: 10990
						if (var11 != -1 && (!class230.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10991
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10992
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10993
									var7 = 999999999; // L: 10994
									break; // L: 10995
								}
							}
						}
					}

					if (var6 == 11) { // L: 11000
						var7 = Client.field630;
					}

					if (var6 == 12) { // L: 11001
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11002
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11003
						int var13 = var2[var4++]; // L: 11004
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11005
					}

					if (var6 == 14) { // L: 11007
						var9 = var2[var4++]; // L: 11008
						var7 = class327.getVarbit(var9); // L: 11009
					}

					if (var6 == 15) { // L: 11011
						var8 = 1;
					}

					if (var6 == 16) { // L: 11012
						var8 = 2;
					}

					if (var6 == 17) { // L: 11013
						var8 = 3;
					}

					if (var6 == 18) { // L: 11014
						var7 = class147.baseX * 64 + (HitSplatDefinition.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11015
						var7 = ModeWhere.baseY * 64 + (HitSplatDefinition.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11016
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11017
						if (var5 == 0) { // L: 11018
							var3 += var7;
						}

						if (var5 == 1) { // L: 11019
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11020
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11021
							var3 *= var7;
						}

						var5 = 0; // L: 11022
					} else {
						var5 = var8; // L: 11024
					}
				}
			} catch (Exception var14) { // L: 11027
				return -1; // L: 11028
			}
		} else {
			return -2;
		}
	}
}
