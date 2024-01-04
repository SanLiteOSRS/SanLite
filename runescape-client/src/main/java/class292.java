import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
public abstract class class292 implements class294 {
	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	static TextureProvider field3101;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -916251823
	)
	protected int field3102;

	@ObfuscatedSignature(
		descriptor = "(Lnt;Lof;I)V"
	)
	protected class292(StudioGame var1, Language var2, int var3) {
		this.field3102 = var3; // L: 10
	} // L: 11

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1464044439"
	)
	static final void method5834(int var0, int var1, boolean var2) {
		if (!var2 || var0 != DefaultsGroup.field4740 || class223.field2367 != var1) { // L: 5799
			DefaultsGroup.field4740 = var0; // L: 5802
			class223.field2367 = var1; // L: 5803
			WorldMapSection2.method4516(25); // L: 5804
			LoginPacket.drawLoadingMessage("Loading - please wait.", true); // L: 5805
			int var3 = class187.baseX * 64; // L: 5806
			int var4 = class101.baseY * 64; // L: 5807
			class187.baseX = (var0 - 6) * 8; // L: 5808
			class101.baseY = (var1 - 6) * 8; // L: 5809
			int var5 = class187.baseX * 64 - var3; // L: 5810
			int var6 = class101.baseY * 64 - var4; // L: 5811
			var3 = class187.baseX * 64; // L: 5812
			var4 = class101.baseY * 64; // L: 5813

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5814
				NPC var19 = Client.npcs[var7]; // L: 5815
				if (var19 != null) { // L: 5816
					for (var9 = 0; var9 < 10; ++var9) { // L: 5817
						var10000 = var19.pathX; // L: 5818
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5819
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5821
					var19.y -= var6 * 128; // L: 5822
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5825
				Player var22 = Client.players[var7]; // L: 5826
				if (var22 != null) { // L: 5827
					for (var9 = 0; var9 < 10; ++var9) { // L: 5828
						var10000 = var22.pathX; // L: 5829
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5830
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5832
					var22.y -= var6 * 128; // L: 5833
				}
			}

			byte var20 = 0; // L: 5836
			byte var8 = 104; // L: 5837
			byte var21 = 1; // L: 5838
			if (var5 < 0) { // L: 5839
				var20 = 103; // L: 5840
				var8 = -1; // L: 5841
				var21 = -1; // L: 5842
			}

			byte var10 = 0; // L: 5844
			byte var11 = 104; // L: 5845
			byte var12 = 1; // L: 5846
			if (var6 < 0) { // L: 5847
				var10 = 103; // L: 5848
				var11 = -1; // L: 5849
				var12 = -1; // L: 5850
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5852
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 5853
					int var15 = var13 + var5; // L: 5854
					int var16 = var14 + var6; // L: 5855

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5856
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5857
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5858
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5862 5863 5867
				var18.x -= var5; // L: 5864
				var18.y -= var6; // L: 5865
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5866
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5869
				Client.destinationX -= var5; // L: 5870
				Client.destinationY -= var6; // L: 5871
			}

			Client.soundEffectCount = 0; // L: 5873
			Client.isCameraLocked = false; // L: 5874
			ViewportMouse.cameraX -= var5 << 7; // L: 5875
			class36.cameraZ -= var6 << 7; // L: 5876
			LoginScreenAnimation.oculusOrbFocalPointX -= var5 << 7; // L: 5877
			ScriptFrame.oculusOrbFocalPointY -= var6 << 7; // L: 5878
			Client.field601 = -1; // L: 5879
			Client.graphicsObjects.clear(); // L: 5880
			Client.projectiles.clear(); // L: 5881

			for (var14 = 0; var14 < 4; ++var14) { // L: 5882
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5800 5883
}
