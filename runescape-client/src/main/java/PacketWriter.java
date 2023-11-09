import java.io.IOException;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = 1317951343
	)
	static int field1398;
	@ObfuscatedName("wd")
	static Iterator field1395;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1456676047
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2003725787
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ac")
	boolean field1389;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1325770619
	)
	int field1390;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1296604757
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	ServerPacket field1392;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	ServerPacket field1381;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	ServerPacket field1394;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1389 = true; // L: 22
		this.field1390 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-70439112"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0; // L: 50
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index); // L: 43
				this.bufferSize -= var1.index; // L: 44
				var1.remove(); // L: 45
				var1.packetBuffer.releaseArray(); // L: 46
				var1.release(); // L: 47
			}
		}

	} // L: 52

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llt;B)V",
		garbageValue = "88"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "1740087504"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1525515637"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "633157304"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lqt;",
		garbageValue = "1063544507"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1457250621"
	)
	static final String method2775(int var0) {
		if (var0 < 100000) { // L: 444
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 445 446
		}
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "([Lmo;IIIIIIIB)V",
		garbageValue = "1"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11153
			Widget var9 = var0[var8]; // L: 11154
			if (var9 != null && var9.parentId == var1 && (var9.method6437() || class209.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11155 11156 11157
				if (var9.isIf3) { // L: 11158
					if (UserComparator9.isComponentHidden(var9)) { // L: 11159
						continue;
					}
				} else if (var9.type == 0 && var9 != class216.mousedOverWidgetIf1 && UserComparator9.isComponentHidden(var9)) { // L: 11162
					continue;
				}

				if (var9.type == 11) { // L: 11164
					if (var9.method6524(PendingSpawn.urlRequester)) { // L: 11165
						if (var9.method6445()) { // L: 11166
							HorizontalAlignment.invalidateWidget(var9); // L: 11167
							class166.revalidateWidgetScroll(var9.children, var9, true); // L: 11168
						}

						if (var9.field3732 != null) { // L: 11170
							ScriptEvent var10 = new ScriptEvent(); // L: 11171
							var10.widget = var9; // L: 11172
							var10.args = var9.field3732; // L: 11173
							Client.scriptEvents.addFirst(var10); // L: 11174
						}
					}
				} else if (var9.type == 12 && var9.method6460()) { // L: 11178 11179
					HorizontalAlignment.invalidateWidget(var9); // L: 11180
				}

				int var26 = var9.x + var6; // L: 11183
				int var11 = var7 + var9.y; // L: 11184
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 11189
					var16 = var26; // L: 11190
					var17 = var11; // L: 11191
					var18 = var26 + var9.width; // L: 11192
					int var19 = var11 + var9.height; // L: 11193
					if (var18 < var26) { // L: 11194
						var16 = var18; // L: 11196
						var18 = var26; // L: 11197
					}

					if (var19 < var11) { // L: 11199
						var17 = var19; // L: 11201
						var19 = var11; // L: 11202
					}

					++var18; // L: 11204
					++var19; // L: 11205
					var12 = var16 > var2 ? var16 : var2; // L: 11206
					var13 = var17 > var3 ? var17 : var3; // L: 11207
					var14 = var18 < var4 ? var18 : var4; // L: 11208
					var15 = var19 < var5 ? var19 : var5; // L: 11209
				} else {
					var16 = var26 + var9.width; // L: 11212
					var17 = var11 + var9.height; // L: 11213
					var12 = var26 > var2 ? var26 : var2; // L: 11214
					var13 = var11 > var3 ? var11 : var3; // L: 11215
					var14 = var16 < var4 ? var16 : var4; // L: 11216
					var15 = var17 < var5 ? var17 : var5; // L: 11217
				}

				if (var9 == Client.clickedWidget) { // L: 11219
					Client.field749 = true; // L: 11220
					Client.field767 = var26; // L: 11221
					Client.field672 = var11; // L: 11222
				}

				boolean var34 = false; // L: 11224
				if (var9.field3736) { // L: 11225
					switch(Client.field652) { // L: 11226
					case 0:
						var34 = true; // L: 11238
					case 1:
					default:
						break;
					case 2:
						if (Client.field653 == var9.id >>> 16) { // L: 11228
							var34 = true; // L: 11229
						}
						break;
					case 3:
						if (var9.id == Client.field653) { // L: 11233
							var34 = true; // L: 11234
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11242
					if (var9.isIf3) { // L: 11243
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11244
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11245
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11246
									if (var27.field1055) { // L: 11247
										var27.remove(); // L: 11248
										var27.widget.field3746 = false; // L: 11249
									}
								}

								class138.method3078(); // L: 11252
								if (class302.widgetDragDuration == 0) { // L: 11253
									Client.clickedWidget = null; // L: 11254
									Client.clickedWidgetParent = null; // L: 11255
								}

								if (!Client.isMenuOpen) { // L: 11257
									ViewportMouse.addCancelMenuEntry(); // L: 11258
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11262 11263
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11264
								if (var27.field1055 && var27.widget.onScroll == var27.args) { // L: 11265
									var27.remove(); // L: 11266
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11272
					var18 = MouseHandler.MouseHandler_y; // L: 11273
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11274
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11275
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11276
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11278
					if (var9.contentType == 1337) { // L: 11279
						if (!Client.field493 && !Client.isMenuOpen && var35) { // L: 11280
							class90.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11283
						BufferedFile.checkIfMinimapClicked(var9, var26, var11); // L: 11284
					} else {
						if (var9.contentType == 1400) { // L: 11287
							ScriptEvent.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11288
						}

						if (!Client.isMenuOpen && var35) { // L: 11290
							if (var9.contentType == 1400) { // L: 11291
								ScriptEvent.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11292
							} else {
								WorldMapIcon_1.method5070(var9); // L: 11295
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 11298
							for (int var20 = 0; var20 < var9.field3694.length; ++var20) { // L: 11299
								var21 = false; // L: 11300
								boolean var28 = false; // L: 11301
								if (!var21 && var9.field3694[var20] != null) { // L: 11302
									for (var23 = 0; var23 < var9.field3694[var20].length; ++var23) { // L: 11303
										boolean var24 = false; // L: 11304
										if (var9.field3754 != null) { // L: 11305
											var24 = Client.field759.method4087(var9.field3694[var20][var23]); // L: 11306
										}

										if (class4.method18(var9.field3694[var20][var23]) || var24) { // L: 11308
											var21 = true; // L: 11309
											if (var9.field3754 != null && var9.field3754[var20] > Client.cycle) { // L: 11310
												break;
											}

											byte var33 = var9.field3685[var20][var23]; // L: 11311
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field759.method4087(86) && !Client.field759.method4087(82) && !Client.field759.method4087(81)) && ((var33 & 2) == 0 || Client.field759.method4087(86)) && ((var33 & 1) == 0 || Client.field759.method4087(82)) && ((var33 & 4) == 0 || Client.field759.method4087(81))) { // L: 11312 11313 11314 11315 11316
												var28 = true; // L: 11318
												break;
											}
										}
									}
								}

								if (var28) { // L: 11324
									if (var20 < 10) { // L: 11325
										class90.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11326
										ScriptEvent.Widget_runOnTargetLeave(); // L: 11327
										class47.selectSpell(var9.id, var9.childIndex, class316.Widget_unpackTargetMask(class209.getWidgetFlags(var9)), var9.itemId); // L: 11328
										Client.field543 = class92.Widget_getSpellActionName(var9); // L: 11329
										if (Client.field543 == null) { // L: 11330
											Client.field543 = "null";
										}

										Client.field649 = var9.dataText + class396.colorStartTag(16777215); // L: 11331
									}

									var23 = var9.field3686[var20]; // L: 11333
									if (var9.field3754 == null) { // L: 11334
										var9.field3754 = new int[var9.field3694.length];
									}

									if (var9.field3687 == null) { // L: 11335
										var9.field3687 = new int[var9.field3694.length];
									}

									if (var23 != 0) { // L: 11336
										if (var9.field3754[var20] == 0) { // L: 11337
											var9.field3754[var20] = var23 + Client.cycle + var9.field3687[var20];
										} else {
											var9.field3754[var20] = var23 + Client.cycle; // L: 11338
										}
									} else {
										var9.field3754[var20] = Integer.MAX_VALUE; // L: 11340
									}
								}

								if (!var21 && var9.field3754 != null) { // L: 11342 11343
									var9.field3754[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11347
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11348
								var35 = true;
							} else {
								var35 = false; // L: 11349
							}

							boolean var36 = false; // L: 11350
							if ((MouseHandler.MouseHandler_currentButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11351
								var36 = true;
							}

							var21 = false; // L: 11352
							if ((MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11353
								var21 = true;
							}

							if (var21) { // L: 11354
								ArchiveLoader.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11355
							}

							if (var9.method6438()) { // L: 11357
								if (var21) { // L: 11358
									Client.field505.addFirst(new class210(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11359
								}

								if (var36) { // L: 11361
									Client.field505.addFirst(new class210(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11362
								}
							}

							if (var9.contentType == 1400) { // L: 11365
								ScriptEvent.worldMap.method8446(var17, var18, var35 & var36, var35 & var21); // L: 11366
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class176.method3488(class209.getWidgetFlags(var9))) { // L: 11368
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11369
								Client.field667 = true; // L: 11370
								Client.field668 = var26; // L: 11371
								Client.field670 = var11; // L: 11372
							}

							if (var9.hasListener) { // L: 11374
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11375
									var22 = new ScriptEvent(); // L: 11376
									var22.field1055 = true; // L: 11377
									var22.widget = var9; // L: 11378
									var22.mouseY = Client.mouseWheelRotation; // L: 11379
									var22.args = var9.onScroll; // L: 11380
									Client.scriptEvents.addFirst(var22); // L: 11381
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11383
									var21 = false; // L: 11384
									var36 = false; // L: 11385
									var35 = false; // L: 11386
								}

								if (!var9.field3747 && var21) { // L: 11388
									var9.field3747 = true; // L: 11389
									if (var9.onClick != null) { // L: 11390
										var22 = new ScriptEvent(); // L: 11391
										var22.field1055 = true; // L: 11392
										var22.widget = var9; // L: 11393
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11394
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11395
										var22.args = var9.onClick; // L: 11396
										Client.scriptEvents.addFirst(var22); // L: 11397
									}
								}

								if (var9.field3747 && var36 && var9.onClickRepeat != null) { // L: 11400 11401
									var22 = new ScriptEvent(); // L: 11402
									var22.field1055 = true; // L: 11403
									var22.widget = var9; // L: 11404
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11405
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11406
									var22.args = var9.onClickRepeat; // L: 11407
									Client.scriptEvents.addFirst(var22); // L: 11408
								}

								if (var9.field3747 && !var36) { // L: 11411
									var9.field3747 = false; // L: 11412
									if (var9.onRelease != null) { // L: 11413
										var22 = new ScriptEvent(); // L: 11414
										var22.field1055 = true; // L: 11415
										var22.widget = var9; // L: 11416
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11417
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11418
										var22.args = var9.onRelease; // L: 11419
										Client.field695.addFirst(var22); // L: 11420
									}
								}

								if (var36 && var9.onHold != null) { // L: 11423 11424
									var22 = new ScriptEvent(); // L: 11425
									var22.field1055 = true; // L: 11426
									var22.widget = var9; // L: 11427
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11428
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11429
									var22.args = var9.onHold; // L: 11430
									Client.scriptEvents.addFirst(var22); // L: 11431
								}

								if (!var9.field3746 && var35) { // L: 11434
									var9.field3746 = true; // L: 11435
									if (var9.onMouseOver != null) { // L: 11436
										var22 = new ScriptEvent(); // L: 11437
										var22.field1055 = true; // L: 11438
										var22.widget = var9; // L: 11439
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11440
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11441
										var22.args = var9.onMouseOver; // L: 11442
										Client.scriptEvents.addFirst(var22); // L: 11443
									}
								}

								if (var9.field3746 && var35 && var9.onMouseRepeat != null) { // L: 11446 11447
									var22 = new ScriptEvent(); // L: 11448
									var22.field1055 = true; // L: 11449
									var22.widget = var9; // L: 11450
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11451
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11452
									var22.args = var9.onMouseRepeat; // L: 11453
									Client.scriptEvents.addFirst(var22); // L: 11454
								}

								if (var9.field3746 && !var35) { // L: 11457
									var9.field3746 = false; // L: 11458
									if (var9.onMouseLeave != null) { // L: 11459
										var22 = new ScriptEvent(); // L: 11460
										var22.field1055 = true; // L: 11461
										var22.widget = var9; // L: 11462
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11463
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11464
										var22.args = var9.onMouseLeave; // L: 11465
										Client.field695.addFirst(var22); // L: 11466
									}
								}

								if (var9.onTimer != null) { // L: 11469
									var22 = new ScriptEvent(); // L: 11470
									var22.widget = var9; // L: 11471
									var22.args = var9.onTimer; // L: 11472
									Client.field694.addFirst(var22); // L: 11473
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field539 > var9.field3749) { // L: 11475
									if (var9.varTransmitTriggers != null && Client.field539 - var9.field3749 <= 32) { // L: 11476
										label826:
										for (var39 = var9.field3749; var39 < Client.field539; ++var39) { // L: 11483
											var23 = Client.field675[var39 & 31]; // L: 11484

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11485
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11486
													var25 = new ScriptEvent(); // L: 11487
													var25.widget = var9; // L: 11488
													var25.args = var9.onVarTransmit; // L: 11489
													Client.scriptEvents.addFirst(var25); // L: 11490
													break label826; // L: 11491
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11477
										var22.widget = var9; // L: 11478
										var22.args = var9.onVarTransmit; // L: 11479
										Client.scriptEvents.addFirst(var22); // L: 11480
									}

									var9.field3749 = Client.field539; // L: 11496
								}

								if (var9.onInvTransmit != null && Client.field678 > var9.field3727) { // L: 11498
									if (var9.invTransmitTriggers != null && Client.field678 - var9.field3727 <= 32) { // L: 11499
										label802:
										for (var39 = var9.field3727; var39 < Client.field678; ++var39) { // L: 11506
											var23 = Client.field677[var39 & 31]; // L: 11507

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11508
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11509
													var25 = new ScriptEvent(); // L: 11510
													var25.widget = var9; // L: 11511
													var25.args = var9.onInvTransmit; // L: 11512
													Client.scriptEvents.addFirst(var25); // L: 11513
													break label802; // L: 11514
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11500
										var22.widget = var9; // L: 11501
										var22.args = var9.onInvTransmit; // L: 11502
										Client.scriptEvents.addFirst(var22); // L: 11503
									}

									var9.field3727 = Client.field678; // L: 11519
								}

								if (var9.onStatTransmit != null && Client.field680 > var9.field3751) { // L: 11521
									if (var9.statTransmitTriggers != null && Client.field680 - var9.field3751 <= 32) { // L: 11522
										label778:
										for (var39 = var9.field3751; var39 < Client.field680; ++var39) { // L: 11529
											var23 = Client.field691[var39 & 31]; // L: 11530

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11531
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11532
													var25 = new ScriptEvent(); // L: 11533
													var25.widget = var9; // L: 11534
													var25.args = var9.onStatTransmit; // L: 11535
													Client.scriptEvents.addFirst(var25); // L: 11536
													break label778; // L: 11537
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11523
										var22.widget = var9; // L: 11524
										var22.args = var9.onStatTransmit; // L: 11525
										Client.scriptEvents.addFirst(var22); // L: 11526
									}

									var9.field3751 = Client.field680; // L: 11542
								}

								if (Client.chatCycle > var9.field3748 && var9.onChatTransmit != null) { // L: 11544
									var22 = new ScriptEvent(); // L: 11545
									var22.widget = var9; // L: 11546
									var22.args = var9.onChatTransmit; // L: 11547
									Client.scriptEvents.addFirst(var22); // L: 11548
								}

								if (Client.field736 > var9.field3748 && var9.onFriendTransmit != null) { // L: 11550
									var22 = new ScriptEvent(); // L: 11551
									var22.widget = var9; // L: 11552
									var22.args = var9.onFriendTransmit; // L: 11553
									Client.scriptEvents.addFirst(var22); // L: 11554
								}

								if (Client.field685 > var9.field3748 && var9.onClanTransmit != null) { // L: 11556
									var22 = new ScriptEvent(); // L: 11557
									var22.widget = var9; // L: 11558
									var22.args = var9.onClanTransmit; // L: 11559
									Client.scriptEvents.addFirst(var22); // L: 11560
								}

								if (Client.field615 > var9.field3748 && var9.field3611 != null) { // L: 11562
									var22 = new ScriptEvent(); // L: 11563
									var22.widget = var9; // L: 11564
									var22.args = var9.field3611; // L: 11565
									Client.scriptEvents.addFirst(var22); // L: 11566
								}

								if (Client.field687 > var9.field3748 && var9.field3725 != null) { // L: 11568
									var22 = new ScriptEvent(); // L: 11569
									var22.widget = var9; // L: 11570
									var22.args = var9.field3725; // L: 11571
									Client.scriptEvents.addFirst(var22); // L: 11572
								}

								if (Client.field735 > var9.field3748 && var9.onStockTransmit != null) { // L: 11574
									var22 = new ScriptEvent(); // L: 11575
									var22.widget = var9; // L: 11576
									var22.args = var9.onStockTransmit; // L: 11577
									Client.scriptEvents.addFirst(var22); // L: 11578
								}

								if (Client.field689 > var9.field3748 && var9.field3731 != null) { // L: 11580
									var22 = new ScriptEvent(); // L: 11581
									var22.widget = var9; // L: 11582
									var22.args = var9.field3731; // L: 11583
									Client.scriptEvents.addFirst(var22); // L: 11584
								}

								if (Client.field690 > var9.field3748 && var9.onMiscTransmit != null) { // L: 11586
									var22 = new ScriptEvent(); // L: 11587
									var22.widget = var9; // L: 11588
									var22.args = var9.onMiscTransmit; // L: 11589
									Client.scriptEvents.addFirst(var22); // L: 11590
								}

								var9.field3748 = Client.cycleCntr; // L: 11592
								if (var9.onKey != null) { // L: 11593
									for (var39 = 0; var39 < Client.field570; ++var39) { // L: 11594
										ScriptEvent var32 = new ScriptEvent(); // L: 11595
										var32.widget = var9; // L: 11596
										var32.keyTyped = Client.field720[var39]; // L: 11597
										var32.keyPressed = Client.field540[var39]; // L: 11598
										var32.args = var9.onKey; // L: 11599
										Client.scriptEvents.addFirst(var32); // L: 11600
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3597 != null) { // L: 11603
									var38 = Client.field759.method4089(); // L: 11604

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11605
										var31 = new ScriptEvent(); // L: 11606
										var31.widget = var9; // L: 11607
										var31.keyTyped = var38[var23]; // L: 11608
										var31.args = var9.field3597; // L: 11609
										Client.scriptEvents.addFirst(var31); // L: 11610
									}
								}

								if (var9.field3721 != null) { // L: 11613
									var38 = Client.field759.method4090(); // L: 11614

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11615
										var31 = new ScriptEvent(); // L: 11616
										var31.widget = var9; // L: 11617
										var31.keyTyped = var38[var23]; // L: 11618
										var31.args = var9.field3721; // L: 11619
										Client.scriptEvents.addFirst(var31); // L: 11620
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11625
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11626
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.field3635 != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11627
								if (var9.mouseOverRedirect >= 0) { // L: 11628
									class216.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class216.mousedOverWidgetIf1 = var9; // L: 11629
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11631
								WorldMapSectionType.field2979 = var9; // L: 11632
							}

							if (var9.scrollHeight > var9.height) { // L: 11634
								class298.method5749(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11636
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11637
							if (var9.children != null) { // L: 11638
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11639
							if (var29 != null) { // L: 11640
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11641
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11642
										if (var30.field1055) { // L: 11643
											var30.remove(); // L: 11644
											var30.widget.field3746 = false; // L: 11645
										}
									}

									if (class302.widgetDragDuration == 0) { // L: 11648
										Client.clickedWidget = null; // L: 11649
										Client.clickedWidgetParent = null; // L: 11650
									}

									if (!Client.isMenuOpen) { // L: 11652
										ViewportMouse.addCancelMenuEntry(); // L: 11653
									}
								}

								Varcs.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11); // L: 11656
							}
						}
					}
				}
			}
		}

	} // L: 11660
}
