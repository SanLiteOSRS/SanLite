import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
public final class class52 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(II)Llw;",
		garbageValue = "1066778190"
	)
	public static PrivateChatMode method840(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field3834, PrivateChatMode.field3833, PrivateChatMode.field3832};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field3835) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-677680032"
	)
	public static boolean method844(int var0) {
		return (var0 >> 30 & 1) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "2036711787"
	)
	static int method845(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = GameObject.Client_plane;
			int var9 = NetFileRequest.baseX * 64 + (PlayerComposition.localPlayer.x >> 7);
			int var5 = class41.baseY * 64 + (PlayerComposition.localPlayer.y >> 7);
			Actor.getWorldMap().method6370(var3, var9, var5, true);
			return 1;
		} else {
			WorldMapArea var11;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				String var16 = "";
				var11 = Actor.getWorldMap().getMapArea(var3);
				if (var11 != null) {
					var16 = var11.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				Actor.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				Actor.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var15;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
					Actor.getWorldMap().setWorldMapPositionTarget(var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
					Actor.getWorldMap().setWorldMapPositionTargetInstant(var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
					Actor.getWorldMap().jumpToSourceCoord(var15.plane, var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
					Actor.getWorldMap().jumpToSourceCoordInstant(var15.plane, var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var13;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						var13 = Actor.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var13.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						var13 = Actor.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (var13.getRegionHighX() - var13.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (var13.getRegionHighY() - var13.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						var13 = Actor.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var13.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var13.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var13.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var13.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						var13 = Actor.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var13.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var15 = Actor.getWorldMap().getDisplayCoord();
						if (var15 == null) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var15.x;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var15.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var15 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
						var13 = Actor.getWorldMap().getCurrentMapArea();
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var14 = var13.position(var15.plane, var15.x, var15.y);
							if (var14 == null) {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var14[0];
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var14[1];
							}

							return 1;
						}
					} else {
						Coord var7;
						if (var0 == 6618) {
							var15 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
							var13 = Actor.getWorldMap().getCurrentMapArea();
							if (var13 == null) {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var7 = var13.coord(var15.x, var15.y);
								if (var7 == null) {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.packed();
								}

								return 1;
							}
						} else {
							Coord var12;
							if (var0 == 6619) {
								VarcInt.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]);
								class204.method3721(var3, var12, false);
								return 1;
							} else if (var0 == 6620) {
								VarcInt.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]);
								class204.method3721(var3, var12, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								VarcInt.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]);
								var11 = Actor.getWorldMap().getMapArea(var3);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.containsCoord(var12.plane, var12.x, var12.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var15 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
								var13 = Actor.getWorldMap().mapAreaAtCoord(var15.plane, var15.x, var15.y);
								if (var13 == null) {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var13.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								Actor.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								Actor.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								Actor.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								Actor.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var10;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
									Actor.getWorldMap().setPerpetualFlash(var10);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
									Actor.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
									Actor.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									Actor.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
									Actor.getWorldMap().setElementsDisabled(var10);
									return 1;
								} else {
									boolean var4;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										VarcInt.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1] == 1;
										Actor.getWorldMap().disableElement(var3, var4);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										VarcInt.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1] == 1;
										Actor.getWorldMap().setCategoryDisabled(var3, var4);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										VarcInt.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
										var12 = new Coord(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]);
										var7 = Actor.getWorldMap().method6414(var3, var12);
										if (var7 == null) {
											Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var8;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var8 = Actor.getWorldMap().iconStart();
											if (var8 == null) {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var8.getElement();
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var8.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var8 = Actor.getWorldMap().iconNext();
											if (var8 == null) {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var8.getElement();
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var8.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var6;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
												var6 = UserComparator10.WorldMapElement_get(var3);
												if (var6.name == null) {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
												var6 = UserComparator10.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
												var6 = UserComparator10.WorldMapElement_get(var3);
												if (var6 == null) {
													Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
												var6 = UserComparator10.WorldMapElement_get(var3);
												if (var6 == null) {
													Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Script.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Script.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Script.worldMapEvent.coord2.packed();
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
