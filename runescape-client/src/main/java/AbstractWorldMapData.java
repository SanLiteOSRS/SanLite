import java.io.IOException;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -923611136
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -693487296
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1921743487
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 892491975
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1903863783
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1962377257
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -400193139
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2033216141
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("x")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("g")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("p")
	byte[][][] field2796;
	@ObfuscatedName("b")
	byte[][][] field2793;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[[[[Lik;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("y")
	boolean field2804;
	@ObfuscatedName("k")
	boolean field2806;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2804 = false; // L: 26
		this.field2806 = false; // L: 27
	} // L: 29

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqw;B)V",
		garbageValue = "1"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2804 && this.field2806; // L: 32
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Llc;S)V",
		garbageValue = "-8894"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2804 = true; // L: 40
				this.field2806 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2796 = null; // L: 48
		this.field2793 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2804 = false; // L: 51
		this.field2806 = false; // L: 52
	} // L: 53

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILqw;B)V",
		garbageValue = "7"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method4952(var1, var2, var3, var4); // L: 61
			} else {
				this.method4936(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILqw;II)V",
		garbageValue = "158392315"
	)
	void method4952(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 73
	} // L: 74

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILqw;II)V",
		garbageValue = "-1800882307"
	)
	void method4936(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedByte(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field2796[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2793[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method7752(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-706711214"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1786538401"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1359541834"
	)
	static final void method4959(boolean var0) {
		class12.playPcmPlayers(); // L: 5807
		++Client.packetWriter.pendingWrites; // L: 5808
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5809
			Client.packetWriter.pendingWrites = 0; // L: 5810
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5811
				PacketBufferNode var1 = class433.getPacketBufferNode(ClientPacket.field3007, Client.packetWriter.isaacCipher); // L: 5813
				Client.packetWriter.addNode(var1); // L: 5814

				try {
					Client.packetWriter.flush(); // L: 5816
				} catch (IOException var3) { // L: 5818
					Client.hadNetworkError = true; // L: 5819
				}
			}

		}
	} // L: 5822

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "16711680"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = Decimator.scene.getWallObjectTag(var0, var1, var2); // L: 6020
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) { // L: 6021
			var7 = Decimator.scene.getObjectFlags(var0, var1, var2, var5); // L: 6022
			var8 = var7 >> 6 & 3; // L: 6023
			var9 = var7 & 31; // L: 6024
			var10 = var3; // L: 6025
			if (class28.method388(var5)) { // L: 6026
				var10 = var4;
			}

			int[] var11 = SceneTilePaint.sceneMinimapSprite.pixels; // L: 6027
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6028
			var13 = class141.Entity_unpackID(var5); // L: 6029
			ObjectComposition var14 = WorldMapDecoration.getObjectDefinition(var13); // L: 6030
			if (var14.mapSceneId != -1) { // L: 6031
				IndexedSprite var15 = class270.mapSceneSprites[var14.mapSceneId]; // L: 6032
				if (var15 != null) { // L: 6033
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 6034
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 6035
					var15.drawAt(var16 + var1 * 4 + 48, var17 + (104 - var2 - var14.sizeY) * 4 + 48); // L: 6036
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6040
					if (var8 == 0) { // L: 6041
						var11[var12] = var10; // L: 6042
						var11[var12 + 512] = var10; // L: 6043
						var11[var12 + 1024] = var10; // L: 6044
						var11[var12 + 1536] = var10; // L: 6045
					} else if (var8 == 1) { // L: 6047
						var11[var12] = var10; // L: 6048
						var11[var12 + 1] = var10; // L: 6049
						var11[var12 + 2] = var10; // L: 6050
						var11[var12 + 3] = var10; // L: 6051
					} else if (var8 == 2) { // L: 6053
						var11[var12 + 3] = var10; // L: 6054
						var11[var12 + 512 + 3] = var10; // L: 6055
						var11[var12 + 1024 + 3] = var10; // L: 6056
						var11[var12 + 1536 + 3] = var10; // L: 6057
					} else if (var8 == 3) { // L: 6059
						var11[var12 + 1536] = var10; // L: 6060
						var11[var12 + 1536 + 1] = var10; // L: 6061
						var11[var12 + 1536 + 2] = var10; // L: 6062
						var11[var12 + 1536 + 3] = var10; // L: 6063
					}
				}

				if (var9 == 3) { // L: 6066
					if (var8 == 0) { // L: 6067
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 6068
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 6069
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6070
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6072
					if (var8 == 3) { // L: 6073
						var11[var12] = var10; // L: 6074
						var11[var12 + 512] = var10; // L: 6075
						var11[var12 + 1024] = var10; // L: 6076
						var11[var12 + 1536] = var10; // L: 6077
					} else if (var8 == 0) { // L: 6079
						var11[var12] = var10; // L: 6080
						var11[var12 + 1] = var10; // L: 6081
						var11[var12 + 2] = var10; // L: 6082
						var11[var12 + 3] = var10; // L: 6083
					} else if (var8 == 1) { // L: 6085
						var11[var12 + 3] = var10; // L: 6086
						var11[var12 + 512 + 3] = var10; // L: 6087
						var11[var12 + 1024 + 3] = var10; // L: 6088
						var11[var12 + 1536 + 3] = var10; // L: 6089
					} else if (var8 == 2) { // L: 6091
						var11[var12 + 1536] = var10; // L: 6092
						var11[var12 + 1536 + 1] = var10; // L: 6093
						var11[var12 + 1536 + 2] = var10; // L: 6094
						var11[var12 + 1536 + 3] = var10; // L: 6095
					}
				}
			}
		}

		var5 = Decimator.scene.getGameObjectTag(var0, var1, var2); // L: 6100
		if (var5 != 0L) { // L: 6101
			var7 = Decimator.scene.getObjectFlags(var0, var1, var2, var5); // L: 6102
			var8 = var7 >> 6 & 3; // L: 6103
			var9 = var7 & 31; // L: 6104
			var10 = class141.Entity_unpackID(var5); // L: 6105
			ObjectComposition var24 = WorldMapDecoration.getObjectDefinition(var10); // L: 6106
			int var19;
			if (var24.mapSceneId != -1) { // L: 6107
				IndexedSprite var20 = class270.mapSceneSprites[var24.mapSceneId]; // L: 6108
				if (var20 != null) { // L: 6109
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 6110
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 6111
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 6112
				}
			} else if (var9 == 9) { // L: 6115
				var12 = 15658734; // L: 6116
				if (class28.method388(var5)) { // L: 6117
					var12 = 15597568;
				}

				int[] var18 = SceneTilePaint.sceneMinimapSprite.pixels; // L: 6118
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6119
				if (var8 != 0 && var8 != 2) { // L: 6120
					var18[var19] = var12; // L: 6127
					var18[var19 + 1 + 512] = var12; // L: 6128
					var18[var19 + 1024 + 2] = var12; // L: 6129
					var18[var19 + 1536 + 3] = var12; // L: 6130
				} else {
					var18[var19 + 1536] = var12; // L: 6121
					var18[var19 + 1 + 1024] = var12; // L: 6122
					var18[var19 + 512 + 2] = var12; // L: 6123
					var18[var19 + 3] = var12; // L: 6124
				}
			}
		}

		var5 = Decimator.scene.getGroundObjectTag(var0, var1, var2); // L: 6134
		if (0L != var5) { // L: 6135
			var7 = class141.Entity_unpackID(var5); // L: 6136
			ObjectComposition var21 = WorldMapDecoration.getObjectDefinition(var7); // L: 6137
			if (var21.mapSceneId != -1) { // L: 6138
				IndexedSprite var22 = class270.mapSceneSprites[var21.mapSceneId]; // L: 6139
				if (var22 != null) { // L: 6140
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6141
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6142
					var22.drawAt(var1 * 4 + var10 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48); // L: 6143
				}
			}
		}

	} // L: 6147
}
