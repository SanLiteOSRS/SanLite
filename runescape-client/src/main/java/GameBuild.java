import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jk")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("p")
	@Export("name")
	public final String name;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 629900867
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "4"
	)
	static int method4843(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class22.Client_plane;
			int var15 = VertexNormal.baseX * 64 + (class93.localPlayer.x >> 7);
			int var8 = SoundSystem.baseY * 64 + (class93.localPlayer.y >> 7);
			HealthBarUpdate.getWorldMap().method6110(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				String var16 = "";
				var9 = HealthBarUpdate.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				HealthBarUpdate.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				HealthBarUpdate.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
					HealthBarUpdate.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
					HealthBarUpdate.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
					HealthBarUpdate.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
					HealthBarUpdate.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
						var11 = HealthBarUpdate.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
						var11 = HealthBarUpdate.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
						var11 = HealthBarUpdate.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
						var11 = HealthBarUpdate.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = HealthBarUpdate.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
						var11 = HealthBarUpdate.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
							var11 = HealthBarUpdate.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								class44.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]);
								Skeleton.method3922(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								class44.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]);
								Skeleton.method3922(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								class44.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]);
								var9 = HealthBarUpdate.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
								var11 = HealthBarUpdate.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								HealthBarUpdate.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								HealthBarUpdate.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								HealthBarUpdate.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								HealthBarUpdate.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
									HealthBarUpdate.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
									HealthBarUpdate.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
									HealthBarUpdate.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									HealthBarUpdate.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
									HealthBarUpdate.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										class44.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1] == 1;
										HealthBarUpdate.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										class44.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1] == 1;
										HealthBarUpdate.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class44.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]);
										var5 = HealthBarUpdate.getWorldMap().method6153(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = HealthBarUpdate.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = HealthBarUpdate.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
												var4 = class6.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
												var4 = class6.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
												var4 = class6.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
												var4 = class6.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class69.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class69.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class69.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
