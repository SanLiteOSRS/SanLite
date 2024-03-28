import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public abstract class class185 {
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = 1621372683
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("at")
	String field1953;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	final class182 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhq;Ljava/lang/String;)V"
	)
	class185(class182 var1, String var2) {
		this.this$0 = var1;
		this.field1953 = var2; // L: 320
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1882788400"
	)
	public abstract int vmethod3670();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1487447727"
	)
	public int vmethod3671() {
		return -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-53"
	)
	public String vmethod3666() {
		return null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "127"
	)
	public String method3664() {
		return this.field1953;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FZB)F",
		garbageValue = "-75"
	)
	static float method3680(class131 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 252
		if (var0 != null && var0.method3020() != 0) { // L: 253
			float var4 = (float)var0.field1562[0].field1512; // L: 256
			float var5 = (float)var0.field1562[var0.method3020() - 1].field1512; // L: 257
			float var6 = var5 - var4; // L: 258
			if ((double)var6 == 0.0D) { // L: 259
				return var0.field1562[0].field1516; // L: 260
			} else {
				float var7 = 0.0F; // L: 262
				if (var1 > var5) { // L: 263
					var7 = (var1 - var5) / var6; // L: 264
				} else {
					var7 = (var1 - var4) / var6; // L: 267
				}

				double var8 = (double)((int)var7); // L: 269
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 270
				float var11 = var6 * var10; // L: 271
				var8 = Math.abs(1.0D + var8); // L: 272
				double var12 = var8 / 2.0D; // L: 273
				double var14 = (double)((int)var12); // L: 274
				var10 = (float)(var12 - var14); // L: 275
				float var16;
				float var17;
				if (var2) { // L: 278
					if (var0.field1573 == class129.field1544) { // L: 279
						if ((double)var10 != 0.0D) { // L: 280
							var11 += var4; // L: 281
						} else {
							var11 = var5 - var11; // L: 284
						}
					} else if (var0.field1573 != class129.field1545 && var0.field1573 != class129.field1547) { // L: 287
						if (var0.field1573 == class129.field1546) { // L: 290
							var11 = var4 - var1; // L: 291
							var16 = var0.field1562[0].field1511; // L: 292
							var17 = var0.field1562[0].field1510; // L: 293
							var3 = var0.field1562[0].field1516; // L: 294
							if ((double)var16 != 0.0D) { // L: 295
								var3 -= var17 * var11 / var16; // L: 296
							}

							return var3; // L: 298
						}
					} else {
						var11 = var5 - var11; // L: 288
					}
				} else if (var0.field1561 == class129.field1544) { // L: 302
					if ((double)var10 != 0.0D) { // L: 303
						var11 = var5 - var11; // L: 304
					} else {
						var11 += var4; // L: 307
					}
				} else if (var0.field1561 != class129.field1545 && var0.field1561 != class129.field1547) { // L: 310
					if (var0.field1561 == class129.field1546) { // L: 313
						var11 = var1 - var5; // L: 314
						var16 = var0.field1562[var0.method3020() - 1].field1509; // L: 315
						var17 = var0.field1562[var0.method3020() - 1].field1514; // L: 316
						var3 = var0.field1562[var0.method3020() - 1].field1516; // L: 317
						if ((double)var16 != 0.0D) { // L: 318
							var3 += var17 * var11 / var16; // L: 319
						}

						return var3; // L: 321
					}
				} else {
					var11 += var4; // L: 311
				}

				var3 = class406.method7449(var0, var11); // L: 324
				float var18;
				if (var2 && var0.field1573 == class129.field1547) { // L: 326
					var18 = var0.field1562[var0.method3020() - 1].field1516 - var0.field1562[0].field1516; // L: 327
					var3 = (float)((double)var3 - (double)var18 * var8); // L: 328
				} else if (!var2 && var0.field1561 == class129.field1547) { // L: 330
					var18 = var0.field1562[var0.method3020() - 1].field1516 - var0.field1562[0].field1516; // L: 331
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 332
				}

				return var3; // L: 334
			}
		} else {
			return var3; // L: 254
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "470268607"
	)
	static int method3669(int var0, Script var1, boolean var2) {
		return 2; // L: 5152
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1263121442"
	)
	static final void method3681(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12349
		var0 = 100 - var0; // L: 12350
		float var1 = (float)var0 / 200.0F + 0.5F; // L: 12351
		ReflectionCheck.method669((double)var1); // L: 12352
	} // L: 12353
}
