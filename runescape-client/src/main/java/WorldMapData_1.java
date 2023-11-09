import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1765296863
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1203816743
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 317340627
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1712735273
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-2019675961"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field2992.value) { // L: 15
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 64;
			super.regionYLow = var1.readUnsignedShort() * 4096; // L: 21
			this.chunkXLow = var1.readUnsignedByte(); // L: 22
			this.chunkYLow = var1.readUnsignedByte(); // L: 23
			super.regionX = var1.readUnsignedShort(); // L: 24
			super.regionY = var1.readUnsignedShort(); // L: 25
			this.chunkX = var1.readUnsignedByte(); // L: 26
			this.chunkY = var1.readUnsignedByte(); // L: 27
			super.groupId = var1.method8638(); // L: 28
			super.fileId = var1.method8638(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-724858915"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 34
		super.floorUnderlayIds = new short[1][64][64]; // L: 35
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 36
		super.field2949 = new byte[super.planes][64][64]; // L: 37
		super.field2952 = new byte[super.planes][64][64]; // L: 38
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 39
		int var2 = var1.readUnsignedByte(); // L: 40
		if (var2 != class258.field2986.value) { // L: 41
			throw new IllegalStateException(""); // L: 42
		} else {
			int var3 = var1.readUnsignedByte(); // L: 44
			int var4 = var1.readUnsignedByte(); // L: 45
			int var5 = var1.readUnsignedByte(); // L: 46
			int var6 = var1.readUnsignedByte(); // L: 47
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) { // L: 48
				for (int var7 = 0; var7 < 8; ++var7) { // L: 51
					for (int var8 = 0; var8 < 8; ++var8) { // L: 52
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1); // L: 53
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 49
			}
		}
	} // L: 56

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "567378271"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 76
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-90"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 80
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "71"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 84
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "180"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 88
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 60
			return false; // L: 61
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 63
			if (var2.regionX == super.regionX && super.regionY == var2.regionY) { // L: 64
				return var2.chunkX == this.chunkX && var2.chunkY == this.chunkY; // L: 67
			} else {
				return false; // L: 65
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 72
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "409091364"
	)
	public static void method5111(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.field1890 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20
}
