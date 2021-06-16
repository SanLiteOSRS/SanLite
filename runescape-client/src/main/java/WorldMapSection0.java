import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -1160309187
	)
	static int field2038;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 389090953
	)
	static int field2047;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -55376569
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1457760887
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -288902471
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 20509859
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 96413413
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -515923129
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1499525307
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 697420279
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1525307811
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 93550631
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -301719127
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1292488093
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1252351887
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1541153839
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lfa;B)V",
		garbageValue = "120"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2105423832"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-173753307"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2086451205"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIB)Liw;",
		garbageValue = "-36"
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
		descriptor = "(Lnt;I)V",
		garbageValue = "1313413902"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "518606194"
	)
	@Export("postRead")
	void postRead() {
	}
}
