import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public class class385 {
	@ObfuscatedName("aw")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1321400505"
	)
	static final void method7202(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class309.field3456 || class140.field1640 != var1) { // L: 5904
			class309.field3456 = var0; // L: 5907
			class140.field1640 = var1; // L: 5908
			class129.method2989(25); // L: 5909
			Actor.drawLoadingMessage("Loading - please wait.", true); // L: 5910
			int var3 = AbstractArchive.baseX * 64; // L: 5911
			int var4 = class148.baseY * 64; // L: 5912
			AbstractArchive.baseX = (var0 - 6) * 8; // L: 5913
			class148.baseY = (var1 - 6) * 8; // L: 5914
			int var5 = AbstractArchive.baseX * 64 - var3; // L: 5915
			int var6 = class148.baseY * 64 - var4; // L: 5916
			var3 = AbstractArchive.baseX * 64; // L: 5917
			var4 = class148.baseY * 64; // L: 5918

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5919
				NPC var19 = Client.npcs[var7]; // L: 5920
				if (var19 != null) { // L: 5921
					for (var9 = 0; var9 < 10; ++var9) { // L: 5922
						var10000 = var19.pathX; // L: 5923
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5924
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5926
					var19.y -= var6 * 128; // L: 5927
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5930
				Player var22 = Client.players[var7]; // L: 5931
				if (var22 != null) { // L: 5932
					for (var9 = 0; var9 < 10; ++var9) { // L: 5933
						var10000 = var22.pathX; // L: 5934
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5935
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5937
					var22.y -= var6 * 128; // L: 5938
				}
			}

			byte var20 = 0; // L: 5941
			byte var8 = 104; // L: 5942
			byte var21 = 1; // L: 5943
			if (var5 < 0) { // L: 5944
				var20 = 103; // L: 5945
				var8 = -1; // L: 5946
				var21 = -1; // L: 5947
			}

			byte var10 = 0; // L: 5949
			byte var11 = 104; // L: 5950
			byte var12 = 1; // L: 5951
			if (var6 < 0) { // L: 5952
				var10 = 103; // L: 5953
				var11 = -1; // L: 5954
				var12 = -1; // L: 5955
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5957
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5958
					int var15 = var5 + var13; // L: 5959
					int var16 = var6 + var14; // L: 5960

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5961
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5962
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5963
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5967 5968 5972
				var18.x -= var5; // L: 5969
				var18.y -= var6; // L: 5970
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5971
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5974
				Client.destinationX -= var5; // L: 5975
				Client.destinationY -= var6; // L: 5976
			}

			Client.soundEffectCount = 0; // L: 5978
			Client.isCameraLocked = false; // L: 5979
			class157.cameraX -= var5 << 7; // L: 5980
			SoundSystem.cameraZ -= var6 << 7; // L: 5981
			class467.oculusOrbFocalPointX -= var5 << 7; // L: 5982
			class36.oculusOrbFocalPointY -= var6 << 7; // L: 5983
			Client.field758 = -1; // L: 5984
			Client.graphicsObjects.clear(); // L: 5985
			Client.projectiles.clear(); // L: 5986

			for (var14 = 0; var14 < 4; ++var14) { // L: 5987
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5905 5988
}
