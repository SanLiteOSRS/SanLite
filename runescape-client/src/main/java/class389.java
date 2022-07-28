import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
public class class389 {
	@ObfuscatedName("o")
	float field4422;
	@ObfuscatedName("q")
	float field4423;
	@ObfuscatedName("f")
	float field4414;
	@ObfuscatedName("u")
	float field4418;
	@ObfuscatedName("c")
	float field4416;
	@ObfuscatedName("w")
	float field4417;
	@ObfuscatedName("z")
	float field4412;
	@ObfuscatedName("j")
	float field4419;
	@ObfuscatedName("h")
	float field4420;
	@ObfuscatedName("a")
	float field4421;
	@ObfuscatedName("d")
	float field4413;
	@ObfuscatedName("n")
	float field4415;

	static {
		new class389();
	} // L: 6

	class389() {
		this.method7060(); // L: 22
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-261547964"
	)
	void method7060() {
		this.field4415 = 0.0F; // L: 26
		this.field4413 = 0.0F; // L: 27
		this.field4421 = 0.0F; // L: 28
		this.field4419 = 0.0F; // L: 29
		this.field4412 = 0.0F; // L: 30
		this.field4417 = 0.0F; // L: 31
		this.field4418 = 0.0F; // L: 32
		this.field4414 = 0.0F; // L: 33
		this.field4423 = 0.0F; // L: 34
		this.field4420 = 1.0F; // L: 35
		this.field4416 = 1.0F; // L: 36
		this.field4422 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1340034472"
	)
	void method7061(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4423; // L: 43
		float var5 = this.field4416; // L: 44
		float var6 = this.field4419; // L: 45
		float var7 = this.field4413; // L: 46
		this.field4423 = var2 * var4 - var3 * this.field4414; // L: 47
		this.field4414 = var4 * var3 + var2 * this.field4414; // L: 48
		this.field4416 = var2 * var5 - this.field4417 * var3; // L: 49
		this.field4417 = var2 * this.field4417 + var5 * var3; // L: 50
		this.field4419 = var2 * var6 - var3 * this.field4420; // L: 51
		this.field4420 = var6 * var3 + var2 * this.field4420; // L: 52
		this.field4413 = var2 * var7 - var3 * this.field4415; // L: 53
		this.field4415 = var2 * this.field4415 + var7 * var3; // L: 54
	} // L: 55

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "47"
	)
	void method7062(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4422; // L: 60
		float var5 = this.field4418; // L: 61
		float var6 = this.field4412; // L: 62
		float var7 = this.field4421; // L: 63
		this.field4422 = this.field4414 * var3 + var2 * var4; // L: 64
		this.field4414 = this.field4414 * var2 - var4 * var3; // L: 65
		this.field4418 = var2 * var5 + var3 * this.field4417; // L: 66
		this.field4417 = var2 * this.field4417 - var5 * var3; // L: 67
		this.field4412 = this.field4420 * var3 + var6 * var2; // L: 68
		this.field4420 = var2 * this.field4420 - var6 * var3; // L: 69
		this.field4421 = var7 * var2 + var3 * this.field4415; // L: 70
		this.field4415 = var2 * this.field4415 - var7 * var3; // L: 71
	} // L: 72

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(FS)V",
		garbageValue = "14299"
	)
	void method7063(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4422; // L: 77
		float var5 = this.field4418; // L: 78
		float var6 = this.field4412; // L: 79
		float var7 = this.field4421; // L: 80
		this.field4422 = var4 * var2 - var3 * this.field4423; // L: 81
		this.field4423 = var4 * var3 + this.field4423 * var2; // L: 82
		this.field4418 = var2 * var5 - this.field4416 * var3; // L: 83
		this.field4416 = var2 * this.field4416 + var3 * var5; // L: 84
		this.field4412 = var6 * var2 - this.field4419 * var3; // L: 85
		this.field4419 = var6 * var3 + this.field4419 * var2; // L: 86
		this.field4421 = var7 * var2 - this.field4413 * var3; // L: 87
		this.field4413 = var7 * var3 + var2 * this.field4413; // L: 88
	} // L: 89

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "27"
	)
	void method7064(float var1, float var2, float var3) {
		this.field4421 += var1; // L: 92
		this.field4413 += var2; // L: 93
		this.field4415 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4422 + "," + this.field4418 + "," + this.field4412 + "," + this.field4421 + "\n" + this.field4423 + "," + this.field4416 + "," + this.field4419 + "," + this.field4413 + "\n" + this.field4414 + "," + this.field4417 + "," + this.field4420 + "," + this.field4415;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljr;",
		garbageValue = "-711904149"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3139, ServerPacket.field3038, ServerPacket.field3061, ServerPacket.field3073, ServerPacket.field3041, ServerPacket.field3042, ServerPacket.field3043, ServerPacket.field3044, ServerPacket.field3050, ServerPacket.field3046, ServerPacket.field3047, ServerPacket.field3048, ServerPacket.field3049, ServerPacket.field3131, ServerPacket.field3095, ServerPacket.field3115, ServerPacket.field3045, ServerPacket.field3054, ServerPacket.field3112, ServerPacket.field3098, ServerPacket.field3057, ServerPacket.field3058, ServerPacket.field3059, ServerPacket.field3143, ServerPacket.field3135, ServerPacket.field3062, ServerPacket.field3063, ServerPacket.field3064, ServerPacket.field3065, ServerPacket.field3066, ServerPacket.field3067, ServerPacket.field3074, ServerPacket.field3069, ServerPacket.field3070, ServerPacket.field3094, ServerPacket.field3072, ServerPacket.field3055, ServerPacket.field3085, ServerPacket.field3075, ServerPacket.field3037, ServerPacket.field3096, ServerPacket.field3127, ServerPacket.field3079, ServerPacket.field3080, ServerPacket.field3056, ServerPacket.field3082, ServerPacket.field3083, ServerPacket.field3084, ServerPacket.field3102, ServerPacket.field3086, ServerPacket.field3081, ServerPacket.field3088, ServerPacket.field3089, ServerPacket.field3077, ServerPacket.field3091, ServerPacket.field3092, ServerPacket.field3093, ServerPacket.field3121, ServerPacket.field3106, ServerPacket.field3051, ServerPacket.field3097, ServerPacket.field3107, ServerPacket.field3099, ServerPacket.field3087, ServerPacket.field3101, ServerPacket.field3100, ServerPacket.field3103, ServerPacket.field3104, ServerPacket.field3105, ServerPacket.field3133, ServerPacket.field3076, ServerPacket.field3108, ServerPacket.field3109, ServerPacket.field3110, ServerPacket.field3111, ServerPacket.field3060, ServerPacket.field3113, ServerPacket.field3078, ServerPacket.field3053, ServerPacket.field3116, ServerPacket.field3117, ServerPacket.field3118, ServerPacket.field3119, ServerPacket.field3120, ServerPacket.field3068, ServerPacket.field3122, ServerPacket.field3123, ServerPacket.field3124, ServerPacket.field3125, ServerPacket.field3126, ServerPacket.field3130, ServerPacket.field3128, ServerPacket.field3129, ServerPacket.field3140, ServerPacket.field3114, ServerPacket.field3132, ServerPacket.field3052, ServerPacket.field3134, ServerPacket.field3071, ServerPacket.field3136, ServerPacket.field3137, ServerPacket.field3138, ServerPacket.field3040, ServerPacket.field3039, ServerPacket.field3141}; // L: 114
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)[Lql;",
		garbageValue = "-14"
	)
	public static IndexedSprite[] method7083() {
		IndexedSprite[] var0 = new IndexedSprite[class457.SpriteBuffer_spriteCount]; // L: 98

		for (int var1 = 0; var1 < class457.SpriteBuffer_spriteCount; ++var1) { // L: 99
			IndexedSprite var2 = var0[var1] = new IndexedSprite(); // L: 100
			var2.width = class457.SpriteBuffer_spriteWidth; // L: 101
			var2.height = class457.SpriteBuffer_spriteHeight; // L: 102
			var2.xOffset = class267.SpriteBuffer_xOffsets[var1]; // L: 103
			var2.yOffset = class457.SpriteBuffer_yOffsets[var1]; // L: 104
			var2.subWidth = class457.SpriteBuffer_spriteWidths[var1]; // L: 105
			var2.subHeight = Decimator.SpriteBuffer_spriteHeights[var1]; // L: 106
			var2.palette = GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette; // L: 107
			var2.pixels = class436.SpriteBuffer_pixels[var1]; // L: 108
		}

		IgnoreList.method6630(); // L: 110
		return var0; // L: 111
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "([Lku;IIIIIIIB)V",
		garbageValue = "114"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10945
			Widget var9 = var0[var8]; // L: 10946
			if (var9 != null && var9.parentId == var1 && (var9.method5634() || class67.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 10947 10948 10949
				if (var9.isIf3) { // L: 10950
					if (ModeWhere.isComponentHidden(var9)) { // L: 10951
						continue;
					}
				} else if (var9.type == 0 && var9 != FontName.mousedOverWidgetIf1 && ModeWhere.isComponentHidden(var9)) { // L: 10954
					continue;
				}

				if (var9.type == 11 && var9.method5702(class152.urlRequester)) { // L: 10956 10957
					if (var9.method5640()) { // L: 10958
						class220.invalidateWidget(var9); // L: 10959
						class439.revalidateWidgetScroll(var9.children, var9, true); // L: 10960
					}

					if (var9.field3492 != null) { // L: 10962
						ScriptEvent var10 = new ScriptEvent(); // L: 10963
						var10.widget = var9; // L: 10964
						var10.args = var9.field3492; // L: 10965
						Client.scriptEvents.addFirst(var10); // L: 10966
					}
				}

				int var26 = var9.x + var6; // L: 10970
				int var11 = var7 + var9.y; // L: 10971
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 10976
					var12 = var2; // L: 10977
					var13 = var3; // L: 10978
					var14 = var4; // L: 10979
					var15 = var5; // L: 10980
				} else {
					int var16;
					if (var9.type == 9) { // L: 10982
						var16 = var26; // L: 10983
						var17 = var11; // L: 10984
						var18 = var26 + var9.width; // L: 10985
						int var19 = var11 + var9.height; // L: 10986
						if (var18 < var26) { // L: 10987
							var16 = var18; // L: 10989
							var18 = var26; // L: 10990
						}

						if (var19 < var11) { // L: 10992
							var17 = var19; // L: 10994
							var19 = var11; // L: 10995
						}

						++var18; // L: 10997
						++var19; // L: 10998
						var12 = var16 > var2 ? var16 : var2; // L: 10999
						var13 = var17 > var3 ? var17 : var3; // L: 11000
						var14 = var18 < var4 ? var18 : var4; // L: 11001
						var15 = var19 < var5 ? var19 : var5; // L: 11002
					} else {
						var16 = var26 + var9.width; // L: 11005
						var17 = var11 + var9.height; // L: 11006
						var12 = var26 > var2 ? var26 : var2; // L: 11007
						var13 = var11 > var3 ? var11 : var3; // L: 11008
						var14 = var16 < var4 ? var16 : var4; // L: 11009
						var15 = var17 < var5 ? var17 : var5; // L: 11010
					}
				}

				if (var9 == Client.clickedWidget) { // L: 11012
					Client.field549 = true; // L: 11013
					Client.field679 = var26; // L: 11014
					Client.field680 = var11; // L: 11015
				}

				boolean var34 = false; // L: 11017
				if (var9.field3444) { // L: 11018
					switch(Client.field603) { // L: 11019
					case 0:
						var34 = true; // L: 11026
					case 1:
					default:
						break;
					case 2:
						if (Client.field660 == var9.id >>> 16) { // L: 11029
							var34 = true; // L: 11030
						}
						break;
					case 3:
						if (var9.id == Client.field660) { // L: 11021
							var34 = true; // L: 11022
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11035
					if (var9.isIf3) { // L: 11036
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11037
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11038
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11039
									if (var27.isMouseInputEvent) { // L: 11040
										var27.remove(); // L: 11041
										var27.widget.containsMouse = false; // L: 11042
									}
								}

								if (LoginScreenAnimation.widgetDragDuration == 0) { // L: 11045
									Client.clickedWidget = null; // L: 11046
									Client.clickedWidgetParent = null; // L: 11047
								}

								if (!Client.isMenuOpen) { // L: 11049
									UserComparator9.addCancelMenuEntry(); // L: 11050
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11054 11055
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11056
								if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) { // L: 11057
									var27.remove(); // L: 11058
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11064
					var18 = MouseHandler.MouseHandler_y; // L: 11065
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11066
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11067
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11068
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11070
					if (var9.contentType == 1337) { // L: 11071
						if (!Client.isLoading && !Client.isMenuOpen && var35) { // L: 11072
							ViewportMouse.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11075
						class101.checkIfMinimapClicked(var9, var26, var11); // L: 11076
					} else {
						if (var9.contentType == 1400) { // L: 11079
							class344.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11080
						}

						if (!Client.isMenuOpen && var35) { // L: 11082
							if (var9.contentType == 1400) { // L: 11083
								class344.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11084
							} else {
								class302.Widget_addToMenu(var9, var17 - var26, var18 - var11); // L: 11087
							}
						}

						boolean var21;
						int var29;
						if (var34) { // L: 11090
							for (int var20 = 0; var20 < var9.field3445.length; ++var20) { // L: 11091
								var21 = false; // L: 11092
								boolean var28 = false; // L: 11093
								if (!var21 && var9.field3445[var20] != null) { // L: 11094
									for (var29 = 0; var29 < var9.field3445[var20].length; ++var29) { // L: 11095
										boolean var24 = false; // L: 11096
										if (var9.field3514 != null) { // L: 11097
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3445[var20][var29]]; // L: 11098
										}

										if (class390.method7092(var9.field3445[var20][var29]) || var24) { // L: 11100
											var21 = true; // L: 11101
											if (var9.field3514 != null && var9.field3514[var20] > Client.cycle) { // L: 11102
												break;
											}

											byte var33 = var9.field3446[var20][var29]; // L: 11103
											if (var33 == 0 || ((var33 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var33 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var33 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var33 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 11104 11105 11106 11107 11108
												var28 = true; // L: 11110
												break;
											}
										}
									}
								}

								if (var28) { // L: 11116
									if (var20 < 10) { // L: 11117
										ArchiveLoader.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11118
										class362.Widget_runOnTargetLeave(); // L: 11119
										class21.selectSpell(var9.id, var9.childIndex, WallObject.Widget_unpackTargetMask(class67.getWidgetFlags(var9)), var9.itemId); // L: 11120
										Client.selectedSpellActionName = IgnoreList.Widget_getSpellActionName(var9); // L: 11121
										if (Client.selectedSpellActionName == null) { // L: 11122
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class82.colorStartTag(16777215); // L: 11123
									}

									var29 = var9.field3447[var20]; // L: 11125
									if (var9.field3514 == null) { // L: 11126
										var9.field3514 = new int[var9.field3445.length];
									}

									if (var9.field3448 == null) { // L: 11127
										var9.field3448 = new int[var9.field3445.length];
									}

									if (var29 != 0) { // L: 11128
										if (var9.field3514[var20] == 0) { // L: 11129
											var9.field3514[var20] = var29 + Client.cycle + var9.field3448[var20];
										} else {
											var9.field3514[var20] = var29 + Client.cycle; // L: 11130
										}
									} else {
										var9.field3514[var20] = Integer.MAX_VALUE; // L: 11132
									}
								}

								if (!var21 && var9.field3514 != null) { // L: 11134 11135
									var9.field3514[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11139
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11140
								var35 = true;
							} else {
								var35 = false; // L: 11141
							}

							boolean var36 = false; // L: 11142
							if ((MouseHandler.MouseHandler_currentButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11143
								var36 = true;
							}

							var21 = false; // L: 11144
							if ((MouseHandler.MouseHandler_lastButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11145
								var21 = true;
							}

							int[] var22;
							if (var21) { // L: 11146
								class19.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11147
								if (var9.type == 11 && var9.method5720(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY, var6, var7)) { // L: 11148
									switch(var9.method5649()) { // L: 11149
									case 0:
										class238.openURL(var9.method5668(), true, false); // L: 11166
										break;
									case 1:
										if (WorldMapRectangle.method4966(class67.getWidgetFlags(var9))) { // L: 11151
											var22 = var9.method5646(); // L: 11152
											if (var22 != null) { // L: 11153
												PacketBufferNode var23 = class433.getPacketBufferNode(ClientPacket.field3008, Client.packetWriter.isaacCipher); // L: 11154
												var23.packetBuffer.method7784(var9.id); // L: 11155
												var23.packetBuffer.method7783(var22[0]); // L: 11156
												var23.packetBuffer.method7785(var22[1]); // L: 11157
												var23.packetBuffer.writeInt(var9.method5625()); // L: 11158
												var23.packetBuffer.method7771(var9.childIndex); // L: 11159
												var23.packetBuffer.method7784(var22[2]); // L: 11160
												Client.packetWriter.addNode(var23); // L: 11161
											}
										}
									}
								}
							}

							if (var9.contentType == 1400) { // L: 11171
								class344.worldMap.method7226(var17, var18, var35 & var36, var35 & var21); // L: 11172
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class78.method2157(class67.getWidgetFlags(var9))) { // L: 11174
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11175
								Client.field675 = true; // L: 11176
								Client.field676 = var26; // L: 11177
								Client.field751 = var11; // L: 11178
							}

							if (var9.hasListener) { // L: 11180
								ScriptEvent var37;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11181
									var37 = new ScriptEvent(); // L: 11182
									var37.isMouseInputEvent = true; // L: 11183
									var37.widget = var9; // L: 11184
									var37.mouseY = Client.mouseWheelRotation; // L: 11185
									var37.args = var9.onScroll; // L: 11186
									Client.scriptEvents.addFirst(var37); // L: 11187
								}

								if (Client.clickedWidget != null || class115.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11189
									var21 = false; // L: 11190
									var36 = false; // L: 11191
									var35 = false; // L: 11192
								}

								if (!var9.isClicked && var21) { // L: 11194
									var9.isClicked = true; // L: 11195
									if (var9.onClick != null) { // L: 11196
										var37 = new ScriptEvent(); // L: 11197
										var37.isMouseInputEvent = true; // L: 11198
										var37.widget = var9; // L: 11199
										var37.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11200
										var37.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11201
										var37.args = var9.onClick; // L: 11202
										Client.scriptEvents.addFirst(var37); // L: 11203
									}
								}

								if (var9.isClicked && var36 && var9.onClickRepeat != null) { // L: 11206 11207
									var37 = new ScriptEvent(); // L: 11208
									var37.isMouseInputEvent = true; // L: 11209
									var37.widget = var9; // L: 11210
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11211
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11212
									var37.args = var9.onClickRepeat; // L: 11213
									Client.scriptEvents.addFirst(var37); // L: 11214
								}

								if (var9.isClicked && !var36) { // L: 11217
									var9.isClicked = false; // L: 11218
									if (var9.onRelease != null) { // L: 11219
										var37 = new ScriptEvent(); // L: 11220
										var37.isMouseInputEvent = true; // L: 11221
										var37.widget = var9; // L: 11222
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11223
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11224
										var37.args = var9.onRelease; // L: 11225
										Client.field702.addFirst(var37); // L: 11226
									}
								}

								if (var36 && var9.onHold != null) { // L: 11229 11230
									var37 = new ScriptEvent(); // L: 11231
									var37.isMouseInputEvent = true; // L: 11232
									var37.widget = var9; // L: 11233
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11234
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11235
									var37.args = var9.onHold; // L: 11236
									Client.scriptEvents.addFirst(var37); // L: 11237
								}

								if (!var9.containsMouse && var35) { // L: 11240
									var9.containsMouse = true; // L: 11241
									if (var9.onMouseOver != null) { // L: 11242
										var37 = new ScriptEvent(); // L: 11243
										var37.isMouseInputEvent = true; // L: 11244
										var37.widget = var9; // L: 11245
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11246
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11247
										var37.args = var9.onMouseOver; // L: 11248
										Client.scriptEvents.addFirst(var37); // L: 11249
									}
								}

								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) { // L: 11252 11253
									var37 = new ScriptEvent(); // L: 11254
									var37.isMouseInputEvent = true; // L: 11255
									var37.widget = var9; // L: 11256
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11257
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11258
									var37.args = var9.onMouseRepeat; // L: 11259
									Client.scriptEvents.addFirst(var37); // L: 11260
								}

								if (var9.containsMouse && !var35) { // L: 11263
									var9.containsMouse = false; // L: 11264
									if (var9.onMouseLeave != null) { // L: 11265
										var37 = new ScriptEvent(); // L: 11266
										var37.isMouseInputEvent = true; // L: 11267
										var37.widget = var9; // L: 11268
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11269
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11270
										var37.args = var9.onMouseLeave; // L: 11271
										Client.field702.addFirst(var37); // L: 11272
									}
								}

								if (var9.onTimer != null) { // L: 11275
									var37 = new ScriptEvent(); // L: 11276
									var37.widget = var9; // L: 11277
									var37.args = var9.onTimer; // L: 11278
									Client.field758.addFirst(var37); // L: 11279
								}

								ScriptEvent var25;
								int var39;
								int var40;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3369) { // L: 11281
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3369 <= 32) { // L: 11282
										label839:
										for (var40 = var9.field3369; var40 < Client.changedVarpCount; ++var40) { // L: 11289
											var29 = Client.changedVarps[var40 & 31]; // L: 11290

											for (var39 = 0; var39 < var9.varTransmitTriggers.length; ++var39) { // L: 11291
												if (var29 == var9.varTransmitTriggers[var39]) { // L: 11292
													var25 = new ScriptEvent(); // L: 11293
													var25.widget = var9; // L: 11294
													var25.args = var9.onVarTransmit; // L: 11295
													Client.scriptEvents.addFirst(var25); // L: 11296
													break label839; // L: 11297
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11283
										var37.widget = var9; // L: 11284
										var37.args = var9.onVarTransmit; // L: 11285
										Client.scriptEvents.addFirst(var37); // L: 11286
									}

									var9.field3369 = Client.changedVarpCount; // L: 11302
								}

								if (var9.onInvTransmit != null && Client.field686 > var9.field3510) { // L: 11304
									if (var9.invTransmitTriggers != null && Client.field686 - var9.field3510 <= 32) { // L: 11305
										label815:
										for (var40 = var9.field3510; var40 < Client.field686; ++var40) { // L: 11312
											var29 = Client.changedItemContainers[var40 & 31]; // L: 11313

											for (var39 = 0; var39 < var9.invTransmitTriggers.length; ++var39) { // L: 11314
												if (var29 == var9.invTransmitTriggers[var39]) { // L: 11315
													var25 = new ScriptEvent(); // L: 11316
													var25.widget = var9; // L: 11317
													var25.args = var9.onInvTransmit; // L: 11318
													Client.scriptEvents.addFirst(var25); // L: 11319
													break label815; // L: 11320
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11306
										var37.widget = var9; // L: 11307
										var37.args = var9.onInvTransmit; // L: 11308
										Client.scriptEvents.addFirst(var37); // L: 11309
									}

									var9.field3510 = Client.field686; // L: 11325
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3486) { // L: 11327
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3486 <= 32) { // L: 11328
										label791:
										for (var40 = var9.field3486; var40 < Client.changedSkillsCount; ++var40) { // L: 11335
											var29 = Client.changedSkills[var40 & 31]; // L: 11336

											for (var39 = 0; var39 < var9.statTransmitTriggers.length; ++var39) { // L: 11337
												if (var29 == var9.statTransmitTriggers[var39]) { // L: 11338
													var25 = new ScriptEvent(); // L: 11339
													var25.widget = var9; // L: 11340
													var25.args = var9.onStatTransmit; // L: 11341
													Client.scriptEvents.addFirst(var25); // L: 11342
													break label791; // L: 11343
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11329
										var37.widget = var9; // L: 11330
										var37.args = var9.onStatTransmit; // L: 11331
										Client.scriptEvents.addFirst(var37); // L: 11332
									}

									var9.field3486 = Client.changedSkillsCount; // L: 11348
								}

								if (Client.chatCycle > var9.field3508 && var9.onChatTransmit != null) { // L: 11350
									var37 = new ScriptEvent(); // L: 11351
									var37.widget = var9; // L: 11352
									var37.args = var9.onChatTransmit; // L: 11353
									Client.scriptEvents.addFirst(var37); // L: 11354
								}

								if (Client.field750 > var9.field3508 && var9.onFriendTransmit != null) { // L: 11356
									var37 = new ScriptEvent(); // L: 11357
									var37.widget = var9; // L: 11358
									var37.args = var9.onFriendTransmit; // L: 11359
									Client.scriptEvents.addFirst(var37); // L: 11360
								}

								if (Client.field612 > var9.field3508 && var9.onClanTransmit != null) { // L: 11362
									var37 = new ScriptEvent(); // L: 11363
									var37.widget = var9; // L: 11364
									var37.args = var9.onClanTransmit; // L: 11365
									Client.scriptEvents.addFirst(var37); // L: 11366
								}

								if (Client.field694 > var9.field3508 && var9.field3484 != null) { // L: 11368
									var37 = new ScriptEvent(); // L: 11369
									var37.widget = var9; // L: 11370
									var37.args = var9.field3484; // L: 11371
									Client.scriptEvents.addFirst(var37); // L: 11372
								}

								if (Client.field755 > var9.field3508 && var9.field3485 != null) { // L: 11374
									var37 = new ScriptEvent(); // L: 11375
									var37.widget = var9; // L: 11376
									var37.args = var9.field3485; // L: 11377
									Client.scriptEvents.addFirst(var37); // L: 11378
								}

								if (Client.field696 > var9.field3508 && var9.onStockTransmit != null) { // L: 11380
									var37 = new ScriptEvent(); // L: 11381
									var37.widget = var9; // L: 11382
									var37.args = var9.onStockTransmit; // L: 11383
									Client.scriptEvents.addFirst(var37); // L: 11384
								}

								if (Client.field697 > var9.field3508 && var9.field3491 != null) { // L: 11386
									var37 = new ScriptEvent(); // L: 11387
									var37.widget = var9; // L: 11388
									var37.args = var9.field3491; // L: 11389
									Client.scriptEvents.addFirst(var37); // L: 11390
								}

								if (Client.field726 > var9.field3508 && var9.onMiscTransmit != null) { // L: 11392
									var37 = new ScriptEvent(); // L: 11393
									var37.widget = var9; // L: 11394
									var37.args = var9.onMiscTransmit; // L: 11395
									Client.scriptEvents.addFirst(var37); // L: 11396
								}

								var9.field3508 = Client.cycleCntr; // L: 11398
								if (var9.onKey != null) { // L: 11399
									for (var40 = 0; var40 < Client.field722; ++var40) { // L: 11400
										ScriptEvent var38 = new ScriptEvent(); // L: 11401
										var38.widget = var9; // L: 11402
										var38.keyTyped = Client.field724[var40]; // L: 11403
										var38.keyPressed = Client.field626[var40]; // L: 11404
										var38.args = var9.onKey; // L: 11405
										Client.scriptEvents.addFirst(var38); // L: 11406
									}
								}

								ScriptEvent var32;
								if (var9.field3480 != null) { // L: 11409
									var22 = class7.method58(); // L: 11410

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11411
										var32 = new ScriptEvent(); // L: 11412
										var32.widget = var9; // L: 11413
										var32.keyTyped = var22[var29]; // L: 11414
										var32.args = var9.field3480; // L: 11415
										Client.scriptEvents.addFirst(var32); // L: 11416
									}
								}

								if (var9.field3481 != null) { // L: 11419
									var22 = Timer.method6564(); // L: 11420

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11421
										var32 = new ScriptEvent(); // L: 11422
										var32.widget = var9; // L: 11423
										var32.keyTyped = var22[var29]; // L: 11424
										var32.args = var9.field3481; // L: 11425
										Client.scriptEvents.addFirst(var32); // L: 11426
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11431
							if (Client.clickedWidget != null || class115.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11432
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11433
								if (var9.mouseOverRedirect >= 0) { // L: 11434
									FontName.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									FontName.mousedOverWidgetIf1 = var9; // L: 11435
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11437
								class10.field59 = var9; // L: 11438
							}

							if (var9.scrollHeight > var9.height) { // L: 11440
								class17.method261(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11442
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11443
							if (var9.children != null) { // L: 11444
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11445
							if (var30 != null) { // L: 11446
								if (var30.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11447
									for (ScriptEvent var31 = (ScriptEvent)Client.scriptEvents.last(); var31 != null; var31 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11448
										if (var31.isMouseInputEvent) { // L: 11449
											var31.remove(); // L: 11450
											var31.widget.containsMouse = false; // L: 11451
										}
									}

									if (LoginScreenAnimation.widgetDragDuration == 0) { // L: 11454
										Client.clickedWidget = null; // L: 11455
										Client.clickedWidgetParent = null; // L: 11456
									}

									if (!Client.isMenuOpen) { // L: 11458
										UserComparator9.addCancelMenuEntry(); // L: 11459
									}
								}

								MouseHandler.updateRootInterface(var30.group, var12, var13, var14, var15, var26, var11); // L: 11462
							}
						}
					}
				}
			}
		}

	} // L: 11466
}
