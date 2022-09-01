import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("br")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	static Widget[] field840;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1041078891
	)
	@Export("id")
	int id;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -246267537
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -524141109
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1314923763
	)
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1223834635
	)
	@Export("y")
	int y;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 717022905
	)
	@Export("z")
	int z;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2064090513
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 557446605
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("n")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0; // L: 16
		this.frameCycle = 0; // L: 17
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3; // L: 23
		this.y = var4; // L: 24
		this.z = var5; // L: 25
		this.cycleStart = var7 + var6; // L: 26
		int var8 = ArchiveDisk.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = ByteArrayPool.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 38
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) { // L: 39
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 40
					++this.frame; // L: 41
					if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 42
						this.isFinished = true; // L: 43
						break;
					}
				}
			} else {
				this.frame += var1; // L: 49
				if (this.frame >= this.sequenceDefinition.method3729()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lhp;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ArchiveDisk.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lco;III)V",
		garbageValue = "-828737390"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 121
		Script var4;
		int var20;
		if (ByteArrayPool.isWorldMapEvent(var0.type)) { // L: 123
			class160.worldMapEvent = (WorldMapEvent)var3[0]; // L: 124
			WorldMapElement var5 = EnumComposition.WorldMapElement_get(class160.worldMapEvent.mapElement); // L: 125
			var4 = class127.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 126
		} else {
			var20 = (Integer)var3[0]; // L: 129
			var4 = class10.getScript(var20); // L: 130
		}

		if (var4 != null) { // L: 132
			Nameable.Interpreter_intStackSize = 0; // L: 135
			UserComparator8.Interpreter_stringStackSize = 0; // L: 136
			var20 = -1; // L: 137
			int[] var6 = var4.opcodes; // L: 138
			int[] var7 = var4.intOperands; // L: 139
			byte var8 = -1; // L: 140
			Interpreter.Interpreter_frameDepth = 0; // L: 141
			Interpreter.field820 = false; // L: 142
			boolean var9 = false; // L: 143
			int var10 = 0; // L: 144
			boolean var30 = false;

			label954: {
				label955: {
					try {
						int var13;
						try {
							var30 = true; // L: 146
							Interpreter.Interpreter_intLocals = new int[var4.localIntCount]; // L: 147
							int var11 = 0; // L: 148
							Interpreter.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 149
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) { // L: 150
								if (var3[var13] instanceof Integer) { // L: 151
									var14 = (Integer)var3[var13]; // L: 152
									if (var14 == -2147483647) { // L: 153
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) { // L: 154
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) { // L: 155
										var14 = var0.widget != null ? var0.widget.id : -1;
									}

									if (var14 == -2147483644) { // L: 156
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 157
										var14 = var0.widget != null ? var0.widget.childIndex : -1;
									}

									if (var14 == -2147483642) { // L: 158
										var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
									}

									if (var14 == -2147483641) { // L: 159
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
									}

									if (var14 == -2147483640) { // L: 160
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 161
										var14 = var0.keyPressed;
									}

									Interpreter.Interpreter_intLocals[var11++] = var14; // L: 162
								} else if (var3[var13] instanceof String) { // L: 164
									var21 = (String)var3[var13]; // L: 165
									if (var21.equals("event_opbase")) { // L: 166
										var21 = var0.targetName;
									}

									Interpreter.Interpreter_stringLocals[var12++] = var21; // L: 167
								}
							}

							Interpreter.field830 = var0.field1039; // L: 171

							while (true) {
								++var10; // L: 173
								if (var10 > var1) { // L: 174
									throw new RuntimeException();
								}

								++var20; // L: 175
								int var33 = var6[var20];
								if (var33 >= 100) { // L: 176
									boolean var35;
									if (var4.intOperands[var20] == 1) { // L: 394
										var35 = true;
									} else {
										var35 = false; // L: 395
									}

									var14 = InvDefinition.method3279(var33, var4, var35); // L: 396
									switch(var14) { // L: 397
									case 0:
										var30 = false;
										break label954;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 402
									}
								} else if (var33 == 0) { // L: 177
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7[var20]; // L: 178
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 181
									var13 = var7[var20]; // L: 182
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 183
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 186
									var13 = var7[var20]; // L: 187
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 188
									class300.changeGameOptions(var13); // L: 189
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 192
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 193
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 196
									var20 += var7[var20]; // L: 197
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 200
									Nameable.Interpreter_intStackSize -= 2; // L: 201
									if (Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]) { // L: 202
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 205
									Nameable.Interpreter_intStackSize -= 2; // L: 206
									if (Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]) { // L: 207
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 210
									Nameable.Interpreter_intStackSize -= 2; // L: 211
									if (Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]) { // L: 212
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 215
									Nameable.Interpreter_intStackSize -= 2; // L: 216
									if (Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]) { // L: 217
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 220
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 222
									var4 = var40.script; // L: 223
									var6 = var4.opcodes; // L: 224
									var7 = var4.intOperands; // L: 225
									var20 = var40.pc; // L: 226
									Interpreter.Interpreter_intLocals = var40.intLocals; // L: 227
									Interpreter.Interpreter_stringLocals = var40.stringLocals; // L: 228
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 231
									var13 = var7[var20]; // L: 232
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class133.getVarbit(var13); // L: 233
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 236
									var13 = var7[var20];
									class220.method4448(var13, Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]);
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 241
									Nameable.Interpreter_intStackSize -= 2; // L: 242
									if (Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]) { // L: 243
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 246
									Nameable.Interpreter_intStackSize -= 2; // L: 247
									if (Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]) { // L: 248
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 251
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]]; // L: 252
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 255
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 256
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 259
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]]; // L: 260
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 263
									Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 264
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 267
									var13 = var7[var20]; // L: 268
									UserComparator8.Interpreter_stringStackSize -= var13; // L: 269
									var21 = DynamicObject.method1949(Interpreter.Interpreter_stringStack, UserComparator8.Interpreter_stringStackSize, var13); // L: 270
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var21; // L: 271
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 274
									--Nameable.Interpreter_intStackSize; // L: 275
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 278
									--UserComparator8.Interpreter_stringStackSize; // L: 279
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 282
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 305
											Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class341.varcs.getInt(var7[var20]); // L: 306
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 309
											class341.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 310
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 313
											var13 = var7[var20] >> 16; // L: 314
											var14 = var7[var20] & 65535; // L: 315
											int var24 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 316
											if (var24 < 0 || var24 > 5000) { // L: 317
												throw new RuntimeException(); // L: 318
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24; // L: 320
											byte var25 = -1; // L: 321
											if (var14 == 105) { // L: 322
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) { // L: 323
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) { // L: 326
											var13 = var7[var20]; // L: 327
											var14 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 328
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 329
												throw new RuntimeException(); // L: 330
											}

											Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 332
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 335
											var13 = var7[var20]; // L: 336
											Nameable.Interpreter_intStackSize -= 2; // L: 337
											var14 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 338
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 339
												throw new RuntimeException(); // L: 340
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 342
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 345
												var22 = class341.varcs.getStringOld(var7[var20]); // L: 346
												if (var22 == null) { // L: 347
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var22; // L: 348
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 351
												class341.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]); // L: 352
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 355
												var22 = class341.varcs.getString(var7[var20]); // L: 356
												Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var22; // L: 357
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 360
												class341.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]); // L: 361
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 364
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 365
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 366
												if (var37 != null) { // L: 367
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 370
													var39 = Messages.field1326.getTitleGroupValue(var7[var20]); // L: 371
													if (var39 == null) { // L: 372
														Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 373
													} else {
														Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var39; // L: 376
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 380
														throw new IllegalStateException(); // L: 390
													}

													var39 = Coord.field3318.method7008(var7[var20]); // L: 381
													if (var39 == null) { // L: 382
														Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 383
													} else {
														Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var39; // L: 386
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 283
										Script var36 = class10.getScript(var13); // L: 284
										int[] var15 = new int[var36.localIntCount]; // L: 285
										String[] var16 = new String[var36.localStringCount]; // L: 286

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 287
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (Nameable.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 288
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (UserComparator8.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										Nameable.Interpreter_intStackSize -= var36.intArgumentCount; // L: 289
										UserComparator8.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 290
										ScriptFrame var23 = new ScriptFrame(); // L: 291
										var23.script = var4; // L: 292
										var23.pc = var20; // L: 293
										var23.intLocals = Interpreter.Interpreter_intLocals; // L: 294
										var23.stringLocals = Interpreter.Interpreter_stringLocals; // L: 295
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 296
										var4 = var36; // L: 297
										var6 = var36.opcodes; // L: 298
										var7 = var36.intOperands; // L: 299
										var20 = -1; // L: 300
										Interpreter.Interpreter_intLocals = var15; // L: 301
										Interpreter.Interpreter_stringLocals = var16; // L: 302
									}
								}
							}
						} catch (Exception var31) { // L: 410
							var9 = true; // L: 411
							StringBuilder var27 = new StringBuilder(30); // L: 413
							var27.append("").append(var4.key).append(" "); // L: 414

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 415
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8); // L: 416
							class33.RunException_sendStackTrace(var27.toString(), var31); // L: 417
							var30 = false;
							break label955;
						}
					} finally {
						if (var30) {
							while (Interpreter.field831.size() > 0) {
								class93 var19 = (class93)Interpreter.field831.remove(0); // L: 422
								ArchiveDiskAction.widgetDefaultMenuAction(var19.method2354(), var19.method2346(), var19.method2352(), var19.method2347(), "");
							}

							if (Interpreter.field820) { // L: 425
								Interpreter.field820 = false; // L: 426
								WorldMapID.method4919(); // L: 427
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								class33.RunException_sendStackTrace("Warning: Script " + var4.field952 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field831.size() > 0) {
						class93 var41 = (class93)Interpreter.field831.remove(0);
						ArchiveDiskAction.widgetDefaultMenuAction(var41.method2354(), var41.method2346(), var41.method2352(), var41.method2347(), "");
					}

					if (Interpreter.field820) {
						Interpreter.field820 = false;
						WorldMapID.method4919();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						class33.RunException_sendStackTrace("Warning: Script " + var4.field952 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return; // L: 221
				}

				while (Interpreter.field831.size() > 0) { // L: 421
					class93 var26 = (class93)Interpreter.field831.remove(0);
					ArchiveDiskAction.widgetDefaultMenuAction(var26.method2354(), var26.method2346(), var26.method2352(), var26.method2347(), "");
				}

				if (Interpreter.field820) {
					Interpreter.field820 = false;
					WorldMapID.method4919();
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					class33.RunException_sendStackTrace("Warning: Script " + var4.field952 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return; // L: 433
			}

			while (Interpreter.field831.size() > 0) {
				class93 var34 = (class93)Interpreter.field831.remove(0);
				ArchiveDiskAction.widgetDefaultMenuAction(var34.method2354(), var34.method2346(), var34.method2352(), var34.method2347(), ""); // L: 423
			}

			if (Interpreter.field820) {
				Interpreter.field820 = false;
				WorldMapID.method4919();
			}

			if (!var9 && var2 > 0 && var10 >= var2) { // L: 429
				class33.RunException_sendStackTrace("Warning: Script " + var4.field952 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 430
			}

		}
	} // L: 133 399

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lqe;",
		garbageValue = "-437393904"
	)
	static IndexedSprite method1852(boolean var0, boolean var1) {
		return var0 ? (var1 ? KeyHandler.field127 : VerticalAlignment.options_buttons_2Sprite) : (var1 ? Login.field874 : class29.options_buttons_0Sprite); // L: 265
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)Lbd;",
		garbageValue = "-9933"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 237
		return FriendSystem.getNextWorldListWorld(); // L: 238
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1518456316"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ParamComposition.loadInterface(var0)) { // L: 10772
			Coord.updateInterface(class358.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 10773
		}
	} // L: 10774

	public GraphicsObject() {
	}
}
