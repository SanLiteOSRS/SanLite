import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 272991891
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 754094051
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -644010773
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1805234219
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1829364501
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2048396349
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1973016615
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1669534475
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1580023959
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1163870055
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1236846997
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 808496867
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1728394355
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -981337131
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-1844012640"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1501827396"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-356013678"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-79"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Lie;",
		garbageValue = "494177498"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-682362313"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1539376631"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "714098050"
	)
	public static void method3917(int var0) {
		if (class247.musicPlayerStatus != 0) {
			class247.musicTrackVolume = var0;
		} else {
			class247.midiPcmStream.setPcmStreamVolume(var0);
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lko;III)Low;",
		garbageValue = "-1166598704"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !BuddyRankComparator.SpriteBuffer_loadSpritesFromArchive(var0, var1, var2) ? null : ItemLayer.method4107();
	}
}
