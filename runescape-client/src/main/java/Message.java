import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1616463731
	)
	@Export("count")
	int count;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -286699527
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1679180039
	)
	@Export("type")
	int type;
	@ObfuscatedName("g")
	@Export("sender")
	String sender;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("v")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("b")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-87"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1;
		this.count = var5;
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1516900151"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "87"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-25"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1886823274"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1274568020"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1898664175"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-349189555"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(Canvas.method468(this.sender), ModeWhere.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-108"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "-366902049"
	)
	public static final void method1166(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			PcmPlayer.field401 = var0;
			ApproximateRouteStrategy.PcmPlayer_stereo = var1;
			PcmPlayer.field405 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2128922058"
	)
	static final int method1174() {
		if (class12.clientPreferences.roofsHidden) {
			return ParamComposition.Client_plane;
		} else {
			int var0 = 3;
			if (class1.cameraPitch < 310) {
				label166: {
					int var1;
					int var2;
					if (Client.oculusOrbState == 1) {
						var1 = HorizontalAlignment.oculusOrbFocalPointX >> 7;
						var2 = class280.oculusOrbFocalPointY >> 7;
					} else {
						var1 = class35.localPlayer.x >> 7;
						var2 = class35.localPlayer.y >> 7;
					}

					int var3 = class20.cameraX >> 7;
					int var4 = WorldMapDecoration.cameraZ >> 7;
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
							if ((Tiles.Tiles_renderFlags[ParamComposition.Client_plane][var3][var4] & 4) != 0) {
								var0 = ParamComposition.Client_plane;
							}

							int var5;
							if (var1 > var3) {
								var5 = var1 - var3;
							} else {
								var5 = var3 - var1;
							}

							int var6;
							if (var2 > var4) {
								var6 = var2 - var4;
							} else {
								var6 = var4 - var2;
							}

							int var7;
							int var8;
							if (var5 > var6) {
								var7 = var6 * 65536 / var5;
								var8 = 32768;

								while (true) {
									if (var1 == var3) {
										break label166;
									}

									if (var3 < var1) {
										++var3;
									} else if (var3 > var1) {
										--var3;
									}

									if ((Tiles.Tiles_renderFlags[ParamComposition.Client_plane][var3][var4] & 4) != 0) {
										var0 = ParamComposition.Client_plane;
									}

									var8 += var7;
									if (var8 >= 65536) {
										var8 -= 65536;
										if (var4 < var2) {
											++var4;
										} else if (var4 > var2) {
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[ParamComposition.Client_plane][var3][var4] & 4) != 0) {
											var0 = ParamComposition.Client_plane;
										}
									}
								}
							} else {
								if (var6 > 0) {
									var7 = var5 * 65536 / var6;
									var8 = 32768;

									while (var4 != var2) {
										if (var4 < var2) {
											++var4;
										} else if (var4 > var2) {
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[ParamComposition.Client_plane][var3][var4] & 4) != 0) {
											var0 = ParamComposition.Client_plane;
										}

										var8 += var7;
										if (var8 >= 65536) {
											var8 -= 65536;
											if (var3 < var1) {
												++var3;
											} else if (var3 > var1) {
												--var3;
											}

											if ((Tiles.Tiles_renderFlags[ParamComposition.Client_plane][var3][var4] & 4) != 0) {
												var0 = ParamComposition.Client_plane;
											}
										}
									}
								}
								break label166;
							}
						}

						return ParamComposition.Client_plane;
					}

					return ParamComposition.Client_plane;
				}
			}

			if (class35.localPlayer.x >= 0 && class35.localPlayer.y >= 0 && class35.localPlayer.x < 13312 && class35.localPlayer.y < 13312) {
				if ((Tiles.Tiles_renderFlags[ParamComposition.Client_plane][class35.localPlayer.x >> 7][class35.localPlayer.y >> 7] & 4) != 0) {
					var0 = ParamComposition.Client_plane;
				}

				return var0;
			} else {
				return ParamComposition.Client_plane;
			}
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1851837703"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != ParamComposition.Client_plane) {
				return;
			}

			long var7 = 0L;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = class5.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var7 = class5.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var7 = class5.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var7 = class5.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) {
				var12 = class5.scene.getObjectFlags(var0, var2, var3, var7);
				int var38 = class6.Entity_unpackID(var7);
				int var39 = var12 & 31;
				int var40 = var12 >> 6 & 3;
				ObjectComposition var13;
				if (var1 == 0) {
					class5.scene.removeBoundaryObject(var0, var2, var3);
					var13 = AttackOption.getObjectDefinition(var38);
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].method3099(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) {
					class5.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					class5.scene.removeGameObject(var0, var2, var3);
					var13 = AttackOption.getObjectDefinition(var38);
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) {
						return;
					}

					if (var13.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) {
					class5.scene.removeFloorDecoration(var0, var2, var3);
					var13 = AttackOption.getObjectDefinition(var38);
					if (var13.interactType == 1) {
						Client.collisionMaps[var0].method3102(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var12 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var12 = var0 + 1;
				}

				Scene var41 = class5.scene;
				CollisionMap var14 = Client.collisionMaps[var0];
				ObjectComposition var15 = AttackOption.getObjectDefinition(var4);
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) {
					var16 = var15.sizeX;
					var17 = var15.sizeY;
				} else {
					var16 = var15.sizeY;
					var17 = var15.sizeX;
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) {
					var18 = (var16 >> 1) + var2;
					var19 = var2 + (var16 + 1 >> 1);
				} else {
					var18 = var2;
					var19 = var2 + 1;
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) {
					var20 = var3 + (var17 >> 1);
					var21 = var3 + (var17 + 1 >> 1);
				} else {
					var20 = var3;
					var21 = var3 + 1;
				}

				int[][] var22 = Tiles.Tiles_heights[var12];
				int var23 = var22[var19][var21] + var22[var18][var21] + var22[var19][var20] + var22[var18][var20] >> 2;
				int var24 = (var2 << 7) + (var16 << 6);
				int var25 = (var3 << 7) + (var17 << 6);
				long var26 = class17.calculateTag(var2, var3, 2, var15.int1 == 0, var4);
				int var28 = (var5 << 6) + var6;
				if (var15.int3 == 1) {
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) {
					if (var15.animationId == -1 && var15.transforms == null) {
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
					}

					var41.newFloorDecoration(var0, var2, var3, var23, (Renderable)var36, var26, var28);
					if (var15.interactType == 1) {
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
						}

						var41.method4008(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28);
						if (var15.interactType != 0) {
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1085[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3094(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1095[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3094(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) {
							var29 = var5 + 1 & 3;
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) {
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25);
								var31 = var15.getModel(2, var29, var22, var24, var23, var25);
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field1085[var5], Tiles.field1085[var29], var26, var28);
							if (var15.interactType != 0) {
								var14.method3094(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1095[var5], 0, var26, var28);
							if (var15.interactType != 0) {
								var14.method3094(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
							}

							var41.method4008(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28);
							if (var15.interactType != 0) {
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
							}

							var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1085[var5], 0, 0, 0, var26, var28);
						} else {
							long var30;
							Object var32;
							if (var6 == 5) {
								var29 = 16;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var30) {
									var29 = AttackOption.getObjectDefinition(class6.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field1085[var5], 0, var29 * Tiles.field1096[var5], var29 * Tiles.field1100[var5], var26, var28);
							} else if (var6 == 6) {
								var29 = 8;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (var30 != 0L) {
									var29 = AttackOption.getObjectDefinition(class6.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field1098[var5], var29 * Tiles.field1094[var5], var26, var28);
							} else if (var6 == 7) {
								int var35 = var5 + 2 & 3;
								if (var15.animationId == -1 && var15.transforms == null) {
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28);
							} else if (var6 == 8) {
								var29 = 8;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (var30 != 0L) {
									var29 = AttackOption.getObjectDefinition(class6.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3;
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field1098[var5], var29 * Tiles.field1094[var5], var26, var28);
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) {
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null);
					}

					if (var36 != null) {
						var41.method4008(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) {
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	}
}
