import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("df")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("v")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("y")
	@Export("map")
	Map map;
	@ObfuscatedName("j")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("o")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -4374446863144258723L
	)
	long field1382;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = SecureRandomFuture.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = Interpreter.method2009(var2);
			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (SecureRandomFuture.archive2.method5031(15)) {
			var2 = SecureRandomFuture.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "88"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-43"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-105"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "30"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1842220205"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "921484764"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1804190455"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) {
			this.strings[var1] = null;
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lnp;",
		garbageValue = "609461646"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class262.getPreferencesFile("2", class182.field2114.name, var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1876168838"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next();
				int var6 = (Integer)var5.getKey();
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += class44.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var23 = new Buffer(var2);
			var23.writeByte(2);
			var23.writeShort(var3);
			Iterator var24 = this.map.entrySet().iterator();

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next();
				int var13 = (Integer)var12.getKey();
				if (this.intsPersistence[var13]) {
					var23.writeShort(var13);
					Object var8 = var12.getValue();
					class375 var9 = class375.method6511(var8.getClass());
					var23.writeByte(var9.field4137);
					class375.method6512(var8, var23);
				}
			}

			var1.write(var23.array, 0, var23.offset);
		} catch (Exception var21) {
		} finally {
			try {
				var1.close();
			} catch (Exception var20) {
			}

		}

		this.unwrittenChanges = false;
		this.field1382 = ClientPacket.currentTimeMillis();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		try {
			byte[] var2 = new byte[(int)var1.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var1.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new EOFException();
				}
			}

			Buffer var15 = new Buffer(var2);
			if (var15.array.length - var15.offset < 1) {
				return;
			}

			int var16 = var15.readUnsignedByte();
			if (var16 < 0 || var16 > 2) {
				return;
			}

			int var7;
			int var8;
			int var9;
			int var17;
			if (var16 >= 2) {
				var17 = var15.readUnsignedShort();

				for (var7 = 0; var7 < var17; ++var7) {
					var8 = var15.readUnsignedShort();
					var9 = var15.readUnsignedByte();
					class375[] var10 = new class375[]{class375.field4128, class375.field4134, class375.field4127};
					class375 var11 = (class375)Clock.findEnumerated(var10, var9);
					Object var12 = var11.method6510(var15);
					if (this.intsPersistence[var8]) {
						this.map.put(var8, var12);
					}
				}
			} else {
				var17 = var15.readUnsignedShort();

				for (var7 = 0; var7 < var17; ++var7) {
					var8 = var15.readUnsignedShort();
					var9 = var15.readInt();
					if (this.intsPersistence[var8]) {
						this.map.put(var8, var9);
					}
				}

				var7 = var15.readUnsignedShort();

				for (var8 = 0; var8 < var7; ++var8) {
					var15.readUnsignedShort();
					var15.readStringCp1252NullTerminated();
				}
			}
		} catch (Exception var26) {
		} finally {
			try {
				var1.close();
			} catch (Exception var25) {
			}

		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1424878016"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1382 < ClientPacket.currentTimeMillis() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "262947682"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lcs;IIB)V",
		garbageValue = "-123"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (Message.isWorldMapEvent(var0.type)) {
			Occluder.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var5 = Archive.WorldMapElement_get(Occluder.worldMapEvent.mapElement);
			var4 = StructComposition.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var20 = (Integer)var3[0];
			var4 = class375.getScript(var20);
		}

		if (var4 != null) {
			ChatChannel.Interpreter_intStackSize = 0;
			UserComparator9.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field963 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;

			label985: {
				label986: {
					try {
						int var13;
						try {
							var30 = true;
							class231.Interpreter_intLocals = new int[var4.localIntCount];
							int var11 = 0;
							UrlRequester.Interpreter_stringLocals = new String[var4.localStringCount];
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

									class231.Interpreter_intLocals[var11++] = var14;
								} else if (var3[var13] instanceof String) {
									var21 = (String)var3[var13];
									if (var21.equals("event_opbase")) {
										var21 = var0.targetName;
									}

									UrlRequester.Interpreter_stringLocals[var12++] = var21;
								}
							}

							Interpreter.field966 = var0.field1154;

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

									var14 = class7.method88(var33, var4, var35);
									switch(var14) {
									case 0:
										var30 = false;
										break label986;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException();
									}
								} else if (var33 == 0) {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7[var20];
								} else if (var33 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var33 == ScriptOpcodes.SET_VARP) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
									class6.changeGameOptions(var13);
								} else if (var33 == ScriptOpcodes.SCONST) {
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
								} else if (var33 == ScriptOpcodes.JUMP) {
									var20 += var7[var20];
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) {
									ChatChannel.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) {
									ChatChannel.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) {
									ChatChannel.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) {
									ChatChannel.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]) {
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
									class231.Interpreter_intLocals = var40.intLocals;
									UrlRequester.Interpreter_stringLocals = var40.stringLocals;
								} else if (var33 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ScriptFrame.getVarbit(var13);
								} else if (var33 == ScriptOpcodes.SET_VARBIT) {
									var13 = var7[var20];
									Archive.method5060(var13, Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) {
									ChatChannel.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) {
									ChatChannel.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class231.Interpreter_intLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.ISTORE) {
									class231.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
								} else if (var33 == ScriptOpcodes.SLOAD) {
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = UrlRequester.Interpreter_stringLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.SSTORE) {
									UrlRequester.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
								} else if (var33 == ScriptOpcodes.JOIN_STRING) {
									var13 = var7[var20];
									UserComparator9.Interpreter_stringStackSize -= var13;
									var21 = class96.method2203(Interpreter.Interpreter_stringStack, UserComparator9.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var21;
								} else if (var33 == ScriptOpcodes.POP_INT) {
									--ChatChannel.Interpreter_intStackSize;
								} else if (var33 == ScriptOpcodes.POP_STRING) {
									--UserComparator9.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) {
										if (var33 == ScriptOpcodes.GET_VARC_INT) {
											Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class20.varcs.getInt(var7[var20]);
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) {
											class20.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & 65535;
											int var24 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
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
											var14 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) {
											var13 = var7[var20];
											ChatChannel.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) {
												var22 = class20.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) {
												class20.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) {
												var22 = class20.varcs.getString(var7[var20]);
												Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) {
												class20.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.SWITCH) {
												IterableNodeHashTable var38 = var4.switches[var7[var20]];
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
												if (var37 != null) {
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == 74) {
													var39 = DirectByteArrayCopier.field3128.getTitleGroupValue(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var39;
													}
												} else {
													if (var33 != 76) {
														throw new IllegalStateException();
													}

													var39 = class10.field74.method6047(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var39;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var36 = class375.getScript(var13);
										int[] var15 = new int[var36.localIntCount];
										String[] var16 = new String[var36.localStringCount];

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (ChatChannel.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (UserComparator9.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										ChatChannel.Interpreter_intStackSize -= var36.intArgumentCount;
										UserComparator9.Interpreter_stringStackSize -= var36.stringArgumentCount;
										ScriptFrame var23 = new ScriptFrame();
										var23.script = var4;
										var23.pc = var20;
										var23.intLocals = class231.Interpreter_intLocals;
										var23.stringLocals = UrlRequester.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
										var4 = var36;
										var6 = var36.opcodes;
										var7 = var36.intOperands;
										var20 = -1;
										class231.Interpreter_intLocals = var15;
										UrlRequester.Interpreter_stringLocals = var16;
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
							FriendsChatManager.RunException_sendStackTrace(var27.toString(), var31);
							var30 = false;
							break label985;
						}
					} finally {
						if (var30) {
							if (Interpreter.field963) {
								Interpreter.field951 = true;
							}

							while (Interpreter.field965.size() > 0) {
								class106 var19 = (class106)Interpreter.field965.remove(0);
								MouseHandler.widgetDefaultMenuAction(var19.method2375(), var19.method2360(), var19.method2367(), var19.method2363(), "");
							}

							if (Interpreter.field951) {
								class20.method288();
								Interpreter.field951 = false;
								Interpreter.field963 = false;
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								FriendsChatManager.RunException_sendStackTrace("Warning: Script " + var4.field1069 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					if (Interpreter.field963) {
						Interpreter.field951 = true;
					}

					while (Interpreter.field965.size() > 0) {
						class106 var41 = (class106)Interpreter.field965.remove(0);
						MouseHandler.widgetDefaultMenuAction(var41.method2375(), var41.method2360(), var41.method2367(), var41.method2363(), "");
					}

					if (Interpreter.field951) {
						class20.method288();
						Interpreter.field951 = false;
						Interpreter.field963 = false;
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						FriendsChatManager.RunException_sendStackTrace("Warning: Script " + var4.field1069 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return;
				}

				if (Interpreter.field963) {
					Interpreter.field951 = true;
				}

				while (Interpreter.field965.size() > 0) {
					class106 var34 = (class106)Interpreter.field965.remove(0);
					MouseHandler.widgetDefaultMenuAction(var34.method2375(), var34.method2360(), var34.method2367(), var34.method2363(), "");
				}

				if (Interpreter.field951) {
					class20.method288();
					Interpreter.field951 = false;
					Interpreter.field963 = false;
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					FriendsChatManager.RunException_sendStackTrace("Warning: Script " + var4.field1069 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return;
			}

			if (Interpreter.field963) {
				Interpreter.field951 = true;
			}

			while (Interpreter.field965.size() > 0) {
				class106 var26 = (class106)Interpreter.field965.remove(0);
				MouseHandler.widgetDefaultMenuAction(var26.method2375(), var26.method2360(), var26.method2367(), var26.method2363(), "");
			}

			if (Interpreter.field951) {
				class20.method288();
				Interpreter.field951 = false;
				Interpreter.field963 = false;
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				FriendsChatManager.RunException_sendStackTrace("Warning: Script " + var4.field1069 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	}
}
