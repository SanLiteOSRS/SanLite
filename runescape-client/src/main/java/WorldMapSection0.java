import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -465345147
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -202719925
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 47110693
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1315329307
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -445154313
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1054372917
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 755868073
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1795067773
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -662709525
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1849440565
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1861847067
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1830088993
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -878235337
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2049654615
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lar;B)V",
		garbageValue = "100"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IIII)Z",
		garbageValue = "-339896458"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-2135820245"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "-1761492451"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(III)Lhg;",
		garbageValue = "-1553504587"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "2144381737"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "60"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IS)Liv;",
		garbageValue = "15751"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		signature = "(B)Lmx;",
		garbageValue = "122"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return Message.worldMap;
	}
}
