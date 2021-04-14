import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1430426623
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1788634945
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 109249363
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1024482067
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "370119865"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field1744.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 4096;
			super.regionYLow = var1.readUnsignedShort() * 4096;
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.method6597();
			super.fileId = var1.method6597();
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-930076916"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field1690 = new byte[super.planes][64][64];
		super.field1700 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class157.field1733.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "28"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1048633905"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "3"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "16"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (super.regionX == var2.regionX && super.regionY == var2.regionY) {
				return var2.chunkX == this.chunkX && var2.chunkY == this.chunkY;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lnu;IIIIIIB)V",
		garbageValue = "117"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -class148.method3015(var4 + var2 + 932731, var5 + var3 + 556238) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var8 = var0.readUnsignedByte();
					if (var8 == 1) {
						var8 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
					}
					break;
				}

				if (var7 <= 49) {
					Tiles.field1092[var1][var2][var3] = var0.readByte();
					Tiles.field1091[var1][var2][var3] = (byte)((var7 - 2) / 4);
					class362.field4079[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
				} else {
					class9.field69[var1][var2][var3] = (byte)(var7 - 81);
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var7 <= 49) {
					var0.readUnsignedByte();
				}
			}
		}

	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		signature = "(Lcd;I)V",
		garbageValue = "-716218662"
	)
	static final void method2990(Actor var0) {
		if (var0.field1268 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > class225.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
			int var1 = var0.field1268 - var0.field1255;
			int var2 = Client.cycle - var0.field1255;
			int var3 = var0.field1240 * 128 + var0.field1258 * 64;
			int var4 = var0.field1253 * 128 + var0.field1258 * 64;
			int var5 = var0.field1252 * 128 + var0.field1258 * 64;
			int var6 = var0.field1239 * 128 + var0.field1258 * 64;
			var0.x = (var2 * var5 + var3 * (var1 - var2)) / var1;
			var0.y = (var2 * var6 + var4 * (var1 - var2)) / var1;
		}

		var0.field1267 = 0;
		var0.orientation = var0.field1213;
		var0.rotation = var0.orientation;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		signature = "(Lcv;ZI)V",
		garbageValue = "827368922"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			WorldMapRegion.method2929(var2);
		}

		class9.method118(var2);
		Widget var4 = class139.getWidget(var3);
		if (var4 != null) {
			class29.invalidateWidget(var4);
		}

		AbstractWorldMapIcon.method3186();
		if (Client.rootInterface != -1) {
			class379.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
