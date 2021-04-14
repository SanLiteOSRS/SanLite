import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fh")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1100336631
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1521392293
	)
	static int field2002;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2025670569
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 645441179
	)
	@Export("y")
	int y;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1727804359
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lcj;IIB)V",
		garbageValue = "18"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var19;
		if (WorldMap.isWorldMapEvent(var0.type)) {
			UrlRequest.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var5 = ByteArrayPool.WorldMapElement_get(UrlRequest.worldMapEvent.mapElement);
			var4 = Tiles.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var19 = (Integer)var3[0];
			var4 = class24.getScript(var19);
		}

		if (var4 != null) {
			class16.Interpreter_intStackSize = 0;
			Interpreter.Interpreter_stringStackSize = 0;
			var19 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field944 = false;
			boolean var9 = false;
			int var10 = 0;

			try {
				int var13;
				try {
					ScriptFrame.Interpreter_intLocals = new int[var4.localIntCount];
					int var11 = 0;
					Interpreter.Interpreter_stringLocals = new String[var4.localStringCount];
					int var12 = 0;

					int var14;
					String var20;
					for (var13 = 1; var13 < var3.length; ++var13) {
						if (var3[var13] instanceof Integer) {
							var14 = (Integer)var3[var13];
							if (var14 == -2147483647) {
								var14 = var0.mouseX;
							}

							if (var14 == -2147483646) {
								var14 = var0.mouseY;
							}

							if (var14 == -2147483645) {
								var14 = var0.widget != null ? var0.widget.id : -1;
							}

							if (var14 == -2147483644) {
								var14 = var0.opIndex;
							}

							if (var14 == -2147483643) {
								var14 = var0.widget != null ? var0.widget.childIndex : -1;
							}

							if (var14 == -2147483642) {
								var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
							}

							if (var14 == -2147483641) {
								var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
							}

							if (var14 == -2147483640) {
								var14 = var0.keyTyped;
							}

							if (var14 == -2147483639) {
								var14 = var0.keyPressed;
							}

							ScriptFrame.Interpreter_intLocals[var11++] = var14;
						} else if (var3[var13] instanceof String) {
							var20 = (String)var3[var13];
							if (var20.equals("event_opbase")) {
								var20 = var0.targetName;
							}

							Interpreter.Interpreter_stringLocals[var12++] = var20;
						}
					}

					Interpreter.field950 = var0.field1154;

					while (true) {
						++var10;
						if (var10 > var1) {
							throw new RuntimeException();
						}

						++var19;
						int var31 = var6[var19];
						if (var31 >= 100) {
							boolean var32;
							if (var4.intOperands[var19] == 1) {
								var32 = true;
							} else {
								var32 = false;
							}

							var14 = class223.method4236(var31, var4, var32);
							switch(var14) {
							case 0:
								return;
							case 1:
							default:
								break;
							case 2:
								throw new IllegalStateException();
							}
						} else if (var31 == 0) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7[var19];
						} else if (var31 == ScriptOpcodes.GET_VARP) {
							var13 = var7[var19];
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
						} else if (var31 == ScriptOpcodes.SET_VARP) {
							var13 = var7[var19];
							Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
							class27.changeGameOptions(var13);
						} else if (var31 == ScriptOpcodes.SCONST) {
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.stringOperands[var19];
						} else if (var31 == ScriptOpcodes.JUMP) {
							var19 += var7[var19];
						} else if (var31 == ScriptOpcodes.IF_ICMPNE) {
							class16.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPEQ) {
							class16.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPLT) {
							class16.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPGT) {
							class16.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.RETURN) {
							if (Interpreter.Interpreter_frameDepth == 0) {
								return;
							}

							ScriptFrame var37 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
							var4 = var37.script;
							var6 = var4.opcodes;
							var7 = var4.intOperands;
							var19 = var37.pc;
							ScriptFrame.Interpreter_intLocals = var37.intLocals;
							Interpreter.Interpreter_stringLocals = var37.stringLocals;
						} else if (var31 == ScriptOpcodes.GET_VARBIT) {
							var13 = var7[var19];
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class2.getVarbit(var13);
						} else if (var31 == ScriptOpcodes.SET_VARBIT) {
							var13 = var7[var19];
							class337.method5984(var13, Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
						} else if (var31 == ScriptOpcodes.IF_ICMPLE) {
							class16.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPGE) {
							class16.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.ILOAD) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ScriptFrame.Interpreter_intLocals[var7[var19]];
						} else if (var31 == ScriptOpcodes.ISTORE) {
							ScriptFrame.Interpreter_intLocals[var7[var19]] = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						} else if (var31 == ScriptOpcodes.SLOAD) {
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var19]];
						} else if (var31 == ScriptOpcodes.SSTORE) {
							Interpreter.Interpreter_stringLocals[var7[var19]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						} else if (var31 == ScriptOpcodes.JOIN_STRING) {
							var13 = var7[var19];
							Interpreter.Interpreter_stringStackSize -= var13;
							var20 = class23.method346(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var13);
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var20;
						} else if (var31 == ScriptOpcodes.POP_INT) {
							--class16.Interpreter_intStackSize;
						} else if (var31 == ScriptOpcodes.POP_STRING) {
							--Interpreter.Interpreter_stringStackSize;
						} else {
							int var17;
							if (var31 != ScriptOpcodes.INVOKE) {
								if (var31 == ScriptOpcodes.GET_VARC_INT) {
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = TextureProvider.varcs.getInt(var7[var19]);
								} else if (var31 == ScriptOpcodes.SET_VARC_INT) {
									TextureProvider.varcs.setInt(var7[var19], Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
								} else if (var31 == ScriptOpcodes.DEFINE_ARRAY) {
									var13 = var7[var19] >> 16;
									var14 = var7[var19] & 65535;
									int var23 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
									if (var23 < 0 || var23 > 5000) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_arrayLengths[var13] = var23;
									byte var24 = -1;
									if (var14 == 105) {
										var24 = 0;
									}

									for (var17 = 0; var17 < var23; ++var17) {
										Interpreter.Interpreter_arrays[var13][var17] = var24;
									}
								} else if (var31 == ScriptOpcodes.GET_ARRAY_INT) {
									var13 = var7[var19];
									var14 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
								} else if (var31 == ScriptOpcodes.SET_ARRAY_INT) {
									var13 = var7[var19];
									class16.Interpreter_intStackSize -= 2;
									var14 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
								} else {
									String var21;
									if (var31 == ScriptOpcodes.GET_VARC_STRING_OLD) {
										var21 = TextureProvider.varcs.getStringOld(var7[var19]);
										if (var21 == null) {
											var21 = "null";
										}

										Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21;
									} else if (var31 == ScriptOpcodes.SET_VARC_STRING_OLD) {
										TextureProvider.varcs.setStringOld(var7[var19], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
									} else if (var31 == ScriptOpcodes.GET_VARC_STRING) {
										var21 = TextureProvider.varcs.getString(var7[var19]);
										Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21;
									} else if (var31 == ScriptOpcodes.SET_VARC_STRING) {
										TextureProvider.varcs.setString(var7[var19], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
									} else if (var31 == ScriptOpcodes.SWITCH) {
										IterableNodeHashTable var35 = var4.switches[var7[var19]];
										IntegerNode var34 = (IntegerNode)var35.get((long)Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
										if (var34 != null) {
											var19 += var34.integer;
										}
									} else {
										Integer var36;
										if (var31 == 74) {
											var36 = class19.field154.method144(var7[var19]);
											if (var36 == null) {
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var36;
											}
										} else {
											if (var31 != 76) {
												throw new IllegalStateException();
											}

											var36 = Coord.field2591.method5988(var7[var19]);
											if (var36 == null) {
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var36;
											}
										}
									}
								}
							} else {
								var13 = var7[var19];
								Script var33 = class24.getScript(var13);
								int[] var15 = new int[var33.localIntCount];
								String[] var16 = new String[var33.localStringCount];

								for (var17 = 0; var17 < var33.intArgumentCount; ++var17) {
									var15[var17] = Interpreter.Interpreter_intStack[var17 + (class16.Interpreter_intStackSize - var33.intArgumentCount)];
								}

								for (var17 = 0; var17 < var33.stringArgumentCount; ++var17) {
									var16[var17] = Interpreter.Interpreter_stringStack[var17 + (Interpreter.Interpreter_stringStackSize - var33.stringArgumentCount)];
								}

								class16.Interpreter_intStackSize -= var33.intArgumentCount;
								Interpreter.Interpreter_stringStackSize -= var33.stringArgumentCount;
								ScriptFrame var22 = new ScriptFrame();
								var22.script = var4;
								var22.pc = var19;
								var22.intLocals = ScriptFrame.Interpreter_intLocals;
								var22.stringLocals = Interpreter.Interpreter_stringLocals;
								Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
								var4 = var33;
								var6 = var33.opcodes;
								var7 = var33.intOperands;
								var19 = -1;
								ScriptFrame.Interpreter_intLocals = var15;
								Interpreter.Interpreter_stringLocals = var16;
							}
						}
					}
				} catch (Exception var29) {
					var9 = true;
					StringBuilder var26 = new StringBuilder(30);
					var26.append("").append(var4.key).append(" ");

					for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
						var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
					}

					var26.append("").append(var8);
					class223.RunException_sendStackTrace(var26.toString(), var29);
				}
			} finally {
				if (Interpreter.field944) {
					Interpreter.field946 = true;
					Archive.method4470();
					Interpreter.field946 = false;
					Interpreter.field944 = false;
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					class223.RunException_sendStackTrace("Warning: Script " + var4.field1058 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-537848067"
	)
	static final boolean method3632() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "1567751606"
	)
	static int method3630(int var0, Script var1, boolean var2) {
		String var3;
		if (var0 == ScriptOpcodes.MES) {
			var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			class69.addGameMessage(0, "", var3);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			class16.Interpreter_intStackSize -= 2;
			class32.performPlayerAnimation(Varcs.localPlayer, Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field946) {
				Interpreter.field944 = true;
			}

			return 1;
		} else {
			int var10;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				var10 = 0;
				if (WorldMapArea.isNumber(var3)) {
					var10 = class69.method1168(var3);
				}

				PacketBufferNode var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field2213, Client.packetWriter.isaacCipher);
				var12.packetBuffer.writeInt(var10);
				Client.packetWriter.addNode(var12);
				return 1;
			} else {
				PacketBufferNode var14;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2243, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(var3.length() + 1);
					var14.packetBuffer.writeStringCp1252NullTerminated(var3);
					Client.packetWriter.addNode(var14);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2273, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(var3.length() + 1);
					var14.packetBuffer.writeStringCp1252NullTerminated(var3);
					Client.packetWriter.addNode(var14);
					return 1;
				} else {
					String var7;
					int var15;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var15 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						SoundCache.method889(var15, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class16.Interpreter_intStackSize -= 3;
						var15 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
						var10 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
						Widget var13 = class139.getWidget(var9);
						PcmPlayer.clickWidget(var13, var15, var10);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class16.Interpreter_intStackSize -= 2;
						var15 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
						var10 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
						Widget var11 = var2 ? FriendSystem.field905 : class4.field35;
						PcmPlayer.clickWidget(var11, var15, var10);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						MouseHandler.mouseCam = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Login.clientPreferences.roofsHidden ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						Login.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
						Message.savePreferences();
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
						class302.openURL(var3, var4, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var15 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2304, Client.packetWriter.isaacCipher);
						var14.packetBuffer.writeShort(var15);
						Client.packetWriter.addNode(var14);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var15 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStackSize -= 2;
						var7 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
						if (var7.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = ObjectComposition.getPacketBufferNode(ClientPacket.field2306, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + Friend.stringCp1252NullTerminatedByteSize(var7) + Friend.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.method6639(var15);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeStringCp1252NullTerminated(var7);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class207.setTapToDrop(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class27.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						class16.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						class16.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class16.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = InterfaceParent.canvasWidth;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = GameEngine.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class16.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class16.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field764 = 3;
						Client.field765 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field764 = 2;
						Client.field765 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field764 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field764 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field764 = 3;
						Client.field765 = var2 ? FriendSystem.field905.id : class4.field35.id;
						return 1;
					} else {
						boolean var16;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var16 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							Login.clientPreferences.hideUsername = var16;
							Message.savePreferences();
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Login.clientPreferences.hideUsername ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var16 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var16;
							if (!var16) {
								Login.clientPreferences.rememberedUsername = "";
								Message.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var16 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							if (var16 == Login.clientPreferences.titleMusicDisabled) {
								Login.clientPreferences.titleMusicDisabled = !var16;
								Message.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Login.clientPreferences.titleMusicDisabled ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class23.method345();
							return 1;
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class16.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class16.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class16.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class16.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class16.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class16.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class16.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class16.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class16.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--class16.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class16.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							var15 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize], 0), 100);
							MouseRecorder.method2109((double)((float)var15 / 200.0F + 0.5F));
							return 1;
						} else if (var0 == 3182) {
							float var8 = 200.0F * ((float)Login.clientPreferences.field1304 - 0.5F);
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 100 - Math.round(var8);
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							return 2;
						} else {
							--class16.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}
}
