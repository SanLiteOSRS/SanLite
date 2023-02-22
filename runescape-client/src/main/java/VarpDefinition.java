import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1199672607
	)
	public static int field1927;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "[Lrg;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2080384113
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;B)V",
		garbageValue = "13"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;IB)V",
		garbageValue = "-79"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 41
			this.type = var1.readUnsignedShort();
		}

	} // L: 43

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgh;",
		garbageValue = "14"
	)
	public static VarbitComposition method3597(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = DevicePcmPlayerProvider.VarbitDefinition_archive.takeFile(14, var0); // L: 34
			var1 = new VarbitComposition(); // L: 35
			if (var2 != null) { // L: 36
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0); // L: 37
			return var1; // L: 38
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2128012582"
	)
	static void method3596(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "708107265"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4765
		class204.method4132(); // L: 4766
		class431.method8067(); // L: 4767
		PcmPlayer.method803(); // L: 4768
		class10.addNpcsToScene(true); // L: 4769
		int var4 = Players.Players_count; // L: 4771
		int[] var5 = Players.Players_indices; // L: 4772

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4773
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4774
				Decimator.addPlayerToScene(Client.players[var5[var6]], true); // L: 4775
			}
		}

		class10.addNpcsToScene(false); // L: 4778
		class161.method3384(); // L: 4779
		TextureProvider.method4681(); // L: 4780
		MusicPatchPcmStream.setViewportShape(var0, var1, var2, var3, true); // L: 4781
		var0 = Client.viewportOffsetX; // L: 4782
		var1 = Client.viewportOffsetY; // L: 4783
		var2 = Client.viewportWidth; // L: 4784
		var3 = Client.viewportHeight; // L: 4785
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4786
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4787
		var4 = Client.camAngleX; // L: 4788
		if (Client.field598 / 256 > var4) { // L: 4789
			var4 = Client.field598 / 256;
		}

		if (Client.field569[4] && Client.field525[4] + 128 > var4) { // L: 4790
			var4 = Client.field525[4] + 128;
		}

		int var21 = Client.camAngleY & 2047; // L: 4791
		var6 = class245.oculusOrbFocalPointX; // L: 4792
		int var7 = Ignored.field4573; // L: 4793
		int var8 = UserComparator10.oculusOrbFocalPointY; // L: 4794
		int var9 = class17.method274(var4); // L: 4795
		int var11 = var3 - 334; // L: 4799
		if (var11 < 0) { // L: 4800
			var11 = 0;
		} else if (var11 > 100) { // L: 4801
			var11 = 100;
		}

		int var12 = (Client.zoomWidth - Client.zoomHeight) * var11 / 100 + Client.zoomHeight; // L: 4802
		int var10 = var12 * var9 / 256; // L: 4803
		var11 = 2048 - var4 & 2047; // L: 4806
		var12 = 2048 - var21 & 2047; // L: 4807
		int var13 = 0; // L: 4808
		int var14 = 0; // L: 4809
		int var15 = var10; // L: 4810
		int var16;
		int var17;
		int var18;
		if (var11 != 0) { // L: 4811
			var16 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4812
			var17 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4813
			var18 = var17 * var14 - var16 * var10 >> 16; // L: 4814
			var15 = var10 * var17 + var14 * var16 >> 16; // L: 4815
			var14 = var18; // L: 4816
		}

		if (var12 != 0) { // L: 4818
			var16 = Rasterizer3D.Rasterizer3D_sine[var12]; // L: 4819
			var17 = Rasterizer3D.Rasterizer3D_cosine[var12]; // L: 4820
			var18 = var16 * var15 + var13 * var17 >> 16; // L: 4821
			var15 = var17 * var15 - var13 * var16 >> 16; // L: 4822
			var13 = var18; // L: 4823
		}

		if (Client.isCameraLocked) { // L: 4825
			WorldMapRegion.field2874 = var6 - var13; // L: 4826
			PacketWriter.field1404 = var7 - var14; // L: 4827
			WorldMapDecoration.field2970 = var8 - var15; // L: 4828
			class135.field1629 = var4; // L: 4829
			class16.field88 = var21; // L: 4830
		} else {
			ClanSettings.cameraX = var6 - var13; // L: 4833
			UserComparator10.cameraY = var7 - var14; // L: 4834
			class366.cameraZ = var8 - var15; // L: 4835
			class103.cameraPitch = var4; // L: 4836
			class285.cameraYaw = var21; // L: 4837
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class245.oculusOrbFocalPointX >> 7 != class387.localPlayer.x >> 7 || UserComparator10.oculusOrbFocalPointY >> 7 != class387.localPlayer.y >> 7)) { // L: 4839 4840
			var16 = class387.localPlayer.plane; // L: 4841
			var17 = ParamComposition.baseX * 64 + (class245.oculusOrbFocalPointX >> 7); // L: 4842
			var18 = Client.baseY * 64 + (UserComparator10.oculusOrbFocalPointY >> 7); // L: 4843
			class168.method3487(var17, var18, var16, true); // L: 4844
		}

		int var20;
		if (!Client.isCameraLocked) { // L: 4849
			if (PacketWriter.clientPreferences.method2572()) { // L: 4852
				var11 = class103.Client_plane; // L: 4853
			} else {
				label360: {
					var12 = 3; // L: 4856
					if (class103.cameraPitch < 310) { // L: 4857
						if (Client.oculusOrbState == 1) { // L: 4860
							var13 = class245.oculusOrbFocalPointX >> 7; // L: 4861
							var14 = UserComparator10.oculusOrbFocalPointY >> 7; // L: 4862
						} else {
							var13 = class387.localPlayer.x >> 7; // L: 4865
							var14 = class387.localPlayer.y >> 7; // L: 4866
						}

						var15 = ClanSettings.cameraX >> 7; // L: 4868
						var16 = class366.cameraZ >> 7; // L: 4869
						if (var15 < 0 || var16 < 0 || var15 >= 104 || var16 >= 104) { // L: 4870
							var11 = class103.Client_plane; // L: 4871
							break label360; // L: 4872
						}

						if (var13 < 0 || var14 < 0 || var13 >= 104 || var14 >= 104) { // L: 4874
							var11 = class103.Client_plane; // L: 4875
							break label360; // L: 4876
						}

						if ((Tiles.Tiles_renderFlags[class103.Client_plane][var15][var16] & 4) != 0) { // L: 4878
							var12 = class103.Client_plane;
						}

						if (var13 > var15) { // L: 4880
							var17 = var13 - var15;
						} else {
							var17 = var15 - var13; // L: 4881
						}

						if (var14 > var16) { // L: 4883
							var18 = var14 - var16;
						} else {
							var18 = var16 - var14; // L: 4884
						}

						int var19;
						if (var17 > var18) { // L: 4885
							var19 = var18 * 65536 / var17; // L: 4886
							var20 = 32768; // L: 4887

							while (var13 != var15) { // L: 4888
								if (var15 < var13) { // L: 4889
									++var15;
								} else if (var15 > var13) { // L: 4890
									--var15;
								}

								if ((Tiles.Tiles_renderFlags[class103.Client_plane][var15][var16] & 4) != 0) { // L: 4891
									var12 = class103.Client_plane;
								}

								var20 += var19; // L: 4892
								if (var20 >= 65536) { // L: 4893
									var20 -= 65536; // L: 4894
									if (var16 < var14) { // L: 4895
										++var16;
									} else if (var16 > var14) { // L: 4896
										--var16;
									}

									if ((Tiles.Tiles_renderFlags[class103.Client_plane][var15][var16] & 4) != 0) { // L: 4897
										var12 = class103.Client_plane;
									}
								}
							}
						} else if (var18 > 0) { // L: 4901
							var19 = var17 * 65536 / var18; // L: 4902
							var20 = 32768; // L: 4903

							while (var16 != var14) { // L: 4904
								if (var16 < var14) { // L: 4905
									++var16;
								} else if (var16 > var14) { // L: 4906
									--var16;
								}

								if ((Tiles.Tiles_renderFlags[class103.Client_plane][var15][var16] & 4) != 0) { // L: 4907
									var12 = class103.Client_plane;
								}

								var20 += var19; // L: 4908
								if (var20 >= 65536) { // L: 4909
									var20 -= 65536; // L: 4910
									if (var15 < var13) { // L: 4911
										++var15;
									} else if (var15 > var13) { // L: 4912
										--var15;
									}

									if ((Tiles.Tiles_renderFlags[class103.Client_plane][var15][var16] & 4) != 0) { // L: 4913
										var12 = class103.Client_plane;
									}
								}
							}
						}
					}

					if (class387.localPlayer.x >= 0 && class387.localPlayer.y >= 0 && class387.localPlayer.x < 13312 && class387.localPlayer.y < 13312) { // L: 4918
						if ((Tiles.Tiles_renderFlags[class103.Client_plane][class387.localPlayer.x >> 7][class387.localPlayer.y >> 7] & 4) != 0) { // L: 4922
							var12 = class103.Client_plane;
						}

						var11 = var12; // L: 4923
					} else {
						var11 = class103.Client_plane; // L: 4919
					}
				}
			}

			var10 = var11; // L: 4925
		} else {
			var10 = KeyHandler.method433(); // L: 4927
		}

		var11 = ClanSettings.cameraX; // L: 4928
		var12 = UserComparator10.cameraY; // L: 4929
		var13 = class366.cameraZ; // L: 4930
		var14 = class103.cameraPitch; // L: 4931
		var15 = class285.cameraYaw; // L: 4932

		for (var16 = 0; var16 < 5; ++var16) { // L: 4933
			if (Client.field569[var16]) { // L: 4934
				var17 = (int)(Math.random() * (double)(Client.field769[var16] * 2 + 1) - (double)Client.field769[var16] + Math.sin((double)Client.field771[var16] / 100.0D * (double)Client.field772[var16]) * (double)Client.field525[var16]); // L: 4935
				if (var16 == 0) { // L: 4936
					ClanSettings.cameraX += var17;
				}

				if (var16 == 1) { // L: 4937
					UserComparator10.cameraY += var17;
				}

				if (var16 == 2) { // L: 4938
					class366.cameraZ += var17;
				}

				if (var16 == 3) { // L: 4939
					class285.cameraYaw = var17 + class285.cameraYaw & 2047;
				}

				if (var16 == 4) { // L: 4940
					class103.cameraPitch += var17; // L: 4941
					if (class103.cameraPitch < 128) { // L: 4942
						class103.cameraPitch = 128;
					}

					if (class103.cameraPitch > 383) { // L: 4943
						class103.cameraPitch = 383;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x; // L: 4947
		var17 = MouseHandler.MouseHandler_y; // L: 4948
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4949
			var16 = MouseHandler.MouseHandler_lastPressedX; // L: 4950
			var17 = MouseHandler.MouseHandler_lastPressedY; // L: 4951
		}

		if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) { // L: 4953
			class123.method3031(var16 - var0, var17 - var1); // L: 4954
		} else {
			class142.method3167(); // L: 4957
		}

		HorizontalAlignment.playPcmPlayers(); // L: 4959
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4960
		HorizontalAlignment.playPcmPlayers(); // L: 4961
		var18 = Rasterizer3D.Rasterizer3D_zoom; // L: 4962
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4963
		WorldMapAreaData.scene.draw(ClanSettings.cameraX, UserComparator10.cameraY, class366.cameraZ, class103.cameraPitch, class285.cameraYaw, var10); // L: 4964
		Rasterizer3D.Rasterizer3D_zoom = var18; // L: 4965
		HorizontalAlignment.playPcmPlayers(); // L: 4966
		WorldMapAreaData.scene.clearTempGameObjects(); // L: 4967
		GroundObject.method4314(var0, var1, var2, var3); // L: 4968
		if (Client.hintArrowType == 2) { // L: 4970
			class467.worldToScreen(Client.field762 * 64 + (Client.hintArrowX - ParamComposition.baseX * 64 << 7), Client.field703 * 64 + (Client.hintArrowY - Client.baseY * 64 << 7), Client.field522 * 2); // L: 4971
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4972
				WorldMapSectionType.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field574); // L: 4974
		class220.method4628(var0, var1, var2, var3); // L: 4975
		ClanSettings.cameraX = var11; // L: 4976
		UserComparator10.cameraY = var12; // L: 4977
		class366.cameraZ = var13; // L: 4978
		class103.cameraPitch = var14; // L: 4979
		class285.cameraYaw = var15; // L: 4980
		if (Client.isLoading) { // L: 4981
			byte var22 = 0; // L: 4984
			var20 = var22 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount; // L: 4985
			if (var20 == 0) { // L: 4989
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4991
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4992
			class165.drawLoadingMessage("Loading - please wait.", false); // L: 4993
		}

	} // L: 4995
}
