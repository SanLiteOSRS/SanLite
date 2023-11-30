import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1632182417
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1512330425
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1705979805
	)
	@Export("z")
	int z;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2066830911
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lky;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;B)V",
		garbageValue = "-54"
	)
	public static void method5701(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lol;IIB)[Luz;",
		garbageValue = "-73"
	)
	public static SpritePixels[] method5702(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 61
		boolean var3;
		if (var4 == null) { // L: 62
			var3 = false; // L: 63
		} else {
			class162.SpriteBuffer_decode(var4); // L: 66
			var3 = true; // L: 67
		}

		if (!var3) { // L: 69
			return null;
		} else {
			SpritePixels[] var5 = new SpritePixels[class541.SpriteBuffer_spriteCount]; // L: 72

			for (int var6 = 0; var6 < class541.SpriteBuffer_spriteCount; ++var6) { // L: 73
				SpritePixels var7 = var5[var6] = new SpritePixels(); // L: 74
				var7.width = class541.SpriteBuffer_spriteWidth; // L: 75
				var7.height = GrandExchangeOfferWorldComparator.SpriteBuffer_spriteHeight; // L: 76
				var7.xOffset = class541.SpriteBuffer_xOffsets[var6]; // L: 77
				var7.yOffset = class541.SpriteBuffer_yOffsets[var6]; // L: 78
				var7.subWidth = class541.SpriteBuffer_spriteWidths[var6]; // L: 79
				var7.subHeight = class520.SpriteBuffer_spriteHeights[var6]; // L: 80
				int var8 = var7.subHeight * var7.subWidth; // L: 81
				byte[] var9 = class396.SpriteBuffer_pixels[var6]; // L: 82
				var7.pixels = new int[var8]; // L: 83

				for (int var10 = 0; var10 < var8; ++var10) { // L: 84
					var7.pixels[var10] = class541.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			class541.SpriteBuffer_xOffsets = null; // L: 87
			class541.SpriteBuffer_yOffsets = null; // L: 88
			class541.SpriteBuffer_spriteWidths = null; // L: 89
			class520.SpriteBuffer_spriteHeights = null; // L: 90
			class541.SpriteBuffer_spritePalette = null; // L: 91
			class396.SpriteBuffer_pixels = null; // L: 92
			return var5; // L: 96
		}
	}
}
