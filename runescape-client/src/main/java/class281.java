import java.io.File;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ke
@ObfuscatedName("jg")
public final class class281 {
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	@ObfuscatedName("sa")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("v")
	static final HashMap field3318;
	@ObfuscatedName("m")
	@Export("cacheDir")
	public static File cacheDir;
	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "[Lrx;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	static {
		field3318 = new HashMap(); // L: 11
		java.util.Calendar.getInstance(method5503("Europe/London")); // L: 14
	} // L: 15

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "32904762"
	)
	static TimeZone method5503(String var0) {
		synchronized(field3318) { // L: 22
			TimeZone var2 = (TimeZone)field3318.get(var0); // L: 23
			if (var2 == null) { // L: 24
				var2 = TimeZone.getTimeZone(var0); // L: 25
				field3318.put(var0, var2); // L: 26
			}

			return var2; // L: 28
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	static void method5504() {
		int var0 = Players.Players_count; // L: 4841
		int[] var1 = Players.Players_indices; // L: 4842

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4843
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 4844
				WorldMapAreaData.addPlayerToScene(Client.players[var1[var2]], true); // L: 4845
			}
		}

	} // L: 4847

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "283375352"
	)
	static final void method5499(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class17.field101 || MusicPatchNode2.field3341 != var1) { // L: 5610
			class17.field101 = var0; // L: 5613
			MusicPatchNode2.field3341 = var1; // L: 5614
			class140.method3102(25); // L: 5615
			SoundSystem.drawLoadingMessage("Loading - please wait.", true); // L: 5616
			int var3 = class154.baseX * 64; // L: 5617
			int var4 = class365.baseY * 64; // L: 5618
			class154.baseX = (var0 - 6) * 8; // L: 5619
			class365.baseY = (var1 - 6) * 8; // L: 5620
			int var5 = class154.baseX * 64 - var3; // L: 5621
			int var6 = class365.baseY * 64 - var4; // L: 5622
			var3 = class154.baseX * 64; // L: 5623
			var4 = class365.baseY * 64; // L: 5624

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5625
				NPC var19 = Client.npcs[var7]; // L: 5626
				if (var19 != null) { // L: 5627
					for (var9 = 0; var9 < 10; ++var9) { // L: 5628
						var10000 = var19.pathX; // L: 5629
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5630
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5632
					var19.y -= var6 * 128; // L: 5633
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5636
				Player var22 = Client.players[var7]; // L: 5637
				if (var22 != null) { // L: 5638
					for (var9 = 0; var9 < 10; ++var9) { // L: 5639
						var10000 = var22.pathX; // L: 5640
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5641
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5643
					var22.y -= var6 * 128; // L: 5644
				}
			}

			byte var20 = 0; // L: 5647
			byte var8 = 104; // L: 5648
			byte var21 = 1; // L: 5649
			if (var5 < 0) { // L: 5650
				var20 = 103; // L: 5651
				var8 = -1; // L: 5652
				var21 = -1; // L: 5653
			}

			byte var10 = 0; // L: 5655
			byte var11 = 104; // L: 5656
			byte var12 = 1; // L: 5657
			if (var6 < 0) { // L: 5658
				var10 = 103; // L: 5659
				var11 = -1; // L: 5660
				var12 = -1; // L: 5661
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5663
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5664
					int var15 = var13 + var5; // L: 5665
					int var16 = var14 + var6; // L: 5666

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5667
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5668
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5669
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5673 5674 5678
				var18.x -= var5; // L: 5675
				var18.y -= var6; // L: 5676
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5677
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5680
				Client.destinationX -= var5; // L: 5681
				Client.destinationY -= var6; // L: 5682
			}

			Client.soundEffectCount = 0; // L: 5684
			Client.isCameraLocked = false; // L: 5685
			class145.cameraX -= var5 << 7; // L: 5686
			ClanChannel.cameraZ -= var6 << 7; // L: 5687
			KeyHandler.oculusOrbFocalPointX -= var5 << 7; // L: 5688
			class14.oculusOrbFocalPointY -= var6 << 7; // L: 5689
			Client.field619 = -1; // L: 5690
			Client.graphicsObjects.clear(); // L: 5691
			Client.projectiles.clear(); // L: 5692

			for (var14 = 0; var14 < 4; ++var14) { // L: 5693
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5611 5694

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1604095117"
	)
	static final boolean method5505(int var0) {
		if (var0 < 0) { // L: 8961
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 8962
			if (var1 >= 2000) { // L: 8963
				var1 -= 2000;
			}

			return var1 == 1007; // L: 8964
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1475515227"
	)
	static boolean method5501(int var0) {
		for (int var1 = 0; var1 < Client.field710; ++var1) { // L: 11853
			if (Client.field751[var1] == var0) { // L: 11854
				return true;
			}
		}

		return false; // L: 11856
	}
}
