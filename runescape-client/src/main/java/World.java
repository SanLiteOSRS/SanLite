import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bg")
@Implements("World")
public class World {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1267509105
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1119546685
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("b")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("d")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1428153959
	)
	@Export("id")
	int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 264436593
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -508707417
	)
	@Export("population")
	int population;
	@ObfuscatedName("c")
	@Export("host")
	String host;
	@ObfuscatedName("e")
	@Export("activity")
	String activity;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1484367493
	)
	@Export("location")
	int location;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2005307775
	)
	@Export("index")
	int index;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2086816927"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1823181912"
	)
	boolean method1638() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1133674448"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1123465891"
	)
	boolean method1640() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "504803099"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "255"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	boolean method1643() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-577854303"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class5.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lcz;III)V",
		garbageValue = "704254621"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var19;
		if (NPC.isWorldMapEvent(var0.type)) {
			class69.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var5 = class6.WorldMapElement_get(class69.worldMapEvent.mapElement);
			var4 = class43.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var19 = (Integer)var3[0];
			var4 = ApproximateRouteStrategy.getScript(var19);
		}

		if (var4 != null) {
			class44.Interpreter_intStackSize = 0;
			Interpreter.Interpreter_stringStackSize = 0;
			var19 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field973 = false;
			boolean var9 = false;
			int var10 = 0;

			try {
				int var13;
				try {
					class368.Interpreter_intLocals = new int[var4.localIntCount];
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

							class368.Interpreter_intLocals[var11++] = var14;
						} else if (var3[var13] instanceof String) {
							var20 = (String)var3[var13];
							if (var20.equals("event_opbase")) {
								var20 = var0.targetName;
							}

							Interpreter.Interpreter_stringLocals[var12++] = var20;
						}
					}

					Interpreter.field987 = var0.field1180;

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

							var14 = IgnoreList.method5628(var31, var4, var32);
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
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7[var19];
						} else if (var31 == ScriptOpcodes.GET_VARP) {
							var13 = var7[var19];
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
						} else if (var31 == ScriptOpcodes.SET_VARP) {
							var13 = var7[var19];
							Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
							ApproximateRouteStrategy.changeGameOptions(var13);
						} else if (var31 == ScriptOpcodes.SCONST) {
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.stringOperands[var19];
						} else if (var31 == ScriptOpcodes.JUMP) {
							var19 += var7[var19];
						} else if (var31 == ScriptOpcodes.IF_ICMPNE) {
							class44.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPEQ) {
							class44.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPLT) {
							class44.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPGT) {
							class44.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]) {
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
							class368.Interpreter_intLocals = var37.intLocals;
							Interpreter.Interpreter_stringLocals = var37.stringLocals;
						} else if (var31 == ScriptOpcodes.GET_VARBIT) {
							var13 = var7[var19];
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Skeleton.getVarbit(var13);
						} else if (var31 == ScriptOpcodes.SET_VARBIT) {
							var13 = var7[var19];
							Login.method1951(var13, Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
						} else if (var31 == ScriptOpcodes.IF_ICMPLE) {
							class44.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPGE) {
							class44.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.ILOAD) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class368.Interpreter_intLocals[var7[var19]];
						} else if (var31 == ScriptOpcodes.ISTORE) {
							class368.Interpreter_intLocals[var7[var19]] = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
						} else if (var31 == ScriptOpcodes.SLOAD) {
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var19]];
						} else if (var31 == ScriptOpcodes.SSTORE) {
							Interpreter.Interpreter_stringLocals[var7[var19]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						} else if (var31 == ScriptOpcodes.JOIN_STRING) {
							var13 = var7[var19];
							Interpreter.Interpreter_stringStackSize -= var13;
							var20 = BuddyRankComparator.method2484(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var13);
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var20;
						} else if (var31 == ScriptOpcodes.POP_INT) {
							--class44.Interpreter_intStackSize;
						} else if (var31 == ScriptOpcodes.POP_STRING) {
							--Interpreter.Interpreter_stringStackSize;
						} else {
							int var17;
							if (var31 != ScriptOpcodes.INVOKE) {
								if (var31 == ScriptOpcodes.GET_VARC_INT) {
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.varcs.getInt(var7[var19]);
								} else if (var31 == ScriptOpcodes.SET_VARC_INT) {
									GrandExchangeOfferOwnWorldComparator.varcs.setInt(var7[var19], Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
								} else if (var31 == ScriptOpcodes.DEFINE_ARRAY) {
									var13 = var7[var19] >> 16;
									var14 = var7[var19] & 65535;
									int var23 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
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
									var14 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
								} else if (var31 == ScriptOpcodes.SET_ARRAY_INT) {
									var13 = var7[var19];
									class44.Interpreter_intStackSize -= 2;
									var14 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
								} else {
									String var21;
									if (var31 == ScriptOpcodes.GET_VARC_STRING_OLD) {
										var21 = GrandExchangeOfferOwnWorldComparator.varcs.getStringOld(var7[var19]);
										if (var21 == null) {
											var21 = "null";
										}

										Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21;
									} else if (var31 == ScriptOpcodes.SET_VARC_STRING_OLD) {
										GrandExchangeOfferOwnWorldComparator.varcs.setStringOld(var7[var19], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
									} else if (var31 == ScriptOpcodes.GET_VARC_STRING) {
										var21 = GrandExchangeOfferOwnWorldComparator.varcs.getString(var7[var19]);
										Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21;
									} else if (var31 == ScriptOpcodes.SET_VARC_STRING) {
										GrandExchangeOfferOwnWorldComparator.varcs.setString(var7[var19], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
									} else if (var31 == ScriptOpcodes.SWITCH) {
										IterableNodeHashTable var35 = var4.switches[var7[var19]];
										IntegerNode var34 = (IntegerNode)var35.get((long)Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
										if (var34 != null) {
											var19 += var34.integer;
										}
									} else {
										Integer var36;
										if (var31 == 74) {
											var36 = class26.field220.method101(var7[var19]);
											if (var36 == null) {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var36;
											}
										} else {
											if (var31 != 76) {
												throw new IllegalStateException();
											}

											var36 = class34.field254.method6014(var7[var19]);
											if (var36 == null) {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var36;
											}
										}
									}
								}
							} else {
								var13 = var7[var19];
								Script var33 = ApproximateRouteStrategy.getScript(var13);
								int[] var15 = new int[var33.localIntCount];
								String[] var16 = new String[var33.localStringCount];

								for (var17 = 0; var17 < var33.intArgumentCount; ++var17) {
									var15[var17] = Interpreter.Interpreter_intStack[var17 + (class44.Interpreter_intStackSize - var33.intArgumentCount)];
								}

								for (var17 = 0; var17 < var33.stringArgumentCount; ++var17) {
									var16[var17] = Interpreter.Interpreter_stringStack[var17 + (Interpreter.Interpreter_stringStackSize - var33.stringArgumentCount)];
								}

								class44.Interpreter_intStackSize -= var33.intArgumentCount;
								Interpreter.Interpreter_stringStackSize -= var33.stringArgumentCount;
								ScriptFrame var22 = new ScriptFrame();
								var22.script = var4;
								var22.pc = var19;
								var22.intLocals = class368.Interpreter_intLocals;
								var22.stringLocals = Interpreter.Interpreter_stringLocals;
								Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
								var4 = var33;
								var6 = var33.opcodes;
								var7 = var33.intOperands;
								var19 = -1;
								class368.Interpreter_intLocals = var15;
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
					class266.RunException_sendStackTrace(var26.toString(), var29);
				}
			} finally {
				if (Interpreter.field973) {
					Interpreter.field986 = true;
					class4.method47();
					Interpreter.field986 = false;
					Interpreter.field973 = false;
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					class266.RunException_sendStackTrace("Warning: Script " + var4.field1084 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "24074"
	)
	public static int method1685(int var0, int var1, int var2) {
		int var3 = CollisionMap.method3185(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1461307480"
	)
	public static boolean method1663(int var0) {
		return (var0 >> 30 & 1) != 0;
	}
}
