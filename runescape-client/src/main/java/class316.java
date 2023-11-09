import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public class class316 implements Comparator {
	@ObfuscatedName("bh")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = 617707969
	)
	@Export("menuWidth")
	static int menuWidth;

	class316() {
	} // L: 688

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lli;Lli;I)I",
		garbageValue = "-629446065"
	)
	int method6013(class309 var1, class309 var2) {
		return var1.field3463 - var2.field3463; // L: 691
	}

	public int compare(Object var1, Object var2) {
		return this.method6013((class309)var1, (class309)var2); // L: 695
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 699
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-20"
	)
	static final void method6003(int var0, int var1, boolean var2) {
		if (!var2 || var0 != Tiles.field1037 || MouseRecorder.field1105 != var1) { // L: 5811
			Tiles.field1037 = var0; // L: 5814
			MouseRecorder.field1105 = var1; // L: 5815
			class317.method6014(25); // L: 5816
			class405.drawLoadingMessage("Loading - please wait.", true); // L: 5817
			int var3 = UrlRequester.baseX * 64; // L: 5818
			int var4 = class47.baseY * 64; // L: 5819
			UrlRequester.baseX = (var0 - 6) * 8; // L: 5820
			class47.baseY = (var1 - 6) * 8; // L: 5821
			int var5 = UrlRequester.baseX * 64 - var3; // L: 5822
			int var6 = class47.baseY * 64 - var4; // L: 5823
			var3 = UrlRequester.baseX * 64; // L: 5824
			var4 = class47.baseY * 64; // L: 5825

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5826
				NPC var19 = Client.npcs[var7]; // L: 5827
				if (var19 != null) { // L: 5828
					for (var9 = 0; var9 < 10; ++var9) { // L: 5829
						var10000 = var19.pathX; // L: 5830
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5831
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5833
					var19.y -= var6 * 128; // L: 5834
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5837
				Player var22 = Client.players[var7]; // L: 5838
				if (var22 != null) { // L: 5839
					for (var9 = 0; var9 < 10; ++var9) { // L: 5840
						var10000 = var22.pathX; // L: 5841
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5842
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5844
					var22.y -= var6 * 128; // L: 5845
				}
			}

			byte var20 = 0; // L: 5848
			byte var8 = 104; // L: 5849
			byte var21 = 1; // L: 5850
			if (var5 < 0) { // L: 5851
				var20 = 103; // L: 5852
				var8 = -1; // L: 5853
				var21 = -1; // L: 5854
			}

			byte var10 = 0; // L: 5856
			byte var11 = 104; // L: 5857
			byte var12 = 1; // L: 5858
			if (var6 < 0) { // L: 5859
				var10 = 103; // L: 5860
				var11 = -1; // L: 5861
				var12 = -1; // L: 5862
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5864
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 5865
					int var15 = var5 + var13; // L: 5866
					int var16 = var6 + var14; // L: 5867

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5868
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5869
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5870
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5874 5875 5879
				var18.x -= var5; // L: 5876
				var18.y -= var6; // L: 5877
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5878
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5881
				Client.destinationX -= var5; // L: 5882
				Client.destinationY -= var6; // L: 5883
			}

			Client.soundEffectCount = 0; // L: 5885
			Client.isCameraLocked = false; // L: 5886
			NPCComposition.cameraX -= var5 << 7; // L: 5887
			class139.cameraZ -= var6 << 7; // L: 5888
			FriendLoginUpdate.oculusOrbFocalPointX -= var5 << 7; // L: 5889
			HealthBar.oculusOrbFocalPointY -= var6 << 7; // L: 5890
			Client.field772 = -1; // L: 5891
			Client.graphicsObjects.clear(); // L: 5892
			Client.projectiles.clear(); // L: 5893

			for (var14 = 0; var14 < 4; ++var14) { // L: 5894
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5812 5895

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2123908840"
	)
	static final void method6011(int var0) {
		if (ModeWhere.loadInterface(var0)) { // L: 12143
			class152.drawModelComponents(PacketBufferNode.Widget_interfaceComponents[var0], -1); // L: 12144
		}
	} // L: 12145

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	static void method6012(int var0) {
		if (var0 != Client.loginState) { // L: 12896
			Client.loginState = var0; // L: 12897
		}
	} // L: 12898
}
