import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
public enum class512 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	field5096(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	field5098(2, 2);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2130647485
	)
	public final int field5099;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 241353675
	)
	final int field5100;

	class512(int var3, int var4) {
		this.field5099 = var3; // L: 19
		this.field5100 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5100; // L: 25
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lni;Ljava/lang/String;Ljava/lang/String;I)Lty;",
		garbageValue = "26968924"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 61
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 62
			int var4 = var0.getFileId(var3, var2); // L: 63
			IndexedSprite var5;
			if (!WorldMapAreaData.method5599(var0, var3, var4)) { // L: 66
				var5 = null; // L: 67
			} else {
				IndexedSprite var7 = new IndexedSprite(); // L: 72
				var7.width = class515.SpriteBuffer_spriteWidth; // L: 73
				var7.height = class515.SpriteBuffer_spriteHeight; // L: 74
				var7.xOffset = class515.SpriteBuffer_xOffsets[0]; // L: 75
				var7.yOffset = class515.SpriteBuffer_yOffsets[0]; // L: 76
				var7.subWidth = SecureRandomCallable.SpriteBuffer_spriteWidths[0]; // L: 77
				var7.subHeight = SecureRandomCallable.SpriteBuffer_spriteHeights[0]; // L: 78
				var7.palette = class515.SpriteBuffer_spritePalette; // L: 79
				var7.pixels = WorldMapDecoration.SpriteBuffer_pixels[0]; // L: 80
				FriendLoginUpdate.method7789(); // L: 81
				var5 = var7; // L: 84
			}

			return var5; // L: 86
		}
	}
}
