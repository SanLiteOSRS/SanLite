import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class186 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	static EvictingDualNodeHashTable field1949;

	static {
		field1949 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Lcj;II[I[II)V",
		garbageValue = "1766620800"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 82
			int var5 = var1 - 1; // L: 83
			int var6 = var2 + 1; // L: 84
			int var7 = (var2 + var1) / 2; // L: 85
			World var8 = var0[var7]; // L: 86
			var0[var7] = var0[var1]; // L: 87
			var0[var1] = var8; // L: 88

			while (var5 < var6) { // L: 89
				boolean var9 = true; // L: 90

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 92

					for (var10 = 0; var10 < 4; ++var10) { // L: 93
						if (var3[var10] == 2) { // L: 96
							var11 = var0[var6].index; // L: 97
							var12 = var8.index; // L: 98
						} else if (var3[var10] == 1) { // L: 100
							var11 = var0[var6].population; // L: 101
							var12 = var8.population; // L: 102
							if (var11 == -1 && var4[var10] == 1) { // L: 103
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 104
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 106
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 107
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 108
						} else {
							var11 = var0[var6].id; // L: 111
							var12 = var8.id; // L: 112
						}

						if (var11 != var12) { // L: 114
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 117 118
								var9 = false; // L: 120
							}
							break;
						}

						if (var10 == 3) { // L: 115
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 125

				do {
					++var5; // L: 127

					for (var10 = 0; var10 < 4; ++var10) { // L: 128
						if (var3[var10] == 2) { // L: 131
							var11 = var0[var5].index; // L: 132
							var12 = var8.index; // L: 133
						} else if (var3[var10] == 1) { // L: 135
							var11 = var0[var5].population; // L: 136
							var12 = var8.population; // L: 137
							if (var11 == -1 && var4[var10] == 1) { // L: 138
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 139
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 141
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 142
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 143
						} else {
							var11 = var0[var5].id; // L: 146
							var12 = var8.id; // L: 147
						}

						if (var11 != var12) { // L: 149
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 152 153
								var9 = false; // L: 155
							}
							break;
						}

						if (var10 == 3) { // L: 150
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 160
					World var13 = var0[var5]; // L: 161
					var0[var5] = var0[var6]; // L: 162
					var0[var6] = var13; // L: 163
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 166
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 167
		}

	} // L: 169

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(IZZZZZB)Lom;",
		garbageValue = "0"
	)
	static Archive method3684(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		ArchiveDisk var6 = null; // L: 2036
		if (JagexCache.JagexCache_dat2File != null) { // L: 2037
			var6 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class173.JagexCache_idxFiles[var0], 1000000); // L: 2038
		}

		return new Archive(var6, class155.field1730, class356.field3897, var0, var1, var2, var3, var4, var5); // L: 2040
	}
}
