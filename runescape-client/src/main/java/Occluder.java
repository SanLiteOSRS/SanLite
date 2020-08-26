import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("le")
	@ObfuscatedSignature(
		signature = "Lhq;"
	)
	static Widget field1950;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 299619711
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1317670669
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -322147255
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2083623235
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2131844695
	)
	@Export("type")
	int type;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -453208547
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -985593835
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1472483077
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 459569369
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2090994579
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1349976535
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 686332819
	)
	int field1941;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2005053087
	)
	int field1946;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -909874575
	)
	int field1943;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -327653701
	)
	int field1944;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1910772051
	)
	int field1945;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1391395895
	)
	int field1930;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 34718795
	)
	int field1947;

	Occluder() {
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "([BB)V",
		garbageValue = "-61"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class335.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		Username.SpriteBuffer_xOffsets = new int[class335.SpriteBuffer_spriteCount];
		class335.SpriteBuffer_yOffsets = new int[class335.SpriteBuffer_spriteCount];
		class335.SpriteBuffer_spriteWidths = new int[class335.SpriteBuffer_spriteCount];
		class335.SpriteBuffer_spriteHeights = new int[class335.SpriteBuffer_spriteCount];
		class92.SpriteBuffer_pixels = new byte[class335.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class335.SpriteBuffer_spriteCount * 8;
		class335.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class335.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class335.SpriteBuffer_spriteCount; ++var3) {
			Username.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class335.SpriteBuffer_spriteCount; ++var3) {
			class335.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class335.SpriteBuffer_spriteCount; ++var3) {
			class335.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class335.SpriteBuffer_spriteCount; ++var3) {
			class335.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class335.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		TaskHandler.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			TaskHandler.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (TaskHandler.SpriteBuffer_spritePalette[var3] == 0) {
				TaskHandler.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class335.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class335.SpriteBuffer_spriteWidths[var3];
			int var5 = class335.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			class92.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}
}
