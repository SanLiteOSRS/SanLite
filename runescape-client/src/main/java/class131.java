import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class131 implements class372 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	static final class131 field1556;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	static final class131 field1557;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	static final class131 field1560;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	static final class131 field1559;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	static final class131 field1562;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	static final class131 field1561;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field1565;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1754916441
	)
	final int field1569;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -419776961
	)
	final int field1563;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 419187749
	)
	final int field1564;

	static {
		field1556 = new class131(0, 0, (String)null, 0); // L: 14
		field1557 = new class131(1, 1, (String)null, 9); // L: 15
		field1560 = new class131(2, 2, (String)null, 3); // L: 16
		field1559 = new class131(3, 3, (String)null, 6); // L: 17
		field1562 = new class131(4, 4, (String)null, 1); // L: 18
		field1561 = new class131(5, 5, (String)null, 3); // L: 19
	}

	class131(int var1, int var2, String var3, int var4) {
		this.field1569 = var1; // L: 25
		this.field1563 = var2; // L: 26
		this.field1564 = var4; // L: 27
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1580346823"
	)
	int method3018() {
		return this.field1564;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1563; // L: 36
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lia;",
		garbageValue = "-1250585364"
	)
	public static FloorOverlayDefinition method3024(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 28
		if (var1 != null) { // L: 29
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 30
			var1 = new FloorOverlayDefinition(); // L: 31
			if (var2 != null) { // L: 32
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 33
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}
}
