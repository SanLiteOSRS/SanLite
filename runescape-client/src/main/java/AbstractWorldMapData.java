import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("an")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("gz")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = -1751628859
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -771248960
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -917957184
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2063226565
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 480521769
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 946227363
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1771727323
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 10575415
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -466273533
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("g")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("m")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("n")
	byte[][][] field198;
	@ObfuscatedName("d")
	byte[][][] field191;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "[[[[Laa;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("a")
	boolean field182;
	@ObfuscatedName("q")
	boolean field194;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field182 = false;
		this.field194 = false;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "728123848"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "83"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field182 && this.field194;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lic;B)V",
		garbageValue = "-109"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field182 = true;
				this.field194 = true;
			}

		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2117739140"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field198 = null;
		this.field191 = null;
		this.decorations = null;
		this.field182 = false;
		this.field194 = false;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(IILkf;I)V",
		garbageValue = "-1176902168"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method329(var1, var2, var3, var4);
			} else {
				this.method335(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(IILkf;II)V",
		garbageValue = "1697201731"
	)
	void method329(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(IILkf;II)V",
		garbageValue = "2061843342"
	)
	void method335(int var1, int var2, Buffer var3, int var4) {
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
				int var10 = var3.readUnsignedByte();
				if (var10 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var10;
					var11 = var3.readUnsignedByte();
					this.field198[var9][var1][var2] = (byte)(var11 >> 2);
					this.field191[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var14 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method5634();
						int var13 = var3.readUnsignedByte();
						var14[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1414029315"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1685122418"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("z")
	public static String method331(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (var0 != 0L) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class298.base37Table[(int)(var6 - 37L * var0)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Llp;IIII)V",
		garbageValue = "-224536193"
	)
	static void method353(SpritePixels var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, MenuAction.method2139(var1, var2, var3), var0.pixels.length * 4);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "396183986"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		FloorDecoration.sortWorlds(AbstractByteArrayCopier.World_worlds, 0, AbstractByteArrayCopier.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(ILcy;ZI)I",
		garbageValue = "-1078037762"
	)
	static int method351(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1467299516"
	)
	static final void method354() {
		if (Huffman.Client_plane != Client.field902) {
			Client.field902 = Huffman.Client_plane;
			int var0 = Huffman.Client_plane;
			int[] var1 = ApproximateRouteStrategy.sceneMinimapSprite.pixels;
			int var2 = var1.length;

			int var3;
			for (var3 = 0; var3 < var2; ++var3) {
				var1[var3] = 0;
			}

			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) {
				var4 = (103 - var3) * 2048 + 24628;

				for (var5 = 1; var5 < 103; ++var5) {
					if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) {
						ScriptEvent.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
						ScriptEvent.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
					}

					var4 += 4;
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
			ApproximateRouteStrategy.sceneMinimapSprite.setRaster();

			int var6;
			for (var5 = 1; var5 < 103; ++var5) {
				for (var6 = 1; var6 < 103; ++var6) {
					if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) {
						ChatChannel.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) {
						ChatChannel.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0;

			for (var5 = 0; var5 < 104; ++var5) {
				for (var6 = 0; var6 < 104; ++var6) {
					long var7 = ScriptEvent.scene.getFloorDecorationTag(Huffman.Client_plane, var5, var6);
					if (0L != var7) {
						int var9 = UserComparator9.Entity_unpackID(var7);
						int var10 = MidiPcmStream.getObjectDefinition(var9).mapIconId;
						if (var10 >= 0) {
							Client.mapIcons[Client.mapIconCount] = WorldMapSection0.WorldMapElement_get(var10).getSpriteBool(false);
							Client.mapIconXs[Client.mapIconCount] = var5;
							Client.mapIconYs[Client.mapIconCount] = var6;
							++Client.mapIconCount;
						}
					}
				}
			}

			WorldMapSprite.rasterProvider.apply();
		}

	}
}
