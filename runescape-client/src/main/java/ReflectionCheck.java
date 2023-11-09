import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1004737745
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 190483797
	)
	@Export("size")
	int size;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("u")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("c")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("w")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("z")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("j")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lno;",
		garbageValue = "-1227122759"
	)
	public static class387 method612() {
		synchronized(class387.field4403) { // L: 28
			if (class126.field1537 == 0) { // L: 29
				return new class387();
			} else {
				class387.field4403[--class126.field1537].method6974(); // L: 31
				return class387.field4403[class126.field1537]; // L: 32
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1344069596"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (GameObject.Widget_loadedInterfaces[var0]) { // L: 237
			return true;
		} else if (!class228.Widget_archive.tryLoadGroup(var0)) { // L: 238
			return false;
		} else {
			int var1 = class228.Widget_archive.getGroupFileCount(var0); // L: 239
			if (var1 == 0) { // L: 240
				GameObject.Widget_loadedInterfaces[var0] = true; // L: 241
				return true; // L: 242
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) { // L: 244
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 245
					if (Widget.Widget_interfaceComponents[var0][var2] == null) { // L: 246
						byte[] var3 = class228.Widget_archive.takeFile(var0, var2); // L: 247
						if (var3 != null) { // L: 248
							Widget.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 249
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 250
							if (var3[0] == -1) { // L: 251
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 252
							}
						}
					}
				}

				GameObject.Widget_loadedInterfaces[var0] = true; // L: 256
				return true; // L: 257
			}
		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "4"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4618
		class13.method173(); // L: 4619
		UserComparator7.method2670(); // L: 4620
		class10.method97(); // L: 4621
		Skeleton.addNpcsToScene(true); // L: 4622
		int var4 = Players.Players_count; // L: 4624
		int[] var5 = Players.Players_indices; // L: 4625

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4626
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4627
				Tile.addPlayerToScene(Client.players[var5[var6]], true); // L: 4628
			}
		}

		Skeleton.addNpcsToScene(false); // L: 4631
		WorldMapIcon_1.method4559(); // L: 4632
		StudioGame.method5763(); // L: 4633
		class115.setViewportShape(var0, var1, var2, var3, true); // L: 4634
		var0 = Client.viewportOffsetX; // L: 4635
		var1 = Client.viewportOffsetY; // L: 4636
		var2 = Client.viewportWidth; // L: 4637
		var3 = Client.viewportHeight; // L: 4638
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4639
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4640
		var4 = Client.camAngleX; // L: 4641
		if (Client.field581 / 256 > var4) { // L: 4642
			var4 = Client.field581 / 256;
		}

		if (Client.field678[4] && Client.field654[4] + 128 > var4) { // L: 4643
			var4 = Client.field654[4] + 128;
		}

		int var35 = Client.camAngleY & 2047; // L: 4644
		var6 = ObjectSound.oculusOrbFocalPointX; // L: 4645
		int var7 = FileSystem.field1753; // L: 4646
		int var8 = class306.oculusOrbFocalPointY; // L: 4647
		int var9 = var4 * 3 + 600; // L: 4650
		int var10 = HitSplatDefinition.method3637(var9, var3); // L: 4654
		int var11 = 2048 - var4 & 2047; // L: 4655
		int var12 = 2048 - var35 & 2047; // L: 4656
		int var13 = 0; // L: 4657
		int var14 = 0; // L: 4658
		int var15 = var10; // L: 4659
		int var16;
		int var17;
		int var18;
		if (var11 != 0) { // L: 4660
			var16 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4661
			var17 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4662
			var18 = var17 * var14 - var16 * var10 >> 16; // L: 4663
			var15 = var17 * var10 + var16 * var14 >> 16; // L: 4664
			var14 = var18; // L: 4665
		}

		if (var12 != 0) { // L: 4667
			var16 = Rasterizer3D.Rasterizer3D_sine[var12]; // L: 4668
			var17 = Rasterizer3D.Rasterizer3D_cosine[var12]; // L: 4669
			var18 = var16 * var15 + var17 * var13 >> 16; // L: 4670
			var15 = var17 * var15 - var16 * var13 >> 16; // L: 4671
			var13 = var18; // L: 4672
		}

		if (Client.isCameraLocked) { // L: 4674
			Tiles.field993 = var6 - var13; // L: 4675
			ScriptFrame.field461 = var7 - var14; // L: 4676
			class122.field1500 = var8 - var15; // L: 4677
			Canvas.field164 = var4; // L: 4678
			class263.field3029 = var35; // L: 4679
		} else {
			WorldMapLabelSize.cameraX = var6 - var13; // L: 4682
			class123.cameraY = var7 - var14; // L: 4683
			Widget.cameraZ = var8 - var15; // L: 4684
			UserComparator9.cameraPitch = var4; // L: 4685
			PendingSpawn.cameraYaw = var35; // L: 4686
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (ObjectSound.oculusOrbFocalPointX >> 7 != class28.localPlayer.x >> 7 || class306.oculusOrbFocalPointY >> 7 != class28.localPlayer.y >> 7)) { // L: 4688 4689
			var16 = class28.localPlayer.plane; // L: 4690
			var17 = class300.baseX * 64 + (ObjectSound.oculusOrbFocalPointX >> 7); // L: 4691
			var18 = Message.baseY * 64 + (class306.oculusOrbFocalPointY >> 7); // L: 4692
			PacketBufferNode var19 = class433.getPacketBufferNode(ClientPacket.field3016, Client.packetWriter.isaacCipher); // L: 4695
			var19.packetBuffer.method7762(var16); // L: 4696
			var19.packetBuffer.method7784(Client.field698); // L: 4697
			var19.packetBuffer.writeIntME(var18); // L: 4698
			var19.packetBuffer.writeIntME(var17); // L: 4699
			Client.packetWriter.addNode(var19); // L: 4700
		}

		int var20;
		int var21;
		int var36;
		if (!Client.isCameraLocked) { // L: 4706
			if (class260.clientPreferences.method2312()) { // L: 4709
				var12 = FriendSystem.Client_plane; // L: 4710
			} else {
				label560: {
					var13 = 3; // L: 4713
					if (UserComparator9.cameraPitch < 310) { // L: 4714
						if (Client.oculusOrbState == 1) { // L: 4717
							var14 = ObjectSound.oculusOrbFocalPointX >> 7; // L: 4718
							var15 = class306.oculusOrbFocalPointY >> 7; // L: 4719
						} else {
							var14 = class28.localPlayer.x >> 7; // L: 4722
							var15 = class28.localPlayer.y >> 7; // L: 4723
						}

						var16 = WorldMapLabelSize.cameraX >> 7; // L: 4725
						var17 = Widget.cameraZ >> 7; // L: 4726
						if (var16 < 0 || var17 < 0 || var16 >= 104 || var17 >= 104) { // L: 4727
							var12 = FriendSystem.Client_plane; // L: 4728
							break label560; // L: 4729
						}

						if (var14 < 0 || var15 < 0 || var14 >= 104 || var15 >= 104) { // L: 4731
							var12 = FriendSystem.Client_plane; // L: 4732
							break label560; // L: 4733
						}

						if ((Tiles.Tiles_renderFlags[FriendSystem.Client_plane][var16][var17] & 4) != 0) { // L: 4735
							var13 = FriendSystem.Client_plane;
						}

						if (var14 > var16) { // L: 4737
							var18 = var14 - var16;
						} else {
							var18 = var16 - var14; // L: 4738
						}

						if (var15 > var17) { // L: 4740
							var36 = var15 - var17;
						} else {
							var36 = var17 - var15; // L: 4741
						}

						if (var18 > var36) { // L: 4742
							var20 = var36 * 65536 / var18; // L: 4743
							var21 = 32768; // L: 4744

							while (var16 != var14) { // L: 4745
								if (var16 < var14) { // L: 4746
									++var16;
								} else if (var16 > var14) { // L: 4747
									--var16;
								}

								if ((Tiles.Tiles_renderFlags[FriendSystem.Client_plane][var16][var17] & 4) != 0) { // L: 4748
									var13 = FriendSystem.Client_plane;
								}

								var21 += var20; // L: 4749
								if (var21 >= 65536) { // L: 4750
									var21 -= 65536; // L: 4751
									if (var17 < var15) { // L: 4752
										++var17;
									} else if (var17 > var15) { // L: 4753
										--var17;
									}

									if ((Tiles.Tiles_renderFlags[FriendSystem.Client_plane][var16][var17] & 4) != 0) { // L: 4754
										var13 = FriendSystem.Client_plane;
									}
								}
							}
						} else if (var36 > 0) { // L: 4758
							var20 = var18 * 65536 / var36; // L: 4759
							var21 = 32768; // L: 4760

							while (var17 != var15) { // L: 4761
								if (var17 < var15) { // L: 4762
									++var17;
								} else if (var17 > var15) { // L: 4763
									--var17;
								}

								if ((Tiles.Tiles_renderFlags[FriendSystem.Client_plane][var16][var17] & 4) != 0) { // L: 4764
									var13 = FriendSystem.Client_plane;
								}

								var21 += var20; // L: 4765
								if (var21 >= 65536) { // L: 4766
									var21 -= 65536; // L: 4767
									if (var16 < var14) { // L: 4768
										++var16;
									} else if (var16 > var14) { // L: 4769
										--var16;
									}

									if ((Tiles.Tiles_renderFlags[FriendSystem.Client_plane][var16][var17] & 4) != 0) { // L: 4770
										var13 = FriendSystem.Client_plane;
									}
								}
							}
						}
					}

					if (class28.localPlayer.x >= 0 && class28.localPlayer.y >= 0 && class28.localPlayer.x < 13312 && class28.localPlayer.y < 13312) { // L: 4775
						if ((Tiles.Tiles_renderFlags[FriendSystem.Client_plane][class28.localPlayer.x >> 7][class28.localPlayer.y >> 7] & 4) != 0) { // L: 4779
							var13 = FriendSystem.Client_plane;
						}

						var12 = var13; // L: 4780
					} else {
						var12 = FriendSystem.Client_plane; // L: 4776
					}
				}
			}

			var11 = var12; // L: 4782
		} else {
			var11 = class162.method3283(); // L: 4784
		}

		var12 = WorldMapLabelSize.cameraX; // L: 4785
		var13 = class123.cameraY; // L: 4786
		var14 = Widget.cameraZ; // L: 4787
		var15 = UserComparator9.cameraPitch; // L: 4788
		var16 = PendingSpawn.cameraYaw; // L: 4789

		for (var17 = 0; var17 < 5; ++var17) { // L: 4790
			if (Client.field678[var17]) { // L: 4791
				var18 = (int)(Math.random() * (double)(Client.field747[var17] * 2 + 1) - (double)Client.field747[var17] + Math.sin((double)Client.field749[var17] / 100.0D * (double)Client.field653[var17]) * (double)Client.field654[var17]); // L: 4792
				if (var17 == 0) { // L: 4793
					WorldMapLabelSize.cameraX += var18;
				}

				if (var17 == 1) { // L: 4794
					class123.cameraY += var18;
				}

				if (var17 == 2) { // L: 4795
					Widget.cameraZ += var18;
				}

				if (var17 == 3) { // L: 4796
					PendingSpawn.cameraYaw = var18 + PendingSpawn.cameraYaw & 2047;
				}

				if (var17 == 4) { // L: 4797
					UserComparator9.cameraPitch += var18; // L: 4798
					if (UserComparator9.cameraPitch < 128) { // L: 4799
						UserComparator9.cameraPitch = 128;
					}

					if (UserComparator9.cameraPitch > 383) { // L: 4800
						UserComparator9.cameraPitch = 383;
					}
				}
			}
		}

		var17 = MouseHandler.MouseHandler_x; // L: 4804
		var18 = MouseHandler.MouseHandler_y; // L: 4805
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4806
			var17 = MouseHandler.MouseHandler_lastPressedX; // L: 4807
			var18 = MouseHandler.MouseHandler_lastPressedY; // L: 4808
		}

		if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) { // L: 4810
			var36 = var17 - var0; // L: 4811
			var20 = var18 - var1; // L: 4812
			ViewportMouse.ViewportMouse_x = var36; // L: 4814
			ViewportMouse.ViewportMouse_y = var20; // L: 4815
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4816
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4817
			ViewportMouse.ViewportMouse_false0 = false; // L: 4818
		} else {
			class93.method2461(); // L: 4822
		}

		class12.playPcmPlayers(); // L: 4824
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4825
		class12.playPcmPlayers(); // L: 4826
		var36 = Rasterizer3D.Rasterizer3D_zoom; // L: 4827
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4828
		Decimator.scene.draw(WorldMapLabelSize.cameraX, class123.cameraY, Widget.cameraZ, UserComparator9.cameraPitch, PendingSpawn.cameraYaw, var11); // L: 4829
		Rasterizer3D.Rasterizer3D_zoom = var36; // L: 4830
		class12.playPcmPlayers(); // L: 4831
		Decimator.scene.clearTempGameObjects(); // L: 4832
		Client.overheadTextCount = 0; // L: 4834
		boolean var39 = false; // L: 4835
		var21 = -1; // L: 4836
		int var22 = -1; // L: 4837
		int var23 = Players.Players_count; // L: 4838
		int[] var24 = Players.Players_indices; // L: 4839

		int var25;
		for (var25 = 0; var25 < var23 + Client.npcCount; ++var25) { // L: 4840
			Object var38;
			if (var25 < var23) { // L: 4842
				var38 = Client.players[var24[var25]]; // L: 4843
				if (var24[var25] == Client.combatTargetPlayerIndex) { // L: 4844
					var39 = true; // L: 4845
					var21 = var25; // L: 4846
					continue;
				}

				if (var38 == class28.localPlayer) { // L: 4849
					var22 = var25; // L: 4850
					continue; // L: 4851
				}
			} else {
				var38 = Client.npcs[Client.npcIndices[var25 - var23]]; // L: 4854
			}

			ChatChannel.drawActor2d((Actor)var38, var25, var0, var1, var2, var3); // L: 4855
		}

		if (Client.renderSelf && var22 != -1) { // L: 4857
			ChatChannel.drawActor2d(class28.localPlayer, var22, var0, var1, var2, var3); // L: 4858
		}

		if (var39) { // L: 4860
			ChatChannel.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var21, var0, var1, var2, var3); // L: 4861
		}

		for (var25 = 0; var25 < Client.overheadTextCount; ++var25) { // L: 4863
			int var26 = Client.overheadTextXs[var25]; // L: 4864
			int var27 = Client.overheadTextYs[var25]; // L: 4865
			int var28 = Client.overheadTextXOffsets[var25]; // L: 4866
			int var29 = Client.overheadTextAscents[var25]; // L: 4867
			boolean var30 = true; // L: 4868

			while (var30) {
				var30 = false; // L: 4870

				for (int var37 = 0; var37 < var25; ++var37) { // L: 4871
					if (var27 + 2 > Client.overheadTextYs[var37] - Client.overheadTextAscents[var37] && var27 - var29 < Client.overheadTextYs[var37] + 2 && var26 - var28 < Client.overheadTextXOffsets[var37] + Client.overheadTextXs[var37] && var26 + var28 > Client.overheadTextXs[var37] - Client.overheadTextXOffsets[var37] && Client.overheadTextYs[var37] - Client.overheadTextAscents[var37] < var27) { // L: 4872 4873
						var27 = Client.overheadTextYs[var37] - Client.overheadTextAscents[var37]; // L: 4874
						var30 = true; // L: 4875
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var25]; // L: 4880
			Client.viewportTempY = Client.overheadTextYs[var25] = var27; // L: 4881
			String var31 = Client.overheadText[var25]; // L: 4882
			if (Client.chatEffects == 0) { // L: 4883
				int var32 = 16776960; // L: 4884
				if (Client.overheadTextColors[var25] < 6) { // L: 4885
					var32 = Client.field555[Client.overheadTextColors[var25]];
				}

				if (Client.overheadTextColors[var25] == 6) { // L: 4886
					var32 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var25] == 7) { // L: 4887
					var32 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var25] == 8) { // L: 4888
					var32 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var33;
				if (Client.overheadTextColors[var25] == 9) { // L: 4889
					var33 = 150 - Client.overheadTextCyclesRemaining[var25]; // L: 4890
					if (var33 < 50) {
						var32 = var33 * 1280 + 16711680; // L: 4891
					} else if (var33 < 100) { // L: 4892
						var32 = 16776960 - (var33 - 50) * 327680;
					} else if (var33 < 150) { // L: 4893
						var32 = (var33 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var25] == 10) { // L: 4895
					var33 = 150 - Client.overheadTextCyclesRemaining[var25]; // L: 4896
					if (var33 < 50) { // L: 4897
						var32 = var33 * 5 + 16711680;
					} else if (var33 < 100) { // L: 4898
						var32 = 16711935 - (var33 - 50) * 327680;
					} else if (var33 < 150) { // L: 4899
						var32 = (var33 - 100) * 327680 + 255 - (var33 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var25] == 11) { // L: 4901
					var33 = 150 - Client.overheadTextCyclesRemaining[var25]; // L: 4902
					if (var33 < 50) { // L: 4903
						var32 = 16777215 - var33 * 327685;
					} else if (var33 < 100) { // L: 4904
						var32 = (var33 - 50) * 327685 + 65280;
					} else if (var33 < 150) { // L: 4905
						var32 = 16777215 - (var33 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var25] == 0) { // L: 4907
					class116.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0);
				}

				if (Client.overheadTextEffects[var25] == 1) { // L: 4908
					class116.fontBold12.drawCenteredWave(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var25] == 2) { // L: 4909
					class116.fontBold12.drawCenteredWave2(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var25] == 3) { // L: 4910
					class116.fontBold12.drawCenteredShake(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var25]);
				}

				if (Client.overheadTextEffects[var25] == 4) { // L: 4911
					var33 = (150 - Client.overheadTextCyclesRemaining[var25]) * (class116.fontBold12.stringWidth(var31) + 100) / 150; // L: 4912
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4913
					class116.fontBold12.draw(var31, var0 + Client.viewportTempX + 50 - var33, Client.viewportTempY + var1, var32, 0); // L: 4914
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4915
				}

				if (Client.overheadTextEffects[var25] == 5) { // L: 4917
					var33 = 150 - Client.overheadTextCyclesRemaining[var25]; // L: 4918
					int var34 = 0; // L: 4919
					if (var33 < 25) { // L: 4920
						var34 = var33 - 25;
					} else if (var33 > 125) { // L: 4921
						var34 = var33 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class116.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4922
					class116.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, var34 + Client.viewportTempY + var1, var32, 0); // L: 4923
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4924
				}
			} else {
				class116.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4928
			}
		}

		class127.method2887(var0, var1); // L: 4932
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field744); // L: 4933
		class116.method2766(var0, var1, var2, var3); // L: 4934
		WorldMapLabelSize.cameraX = var12; // L: 4935
		class123.cameraY = var13; // L: 4936
		Widget.cameraZ = var14; // L: 4937
		UserComparator9.cameraPitch = var15; // L: 4938
		PendingSpawn.cameraYaw = var16; // L: 4939
		if (Client.isLoading) { // L: 4940
			byte var40 = 0; // L: 4943
			var21 = var40 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 4944
			if (var21 == 0) { // L: 4948
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4950
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4951
			class273.drawLoadingMessage("Loading - please wait.", false); // L: 4952
		}

	} // L: 4954

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "102"
	)
	static final void method610(int var0) {
		if (loadInterface(var0)) { // L: 11741
			WorldMapLabelSize.drawModelComponents(Widget.Widget_interfaceComponents[var0], -1); // L: 11742
		}
	} // L: 11743
}
