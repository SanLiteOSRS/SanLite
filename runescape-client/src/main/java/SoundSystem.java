import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ar")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = 750792320
	)
	static int field288;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static ClanSettings field287;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 580143713
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Lak;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			MilliClock.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1003553351"
	)
	public static int method780(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lck;IIB)V",
		garbageValue = "-35"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (class6.isWorldMapEvent(var0.type)) {
			class7.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var5 = ItemComposition.WorldMapElement_get(class7.worldMapEvent.mapElement);
			var4 = ObjectSound.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var20 = (Integer)var3[0];
			var4 = InvDefinition.getScript(var20);
		}

		if (var4 != null) {
			class14.Interpreter_intStackSize = 0;
			class295.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field795 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;

			label989: {
				label990: {
					try {
						int var13;
						try {
							var30 = true;
							class28.Interpreter_intLocals = new int[var4.localIntCount];
							int var11 = 0;
							UserComparator7.Interpreter_stringLocals = new String[var4.localStringCount];
							int var12 = 0;

							int var14;
							String var21;
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

									class28.Interpreter_intLocals[var11++] = var14;
								} else if (var3[var13] instanceof String) {
									var21 = (String)var3[var13];
									if (var21.equals("event_opbase")) {
										var21 = var0.targetName;
									}

									UserComparator7.Interpreter_stringLocals[var12++] = var21;
								}
							}

							Interpreter.field798 = var0.field1024;

							while (true) {
								++var10;
								if (var10 > var1) {
									throw new RuntimeException();
								}

								++var20;
								int var33 = var6[var20];
								if (var33 >= 100) {
									boolean var35;
									if (var4.intOperands[var20] == 1) {
										var35 = true;
									} else {
										var35 = false;
									}

									var14 = AbstractWorldMapIcon.method4026(var33, var4, var35);
									switch(var14) {
									case 0:
										var30 = false;
										break label989;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException();
									}
								} else if (var33 == 0) {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7[var20];
								} else if (var33 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var33 == ScriptOpcodes.SET_VARP) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
									WorldMapLabelSize.changeGameOptions(var13);
								} else if (var33 == ScriptOpcodes.SCONST) {
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
								} else if (var33 == ScriptOpcodes.JUMP) {
									var20 += var7[var20];
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) {
									class14.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) {
									class14.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) {
									class14.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) {
									class14.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var4 = var40.script;
									var6 = var4.opcodes;
									var7 = var4.intOperands;
									var20 = var40.pc;
									class28.Interpreter_intLocals = var40.intLocals;
									UserComparator7.Interpreter_stringLocals = var40.stringLocals;
								} else if (var33 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class119.getVarbit(var13);
								} else if (var33 == ScriptOpcodes.SET_VARBIT) {
									var13 = var7[var20];
									class123.method2616(var13, Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) {
									class14.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) {
									class14.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class28.Interpreter_intLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.ISTORE) {
									class28.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
								} else if (var33 == ScriptOpcodes.SLOAD) {
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = UserComparator7.Interpreter_stringLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.SSTORE) {
									UserComparator7.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
								} else if (var33 == ScriptOpcodes.JOIN_STRING) {
									var13 = var7[var20];
									class295.Interpreter_stringStackSize -= var13;
									var21 = DynamicObject.method2003(Interpreter.Interpreter_stringStack, class295.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var21;
								} else if (var33 == ScriptOpcodes.POP_INT) {
									--class14.Interpreter_intStackSize;
								} else if (var33 == ScriptOpcodes.POP_STRING) {
									--class295.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) {
										if (var33 == ScriptOpcodes.GET_VARC_INT) {
											Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Message.varcs.getInt(var7[var20]);
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) {
											Message.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & 65535;
											int var24 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
											if (var24 < 0 || var24 > 5000) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24;
											byte var25 = -1;
											if (var14 == 105) {
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) {
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) {
											var13 = var7[var20];
											var14 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) {
											var13 = var7[var20];
											class14.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) {
												var22 = Message.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) {
												Message.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) {
												var22 = Message.varcs.getString(var7[var20]);
												Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) {
												Message.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.SWITCH) {
												IterableNodeHashTable var38 = var4.switches[var7[var20]];
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
												if (var37 != null) {
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) {
													var39 = field287.getTitleGroupValue(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var39;
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) {
														throw new IllegalStateException();
													}

													var39 = NPC.field1210.method6379(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var39;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var36 = InvDefinition.getScript(var13);
										int[] var15 = new int[var36.localIntCount];
										String[] var16 = new String[var36.localStringCount];

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (class14.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class295.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										class14.Interpreter_intStackSize -= var36.intArgumentCount;
										class295.Interpreter_stringStackSize -= var36.stringArgumentCount;
										ScriptFrame var23 = new ScriptFrame();
										var23.script = var4;
										var23.pc = var20;
										var23.intLocals = class28.Interpreter_intLocals;
										var23.stringLocals = UserComparator7.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
										var4 = var36;
										var6 = var36.opcodes;
										var7 = var36.intOperands;
										var20 = -1;
										class28.Interpreter_intLocals = var15;
										UserComparator7.Interpreter_stringLocals = var16;
									}
								}
							}
						} catch (Exception var31) {
							var9 = true;
							StringBuilder var27 = new StringBuilder(30);
							var27.append("").append(var4.key).append(" ");

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8);
							MilliClock.RunException_sendStackTrace(var27.toString(), var31);
							var30 = false;
							break label990;
						}
					} finally {
						if (var30) {
							if (Interpreter.field795) {
								Interpreter.field791 = true;
							}

							while (Interpreter.field797.size() > 0) {
								class92 var19 = (class92)Interpreter.field797.remove(0);
								GrandExchangeEvents.widgetDefaultMenuAction(var19.method2277(), var19.method2279(), var19.method2278(), var19.method2281(), "");
							}

							if (Interpreter.field791) {
								class14.method191();
								Interpreter.field791 = false;
								Interpreter.field795 = false;
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								MilliClock.RunException_sendStackTrace("Warning: Script " + var4.field928 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					if (Interpreter.field795) {
						Interpreter.field791 = true;
					}

					while (Interpreter.field797.size() > 0) {
						class92 var41 = (class92)Interpreter.field797.remove(0);
						GrandExchangeEvents.widgetDefaultMenuAction(var41.method2277(), var41.method2279(), var41.method2278(), var41.method2281(), "");
					}

					if (Interpreter.field791) {
						class14.method191();
						Interpreter.field791 = false;
						Interpreter.field795 = false;
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						MilliClock.RunException_sendStackTrace("Warning: Script " + var4.field928 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return;
				}

				if (Interpreter.field795) {
					Interpreter.field791 = true;
				}

				while (Interpreter.field797.size() > 0) {
					class92 var26 = (class92)Interpreter.field797.remove(0);
					GrandExchangeEvents.widgetDefaultMenuAction(var26.method2277(), var26.method2279(), var26.method2278(), var26.method2281(), "");
				}

				if (Interpreter.field791) {
					class14.method191();
					Interpreter.field791 = false;
					Interpreter.field795 = false;
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					MilliClock.RunException_sendStackTrace("Warning: Script " + var4.field928 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return;
			}

			if (Interpreter.field795) {
				Interpreter.field791 = true;
			}

			while (Interpreter.field797.size() > 0) {
				class92 var34 = (class92)Interpreter.field797.remove(0);
				GrandExchangeEvents.widgetDefaultMenuAction(var34.method2277(), var34.method2279(), var34.method2278(), var34.method2281(), "");
			}

			if (Interpreter.field791) {
				class14.method191();
				Interpreter.field791 = false;
				Interpreter.field795 = false;
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				MilliClock.RunException_sendStackTrace("Warning: Script " + var4.field928 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1676514787"
	)
	public static int method787(int var0) {
		return class21.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IB)Ljava/lang/String;",
		garbageValue = "-69"
	)
	static String method785(Widget var0, int var1) {
		int var3 = PendingSpawn.getWidgetFlags(var0);
		boolean var2 = (var3 >> var1 + 1 & 1) != 0;
		if (!var2 && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
		}
	}
}
