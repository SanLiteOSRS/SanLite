import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("au")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqb;Lqb;I)I",
		garbageValue = "-38492655"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lmx;I)V",
		garbageValue = "2064536991"
	)
	public static void method2896(Huffman var0) {
		class334.huffman = var0; // L: 14
	} // L: 15

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-273787824"
	)
	public static void method2901() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 423
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 424
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 425
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 426
	} // L: 427

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Lmi;IB)I",
		garbageValue = "1"
	)
	static final int method2900(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11197
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11199
				int var3 = 0; // L: 11200
				int var4 = 0; // L: 11201
				byte var5 = 0; // L: 11202

				while (true) {
					int var6 = var2[var4++]; // L: 11204
					int var7 = 0; // L: 11205
					byte var8 = 0; // L: 11206
					if (var6 == 0) { // L: 11207
						return var3;
					}

					if (var6 == 1) { // L: 11208
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11209
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11210
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11211
						var9 = var2[var4++] << 16; // L: 11212
						var9 += var2[var4++]; // L: 11213
						var10 = class92.getWidget(var9); // L: 11214
						var11 = var2[var4++]; // L: 11215
						if (var11 != -1 && (!InvDefinition.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11216
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11217
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11218
									var7 += var10.field3778[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11222
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11223
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11224
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11225
						var7 = VarbitComposition.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11226
						for (var9 = 0; var9 < 25; ++var9) { // L: 11227
							if (Skills.Skills_enabled[var9]) { // L: 11228
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11231
						var9 = var2[var4++] << 16; // L: 11232
						var9 += var2[var4++]; // L: 11233
						var10 = class92.getWidget(var9); // L: 11234
						var11 = var2[var4++]; // L: 11235
						if (var11 != -1 && (!InvDefinition.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11236
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11237
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11238
									var7 = 999999999; // L: 11239
									break; // L: 11240
								}
							}
						}
					}

					if (var6 == 11) { // L: 11245
						var7 = Client.field643;
					}

					if (var6 == 12) { // L: 11246
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11247
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11248
						int var13 = var2[var4++]; // L: 11249
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11250
					}

					if (var6 == 14) { // L: 11252
						var9 = var2[var4++]; // L: 11253
						var7 = ClientPreferences.getVarbit(var9); // L: 11254
					}

					if (var6 == 15) { // L: 11256
						var8 = 1;
					}

					if (var6 == 16) { // L: 11257
						var8 = 2;
					}

					if (var6 == 17) { // L: 11258
						var8 = 3;
					}

					if (var6 == 18) { // L: 11259
						var7 = UrlRequester.baseX * 64 + (VarbitComposition.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11260
						var7 = class47.baseY * 64 + (VarbitComposition.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11261
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11262
						if (var5 == 0) { // L: 11263
							var3 += var7;
						}

						if (var5 == 1) { // L: 11264
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11265
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11266
							var3 *= var7;
						}

						var5 = 0; // L: 11267
					} else {
						var5 = var8; // L: 11269
					}
				}
			} catch (Exception var14) { // L: 11272
				return -1; // L: 11273
			}
		} else {
			return -2;
		}
	}
}
