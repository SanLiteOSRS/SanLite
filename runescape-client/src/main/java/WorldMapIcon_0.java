import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1286160069
	)
	@Export("element")
	final int element;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lai;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1200101821
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1527714453
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		signature = "(Lhw;Lhw;ILai;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = class194.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "24"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)Lai;",
		garbageValue = "-669051823"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1627026836"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "190840278"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "104"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)Lii;",
		garbageValue = "55"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2085091146"
	)
	public static void method297() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		signature = "(IIIIIIII)V",
		garbageValue = "-1229271771"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != GrandExchangeOfferUnitPriceComparator.Client_plane) {
				return;
			}

			long var7 = 0L;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = ModeWhere.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var7 = ModeWhere.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var7 = ModeWhere.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var7 = ModeWhere.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) {
				var12 = ModeWhere.scene.getObjectFlags(var0, var2, var3, var7);
				int var39 = ObjectSound.Entity_unpackID(var7);
				int var40 = var12 & 31;
				int var41 = var12 >> 6 & 3;
				ObjectComposition var13;
				if (var1 == 0) {
					ModeWhere.scene.removeBoundaryObject(var0, var2, var3);
					var13 = ScriptEvent.getObjectDefinition(var39);
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].method3688(var2, var3, var40, var41, var13.boolean1);
					}
				}

				if (var1 == 1) {
					ModeWhere.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					ModeWhere.scene.removeGameObjectForTile(var0, var2, var3);
					var13 = ScriptEvent.getObjectDefinition(var39);
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) {
						return;
					}

					if (var13.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var41, var13.boolean1);
					}
				}

				if (var1 == 3) {
					ModeWhere.scene.removeFloorDecoration(var0, var2, var3);
					var13 = ScriptEvent.getObjectDefinition(var39);
					if (var13.interactType == 1) {
						Client.collisionMaps[var0].method3691(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var12 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var12 = var0 + 1;
				}

				Scene var42 = ModeWhere.scene;
				CollisionMap var14 = Client.collisionMaps[var0];
				ObjectComposition var15 = ScriptEvent.getObjectDefinition(var4);
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
				int var23 = var22[var19][var20] + var22[var18][var20] + var22[var18][var21] + var22[var19][var21] >> 2;
				int var24 = (var2 << 7) + (var16 << 6);
				int var25 = (var3 << 7) + (var17 << 6);
				long var26 = GrandExchangeOfferOwnWorldComparator.calculateTag(var2, var3, 2, var15.int1 == 0, var4);
				int var28 = (var5 << 6) + var6;
				if (var15.int3 == 1) {
					var28 += 256;
				}

				Object var29;
				if (var6 == 22) {
					if (var15.animationId == -1 && var15.transforms == null) {
						var29 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var29 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, true, (Renderable)null);
					}

					var42.newFloorDecoration(var0, var2, var3, var23, (Renderable)var29, var26, var28);
					if (var15.interactType == 1) {
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var29 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var29 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, true, (Renderable)null);
						}

						var42.method3227(var0, var2, var3, var23, 1, 1, (Renderable)var29, 0, var26, var28);
						if (var15.interactType != 0) {
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var29 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var29 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, true, (Renderable)null);
						}

						var42.newBoundaryObject(var0, var2, var3, var23, (Renderable)var29, (Renderable)null, Tiles.field533[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3683(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var29 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var29 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, true, (Renderable)null);
						}

						var42.newBoundaryObject(var0, var2, var3, var23, (Renderable)var29, (Renderable)null, Tiles.field534[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3683(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var35;
						if (var6 == 2) {
							var35 = var5 + 1 & 3;
							Object var30;
							Object var31;
							if (var15.animationId == -1 && var15.transforms == null) {
								var30 = var15.getModel(2, var5 + 4, var22, var24, var23, var25);
								var31 = var15.getModel(2, var35, var22, var24, var23, var25);
							} else {
								var30 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, true, (Renderable)null);
								var31 = new DynamicObject(var4, 2, var35, var12, var2, var3, var15.animationId, true, (Renderable)null);
							}

							var42.newBoundaryObject(var0, var2, var3, var23, (Renderable)var30, (Renderable)var31, Tiles.field533[var5], Tiles.field533[var35], var26, var28);
							if (var15.interactType != 0) {
								var14.method3683(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var29 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var29 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, true, (Renderable)null);
							}

							var42.newBoundaryObject(var0, var2, var3, var23, (Renderable)var29, (Renderable)null, Tiles.field534[var5], 0, var26, var28);
							if (var15.interactType != 0) {
								var14.method3683(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var29 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var29 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, true, (Renderable)null);
							}

							var42.method3227(var0, var2, var3, var23, 1, 1, (Renderable)var29, 0, var26, var28);
							if (var15.interactType != 0) {
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var29 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var29 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, true, (Renderable)null);
							}

							var42.newWallDecoration(var0, var2, var3, var23, (Renderable)var29, (Renderable)null, Tiles.field533[var5], 0, 0, 0, var26, var28);
						} else {
							Object var32;
							long var36;
							if (var6 == 5) {
								var35 = 16;
								var36 = var42.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var36) {
									var35 = ScriptEvent.getObjectDefinition(ObjectSound.Entity_unpackID(var36)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, true, (Renderable)null);
								}

								var42.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field533[var5], 0, var35 * Tiles.field528[var5], var35 * Tiles.field536[var5], var26, var28);
							} else if (var6 == 6) {
								var35 = 8;
								var36 = var42.getBoundaryObjectTag(var0, var2, var3);
								if (var36 != 0L) {
									var35 = ScriptEvent.getObjectDefinition(ObjectSound.Entity_unpackID(var36)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, true, (Renderable)null);
								}

								var42.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var35 * Tiles.field535[var5], var35 * Tiles.field529[var5], var26, var28);
							} else if (var6 == 7) {
								int var38 = var5 + 2 & 3;
								if (var15.animationId == -1 && var15.transforms == null) {
									var29 = var15.getModel(4, var38 + 4, var22, var24, var23, var25);
								} else {
									var29 = new DynamicObject(var4, 4, var38 + 4, var12, var2, var3, var15.animationId, true, (Renderable)null);
								}

								var42.newWallDecoration(var0, var2, var3, var23, (Renderable)var29, (Renderable)null, 256, var38, 0, 0, var26, var28);
							} else if (var6 == 8) {
								var35 = 8;
								var36 = var42.getBoundaryObjectTag(var0, var2, var3);
								if (var36 != 0L) {
									var35 = ScriptEvent.getObjectDefinition(ObjectSound.Entity_unpackID(var36)).int2 / 2;
								}

								int var34 = var5 + 2 & 3;
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, true, (Renderable)null);
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, true, (Renderable)null);
								}

								var42.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var35 * Tiles.field535[var5], var35 * Tiles.field529[var5], var26, var28);
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) {
						var29 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var29 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, true, (Renderable)null);
					}

					if (var29 != null) {
						var42.method3227(var0, var2, var3, var23, var16, var17, (Renderable)var29, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) {
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		signature = "(Lht;IIZB)V",
		garbageValue = "-45"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) {
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.height * var0.field2610 / var0.field2611;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.width * var0.field2611 / var0.field2610;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
