import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
public class class366 {
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1754226121"
	)
	static int method7007(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2911
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2912
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field792.method4466(var3) ? 1 : 0; // L: 2913
			return 1; // L: 2914
		} else if (var0 == 3501) { // L: 2916
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2917
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field792.method4450(var3) ? 1 : 0; // L: 2918
			return 1; // L: 2919
		} else if (var0 == 3502) { // L: 2921
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2922
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field792.method4440(var3) ? 1 : 0; // L: 2923
			return 1; // L: 2924
		} else {
			return 2; // L: 2926
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "31"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4800
		FontName.method9111(); // L: 4801
		class25.method342(); // L: 4802
		class442.method8216(); // L: 4803
		GameObject.addNpcsToScene(true); // L: 4804
		int var4 = Players.Players_count; // L: 4806
		int[] var5 = Players.Players_indices; // L: 4807

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4808
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4809
				class475.addPlayerToScene(Client.players[var5[var6]], true); // L: 4810
			}
		}

		GameObject.addNpcsToScene(false); // L: 4813

		for (Projectile var17 = (Projectile)Client.projectiles.last(); var17 != null; var17 = (Projectile)Client.projectiles.previous()) { // L: 4815 4816 4854
			if (var17.plane == class473.Client_plane && Client.cycle <= var17.cycleEnd) { // L: 4817
				if (Client.cycle >= var17.cycleStart) { // L: 4818
					NPC var19;
					Player var20;
					if (!var17.isMoving && var17.field993 != 0) { // L: 4819
						if (var17.field993 > 0) { // L: 4820
							var19 = Client.npcs[var17.field993 - 1]; // L: 4821
							if (var19 != null && var19.x >= 0 && var19.x < 13312 && var19.y >= 0 && var19.y < 13312) { // L: 4822
								var17.sourceX = var19.x; // L: 4823
								var17.sourceY = var19.y; // L: 4824
								var17.setDestination(var17.field1008, var17.field987, var17.field988, Client.cycle); // L: 4825
							}
						} else {
							var6 = -var17.field993 - 1; // L: 4830
							if (var6 == Client.localPlayerIndex) { // L: 4831
								var20 = VarpDefinition.localPlayer;
							} else {
								var20 = Client.players[var6]; // L: 4832
							}

							if (var20 != null && var20.x >= 0 && var20.x < 13312 && var20.y >= 0 && var20.y < 13312) { // L: 4833
								var17.sourceX = var20.x; // L: 4834
								var17.sourceY = var20.y; // L: 4835
								var17.setDestination(var17.field1008, var17.field987, var17.field988, Client.cycle); // L: 4836
							}
						}
					}

					if (var17.targetIndex > 0) { // L: 4840
						var19 = Client.npcs[var17.targetIndex - 1]; // L: 4841
						if (var19 != null && var19.x >= 0 && var19.x < 13312 && var19.y >= 0 && var19.y < 13312) { // L: 4842
							var17.setDestination(var19.x, var19.y, class272.getTileHeight(var19.x, var19.y, var17.plane) - var17.endHeight, Client.cycle);
						}
					}

					if (var17.targetIndex < 0) { // L: 4844
						var6 = -var17.targetIndex - 1; // L: 4846
						if (var6 == Client.localPlayerIndex) { // L: 4847
							var20 = VarpDefinition.localPlayer;
						} else {
							var20 = Client.players[var6]; // L: 4848
						}

						if (var20 != null && var20.x >= 0 && var20.x < 13312 && var20.y >= 0 && var20.y < 13312) { // L: 4849
							var17.setDestination(var20.x, var20.y, class272.getTileHeight(var20.x, var20.y, var17.plane) - var17.endHeight, Client.cycle);
						}
					}

					var17.advance(Client.field604); // L: 4851
					Actor.scene.drawEntity(class473.Client_plane, (int)var17.x, (int)var17.y, (int)var17.z, 60, var17, var17.yaw, -1L, false); // L: 4852
				}
			} else {
				var17.remove();
			}
		}

		for (GraphicsObject var21 = (GraphicsObject)Client.graphicsObjects.last(); var21 != null; var21 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4858 4859 4866
			if (var21.plane == class473.Client_plane && !var21.isFinished) { // L: 4860
				if (Client.cycle >= var21.cycleStart) { // L: 4861
					var21.advance(Client.field604); // L: 4862
					if (var21.isFinished) { // L: 4863
						var21.remove();
					} else {
						Actor.scene.drawEntity(var21.plane, var21.x, var21.y, var21.z, 60, var21, 0, -1L, false); // L: 4864
					}
				}
			} else {
				var21.remove();
			}
		}

		class148.setViewportShape(var0, var1, var2, var3, true); // L: 4869
		var0 = Client.viewportOffsetX; // L: 4870
		var1 = Client.viewportOffsetY; // L: 4871
		var2 = Client.viewportWidth; // L: 4872
		var3 = Client.viewportHeight; // L: 4873
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4874
		Rasterizer3D.method5292(); // L: 4875
		Rasterizer2D.method9801(); // L: 4876
		var4 = Client.camAngleX; // L: 4877
		if (Client.field795 / 256 > var4) { // L: 4878
			var4 = Client.field795 / 256;
		}

		if (Client.field797[4] && Client.field799[4] + 128 > var4) { // L: 4879
			var4 = Client.field799[4] + 128;
		}

		int var18 = Client.camAngleY & 2047; // L: 4880
		class424.method8010(Friend.oculusOrbFocalPointX, GrandExchangeOfferWorldComparator.field4449, class59.oculusOrbFocalPointY, var4, var18, WorldMapCacheName.method5111(var4), var3); // L: 4881
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if (!Client.isCameraLocked) { // L: 4883
			if (class30.clientPreferences.method2635()) { // L: 4886
				var7 = class473.Client_plane; // L: 4887
			} else {
				label484: {
					var8 = 3; // L: 4890
					if (FriendSystem.cameraPitch < 310) { // L: 4891
						if (Client.oculusOrbState == 1) { // L: 4894
							var9 = Friend.oculusOrbFocalPointX >> 7; // L: 4895
							var10 = class59.oculusOrbFocalPointY >> 7; // L: 4896
						} else {
							var9 = VarpDefinition.localPlayer.x >> 7; // L: 4899
							var10 = VarpDefinition.localPlayer.y >> 7; // L: 4900
						}

						var11 = FriendsChatMember.cameraX >> 7; // L: 4902
						var12 = class317.cameraZ >> 7; // L: 4903
						if (var11 < 0 || var12 < 0 || var11 >= 104 || var12 >= 104) { // L: 4904
							var7 = class473.Client_plane; // L: 4905
							break label484; // L: 4906
						}

						if (var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) { // L: 4908
							var7 = class473.Client_plane; // L: 4909
							break label484; // L: 4910
						}

						if ((Tiles.Tiles_renderFlags[class473.Client_plane][var11][var12] & 4) != 0) { // L: 4912
							var8 = class473.Client_plane;
						}

						if (var9 > var11) { // L: 4914
							var13 = var9 - var11;
						} else {
							var13 = var11 - var9; // L: 4915
						}

						if (var10 > var12) { // L: 4917
							var14 = var10 - var12;
						} else {
							var14 = var12 - var10; // L: 4918
						}

						int var15;
						int var16;
						if (var13 > var14) { // L: 4919
							var15 = var14 * 65536 / var13; // L: 4920
							var16 = 32768; // L: 4921

							while (var11 != var9) { // L: 4922
								if (var11 < var9) { // L: 4923
									++var11;
								} else if (var11 > var9) { // L: 4924
									--var11;
								}

								if ((Tiles.Tiles_renderFlags[class473.Client_plane][var11][var12] & 4) != 0) { // L: 4925
									var8 = class473.Client_plane;
								}

								var16 += var15; // L: 4926
								if (var16 >= 65536) { // L: 4927
									var16 -= 65536; // L: 4928
									if (var12 < var10) { // L: 4929
										++var12;
									} else if (var12 > var10) { // L: 4930
										--var12;
									}

									if ((Tiles.Tiles_renderFlags[class473.Client_plane][var11][var12] & 4) != 0) { // L: 4931
										var8 = class473.Client_plane;
									}
								}
							}
						} else if (var14 > 0) { // L: 4935
							var15 = var13 * 65536 / var14; // L: 4936
							var16 = 32768; // L: 4937

							while (var12 != var10) { // L: 4938
								if (var12 < var10) { // L: 4939
									++var12;
								} else if (var12 > var10) { // L: 4940
									--var12;
								}

								if ((Tiles.Tiles_renderFlags[class473.Client_plane][var11][var12] & 4) != 0) { // L: 4941
									var8 = class473.Client_plane;
								}

								var16 += var15; // L: 4942
								if (var16 >= 65536) { // L: 4943
									var16 -= 65536; // L: 4944
									if (var11 < var9) { // L: 4945
										++var11;
									} else if (var11 > var9) { // L: 4946
										--var11;
									}

									if ((Tiles.Tiles_renderFlags[class473.Client_plane][var11][var12] & 4) != 0) { // L: 4947
										var8 = class473.Client_plane;
									}
								}
							}
						}
					}

					if (VarpDefinition.localPlayer.x >= 0 && VarpDefinition.localPlayer.y >= 0 && VarpDefinition.localPlayer.x < 13312 && VarpDefinition.localPlayer.y < 13312) { // L: 4952
						if ((Tiles.Tiles_renderFlags[class473.Client_plane][VarpDefinition.localPlayer.x >> 7][VarpDefinition.localPlayer.y >> 7] & 4) != 0) { // L: 4956
							var8 = class473.Client_plane;
						}

						var7 = var8; // L: 4957
					} else {
						var7 = class473.Client_plane; // L: 4953
					}
				}
			}

			var6 = var7; // L: 4959
		} else {
			if (class30.clientPreferences.method2635()) { // L: 4964
				var7 = class473.Client_plane; // L: 4965
			} else {
				var8 = class272.getTileHeight(FriendsChatMember.cameraX, class317.cameraZ, class473.Client_plane); // L: 4968
				if (var8 - class18.cameraY < 800 && (Tiles.Tiles_renderFlags[class473.Client_plane][FriendsChatMember.cameraX >> 7][class317.cameraZ >> 7] & 4) != 0) { // L: 4969
					var7 = class473.Client_plane; // L: 4970
				} else {
					var7 = 3; // L: 4973
				}
			}

			var6 = var7; // L: 4975
		}

		var7 = FriendsChatMember.cameraX; // L: 4977
		var8 = class18.cameraY; // L: 4978
		var9 = class317.cameraZ; // L: 4979
		var10 = FriendSystem.cameraPitch; // L: 4980
		var11 = Script.cameraYaw; // L: 4981

		for (var12 = 0; var12 < 5; ++var12) { // L: 4982
			if (Client.field797[var12]) { // L: 4983
				var13 = (int)(Math.random() * (double)(Client.field798[var12] * 2 + 1) - (double)Client.field798[var12] + Math.sin((double)Client.field754[var12] * ((double)Client.field800[var12] / 100.0D)) * (double)Client.field799[var12]); // L: 4984
				if (var12 == 0) { // L: 4985
					FriendsChatMember.cameraX += var13;
				}

				if (var12 == 1) { // L: 4986
					class18.cameraY += var13;
				}

				if (var12 == 2) { // L: 4987
					class317.cameraZ += var13;
				}

				if (var12 == 3) { // L: 4988
					Script.cameraYaw = var13 + Script.cameraYaw & 2047;
				}

				if (var12 == 4) { // L: 4989
					FriendSystem.cameraPitch += var13; // L: 4990
					if (FriendSystem.cameraPitch < 128) { // L: 4991
						FriendSystem.cameraPitch = 128;
					}

					if (FriendSystem.cameraPitch > 383) { // L: 4992
						FriendSystem.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x; // L: 4996
		var13 = MouseHandler.MouseHandler_y; // L: 4997
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4998
			var12 = MouseHandler.MouseHandler_lastPressedX; // L: 4999
			var13 = MouseHandler.MouseHandler_lastPressedY; // L: 5000
		}

		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) { // L: 5002
			class164.method3467(var12 - var0, var13 - var1); // L: 5003
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 5007
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 5008
		}

		class190.method3774(); // L: 5011
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 5012
		class190.method3774(); // L: 5013
		var14 = Rasterizer3D.method5302(); // L: 5014
		Rasterizer3D.method5278(class193.client.field200); // L: 5015
		Rasterizer3D.field2820.field3089 = Client.viewportZoom; // L: 5016
		Actor.scene.draw(FriendsChatMember.cameraX, class18.cameraY, class317.cameraZ, FriendSystem.cameraPitch, Script.cameraYaw, var6); // L: 5017
		Rasterizer3D.method5278(false); // L: 5018
		if (Client.renderSelf) { // L: 5019
			Rasterizer2D.method9802(); // L: 5020
		}

		Rasterizer3D.field2820.field3089 = var14; // L: 5022
		class190.method3774(); // L: 5023
		Actor.scene.clearTempGameObjects(); // L: 5024
		class317.method6071(var0, var1, var2, var3); // L: 5025
		if (Client.field542 == 2) { // L: 5027
			ClanChannelMember.worldToScreen(Client.field548 * 64 + (Client.field545 - Projectile.baseX * 64 << 7), Client.field549 * 4096 + (Client.field546 - GameEngine.baseY * 8 << 7), Client.field547 * 2); // L: 5028
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 5029
				ChatChannel.field1041[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.field2820.Rasterizer3D_textureLoader).animate(Client.field604); // L: 5031
		class407.method7643(); // L: 5033
		FriendsChatMember.cameraX = var7; // L: 5035
		class18.cameraY = var8; // L: 5036
		class317.cameraZ = var9; // L: 5037
		FriendSystem.cameraPitch = var10; // L: 5038
		Script.cameraYaw = var11; // L: 5039
		if (Client.field610 && class356.field3897.method7211(true, false) == 0) { // L: 5040
			Client.field610 = false;
		}

		if (Client.field610) { // L: 5041
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 5042
			RouteStrategy.drawLoadingMessage("Loading - please wait.", false); // L: 5043
		}

	} // L: 5045
}
