import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class182 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldz;",
		garbageValue = "2"
	)
	static class127[] method3636() {
		return new class127[]{class127.field1589, class127.field1592, class127.field1577, class127.field1581, class127.field1579, class127.field1580, class127.field1576, class127.field1582, class127.field1583, class127.field1584, class127.field1585, class127.field1586, class127.field1587, class127.field1578, class127.field1588, class127.field1590, class127.field1591}; // L: 74
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)V",
		garbageValue = "1199371061"
	)
	public static void method3627(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0; // L: 26
	} // L: 27

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	public static void method3634() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 89
			if (ArchiveDiskActionHandler.field4173 != 0) { // L: 90
				ArchiveDiskActionHandler.field4173 = 1; // L: 91

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 93
				} catch (InterruptedException var3) { // L: 95
				}
			}

		}
	} // L: 98

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-48"
	)
	static final int method3635(int var0, int var1) {
		if (var0 == -1) { // L: 1016
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1017
			if (var1 < 2) { // L: 1018
				var1 = 2;
			} else if (var1 > 126) { // L: 1019
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1020
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1549035405"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = ReflectionCheck.scene.getWallObjectTag(var0, var1, var2); // L: 5912
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		if (var5 != 0L) { // L: 5913
			var7 = ReflectionCheck.scene.getObjectFlags(var0, var1, var2, var5); // L: 5914
			var8 = var7 >> 6 & 3; // L: 5915
			var9 = var7 & 31; // L: 5916
			var10 = var3; // L: 5917
			boolean var11 = 0L != var5 && !class272.method5474(var5); // L: 5920
			if (var11) { // L: 5922
				var10 = var4;
			}

			int[] var12 = GameObject.sceneMinimapSprite.pixels; // L: 5923
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5924
			var14 = Occluder.Entity_unpackID(var5); // L: 5925
			ObjectComposition var15 = VarpDefinition.getObjectDefinition(var14); // L: 5926
			if (var15.mapSceneId != -1) { // L: 5927
				IndexedSprite var16 = class32.mapSceneSprites[var15.mapSceneId]; // L: 5928
				if (var16 != null) { // L: 5929
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 5930
					int var18 = (var15.sizeY * 4 - var16.subHeight * 694949360) / 2; // L: 5931
					var16.drawAt(var17 + var1 * 4 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48); // L: 5932
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5936
					if (var8 == 0) { // L: 5937
						var12[var13] = var10; // L: 5938
						var12[var13 + 512] = var10; // L: 5939
						var12[var13 + 1024] = var10; // L: 5940
						var12[var13 + 1536] = var10; // L: 5941
					} else if (var8 == 1) { // L: 5943
						var12[var13] = var10; // L: 5944
						var12[var13 + 1] = var10; // L: 5945
						var12[var13 + 2] = var10; // L: 5946
						var12[var13 + 3] = var10; // L: 5947
					} else if (var8 == 2) { // L: 5949
						var12[var13 + 3] = var10; // L: 5950
						var12[var13 + 512 + 3] = var10; // L: 5951
						var12[var13 + 1024 + 3] = var10; // L: 5952
						var12[var13 + 1536 + 3] = var10; // L: 5953
					} else if (var8 == 3) { // L: 5955
						var12[var13 + 1536] = var10; // L: 5956
						var12[var13 + 1536 + 1] = var10; // L: 5957
						var12[var13 + 1536 + 2] = var10; // L: 5958
						var12[var13 + 1536 + 3] = var10; // L: 5959
					}
				}

				if (var9 == 3) { // L: 5962
					if (var8 == 0) { // L: 5963
						var12[var13] = var10;
					} else if (var8 == 1) { // L: 5964
						var12[var13 + 3] = var10;
					} else if (var8 == 2) { // L: 5965
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5966
						var12[var13 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5968
					if (var8 == 3) { // L: 5969
						var12[var13] = var10; // L: 5970
						var12[var13 + 512] = var10; // L: 5971
						var12[var13 + 1024] = var10; // L: 5972
						var12[var13 + 1536] = var10; // L: 5973
					} else if (var8 == 0) { // L: 5975
						var12[var13] = var10; // L: 5976
						var12[var13 + 1] = var10; // L: 5977
						var12[var13 + 2] = var10; // L: 5978
						var12[var13 + 3] = var10; // L: 5979
					} else if (var8 == 1) { // L: 5981
						var12[var13 + 3] = var10; // L: 5982
						var12[var13 + 512 + 3] = var10; // L: 5983
						var12[var13 + 1024 + 3] = var10; // L: 5984
						var12[var13 + 1536 + 3] = var10; // L: 5985
					} else if (var8 == 2) { // L: 5987
						var12[var13 + 1536] = var10; // L: 5988
						var12[var13 + 1536 + 1] = var10; // L: 5989
						var12[var13 + 1536 + 2] = var10; // L: 5990
						var12[var13 + 1536 + 3] = var10; // L: 5991
					}
				}
			}
		}

		var5 = ReflectionCheck.scene.getGameObjectTag(var0, var1, var2); // L: 5996
		if (var5 != 0L) { // L: 5997
			var7 = ReflectionCheck.scene.getObjectFlags(var0, var1, var2, var5); // L: 5998
			var8 = var7 >> 6 & 3; // L: 5999
			var9 = var7 & 31; // L: 6000
			var10 = Occluder.Entity_unpackID(var5); // L: 6001
			ObjectComposition var19 = VarpDefinition.getObjectDefinition(var10); // L: 6002
			if (var19.mapSceneId != -1) { // L: 6003
				IndexedSprite var26 = class32.mapSceneSprites[var19.mapSceneId]; // L: 6004
				if (var26 != null) { // L: 6005
					var13 = (var19.sizeX * 4 - var26.subWidth) / 2; // L: 6006
					var14 = (var19.sizeY * 4 - var26.subHeight * 694949360) / 2; // L: 6007
					var26.drawAt(var1 * 4 + var13 + 48, (104 - var2 - var19.sizeY) * 4 + var14 + 48); // L: 6008
				}
			} else if (var9 == 9) { // L: 6011
				int var20 = 15658734; // L: 6012
				boolean var27 = var5 != 0L && !class272.method5474(var5); // L: 6015
				if (var27) { // L: 6017
					var20 = 15597568;
				}

				int[] var21 = GameObject.sceneMinimapSprite.pixels; // L: 6018
				int var22 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6019
				if (var8 != 0 && var8 != 2) { // L: 6020
					var21[var22] = var20; // L: 6027
					var21[var22 + 1 + 512] = var20; // L: 6028
					var21[var22 + 1024 + 2] = var20; // L: 6029
					var21[var22 + 1536 + 3] = var20; // L: 6030
				} else {
					var21[var22 + 1536] = var20; // L: 6021
					var21[var22 + 1 + 1024] = var20; // L: 6022
					var21[var22 + 512 + 2] = var20; // L: 6023
					var21[var22 + 3] = var20; // L: 6024
				}
			}
		}

		var5 = ReflectionCheck.scene.getGroundObjectTag(var0, var1, var2); // L: 6034
		if (0L != var5) { // L: 6035
			var7 = Occluder.Entity_unpackID(var5); // L: 6036
			ObjectComposition var23 = VarpDefinition.getObjectDefinition(var7); // L: 6037
			if (var23.mapSceneId != -1) { // L: 6038
				IndexedSprite var24 = class32.mapSceneSprites[var23.mapSceneId]; // L: 6039
				if (var24 != null) { // L: 6040
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 6041
					int var25 = (var23.sizeY * 4 - var24.subHeight * 694949360) / 2; // L: 6042
					var24.drawAt(var10 + var1 * 4 + 48, var25 + (104 - var2 - var23.sizeY) * 4 + 48); // L: 6043
				}
			}
		}

	} // L: 6047
}
