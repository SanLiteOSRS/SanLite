import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("at")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2067204969
	)
	@Export("world")
	public int world;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "-20611"
	)
	public static boolean method3135(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) { // L: 45
			return true;
		} else {
			if (var0 != 0) { // L: 46
				char[] var1 = class382.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true; // L: 53
					}
				}
			}

			return false; // L: 59
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltv;",
		garbageValue = "-1679973809"
	)
	@Export("FillMode_values")
	public static class512[] FillMode_values() {
		return new class512[]{class512.field5100, class512.field5099, class512.SOLID}; // L: 15
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Lmb;II)I",
		garbageValue = "-1156108421"
	)
	static final int method3137(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11194
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11196
				int var3 = 0; // L: 11197
				int var4 = 0; // L: 11198
				byte var5 = 0; // L: 11199

				while (true) {
					int var6 = var2[var4++]; // L: 11201
					int var7 = 0; // L: 11202
					byte var8 = 0; // L: 11203
					if (var6 == 0) { // L: 11204
						return var3;
					}

					if (var6 == 1) { // L: 11205
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11206
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11207
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11208
						var9 = var2[var4++] << 16; // L: 11209
						var9 += var2[var4++]; // L: 11210
						var10 = FriendSystem.getWidget(var9); // L: 11211
						var11 = var2[var4++]; // L: 11212
						if (var11 != -1 && (!class300.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11213
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11214
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11215
									var7 += var10.field3655[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11219
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11220
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11221
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11222
						var7 = Projectile.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11223
						for (var9 = 0; var9 < 25; ++var9) { // L: 11224
							if (Skills.Skills_enabled[var9]) { // L: 11225
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11228
						var9 = var2[var4++] << 16; // L: 11229
						var9 += var2[var4++]; // L: 11230
						var10 = FriendSystem.getWidget(var9); // L: 11231
						var11 = var2[var4++]; // L: 11232
						if (var11 != -1 && (!class300.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11233
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11234
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11235
									var7 = 999999999; // L: 11236
									break; // L: 11237
								}
							}
						}
					}

					if (var6 == 11) { // L: 11242
						var7 = Client.field679;
					}

					if (var6 == 12) { // L: 11243
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11244
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11245
						int var13 = var2[var4++]; // L: 11246
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11247
					}

					if (var6 == 14) { // L: 11249
						var9 = var2[var4++]; // L: 11250
						var7 = class343.getVarbit(var9); // L: 11251
					}

					if (var6 == 15) { // L: 11253
						var8 = 1;
					}

					if (var6 == 16) { // L: 11254
						var8 = 2;
					}

					if (var6 == 17) { // L: 11255
						var8 = 3;
					}

					if (var6 == 18) { // L: 11256
						var7 = class213.baseX * 64 + (Projectile.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11257
						var7 = class101.baseY * 64 + (Projectile.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11258
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11259
						if (var5 == 0) { // L: 11260
							var3 += var7;
						}

						if (var5 == 1) { // L: 11261
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11262
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11263
							var3 *= var7;
						}

						var5 = 0; // L: 11264
					} else {
						var5 = var8; // L: 11266
					}
				}
			} catch (Exception var14) { // L: 11269
				return -1; // L: 11270
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1726181691"
	)
	static final void method3136(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12240
		class10.clientPreferences.updateSoundEffectVolume(var0); // L: 12241
	} // L: 12242
}
