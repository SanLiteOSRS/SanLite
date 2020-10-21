import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("q")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		signature = "[Lls;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1435460859
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lf;Lf;I)I",
		garbageValue = "-1922470"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(IIIIIILec;Lft;B)V",
		garbageValue = "-56"
	)
	static final void method137(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = MidiPcmStream.getObjectDefinition(var3);
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = (var9 + 1 >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + (var10 + 1 >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = class227.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				class280.method5093(var0, var1, var2, var8, var4);
			}

			Object var22;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var22 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var22 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var22, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var23;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var22 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var22 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
						}

						var6.method3263(var0, var1, var2, var16, 1, 1, (Renderable)var22, 0, var19, var21);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = class204.field2421[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var22 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var22 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, Tiles.field524[var4], 0, var19, var21);
						if (var4 == 0) {
							if (var8.clipped) {
								class22.field122[var0][var1][var2] = 50;
								class22.field122[var0][var1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class204.field2421[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var8.clipped) {
								class22.field122[var0][var1][var2 + 1] = 50;
								class22.field122[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class204.field2421[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) {
							if (var8.clipped) {
								class22.field122[var0][var1 + 1][var2] = 50;
								class22.field122[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class204.field2421[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var8.clipped) {
								class22.field122[var0][var1][var2] = 50;
								class22.field122[var0][var1 + 1][var2] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class204.field2421[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3630(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method3204(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var22 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var22 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, Tiles.field525[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								class22.field122[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class22.field122[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class22.field122[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class22.field122[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3630(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var28;
						if (var5 == 2) {
							var28 = var4 + 1 & 3;
							Object var29;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
								var30 = var8.getEntity(2, var28, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
								var30 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, true, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)var30, Tiles.field524[var4], Tiles.field524[var28], var19, var21);
							if (var8.modelClipped) {
								if (var4 == 0) {
									var10000 = class204.field2421[var0][var1];
									var10000[var2] |= 585;
									var10000 = class204.field2421[var0][var1];
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) {
									var10000 = class204.field2421[var0][var1];
									var10000[1 + var2] |= 1170;
									var10000 = class204.field2421[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = class204.field2421[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = class204.field2421[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = class204.field2421[var0][var1];
									var10000[var2] |= 1170;
									var10000 = class204.field2421[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method3630(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method3204(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var22 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var22 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, Tiles.field525[var4], 0, var19, var21);
							if (var8.clipped) {
								if (var4 == 0) {
									class22.field122[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									class22.field122[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									class22.field122[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									class22.field122[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method3630(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var22 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var22 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
							}

							var6.method3263(var0, var1, var2, var16, 1, 1, (Renderable)var22, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method3204(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var22 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var22 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, Tiles.field524[var4], 0, 0, 0, var19, var21);
						} else {
							long var31;
							Object var33;
							if (var5 == 5) {
								var28 = 16;
								var31 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (0L != var31) {
									var28 = MidiPcmStream.getObjectDefinition(UserComparator9.Entity_unpackID(var31)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var33 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var33 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var33, (Renderable)null, Tiles.field524[var4], 0, var28 * Tiles.field517[var4], var28 * Tiles.field527[var4], var19, var21);
							} else if (var5 == 6) {
								var28 = 8;
								var31 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var31 != 0L) {
									var28 = MidiPcmStream.getObjectDefinition(UserComparator9.Entity_unpackID(var31)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var33 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var33 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var33, (Renderable)null, 256, var4, var28 * Tiles.field534[var4], var28 * Tiles.field529[var4], var19, var21);
							} else if (var5 == 7) {
								var23 = var4 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var22 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
								} else {
									var22 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, 256, var23, 0, 0, var19, var21);
							} else if (var5 == 8) {
								var28 = 8;
								var31 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var31 != 0L) {
									var28 = MidiPcmStream.getObjectDefinition(UserComparator9.Entity_unpackID(var31)).int2 / 2;
								}

								int var27 = var4 + 2 & 3;
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) {
									var33 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
								} else {
									var33 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var33, (Renderable)var26, 256, var4, var28 * Tiles.field534[var4], var28 * Tiles.field529[var4], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var22 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var22 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
					}

					if (var22 != null && var6.method3263(var0, var1, var2, var16, var9, var10, (Renderable)var22, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var23 = 15;
						if (var22 instanceof Model) {
							var23 = ((Model)var22).method3016() / 4;
							if (var23 > 30) {
								var23 = 30;
							}
						}

						for (int var24 = 0; var24 <= var9; ++var24) {
							for (int var25 = 0; var25 <= var10; ++var25) {
								if (var23 > class22.field122[var0][var24 + var1][var25 + var2]) {
									class22.field122[var0][var24 + var1][var25 + var2] = (byte)var23;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(ILcy;ZB)I",
		garbageValue = "-107"
	)
	static int method141(int var0, Script var1, boolean var2) {
		String var3;
		if (var0 == ScriptOpcodes.MES) {
			var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
			WorldMapRectangle.addGameMessage(0, "", var3);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2;
			GrandExchangeOfferNameComparator.performPlayerAnimation(WorldMapLabelSize.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field1132) {
				Interpreter.field1131 = true;
			}

			return 1;
		} else {
			int var10;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
				var10 = 0;
				if (World.isNumber(var3)) {
					var10 = GrandExchangeOfferTotalQuantityComparator.parseInt(var3);
				}

				PacketBufferNode var12 = Client.getPacketBufferNode(ClientPacket.field2332, Client.packetWriter.isaacCipher);
				var12.packetBuffer.writeInt(var10);
				Client.packetWriter.addNode(var12);
				return 1;
			} else {
				PacketBufferNode var14;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
					var14 = Client.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(var3.length() + 1);
					var14.packetBuffer.writeStringCp1252NullTerminated(var3);
					Client.packetWriter.addNode(var14);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
					var14 = Client.getPacketBufferNode(ClientPacket.field2339, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(var3.length() + 1);
					var14.packetBuffer.writeStringCp1252NullTerminated(var3);
					Client.packetWriter.addNode(var14);
					return 1;
				} else {
					String var7;
					int var15;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var15 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
						Archive.method4383(var15, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3;
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						Widget var13 = TileItem.getWidget(var9);
						class13.clickWidget(var13, var15, var10);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2;
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						Widget var11 = var2 ? Canvas.field438 : class3.field12;
						class13.clickWidget(var11, var15, var10);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						ScriptEvent.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Tile.clientPreferences.roofsHidden ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						Tile.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						WorldMapData_1.savePreferences();
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						class280.openURL(var3, var4, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var15 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var14 = Client.getPacketBufferNode(ClientPacket.field2338, Client.packetWriter.isaacCipher);
						var14.packetBuffer.writeShort(var15);
						Client.packetWriter.addNode(var14);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var15 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Varps.Interpreter_stringStackSize -= 2;
						var7 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize + 1];
						if (var7.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = Client.getPacketBufferNode(ClientPacket.field2284, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + Decimator.stringCp1252NullTerminatedByteSize(var7) + Decimator.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.method5645(var15);
							var6.packetBuffer.writeStringCp1252NullTerminated(var7);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						GrandExchangeEvents.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FriendsChatManager.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						Interpreter.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FloorDecoration.canvasWidth;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field865 = 3;
						Client.field840 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field865 = 2;
						Client.field840 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field865 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field865 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field865 = 3;
						Client.field840 = var2 ? Canvas.field438.id : class3.field12.id;
						return 1;
					} else {
						boolean var8;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Tile.clientPreferences.hideUsername = var8;
							WorldMapData_1.savePreferences();
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Tile.clientPreferences.hideUsername ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var8;
							if (!var8) {
								Tile.clientPreferences.rememberedUsername = "";
								WorldMapData_1.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (var8 == Tile.clientPreferences.titleMusicDisabled) {
								Tile.clientPreferences.titleMusicDisabled = !var8;
								WorldMapData_1.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Tile.clientPreferences.titleMusicDisabled ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapData_1.method785();
							return 1;
						} else if (var0 == 3155) {
							--Varps.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--Varps.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--Varps.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--Varps.Interpreter_stringStackSize;
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
