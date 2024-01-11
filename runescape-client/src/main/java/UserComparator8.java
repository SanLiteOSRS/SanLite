import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;B)I",
		garbageValue = "4"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfx;FZB)F",
		garbageValue = "7"
	)
	static float method2944(class131 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 225
		if (var0 != null && var0.method3088() != 0) { // L: 226
			float var4 = (float)var0.field1545[0].field1483; // L: 229
			float var5 = (float)var0.field1545[var0.method3088() - 1].field1483; // L: 230
			float var6 = var5 - var4; // L: 231
			if (0.0D == (double)var6) { // L: 232
				return var0.field1545[0].field1480; // L: 233
			} else {
				float var7 = 0.0F; // L: 235
				if (var1 > var5) { // L: 236
					var7 = (var1 - var5) / var6; // L: 237
				} else {
					var7 = (var1 - var4) / var6; // L: 240
				}

				double var8 = (double)((int)var7); // L: 242
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 243
				float var11 = var6 * var10; // L: 244
				var8 = Math.abs(1.0D + var8); // L: 245
				double var12 = var8 / 2.0D; // L: 246
				double var14 = (double)((int)var12); // L: 247
				var10 = (float)(var12 - var14); // L: 248
				float var16;
				float var17;
				if (var2) { // L: 251
					if (var0.field1539 == class129.field1514) { // L: 252
						if (0.0D != (double)var10) { // L: 253
							var11 += var4; // L: 254
						} else {
							var11 = var5 - var11; // L: 257
						}
					} else if (var0.field1539 != class129.field1512 && var0.field1539 != class129.field1515) { // L: 260
						if (var0.field1539 == class129.field1510) { // L: 263
							var11 = var4 - var1; // L: 264
							var16 = var0.field1545[0].field1482; // L: 265
							var17 = var0.field1545[0].field1479; // L: 266
							var3 = var0.field1545[0].field1480; // L: 267
							if (0.0D != (double)var16) { // L: 268
								var3 -= var17 * var11 / var16; // L: 269
							}

							return var3; // L: 271
						}
					} else {
						var11 = var5 - var11; // L: 261
					}
				} else if (var0.field1530 == class129.field1514) { // L: 275
					if ((double)var10 != 0.0D) { // L: 276
						var11 = var5 - var11; // L: 277
					} else {
						var11 += var4; // L: 280
					}
				} else if (var0.field1530 != class129.field1512 && var0.field1530 != class129.field1515) { // L: 283
					if (var0.field1530 == class129.field1510) { // L: 286
						var11 = var1 - var5; // L: 287
						var16 = var0.field1545[var0.method3088() - 1].field1481; // L: 288
						var17 = var0.field1545[var0.method3088() - 1].field1484; // L: 289
						var3 = var0.field1545[var0.method3088() - 1].field1480; // L: 290
						if ((double)var16 != 0.0D) { // L: 291
							var3 += var11 * var17 / var16; // L: 292
						}

						return var3; // L: 294
					}
				} else {
					var11 += var4; // L: 284
				}

				var3 = class155.method3423(var0, var11); // L: 297
				float var18;
				if (var2 && var0.field1539 == class129.field1515) { // L: 299
					var18 = var0.field1545[var0.method3088() - 1].field1480 - var0.field1545[0].field1480; // L: 300
					var3 = (float)((double)var3 - (double)var18 * var8); // L: 301
				} else if (!var2 && var0.field1530 == class129.field1515) { // L: 303
					var18 = var0.field1545[var0.method3088() - 1].field1480 - var0.field1545[0].field1480; // L: 304
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 305
				}

				return var3; // L: 307
			}
		} else {
			return var3; // L: 227
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IIILdf;I)V",
		garbageValue = "146736324"
	)
	static void method2938(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) { // L: 3800
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3801
				int var5 = var0.soundEffects[var1] & 15; // L: 3802
				if ((var5 <= 0 || class93.clientPreferences.method2551() != 0) && (var5 != 0 || class93.clientPreferences.method2549() != 0)) { // L: 3803
					class152.method3320(var0.soundEffects[var1], var2, var3, var4 == class25.localPlayer); // L: 3804
				}
			}
		}
	} // L: 3805
}
