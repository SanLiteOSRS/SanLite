import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kg")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3701("", 0, new class287[]{class287.field3673}),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3690("", 1, new class287[]{class287.field3671, class287.field3673}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3691("", 2, new class287[]{class287.field3671, class287.field3672, class287.field3673}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3692("", 3, new class287[]{class287.field3671}),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3697("", 4),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3694("", 5, new class287[]{class287.field3671, class287.field3673}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3695("", 6, new class287[]{class287.field3673}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3696("", 8, new class287[]{class287.field3671, class287.field3673}),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3693("", 9, new class287[]{class287.field3671, class287.field3672}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3698("", 10, new class287[]{class287.field3671}),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3699("", 11, new class287[]{class287.field3671}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3700("", 12, new class287[]{class287.field3671, class287.field3673}),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3704("", 13, new class287[]{class287.field3671});

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1725478607
	)
	@Export("id")
	final int id;
	@ObfuscatedName("g")
	final Set field3703;

	static {
		method5289();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lkc;)V"
	)
	ModeWhere(String var3, int var4, class287[] var5) {
		this.field3703 = new HashSet();
		this.id = var4;
		class287[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class287 var8 = var6[var7];
			this.field3703.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field3703 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Ljava/lang/String;I)I",
		garbageValue = "-1585565275"
	)
	public static int method5292(Buffer var0, String var1) {
		int var2 = var0.offset;
		int var4 = var1.length();
		byte[] var5 = new byte[var4];

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var1.charAt(var6);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) {
				var5[var6] = -128;
			} else if (var7 == 8218) {
				var5[var6] = -126;
			} else if (var7 == 402) {
				var5[var6] = -125;
			} else if (var7 == 8222) {
				var5[var6] = -124;
			} else if (var7 == 8230) {
				var5[var6] = -123;
			} else if (var7 == 8224) {
				var5[var6] = -122;
			} else if (var7 == 8225) {
				var5[var6] = -121;
			} else if (var7 == 710) {
				var5[var6] = -120;
			} else if (var7 == 8240) {
				var5[var6] = -119;
			} else if (var7 == 352) {
				var5[var6] = -118;
			} else if (var7 == 8249) {
				var5[var6] = -117;
			} else if (var7 == 338) {
				var5[var6] = -116;
			} else if (var7 == 381) {
				var5[var6] = -114;
			} else if (var7 == 8216) {
				var5[var6] = -111;
			} else if (var7 == 8217) {
				var5[var6] = -110;
			} else if (var7 == 8220) {
				var5[var6] = -109;
			} else if (var7 == 8221) {
				var5[var6] = -108;
			} else if (var7 == 8226) {
				var5[var6] = -107;
			} else if (var7 == 8211) {
				var5[var6] = -106;
			} else if (var7 == 8212) {
				var5[var6] = -105;
			} else if (var7 == 732) {
				var5[var6] = -104;
			} else if (var7 == 8482) {
				var5[var6] = -103;
			} else if (var7 == 353) {
				var5[var6] = -102;
			} else if (var7 == 8250) {
				var5[var6] = -101;
			} else if (var7 == 339) {
				var5[var6] = -100;
			} else if (var7 == 382) {
				var5[var6] = -98;
			} else if (var7 == 376) {
				var5[var6] = -97;
			} else {
				var5[var6] = 63;
			}
		}

		var0.writeSmartByteShort(var5.length);
		var0.offset += class250.huffman.compress(var5, 0, var5.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkg;",
		garbageValue = "1172185177"
	)
	static ModeWhere[] method5289() {
		return new ModeWhere[]{field3701, field3693, field3696, field3699, field3694, field3704, field3691, field3690, field3700, field3695, field3698, field3692, field3697};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-963755121"
	)
	static int method5283(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = SoundSystem.Client_plane;
			int var15 = class15.baseX * 64 + (class262.localPlayer.x >> 7);
			int var8 = WorldMapSprite.baseY * 64 + (class262.localPlayer.y >> 7);
			BZip2State.getWorldMap().method6287(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				String var16 = "";
				var9 = BZip2State.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				BZip2State.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				BZip2State.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
					BZip2State.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
					BZip2State.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
					BZip2State.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
					BZip2State.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						var11 = BZip2State.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						var11 = BZip2State.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						var11 = BZip2State.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						var11 = BZip2State.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = BZip2State.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
						var11 = BZip2State.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
							var11 = BZip2State.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								ChatChannel.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]);
								Canvas.method497(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								ChatChannel.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]);
								Canvas.method497(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								ChatChannel.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]);
								var9 = BZip2State.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
								var11 = BZip2State.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								BZip2State.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								BZip2State.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								BZip2State.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								BZip2State.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
									BZip2State.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
									BZip2State.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
									BZip2State.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									BZip2State.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
									BZip2State.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										ChatChannel.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1] == 1;
										BZip2State.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										ChatChannel.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1] == 1;
										BZip2State.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										ChatChannel.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]);
										var5 = BZip2State.getWorldMap().method6184(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = BZip2State.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = BZip2State.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
												var4 = Archive.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
												var4 = Archive.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
												var4 = Archive.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
												var4 = Archive.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Occluder.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Occluder.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Occluder.worldMapEvent.coord2.packed();
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
