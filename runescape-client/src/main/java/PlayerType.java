import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nz")
@Implements("PlayerType")
public enum PlayerType implements class356 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	field4172(6, 22, false, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	field4173(7, 41, false, false, true),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	field4174(8, 42, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	field4175(9, 43, false, false, true),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	field4176(10, 44, false, false, true),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	field4186(11, 45, false, false, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	field4178(12, 46, false, false, true),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	field4181(13, 47, false, false, true),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	field4179(14, 48, false, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	field4170(15, 49, false, false, true),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	field4182(16, 52, false, false, true);

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -897643501
	)
	@Export("id")
	final int id;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2138745227
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("as")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("aj")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 34
		this.modIcon = var4; // L: 35
		this.isPrivileged = var6; // L: 36
		this.isUser = var7; // L: 37
	} // L: 38

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 42
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldr;III)V",
		garbageValue = "637714632"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 107
		Script var4;
		int var20;
		if (class292.isWorldMapEvent(var0.type)) { // L: 109
			ByteArrayPool.worldMapEvent = (WorldMapEvent)var3[0]; // L: 110
			WorldMapElement var5 = class354.WorldMapElement_get(ByteArrayPool.worldMapEvent.mapElement); // L: 111
			var4 = class151.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 112
		} else {
			var20 = (Integer)var3[0]; // L: 115
			var4 = AbstractByteArrayCopier.getScript(var20); // L: 116
		}

		if (var4 != null) { // L: 118
			Interpreter.Interpreter_intStackSize = 0; // L: 121
			SecureRandomCallable.Interpreter_stringStackSize = 0; // L: 122
			var20 = -1; // L: 123
			int[] var6 = var4.opcodes; // L: 124
			int[] var7 = var4.intOperands; // L: 125
			byte var8 = -1; // L: 126
			Interpreter.Interpreter_frameDepth = 0; // L: 127
			Interpreter.field849 = false; // L: 128
			boolean var9 = false; // L: 129
			int var10 = 0; // L: 130
			boolean var30 = false;

			label952: {
				label953: {
					try {
						int var13;
						try {
							var30 = true; // L: 132
							Interpreter.Interpreter_intLocals = new int[var4.localIntCount]; // L: 133
							int var11 = 0; // L: 134
							Interpreter.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 135
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) { // L: 136
								if (var3[var13] instanceof Integer) { // L: 137
									var14 = (Integer)var3[var13]; // L: 138
									if (var14 == -2147483647) { // L: 139
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) { // L: 140
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) { // L: 141
										var14 = var0.widget != null ? var0.widget.id : -1;
									}

									if (var14 == -2147483644) { // L: 142
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 143
										var14 = var0.widget != null ? var0.widget.childIndex : -1;
									}

									if (var14 == -2147483642) { // L: 144
										var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
									}

									if (var14 == -2147483641) { // L: 145
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
									}

									if (var14 == -2147483640) { // L: 146
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 147
										var14 = var0.keyPressed;
									}

									Interpreter.Interpreter_intLocals[var11++] = var14; // L: 148
								} else if (var3[var13] instanceof String) { // L: 150
									var21 = (String)var3[var13]; // L: 151
									if (var21.equals("event_opbase")) { // L: 152
										var21 = var0.targetName;
									}

									Interpreter.Interpreter_stringLocals[var12++] = var21; // L: 153
								}
							}

							Interpreter.field852 = var0.field1049; // L: 157

							label936:
							while (true) {
								++var10; // L: 159
								if (var10 > var1) { // L: 160
									throw new RuntimeException();
								}

								++var20; // L: 161
								int var33 = var6[var20];
								if (var33 >= 100) { // L: 162
									boolean var35;
									if (var4.intOperands[var20] == 1) { // L: 380
										var35 = true;
									} else {
										var35 = false; // L: 381
									}

									var14 = class33.method511(var33, var4, var35); // L: 382
									switch(var14) { // L: 383
									case 0:
										var30 = false;
										break label936;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 388
									}
								} else if (var33 == ScriptOpcodes.ICONST) { // L: 163
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var20]; // L: 164
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 167
									var13 = var7[var20]; // L: 168
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 169
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 172
									var13 = var7[var20]; // L: 173
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 174
									class7.changeGameOptions(var13); // L: 175
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 178
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 179
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 182
									var20 += var7[var20]; // L: 183
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 186
									Interpreter.Interpreter_intStackSize -= 2; // L: 187
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 188
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 191
									Interpreter.Interpreter_intStackSize -= 2; // L: 192
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 193
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 196
									Interpreter.Interpreter_intStackSize -= 2; // L: 197
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 198
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 201
									Interpreter.Interpreter_intStackSize -= 2; // L: 202
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 203
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 206
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break label953;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 208
									var4 = var40.script; // L: 209
									var6 = var4.opcodes; // L: 210
									var7 = var4.intOperands; // L: 211
									var20 = var40.pc; // L: 212
									Interpreter.Interpreter_intLocals = var40.intLocals; // L: 213
									Interpreter.Interpreter_stringLocals = var40.stringLocals; // L: 214
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 217
									var13 = var7[var20]; // L: 218
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class252.getVarbit(var13); // L: 219
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 222
									var13 = var7[var20]; // L: 223
									class283.method5685(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 224
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 227
									Interpreter.Interpreter_intStackSize -= 2; // L: 228
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 229
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 232
									Interpreter.Interpreter_intStackSize -= 2; // L: 233
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 234
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 237
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]]; // L: 238
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 241
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 242
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 245
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]]; // L: 246
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 249
									Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 250
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 253
									var13 = var7[var20]; // L: 254
									SecureRandomCallable.Interpreter_stringStackSize -= var13; // L: 255
									var21 = WorldMapSprite.method5468(Interpreter.Interpreter_stringStack, SecureRandomCallable.Interpreter_stringStackSize, var13); // L: 256
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var21; // L: 257
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 260
									--Interpreter.Interpreter_intStackSize; // L: 261
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 264
									--SecureRandomCallable.Interpreter_stringStackSize; // L: 265
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 268
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 291
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class373.varcs.getInt(var7[var20]); // L: 292
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 295
											class373.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 296
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 299
											var13 = var7[var20] >> 16; // L: 300
											var14 = var7[var20] & 65535; // L: 301
											int var24 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 302
											if (var24 < 0 || var24 > 5000) { // L: 303
												throw new RuntimeException(); // L: 304
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24; // L: 306
											byte var25 = -1; // L: 307
											if (var14 == 105) { // L: 308
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) { // L: 309
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) { // L: 312
											var13 = var7[var20]; // L: 313
											var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 314
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 315
												throw new RuntimeException(); // L: 316
											}

											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 318
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 321
											var13 = var7[var20]; // L: 322
											Interpreter.Interpreter_intStackSize -= 2; // L: 323
											var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 324
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 325
												throw new RuntimeException(); // L: 326
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 328
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 331
												var22 = class373.varcs.getStringOld(var7[var20]); // L: 332
												if (var22 == null) { // L: 333
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var22; // L: 334
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 337
												class373.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]); // L: 338
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 341
												var22 = class373.varcs.getString(var7[var20]); // L: 342
												Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var22; // L: 343
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 346
												class373.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]); // L: 347
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 350
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 351
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 352
												if (var37 != null) { // L: 353
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 356
													var39 = class133.field1597.getTitleGroupValue(var7[var20]); // L: 357
													if (var39 == null) { // L: 358
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 359
													} else {
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var39; // L: 362
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 366
														throw new IllegalStateException(); // L: 376
													}

													var39 = Players.field1339.method8280(var7[var20]); // L: 367
													if (var39 == null) { // L: 368
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 369
													} else {
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var39; // L: 372
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 269
										Script var36 = AbstractByteArrayCopier.getScript(var13); // L: 270
										int[] var15 = new int[var36.localIntCount]; // L: 271
										String[] var16 = new String[var36.localStringCount]; // L: 272

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 273
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 274
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (SecureRandomCallable.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										Interpreter.Interpreter_intStackSize -= var36.intArgumentCount; // L: 275
										SecureRandomCallable.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 276
										ScriptFrame var23 = new ScriptFrame(); // L: 277
										var23.script = var4; // L: 278
										var23.pc = var20; // L: 279
										var23.intLocals = Interpreter.Interpreter_intLocals; // L: 280
										var23.stringLocals = Interpreter.Interpreter_stringLocals; // L: 281
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 282
										var4 = var36; // L: 283
										var6 = var36.opcodes; // L: 284
										var7 = var36.intOperands; // L: 285
										var20 = -1; // L: 286
										Interpreter.Interpreter_intLocals = var15; // L: 287
										Interpreter.Interpreter_stringLocals = var16; // L: 288
									}
								}
							}
						} catch (Exception var31) { // L: 396
							var9 = true; // L: 397
							StringBuilder var27 = new StringBuilder(30); // L: 399
							var27.append("").append(var4.key).append(" "); // L: 400

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 401
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8); // L: 402
							class387.RunException_sendStackTrace(var27.toString(), var31); // L: 403
							var30 = false;
							break label952;
						}
					} finally {
						if (var30) {
							while (Interpreter.field837.size() > 0) {
								class97 var19 = (class97)Interpreter.field837.remove(0); // L: 408
								Message.widgetDefaultMenuAction(var19.method2639(), var19.method2637(), var19.method2638(), var19.method2641(), "");
							}

							if (Interpreter.field849) { // L: 411
								Interpreter.field849 = false; // L: 412
								class148.method3291(); // L: 413
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								class387.RunException_sendStackTrace("Warning: Script " + var4.field961 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field837.size() > 0) {
						class97 var34 = (class97)Interpreter.field837.remove(0);
						Message.widgetDefaultMenuAction(var34.method2639(), var34.method2637(), var34.method2638(), var34.method2641(), ""); // L: 409
					}

					if (Interpreter.field849) {
						Interpreter.field849 = false;
						class148.method3291();
					}

					if (!var9 && var2 > 0 && var10 >= var2) { // L: 415
						class387.RunException_sendStackTrace("Warning: Script " + var4.field961 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 416
					}

					return; // L: 391
				}

				while (Interpreter.field837.size() > 0) {
					class97 var41 = (class97)Interpreter.field837.remove(0);
					Message.widgetDefaultMenuAction(var41.method2639(), var41.method2637(), var41.method2638(), var41.method2641(), "");
				}

				if (Interpreter.field849) {
					Interpreter.field849 = false;
					class148.method3291();
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					class387.RunException_sendStackTrace("Warning: Script " + var4.field961 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return; // L: 207
			}

			while (Interpreter.field837.size() > 0) { // L: 407
				class97 var26 = (class97)Interpreter.field837.remove(0);
				Message.widgetDefaultMenuAction(var26.method2639(), var26.method2637(), var26.method2638(), var26.method2641(), "");
			}

			if (Interpreter.field849) {
				Interpreter.field849 = false;
				class148.method3291();
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				class387.RunException_sendStackTrace("Warning: Script " + var4.field961 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	} // L: 119 419
}
