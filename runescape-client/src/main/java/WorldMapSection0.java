import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1379468797
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1978034363
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1418706877
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -455262703
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1189566559
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1025005161
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2060231737
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1972325381
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -402429253
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2143866963
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1182995105
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1073244035
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1074307305
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 726894699
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhr;I)V",
		garbageValue = "2069930856"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "81"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "42159517"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "22240711"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lju;",
		garbageValue = "5000"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;S)V",
		garbageValue = "-15299"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-109463717"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-27466891"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class440.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class141.SpriteBuffer_xOffsets = new int[class440.SpriteBuffer_spriteCount];
		RouteStrategy.SpriteBuffer_yOffsets = new int[class440.SpriteBuffer_spriteCount];
		class432.SpriteBuffer_spriteWidths = new int[class440.SpriteBuffer_spriteCount];
		class330.SpriteBuffer_spriteHeights = new int[class440.SpriteBuffer_spriteCount];
		class369.SpriteBuffer_pixels = new byte[class440.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class440.SpriteBuffer_spriteCount * 8;
		class432.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class432.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class440.SpriteBuffer_spriteCount; ++var3) {
			class141.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class440.SpriteBuffer_spriteCount; ++var3) {
			RouteStrategy.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class440.SpriteBuffer_spriteCount; ++var3) {
			class432.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class440.SpriteBuffer_spriteCount; ++var3) {
			class330.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class440.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class432.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			class432.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class432.SpriteBuffer_spritePalette[var3] == 0) {
				class432.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class440.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class432.SpriteBuffer_spriteWidths[var3];
			int var5 = class330.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			class369.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}

	}
}
