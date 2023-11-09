import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = -466596103
	)
	static int field1459;
	@ObfuscatedName("au")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqb;Lqb;I)I",
		garbageValue = "-1072568679"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lfh;FZI)F",
		garbageValue = "-229947551"
	)
	static float method2864(class130 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 233
		if (var0 != null && var0.method3000() != 0) { // L: 234
			float var4 = (float)var0.field1551[0].field1492; // L: 237
			float var5 = (float)var0.field1551[var0.method3000() - 1].field1492; // L: 238
			float var6 = var5 - var4; // L: 239
			if ((double)var6 == 0.0D) { // L: 240
				return var0.field1551[0].field1495; // L: 241
			} else {
				float var7 = 0.0F; // L: 243
				if (var1 > var5) { // L: 244
					var7 = (var1 - var5) / var6; // L: 245
				} else {
					var7 = (var1 - var4) / var6; // L: 248
				}

				double var8 = (double)((int)var7); // L: 250
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 251
				float var11 = var10 * var6; // L: 252
				var8 = Math.abs(1.0D + var8); // L: 253
				double var12 = var8 / 2.0D; // L: 254
				double var14 = (double)((int)var12); // L: 255
				var10 = (float)(var12 - var14); // L: 256
				float var16;
				float var17;
				if (var2) { // L: 259
					if (var0.field1549 == class128.field1538) { // L: 260
						if ((double)var10 != 0.0D) { // L: 261
							var11 += var4; // L: 262
						} else {
							var11 = var5 - var11; // L: 265
						}
					} else if (var0.field1549 != class128.field1531 && var0.field1549 != class128.field1532) { // L: 268
						if (var0.field1549 == class128.field1534) { // L: 271
							var11 = var4 - var1; // L: 272
							var16 = var0.field1551[0].field1503; // L: 273
							var17 = var0.field1551[0].field1493; // L: 274
							var3 = var0.field1551[0].field1495; // L: 275
							if (0.0D != (double)var16) { // L: 276
								var3 -= var11 * var17 / var16; // L: 277
							}

							return var3; // L: 279
						}
					} else {
						var11 = var5 - var11; // L: 269
					}
				} else if (var0.field1571 == class128.field1538) { // L: 283
					if ((double)var10 != 0.0D) { // L: 284
						var11 = var5 - var11; // L: 285
					} else {
						var11 += var4; // L: 288
					}
				} else if (var0.field1571 != class128.field1531 && var0.field1571 != class128.field1532) { // L: 291
					if (var0.field1571 == class128.field1534) { // L: 294
						var11 = var1 - var5; // L: 295
						var16 = var0.field1551[var0.method3000() - 1].field1496; // L: 296
						var17 = var0.field1551[var0.method3000() - 1].field1497; // L: 297
						var3 = var0.field1551[var0.method3000() - 1].field1495; // L: 298
						if (0.0D != (double)var16) { // L: 299
							var3 += var17 * var11 / var16; // L: 300
						}

						return var3; // L: 302
					}
				} else {
					var11 += var4; // L: 292
				}

				var3 = Skeleton.method4516(var0, var11); // L: 305
				float var18;
				if (var2 && var0.field1549 == class128.field1532) { // L: 307
					var18 = var0.field1551[var0.method3000() - 1].field1495 - var0.field1551[0].field1495; // L: 308
					var3 = (float)((double)var3 - (double)var18 * var8); // L: 309
				} else if (!var2 && var0.field1571 == class128.field1532) { // L: 311
					var18 = var0.field1551[var0.method3000() - 1].field1495 - var0.field1551[0].field1495; // L: 312
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 313
				}

				return var3; // L: 315
			}
		} else {
			return var3; // L: 235
		}
	}
}
