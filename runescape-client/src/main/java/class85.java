import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public enum class85 implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field1089(0, -1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field1083(1, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field1084(2, 7),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field1092(3, 8),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field1086(4, 9);

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	static Widget field1091;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1980862443
	)
	final int field1087;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 131803117
	)
	final int field1090;

	class85(int var3, int var4) {
		this.field1087 = var3; // L: 20
		this.field1090 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1090; // L: 26
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;I)Z",
		garbageValue = "-473707369"
	)
	public static boolean method2337(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1; // L: 44
		if (!var0.isFullyLoaded()) { // L: 45
			return false; // L: 46
		} else {
			class361.WorldMapElement_count = var0.getGroupFileCount(35); // L: 48
			GrandExchangeOfferNameComparator.WorldMapElement_cached = new WorldMapElement[class361.WorldMapElement_count]; // L: 49

			for (int var2 = 0; var2 < class361.WorldMapElement_count; ++var2) { // L: 50
				byte[] var3 = var0.takeFile(35, var2); // L: 51
				GrandExchangeOfferNameComparator.WorldMapElement_cached[var2] = new WorldMapElement(var2); // L: 52
				if (var3 != null) { // L: 53
					GrandExchangeOfferNameComparator.WorldMapElement_cached[var2].decode(new Buffer(var3)); // L: 54
					GrandExchangeOfferNameComparator.WorldMapElement_cached[var2].method3602(); // L: 55
				}
			}

			return true;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lge;",
		garbageValue = "-224639764"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 57
		if (var1 != null) { // L: 58
			return var1; // L: 59
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 61
			var1 = new SequenceDefinition(); // L: 62
			if (var2 != null) { // L: 63
				var1.decode(new Buffer(var2)); // L: 64
			}

			var1.postDecode(); // L: 66
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 67
			return var1; // L: 68
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lru;I)V",
		garbageValue = "2050951825"
	)
	static final void method2328(PacketBuffer var0) {
		int var1 = 0; // L: 89
		var0.importIndex(); // L: 90

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 91
			var5 = Players.Players_indices[var2]; // L: 92
			if ((Players.field1353[var5] & 1) == 0) { // L: 93
				if (var1 > 0) { // L: 94
					--var1; // L: 95
					var10000 = Players.field1353; // L: 96
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 99
					if (var4 == 0) { // L: 100
						var1 = ArchiveLoader.method2283(var0); // L: 101
						var10000 = Players.field1353; // L: 102
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						class137.readPlayerUpdate(var0, var5); // L: 105
					}
				}
			}
		}

		var0.exportIndex(); // L: 108
		if (var1 != 0) { // L: 109
			throw new RuntimeException(); // L: 110
		} else {
			var0.importIndex(); // L: 112

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 113
				var5 = Players.Players_indices[var2]; // L: 114
				if ((Players.field1353[var5] & 1) != 0) { // L: 115
					if (var1 > 0) { // L: 116
						--var1; // L: 117
						var10000 = Players.field1353; // L: 118
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 121
						if (var4 == 0) { // L: 122
							var1 = ArchiveLoader.method2283(var0); // L: 123
							var10000 = Players.field1353; // L: 124
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							class137.readPlayerUpdate(var0, var5); // L: 127
						}
					}
				}
			}

			var0.exportIndex(); // L: 130
			if (var1 != 0) { // L: 131
				throw new RuntimeException(); // L: 132
			} else {
				var0.importIndex(); // L: 134

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 135
					var5 = Players.Players_emptyIndices[var2]; // L: 136
					if ((Players.field1353[var5] & 1) != 0) { // L: 137
						if (var1 > 0) { // L: 138
							--var1; // L: 139
							var10000 = Players.field1353; // L: 140
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 143
							if (var4 == 0) { // L: 144
								var1 = ArchiveLoader.method2283(var0); // L: 145
								var10000 = Players.field1353; // L: 146
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (class285.updateExternalPlayer(var0, var5)) { // L: 149
								var10000 = Players.field1353;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 152
				if (var1 != 0) { // L: 153
					throw new RuntimeException(); // L: 154
				} else {
					var0.importIndex(); // L: 156

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 157
						var5 = Players.Players_emptyIndices[var2]; // L: 158
						if ((Players.field1353[var5] & 1) == 0) { // L: 159
							if (var1 > 0) { // L: 160
								--var1; // L: 161
								var10000 = Players.field1353; // L: 162
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 165
								if (var4 == 0) { // L: 166
									var1 = ArchiveLoader.method2283(var0); // L: 167
									var10000 = Players.field1353; // L: 168
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (class285.updateExternalPlayer(var0, var5)) { // L: 171
									var10000 = Players.field1353;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 174
					if (var1 != 0) { // L: 175
						throw new RuntimeException(); // L: 176
					} else {
						Players.Players_count = 0; // L: 178
						Players.Players_emptyIdxCount = 0; // L: 179

						for (var2 = 1; var2 < 2048; ++var2) { // L: 180
							var10000 = Players.field1353;
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2];
							if (var3 != null) { // L: 183
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 184
							}
						}

					}
				}
			}
		}
	} // L: 186

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1902403336"
	)
	public static void method2339() {
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 181
	} // L: 182

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "([Lkz;IIIIIIII)V",
		garbageValue = "1937534206"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11899
			Widget var9 = var0[var8]; // L: 11900
			if (var9 != null && var9.parentId == var1 && (var9.method6209() || class173.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11901 11902 11903
				if (var9.isIf3) { // L: 11904
					if (class160.isComponentHidden(var9)) { // L: 11905
						continue;
					}
				} else if (var9.type == 0 && var9 != class25.mousedOverWidgetIf1 && class160.isComponentHidden(var9)) { // L: 11908
					continue;
				}

				if (var9.type == 11) { // L: 11910
					if (var9.method6222(class245.urlRequester)) { // L: 11911
						if (var9.method6351()) { // L: 11912
							LoginScreenAnimation.invalidateWidget(var9); // L: 11913
							AbstractWorldMapData.revalidateWidgetScroll(var9.children, var9, true); // L: 11914
						}

						if (var9.field3680 != null) { // L: 11916
							ScriptEvent var10 = new ScriptEvent(); // L: 11917
							var10.widget = var9; // L: 11918
							var10.args = var9.field3680; // L: 11919
							Client.scriptEvents.addFirst(var10); // L: 11920
						}
					}
				} else if (var9.type == 12 && var9.method6339()) { // L: 11924 11925
					LoginScreenAnimation.invalidateWidget(var9); // L: 11926
				}

				int var26 = var9.x + var6; // L: 11929
				int var11 = var7 + var9.y; // L: 11930
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 11935
					var12 = var2; // L: 11936
					var13 = var3; // L: 11937
					var14 = var4; // L: 11938
					var15 = var5; // L: 11939
				} else {
					int var16;
					if (var9.type == 9) { // L: 11941
						var16 = var26; // L: 11942
						var17 = var11; // L: 11943
						var18 = var26 + var9.width; // L: 11944
						int var19 = var11 + var9.height; // L: 11945
						if (var18 < var26) { // L: 11946
							var16 = var18; // L: 11948
							var18 = var26; // L: 11949
						}

						if (var19 < var11) { // L: 11951
							var17 = var19; // L: 11953
							var19 = var11; // L: 11954
						}

						++var18; // L: 11956
						++var19; // L: 11957
						var12 = var16 > var2 ? var16 : var2; // L: 11958
						var13 = var17 > var3 ? var17 : var3; // L: 11959
						var14 = var18 < var4 ? var18 : var4; // L: 11960
						var15 = var19 < var5 ? var19 : var5; // L: 11961
					} else {
						var16 = var26 + var9.width; // L: 11964
						var17 = var11 + var9.height; // L: 11965
						var12 = var26 > var2 ? var26 : var2; // L: 11966
						var13 = var11 > var3 ? var11 : var3; // L: 11967
						var14 = var16 < var4 ? var16 : var4; // L: 11968
						var15 = var17 < var5 ? var17 : var5; // L: 11969
					}
				}

				if (var9 == Client.clickedWidget) { // L: 11971
					Client.field695 = true; // L: 11972
					Client.field735 = var26; // L: 11973
					Client.field554 = var11; // L: 11974
				}

				boolean var34 = false; // L: 11976
				if (var9.field3631) { // L: 11977
					switch(Client.field798) { // L: 11978
					case 0:
						var34 = true; // L: 11990
					case 1:
					default:
						break;
					case 2:
						if (Client.field677 == var9.id >>> 16) { // L: 11985
							var34 = true; // L: 11986
						}
						break;
					case 3:
						if (var9.id == Client.field677) { // L: 11980
							var34 = true; // L: 11981
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11994
					if (var9.isIf3) { // L: 11995
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11996
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11997
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11998
									if (var27.isMouseInputEvent) { // L: 11999
										var27.remove(); // L: 12000
										var27.widget.containsMouse = false; // L: 12001
									}
								}

								class308.method6192(); // L: 12004
								if (class27.widgetDragDuration == 0) { // L: 12005
									Client.clickedWidget = null; // L: 12006
									Client.clickedWidgetParent = null; // L: 12007
								}

								if (!Client.isMenuOpen) { // L: 12009
									class174.addCancelMenuEntry(); // L: 12010
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 12014 12015
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 12016
								if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) { // L: 12017
									var27.remove(); // L: 12018
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 12024
					var18 = MouseHandler.MouseHandler_y; // L: 12025
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 12026
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 12027
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 12028
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 12030
					if (var9.contentType == 1337) { // L: 12031
						if (!Client.isLoading && !Client.isMenuOpen && var35) { // L: 12032
							MouseRecorder.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 12035
						Frames.checkIfMinimapClicked(var9, var26, var11); // L: 12036
					} else {
						if (var9.contentType == 1400) { // L: 12039
							GrandExchangeOfferUnitPriceComparator.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 12040
						}

						if (!Client.isMenuOpen && var35) { // L: 12042
							if (var9.contentType == 1400) { // L: 12043
								GrandExchangeOfferUnitPriceComparator.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 12044
							} else {
								class103.Widget_addToMenu(var9, var17 - var26, var18 - var11); // L: 12047
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 12050
							for (int var20 = 0; var20 < var9.field3632.length; ++var20) { // L: 12051
								var21 = false; // L: 12052
								boolean var28 = false; // L: 12053
								if (!var21 && var9.field3632[var20] != null) { // L: 12054
									for (var23 = 0; var23 < var9.field3632[var20].length; ++var23) { // L: 12055
										boolean var24 = false; // L: 12056
										if (var9.field3594 != null) { // L: 12057
											var24 = Client.field702.method4143(var9.field3632[var20][var23]); // L: 12058
										}

										if (EnumComposition.method3710(var9.field3632[var20][var23]) || var24) { // L: 12060
											var21 = true; // L: 12061
											if (var9.field3594 != null && var9.field3594[var20] > Client.cycle) { // L: 12062
												break;
											}

											byte var33 = var9.field3633[var20][var23]; // L: 12063
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field702.method4143(86) && !Client.field702.method4143(82) && !Client.field702.method4143(81)) && ((var33 & 2) == 0 || Client.field702.method4143(86)) && ((var33 & 1) == 0 || Client.field702.method4143(82)) && ((var33 & 4) == 0 || Client.field702.method4143(81))) { // L: 12064 12065 12066 12067 12068
												var28 = true; // L: 12070
												break;
											}
										}
									}
								}

								if (var28) { // L: 12076
									if (var20 < 10) { // L: 12077
										class16.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 12078
										class18.Widget_runOnTargetLeave(); // L: 12079
										ClanChannel.selectSpell(var9.id, var9.childIndex, MenuAction.Widget_unpackTargetMask(class173.getWidgetFlags(var9)), var9.itemId); // L: 12080
										Client.selectedSpellActionName = class317.Widget_getSpellActionName(var9); // L: 12081
										if (Client.selectedSpellActionName == null) { // L: 12082
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class149.colorStartTag(16777215); // L: 12083
									}

									var23 = var9.field3634[var20]; // L: 12085
									if (var9.field3594 == null) { // L: 12086
										var9.field3594 = new int[var9.field3632.length];
									}

									if (var9.field3635 == null) { // L: 12087
										var9.field3635 = new int[var9.field3632.length];
									}

									if (var23 != 0) { // L: 12088
										if (var9.field3594[var20] == 0) { // L: 12089
											var9.field3594[var20] = var23 + Client.cycle + var9.field3635[var20];
										} else {
											var9.field3594[var20] = var23 + Client.cycle; // L: 12090
										}
									} else {
										var9.field3594[var20] = Integer.MAX_VALUE; // L: 12092
									}
								}

								if (!var21 && var9.field3594 != null) { // L: 12094 12095
									var9.field3594[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 12099
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 12100
								var35 = true;
							} else {
								var35 = false; // L: 12101
							}

							boolean var36 = false; // L: 12102
							if ((MouseHandler.MouseHandler_currentButton == 1 || !FriendsChatMember.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 12103
								var36 = true;
							}

							var21 = false; // L: 12104
							if ((MouseHandler.MouseHandler_lastButton == 1 || !FriendsChatMember.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 12105
								var21 = true;
							}

							if (var21) { // L: 12106
								UserComparator9.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 12107
							}

							if (var9.method6210()) { // L: 12109
								if (var21) { // L: 12110
									Client.field721.addFirst(new class204(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 12111
								}

								if (var36) { // L: 12113
									Client.field721.addFirst(new class204(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 12114
								}
							}

							if (var9.contentType == 1400) { // L: 12117
								GrandExchangeOfferUnitPriceComparator.worldMap.method8115(var17, var18, var35 & var36, var35 & var21); // L: 12118
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && AbstractArchive.method6619(class173.getWidgetFlags(var9))) { // L: 12120
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 12121
								Client.field692 = true; // L: 12122
								Client.field795 = var26; // L: 12123
								Client.field803 = var11; // L: 12124
							}

							if (var9.hasListener) { // L: 12126
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 12127
									var22 = new ScriptEvent(); // L: 12128
									var22.isMouseInputEvent = true; // L: 12129
									var22.widget = var9; // L: 12130
									var22.mouseY = Client.mouseWheelRotation; // L: 12131
									var22.args = var9.onScroll; // L: 12132
									Client.scriptEvents.addFirst(var22); // L: 12133
								}

								if (Client.clickedWidget != null || WorldMapLabelSize.dragInventoryWidget != null || Client.isMenuOpen) { // L: 12135
									var21 = false; // L: 12136
									var36 = false; // L: 12137
									var35 = false; // L: 12138
								}

								if (!var9.field3674 && var21) { // L: 12140
									var9.field3674 = true; // L: 12141
									if (var9.onClick != null) { // L: 12142
										var22 = new ScriptEvent(); // L: 12143
										var22.isMouseInputEvent = true; // L: 12144
										var22.widget = var9; // L: 12145
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 12146
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 12147
										var22.args = var9.onClick; // L: 12148
										Client.scriptEvents.addFirst(var22); // L: 12149
									}
								}

								if (var9.field3674 && var36 && var9.onClickRepeat != null) { // L: 12152 12153
									var22 = new ScriptEvent(); // L: 12154
									var22.isMouseInputEvent = true; // L: 12155
									var22.widget = var9; // L: 12156
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 12157
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 12158
									var22.args = var9.onClickRepeat; // L: 12159
									Client.scriptEvents.addFirst(var22); // L: 12160
								}

								if (var9.field3674 && !var36) { // L: 12163
									var9.field3674 = false; // L: 12164
									if (var9.onRelease != null) { // L: 12165
										var22 = new ScriptEvent(); // L: 12166
										var22.isMouseInputEvent = true; // L: 12167
										var22.widget = var9; // L: 12168
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 12169
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 12170
										var22.args = var9.onRelease; // L: 12171
										Client.field720.addFirst(var22); // L: 12172
									}
								}

								if (var36 && var9.onHold != null) { // L: 12175 12176
									var22 = new ScriptEvent(); // L: 12177
									var22.isMouseInputEvent = true; // L: 12178
									var22.widget = var9; // L: 12179
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 12180
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 12181
									var22.args = var9.onHold; // L: 12182
									Client.scriptEvents.addFirst(var22); // L: 12183
								}

								if (!var9.containsMouse && var35) { // L: 12186
									var9.containsMouse = true; // L: 12187
									if (var9.onMouseOver != null) { // L: 12188
										var22 = new ScriptEvent(); // L: 12189
										var22.isMouseInputEvent = true; // L: 12190
										var22.widget = var9; // L: 12191
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 12192
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 12193
										var22.args = var9.onMouseOver; // L: 12194
										Client.scriptEvents.addFirst(var22); // L: 12195
									}
								}

								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) { // L: 12198 12199
									var22 = new ScriptEvent(); // L: 12200
									var22.isMouseInputEvent = true; // L: 12201
									var22.widget = var9; // L: 12202
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 12203
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 12204
									var22.args = var9.onMouseRepeat; // L: 12205
									Client.scriptEvents.addFirst(var22); // L: 12206
								}

								if (var9.containsMouse && !var35) { // L: 12209
									var9.containsMouse = false; // L: 12210
									if (var9.onMouseLeave != null) { // L: 12211
										var22 = new ScriptEvent(); // L: 12212
										var22.isMouseInputEvent = true; // L: 12213
										var22.widget = var9; // L: 12214
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 12215
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 12216
										var22.args = var9.onMouseLeave; // L: 12217
										Client.field720.addFirst(var22); // L: 12218
									}
								}

								if (var9.onTimer != null) { // L: 12221
									var22 = new ScriptEvent(); // L: 12222
									var22.widget = var9; // L: 12223
									var22.args = var9.onTimer; // L: 12224
									Client.field768.addFirst(var22); // L: 12225
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field504 > var9.field3697) { // L: 12227
									if (var9.varTransmitTriggers != null && Client.field504 - var9.field3697 <= 32) { // L: 12228
										label844:
										for (var39 = var9.field3697; var39 < Client.field504; ++var39) { // L: 12235
											var23 = Client.field700[var39 & 31]; // L: 12236

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 12237
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 12238
													var25 = new ScriptEvent(); // L: 12239
													var25.widget = var9; // L: 12240
													var25.args = var9.onVarTransmit; // L: 12241
													Client.scriptEvents.addFirst(var25); // L: 12242
													break label844; // L: 12243
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 12229
										var22.widget = var9; // L: 12230
										var22.args = var9.onVarTransmit; // L: 12231
										Client.scriptEvents.addFirst(var22); // L: 12232
									}

									var9.field3697 = Client.field504; // L: 12248
								}

								if (var9.onInvTransmit != null && Client.field524 > var9.field3698) { // L: 12250
									if (var9.invTransmitTriggers != null && Client.field524 - var9.field3698 <= 32) { // L: 12251
										label820:
										for (var39 = var9.field3698; var39 < Client.field524; ++var39) { // L: 12258
											var23 = Client.field661[var39 & 31]; // L: 12259

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 12260
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 12261
													var25 = new ScriptEvent(); // L: 12262
													var25.widget = var9; // L: 12263
													var25.args = var9.onInvTransmit; // L: 12264
													Client.scriptEvents.addFirst(var25); // L: 12265
													break label820; // L: 12266
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 12252
										var22.widget = var9; // L: 12253
										var22.args = var9.onInvTransmit; // L: 12254
										Client.scriptEvents.addFirst(var22); // L: 12255
									}

									var9.field3698 = Client.field524; // L: 12271
								}

								if (var9.onStatTransmit != null && Client.field705 > var9.field3699) { // L: 12273
									if (var9.statTransmitTriggers != null && Client.field705 - var9.field3699 <= 32) { // L: 12274
										label796:
										for (var39 = var9.field3699; var39 < Client.field705; ++var39) { // L: 12281
											var23 = Client.field704[var39 & 31]; // L: 12282

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 12283
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 12284
													var25 = new ScriptEvent(); // L: 12285
													var25.widget = var9; // L: 12286
													var25.args = var9.onStatTransmit; // L: 12287
													Client.scriptEvents.addFirst(var25); // L: 12288
													break label796; // L: 12289
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 12275
										var22.widget = var9; // L: 12276
										var22.args = var9.onStatTransmit; // L: 12277
										Client.scriptEvents.addFirst(var22); // L: 12278
									}

									var9.field3699 = Client.field705; // L: 12294
								}

								if (Client.chatCycle > var9.field3696 && var9.onChatTransmit != null) { // L: 12296
									var22 = new ScriptEvent(); // L: 12297
									var22.widget = var9; // L: 12298
									var22.args = var9.onChatTransmit; // L: 12299
									Client.scriptEvents.addFirst(var22); // L: 12300
								}

								if (Client.field709 > var9.field3696 && var9.onFriendTransmit != null) { // L: 12302
									var22 = new ScriptEvent(); // L: 12303
									var22.widget = var9; // L: 12304
									var22.args = var9.onFriendTransmit; // L: 12305
									Client.scriptEvents.addFirst(var22); // L: 12306
								}

								if (Client.field637 > var9.field3696 && var9.onClanTransmit != null) { // L: 12308
									var22 = new ScriptEvent(); // L: 12309
									var22.widget = var9; // L: 12310
									var22.args = var9.onClanTransmit; // L: 12311
									Client.scriptEvents.addFirst(var22); // L: 12312
								}

								if (Client.field694 > var9.field3696 && var9.field3672 != null) { // L: 12314
									var22 = new ScriptEvent(); // L: 12315
									var22.widget = var9; // L: 12316
									var22.args = var9.field3672; // L: 12317
									Client.scriptEvents.addFirst(var22); // L: 12318
								}

								if (Client.field693 > var9.field3696 && var9.field3673 != null) { // L: 12320
									var22 = new ScriptEvent(); // L: 12321
									var22.widget = var9; // L: 12322
									var22.args = var9.field3673; // L: 12323
									Client.scriptEvents.addFirst(var22); // L: 12324
								}

								if (Client.field713 > var9.field3696 && var9.onStockTransmit != null) { // L: 12326
									var22 = new ScriptEvent(); // L: 12327
									var22.widget = var9; // L: 12328
									var22.args = var9.onStockTransmit; // L: 12329
									Client.scriptEvents.addFirst(var22); // L: 12330
								}

								if (Client.field804 > var9.field3696 && var9.field3679 != null) { // L: 12332
									var22 = new ScriptEvent(); // L: 12333
									var22.widget = var9; // L: 12334
									var22.args = var9.field3679; // L: 12335
									Client.scriptEvents.addFirst(var22); // L: 12336
								}

								if (Client.field761 > var9.field3696 && var9.onMiscTransmit != null) { // L: 12338
									var22 = new ScriptEvent(); // L: 12339
									var22.widget = var9; // L: 12340
									var22.args = var9.onMiscTransmit; // L: 12341
									Client.scriptEvents.addFirst(var22); // L: 12342
								}

								var9.field3696 = Client.cycleCntr; // L: 12344
								if (var9.onKey != null) { // L: 12345
									for (var39 = 0; var39 < Client.field759; ++var39) { // L: 12346
										ScriptEvent var32 = new ScriptEvent(); // L: 12347
										var32.widget = var9; // L: 12348
										var32.keyTyped = Client.field745[var39]; // L: 12349
										var32.keyPressed = Client.field753[var39]; // L: 12350
										var32.args = var9.onKey; // L: 12351
										Client.scriptEvents.addFirst(var32); // L: 12352
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3604 != null) { // L: 12355
									var38 = Client.field702.method4177(); // L: 12356

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 12357
										var31 = new ScriptEvent(); // L: 12358
										var31.widget = var9; // L: 12359
										var31.keyTyped = var38[var23]; // L: 12360
										var31.args = var9.field3604; // L: 12361
										Client.scriptEvents.addFirst(var31); // L: 12362
									}
								}

								if (var9.field3669 != null) { // L: 12365
									var38 = Client.field702.method4145(); // L: 12366

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 12367
										var31 = new ScriptEvent(); // L: 12368
										var31.widget = var9; // L: 12369
										var31.keyTyped = var38[var23]; // L: 12370
										var31.args = var9.field3669; // L: 12371
										Client.scriptEvents.addFirst(var31); // L: 12372
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 12377
							if (Client.clickedWidget != null || WorldMapLabelSize.dragInventoryWidget != null || Client.isMenuOpen) { // L: 12378
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 12379
								if (var9.mouseOverRedirect >= 0) { // L: 12380
									class25.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class25.mousedOverWidgetIf1 = var9; // L: 12381
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 12383
								class18.field102 = var9; // L: 12384
							}

							if (var9.scrollHeight > var9.height) { // L: 12386
								World.method1791(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 12388
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 12389
							if (var9.children != null) { // L: 12390
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 12391
							if (var29 != null) { // L: 12392
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 12393
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 12394
										if (var30.isMouseInputEvent) { // L: 12395
											var30.remove(); // L: 12396
											var30.widget.containsMouse = false; // L: 12397
										}
									}

									if (class27.widgetDragDuration == 0) { // L: 12400
										Client.clickedWidget = null; // L: 12401
										Client.clickedWidgetParent = null; // L: 12402
									}

									if (!Client.isMenuOpen) { // L: 12404
										class174.addCancelMenuEntry(); // L: 12405
									}
								}

								class144.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11); // L: 12408
							}
						}
					}
				}
			}
		}

	} // L: 12412
}
