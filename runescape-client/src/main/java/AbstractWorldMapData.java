import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -260648960
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1355267776
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2081682071
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1016035147
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 639511485
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 441540085
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1726818165
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1111164981
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("k")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("r")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("p")
	byte[][][] field2063;
	@ObfuscatedName("a")
	byte[][][] field2064;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[[[[Lfg;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("d")
	boolean field2066;
	@ObfuscatedName("u")
	boolean field2067;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2066 = false;
		this.field2067 = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "1915938242"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2052268063"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2066 && this.field2067;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljp;B)V",
		garbageValue = "56"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2066 = true;
				this.field2067 = true;
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2063 = null;
		this.field2064 = null;
		this.decorations = null;
		this.field2066 = false;
		this.field2067 = false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILnk;I)V",
		garbageValue = "-1976219247"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method3546(var1, var2, var3, var4);
			} else {
				this.method3547(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILnk;IB)V",
		garbageValue = "13"
	)
	void method3546(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILnk;II)V",
		garbageValue = "158678327"
	)
	void method3547(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedByte();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field2063[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2064[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method6464();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1248548419"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1357886281"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IIIIIII)V",
		garbageValue = "-186517338"
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
						int[] var14 = Tiles.Tiles_heights[0][var2];
						int var11 = var2 + var4 + 932731;
						int var12 = var3 + var5 + 556238;
						int var13 = FontName.method6160(var11 + 45365, 91923 + var12, 4) - 128 + (FontName.method6160(var11 + 10294, 37821 + var12, 2) - 128 >> 1) + (FontName.method6160(var11, var12, 1) - 128 >> 2);
						var13 = (int)((double)var13 * 0.3D) + 35;
						if (var13 < 10) {
							var13 = 10;
						} else if (var13 > 60) {
							var13 = 60;
						}

						var14[var3] = -var13 * 8;
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
					class9.field71[var1][var2][var3] = var0.readByte();
					Tiles.field1088[var1][var2][var3] = (byte)((var7 - 2) / 4);
					Tiles.field1086[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
				} else {
					Tiles.field1097[var1][var2][var3] = (byte)(var7 - 81);
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
}
