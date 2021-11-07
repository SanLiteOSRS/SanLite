import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
public enum class283 implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	field3638(-1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	field3640(0),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	field3639(1),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	field3637(2);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 534862973
	)
	final int field3636;

	class283(int var3) {
		this.field3636 = var3;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3636;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)[Low;",
		garbageValue = "113976049"
	)
	static SpritePixels[] method5221() {
		SpritePixels[] var0 = new SpritePixels[class414.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < class414.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = class414.SpriteBuffer_spriteWidth;
			var2.height = class414.SpriteBuffer_spriteHeight;
			var2.xOffset = class414.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class414.SpriteBuffer_yOffsets[var1];
			var2.subWidth = UrlRequester.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = class414.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subHeight * var2.subWidth;
			byte[] var4 = class295.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				var2.pixels[var5] = HitSplatDefinition.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		PacketBuffer.method6913();
		return var0;
	}
}
