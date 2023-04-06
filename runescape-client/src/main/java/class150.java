import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fh")
public class class150 extends class140 {
	@ObfuscatedName("ap")
	static int[] field1680;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1214622489
	)
	int field1682;
	@ObfuscatedName("al")
	String field1681;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfo;)V"
	)
	class150(class143 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-1979280996"
	)
	void vmethod3361(Buffer var1) {
		this.field1682 = var1.readInt(); // L: 326
		this.field1681 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "29"
	)
	void vmethod3362(ClanSettings var1) {
		var1.method3211(this.field1682, this.field1681); // L: 331
	} // L: 332

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "67"
	)
	static final boolean method3188(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 239
		Buffer var4 = new Buffer(var0); // L: 240
		int var5 = -1; // L: 241

		label71:
		while (true) {
			int var6 = var4.method8696(); // L: 243
			if (var6 == 0) { // L: 244
				return var3; // L: 275
			}

			var5 += var6; // L: 245
			int var7 = 0; // L: 246
			boolean var8 = false; // L: 247

			while (true) {
				int var9;
				while (!var8) { // L: 249
					var9 = var4.readUShortSmart(); // L: 255
					if (var9 == 0) { // L: 256
						continue label71;
					}

					var7 += var9 - 1; // L: 257
					int var10 = var7 & 63; // L: 258
					int var11 = var7 >> 6 & 63; // L: 259
					int var12 = var4.readUnsignedByte() >> 2; // L: 260
					int var13 = var11 + var1; // L: 261
					int var14 = var10 + var2; // L: 262
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 263
						ObjectComposition var15 = DecorativeObject.getObjectDefinition(var5); // L: 264
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 265
							if (!var15.needsModelFiles()) { // L: 266
								++Client.field548; // L: 267
								var3 = false; // L: 268
							}

							var8 = true; // L: 270
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 250
				if (var9 == 0) { // L: 251
					break;
				}

				var4.readUnsignedByte(); // L: 252
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "2036952880"
	)
	static int method3181(int var0, Script var1, boolean var2) {
		Widget var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1607
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1608
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1609
			return 1; // L: 1610
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1612
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1613
			return 1; // L: 1614
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1616
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1617
			return 1; // L: 1618
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1620
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1621
			return 1; // L: 1622
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1624
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1625
			return 1; // L: 1626
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1628
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1629
			return 1; // L: 1630
		} else {
			return 2; // L: 1632
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "-1653447364"
	)
	static final void method3183(class283 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7542
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		NodeDeque var33;
		TileItem var41;
		if (class283.field3154 == var0) { // L: 7543
			var2 = var1.readUnsignedShort(); // L: 7544
			var3 = var1.method8650(); // L: 7545
			var4 = (var3 >> 4 & 7) + class283.field3165; // L: 7546
			var5 = (var3 & 7) + class149.field1677; // L: 7547
			var6 = var1.readUnsignedByte(); // L: 7548
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7549
				var33 = Client.groundItems[TaskHandler.Client_plane][var4][var5]; // L: 7550
				if (var33 != null) { // L: 7551
					for (var41 = (TileItem)var33.last(); var41 != null; var41 = (TileItem)var33.previous()) { // L: 7552 7553 7558
						if ((var2 & 32767) == var41.id) { // L: 7554
							var41.method2649(var6); // L: 7555
							break;
						}
					}
				}
			}

		} else {
			int var7;
			int var8;
			int var9;
			int var10;
			if (class283.field3158 == var0) { // L: 7564
				var2 = var1.method8651(); // L: 7565
				var3 = var2 >> 4 & 15; // L: 7566
				var4 = var2 & 7; // L: 7567
				var5 = var1.readUnsignedByte(); // L: 7568
				var6 = (var5 >> 4 & 7) + class283.field3165; // L: 7569
				var7 = (var5 & 7) + class149.field1677; // L: 7570
				var8 = var1.method8662(); // L: 7571
				var9 = var1.readUnsignedByte(); // L: 7572
				if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 7573
					var10 = var3 + 1; // L: 7574
					if (BuddyRankComparator.localPlayer.pathX[0] >= var6 - var10 && BuddyRankComparator.localPlayer.pathX[0] <= var10 + var6 && BuddyRankComparator.localPlayer.pathY[0] >= var7 - var10 && BuddyRankComparator.localPlayer.pathY[0] <= var10 + var7 && WorldMapSectionType.clientPreferences.method2463() != 0 && var4 > 0 && Client.soundEffectCount < 50) { // L: 7575 7576
						Client.soundEffectIds[Client.soundEffectCount] = var8; // L: 7577
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 7578
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9; // L: 7579
						Client.soundEffects[Client.soundEffectCount] = null; // L: 7580
						Client.soundLocations[Client.soundEffectCount] = var3 + (var7 << 8) + (var6 << 16); // L: 7581
						++Client.soundEffectCount; // L: 7582
					}
				}
			}

			int var11;
			if (class283.field3159 == var0) { // L: 7587
				var2 = var1.method8651(); // L: 7588
				var3 = var2 >> 2; // L: 7589
				var4 = var2 & 3; // L: 7590
				var5 = Client.field554[var3]; // L: 7591
				var6 = var1.method8651(); // L: 7592
				var7 = (var6 >> 4 & 7) + class283.field3165; // L: 7593
				var8 = (var6 & 7) + class149.field1677; // L: 7594
				var9 = var1.readUnsignedShort(); // L: 7595
				if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) { // L: 7596
					if (var5 == 0) { // L: 7597
						WallObject var35 = class1.scene.method4408(TaskHandler.Client_plane, var7, var8); // L: 7598
						if (var35 != null) { // L: 7599
							var11 = class279.Entity_unpackID(var35.tag); // L: 7600
							if (var3 == 2) { // L: 7601
								var35.renderable1 = new DynamicObject(var11, 2, var4 + 4, TaskHandler.Client_plane, var7, var8, var9, false, var35.renderable1); // L: 7602
								var35.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, TaskHandler.Client_plane, var7, var8, var9, false, var35.renderable2); // L: 7603
							} else {
								var35.renderable1 = new DynamicObject(var11, var3, var4, TaskHandler.Client_plane, var7, var8, var9, false, var35.renderable1); // L: 7605
							}

							return; // L: 7606
						}
					}

					if (var5 == 1) { // L: 7609
						DecorativeObject var43 = class1.scene.method4409(TaskHandler.Client_plane, var7, var8); // L: 7610
						if (var43 != null) { // L: 7611
							var11 = class279.Entity_unpackID(var43.tag); // L: 7612
							if (var3 != 4 && var3 != 5) { // L: 7613
								if (var3 == 6) { // L: 7614
									var43.renderable1 = new DynamicObject(var11, 4, var4 + 4, TaskHandler.Client_plane, var7, var8, var9, false, var43.renderable1);
								} else if (var3 == 7) { // L: 7615
									var43.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, TaskHandler.Client_plane, var7, var8, var9, false, var43.renderable1);
								} else if (var3 == 8) { // L: 7616
									var43.renderable1 = new DynamicObject(var11, 4, var4 + 4, TaskHandler.Client_plane, var7, var8, var9, false, var43.renderable1); // L: 7617
									var43.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, TaskHandler.Client_plane, var7, var8, var9, false, var43.renderable2); // L: 7618
								}
							} else {
								var43.renderable1 = new DynamicObject(var11, 4, var4, TaskHandler.Client_plane, var7, var8, var9, false, var43.renderable1);
							}

							return; // L: 7620
						}
					}

					if (var5 == 2) { // L: 7623
						GameObject var44 = class1.scene.getGameObject(TaskHandler.Client_plane, var7, var8); // L: 7624
						if (var3 == 11) { // L: 7625
							var3 = 10;
						}

						if (var44 != null) { // L: 7626
							var44.renderable = new DynamicObject(class279.Entity_unpackID(var44.tag), var3, var4, TaskHandler.Client_plane, var7, var8, var9, false, var44.renderable); // L: 7627
							return; // L: 7628
						}
					}

					if (var5 == 3) { // L: 7631
						GroundObject var45 = class1.scene.getGroundObject(TaskHandler.Client_plane, var7, var8); // L: 7632
						if (var45 != null) { // L: 7633
							var45.renderable = new DynamicObject(class279.Entity_unpackID(var45.tag), 22, var4, TaskHandler.Client_plane, var7, var8, var9, false, var45.renderable); // L: 7634
							return; // L: 7635
						}
					}

					class140.method3113(TaskHandler.Client_plane, var7, var8, var5, var9); // L: 7638
				}

			} else if (class283.field3160 == var0) { // L: 7642
				var2 = var1.method8660(); // L: 7643
				var3 = var1.readInt(); // L: 7644
				var4 = var1.method8650(); // L: 7645
				var5 = (var4 >> 4 & 7) + class283.field3165; // L: 7646
				var6 = (var4 & 7) + class149.field1677; // L: 7647
				var7 = var1.readInt(); // L: 7648
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7649
					NodeDeque var42 = Client.groundItems[TaskHandler.Client_plane][var5][var6]; // L: 7650
					if (var42 != null) { // L: 7651
						for (TileItem var34 = (TileItem)var42.last(); var34 != null; var34 = (TileItem)var42.previous()) { // L: 7652 7653 7658
							if ((var2 & 32767) == var34.id && var7 == var34.quantity) { // L: 7654
								var34.quantity = var3; // L: 7655
								break;
							}
						}

						class148.updateItemPile(var5, var6); // L: 7660
					}
				}

			} else if (class283.field3155 == var0) { // L: 7665
				var2 = var1.readUnsignedShort(); // L: 7666
				var3 = var1.method8724(); // L: 7667
				var4 = var1.readUnsignedByte(); // L: 7668
				var5 = (var4 >> 4 & 7) + class283.field3165; // L: 7669
				var6 = (var4 & 7) + class149.field1677; // L: 7670
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7671
					var33 = Client.groundItems[TaskHandler.Client_plane][var5][var6]; // L: 7672
					if (var33 != null) { // L: 7673
						for (var41 = (TileItem)var33.last(); var41 != null; var41 = (TileItem)var33.previous()) { // L: 7674 7675 7680
							if ((var2 & 32767) == var41.id && var3 == var41.quantity) { // L: 7676
								var41.remove(); // L: 7677
								break;
							}
						}

						if (var33.last() == null) { // L: 7682
							Client.groundItems[TaskHandler.Client_plane][var5][var6] = null;
						}

						class148.updateItemPile(var5, var6); // L: 7683
					}
				}

			} else if (class283.field3157 == var0) { // L: 7688
				var2 = var1.method8614(); // L: 7689
				var3 = var1.method8831(); // L: 7690
				var4 = var1.method8614(); // L: 7691
				var5 = var4 >> 2; // L: 7692
				var6 = var4 & 3; // L: 7693
				var7 = Client.field554[var5]; // L: 7694
				var8 = var1.readUnsignedByte(); // L: 7695
				var9 = (var8 >> 4 & 7) + class283.field3165; // L: 7696
				var10 = (var8 & 7) + class149.field1677; // L: 7697
				if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) { // L: 7698
					Decimator.method1124(TaskHandler.Client_plane, var9, var10, var7, var3, var5, var6, var2, 0, -1); // L: 7699
				}

			} else if (class283.field3156 == var0) { // L: 7703
				var1.method8662(); // L: 7704
				var2 = var1.method8650(); // L: 7705
				var3 = var1.method8662(); // L: 7706
				var1.method8614(); // L: 7707
				var1.readUnsignedShort(); // L: 7708
				var4 = var1.method8724(); // L: 7709
				var1.method8614(); // L: 7710
				var5 = var1.method8650(); // L: 7711
				var6 = (var5 >> 4 & 7) + class283.field3165; // L: 7712
				var7 = (var5 & 7) + class149.field1677; // L: 7713
				if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 7714
					var41 = new TileItem(); // L: 7715
					var41.id = var3; // L: 7716
					var41.quantity = var4; // L: 7717
					var41.method2649(var2); // L: 7718
					if (Client.groundItems[TaskHandler.Client_plane][var6][var7] == null) { // L: 7719
						Client.groundItems[TaskHandler.Client_plane][var6][var7] = new NodeDeque(); // L: 7720
					}

					Client.groundItems[TaskHandler.Client_plane][var6][var7].addFirst(var41); // L: 7722
					class148.updateItemPile(var6, var7); // L: 7723
				}

			} else if (class283.field3164 == var0) { // L: 7727
				var2 = var1.method8660(); // L: 7728
				var3 = var1.method8651(); // L: 7729
				var4 = (var3 >> 4 & 7) + class283.field3165; // L: 7730
				var5 = (var3 & 7) + class149.field1677; // L: 7731
				var6 = var1.method8831(); // L: 7732
				var7 = var1.readUnsignedByte(); // L: 7733
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7734
					var4 = var4 * 128 + 64; // L: 7735
					var5 = var5 * 128 + 64; // L: 7736
					GraphicsObject var32 = new GraphicsObject(var6, TaskHandler.Client_plane, var4, var5, WorldMapDecorationType.getTileHeight(var4, var5, TaskHandler.Client_plane) - var7, var2, Client.cycle); // L: 7737
					Client.graphicsObjects.addFirst(var32); // L: 7738
				}

			} else {
				int var12;
				int var13;
				int var14;
				if (class283.field3162 == var0) { // L: 7742
					var2 = var1.method8678(); // L: 7743
					byte var37 = var1.method8604(); // L: 7744
					var4 = var1.method8614() * 4; // L: 7745
					byte var38 = var1.readByte(); // L: 7746
					var6 = var1.method8660(); // L: 7747
					var7 = var1.readUnsignedByte(); // L: 7748
					var8 = var1.method8660(); // L: 7749
					var9 = var1.readUnsignedByte() * 4; // L: 7750
					var10 = var1.method8651(); // L: 7751
					var11 = var1.method8651(); // L: 7752
					var12 = (var11 >> 4 & 7) + class283.field3165; // L: 7753
					var13 = (var11 & 7) + class149.field1677; // L: 7754
					var14 = var1.method8662(); // L: 7755
					var5 = var38 + var12; // L: 7756
					var3 = var37 + var13; // L: 7757
					if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104 && var5 >= 0 && var3 >= 0 && var5 < 104 && var3 < 104 && var8 != 65535) { // L: 7758
						var12 = var12 * 128 + 64; // L: 7759
						var13 = var13 * 128 + 64; // L: 7760
						var5 = var5 * 128 + 64; // L: 7761
						var3 = var3 * 128 + 64; // L: 7762
						Projectile var31 = new Projectile(var8, TaskHandler.Client_plane, var12, var13, WorldMapDecorationType.getTileHeight(var12, var13, TaskHandler.Client_plane) - var4, var14 + Client.cycle, var6 + Client.cycle, var10, var7, var2, var9); // L: 7763
						var31.setDestination(var5, var3, WorldMapDecorationType.getTileHeight(var5, var3, TaskHandler.Client_plane) - var9, var14 + Client.cycle); // L: 7764
						Client.projectiles.addFirst(var31); // L: 7765
					}

				} else if (class283.field3163 == var0) { // L: 7769
					var2 = var1.readUnsignedByte(); // L: 7770
					var3 = var2 >> 2; // L: 7771
					var4 = var2 & 3; // L: 7772
					var5 = Client.field554[var3]; // L: 7773
					var6 = var1.readUnsignedByte(); // L: 7774
					var7 = (var6 >> 4 & 7) + class283.field3165; // L: 7775
					var8 = (var6 & 7) + class149.field1677; // L: 7776
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7777
						Decimator.method1124(TaskHandler.Client_plane, var7, var8, var5, -1, var3, var4, 31, 0, -1); // L: 7778
					}

				} else {
					if (class283.field3161 == var0) { // L: 7782
						byte var36 = var1.method8604(); // L: 7783
						var3 = var1.method8651(); // L: 7784
						var4 = (var3 >> 4 & 7) + class283.field3165; // L: 7785
						var5 = (var3 & 7) + class149.field1677; // L: 7786
						var6 = var1.method8831(); // L: 7787
						byte var39 = var1.method8654(); // L: 7788
						var8 = var1.method8660(); // L: 7789
						byte var40 = var1.method8656(); // L: 7790
						var10 = var1.readUnsignedShort(); // L: 7791
						var11 = var1.method8651(); // L: 7792
						var12 = var11 >> 2; // L: 7793
						var13 = var11 & 3; // L: 7794
						var14 = Client.field554[var12]; // L: 7795
						int var15 = var1.readUnsignedShort(); // L: 7796
						byte var16 = var1.method8656(); // L: 7797
						Player var17;
						if (var6 == Client.localPlayerIndex) { // L: 7799
							var17 = BuddyRankComparator.localPlayer;
						} else {
							var17 = Client.players[var6]; // L: 7800
						}

						if (var17 != null) { // L: 7801
							ObjectComposition var18 = DecorativeObject.getObjectDefinition(var8); // L: 7802
							int var19;
							int var20;
							if (var13 != 1 && var13 != 3) { // L: 7805
								var19 = var18.sizeX; // L: 7810
								var20 = var18.sizeY; // L: 7811
							} else {
								var19 = var18.sizeY; // L: 7806
								var20 = var18.sizeX; // L: 7807
							}

							int var21 = var4 + (var19 >> 1); // L: 7813
							int var22 = var4 + (var19 + 1 >> 1); // L: 7814
							int var23 = var5 + (var20 >> 1); // L: 7815
							int var24 = var5 + (var20 + 1 >> 1); // L: 7816
							int[][] var25 = Tiles.Tiles_heights[TaskHandler.Client_plane]; // L: 7817
							int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2; // L: 7818
							int var27 = (var4 << 7) + (var19 << 6); // L: 7819
							int var28 = (var5 << 7) + (var20 << 6); // L: 7820
							Model var29 = var18.getModel(var12, var13, var25, var27, var26, var28); // L: 7821
							if (var29 != null) { // L: 7822
								Decimator.method1124(TaskHandler.Client_plane, var4, var5, var14, -1, 0, 0, 31, var15 + 1, var10 + 1); // L: 7823
								var17.animationCycleStart = var15 + Client.cycle; // L: 7824
								var17.animationCycleEnd = var10 + Client.cycle; // L: 7825
								var17.model0 = var29; // L: 7826
								var17.field1095 = var4 * 128 + var19 * 64; // L: 7827
								var17.field1097 = var5 * 128 + var20 * 64; // L: 7828
								var17.tileHeight2 = var26; // L: 7829
								byte var30;
								if (var16 > var40) { // L: 7830
									var30 = var16; // L: 7831
									var16 = var40; // L: 7832
									var40 = var30; // L: 7833
								}

								if (var39 > var36) { // L: 7835
									var30 = var39; // L: 7836
									var39 = var36; // L: 7837
									var36 = var30; // L: 7838
								}

								var17.minX = var16 + var4; // L: 7840
								var17.maxX = var40 + var4; // L: 7841
								var17.minY = var39 + var5; // L: 7842
								var17.maxY = var36 + var5; // L: 7843
							}
						}
					}

				}
			}
		}
	} // L: 7562 7640 7663 7686 7701 7725 7740 7767 7780 7847

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1445723028"
	)
	static boolean method3190(int var0) {
		for (int var1 = 0; var1 < Client.field714; ++var1) { // L: 11351
			if (Client.field716[var1] == var0) { // L: 11352
				return true;
			}
		}

		return false; // L: 11354
	}
}
