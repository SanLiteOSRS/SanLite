import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	field1989(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	field1991(1, 2);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1755817801
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1231264227
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1029796628"
	)
	public static int method3662(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var0;
		} else if (var2 == 1) { // L: 24
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 25 26
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[Lty;",
		garbageValue = "-2125531572"
	)
	static IndexedSprite[] method3665() {
		IndexedSprite[] var0 = new IndexedSprite[class515.SpriteBuffer_spriteCount]; // L: 152

		for (int var1 = 0; var1 < class515.SpriteBuffer_spriteCount; ++var1) { // L: 153
			IndexedSprite var2 = var0[var1] = new IndexedSprite(); // L: 154
			var2.width = class515.SpriteBuffer_spriteWidth; // L: 155
			var2.height = class515.SpriteBuffer_spriteHeight; // L: 156
			var2.xOffset = class515.SpriteBuffer_xOffsets[var1]; // L: 157
			var2.yOffset = class515.SpriteBuffer_yOffsets[var1]; // L: 158
			var2.subWidth = SecureRandomCallable.SpriteBuffer_spriteWidths[var1]; // L: 159
			var2.subHeight = SecureRandomCallable.SpriteBuffer_spriteHeights[var1]; // L: 160
			var2.palette = class515.SpriteBuffer_spritePalette; // L: 161
			var2.pixels = WorldMapDecoration.SpriteBuffer_pixels[var1]; // L: 162
		}

		FriendLoginUpdate.method7789(); // L: 164
		return var0; // L: 165
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)V",
		garbageValue = "-1788372872"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field751) { // L: 11880
			Client.field693[var0.rootIndex] = true; // L: 11881
		}

	} // L: 11883

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(IIIILtt;Lme;I)V",
		garbageValue = "-1560550873"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12356
			int var6 = Client.camAngleY & 2047; // L: 12357
			int var7 = var3 * var3 + var2 * var2; // L: 12358
			if (var7 <= 6400) { // L: 12359
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12360
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12361
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12362
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12363
				if (var7 > 2500) {
					var4.method9447(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12364
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12365
				}

			}
		}
	} // L: 12366
}
