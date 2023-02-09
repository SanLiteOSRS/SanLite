import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ib")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(0, (byte)0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, (byte)1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("sk")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "[Lrs;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 94095455
	)
	@Export("type")
	final int type;
	@ObfuscatedName("j")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 17
		this.id = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I[BLoi;I)V",
		garbageValue = "-1305968821"
	)
	static void method5296(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 0; // L: 19
		var3.key = (long)var0; // L: 20
		var3.data = var1; // L: 21
		var3.archiveDisk = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		class288.method5590(); // L: 26
	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;I)I",
		garbageValue = "1342224866"
	)
	static int method5295(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0; // L: 166
		String[] var3 = Login.field941; // L: 168

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) { // L: 169
			var5 = var3[var4]; // L: 170
			if (var0.tryLoadFileByNames(var5, "")) { // L: 172
				++var2; // L: 173
			}
		}

		var3 = Login.field942; // L: 179

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 180
			var5 = var3[var4]; // L: 181
			if (var1.tryLoadFileByNames(var5, "")) { // L: 183
				++var2; // L: 184
			}
		}

		var3 = Login.field902; // L: 190

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 191
			var5 = var3[var4]; // L: 192
			if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) { // L: 194
				++var2; // L: 195
			}
		}

		return var2; // L: 200
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Lnv;I)V",
		garbageValue = "2131724772"
	)
	static void method5297(Font var0, Font var1) {
		int var4;
		int var5;
		if (class491.worldSelectBackSprites == null) { // L: 1577
			Archive var3 = WorldMapEvent.archive8; // L: 1579
			var4 = var3.getGroupId("sl_back"); // L: 1581
			var5 = var3.getFileId(var4, ""); // L: 1582
			SpritePixels[] var2 = class220.method4629(var3, var4, var5); // L: 1583
			class491.worldSelectBackSprites = var2; // L: 1585
		}

		if (class307.worldSelectFlagSprites == null) { // L: 1587
			class307.worldSelectFlagSprites = class125.method3066(WorldMapEvent.archive8, "sl_flags", "");
		}

		if (class391.worldSelectArrows == null) { // L: 1588
			class391.worldSelectArrows = class125.method3066(WorldMapEvent.archive8, "sl_arrows", "");
		}

		if (class25.worldSelectStars == null) { // L: 1589
			class25.worldSelectStars = class125.method3066(WorldMapEvent.archive8, "sl_stars", "");
		}

		if (StudioGame.worldSelectLeftSprite == null) { // L: 1590
			StudioGame.worldSelectLeftSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(WorldMapEvent.archive8, "leftarrow", "");
		}

		if (class205.worldSelectRightSprite == null) { // L: 1591
			class205.worldSelectRightSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(WorldMapEvent.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1592
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1593
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1594
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1595
		if (class25.worldSelectStars != null) { // L: 1596
			class25.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1597
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1598
			class25.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1599
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1600
		}

		if (class391.worldSelectArrows != null) { // L: 1602
			int var22 = Login.xPadding + 280; // L: 1603
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1604
				class391.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				class391.worldSelectArrows[0].drawAt(var22, 4); // L: 1605
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1606
				class391.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				class391.worldSelectArrows[1].drawAt(var22 + 15, 4); // L: 1607
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1); // L: 1608
			int var23 = Login.xPadding + 390; // L: 1609
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1610
				class391.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				class391.worldSelectArrows[0].drawAt(var23, 4); // L: 1611
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1612
				class391.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				class391.worldSelectArrows[1].drawAt(var23 + 15, 4); // L: 1613
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1); // L: 1614
			var4 = Login.xPadding + 500; // L: 1615
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1616
				class391.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class391.worldSelectArrows[0].drawAt(var4, 4); // L: 1617
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1618
				class391.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class391.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1619
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1620
			var5 = Login.xPadding + 610; // L: 1621
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1622
				class391.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class391.worldSelectArrows[0].drawAt(var5, 4); // L: 1623
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1624
				class391.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class391.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1625
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1626
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1628
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1629
		Login.hoveredWorldIndex = -1; // L: 1630
		if (class491.worldSelectBackSprites != null) { // L: 1631
			byte var26 = 88; // L: 1632
			byte var27 = 19; // L: 1633
			var4 = 765 / (var26 + 1) - 1; // L: 1634
			var5 = 480 / (var27 + 1); // L: 1635

			int var6;
			int var7;
			do {
				var6 = var5; // L: 1637
				var7 = var4; // L: 1638
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1639
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1640
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1641
					--var5;
				}
			} while(var6 != var5 || var7 != var4); // L: 1642

			var6 = (765 - var26 * var4) / (var4 + 1); // L: 1644
			if (var6 > 5) { // L: 1645
				var6 = 5;
			}

			var7 = (480 - var27 * var5) / (var5 + 1); // L: 1646
			if (var7 > 5) { // L: 1647
				var7 = 5;
			}

			int var8 = (765 - var4 * var26 - var6 * (var4 - 1)) / 2; // L: 1648
			int var9 = (480 - var27 * var5 - var7 * (var5 - 1)) / 2; // L: 1649
			int var10 = (var5 + World.World_count - 1) / var5; // L: 1650
			Login.worldSelectPagesCount = var10 - var4; // L: 1651
			if (StudioGame.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1652
				StudioGame.worldSelectLeftSprite.drawAt(8, class127.canvasHeight / 2 - StudioGame.worldSelectLeftSprite.subHeight / 2); // L: 1653
			}

			if (class205.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1655
				class205.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - class205.worldSelectRightSprite.subWidth - 8, class127.canvasHeight / 2 - class205.worldSelectRightSprite.subHeight / 2); // L: 1656
			}

			int var11 = var9 + 23; // L: 1658
			int var12 = var8 + Login.xPadding; // L: 1659
			int var13 = 0; // L: 1660
			boolean var14 = false; // L: 1661
			int var15 = Login.worldSelectPage; // L: 1662

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1663 1664
				World var17 = class88.World_worlds[var16]; // L: 1667
				boolean var18 = true; // L: 1668
				String var19 = Integer.toString(var17.population); // L: 1669
				if (var17.population == -1) { // L: 1670
					var19 = "OFF"; // L: 1671
					var18 = false; // L: 1672
				} else if (var17.population > 1980) { // L: 1674
					var19 = "FULL"; // L: 1675
					var18 = false; // L: 1676
				}

				int var20 = -1; // L: 1678
				int var21 = 0; // L: 1679
				if (var17.isBeta()) { // L: 1680
					if (var17.isMembersOnly()) { // L: 1681
						var20 = class103.field1361.field1368; // L: 1682
					} else {
						var20 = class103.field1360.field1368; // L: 1685
					}
				} else if (var17.isDeadman()) { // L: 1688
					var21 = 16711680; // L: 1689
					if (var17.isMembersOnly()) { // L: 1690
						var20 = class103.field1359.field1368; // L: 1691
					} else {
						var20 = class103.field1358.field1368; // L: 1694
					}
				} else if (var17.method1774()) { // L: 1697
					if (var17.isMembersOnly()) { // L: 1698
						var20 = class103.field1363.field1368; // L: 1699
					} else {
						var20 = class103.field1362.field1368; // L: 1702
					}
				} else if (var17.isPvp()) { // L: 1705
					if (var17.isMembersOnly()) { // L: 1706
						var20 = class103.field1354.field1368; // L: 1707
					} else {
						var20 = class103.field1356.field1368; // L: 1710
					}
				} else if (var17.method1781()) { // L: 1713
					if (var17.isMembersOnly()) { // L: 1714
						var20 = class103.field1365.field1368; // L: 1715
					} else {
						var20 = class103.field1364.field1368; // L: 1718
					}
				} else if (var17.method1782()) { // L: 1721
					if (var17.isMembersOnly()) { // L: 1722
						var20 = class103.field1367.field1368;
					} else {
						var20 = class103.field1355.field1368; // L: 1723
					}
				}

				if (var20 == -1 || var20 >= class491.worldSelectBackSprites.length) { // L: 1725
					if (var17.isMembersOnly()) { // L: 1726
						var20 = class103.field1371.field1368; // L: 1727
					} else {
						var20 = class103.field1370.field1368; // L: 1730
					}
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var26 && MouseHandler.MouseHandler_y < var27 + var11 && var18) { // L: 1733
					Login.hoveredWorldIndex = var16; // L: 1734
					class491.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 1735
					var14 = true; // L: 1736
				} else {
					class491.worldSelectBackSprites[var20].drawAt(var12, var11); // L: 1738
				}

				if (class307.worldSelectFlagSprites != null) { // L: 1739
					class307.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1); // L: 1740
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1); // L: 1741
				var11 = var11 + var27 + var7; // L: 1742
				++var13; // L: 1743
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 1744
					var12 = var12 + var6 + var26; // L: 1745
					var13 = 0; // L: 1746
					++var15; // L: 1747
				}
			}

			if (var14) { // L: 1750
				var16 = var1.stringWidth(class88.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1751
				int var24 = var1.ascent + 8; // L: 1752
				int var25 = MouseHandler.MouseHandler_y + 25; // L: 1753
				if (var25 + var24 > 480) { // L: 1754
					var25 = MouseHandler.MouseHandler_y - 25 - var24; // L: 1755
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120); // L: 1757
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0); // L: 1758
				var1.drawCentered(class88.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1); // L: 1759
			}
		}

		class25.rasterProvider.drawFull(0, 0); // L: 1762
	} // L: 1763

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I",
		garbageValue = "-67"
	)
	static int method5294(int var0, Script var1, boolean var2) {
		Widget var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1828
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1829
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = MenuAction.Widget_unpackTargetMask(class173.getWidgetFlags(var3)); // L: 1830
			return 1; // L: 1831
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1833
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1840
				if (var3.dataText == null) { // L: 1841
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1842
				}

				return 1; // L: 1843
			} else {
				return 2; // L: 1845
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1834
			--var4; // L: 1835
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1836
				Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1837
			} else {
				Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1838
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lkz;IIII)V",
		garbageValue = "-1221066541"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		HorizontalAlignment.playPcmPlayers(); // L: 12968
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12969
		if (var4 != null) { // L: 12970
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12971
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12972
				int var5 = Client.camAngleY & 2047; // L: 12973
				int var6 = class387.localPlayer.x / 32 + 48; // L: 12974
				int var7 = 464 - class387.localPlayer.y / 32; // L: 12975
				class31.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12976

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12977
					var16 = Client.field607[var8] * 4 + 2 - class387.localPlayer.x / 32; // L: 12978
					var10 = Client.field591[var8] * 4 + 2 - class387.localPlayer.y / 32; // L: 12979
					class31.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12980
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12982
					for (var16 = 0; var16 < 104; ++var16) { // L: 12983
						NodeDeque var14 = Client.groundItems[class103.Client_plane][var8][var16]; // L: 12984
						if (var14 != null) { // L: 12985
							var11 = var8 * 4 + 2 - class387.localPlayer.x / 32; // L: 12986
							var12 = var16 * 4 + 2 - class387.localPlayer.y / 32; // L: 12987
							class31.drawSpriteOnMinimap(var1, var2, var11, var12, UrlRequest.mapDotSprites[0], var4); // L: 12988
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12992
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12993
					if (var9 != null && var9.isVisible()) { // L: 12994
						NPCComposition var18 = var9.definition; // L: 12995
						if (var18 != null && var18.transforms != null) { // L: 12996
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12997
							var11 = var9.x / 32 - class387.localPlayer.x / 32; // L: 12998
							var12 = var9.y / 32 - class387.localPlayer.y / 32; // L: 12999
							class31.drawSpriteOnMinimap(var1, var2, var11, var12, UrlRequest.mapDotSprites[1], var4); // L: 13000
						}
					}
				}

				var8 = Players.Players_count; // L: 13004
				int[] var17 = Players.Players_indices; // L: 13005

				for (var10 = 0; var10 < var8; ++var10) { // L: 13006
					Player var15 = Client.players[var17[var10]]; // L: 13007
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class387.localPlayer) { // L: 13008
						var12 = var15.x / 32 - class387.localPlayer.x / 32; // L: 13009
						int var13 = var15.y / 32 - class387.localPlayer.y / 32; // L: 13010
						if (var15.isFriend()) { // L: 13011
							class31.drawSpriteOnMinimap(var1, var2, var12, var13, UrlRequest.mapDotSprites[3], var4);
						} else if (class387.localPlayer.team != 0 && var15.team != 0 && var15.team == class387.localPlayer.team) { // L: 13012
							class31.drawSpriteOnMinimap(var1, var2, var12, var13, UrlRequest.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 13013
							class31.drawSpriteOnMinimap(var1, var2, var12, var13, UrlRequest.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 13014
							class31.drawSpriteOnMinimap(var1, var2, var12, var13, UrlRequest.mapDotSprites[6], var4);
						} else {
							class31.drawSpriteOnMinimap(var1, var2, var12, var13, UrlRequest.mapDotSprites[2], var4); // L: 13015
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 13018
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 13019
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 13020
						if (var19 != null) { // L: 13021
							var11 = var19.x / 32 - class387.localPlayer.x / 32; // L: 13022
							var12 = var19.y / 32 - class387.localPlayer.y / 32; // L: 13023
							class361.worldToMinimap(var1, var2, var11, var12, UserComparator6.mapMarkerSprites[1], var4); // L: 13024
						}
					}

					if (Client.hintArrowType == 2) { // L: 13027
						var10 = Client.hintArrowX * 4 - ParamComposition.baseX * 256 + 2 - class387.localPlayer.x / 32; // L: 13028
						var11 = Client.hintArrowY * 4 - Client.baseY * 256 + 2 - class387.localPlayer.y / 32; // L: 13029
						class361.worldToMinimap(var1, var2, var10, var11, UserComparator6.mapMarkerSprites[1], var4); // L: 13030
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 13032
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 13033
						if (var20 != null) { // L: 13034
							var11 = var20.x / 32 - class387.localPlayer.x / 32; // L: 13035
							var12 = var20.y / 32 - class387.localPlayer.y / 32; // L: 13036
							class361.worldToMinimap(var1, var2, var11, var12, UserComparator6.mapMarkerSprites[1], var4); // L: 13037
						}
					}
				}

				if (Client.destinationX != 0) { // L: 13041
					var10 = Client.destinationX * 4 + 2 - class387.localPlayer.x / 32; // L: 13042
					var11 = Client.destinationY * 4 + 2 - class387.localPlayer.y / 32; // L: 13043
					class31.drawSpriteOnMinimap(var1, var2, var10, var11, UserComparator6.mapMarkerSprites[0], var4); // L: 13044
				}

				if (!class387.localPlayer.isHidden) { // L: 13046
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 13048
			}

			Client.field678[var3] = true; // L: 13049
		}
	} // L: 13050
}
