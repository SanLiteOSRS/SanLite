import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("KeyHandler")
public class KeyHandler {
	@ObfuscatedName("ck")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 92
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "30439"
	)
	public static void method430(int var0) {
		class290.musicPlayerStatus = 1; // L: 64
		class6.musicTrackArchive = null; // L: 65
		class20.musicTrackGroupId = -1; // L: 66
		class161.musicTrackFileId = -1; // L: 67
		class290.musicTrackVolume = 0; // L: 68
		class423.musicTrackBoolean = false; // L: 69
		class203.pcmSampleLength = var0; // L: 70
	} // L: 71

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "451958548"
	)
	static final int method433() {
		if (PacketWriter.clientPreferences.method2572()) { // L: 5151
			return class103.Client_plane;
		} else {
			int var0 = GrandExchangeOfferNameComparator.getTileHeight(ClanSettings.cameraX, class366.cameraZ, class103.Client_plane); // L: 5152
			return var0 - UserComparator10.cameraY < 800 && (Tiles.Tiles_renderFlags[class103.Client_plane][ClanSettings.cameraX >> 7][class366.cameraZ >> 7] & 4) != 0 ? class103.Client_plane : 3; // L: 5153 5154
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1953736954"
	)
	static final void method432(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class303.field3472 || ScriptFrame.field467 != var1) { // L: 5878
			class303.field3472 = var0; // L: 5881
			ScriptFrame.field467 = var1; // L: 5882
			class246.method5251(25); // L: 5883
			class165.drawLoadingMessage("Loading - please wait.", true); // L: 5884
			int var3 = ParamComposition.baseX * 64; // L: 5885
			int var4 = Client.baseY * 64; // L: 5886
			ParamComposition.baseX = (var0 - 6) * 8; // L: 5887
			Client.baseY = (var1 - 6) * 8; // L: 5888
			int var5 = ParamComposition.baseX * 64 - var3; // L: 5889
			int var6 = Client.baseY * 64 - var4; // L: 5890
			var3 = ParamComposition.baseX * 64; // L: 5891
			var4 = Client.baseY * 64; // L: 5892

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5893
				NPC var19 = Client.npcs[var7]; // L: 5894
				if (var19 != null) { // L: 5895
					for (var9 = 0; var9 < 10; ++var9) { // L: 5896
						var10000 = var19.pathX; // L: 5897
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5898
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5900
					var19.y -= var6 * 128; // L: 5901
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5904
				Player var22 = Client.players[var7]; // L: 5905
				if (var22 != null) { // L: 5906
					for (var9 = 0; var9 < 10; ++var9) { // L: 5907
						var10000 = var22.pathX; // L: 5908
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5909
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5911
					var22.y -= var6 * 128; // L: 5912
				}
			}

			byte var20 = 0; // L: 5915
			byte var8 = 104; // L: 5916
			byte var21 = 1; // L: 5917
			if (var5 < 0) { // L: 5918
				var20 = 103; // L: 5919
				var8 = -1; // L: 5920
				var21 = -1; // L: 5921
			}

			byte var10 = 0; // L: 5923
			byte var11 = 104; // L: 5924
			byte var12 = 1; // L: 5925
			if (var6 < 0) { // L: 5926
				var10 = 103; // L: 5927
				var11 = -1; // L: 5928
				var12 = -1; // L: 5929
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5931
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 5932
					int var15 = var13 + var5; // L: 5933
					int var16 = var14 + var6; // L: 5934

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5935
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5936
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5937
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5941 5942 5946
				var18.x -= var5; // L: 5943
				var18.y -= var6; // L: 5944
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5945
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5948
				Client.destinationX -= var5; // L: 5949
				Client.destinationY -= var6; // L: 5950
			}

			Client.soundEffectCount = 0; // L: 5952
			Client.isCameraLocked = false; // L: 5953
			ClanSettings.cameraX -= var5 << 7; // L: 5954
			class366.cameraZ -= var6 << 7; // L: 5955
			class245.oculusOrbFocalPointX -= var5 << 7; // L: 5956
			UserComparator10.oculusOrbFocalPointY -= var6 << 7; // L: 5957
			Client.field749 = -1; // L: 5958
			Client.graphicsObjects.clear(); // L: 5959
			Client.projectiles.clear(); // L: 5960

			for (var14 = 0; var14 < 4; ++var14) { // L: 5961
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5879 5962
}
