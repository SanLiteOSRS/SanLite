import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class231 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 123996879
	)
	int field2627;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2023826093
	)
	int field2622;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -432750495
	)
	int field2623;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1659013527
	)
	int field2624;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 182934649
	)
	int field2621;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -110408781
	)
	int field2626;

	class231(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field2627 = var1; // L: 12
		this.field2622 = var2; // L: 13
		this.field2623 = var3; // L: 14
		this.field2624 = var4; // L: 15
		this.field2621 = var5; // L: 16
		this.field2626 = var6; // L: 17
	} // L: 18

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1321505638"
	)
	public static boolean method4798(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0; // L: 9
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[Lum;",
		garbageValue = "-1525162499"
	)
	public static IndexedSprite[] method4797() {
		IndexedSprite[] var0 = new IndexedSprite[class527.SpriteBuffer_spriteCount]; // L: 186

		for (int var1 = 0; var1 < class527.SpriteBuffer_spriteCount; ++var1) { // L: 187
			IndexedSprite var2 = var0[var1] = new IndexedSprite(); // L: 188
			var2.width = class527.SpriteBuffer_spriteWidth; // L: 189
			var2.height = class527.SpriteBuffer_spriteHeight; // L: 190
			var2.xOffset = class527.SpriteBuffer_xOffsets[var1]; // L: 191
			var2.yOffset = class527.SpriteBuffer_yOffsets[var1]; // L: 192
			var2.subWidth = class496.SpriteBuffer_spriteWidths[var1]; // L: 193
			var2.subHeight = BuddyRankComparator.SpriteBuffer_spriteHeights[var1]; // L: 194
			var2.palette = class527.SpriteBuffer_spritePalette; // L: 195
			var2.pixels = class464.SpriteBuffer_pixels[var1]; // L: 196
		}

		class527.SpriteBuffer_xOffsets = null; // L: 199
		class527.SpriteBuffer_yOffsets = null; // L: 200
		class496.SpriteBuffer_spriteWidths = null; // L: 201
		BuddyRankComparator.SpriteBuffer_spriteHeights = null; // L: 202
		class527.SpriteBuffer_spritePalette = null; // L: 203
		class464.SpriteBuffer_pixels = null; // L: 204
		return var0; // L: 206
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lmm;B)Z",
		garbageValue = "-21"
	)
	static boolean method4799(PlayerComposition var0) {
		if (var0.equipment[0] < 512) { // L: 1065
			return false; // L: 1069
		} else {
			ItemComposition var1 = class141.ItemComposition_get(var0.equipment[0] - 512); // L: 1066
			return var1.maleModel1 != class209.field2313.field2316 && var1.maleModel2 != class209.field2313.field2316; // L: 1067
		}
	}
}
