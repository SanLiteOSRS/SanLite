import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class205 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("Widget_cachedSprites")
	static final class205 Widget_cachedSprites;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2232;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2233;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2246;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2235;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2234;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2237;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2236;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2242;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2240;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2241;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2231;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2243;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2244;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1480867533
	)
	public final int field2245;

	static {
		Widget_cachedSprites = new class205(0); // L: 4
		field2232 = new class205(1); // L: 5
		field2233 = new class205(2); // L: 6
		field2246 = new class205(3); // L: 7
		field2235 = new class205(4, class192.field1983); // L: 8
		field2234 = new class205(5); // L: 9
		field2237 = new class205(6, class192.field1986); // L: 10
		field2236 = new class205(7, class192.field1987); // L: 11
		field2242 = new class205(8, class192.field1989); // L: 12
		field2240 = new class205(9, class192.field1985); // L: 13
		field2241 = new class205(10, class192.field1984); // L: 14
		field2231 = new class205(11, class192.field1982); // L: 15
		field2243 = new class205(12); // L: 16
		field2244 = new class205(13); // L: 17
	}

	class205(int var1) {
		this(var1, (class192)null);
	}

	@ObfuscatedSignature(
		descriptor = "(ILhc;)V"
	)
	class205(int var1, class192 var2) {
		this.field2245 = var1; // L: 21
	} // L: 22

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;IIB)Lup;",
		garbageValue = "0"
	)
	static IndexedSprite method4097(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			class162.SpriteBuffer_decode(var4); // L: 30
			var3 = true; // L: 31
		}

		if (!var3) { // L: 33
			return null;
		} else {
			IndexedSprite var5 = new IndexedSprite(); // L: 36
			var5.width = class541.SpriteBuffer_spriteWidth; // L: 37
			var5.height = GrandExchangeOfferWorldComparator.SpriteBuffer_spriteHeight; // L: 38
			var5.xOffset = class541.SpriteBuffer_xOffsets[0]; // L: 39
			var5.yOffset = class541.SpriteBuffer_yOffsets[0]; // L: 40
			var5.subWidth = class541.SpriteBuffer_spriteWidths[0]; // L: 41
			var5.subHeight = class520.SpriteBuffer_spriteHeights[0]; // L: 42
			var5.palette = class541.SpriteBuffer_spritePalette; // L: 43
			var5.pixels = class396.SpriteBuffer_pixels[0]; // L: 44
			class541.SpriteBuffer_xOffsets = null; // L: 46
			class541.SpriteBuffer_yOffsets = null; // L: 47
			class541.SpriteBuffer_spriteWidths = null; // L: 48
			class520.SpriteBuffer_spriteHeights = null; // L: 49
			class541.SpriteBuffer_spritePalette = null; // L: 50
			class396.SpriteBuffer_pixels = null; // L: 51
			return var5; // L: 55
		}
	}
}
