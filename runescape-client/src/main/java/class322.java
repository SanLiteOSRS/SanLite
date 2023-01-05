import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
public class class322 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ldu;FFFFFFFFI)V",
		garbageValue = "295803656"
	)
	static void method6388(class125 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) { // L: 325
			var0.field1543 = var1; // L: 328
			float var9 = var4 - var1; // L: 329
			float var10 = var8 - var5; // L: 330
			float var11 = var2 - var1; // L: 331
			float var12 = 0.0F; // L: 332
			float var13 = 0.0F; // L: 333
			if (0.0D != (double)var11) { // L: 334
				var12 = (var6 - var5) / var11; // L: 335
			}

			var11 = var4 - var3; // L: 337
			if ((double)var11 != 0.0D) { // L: 338
				var13 = (var8 - var7) / var11; // L: 339
			}

			float var14 = 1.0F / (var9 * var9); // L: 341
			float var15 = var12 * var9; // L: 342
			float var16 = var13 * var9; // L: 343
			var0.field1545 = (var16 + var15 - var10 - var10) * var14 / var9; // L: 344
			var0.field1559 = var14 * (var10 + var10 + var10 - var15 - var15 - var16); // L: 345
			var0.field1537 = var12; // L: 346
			var0.field1548 = var5; // L: 347
		}
	} // L: 326 348
}
