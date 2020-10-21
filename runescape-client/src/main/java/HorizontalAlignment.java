import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ljy;"
	)
	field3481(1, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Ljy;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Ljy;"
	)
	field3479(0, 2);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1229271323
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1995234347
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Liw;III)[Llc;",
		garbageValue = "2130018574"
	)
	public static SpritePixels[] method4882(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class217.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			SpritePixels[] var5 = new SpritePixels[class336.SpriteBuffer_spriteCount];

			for (int var6 = 0; var6 < class336.SpriteBuffer_spriteCount; ++var6) {
				SpritePixels var7 = var5[var6] = new SpritePixels();
				var7.width = class336.SpriteBuffer_spriteWidth;
				var7.height = class336.SpriteBuffer_spriteHeight;
				var7.xOffset = class336.SpriteBuffer_xOffsets[var6];
				var7.yOffset = class225.SpriteBuffer_yOffsets[var6];
				var7.subWidth = class336.SpriteBuffer_spriteWidths[var6];
				var7.subHeight = class336.SpriteBuffer_spriteHeights[var6];
				int var8 = var7.subHeight * var7.subWidth;
				byte[] var9 = class13.SpriteBuffer_pixels[var6];
				var7.pixels = new int[var8];

				for (int var10 = 0; var10 < var8; ++var10) {
					var7.pixels[var10] = WorldMapID.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			class336.SpriteBuffer_xOffsets = null;
			class225.SpriteBuffer_yOffsets = null;
			class336.SpriteBuffer_spriteWidths = null;
			class336.SpriteBuffer_spriteHeights = null;
			WorldMapID.SpriteBuffer_spritePalette = null;
			class13.SpriteBuffer_pixels = null;
			return var5;
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-874256905"
	)
	static int method4876(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "1158098047"
	)
	static final String method4880(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
