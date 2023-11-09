import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public enum class136 implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	field1593(1, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	field1594(3, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	field1595(2, 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	field1596(0, 3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	field1597(4, 4);

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 166719319
	)
	public final int field1600;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -560347297
	)
	@Export("id")
	final int id;

	class136(int var3, int var4) {
		this.field1600 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lew;FFFFFFFFB)V",
		garbageValue = "-88"
	)
	static void method3075(class127 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) { // L: 294
			var0.field1505 = var1; // L: 297
			float var9 = var4 - var1; // L: 298
			float var10 = var8 - var5; // L: 299
			float var11 = var2 - var1; // L: 300
			float var12 = 0.0F; // L: 301
			float var13 = 0.0F; // L: 302
			if ((double)var11 != 0.0D) { // L: 303
				var12 = (var6 - var5) / var11; // L: 304
			}

			var11 = var4 - var3; // L: 306
			if (0.0D != (double)var11) { // L: 307
				var13 = (var8 - var7) / var11; // L: 308
			}

			float var14 = 1.0F / (var9 * var9); // L: 310
			float var15 = var9 * var12; // L: 311
			float var16 = var13 * var9; // L: 312
			var0.field1521 = (var16 + var15 - var10 - var10) * var14 / var9; // L: 313
			var0.field1506 = (var10 + var10 + var10 - var15 - var15 - var16) * var14; // L: 314
			var0.field1507 = var12; // L: 315
			var0.field1500 = var5; // L: 316
		}
	} // L: 295 317
}
