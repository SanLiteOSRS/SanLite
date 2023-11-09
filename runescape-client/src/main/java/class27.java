import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class27 {
	@ObfuscatedName("ag")
	int[] field143;
	@ObfuscatedName("az")
	int[] field144;

	public class27() {
		this.field143 = new int[112]; // L: 12
		this.field144 = new int[192]; // L: 13
		Arrays.fill(this.field143, 3); // L: 16
		Arrays.fill(this.field144, 3); // L: 17
	} // L: 18

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "19"
	)
	public void method389(int var1, int var2) {
		if (this.method397(var1) && this.method399(var2)) { // L: 21
			this.field143[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "1505085994"
	)
	public void method390(char var1, int var2) {
		if (this.method409(var1) && this.method399(var2)) { // L: 27
			this.field144[var1] = var2; // L: 28
		}

	} // L: 30

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "62"
	)
	public int method391(int var1) {
		return this.method397(var1) ? this.field143[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(CS)I",
		garbageValue = "-2560"
	)
	public int method388(char var1) {
		return this.method409(var1) ? this.field144[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2027151744"
	)
	public boolean method393(int var1) {
		return this.method397(var1) && (this.field143[var1] == 1 || this.field143[var1] == 3); // L: 47
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2113017491"
	)
	public boolean method394(char var1) {
		return this.method409(var1) && (this.field144[var1] == 1 || this.field144[var1] == 3); // L: 51
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-651027133"
	)
	public boolean method396(int var1) {
		return this.method397(var1) && (this.field143[var1] == 2 || this.field143[var1] == 3); // L: 55
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "392210402"
	)
	public boolean method404(char var1) {
		return this.method409(var1) && (this.field144[var1] == 2 || this.field144[var1] == 3); // L: 59
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "295186281"
	)
	boolean method397(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "16"
	)
	boolean method409(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1832967657"
	)
	boolean method399(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	static int method422(String var0) {
		if (var0.equals("centre")) { // L: 319
			return 1; // L: 320
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2; // L: 322 323 325
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "937542062"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 597
		if (UserComparator4.garbageCollector == null || !UserComparator4.garbageCollector.isValid()) { // L: 598
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 600

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 601
					if (var2.isValid()) { // L: 603
						UserComparator4.garbageCollector = var2; // L: 604
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 605
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 606
					}
				}
			} catch (Throwable var11) { // L: 611
			}
		}

		if (UserComparator4.garbageCollector != null) { // L: 613
			long var9 = class113.method2835(); // L: 614
			long var3 = UserComparator4.garbageCollector.getCollectionTime(); // L: 615
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 616
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 617
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 618
				if (var7 != 0L) { // L: 619
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 621
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 622
		}

		return var0; // L: 624
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "193"
	)
	static final void method421() {
		int var0 = Players.Players_count; // L: 4105
		int[] var1 = Players.Players_indices; // L: 4106

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4107
			Player var3 = Client.players[var1[var2]]; // L: 4108
			if (var3 != null) { // L: 4109
				class47.updateActorSequence(var3, 1); // L: 4110
			}
		}

	} // L: 4113

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-71"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4717
		if (class136.localPlayer.x >> 7 == Client.destinationX && class136.localPlayer.y >> 7 == Client.destinationY) { // L: 4719
			Client.destinationX = 0; // L: 4720
		}

		class89.method2308(); // L: 4723
		ArchiveLoader.method2260(); // L: 4724
		class510.addNpcsToScene(true); // L: 4725
		int var4 = Players.Players_count; // L: 4727
		int[] var5 = Players.Players_indices; // L: 4728

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4729
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4730
				GrandExchangeOfferNameComparator.addPlayerToScene(Client.players[var5[var6]], true); // L: 4731
			}
		}

		class510.addNpcsToScene(false); // L: 4734
		class393.method7302(); // L: 4735
		class133.method3043(); // L: 4736
		class31.setViewportShape(var0, var1, var2, var3, true); // L: 4737
		var0 = Client.viewportOffsetX; // L: 4738
		var1 = Client.viewportOffsetY; // L: 4739
		var2 = Client.viewportWidth; // L: 4740
		var3 = Client.viewportHeight; // L: 4741
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4742
		Rasterizer3D.method4417(); // L: 4743
		Rasterizer2D.method9445(); // L: 4744
		var4 = Client.camAngleX; // L: 4745
		if (Client.field616 / 256 > var4) { // L: 4746
			var4 = Client.field616 / 256;
		}

		if (Client.field618[4] && Client.field784[4] + 128 > var4) { // L: 4747
			var4 = Client.field784[4] + 128;
		}

		int var17 = Client.camAngleY & 2047; // L: 4748
		class30.method446(class467.oculusOrbFocalPointX, class90.field1108, class36.oculusOrbFocalPointY, var4, var17, FriendsChatMember.method7946(var4), var3); // L: 4749
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		if (!Client.isCameraLocked) { // L: 4751
			if (class150.clientPreferences.method2465()) { // L: 4754
				var7 = class36.Client_plane; // L: 4755
			} else {
				label339: {
					var8 = 3; // L: 4758
					if (class19.cameraPitch < 310) { // L: 4759
						label336: {
							if (Client.oculusOrbState == 1) { // L: 4762
								var9 = class467.oculusOrbFocalPointX >> 7; // L: 4763
								var10 = class36.oculusOrbFocalPointY >> 7; // L: 4764
							} else {
								var9 = class136.localPlayer.x >> 7; // L: 4767
								var10 = class136.localPlayer.y >> 7; // L: 4768
							}

							var11 = class157.cameraX >> 7; // L: 4770
							var12 = SoundSystem.cameraZ >> 7; // L: 4771
							if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) { // L: 4772
								if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) { // L: 4776
									if ((Tiles.Tiles_renderFlags[class36.Client_plane][var11][var12] & 4) != 0) { // L: 4780
										var8 = class36.Client_plane;
									}

									if (var9 > var11) { // L: 4782
										var13 = var9 - var11;
									} else {
										var13 = var11 - var9; // L: 4783
									}

									if (var10 > var12) { // L: 4785
										var14 = var10 - var12;
									} else {
										var14 = var12 - var10; // L: 4786
									}

									int var16;
									if (var13 > var14) { // L: 4787
										var15 = var14 * 65536 / var13; // L: 4788
										var16 = 32768; // L: 4789

										while (true) {
											if (var9 == var11) { // L: 4790
												break label336;
											}

											if (var11 < var9) { // L: 4791
												++var11;
											} else if (var11 > var9) { // L: 4792
												--var11;
											}

											if ((Tiles.Tiles_renderFlags[class36.Client_plane][var11][var12] & 4) != 0) { // L: 4793
												var8 = class36.Client_plane;
											}

											var16 += var15; // L: 4794
											if (var16 >= 65536) { // L: 4795
												var16 -= 65536; // L: 4796
												if (var12 < var10) { // L: 4797
													++var12;
												} else if (var12 > var10) { // L: 4798
													--var12;
												}

												if ((Tiles.Tiles_renderFlags[class36.Client_plane][var11][var12] & 4) != 0) { // L: 4799
													var8 = class36.Client_plane;
												}
											}
										}
									} else {
										if (var14 > 0) { // L: 4803
											var15 = var13 * 65536 / var14; // L: 4804
											var16 = 32768; // L: 4805

											while (var10 != var12) { // L: 4806
												if (var12 < var10) { // L: 4807
													++var12;
												} else if (var12 > var10) { // L: 4808
													--var12;
												}

												if ((Tiles.Tiles_renderFlags[class36.Client_plane][var11][var12] & 4) != 0) { // L: 4809
													var8 = class36.Client_plane;
												}

												var16 += var15; // L: 4810
												if (var16 >= 65536) { // L: 4811
													var16 -= 65536; // L: 4812
													if (var11 < var9) { // L: 4813
														++var11;
													} else if (var11 > var9) { // L: 4814
														--var11;
													}

													if ((Tiles.Tiles_renderFlags[class36.Client_plane][var11][var12] & 4) != 0) { // L: 4815
														var8 = class36.Client_plane;
													}
												}
											}
										}
										break label336;
									}
								}

								var7 = class36.Client_plane; // L: 4777
								break label339; // L: 4778
							}

							var7 = class36.Client_plane; // L: 4773
							break label339; // L: 4774
						}
					}

					if (class136.localPlayer.x >= 0 && class136.localPlayer.y >= 0 && class136.localPlayer.x < 13312 && class136.localPlayer.y < 13312) { // L: 4820
						if ((Tiles.Tiles_renderFlags[class36.Client_plane][class136.localPlayer.x >> 7][class136.localPlayer.y >> 7] & 4) != 0) { // L: 4824
							var8 = class36.Client_plane;
						}

						var7 = var8; // L: 4825
					} else {
						var7 = class36.Client_plane; // L: 4821
					}
				}
			}

			var6 = var7; // L: 4827
		} else {
			if (class150.clientPreferences.method2465()) { // L: 4832
				var7 = class36.Client_plane; // L: 4833
			} else {
				var8 = class306.getTileHeight(class157.cameraX, SoundSystem.cameraZ, class36.Client_plane); // L: 4836
				if (var8 - class384.cameraY < 800 && (Tiles.Tiles_renderFlags[class36.Client_plane][class157.cameraX >> 7][SoundSystem.cameraZ >> 7] & 4) != 0) { // L: 4837
					var7 = class36.Client_plane; // L: 4838
				} else {
					var7 = 3; // L: 4841
				}
			}

			var6 = var7; // L: 4843
		}

		var7 = class157.cameraX; // L: 4845
		var8 = class384.cameraY; // L: 4846
		var9 = SoundSystem.cameraZ; // L: 4847
		var10 = class19.cameraPitch; // L: 4848
		var11 = class456.cameraYaw; // L: 4849

		for (var12 = 0; var12 < 5; ++var12) { // L: 4850
			if (Client.field618[var12]) { // L: 4851
				var13 = (int)(Math.random() * (double)(Client.field783[var12] * 2 + 1) - (double)Client.field783[var12] + Math.sin((double)Client.field785[var12] / 100.0D * (double)Client.field771[var12]) * (double)Client.field784[var12]); // L: 4852
				if (var12 == 0) { // L: 4853
					class157.cameraX += var13;
				}

				if (var12 == 1) { // L: 4854
					class384.cameraY += var13;
				}

				if (var12 == 2) { // L: 4855
					SoundSystem.cameraZ += var13;
				}

				if (var12 == 3) { // L: 4856
					class456.cameraYaw = var13 + class456.cameraYaw & 2047;
				}

				if (var12 == 4) { // L: 4857
					class19.cameraPitch += var13; // L: 4858
					if (class19.cameraPitch < 128) { // L: 4859
						class19.cameraPitch = 128;
					}

					if (class19.cameraPitch > 383) { // L: 4860
						class19.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x; // L: 4864
		var13 = MouseHandler.MouseHandler_y; // L: 4865
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4866
			var12 = MouseHandler.MouseHandler_lastPressedX; // L: 4867
			var13 = MouseHandler.MouseHandler_lastPressedY; // L: 4868
		}

		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) { // L: 4870
			var14 = var12 - var0; // L: 4871
			var15 = var13 - var1; // L: 4872
			ViewportMouse.ViewportMouse_x = var14; // L: 4874
			ViewportMouse.ViewportMouse_y = var15; // L: 4875
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4876
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4877
			ViewportMouse.ViewportMouse_false0 = false; // L: 4878
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4883
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4884
		}

		class105.method2684(); // L: 4887
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4888
		class105.method2684(); // L: 4889
		var14 = Rasterizer3D.method4414(); // L: 4890
		Rasterizer3D.method4403(TileItem.client.field210); // L: 4891
		Rasterizer3D.field2510.field2781 = Client.viewportZoom; // L: 4892
		UserComparator5.scene.draw(class157.cameraX, class384.cameraY, SoundSystem.cameraZ, class19.cameraPitch, class456.cameraYaw, var6); // L: 4893
		Rasterizer3D.method4403(false); // L: 4894
		if (Client.renderSelf) { // L: 4895
			Rasterizer2D.method9446(); // L: 4896
		}

		Rasterizer3D.field2510.field2781 = var14; // L: 4898
		class105.method2684(); // L: 4899
		UserComparator5.scene.clearTempGameObjects(); // L: 4900
		UserComparator7.method2869(var0, var1, var2, var3); // L: 4901
		if (Client.hintArrowType == 2) { // L: 4903
			ReflectionCheck.worldToScreen(Client.field542 * 64 + (Client.field539 - AbstractArchive.baseX * 64 << 7), (Client.field607 - class148.baseY * 64 << 7) + Client.field543 * 4096, Client.field541 * 4); // L: 4904
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4905
				class345.field3858[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.field2510.Rasterizer3D_textureLoader).animate(Client.field702); // L: 4907
		FriendLoginUpdate.method7930(); // L: 4909
		class157.cameraX = var7; // L: 4911
		class384.cameraY = var8; // L: 4912
		SoundSystem.cameraZ = var9; // L: 4913
		class19.cameraPitch = var10; // L: 4914
		class456.cameraYaw = var11; // L: 4915
		if (Client.field682 && class153.field1700.method6852(true, false) == 0) { // L: 4916
			Client.field682 = false;
		}

		if (Client.field682) { // L: 4917
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4918
			Actor.drawLoadingMessage("Loading - please wait.", false); // L: 4919
		}

	} // L: 4921

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Llo;B)V",
		garbageValue = "-63"
	)
	static final void method408(class296 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 8102
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		if (class296.field3195 == var0) { // L: 8103
			var2 = var1.method9120(); // L: 8104
			var3 = var2 >> 4 & 15; // L: 8105
			var4 = var2 & 7; // L: 8106
			var5 = var1.method9119(); // L: 8107
			var6 = var1.method9089(); // L: 8108
			var7 = (var6 >> 4 & 7) + WorldMapSectionType.field2978; // L: 8109
			var8 = (var6 & 7) + class387.field4440; // L: 8110
			var9 = var1.method9087(); // L: 8111
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 8112
				var10 = var3 + 1; // L: 8113
				if (class136.localPlayer.pathX[0] >= var7 - var10 && class136.localPlayer.pathX[0] <= var7 + var10 && class136.localPlayer.pathY[0] >= var8 - var10 && class136.localPlayer.pathY[0] <= var10 + var8 && class150.clientPreferences.method2481() != 0 && var4 > 0 && Client.soundEffectCount < 50) { // L: 8114 8115
					Client.soundEffectIds[Client.soundEffectCount] = var9; // L: 8116
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 8117
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var5; // L: 8118
					Client.soundEffects[Client.soundEffectCount] = null; // L: 8119
					Client.soundLocations[Client.soundEffectCount] = var3 + (var8 << 8) + (var7 << 16); // L: 8120
					++Client.soundEffectCount; // L: 8121
				}
			}
		}

		TileItem var32;
		if (class296.field3194 == var0) { // L: 8126
			var2 = var1.method9336(); // L: 8127
			var3 = var1.method9089(); // L: 8128
			var1.readUnsignedShort(); // L: 8129
			var1.method9120(); // L: 8130
			var4 = var1.readUnsignedShort(); // L: 8131
			var5 = var1.readUnsignedByte(); // L: 8132
			var6 = (var5 >> 4 & 7) + WorldMapSectionType.field2978; // L: 8133
			var7 = (var5 & 7) + class387.field4440; // L: 8134
			var1.readUnsignedByte(); // L: 8135
			var1.method9116(); // L: 8136
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 8137
				var32 = new TileItem(); // L: 8138
				var32.id = var4; // L: 8139
				var32.quantity = var2; // L: 8140
				var32.method2671(var3); // L: 8141
				if (Client.groundItems[class36.Client_plane][var6][var7] == null) { // L: 8142
					Client.groundItems[class36.Client_plane][var6][var7] = new NodeDeque(); // L: 8143
				}

				Client.groundItems[class36.Client_plane][var6][var7].addFirst(var32); // L: 8145
				class344.updateItemPile(var6, var7); // L: 8146
			}

		} else {
			int var11;
			if (class296.field3193 == var0) { // L: 8150
				var2 = var1.method9087(); // L: 8151
				var3 = var1.readUnsignedByte(); // L: 8152
				var4 = (var3 >> 4 & 7) + WorldMapSectionType.field2978; // L: 8153
				var5 = (var3 & 7) + class387.field4440; // L: 8154
				var6 = var1.method9089(); // L: 8155
				var7 = var6 >> 2; // L: 8156
				var8 = var6 & 3; // L: 8157
				var9 = Client.field591[var7]; // L: 8158
				if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) { // L: 8159
					if (var9 == 0) { // L: 8160
						WallObject var35 = UserComparator5.scene.method4581(class36.Client_plane, var4, var5); // L: 8161
						if (var35 != null) { // L: 8162
							var11 = class458.Entity_unpackID(var35.tag); // L: 8163
							if (var7 == 2) { // L: 8164
								var35.renderable1 = new DynamicObject(var11, 2, var8 + 4, class36.Client_plane, var4, var5, var2, false, var35.renderable1); // L: 8165
								var35.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, class36.Client_plane, var4, var5, var2, false, var35.renderable2); // L: 8166
							} else {
								var35.renderable1 = new DynamicObject(var11, var7, var8, class36.Client_plane, var4, var5, var2, false, var35.renderable1); // L: 8168
							}

							return; // L: 8169
						}
					}

					if (var9 == 1) { // L: 8172
						DecorativeObject var42 = UserComparator5.scene.method4616(class36.Client_plane, var4, var5); // L: 8173
						if (var42 != null) { // L: 8174
							var11 = class458.Entity_unpackID(var42.tag); // L: 8175
							if (var7 != 4 && var7 != 5) { // L: 8176
								if (var7 == 6) { // L: 8177
									var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, class36.Client_plane, var4, var5, var2, false, var42.renderable1);
								} else if (var7 == 7) { // L: 8178
									var42.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class36.Client_plane, var4, var5, var2, false, var42.renderable1);
								} else if (var7 == 8) { // L: 8179
									var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, class36.Client_plane, var4, var5, var2, false, var42.renderable1); // L: 8180
									var42.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class36.Client_plane, var4, var5, var2, false, var42.renderable2); // L: 8181
								}
							} else {
								var42.renderable1 = new DynamicObject(var11, 4, var8, class36.Client_plane, var4, var5, var2, false, var42.renderable1);
							}

							return; // L: 8183
						}
					}

					if (var9 == 2) { // L: 8186
						GameObject var43 = UserComparator5.scene.getGameObject(class36.Client_plane, var4, var5); // L: 8187
						if (var7 == 11) { // L: 8188
							var7 = 10;
						}

						if (var43 != null) { // L: 8189
							var43.renderable = new DynamicObject(class458.Entity_unpackID(var43.tag), var7, var8, class36.Client_plane, var4, var5, var2, false, var43.renderable); // L: 8190
							return; // L: 8191
						}
					}

					if (var9 == 3) { // L: 8194
						GroundObject var44 = UserComparator5.scene.getGroundObject(class36.Client_plane, var4, var5); // L: 8195
						if (var44 != null) { // L: 8196
							var44.renderable = new DynamicObject(class458.Entity_unpackID(var44.tag), 22, var8, class36.Client_plane, var4, var5, var2, false, var44.renderable); // L: 8197
							return; // L: 8198
						}
					}

					class232.method4740(class36.Client_plane, var4, var5, var9, var2); // L: 8201
				}

			} else if (class296.field3202 == var0) { // L: 8205
				var2 = var1.method9089(); // L: 8206
				var3 = var1.readUnsignedByte(); // L: 8207
				var4 = (var3 >> 4 & 7) + WorldMapSectionType.field2978; // L: 8208
				var5 = (var3 & 7) + class387.field4440; // L: 8209
				var6 = var1.readUnsignedShort(); // L: 8210
				var7 = var1.method9116(); // L: 8211
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8212
					var4 = var4 * 128 + 64; // L: 8213
					var5 = var5 * 128 + 64; // L: 8214
					GraphicsObject var41 = new GraphicsObject(var6, class36.Client_plane, var4, var5, class306.getTileHeight(var4, var5, class36.Client_plane) - var2, var7, Client.cycle); // L: 8215
					Client.graphicsObjects.addFirst(var41); // L: 8216
				}

			} else if (class296.field3197 == var0) { // L: 8220
				var2 = var1.method9119(); // L: 8221
				var3 = (var2 >> 4 & 7) + WorldMapSectionType.field2978; // L: 8222
				var4 = (var2 & 7) + class387.field4440; // L: 8223
				var5 = var1.readUnsignedShort(); // L: 8224
				var6 = var1.method9142(); // L: 8225
				var7 = var1.method9142(); // L: 8226
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8227
					NodeDeque var40 = Client.groundItems[class36.Client_plane][var3][var4]; // L: 8228
					if (var40 != null) { // L: 8229
						for (TileItem var34 = (TileItem)var40.last(); var34 != null; var34 = (TileItem)var40.previous()) { // L: 8230 8231 8236
							if ((var5 & 32767) == var34.id && var6 == var34.quantity) { // L: 8232
								var34.quantity = var7; // L: 8233
								break;
							}
						}

						class344.updateItemPile(var3, var4); // L: 8238
					}
				}

			} else {
				NodeDeque var31;
				if (class296.field3198 == var0) { // L: 8243
					var2 = var1.readUnsignedByte(); // L: 8244
					var3 = var1.readUnsignedByte(); // L: 8245
					var4 = (var3 >> 4 & 7) + WorldMapSectionType.field2978; // L: 8246
					var5 = (var3 & 7) + class387.field4440; // L: 8247
					var6 = var1.readUnsignedShort(); // L: 8248
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8249
						var31 = Client.groundItems[class36.Client_plane][var4][var5]; // L: 8250
						if (var31 != null) { // L: 8251
							for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 8252 8253 8258
								if ((var6 & 32767) == var32.id) { // L: 8254
									var32.method2671(var2); // L: 8255
									break;
								}
							}
						}
					}

				} else if (class296.field3200 == var0) { // L: 8264
					var2 = var1.method9089(); // L: 8265
					var3 = (var2 >> 4 & 7) + WorldMapSectionType.field2978; // L: 8266
					var4 = (var2 & 7) + class387.field4440; // L: 8267
					var5 = var1.method9119(); // L: 8268
					var6 = var1.method9087(); // L: 8269
					var7 = var1.readUnsignedByte(); // L: 8270
					var8 = var7 >> 2; // L: 8271
					var9 = var7 & 3; // L: 8272
					var10 = Client.field591[var8]; // L: 8273
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8274
						AbstractWorldMapIcon.method5565(class36.Client_plane, var3, var4, var10, var6, var8, var9, var5, 0, -1); // L: 8275
					}

				} else {
					int var12;
					int var13;
					int var14;
					if (class296.field3203 == var0) { // L: 8279
						byte var36 = var1.method9122(); // L: 8280
						var3 = var1.method9119(); // L: 8281
						var4 = (var3 >> 4 & 7) + WorldMapSectionType.field2978; // L: 8282
						var5 = (var3 & 7) + class387.field4440; // L: 8283
						var6 = var1.method9116(); // L: 8284
						var7 = var1.method9087(); // L: 8285
						var8 = var1.readUnsignedShort(); // L: 8286
						var9 = var1.method9116(); // L: 8287
						byte var38 = var1.readByte(); // L: 8288
						var11 = var1.readUnsignedByte(); // L: 8289
						var12 = var11 >> 2; // L: 8290
						var13 = var11 & 3; // L: 8291
						var14 = Client.field591[var12]; // L: 8292
						byte var15 = var1.method9122(); // L: 8293
						byte var16 = var1.readByte(); // L: 8294
						Player var17;
						if (var6 == Client.localPlayerIndex) { // L: 8296
							var17 = class136.localPlayer;
						} else {
							var17 = Client.players[var6]; // L: 8297
						}

						if (var17 != null) { // L: 8298
							ObjectComposition var18 = class90.getObjectDefinition(var7); // L: 8299
							int var19;
							int var20;
							if (var13 != 1 && var13 != 3) { // L: 8302
								var19 = var18.sizeX; // L: 8307
								var20 = var18.sizeY; // L: 8308
							} else {
								var19 = var18.sizeY; // L: 8303
								var20 = var18.sizeX; // L: 8304
							}

							int var21 = var4 + (var19 >> 1); // L: 8310
							int var22 = var4 + (var19 + 1 >> 1); // L: 8311
							int var23 = var5 + (var20 >> 1); // L: 8312
							int var24 = var5 + (var20 + 1 >> 1); // L: 8313
							int[][] var25 = Tiles.Tiles_heights[class36.Client_plane]; // L: 8314
							int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2; // L: 8315
							int var27 = (var4 << 7) + (var19 << 6); // L: 8316
							int var28 = (var5 << 7) + (var20 << 6); // L: 8317
							Model var29 = var18.getModel(var12, var13, var25, var27, var26, var28); // L: 8318
							if (var29 != null) { // L: 8319
								AbstractWorldMapIcon.method5565(class36.Client_plane, var4, var5, var14, -1, 0, 0, 31, var9 + 1, var8 + 1); // L: 8320
								var17.animationCycleStart = var9 + Client.cycle; // L: 8321
								var17.animationCycleEnd = var8 + Client.cycle; // L: 8322
								var17.model0 = var29; // L: 8323
								var17.field1122 = var4 * 128 + var19 * 64; // L: 8324
								var17.field1119 = var5 * 128 + var20 * 64; // L: 8325
								var17.tileHeight2 = var26; // L: 8326
								byte var30;
								if (var36 > var16) { // L: 8327
									var30 = var36; // L: 8328
									var36 = var16; // L: 8329
									var16 = var30; // L: 8330
								}

								if (var38 > var15) { // L: 8332
									var30 = var38; // L: 8333
									var38 = var15; // L: 8334
									var15 = var30; // L: 8335
								}

								var17.minX = var4 + var36; // L: 8337
								var17.maxX = var4 + var16; // L: 8338
								var17.minY = var5 + var38; // L: 8339
								var17.maxY = var5 + var15; // L: 8340
							}
						}
					}

					if (class296.field3201 == var0) { // L: 8344
						var2 = var1.readUnsignedShort(); // L: 8345
						var3 = var1.method9136(); // L: 8346
						var4 = var1.method9120(); // L: 8347
						byte var37 = var1.method9124(); // L: 8348
						var6 = var1.method9120(); // L: 8349
						var7 = (var6 >> 4 & 7) + WorldMapSectionType.field2978; // L: 8350
						var8 = (var6 & 7) + class387.field4440; // L: 8351
						var9 = var1.method9119(); // L: 8352
						var10 = var1.method9116(); // L: 8353
						var11 = var1.method9116(); // L: 8354
						byte var39 = var1.method9122(); // L: 8355
						var13 = var1.method9119() * 4; // L: 8356
						var14 = var1.method9120() * 4; // L: 8357
						var5 = var37 + var7; // L: 8358
						var12 = var39 + var8; // L: 8359
						if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var5 >= 0 && var12 >= 0 && var5 < 104 && var12 < 104 && var11 != 65535) { // L: 8360
							var7 = var7 * 128 + 64; // L: 8361
							var8 = var8 * 128 + 64; // L: 8362
							var5 = var5 * 128 + 64; // L: 8363
							var12 = var12 * 128 + 64; // L: 8364
							Projectile var33 = new Projectile(var11, class36.Client_plane, var7, var8, class306.getTileHeight(var7, var8, class36.Client_plane) - var14, var2 + Client.cycle, var10 + Client.cycle, var9, var4, var3, var13); // L: 8365
							var33.setDestination(var5, var12, class306.getTileHeight(var5, var12, class36.Client_plane) - var13, var2 + Client.cycle); // L: 8366
							Client.projectiles.addFirst(var33); // L: 8367
						}

					} else if (class296.field3196 != var0) { // L: 8371
						if (class296.field3199 == var0) { // L: 8394
							var2 = var1.method9089(); // L: 8395
							var3 = (var2 >> 4 & 7) + WorldMapSectionType.field2978; // L: 8396
							var4 = (var2 & 7) + class387.field4440; // L: 8397
							var5 = var1.readUnsignedByte(); // L: 8398
							var6 = var5 >> 2; // L: 8399
							var7 = var5 & 3; // L: 8400
							var8 = Client.field591[var6]; // L: 8401
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8402
								AbstractWorldMapIcon.method5565(class36.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1); // L: 8403
							}

						}
					} else {
						var2 = var1.method9336(); // L: 8372
						var3 = var1.readUnsignedShort(); // L: 8373
						var4 = var1.method9120(); // L: 8374
						var5 = (var4 >> 4 & 7) + WorldMapSectionType.field2978; // L: 8375
						var6 = (var4 & 7) + class387.field4440; // L: 8376
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 8377
							var31 = Client.groundItems[class36.Client_plane][var5][var6]; // L: 8378
							if (var31 != null) { // L: 8379
								for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 8380 8381 8386
									if ((var3 & 32767) == var32.id && var2 == var32.quantity) { // L: 8382
										var32.remove(); // L: 8383
										break;
									}
								}

								if (var31.last() == null) { // L: 8388
									Client.groundItems[class36.Client_plane][var5][var6] = null;
								}

								class344.updateItemPile(var5, var6); // L: 8389
							}
						}

					}
				}
			}
		}
	} // L: 8148 8203 8218 8241 8262 8277 8369 8392 8405 8407
}
