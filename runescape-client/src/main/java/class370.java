import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
public class class370 {
	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Leq;FFFFFFFFI)V",
		garbageValue = "-1317981737"
	)
	static void method6901(class129 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) { // L: 296
			var0.field1519 = var1; // L: 299
			float var9 = var4 - var1; // L: 300
			float var10 = var8 - var5; // L: 301
			float var11 = var2 - var1; // L: 302
			float var12 = 0.0F; // L: 303
			float var13 = 0.0F; // L: 304
			if ((double)var11 != 0.0D) { // L: 305
				var12 = (var6 - var5) / var11; // L: 306
			}

			var11 = var4 - var3; // L: 308
			if ((double)var11 != 0.0D) { // L: 309
				var13 = (var8 - var7) / var11; // L: 310
			}

			float var14 = 1.0F / (var9 * var9); // L: 312
			float var15 = var9 * var12; // L: 313
			float var16 = var9 * var13; // L: 314
			var0.field1522 = var14 * (var15 + var16 - var10 - var10) / var9; // L: 315
			var0.field1504 = var14 * (var10 + var10 + var10 - var15 - var15 - var16); // L: 316
			var0.field1514 = var12; // L: 317
			var0.field1515 = var5; // L: 318
		}
	} // L: 297 319
}
