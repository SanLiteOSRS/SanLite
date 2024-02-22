import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public abstract class class297 implements class299 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -27562183
	)
	protected int field3147;

	@ObfuscatedSignature(
		descriptor = "(Lox;Lpe;I)V"
	)
	protected class297(StudioGame var1, Language var2, int var3) {
		this.field3147 = var3; // L: 10
	} // L: 11

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Luh;",
		garbageValue = "-113"
	)
	public static class521 method5966(int var0) {
		int var1 = class519.field5119[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class521.field5125; // L: 21
		} else if (var1 == 2) { // L: 23
			return class521.field5126; // L: 24
		} else {
			return var1 == 3 ? class521.field5128 : null; // L: 26 27 29
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FZI)F",
		garbageValue = "587235743"
	)
	static float method5965(class132 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 220
		if (var0 != null && var0.method3091() != 0) { // L: 221
			float var4 = (float)var0.field1559[0].field1501; // L: 224
			float var5 = (float)var0.field1559[var0.method3091() - 1].field1501; // L: 225
			float var6 = var5 - var4; // L: 226
			if ((double)var6 == 0.0D) { // L: 227
				return var0.field1559[0].field1500; // L: 228
			} else {
				float var7 = 0.0F; // L: 230
				if (var1 > var5) { // L: 231
					var7 = (var1 - var5) / var6; // L: 232
				} else {
					var7 = (var1 - var4) / var6; // L: 235
				}

				double var8 = (double)((int)var7); // L: 237
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 238
				float var11 = var6 * var10; // L: 239
				var8 = Math.abs(var8 + 1.0D); // L: 240
				double var12 = var8 / 2.0D; // L: 241
				double var14 = (double)((int)var12); // L: 242
				var10 = (float)(var12 - var14); // L: 243
				float var16;
				float var17;
				if (var2) { // L: 246
					if (var0.field1557 == class130.field1544) { // L: 247
						if (0.0D != (double)var10) { // L: 248
							var11 += var4; // L: 249
						} else {
							var11 = var5 - var11; // L: 252
						}
					} else if (var0.field1557 != class130.field1540 && var0.field1557 != class130.field1541) { // L: 255
						if (var0.field1557 == class130.field1539) { // L: 258
							var11 = var4 - var1; // L: 259
							var16 = var0.field1559[0].field1503; // L: 260
							var17 = var0.field1559[0].field1502; // L: 261
							var3 = var0.field1559[0].field1500; // L: 262
							if ((double)var16 != 0.0D) { // L: 263
								var3 -= var17 * var11 / var16; // L: 264
							}

							return var3; // L: 266
						}
					} else {
						var11 = var5 - var11; // L: 256
					}
				} else if (var0.field1574 == class130.field1544) { // L: 270
					if (0.0D != (double)var10) { // L: 271
						var11 = var5 - var11; // L: 272
					} else {
						var11 += var4; // L: 275
					}
				} else if (var0.field1574 != class130.field1540 && var0.field1574 != class130.field1541) { // L: 278
					if (var0.field1574 == class130.field1539) { // L: 281
						var11 = var1 - var5; // L: 282
						var16 = var0.field1559[var0.method3091() - 1].field1499; // L: 283
						var17 = var0.field1559[var0.method3091() - 1].field1506; // L: 284
						var3 = var0.field1559[var0.method3091() - 1].field1500; // L: 285
						if ((double)var16 != 0.0D) { // L: 286
							var3 += var11 * var17 / var16; // L: 287
						}

						return var3; // L: 289
					}
				} else {
					var11 += var4; // L: 279
				}

				var3 = Tile.method5276(var0, var11); // L: 292
				float var18;
				if (var2 && var0.field1557 == class130.field1541) { // L: 294
					var18 = var0.field1559[var0.method3091() - 1].field1500 - var0.field1559[0].field1500; // L: 295
					var3 = (float)((double)var3 - (double)var18 * var8); // L: 296
				} else if (!var2 && var0.field1574 == class130.field1541) { // L: 298
					var18 = var0.field1559[var0.method3091() - 1].field1500 - var0.field1559[0].field1500; // L: 299
					var3 = (float)((double)var3 + var8 * (double)var18); // L: 300
				}

				return var3; // L: 302
			}
		} else {
			return var3; // L: 222
		}
	}
}
