import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("decimator")
	static Decimator decimator;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lax;",
		garbageValue = "999216376"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-98"
	)
	static void method320(int var0) {
		class12.method155(14); // L: 2358
		Login.field924 = var0; // L: 2359
	} // L: 2360

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lkd;IIB)V",
		garbageValue = "1"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3592
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !SceneTilePaint.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3593
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3594
				if (var3 == null) { // L: 3595
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3596
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3597
				if (var3.contains(var4, var5)) { // L: 3598
					var4 -= var3.width / 2; // L: 3599
					var5 -= var3.height / 2; // L: 3600
					int var6 = Client.camAngleY & 2047; // L: 3601
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3602
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3603
					int var9 = var7 * var5 + var4 * var8 >> 11; // L: 3604
					int var10 = var5 * var8 - var4 * var7 >> 11; // L: 3605
					int var11 = var9 + class155.localPlayer.x >> 7; // L: 3606
					int var12 = class155.localPlayer.y - var10 >> 7; // L: 3607
					PacketBufferNode var13 = class136.getPacketBufferNode(ClientPacket.field3097, Client.packetWriter.isaacCipher); // L: 3609
					var13.packetBuffer.writeByte(18); // L: 3610
					var13.packetBuffer.method8580(Client.field747.method4106(82) ? (Client.field747.method4106(81) ? 2 : 1) : 0); // L: 3611
					var13.packetBuffer.method8607(class154.baseX * 64 + var11); // L: 3612
					var13.packetBuffer.writeIntME(class365.baseY * 64 + var12); // L: 3613
					var13.packetBuffer.writeByte(var4); // L: 3614
					var13.packetBuffer.writeByte(var5); // L: 3615
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3616
					var13.packetBuffer.writeByte(57); // L: 3617
					var13.packetBuffer.writeByte(0); // L: 3618
					var13.packetBuffer.writeByte(0); // L: 3619
					var13.packetBuffer.writeByte(89); // L: 3620
					var13.packetBuffer.writeShort(class155.localPlayer.x); // L: 3621
					var13.packetBuffer.writeShort(class155.localPlayer.y); // L: 3622
					var13.packetBuffer.writeByte(63); // L: 3623
					Client.packetWriter.addNode(var13); // L: 3624
					Client.destinationX = var11; // L: 3625
					Client.destinationY = var12; // L: 3626
				}
			}

		}
	} // L: 3629

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "226"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4879
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4880
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4881
				int var3 = var2.x >> 7; // L: 4882
				int var4 = var2.y >> 7; // L: 4883
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4884
					if (var2.field1181 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4885
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4886
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4887
					}

					long var5 = GameEngine.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4889
					var2.playerCycle = Client.cycle; // L: 4890
					ReflectionCheck.scene.drawEntity(class383.Client_plane, var2.x, var2.y, SpotAnimationDefinition.getTileHeight(var2.field1181 * 64 - 64 + var2.x, var2.field1181 * 64 - 64 + var2.y, class383.Client_plane), var2.field1181 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4891
				}
			}
		}

	} // L: 4895

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ljn;I)V",
		garbageValue = "2022149498"
	)
	static final void method315(class276 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7602
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		TileItem var32;
		if (class276.field3165 == var0) { // L: 7603
			var2 = var1.readUnsignedByte(); // L: 7604
			var3 = var1.method8591(); // L: 7605
			var4 = var1.readInt(); // L: 7606
			var5 = var1.method8581(); // L: 7607
			var6 = (var5 >> 4 & 7) + InvDefinition.field1918; // L: 7608
			var7 = (var5 & 7) + class125.field1560; // L: 7609
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 7610
				var32 = new TileItem(); // L: 7611
				var32.id = var3; // L: 7612
				var32.quantity = var4; // L: 7613
				var32.method2612(var2); // L: 7614
				if (Client.groundItems[class383.Client_plane][var6][var7] == null) { // L: 7615
					Client.groundItems[class383.Client_plane][var6][var7] = new NodeDeque(); // L: 7616
				}

				Client.groundItems[class383.Client_plane][var6][var7].addFirst(var32); // L: 7618
				class358.updateItemPile(var6, var7); // L: 7619
			}

		} else if (class276.field3159 == var0) { // L: 7623
			var2 = var1.method8591(); // L: 7624
			var3 = var1.readUnsignedByte(); // L: 7625
			var4 = var1.method8702(); // L: 7626
			var5 = (var4 >> 4 & 7) + InvDefinition.field1918; // L: 7627
			var6 = (var4 & 7) + class125.field1560; // L: 7628
			var7 = var1.method8591(); // L: 7629
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7630
				var5 = var5 * 128 + 64; // L: 7631
				var6 = var6 * 128 + 64; // L: 7632
				GraphicsObject var43 = new GraphicsObject(var7, class383.Client_plane, var5, var6, SpotAnimationDefinition.getTileHeight(var5, var6, class383.Client_plane) - var3, var2, Client.cycle); // L: 7633
				Client.graphicsObjects.addFirst(var43); // L: 7634
			}

		} else if (class276.field3163 == var0) { // L: 7638
			var2 = var1.readUnsignedByte(); // L: 7639
			var3 = (var2 >> 4 & 7) + InvDefinition.field1918; // L: 7640
			var4 = (var2 & 7) + class125.field1560; // L: 7641
			var1.method8592(); // L: 7642
			var5 = var1.method8699(); // L: 7643
			var1.method8530(); // L: 7644
			var6 = var1.readInt(); // L: 7645
			var1.method8702(); // L: 7646
			var1.method8702(); // L: 7647
			var7 = var1.readUnsignedShort(); // L: 7648
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7649
				var32 = new TileItem(); // L: 7650
				var32.id = var7; // L: 7651
				var32.quantity = var6; // L: 7652
				var32.method2612(var5); // L: 7653
				if (Client.groundItems[class383.Client_plane][var3][var4] == null) { // L: 7654
					Client.groundItems[class383.Client_plane][var3][var4] = new NodeDeque(); // L: 7655
				}

				Client.groundItems[class383.Client_plane][var3][var4].addFirst(var32); // L: 7657
				class358.updateItemPile(var3, var4); // L: 7658
			}

		} else {
			int var8;
			int var9;
			int var10;
			int var12;
			byte var13;
			byte var14;
			Projectile var36;
			int var37;
			int var39;
			int var40;
			if (class276.field3171 == var0) { // L: 7662
				var2 = var1.method8699() * 4; // L: 7663
				var3 = var1.readUnsignedByte(); // L: 7664
				var4 = (var3 >> 4 & 7) + InvDefinition.field1918; // L: 7665
				var5 = (var3 & 7) + class125.field1560; // L: 7666
				var6 = var1.method8591(); // L: 7667
				var7 = var1.method8591(); // L: 7668
				var8 = var1.method8581() * 4; // L: 7669
				var9 = var1.method8699(); // L: 7670
				var10 = var1.readUnsignedByte(); // L: 7671
				var37 = var1.readShort(); // L: 7672
				var12 = var1.method8591(); // L: 7673
				var13 = var1.method8701(); // L: 7674
				var14 = var1.readByte(); // L: 7675
				var39 = var13 + var4; // L: 7676
				var40 = var14 + var5; // L: 7677
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104 && var12 != 65535) { // L: 7678
					var4 = var4 * 128 + 64; // L: 7679
					var5 = var5 * 128 + 64; // L: 7680
					var39 = var39 * 128 + 64; // L: 7681
					var40 = var40 * 128 + 64; // L: 7682
					var36 = new Projectile(var12, class383.Client_plane, var4, var5, SpotAnimationDefinition.getTileHeight(var4, var5, class383.Client_plane) - var8, var6 + Client.cycle, var7 + Client.cycle, var10, var9, var37, var2); // L: 7683
					var36.setDestination(var39, var40, SpotAnimationDefinition.getTileHeight(var39, var40, class383.Client_plane) - var2, var6 + Client.cycle); // L: 7684
					Client.projectiles.addFirst(var36); // L: 7685
				}

			} else if (class276.field3157 == var0) { // L: 7689
				var2 = var1.method8702(); // L: 7690
				var3 = var2 >> 2; // L: 7691
				var4 = var2 & 3; // L: 7692
				var5 = Client.field579[var3]; // L: 7693
				var6 = var1.method8702(); // L: 7694
				var7 = (var6 >> 4 & 7) + InvDefinition.field1918; // L: 7695
				var8 = (var6 & 7) + class125.field1560; // L: 7696
				var9 = var1.method8702(); // L: 7697
				var10 = var1.method8530(); // L: 7698
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7699
					class11.method105(class383.Client_plane, var7, var8, var5, var10, var3, var4, var9, 0, -1); // L: 7700
				}

			} else {
				NodeDeque var31;
				if (class276.field3169 == var0) { // L: 7704
					var2 = var1.method8581(); // L: 7705
					var3 = (var2 >> 4 & 7) + InvDefinition.field1918; // L: 7706
					var4 = (var2 & 7) + class125.field1560; // L: 7707
					var5 = var1.readUnsignedShort(); // L: 7708
					var6 = var1.method8585(); // L: 7709
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7710
						var31 = Client.groundItems[class383.Client_plane][var3][var4]; // L: 7711
						if (var31 != null) { // L: 7712
							for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 7713 7714 7719
								if ((var5 & 32767) == var32.id && var6 == var32.quantity) { // L: 7715
									var32.remove(); // L: 7716
									break;
								}
							}

							if (var31.last() == null) { // L: 7721
								Client.groundItems[class383.Client_plane][var3][var4] = null;
							}

							class358.updateItemPile(var3, var4); // L: 7722
						}
					}

				} else if (class276.field3166 == var0) { // L: 7727
					var2 = var1.method8581(); // L: 7728
					var3 = var2 >> 2; // L: 7729
					var4 = var2 & 3; // L: 7730
					var5 = Client.field579[var3]; // L: 7731
					var6 = var1.method8581(); // L: 7732
					var7 = (var6 >> 4 & 7) + InvDefinition.field1918; // L: 7733
					var8 = (var6 & 7) + class125.field1560; // L: 7734
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7735
						class11.method105(class383.Client_plane, var7, var8, var5, -1, var3, var4, 31, 0, -1); // L: 7736
					}

				} else {
					if (class276.field3158 == var0) { // L: 7740
						var2 = var1.readUnsignedByte(); // L: 7741
						var3 = var1.method8592(); // L: 7742
						var4 = var1.method8702(); // L: 7743
						var5 = (var4 >> 4 & 7) + InvDefinition.field1918; // L: 7744
						var6 = (var4 & 7) + class125.field1560; // L: 7745
						var7 = var1.method8581(); // L: 7746
						var8 = var7 >> 4 & 15; // L: 7747
						var9 = var7 & 7; // L: 7748
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7749
							var10 = var8 + 1; // L: 7750
							if (class155.localPlayer.pathX[0] >= var5 - var10 && class155.localPlayer.pathX[0] <= var5 + var10 && class155.localPlayer.pathY[0] >= var6 - var10 && class155.localPlayer.pathY[0] <= var10 + var6 && StructComposition.clientPreferences.method2506() != 0 && var9 > 0 && Client.soundEffectCount < 50) { // L: 7751 7752
								Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 7753
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var9; // L: 7754
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 7755
								Client.soundEffects[Client.soundEffectCount] = null; // L: 7756
								Client.soundLocations[Client.soundEffectCount] = var8 + (var6 << 8) + (var5 << 16); // L: 7757
								++Client.soundEffectCount; // L: 7758
							}
						}
					}

					if (class276.field3164 == var0) { // L: 7763
						var2 = var1.method8702(); // L: 7764
						var3 = var1.method8530(); // L: 7765
						var4 = var1.method8591(); // L: 7766
						var5 = var1.readUnsignedByte() * 4; // L: 7767
						var6 = var1.method8702(); // L: 7768
						var7 = (var6 >> 4 & 7) + InvDefinition.field1918; // L: 7769
						var8 = (var6 & 7) + class125.field1560; // L: 7770
						var9 = var1.readUnsignedByte() * 4; // L: 7771
						var10 = var1.method8530(); // L: 7772
						var37 = var1.method8702(); // L: 7773
						byte var38 = var1.method8701(); // L: 7774
						var13 = var1.method8718(); // L: 7775
						var40 = var1.method8549(); // L: 7776
						var39 = var13 + var7; // L: 7777
						var12 = var38 + var8; // L: 7778
						if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var39 >= 0 && var12 >= 0 && var39 < 104 && var12 < 104 && var4 != 65535) { // L: 7779
							var7 = var7 * 128 + 64; // L: 7780
							var8 = var8 * 128 + 64; // L: 7781
							var39 = var39 * 128 + 64; // L: 7782
							var12 = var12 * 128 + 64; // L: 7783
							var36 = new Projectile(var4, class383.Client_plane, var7, var8, SpotAnimationDefinition.getTileHeight(var7, var8, class383.Client_plane) - var5, var10 + Client.cycle, var3 + Client.cycle, var2, var37, var40, var9); // L: 7784
							var36.setDestination(var39, var12, SpotAnimationDefinition.getTileHeight(var39, var12, class383.Client_plane) - var9, var10 + Client.cycle); // L: 7785
							Client.projectiles.addFirst(var36); // L: 7786
						}

					} else if (class276.field3168 == var0) { // L: 7790
						var2 = var1.method8591(); // L: 7791
						var3 = var1.method8592(); // L: 7792
						var4 = var1.method8699(); // L: 7793
						var5 = (var4 >> 4 & 7) + InvDefinition.field1918; // L: 7794
						var6 = (var4 & 7) + class125.field1560; // L: 7795
						var7 = var1.method8530(); // L: 7796
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7797
							NodeDeque var42 = Client.groundItems[class383.Client_plane][var5][var6]; // L: 7798
							if (var42 != null) { // L: 7799
								for (TileItem var35 = (TileItem)var42.last(); var35 != null; var35 = (TileItem)var42.previous()) { // L: 7800 7801 7806
									if ((var7 & 32767) == var35.id && var3 == var35.quantity) { // L: 7802
										var35.quantity = var2; // L: 7803
										break;
									}
								}

								class358.updateItemPile(var5, var6); // L: 7808
							}
						}

					} else {
						if (class276.field3167 == var0) { // L: 7813
							var2 = var1.method8581(); // L: 7814
							var3 = var2 >> 2; // L: 7815
							var4 = var2 & 3; // L: 7816
							var5 = Client.field579[var3]; // L: 7817
							var6 = var1.method8530(); // L: 7818
							var7 = var1.method8591(); // L: 7819
							var8 = var1.method8581(); // L: 7820
							var9 = (var8 >> 4 & 7) + InvDefinition.field1918; // L: 7821
							var10 = (var8 & 7) + class125.field1560; // L: 7822
							byte var11 = var1.method8701(); // L: 7823
							var12 = var1.method8530(); // L: 7824
							var13 = var1.method8701(); // L: 7825
							var14 = var1.readByte(); // L: 7826
							byte var15 = var1.method8718(); // L: 7827
							int var16 = var1.method8591(); // L: 7828
							Player var17;
							if (var16 == Client.localPlayerIndex) { // L: 7830
								var17 = class155.localPlayer;
							} else {
								var17 = Client.players[var16]; // L: 7831
							}

							if (var17 != null) { // L: 7832
								ObjectComposition var18 = VarpDefinition.getObjectDefinition(var7); // L: 7833
								int var19;
								int var20;
								if (var4 != 1 && var4 != 3) { // L: 7836
									var19 = var18.sizeX; // L: 7841
									var20 = var18.sizeY; // L: 7842
								} else {
									var19 = var18.sizeY; // L: 7837
									var20 = var18.sizeX; // L: 7838
								}

								int var21 = var9 + (var19 >> 1); // L: 7844
								int var22 = var9 + (var19 + 1 >> 1); // L: 7845
								int var23 = var10 + (var20 >> 1); // L: 7846
								int var24 = var10 + (var20 + 1 >> 1); // L: 7847
								int[][] var25 = Tiles.Tiles_heights[class383.Client_plane]; // L: 7848
								int var26 = var25[var21][var24] + var25[var21][var23] + var25[var22][var23] + var25[var22][var24] >> 2; // L: 7849
								int var27 = (var9 << 7) + (var19 << 6); // L: 7850
								int var28 = (var10 << 7) + (var20 << 6); // L: 7851
								Model var29 = var18.getModel(var3, var4, var25, var27, var26, var28); // L: 7852
								if (var29 != null) { // L: 7853
									class11.method105(class383.Client_plane, var9, var10, var5, -1, 0, 0, 31, var6 + 1, var12 + 1); // L: 7854
									var17.animationCycleStart = var6 + Client.cycle; // L: 7855
									var17.animationCycleEnd = var12 + Client.cycle; // L: 7856
									var17.model0 = var29; // L: 7857
									var17.field1131 = var9 * 128 + var19 * 64; // L: 7858
									var17.field1137 = var10 * 128 + var20 * 64; // L: 7859
									var17.tileHeight2 = var26; // L: 7860
									byte var30;
									if (var14 > var11) { // L: 7861
										var30 = var14; // L: 7862
										var14 = var11; // L: 7863
										var11 = var30; // L: 7864
									}

									if (var15 > var13) { // L: 7866
										var30 = var15; // L: 7867
										var15 = var13; // L: 7868
										var13 = var30; // L: 7869
									}

									var17.minX = var9 + var14; // L: 7871
									var17.maxX = var9 + var11; // L: 7872
									var17.minY = var10 + var15; // L: 7873
									var17.maxY = var10 + var13; // L: 7874
								}
							}
						}

						if (class276.field3170 == var0) { // L: 7878
							var2 = var1.method8702(); // L: 7879
							var3 = (var2 >> 4 & 7) + InvDefinition.field1918; // L: 7880
							var4 = (var2 & 7) + class125.field1560; // L: 7881
							var5 = var1.method8592(); // L: 7882
							var6 = var1.method8581(); // L: 7883
							var7 = var6 >> 2; // L: 7884
							var8 = var6 & 3; // L: 7885
							var9 = Client.field579[var7]; // L: 7886
							if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) { // L: 7887
								if (var9 == 0) { // L: 7888
									WallObject var34 = ReflectionCheck.scene.method4452(class383.Client_plane, var3, var4); // L: 7889
									if (var34 != null) { // L: 7890
										var37 = Occluder.Entity_unpackID(var34.tag); // L: 7891
										if (var7 == 2) { // L: 7892
											var34.renderable1 = new DynamicObject(var37, 2, var8 + 4, class383.Client_plane, var3, var4, var5, false, var34.renderable1); // L: 7893
											var34.renderable2 = new DynamicObject(var37, 2, var8 + 1 & 3, class383.Client_plane, var3, var4, var5, false, var34.renderable2); // L: 7894
										} else {
											var34.renderable1 = new DynamicObject(var37, var7, var8, class383.Client_plane, var3, var4, var5, false, var34.renderable1); // L: 7896
										}
									}
								}

								if (var9 == 1) { // L: 7899
									DecorativeObject var44 = ReflectionCheck.scene.method4604(class383.Client_plane, var3, var4); // L: 7900
									if (var44 != null) { // L: 7901
										var37 = Occluder.Entity_unpackID(var44.tag); // L: 7902
										if (var7 != 4 && var7 != 5) { // L: 7903
											if (var7 == 6) { // L: 7904
												var44.renderable1 = new DynamicObject(var37, 4, var8 + 4, class383.Client_plane, var3, var4, var5, false, var44.renderable1);
											} else if (var7 == 7) { // L: 7905
												var44.renderable1 = new DynamicObject(var37, 4, (var8 + 2 & 3) + 4, class383.Client_plane, var3, var4, var5, false, var44.renderable1);
											} else if (var7 == 8) { // L: 7906
												var44.renderable1 = new DynamicObject(var37, 4, var8 + 4, class383.Client_plane, var3, var4, var5, false, var44.renderable1); // L: 7907
												var44.renderable2 = new DynamicObject(var37, 4, (var8 + 2 & 3) + 4, class383.Client_plane, var3, var4, var5, false, var44.renderable2); // L: 7908
											}
										} else {
											var44.renderable1 = new DynamicObject(var37, 4, var8, class383.Client_plane, var3, var4, var5, false, var44.renderable1);
										}
									}
								}

								if (var9 == 2) { // L: 7912
									GameObject var45 = ReflectionCheck.scene.getGameObject(class383.Client_plane, var3, var4); // L: 7913
									if (var7 == 11) { // L: 7914
										var7 = 10;
									}

									if (var45 != null) { // L: 7915
										var45.renderable = new DynamicObject(Occluder.Entity_unpackID(var45.tag), var7, var8, class383.Client_plane, var3, var4, var5, false, var45.renderable);
									}
								}

								if (var9 == 3) { // L: 7917
									GroundObject var46 = ReflectionCheck.scene.getGroundObject(class383.Client_plane, var3, var4); // L: 7918
									if (var46 != null) { // L: 7919
										var46.renderable = new DynamicObject(Occluder.Entity_unpackID(var46.tag), 22, var8, class383.Client_plane, var3, var4, var5, false, var46.renderable);
									}
								}
							}

						} else if (class276.field3160 == var0) { // L: 7924
							var2 = var1.method8591(); // L: 7925
							var1.readUnsignedShort(); // L: 7926
							var3 = var1.method8581(); // L: 7927
							var4 = (var3 >> 4 & 7) + InvDefinition.field1918; // L: 7928
							var5 = (var3 & 7) + class125.field1560; // L: 7929
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7930
								NodeDeque var33 = Client.groundItems[class383.Client_plane][var4][var5]; // L: 7931
								if (var33 != null) { // L: 7932
									for (TileItem var41 = (TileItem)var33.last(); var41 != null; var41 = (TileItem)var33.previous()) { // L: 7933 7934 7939
										if ((var2 & 32767) == var41.id) { // L: 7935
											var41.remove(); // L: 7936
											break;
										}
									}

									if (var33.last() == null) { // L: 7941
										Client.groundItems[class383.Client_plane][var4][var5] = null;
									}

									class358.updateItemPile(var4, var5); // L: 7942
								}
							}

						} else if (class276.field3161 == var0) { // L: 7947
							var2 = var1.method8592(); // L: 7948
							var3 = var1.method8702(); // L: 7949
							var4 = (var3 >> 4 & 7) + InvDefinition.field1918; // L: 7950
							var5 = (var3 & 7) + class125.field1560; // L: 7951
							var6 = var1.method8699(); // L: 7952
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7953
								var31 = Client.groundItems[class383.Client_plane][var4][var5]; // L: 7954
								if (var31 != null) { // L: 7955
									for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 7956 7957 7962
										if ((var2 & 32767) == var32.id) { // L: 7958
											var32.method2612(var6); // L: 7959
											break;
										}
									}
								}
							}

						}
					}
				}
			}
		}
	} // L: 7621 7636 7660 7687 7702 7725 7738 7788 7811 7922 7945 7966 7968
}
