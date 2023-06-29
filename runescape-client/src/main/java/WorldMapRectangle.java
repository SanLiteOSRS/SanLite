import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1076784797
	)
	@Export("width")
	int width;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 289845951
	)
	@Export("height")
	int height;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1144330999
	)
	@Export("x")
	int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -63228659
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lje;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lsw;",
		garbageValue = "1075897911"
	)
	public static class490 method5458(int var0) {
		int var1 = class488.field4966[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class490.field4973; // L: 21
		} else if (var1 == 2) { // L: 23
			return class490.field4976; // L: 24
		} else {
			return var1 == 3 ? class490.field4972 : null; // L: 26 27 29
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Ljava/lang/String;Ljava/lang/String;I)[Ltj;",
		garbageValue = "-2037926568"
	)
	public static IndexedSprite[] method5460(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 95
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 96
			int var4 = var0.getFileId(var3, var2); // L: 97
			byte[] var7 = var0.takeFile(var3, var4); // L: 102
			boolean var6;
			if (var7 == null) { // L: 103
				var6 = false; // L: 104
			} else {
				UserComparator2.SpriteBuffer_decode(var7); // L: 107
				var6 = true; // L: 108
			}

			IndexedSprite[] var5;
			if (!var6) { // L: 110
				var5 = null; // L: 111
			} else {
				IndexedSprite[] var8 = new IndexedSprite[class515.SpriteBuffer_spriteCount]; // L: 116

				for (int var9 = 0; var9 < class515.SpriteBuffer_spriteCount; ++var9) { // L: 117
					IndexedSprite var10 = var8[var9] = new IndexedSprite(); // L: 118
					var10.width = class330.SpriteBuffer_spriteWidth; // L: 119
					var10.height = class489.SpriteBuffer_spriteHeight; // L: 120
					var10.xOffset = class515.SpriteBuffer_xOffsets[var9]; // L: 121
					var10.yOffset = class402.SpriteBuffer_yOffsets[var9]; // L: 122
					var10.subWidth = class515.SpriteBuffer_spriteWidths[var9]; // L: 123
					var10.subHeight = class515.SpriteBuffer_spriteHeights[var9]; // L: 124
					var10.palette = class515.SpriteBuffer_spritePalette; // L: 125
					var10.pixels = class515.SpriteBuffer_pixels[var9]; // L: 126
				}

				TextureProvider.method4758(); // L: 128
				var5 = var8; // L: 131
			}

			return var5; // L: 133
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Ljava/lang/String;Ljava/lang/String;B)Ltj;",
		garbageValue = "115"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 137
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 138
			int var4 = var0.getFileId(var3, var2); // L: 139
			byte[] var7 = var0.takeFile(var3, var4); // L: 144
			boolean var6;
			if (var7 == null) { // L: 145
				var6 = false; // L: 146
			} else {
				UserComparator2.SpriteBuffer_decode(var7); // L: 149
				var6 = true; // L: 150
			}

			IndexedSprite var5;
			if (!var6) { // L: 152
				var5 = null; // L: 153
			} else {
				IndexedSprite var8 = new IndexedSprite(); // L: 158
				var8.width = class330.SpriteBuffer_spriteWidth; // L: 159
				var8.height = class489.SpriteBuffer_spriteHeight; // L: 160
				var8.xOffset = class515.SpriteBuffer_xOffsets[0]; // L: 161
				var8.yOffset = class402.SpriteBuffer_yOffsets[0]; // L: 162
				var8.subWidth = class515.SpriteBuffer_spriteWidths[0]; // L: 163
				var8.subHeight = class515.SpriteBuffer_spriteHeights[0]; // L: 164
				var8.palette = class515.SpriteBuffer_spritePalette; // L: 165
				var8.pixels = class515.SpriteBuffer_pixels[0]; // L: 166
				TextureProvider.method4758(); // L: 167
				var5 = var8; // L: 170
			}

			return var5; // L: 172
		}
	}
}
