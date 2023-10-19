import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("VarcInt_archive")
	static AbstractArchive VarcInt_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static IndexedSprite field1964;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1868545271
	)
	static int field1959;
	@ObfuscatedName("ak")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	VarcInt() {
		this.persist = false; // L: 12
	} // L: 14

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-1749757315"
	)
	void method3671(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.method3680(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;IB)V",
		garbageValue = "7"
	)
	void method3680(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.persist = true; // L: 40
		}

	} // L: 43

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1764742883"
	)
	public static int method3679(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 112
		return (var0 + var2) / var1 - var2; // L: 113
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lom;II)V",
		garbageValue = "-1876796577"
	)
	public static void method3677(AbstractArchive var0, int var1) {
		if (!class319.field3440.isEmpty()) { // L: 152
			ArrayList var2 = new ArrayList(); // L: 155
			Iterator var3 = class319.field3440.iterator(); // L: 156

			while (var3.hasNext()) {
				class331 var4 = (class331)var3.next(); // L: 157
				var4.field3545 = false; // L: 159
				var4.field3547 = false; // L: 160
				var4.field3546 = false; // L: 161
				var4.field3550 = false; // L: 162
				var4.field3544 = var0; // L: 163
				var4.field3541 = var1; // L: 164
				var4.field3542 = 0.0F; // L: 165
				var2.add(var4); // L: 166
			}

			class148.method3166(var2, class319.field3437, class319.field3438, class319.field3436, class319.field3430, false); // L: 169
		}
	} // L: 153 170

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1597661026"
	)
	static final boolean method3678() {
		return Client.isMenuOpen; // L: 9306
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Lnm;II)I",
		garbageValue = "-599828632"
	)
	static final int method3681(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11275
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11277
				int var3 = 0; // L: 11278
				int var4 = 0; // L: 11279
				byte var5 = 0; // L: 11280

				while (true) {
					int var6 = var2[var4++]; // L: 11282
					int var7 = 0; // L: 11283
					byte var8 = 0; // L: 11284
					if (var6 == 0) { // L: 11285
						return var3;
					}

					if (var6 == 1) { // L: 11286
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11287
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11288
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11289
						var9 = var2[var4++] << 16; // L: 11290
						var9 += var2[var4++]; // L: 11291
						var10 = class33.field184.method6240(var9); // L: 11292
						var11 = var2[var4++]; // L: 11293
						if (var11 != -1 && (!class214.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11294
							for (var12 = 0; var12 < var10.field3786.length; ++var12) { // L: 11295
								if (var11 + 1 == var10.field3786[var12]) { // L: 11296
									var7 += var10.field3809[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11300
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11301
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11302
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11303
						var7 = TextureProvider.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11304
						for (var9 = 0; var9 < 25; ++var9) { // L: 11305
							if (Skills.Skills_enabled[var9]) { // L: 11306
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11309
						var9 = var2[var4++] << 16; // L: 11310
						var9 += var2[var4++]; // L: 11311
						var10 = class33.field184.method6240(var9); // L: 11312
						var11 = var2[var4++]; // L: 11313
						if (var11 != -1 && (!class214.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11314
							for (var12 = 0; var12 < var10.field3786.length; ++var12) { // L: 11315
								if (var11 + 1 == var10.field3786[var12]) { // L: 11316
									var7 = 999999999; // L: 11317
									break; // L: 11318
								}
							}
						}
					}

					if (var6 == 11) { // L: 11323
						var7 = Client.field695;
					}

					if (var6 == 12) { // L: 11324
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11325
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11326
						int var13 = var2[var4++]; // L: 11327
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11328
					}

					if (var6 == 14) { // L: 11330
						var9 = var2[var4++]; // L: 11331
						var7 = class36.getVarbit(var9); // L: 11332
					}

					if (var6 == 15) { // L: 11334
						var8 = 1;
					}

					if (var6 == 16) { // L: 11335
						var8 = 2;
					}

					if (var6 == 17) { // L: 11336
						var8 = 3;
					}

					if (var6 == 18) { // L: 11337
						var7 = class20.baseX * 64 + (TextureProvider.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11338
						var7 = class19.baseY * 64 + (TextureProvider.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11339
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11340
						if (var5 == 0) { // L: 11341
							var3 += var7;
						}

						if (var5 == 1) { // L: 11342
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11343
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11344
							var3 *= var7;
						}

						var5 = 0; // L: 11345
					} else {
						var5 = var8; // L: 11347
					}
				}
			} catch (Exception var14) { // L: 11350
				return -1; // L: 11351
			}
		} else {
			return -2;
		}
	}
}
