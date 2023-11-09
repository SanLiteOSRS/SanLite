import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-1153961088"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field3020.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort() * 4096; // L: 15
			super.regionYLow = var1.readUnsignedShort() * 64; // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method8928(); // L: 19
			super.fileId = var1.method8928(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;S)V",
		garbageValue = "128"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 25
		super.floorUnderlayIds = new short[1][64][64]; // L: 26
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 27
		super.field2988 = new byte[super.planes][64][64]; // L: 28
		super.field2985 = new byte[super.planes][64][64]; // L: 29
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 != class269.field3019.value) { // L: 32
			throw new IllegalStateException(""); // L: 33
		} else {
			int var3 = var1.readUnsignedByte(); // L: 35
			int var4 = var1.readUnsignedByte(); // L: 36
			if (var3 == super.regionX && var4 == super.regionY) { // L: 37
				for (int var5 = 0; var5 < 64; ++var5) { // L: 40
					for (int var6 = 0; var6 < 64; ++var6) { // L: 41
						this.readTile(var5, var6, var1); // L: 42
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 38
			}
		}
	} // L: 45

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 49
			return false; // L: 50
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1; // L: 52
			return var2.regionX == super.regionX && super.regionY == var2.regionY; // L: 53
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8; // L: 58
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lic;I)V",
		garbageValue = "756559938"
	)
	static final void method5058(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 90
			for (var7 = 0; var7 < 64; ++var7) { // L: 91
				for (var8 = 0; var8 < 64; ++var8) { // L: 92
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 93
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0); // L: 97

		for (var7 = 0; var7 < 4; ++var7) { // L: 98
			for (var8 = 0; var8 < 64; ++var8) { // L: 99
				for (int var9 = 0; var9 < 64; ++var9) { // L: 100
					int var10 = var8 + var1; // L: 101
					int var11 = var9 + var2; // L: 102
					DevicePcmPlayerProvider.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0); // L: 103
				}
			}
		}

	} // L: 107
}
