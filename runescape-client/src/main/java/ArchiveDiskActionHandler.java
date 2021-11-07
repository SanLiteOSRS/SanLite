import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kg")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2039125055
	)
	public static int field3662;
	@ObfuscatedName("a")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("o")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1828605303
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field3662 = 0;
		ArchiveDiskActionHandler_lock = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3662 <= 1) {
							field3662 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						field3662 = 600;
					}
				} else {
					FloorUnderlayDefinition.method3190(100L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3662 <= 1) {
							field3662 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						--field3662;
					}
				}
			}
		} catch (Exception var13) {
			MilliClock.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "15810"
	)
	static void method5258() {
		if (Login.clearLoginScreen) {
			Login.titleboxSprite = null;
			Login.titlebuttonSprite = null;
			Login.runesSprite = null;
			RouteStrategy.leftTitleSprite = null;
			class139.rightTitleSprite = null;
			class16.logoSprite = null;
			VarpDefinition.title_muteSprite = null;
			NetSocket.options_buttons_0Sprite = null;
			class9.options_buttons_2Sprite = null;
			DirectByteArrayCopier.worldSelectBackSprites = null;
			UserComparator7.worldSelectFlagSprites = null;
			class54.worldSelectArrows = null;
			KeyHandler.worldSelectStars = null;
			class12.field54 = null;
			Login.loginScreenRunesAnimation.method2193();
			class247.musicPlayerStatus = 1;
			class128.musicTrackArchive = null;
			class411.musicTrackGroupId = -1;
			musicTrackFileId = -1;
			class247.musicTrackVolume = 0;
			SecureRandomCallable.musicTrackBoolean = false;
			class247.pcmSampleLength = 2;
			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var0 = new Buffer(4);
					var0.writeByte(2);
					var0.writeMedium(0);
					NetCache.NetCache_socket.write(var0.array, 0, 4);
				} catch (IOException var3) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var2) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-146684783"
	)
	static int method5257(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
			int var15 = class19.baseX * 64 + (HealthBarDefinition.localPlayer.x >> 7);
			int var8 = DefaultsGroup.baseY * 64 + (HealthBarDefinition.localPlayer.y >> 7);
			class54.getWorldMap().method6497(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				String var16 = "";
				var9 = class54.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				class54.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				class54.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
					class54.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
					class54.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
					class54.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
					class54.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var11 = class54.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var11 = class54.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var11 = class54.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var11 = class54.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = class54.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
						var11 = class54.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
							var11 = class54.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								class14.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]);
								class16.method219(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								class14.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]);
								class16.method219(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								class14.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]);
								var9 = class54.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
								var11 = class54.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								class54.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								class54.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								class54.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								class54.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
									class54.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
									class54.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
									class54.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									class54.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
									class54.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										class14.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1] == 1;
										class54.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										class14.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1] == 1;
										class54.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class14.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]);
										var5 = class54.getWorldMap().method6666(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = class54.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = class54.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
												var4 = ItemComposition.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
												var4 = ItemComposition.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
												var4 = ItemComposition.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
												var4 = ItemComposition.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class7.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class7.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class7.worldMapEvent.coord2.packed();
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
