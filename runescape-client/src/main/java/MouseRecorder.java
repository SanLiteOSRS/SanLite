import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("aq")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("aw")
	@Export("lock")
	Object lock;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 418643179
	)
	@Export("index")
	int index;
	@ObfuscatedName("ai")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ar")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("as")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; class143.method3209(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "320985503"
	)
	static void method2366() {
		GrandExchangeOfferAgeComparator.field4442 = null; // L: 61
		TriBool.field4773 = null; // L: 62
		class173.field1845 = null; // L: 63
		class350.field3876 = null; // L: 64
		Tiles.field1050 = null; // L: 65
		class151.field1708 = null; // L: 66
		Tiles.field1049 = null; // L: 67
		Huffman.Tiles_hue = null; // L: 68
		MilliClock.Tiles_saturation = null; // L: 69
		ApproximateRouteStrategy.Tiles_lightness = null; // L: 70
		class182.Tiles_hueMultiplier = null; // L: 71
		class324.field3538 = null; // L: 72
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "684237694"
	)
	public static void method2364(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 73
			int var4 = (var3 + var2) / 2; // L: 74
			int var5 = var2; // L: 75
			int var6 = var0[var4]; // L: 76
			var0[var4] = var0[var3]; // L: 77
			var0[var3] = var6; // L: 78
			int var7 = var1[var4]; // L: 79
			var1[var4] = var1[var3]; // L: 80
			var1[var3] = var7; // L: 81
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1; // L: 82

			for (int var9 = var2; var9 < var3; ++var9) { // L: 83
				if (var0[var9] < (var9 & var8) + var6) { // L: 84
					int var10 = var0[var9]; // L: 85
					var0[var9] = var0[var5]; // L: 86
					var0[var5] = var10; // L: 87
					int var11 = var1[var9]; // L: 88
					var1[var9] = var1[var5]; // L: 89
					var1[var5++] = var11; // L: 90
				}
			}

			var0[var3] = var0[var5]; // L: 94
			var0[var5] = var6; // L: 95
			var1[var3] = var1[var5]; // L: 96
			var1[var5] = var7; // L: 97
			method2364(var0, var1, var2, var5 - 1); // L: 98
			method2364(var0, var1, var5 + 1, var3); // L: 99
		}

	} // L: 101

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIII)V",
		garbageValue = "720381236"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class190.method3774(); // L: 12567
		SpriteMask var4 = var0.method6801(ArchiveLoader.field1070, false); // L: 12568
		if (var4 != null) { // L: 12569
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12570
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12571
				int var5 = Client.camAngleY & 2047; // L: 12572
				int var6 = VarpDefinition.localPlayer.x / 32 + 48; // L: 12573
				int var7 = 464 - VarpDefinition.localPlayer.y / 32; // L: 12574
				class25.field118.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12575

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.field773; ++var8) { // L: 12576
					var16 = Client.field552[var8] * 4 + 2 - VarpDefinition.localPlayer.x / 32; // L: 12577
					var10 = Client.field775[var8] * 4 + 2 - VarpDefinition.localPlayer.y / 32; // L: 12578
					class11.drawSpriteOnMinimap(var1, var2, var16, var10, Client.field776[var8], var4); // L: 12579
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12581
					for (var16 = 0; var16 < 104; ++var16) { // L: 12582
						NodeDeque var14 = Client.groundItems[class473.Client_plane][var8][var16]; // L: 12583
						if (var14 != null) { // L: 12584
							var11 = var8 * 4 + 2 - VarpDefinition.localPlayer.x / 32; // L: 12585
							var12 = var16 * 4 + 2 - VarpDefinition.localPlayer.y / 32; // L: 12586
							class11.drawSpriteOnMinimap(var1, var2, var11, var12, class246.field2581[0], var4); // L: 12587
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12591
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12592
					if (var9 != null && var9.isVisible()) { // L: 12593
						NPCComposition var18 = var9.definition; // L: 12594
						if (var18 != null && var18.transforms != null) { // L: 12595
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12596
							var11 = var9.x / 32 - VarpDefinition.localPlayer.x / 32; // L: 12597
							var12 = var9.y / 32 - VarpDefinition.localPlayer.y / 32; // L: 12598
							class11.drawSpriteOnMinimap(var1, var2, var11, var12, class246.field2581[1], var4); // L: 12599
						}
					}
				}

				var8 = Players.Players_count; // L: 12603
				int[] var17 = Players.Players_indices; // L: 12604

				for (var10 = 0; var10 < var8; ++var10) { // L: 12605
					Player var15 = Client.players[var17[var10]]; // L: 12606
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != VarpDefinition.localPlayer) { // L: 12607
						var12 = var15.x / 32 - VarpDefinition.localPlayer.x / 32; // L: 12608
						int var13 = var15.y / 32 - VarpDefinition.localPlayer.y / 32; // L: 12609
						if (var15.method2386()) { // L: 12610
							class11.drawSpriteOnMinimap(var1, var2, var12, var13, class246.field2581[3], var4);
						} else if (VarpDefinition.localPlayer.team != 0 && var15.team != 0 && var15.team == VarpDefinition.localPlayer.team) { // L: 12611
							class11.drawSpriteOnMinimap(var1, var2, var12, var13, class246.field2581[4], var4);
						} else if (var15.method2389()) { // L: 12612
							class11.drawSpriteOnMinimap(var1, var2, var12, var13, class246.field2581[5], var4);
						} else if (var15.isClanMember()) { // L: 12613
							class11.drawSpriteOnMinimap(var1, var2, var12, var13, class246.field2581[6], var4);
						} else {
							class11.drawSpriteOnMinimap(var1, var2, var12, var13, class246.field2581[2], var4); // L: 12614
						}
					}
				}

				if (Client.field542 != 0 && Client.cycle % 20 < 10) { // L: 12617
					if (Client.field542 == 1 && Client.field543 >= 0 && Client.field543 < Client.npcs.length) { // L: 12618
						NPC var19 = Client.npcs[Client.field543]; // L: 12619
						if (var19 != null) { // L: 12620
							var11 = var19.x / 32 - VarpDefinition.localPlayer.x / 32; // L: 12621
							var12 = var19.y / 32 - VarpDefinition.localPlayer.y / 32; // L: 12622
							class20.worldToMinimap(var1, var2, var11, var12, Players.field1390[1], var4); // L: 12623
						}
					}

					if (Client.field542 == 2) { // L: 12626
						var10 = Client.field545 * 4 - Projectile.baseX * 256 + 2 - VarpDefinition.localPlayer.x / 32; // L: 12627
						var11 = Client.field546 * 4 - GameEngine.baseY * 32 + 2 - VarpDefinition.localPlayer.y / 32; // L: 12628
						class20.worldToMinimap(var1, var2, var10, var11, Players.field1390[1], var4); // L: 12629
					}

					if (Client.field542 == 10 && Client.field536 >= 0 && Client.field536 < Client.players.length) { // L: 12631
						Player var20 = Client.players[Client.field536]; // L: 12632
						if (var20 != null) { // L: 12633
							var11 = var20.x / 32 - VarpDefinition.localPlayer.x / 32; // L: 12634
							var12 = var20.y / 32 - VarpDefinition.localPlayer.y / 32; // L: 12635
							class20.worldToMinimap(var1, var2, var11, var12, Players.field1390[1], var4); // L: 12636
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12640
					var10 = Client.destinationX * 4 + 2 - VarpDefinition.localPlayer.x / 32; // L: 12641
					var11 = Client.destinationY * 4 + 2 - VarpDefinition.localPlayer.y / 32; // L: 12642
					class11.drawSpriteOnMinimap(var1, var2, var10, var11, Players.field1390[0], var4); // L: 12643
				}

				if (!VarpDefinition.localPlayer.isHidden) { // L: 12645
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12647
			}

			Client.field721[var3] = true; // L: 12648
		}
	} // L: 12649
}
