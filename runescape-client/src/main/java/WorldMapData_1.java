import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("gl")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -957655755
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 715644495
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -15721613
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 372018729
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "-1612873456"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field3030.value) { // L: 15
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 18
			super.planes = var1.readUnsignedByte(); // L: 19
			super.regionXLow = var1.readUnsignedShort() * 4096; // L: 20
			super.regionYLow = var1.readUnsignedShort() * 4096; // L: 21
			this.chunkXLow = var1.readUnsignedByte(); // L: 22
			this.chunkYLow = var1.readUnsignedByte(); // L: 23
			super.regionX = var1.readUnsignedShort(); // L: 24
			super.regionY = var1.readUnsignedShort(); // L: 25
			this.chunkX = var1.readUnsignedByte(); // L: 26
			this.chunkY = var1.readUnsignedByte(); // L: 27
			super.groupId = var1.method9095(); // L: 28
			super.fileId = var1.method9095(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "959046816"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 34
		super.floorUnderlayIds = new short[1][64][64]; // L: 35
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 36
		super.field2993 = new byte[super.planes][64][64]; // L: 37
		super.field2994 = new byte[super.planes][64][64]; // L: 38
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 39
		int var2 = var1.readUnsignedByte(); // L: 40
		if (var2 != class269.field3022.value) { // L: 41
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "117"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 76
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1794235757"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 80
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1199859241"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 84
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2128968374"
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
			if (super.regionX == var2.regionX && var2.regionY == super.regionY) { // L: 64
				return this.chunkX == var2.chunkX && var2.chunkY == this.chunkY; // L: 67
			} else {
				return false; // L: 65
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 72
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lsj;",
		garbageValue = "41"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class135.cacheDir, "preferences" + var0 + ".dat"); // L: 181
		if (var3.exists()) { // L: 182
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 184
				return var10; // L: 185
			} catch (IOException var9) { // L: 187
			}
		}

		String var4 = ""; // L: 189
		if (UserComparator6.cacheGamebuild == 33) { // L: 190
			var4 = "_rc";
		} else if (UserComparator6.cacheGamebuild == 34) { // L: 191
			var4 = "_wip";
		}

		File var5 = new File(class133.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 192
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 193
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 195
				return var6; // L: 196
			} catch (IOException var8) { // L: 198
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 201
			return var6; // L: 202
		} catch (IOException var7) { // L: 204
			throw new RuntimeException(); // L: 205
		}
	}
}
