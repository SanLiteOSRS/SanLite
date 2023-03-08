import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("f")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -20630993
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("b")
	static boolean field1381;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lda;FZI)F",
		garbageValue = "-2108882173"
	)
	static float method2821(class125 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 219
		if (var0 != null && var0.method3060() != 0) { // L: 220
			float var4 = (float)var0.field1524[0].field1474; // L: 223
			float var5 = (float)var0.field1524[var0.method3060() - 1].field1474; // L: 224
			float var6 = var5 - var4; // L: 225
			if ((double)var6 == 0.0D) { // L: 226
				return var0.field1524[0].field1467; // L: 227
			} else {
				float var7 = 0.0F; // L: 229
				if (var1 > var5) { // L: 230
					var7 = (var1 - var5) / var6; // L: 231
				} else {
					var7 = (var1 - var4) / var6; // L: 234
				}

				double var8 = (double)((int)var7); // L: 236
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 237
				float var11 = var10 * var6; // L: 238
				var8 = Math.abs(1.0D + var8); // L: 239
				double var12 = var8 / 2.0D; // L: 240
				double var14 = (double)((int)var12); // L: 241
				var10 = (float)(var12 - var14); // L: 242
				float var16;
				float var17;
				if (var2) { // L: 245
					if (var0.field1522 == class123.field1505) { // L: 246
						if ((double)var10 != 0.0D) { // L: 247
							var11 += var4; // L: 248
						} else {
							var11 = var5 - var11; // L: 251
						}
					} else if (var0.field1522 != class123.field1503 && var0.field1522 != class123.field1506) { // L: 254
						if (var0.field1522 == class123.field1504) { // L: 257
							var11 = var4 - var1; // L: 258
							var16 = var0.field1524[0].field1469; // L: 259
							var17 = var0.field1524[0].field1470; // L: 260
							var3 = var0.field1524[0].field1467; // L: 261
							if (0.0D != (double)var16) { // L: 262
								var3 -= var17 * var11 / var16; // L: 263
							}

							return var3; // L: 265
						}
					} else {
						var11 = var5 - var11; // L: 255
					}
				} else if (var0.field1541 == class123.field1505) { // L: 269
					if (0.0D != (double)var10) { // L: 270
						var11 = var5 - var11; // L: 271
					} else {
						var11 += var4; // L: 274
					}
				} else if (var0.field1541 != class123.field1503 && var0.field1541 != class123.field1506) { // L: 277
					if (var0.field1541 == class123.field1504) { // L: 280
						var11 = var1 - var5; // L: 281
						var16 = var0.field1524[var0.method3060() - 1].field1473; // L: 282
						var17 = var0.field1524[var0.method3060() - 1].field1472; // L: 283
						var3 = var0.field1524[var0.method3060() - 1].field1467; // L: 284
						if (0.0D != (double)var16) { // L: 285
							var3 += var17 * var11 / var16; // L: 286
						}

						return var3; // L: 288
					}
				} else {
					var11 += var4; // L: 278
				}

				var3 = UrlRequester.method2874(var0, var11); // L: 291
				float var18;
				if (var2 && var0.field1522 == class123.field1506) { // L: 293
					var18 = var0.field1524[var0.method3060() - 1].field1467 - var0.field1524[0].field1467; // L: 294
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 295
				} else if (!var2 && var0.field1541 == class123.field1506) { // L: 297
					var18 = var0.field1524[var0.method3060() - 1].field1467 - var0.field1524[0].field1467; // L: 298
					var3 = (float)((double)var3 + var8 * (double)var18); // L: 299
				}

				return var3; // L: 301
			}
		} else {
			return var3; // L: 221
		}
	}
}
