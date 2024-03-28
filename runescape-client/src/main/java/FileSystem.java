import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("az")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("ah")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("af")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	public static Font field1887;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lab;I)Lat;",
		garbageValue = "739287375"
	)
	public static class3 method3536(class6 var0) {
		switch(var0.field13) { // L: 9
		case 0:
			return new class0(); // L: 12
		default:
			throw new IllegalArgumentException(); // L: 16
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1747085526"
	)
	public static void method3529() {
		class192.field1985.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILnn;ZI)V",
		garbageValue = "-1161061937"
	)
	static void method3537(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = MouseRecorder.getWorldMap().getMapArea(var0); // L: 5380
		int var4 = class133.localPlayer.plane; // L: 5381
		int var5 = GrandExchangeOfferOwnWorldComparator.baseX * 64 + (class133.localPlayer.x >> 7); // L: 5382
		int var6 = DevicePcmPlayerProvider.baseY * 64 + (class133.localPlayer.y >> 7); // L: 5383
		Coord var7 = new Coord(var4, var5, var6); // L: 5384
		MouseRecorder.getWorldMap().method8750(var3, var7, var1, var2); // L: 5385
	} // L: 5386

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IIII)V",
		garbageValue = "1230831106"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class167.method3417(); // L: 12604
		SpriteMask var4 = var0.method6658(class243.field2620, false); // L: 12605
		if (var4 != null) { // L: 12606
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12607
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12608
				int var5 = Client.camAngleY & 2047; // L: 12609
				int var6 = class133.localPlayer.x / 32 + 48; // L: 12610
				int var7 = 464 - class133.localPlayer.y / 32; // L: 12611
				Interpreter.field877.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12612

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.field627; ++var8) { // L: 12613
					var16 = Client.field758[var8] * 4 + 2 - class133.localPlayer.x / 32; // L: 12614
					var10 = Client.field759[var8] * 4 + 2 - class133.localPlayer.y / 32; // L: 12615
					class277.drawSpriteOnMinimap(var1, var2, var16, var10, Client.field760[var8], var4); // L: 12616
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12618
					for (var16 = 0; var16 < 104; ++var16) { // L: 12619
						NodeDeque var14 = Client.groundItems[class172.Client_plane][var8][var16]; // L: 12620
						if (var14 != null) { // L: 12621
							var11 = var8 * 4 + 2 - class133.localPlayer.x / 32; // L: 12622
							var12 = var16 * 4 + 2 - class133.localPlayer.y / 32; // L: 12623
							class277.drawSpriteOnMinimap(var1, var2, var11, var12, class25.field115[0], var4); // L: 12624
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12628
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12629
					if (var9 != null && var9.isVisible()) { // L: 12630
						NPCComposition var18 = var9.definition; // L: 12631
						if (var18 != null && var18.transforms != null) { // L: 12632
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12633
							var11 = var9.x / 32 - class133.localPlayer.x / 32; // L: 12634
							var12 = var9.y / 32 - class133.localPlayer.y / 32; // L: 12635
							class277.drawSpriteOnMinimap(var1, var2, var11, var12, class25.field115[1], var4); // L: 12636
						}
					}
				}

				var8 = Players.Players_count; // L: 12640
				int[] var17 = Players.Players_indices; // L: 12641

				for (var10 = 0; var10 < var8; ++var10) { // L: 12642
					Player var15 = Client.players[var17[var10]]; // L: 12643
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class133.localPlayer) { // L: 12644
						var12 = var15.x / 32 - class133.localPlayer.x / 32; // L: 12645
						int var13 = var15.y / 32 - class133.localPlayer.y / 32; // L: 12646
						if (var15.method2331()) { // L: 12647
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, class25.field115[3], var4);
						} else if (class133.localPlayer.team != 0 && var15.team != 0 && var15.team == class133.localPlayer.team) { // L: 12648
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, class25.field115[4], var4);
						} else if (var15.method2366()) { // L: 12649
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, class25.field115[5], var4);
						} else if (var15.isClanMember()) { // L: 12650
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, class25.field115[6], var4);
						} else {
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, class25.field115[2], var4); // L: 12651
						}
					}
				}

				if (Client.field529 != 0 && Client.cycle % 20 < 10) { // L: 12654
					if (Client.field529 == 1 && Client.field530 >= 0 && Client.field530 < Client.npcs.length) { // L: 12655
						NPC var19 = Client.npcs[Client.field530]; // L: 12656
						if (var19 != null) { // L: 12657
							var11 = var19.x / 32 - class133.localPlayer.x / 32; // L: 12658
							var12 = var19.y / 32 - class133.localPlayer.y / 32; // L: 12659
							Client.worldToMinimap(var1, var2, var11, var12, class33.field164[1], var4); // L: 12660
						}
					}

					if (Client.field529 == 2) { // L: 12663
						var10 = Client.field532 * 4 - GrandExchangeOfferOwnWorldComparator.baseX * 256 + 2 - class133.localPlayer.x / 32; // L: 12664
						var11 = Client.field620 * 4 - DevicePcmPlayerProvider.baseY * 256 + 2 - class133.localPlayer.y / 32; // L: 12665
						Client.worldToMinimap(var1, var2, var10, var11, class33.field164[1], var4); // L: 12666
					}

					if (Client.field529 == 10 && Client.field531 >= 0 && Client.field531 < Client.players.length) { // L: 12668
						Player var20 = Client.players[Client.field531]; // L: 12669
						if (var20 != null) { // L: 12670
							var11 = var20.x / 32 - class133.localPlayer.x / 32; // L: 12671
							var12 = var20.y / 32 - class133.localPlayer.y / 32; // L: 12672
							Client.worldToMinimap(var1, var2, var11, var12, class33.field164[1], var4); // L: 12673
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12677
					var10 = Client.destinationX * 4 + 2 - class133.localPlayer.x / 32; // L: 12678
					var11 = Client.destinationY * 4 + 2 - class133.localPlayer.y / 32; // L: 12679
					class277.drawSpriteOnMinimap(var1, var2, var10, var11, class33.field164[0], var4); // L: 12680
				}

				if (!class133.localPlayer.isHidden) { // L: 12682
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12684
			}

			Client.field816[var3] = true; // L: 12685
		}
	} // L: 12686
}
