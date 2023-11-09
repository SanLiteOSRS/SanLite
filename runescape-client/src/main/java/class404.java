import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public class class404 {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ldb;FZI)F",
		garbageValue = "1955665606"
	)
	static float method7600(class124 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 211
		if (var0 != null && var0.method2880() != 0) { // L: 212
			float var4 = (float)var0.field1493[0].field1441; // L: 215
			float var5 = (float)var0.field1493[var0.method2880() - 1].field1441; // L: 216
			float var6 = var5 - var4; // L: 217
			if ((double)var6 == 0.0D) { // L: 218
				return var0.field1493[0].field1438; // L: 219
			} else {
				float var7 = 0.0F; // L: 221
				if (var1 > var5) { // L: 222
					var7 = (var1 - var5) / var6; // L: 223
				} else {
					var7 = (var1 - var4) / var6; // L: 226
				}

				double var8 = (double)((int)var7); // L: 228
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 229
				float var11 = var6 * var10; // L: 230
				var8 = Math.abs(var8 + 1.0D); // L: 231
				double var12 = var8 / 2.0D; // L: 232
				double var14 = (double)((int)var12); // L: 233
				var10 = (float)(var12 - var14); // L: 234
				float var16;
				float var17;
				if (var2) { // L: 237
					if (var0.field1490 == class123.field1472) { // L: 238
						if ((double)var10 != 0.0D) { // L: 239
							var11 += var4; // L: 240
						} else {
							var11 = var5 - var11; // L: 243
						}
					} else if (var0.field1490 != class123.field1474 && var0.field1490 != class123.field1473) { // L: 246
						if (var0.field1490 == class123.field1471) { // L: 249
							var11 = var4 - var1; // L: 250
							var16 = var0.field1493[0].field1440; // L: 251
							var17 = var0.field1493[0].field1439; // L: 252
							var3 = var0.field1493[0].field1438; // L: 253
							if ((double)var16 != 0.0D) { // L: 254
								var3 -= var11 * var17 / var16; // L: 255
							}

							return var3; // L: 257
						}
					} else {
						var11 = var5 - var11; // L: 247
					}
				} else if (var0.field1489 == class123.field1472) { // L: 261
					if ((double)var10 != 0.0D) { // L: 262
						var11 = var5 - var11; // L: 263
					} else {
						var11 += var4; // L: 266
					}
				} else if (var0.field1489 != class123.field1474 && var0.field1489 != class123.field1473) { // L: 269
					if (var0.field1489 == class123.field1471) { // L: 272
						var11 = var1 - var5; // L: 273
						var16 = var0.field1493[var0.method2880() - 1].field1442; // L: 274
						var17 = var0.field1493[var0.method2880() - 1].field1443; // L: 275
						var3 = var0.field1493[var0.method2880() - 1].field1438; // L: 276
						if (0.0D != (double)var16) { // L: 277
							var3 += var11 * var17 / var16; // L: 278
						}

						return var3; // L: 280
					}
				} else {
					var11 += var4; // L: 270
				}

				var3 = class132.method2966(var0, var11); // L: 283
				float var18;
				if (var2 && var0.field1490 == class123.field1473) { // L: 285
					var18 = var0.field1493[var0.method2880() - 1].field1438 - var0.field1493[0].field1438; // L: 286
					var3 = (float)((double)var3 - (double)var18 * var8); // L: 287
				} else if (!var2 && var0.field1489 == class123.field1473) { // L: 289
					var18 = var0.field1493[var0.method2880() - 1].field1438 - var0.field1493[0].field1438; // L: 290
					var3 = (float)((double)var3 + var8 * (double)var18); // L: 291
				}

				return var3; // L: 293
			}
		} else {
			return var3; // L: 213
		}
	}
}
