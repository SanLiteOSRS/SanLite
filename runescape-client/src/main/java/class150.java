import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class150 extends class135 {
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 1521218636482726287L
	)
	long field1711;
	@ObfuscatedName("f")
	String field1705;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -330562841
	)
	int field1708;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	final class138 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lel;)V"
	)
	class150(class138 var1) {
		this.this$0 = var1;
		this.field1711 = -1L; // L: 93
		this.field1705 = null; // L: 94
		this.field1708 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1428026624"
	)
	void vmethod3254(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1711 = var1.readLong(); // L: 102
		}

		this.field1705 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1708 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "-110"
	)
	void vmethod3248(ClanSettings var1) {
		var1.method3080(this.field1711, this.field1705, this.field1708); // L: 109
	} // L: 110

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ldb;[F[FB)V",
		garbageValue = "0"
	)
	static void method3171(class124 var0, float[] var1, float[] var2) {
		if (var0 != null) { // L: 297
			var0.field1485 = var1[0]; // L: 300
			float var3 = var1[3] - var1[0]; // L: 301
			float var4 = var2[3] - var2[0]; // L: 302
			float var5 = var1[1] - var1[0]; // L: 303
			float var6 = 0.0F; // L: 304
			float var7 = 0.0F; // L: 305
			if ((double)var5 != 0.0D) { // L: 306
				var6 = (var2[1] - var2[0]) / var5; // L: 307
			}

			var5 = var1[3] - var1[2]; // L: 309
			if (0.0D != (double)var5) { // L: 310
				var7 = (var2[3] - var2[2]) / var5; // L: 311
			}

			float var8 = 1.0F / (var3 * var3); // L: 313
			float var9 = var3 * var6; // L: 314
			float var10 = var7 * var3; // L: 315
			var0.field1487[0] = var8 * (var10 + var9 - var4 - var4) / var3; // L: 316
			var0.field1487[1] = var8 * (var4 + var4 + var4 - var9 - var9 - var10); // L: 317
			var0.field1487[2] = var6; // L: 318
			var0.field1487[3] = var2[0]; // L: 319
		}
	} // L: 298 320
}
