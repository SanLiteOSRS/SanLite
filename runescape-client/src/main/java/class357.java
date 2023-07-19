import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class357 extends DualNode {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	Archive field4258;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1350261959
	)
	int field4259;
	@ObfuscatedName("ac")
	byte field4260;

	class357() {
	} // L: 10

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIS)I",
		garbageValue = "6500"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 106

		for (int var6 = 0; var6 < var5; ++var6) { // L: 107
			char var7 = var0.charAt(var6 + var1); // L: 108
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 109
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 110
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 111
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 112
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 113
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 114
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 115
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 116
				var3[var6 + var4] = -121;
			} else if (var7 == 710) { // L: 117
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) { // L: 118
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 119
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 120
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 121
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 122
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 123
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 124
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 125
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 126
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 127
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 128
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) { // L: 129
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 130
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 131
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 132
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 133
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 134
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 135
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 136
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 137
			}
		}

		return var5; // L: 139
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Lme;IIII)V",
		garbageValue = "2059520506"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class156.method3359(); // L: 12431
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12432
		if (var4 != null) { // L: 12433
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12434
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12435
				int var5 = Client.camAngleY & 2047; // L: 12436
				int var6 = class27.localPlayer.x / 32 + 48; // L: 12437
				int var7 = 464 - class27.localPlayer.y / 32; // L: 12438
				InterfaceParent.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12439

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12440
					var16 = Client.mapIconXs[var8] * 4 + 2 - class27.localPlayer.x / 32; // L: 12441
					var10 = Client.mapIconYs[var8] * 4 + 2 - class27.localPlayer.y / 32; // L: 12442
					UserComparator4.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12443
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12445
					for (var16 = 0; var16 < 104; ++var16) { // L: 12446
						NodeDeque var14 = Client.groundItems[BuddyRankComparator.Client_plane][var8][var16]; // L: 12447
						if (var14 != null) { // L: 12448
							var11 = var8 * 4 + 2 - class27.localPlayer.x / 32; // L: 12449
							var12 = var16 * 4 + 2 - class27.localPlayer.y / 32; // L: 12450
							UserComparator4.drawSpriteOnMinimap(var1, var2, var11, var12, class47.field331[0], var4); // L: 12451
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12455
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12456
					if (var9 != null && var9.isVisible()) { // L: 12457
						NPCComposition var18 = var9.definition; // L: 12458
						if (var18 != null && var18.transforms != null) { // L: 12459
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12460
							var11 = var9.x / 32 - class27.localPlayer.x / 32; // L: 12461
							var12 = var9.y / 32 - class27.localPlayer.y / 32; // L: 12462
							UserComparator4.drawSpriteOnMinimap(var1, var2, var11, var12, class47.field331[1], var4); // L: 12463
						}
					}
				}

				var8 = Players.Players_count; // L: 12467
				int[] var17 = Players.Players_indices; // L: 12468

				for (var10 = 0; var10 < var8; ++var10) { // L: 12469
					Player var15 = Client.players[var17[var10]]; // L: 12470
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class27.localPlayer) { // L: 12471
						var12 = var15.x / 32 - class27.localPlayer.x / 32; // L: 12472
						int var13 = var15.y / 32 - class27.localPlayer.y / 32; // L: 12473
						if (var15.method2347()) { // L: 12474
							UserComparator4.drawSpriteOnMinimap(var1, var2, var12, var13, class47.field331[3], var4);
						} else if (class27.localPlayer.team != 0 && var15.team != 0 && var15.team == class27.localPlayer.team) { // L: 12475
							UserComparator4.drawSpriteOnMinimap(var1, var2, var12, var13, class47.field331[4], var4);
						} else if (var15.method2392()) { // L: 12476
							UserComparator4.drawSpriteOnMinimap(var1, var2, var12, var13, class47.field331[5], var4);
						} else if (var15.isClanMember()) { // L: 12477
							UserComparator4.drawSpriteOnMinimap(var1, var2, var12, var13, class47.field331[6], var4);
						} else {
							UserComparator4.drawSpriteOnMinimap(var1, var2, var12, var13, class47.field331[2], var4); // L: 12478
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12481
					if (Client.hintArrowType == 1 && Client.field674 >= 0 && Client.field674 < Client.npcs.length) { // L: 12482
						NPC var19 = Client.npcs[Client.field674]; // L: 12483
						if (var19 != null) { // L: 12484
							var11 = var19.x / 32 - class27.localPlayer.x / 32; // L: 12485
							var12 = var19.y / 32 - class27.localPlayer.y / 32; // L: 12486
							StructComposition.worldToMinimap(var1, var2, var11, var12, WorldMapCacheName.field3065[1], var4); // L: 12487
						}
					}

					if (Client.hintArrowType == 2) { // L: 12490
						var10 = Client.field521 * 4 - class166.baseX * 256 + 2 - class27.localPlayer.x / 32; // L: 12491
						var11 = Client.field522 * 4 - class9.baseY * 256 + 2 - class27.localPlayer.y / 32; // L: 12492
						StructComposition.worldToMinimap(var1, var2, var10, var11, WorldMapCacheName.field3065[1], var4); // L: 12493
					}

					if (Client.hintArrowType == 10 && Client.field523 >= 0 && Client.field523 < Client.players.length) { // L: 12495
						Player var20 = Client.players[Client.field523]; // L: 12496
						if (var20 != null) { // L: 12497
							var11 = var20.x / 32 - class27.localPlayer.x / 32; // L: 12498
							var12 = var20.y / 32 - class27.localPlayer.y / 32; // L: 12499
							StructComposition.worldToMinimap(var1, var2, var11, var12, WorldMapCacheName.field3065[1], var4); // L: 12500
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12504
					var10 = Client.destinationX * 4 + 2 - class27.localPlayer.x / 32; // L: 12505
					var11 = Client.destinationY * 4 + 2 - class27.localPlayer.y / 32; // L: 12506
					UserComparator4.drawSpriteOnMinimap(var1, var2, var10, var11, WorldMapCacheName.field3065[0], var4); // L: 12507
				}

				if (!class27.localPlayer.isHidden) { // L: 12509
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12511
			}

			Client.field718[var3] = true; // L: 12512
		}
	} // L: 12513
}
