import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
final class class106 implements class323 {
	@ObfuscatedName("jv")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lme;)V"
	)
	class106(Widget var1) {
		this.val$cc = var1; // L: 513
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "120"
	)
	public void vmethod6111() {
		if (this.val$cc != null && this.val$cc.method6504().field3554 != null) { // L: 515
			ScriptEvent var1 = new ScriptEvent(); // L: 516
			var1.method2309(this.val$cc); // L: 517
			var1.setArgs(this.val$cc.method6504().field3554); // L: 518
			FaceNormal.method4805().addFirst(var1); // L: 519
		}

	} // L: 521

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Lca;II[I[IB)V",
		garbageValue = "60"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1; // L: 84
			int var7 = (var2 + var1) / 2; // L: 85
			World var8 = var0[var7]; // L: 86
			var0[var7] = var0[var1];
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

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001; // L: 139
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "16"
	)
	static final void method2748(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 76
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 77
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 78
					class350.field3891[0][var5][var4] = 127; // L: 79
					if (var0 == var5 && var5 > 0) { // L: 80
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 81
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 82
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 87

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Ltw;",
		garbageValue = "3"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(ItemContainer.cacheDir, "preferences" + var0 + ".dat"); // L: 265
		if (var3.exists()) { // L: 266
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 268
				return var10; // L: 269
			} catch (IOException var9) { // L: 271
			}
		}

		String var4 = ""; // L: 273
		if (Interpreter.cacheGamebuild == 33) { // L: 274
			var4 = "_rc";
		} else if (Interpreter.cacheGamebuild == 34) { // L: 275
			var4 = "_wip";
		}

		File var5 = new File(class388.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 276
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 277
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 279
				return var6; // L: 280
			} catch (IOException var8) { // L: 282
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 285
			return var6; // L: 286
		} catch (IOException var7) { // L: 288
			throw new RuntimeException(); // L: 289
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "101"
	)
	static final int method2747(int var0) {
		return Math.abs(var0 - class13.cameraYaw) > 1024 ? 2048 * (var0 < class13.cameraYaw ? 1 : -1) + var0 : var0; // L: 4013 4014
	}
}
