import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
public class class72 {
	@ObfuscatedName("ay")
	static final BigInteger field892;
	@ObfuscatedName("ap")
	static final BigInteger field898;
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "[Lme;"
	)
	static Widget[] field899;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	static class454 field895;

	static {
		field892 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field898 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-101"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4690
		if (class27.localPlayer.x >> 7 == Client.destinationX && class27.localPlayer.y >> 7 == Client.destinationY) { // L: 4692
			Client.destinationX = 0; // L: 4693
		}

		if (Client.field626) { // L: 4697
			class161.addPlayerToScene(class27.localPlayer, false); // L: 4698
		}

		class12.method184(); // L: 4701
		class147.addNpcsToScene(true); // L: 4702
		int var4 = Players.Players_count; // L: 4704
		int[] var5 = Players.Players_indices; // L: 4705

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4706
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4707
				class161.addPlayerToScene(Client.players[var5[var6]], true); // L: 4708
			}
		}

		class147.addNpcsToScene(false); // L: 4711
		class170.method3485(); // L: 4712
		class138.method3158(); // L: 4713
		class344.setViewportShape(var0, var1, var2, var3, true); // L: 4714
		var0 = Client.viewportOffsetX; // L: 4715
		var1 = Client.viewportOffsetY; // L: 4716
		var2 = Client.viewportWidth; // L: 4717
		var3 = Client.viewportHeight; // L: 4718
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4719
		Rasterizer3D.method4490(); // L: 4720
		Rasterizer2D.method9415(); // L: 4721
		var4 = Client.camAngleX; // L: 4722
		if (Client.field599 / 256 > var4) { // L: 4723
			var4 = Client.field599 / 256;
		}

		if (Client.field764[4] && Client.field766[4] + 128 > var4) { // L: 4724
			var4 = Client.field766[4] + 128;
		}

		int var36 = Client.camAngleY & 2047; // L: 4725
		var6 = class151.oculusOrbFocalPointX; // L: 4726
		int var7 = SecureRandomFuture.field981; // L: 4727
		int var8 = class154.oculusOrbFocalPointY; // L: 4728
		int var9 = class36.method693(var4); // L: 4729
		var9 = GrandExchangeEvents.method6907(var9, var3); // L: 4731
		int var10 = 2048 - var4 & 2047; // L: 4732
		int var11 = 2048 - var36 & 2047; // L: 4733
		int var12 = 0; // L: 4734
		int var13 = 0; // L: 4735
		int var14 = var9; // L: 4736
		int var15;
		int var16;
		int var17;
		if (var10 != 0) { // L: 4737
			var15 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4738
			var16 = Rasterizer3D.Rasterizer3D_cosine[var10]; // L: 4739
			var17 = var13 * var16 - var9 * var15 >> 16; // L: 4740
			var14 = var13 * var15 + var16 * var9 >> 16; // L: 4741
			var13 = var17; // L: 4742
		}

		if (var11 != 0) { // L: 4744
			var15 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4745
			var16 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4746
			var17 = var15 * var14 + var16 * var12 >> 16; // L: 4747
			var14 = var16 * var14 - var12 * var15 >> 16; // L: 4748
			var12 = var17; // L: 4749
		}

		if (Client.isCameraLocked) { // L: 4751
			class60.field434 = var6 - var12; // L: 4752
			ServerPacket.field3351 = var7 - var13; // L: 4753
			class391.field4433 = var8 - var14; // L: 4754
			InterfaceParent.field1065 = var4; // L: 4755
			AbstractUserComparator.field4639 = var36; // L: 4756
		} else {
			PacketWriter.cameraX = var6 - var12; // L: 4759
			class309.cameraY = var7 - var13; // L: 4760
			World.cameraZ = var8 - var14; // L: 4761
			ModeWhere.cameraPitch = var4; // L: 4762
			class13.cameraYaw = var36; // L: 4763
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class151.oculusOrbFocalPointX >> 7 != class27.localPlayer.x >> 7 || class154.oculusOrbFocalPointY >> 7 != class27.localPlayer.y >> 7)) { // L: 4765 4766
			var15 = class27.localPlayer.plane; // L: 4767
			var16 = class166.baseX * 64 + (class151.oculusOrbFocalPointX >> 7); // L: 4768
			var17 = class9.baseY * 64 + (class154.oculusOrbFocalPointY >> 7); // L: 4769
			PacketBufferNode var18 = class217.getPacketBufferNode(ClientPacket.field3132, Client.packetWriter.isaacCipher); // L: 4772
			var18.packetBuffer.method9109(Client.field595); // L: 4773
			var18.packetBuffer.writeIntME(var16); // L: 4774
			var18.packetBuffer.method9087(var15); // L: 4775
			var18.packetBuffer.method9097(var17); // L: 4776
			Client.packetWriter.addNode(var18); // L: 4777
		}

		int var19;
		int var20;
		int var37;
		if (!Client.isCameraLocked) { // L: 4783
			if (ScriptFrame.clientPreferences.method2543()) { // L: 4786
				var11 = BuddyRankComparator.Client_plane; // L: 4787
			} else {
				label596: {
					var12 = 3; // L: 4790
					if (ModeWhere.cameraPitch < 310) { // L: 4791
						label588: {
							if (Client.oculusOrbState == 1) { // L: 4794
								var13 = class151.oculusOrbFocalPointX >> 7; // L: 4795
								var14 = class154.oculusOrbFocalPointY >> 7; // L: 4796
							} else {
								var13 = class27.localPlayer.x >> 7; // L: 4799
								var14 = class27.localPlayer.y >> 7; // L: 4800
							}

							var15 = PacketWriter.cameraX >> 7; // L: 4802
							var16 = World.cameraZ >> 7; // L: 4803
							if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 4804
								if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) { // L: 4808
									if ((Tiles.Tiles_renderFlags[BuddyRankComparator.Client_plane][var15][var16] & 4) != 0) { // L: 4812
										var12 = BuddyRankComparator.Client_plane;
									}

									if (var13 > var15) { // L: 4814
										var17 = var13 - var15;
									} else {
										var17 = var15 - var13; // L: 4815
									}

									if (var14 > var16) { // L: 4817
										var37 = var14 - var16;
									} else {
										var37 = var16 - var14; // L: 4818
									}

									if (var17 > var37) { // L: 4819
										var19 = var37 * 65536 / var17; // L: 4820
										var20 = 32768; // L: 4821

										while (true) {
											if (var15 == var13) { // L: 4822
												break label588;
											}

											if (var15 < var13) { // L: 4823
												++var15;
											} else if (var15 > var13) { // L: 4824
												--var15;
											}

											if ((Tiles.Tiles_renderFlags[BuddyRankComparator.Client_plane][var15][var16] & 4) != 0) { // L: 4825
												var12 = BuddyRankComparator.Client_plane;
											}

											var20 += var19; // L: 4826
											if (var20 >= 65536) { // L: 4827
												var20 -= 65536; // L: 4828
												if (var16 < var14) { // L: 4829
													++var16;
												} else if (var16 > var14) { // L: 4830
													--var16;
												}

												if ((Tiles.Tiles_renderFlags[BuddyRankComparator.Client_plane][var15][var16] & 4) != 0) { // L: 4831
													var12 = BuddyRankComparator.Client_plane;
												}
											}
										}
									} else {
										if (var37 > 0) { // L: 4835
											var19 = var17 * 65536 / var37; // L: 4836
											var20 = 32768; // L: 4837

											while (var14 != var16) { // L: 4838
												if (var16 < var14) { // L: 4839
													++var16;
												} else if (var16 > var14) { // L: 4840
													--var16;
												}

												if ((Tiles.Tiles_renderFlags[BuddyRankComparator.Client_plane][var15][var16] & 4) != 0) { // L: 4841
													var12 = BuddyRankComparator.Client_plane;
												}

												var20 += var19; // L: 4842
												if (var20 >= 65536) { // L: 4843
													var20 -= 65536; // L: 4844
													if (var15 < var13) { // L: 4845
														++var15;
													} else if (var15 > var13) { // L: 4846
														--var15;
													}

													if ((Tiles.Tiles_renderFlags[BuddyRankComparator.Client_plane][var15][var16] & 4) != 0) { // L: 4847
														var12 = BuddyRankComparator.Client_plane;
													}
												}
											}
										}
										break label588;
									}
								}

								var11 = BuddyRankComparator.Client_plane; // L: 4809
								break label596; // L: 4810
							}

							var11 = BuddyRankComparator.Client_plane; // L: 4805
							break label596; // L: 4806
						}
					}

					if (class27.localPlayer.x >= 0 && class27.localPlayer.y >= 0 && class27.localPlayer.x < 13312 && class27.localPlayer.y < 13312) { // L: 4852
						if ((Tiles.Tiles_renderFlags[BuddyRankComparator.Client_plane][class27.localPlayer.x >> 7][class27.localPlayer.y >> 7] & 4) != 0) { // L: 4856
							var12 = BuddyRankComparator.Client_plane;
						}

						var11 = var12; // L: 4857
					} else {
						var11 = BuddyRankComparator.Client_plane; // L: 4853
					}
				}
			}

			var10 = var11; // L: 4859
		} else {
			var10 = class184.method3665(); // L: 4861
		}

		var11 = PacketWriter.cameraX; // L: 4862
		var12 = class309.cameraY; // L: 4863
		var13 = World.cameraZ; // L: 4864
		var14 = ModeWhere.cameraPitch; // L: 4865
		var15 = class13.cameraYaw; // L: 4866

		for (var16 = 0; var16 < 5; ++var16) { // L: 4867
			if (Client.field764[var16]) { // L: 4868
				var17 = (int)(Math.random() * (double)(Client.field765[var16] * 2 + 1) - (double)Client.field765[var16] + Math.sin((double)Client.field767[var16] / 100.0D * (double)Client.field768[var16]) * (double)Client.field766[var16]); // L: 4869
				if (var16 == 0) { // L: 4870
					PacketWriter.cameraX += var17;
				}

				if (var16 == 1) { // L: 4871
					class309.cameraY += var17;
				}

				if (var16 == 2) { // L: 4872
					World.cameraZ += var17;
				}

				if (var16 == 3) { // L: 4873
					class13.cameraYaw = var17 + class13.cameraYaw & 2047;
				}

				if (var16 == 4) { // L: 4874
					ModeWhere.cameraPitch += var17; // L: 4875
					if (ModeWhere.cameraPitch < 128) { // L: 4876
						ModeWhere.cameraPitch = 128;
					}

					if (ModeWhere.cameraPitch > 383) { // L: 4877
						ModeWhere.cameraPitch = 383;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x; // L: 4881
		var17 = MouseHandler.MouseHandler_y; // L: 4882
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4883
			var16 = MouseHandler.MouseHandler_lastPressedX; // L: 4884
			var17 = MouseHandler.MouseHandler_lastPressedY; // L: 4885
		}

		if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) { // L: 4887
			var37 = var16 - var0; // L: 4888
			var19 = var17 - var1; // L: 4889
			ViewportMouse.ViewportMouse_x = var37; // L: 4891
			ViewportMouse.ViewportMouse_y = var19; // L: 4892
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4893
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4894
			ViewportMouse.ViewportMouse_false0 = false; // L: 4895
		} else {
			class157.method3369(); // L: 4899
		}

		class156.method3359(); // L: 4901
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4902
		class156.method3359(); // L: 4903
		var37 = Rasterizer3D.method4487(); // L: 4904
		Rasterizer3D.method4476(class415.client.field200); // L: 4905
		Rasterizer3D.field2528.field2799 = Client.viewportZoom; // L: 4906
		class173.scene.draw(PacketWriter.cameraX, class309.cameraY, World.cameraZ, ModeWhere.cameraPitch, class13.cameraYaw, var10); // L: 4907
		Rasterizer3D.method4476(false); // L: 4908
		if (Client.renderSelf) { // L: 4909
			Rasterizer2D.method9412(); // L: 4910
		}

		Rasterizer3D.field2528.field2799 = var37; // L: 4912
		class156.method3359(); // L: 4913
		class173.scene.clearTempGameObjects(); // L: 4914
		Client.field600 = 0; // L: 4916
		boolean var40 = false; // L: 4917
		var20 = -1; // L: 4918
		int var21 = -1; // L: 4919
		int var22 = Players.Players_count; // L: 4920
		int[] var23 = Players.Players_indices; // L: 4921

		int var24;
		for (var24 = 0; var24 < var22 + Client.npcCount; ++var24) { // L: 4922
			Object var39;
			if (var24 < var22) { // L: 4924
				var39 = Client.players[var23[var24]]; // L: 4925
				if (var23[var24] == Client.combatTargetPlayerIndex) { // L: 4926
					var40 = true; // L: 4927
					var20 = var24; // L: 4928
					continue;
				}

				if (var39 == class27.localPlayer) { // L: 4931
					var21 = var24; // L: 4932
					continue; // L: 4933
				}
			} else {
				var39 = Client.npcs[Client.npcIndices[var24 - var22]]; // L: 4936
			}

			class143.drawActor2d((Actor)var39, var24, var0, var1, var2, var3); // L: 4937
		}

		if (Client.field626 && var21 != -1) { // L: 4939
			class143.drawActor2d(class27.localPlayer, var21, var0, var1, var2, var3); // L: 4940
		}

		if (var40) { // L: 4942
			class143.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var20, var0, var1, var2, var3); // L: 4943
		}

		for (var24 = 0; var24 < Client.field600; ++var24) { // L: 4945
			int var25 = Client.field593[var24]; // L: 4946
			int var26 = Client.field547[var24]; // L: 4947
			int var27 = Client.field633[var24]; // L: 4948
			int var28 = Client.field604[var24]; // L: 4949
			boolean var29 = true; // L: 4950

			while (var29) {
				var29 = false; // L: 4952

				for (int var38 = 0; var38 < var24; ++var38) { // L: 4953
					if (var26 + 2 > Client.field547[var38] - Client.field604[var38] && var26 - var28 < Client.field547[var38] + 2 && var25 - var27 < Client.field633[var38] + Client.field593[var38] && var27 + var25 > Client.field593[var38] - Client.field633[var38] && Client.field547[var38] - Client.field604[var38] < var26) { // L: 4954 4955
						var26 = Client.field547[var38] - Client.field604[var38]; // L: 4956
						var29 = true; // L: 4957
					}
				}
			}

			Client.viewportTempX = Client.field593[var24]; // L: 4962
			Client.viewportTempY = Client.field547[var24] = var26; // L: 4963
			String var30 = Client.field610[var24]; // L: 4964
			if (Client.chatEffects == 0) { // L: 4965
				int var31 = 16776960; // L: 4966
				if (Client.field520[var24] < 6) { // L: 4967
					var31 = Client.field533[Client.field520[var24]];
				}

				if (Client.field520[var24] == 6) { // L: 4968
					var31 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field520[var24] == 7) { // L: 4969
					var31 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field520[var24] == 8) { // L: 4970
					var31 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var32;
				if (Client.field520[var24] == 9) { // L: 4971
					var32 = 150 - Client.field609[var24]; // L: 4972
					if (var32 < 50) { // L: 4973
						var31 = var32 * 1280 + 16711680;
					} else if (var32 < 100) { // L: 4974
						var31 = 16776960 - (var32 - 50) * 327680;
					} else if (var32 < 150) { // L: 4975
						var31 = (var32 - 100) * 5 + 65280;
					}
				}

				if (Client.field520[var24] == 10) { // L: 4977
					var32 = 150 - Client.field609[var24]; // L: 4978
					if (var32 < 50) { // L: 4979
						var31 = var32 * 5 + 16711680;
					} else if (var32 < 100) { // L: 4980
						var31 = 16711935 - (var32 - 50) * 327680;
					} else if (var32 < 150) { // L: 4981
						var31 = (var32 - 100) * 327680 + 255 - (var32 - 100) * 5;
					}
				}

				if (Client.field520[var24] == 11) { // L: 4983
					var32 = 150 - Client.field609[var24]; // L: 4984
					if (var32 < 50) { // L: 4985
						var31 = 16777215 - var32 * 327685;
					} else if (var32 < 100) { // L: 4986
						var31 = (var32 - 50) * 327685 + 65280;
					} else if (var32 < 150) { // L: 4987
						var31 = 16777215 - (var32 - 100) * 327680;
					}
				}

				int var33;
				if (Client.field520[var24] == 12 && Client.field608[var24] == null) { // L: 4989 4990
					var32 = var30.length(); // L: 4991
					Client.field608[var24] = new int[var32]; // L: 4992

					for (var33 = 0; var33 < var32; ++var33) { // L: 4993
						int var34 = (int)((float)var33 / (float)var32 * 64.0F); // L: 4994
						int var35 = var34 << 10 | 896 | 64; // L: 4995
						Client.field608[var24][var33] = IgnoreList.field4609[var35]; // L: 4996
					}
				}

				if (Client.field549[var24] == 0) { // L: 5000
					class290.fontBold12.method7553(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.field608[var24]);
				}

				if (Client.field549[var24] == 1) { // L: 5001
					class290.fontBold12.method7547(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, Client.field608[var24]);
				}

				if (Client.field549[var24] == 2) { // L: 5002
					class290.fontBold12.method7524(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, Client.field608[var24]);
				}

				if (Client.field549[var24] == 3) { // L: 5003
					class290.fontBold12.method7489(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, 150 - Client.field609[var24], Client.field608[var24]);
				}

				if (Client.field549[var24] == 4) { // L: 5004
					var32 = (150 - Client.field609[var24]) * (class290.fontBold12.stringWidth(var30) + 100) / 150; // L: 5005
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5006
					class290.fontBold12.method7507(var30, var0 + Client.viewportTempX + 50 - var32, Client.viewportTempY + var1, var31, 0, Client.field608[var24]); // L: 5007
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5008
				}

				if (Client.field549[var24] == 5) { // L: 5010
					var32 = 150 - Client.field609[var24]; // L: 5011
					var33 = 0; // L: 5012
					if (var32 < 25) { // L: 5013
						var33 = var32 - 25;
					} else if (var32 > 125) { // L: 5014
						var33 = var32 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class290.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5015
					class290.fontBold12.method7553(var30, var0 + Client.viewportTempX, var33 + Client.viewportTempY + var1, var31, 0, Client.field608[var24]); // L: 5016
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5017
				}
			} else {
				class290.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5021
			}
		}

		if (Client.hintArrowType == 2) { // L: 5026
			class216.worldToScreen(Client.field587 * 64 + (Client.field521 - class166.baseX * 64 << 7), Client.field731 * 64 + (Client.field522 - class9.baseY * 64 << 7), Client.field624 * 4); // L: 5027
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 5028
				class191.field1979[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.field2528.Rasterizer3D_textureLoader).animate(Client.field578); // L: 5030
		class309.method6018(var0, var1, var2, var3); // L: 5031
		PacketWriter.cameraX = var11; // L: 5032
		class309.cameraY = var12; // L: 5033
		World.cameraZ = var13; // L: 5034
		ModeWhere.cameraPitch = var14; // L: 5035
		class13.cameraYaw = var15; // L: 5036
		if (Client.field510 && class101.field1332.method6899(true, false) == 0) { // L: 5037
			Client.field510 = false;
		}

		if (Client.field510) { // L: 5038
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 5039
			FontName.drawLoadingMessage("Loading - please wait.", false); // L: 5040
		}

	} // L: 5042
}
