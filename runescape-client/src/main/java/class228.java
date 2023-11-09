import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hh")
public class class228 implements WorldMapSection {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1137527527
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -447110187
	)
	int field2753;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1595498255
	)
	int field2755;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -993180361
	)
	int field2749;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1794557413
	)
	int field2758;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -398812335
	)
	int field2751;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -378030261
	)
	int field2752;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 354692025
	)
	int field2750;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -224048583
	)
	int field2748;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1887176703
	)
	int field2757;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 431737037
	)
	int field2756;

	class228() {
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhw;B)V",
		garbageValue = "11"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2751) { // L: 22
			var1.regionLowX = this.field2751;
		}

		if (var1.regionHighX < this.field2751) {
			var1.regionHighX = this.field2751; // L: 23
		}

		if (var1.regionLowY > this.field2752) { // L: 24
			var1.regionLowY = this.field2752;
		}

		if (var1.regionHighY < this.field2752) { // L: 25
			var1.regionHighY = this.field2752;
		}

	} // L: 26

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1974716574"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2753 && var1 < this.field2755 + this.field2753) { // L: 30
			return var2 >= (this.field2749 << 6) + (this.field2750 << 3) && var2 <= (this.field2749 << 6) + (this.field2750 << 3) + 7 && var3 >= (this.field2758 << 6) + (this.field2748 << 3) && var3 <= (this.field2758 << 6) + (this.field2748 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "819062651"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2751 << 6) + (this.field2757 << 3) && var1 <= (this.field2751 << 6) + (this.field2757 << 3) + 7 && var2 >= (this.field2752 << 6) + (this.field2756 << 3) && var2 <= (this.field2752 << 6) + (this.field2756 << 3) + 7; // L: 38
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "24"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2751 * 64 - this.field2749 * 64 + var2 + (this.field2757 * 8 - this.field2750 * 8), var3 + (this.field2752 * 64 - this.field2758 * 64) + (this.field2756 * 8 - this.field2748 * 8)}; // L: 46
			return var4; // L: 49
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Lkp;",
		garbageValue = "-711503187"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2749 * 64 - this.field2751 * 64 + (this.field2750 * 8 - this.field2757 * 8) + var1;
			int var4 = this.field2758 * 64 - this.field2752 * 64 + var2 + (this.field2748 * 8 - this.field2756 * 8); // L: 58
			return new Coord(this.field2753, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqw;B)V",
		garbageValue = "84"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2753 = var1.readUnsignedByte(); // L: 64
		this.field2755 = var1.readUnsignedByte(); // L: 65
		this.field2749 = var1.readUnsignedShort(); // L: 66
		this.field2750 = var1.readUnsignedByte(); // L: 67
		this.field2758 = var1.readUnsignedShort(); // L: 68
		this.field2748 = var1.readUnsignedByte(); // L: 69
		this.field2751 = var1.readUnsignedShort(); // L: 70
		this.field2757 = var1.readUnsignedByte(); // L: 71
		this.field2752 = var1.readUnsignedShort(); // L: 72
		this.field2756 = var1.readUnsignedByte(); // L: 73
		this.method4853(); // L: 74
	} // L: 75

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	void method4853() {
	} // L: 77

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lci;III)V",
		garbageValue = "418826083"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 120
		Script var4;
		int var20;
		if (WorldMapRectangle.isWorldMapEvent(var0.type)) { // L: 122
			class83.worldMapEvent = (WorldMapEvent)var3[0]; // L: 123
			WorldMapElement var5 = TileItem.WorldMapElement_get(class83.worldMapEvent.mapElement); // L: 124
			var4 = DevicePcmPlayerProvider.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 125
		} else {
			var20 = (Integer)var3[0]; // L: 128
			var4 = Message.getScript(var20); // L: 129
		}

		if (var4 != null) { // L: 131
			TaskHandler.Interpreter_intStackSize = 0; // L: 134
			GrandExchangeOfferAgeComparator.Interpreter_stringStackSize = 0; // L: 135
			var20 = -1; // L: 136
			int[] var6 = var4.opcodes; // L: 137
			int[] var7 = var4.intOperands; // L: 138
			byte var8 = -1; // L: 139
			Interpreter.Interpreter_frameDepth = 0; // L: 140
			Interpreter.field831 = false; // L: 141
			boolean var9 = false; // L: 142
			int var10 = 0; // L: 143
			boolean var30 = false;

			label951: {
				label952: {
					try {
						int var13;
						try {
							var30 = true; // L: 145
							Interpreter.Interpreter_intLocals = new int[var4.localIntCount]; // L: 146
							int var11 = 0; // L: 147
							Interpreter.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 148
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) { // L: 149
								if (var3[var13] instanceof Integer) { // L: 150
									var14 = (Integer)var3[var13]; // L: 151
									if (var14 == -2147483647) { // L: 152
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) { // L: 153
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) { // L: 154
										var14 = var0.widget != null ? var0.widget.id : -1;
									}

									if (var14 == -2147483644) { // L: 155
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 156
										var14 = var0.widget != null ? var0.widget.childIndex : -1;
									}

									if (var14 == -2147483642) { // L: 157
										var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
									}

									if (var14 == -2147483641) { // L: 158
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
									}

									if (var14 == -2147483640) { // L: 159
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 160
										var14 = var0.keyPressed;
									}

									Interpreter.Interpreter_intLocals[var11++] = var14; // L: 161
								} else if (var3[var13] instanceof String) { // L: 163
									var21 = (String)var3[var13]; // L: 164
									if (var21.equals("event_opbase")) { // L: 165
										var21 = var0.targetName;
									}

									Interpreter.Interpreter_stringLocals[var12++] = var21; // L: 166
								}
							}

							Interpreter.field844 = var0.field1049; // L: 170

							label935:
							while (true) {
								++var10; // L: 172
								if (var10 > var1) { // L: 173
									throw new RuntimeException();
								}

								++var20; // L: 174
								int var33 = var6[var20];
								if (var33 >= 100) { // L: 175
									boolean var35;
									if (var4.intOperands[var20] == 1) { // L: 393
										var35 = true;
									} else {
										var35 = false; // L: 394
									}

									var14 = FileSystem.method3276(var33, var4, var35); // L: 395
									switch(var14) { // L: 396
									case 0:
										var30 = false;
										break label935;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 403
									}
								} else if (var33 == 0) { // L: 176
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7[var20]; // L: 177
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 180
									var13 = var7[var20]; // L: 181
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 182
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 185
									var13 = var7[var20]; // L: 186
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 187
									class155.changeGameOptions(var13); // L: 188
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 191
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 192
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 195
									var20 += var7[var20]; // L: 196
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 199
									TaskHandler.Interpreter_intStackSize -= 2; // L: 200
									if (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]) { // L: 201
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 204
									TaskHandler.Interpreter_intStackSize -= 2; // L: 205
									if (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]) { // L: 206
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 209
									TaskHandler.Interpreter_intStackSize -= 2; // L: 210
									if (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]) { // L: 211
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 214
									TaskHandler.Interpreter_intStackSize -= 2; // L: 215
									if (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]) { // L: 216
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 219
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break label952;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 221
									var4 = var40.script; // L: 222
									var6 = var4.opcodes; // L: 223
									var7 = var4.intOperands; // L: 224
									var20 = var40.pc; // L: 225
									Interpreter.Interpreter_intLocals = var40.intLocals; // L: 226
									Interpreter.Interpreter_stringLocals = var40.stringLocals; // L: 227
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 230
									var13 = var7[var20]; // L: 231
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class271.getVarbit(var13); // L: 232
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 235
									var13 = var7[var20]; // L: 236
									FriendSystem.method1766(var13, Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 237
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 240
									TaskHandler.Interpreter_intStackSize -= 2; // L: 241
									if (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]) { // L: 242
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 245
									TaskHandler.Interpreter_intStackSize -= 2; // L: 246
									if (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]) { // L: 247
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 250
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]]; // L: 251
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 254
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 255
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 258
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]]; // L: 259
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 262
									Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 263
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 266
									var13 = var7[var20]; // L: 267
									GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= var13; // L: 268
									var21 = Archive.method5850(Interpreter.Interpreter_stringStack, GrandExchangeOfferAgeComparator.Interpreter_stringStackSize, var13); // L: 269
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var21; // L: 270
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 273
									--TaskHandler.Interpreter_intStackSize; // L: 274
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 277
									--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 278
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 281
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 304
											Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class151.varcs.getInt(var7[var20]); // L: 305
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 308
											class151.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 309
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 312
											var13 = var7[var20] >> 16; // L: 313
											var14 = var7[var20] & 65535; // L: 314
											int var24 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 315
											if (var24 < 0 || var24 > 5000) { // L: 316
												throw new RuntimeException(); // L: 317
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24; // L: 319
											byte var25 = -1; // L: 320
											if (var14 == 105) { // L: 321
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) { // L: 322
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) { // L: 325
											var13 = var7[var20]; // L: 326
											var14 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 327
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 328
												throw new RuntimeException(); // L: 329
											}

											Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 331
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 334
											var13 = var7[var20]; // L: 335
											TaskHandler.Interpreter_intStackSize -= 2; // L: 336
											var14 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 337
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 338
												throw new RuntimeException(); // L: 339
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 341
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 344
												var22 = class151.varcs.getStringOld(var7[var20]); // L: 345
												if (var22 == null) { // L: 346
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var22; // L: 347
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 350
												class151.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]); // L: 351
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 354
												var22 = class151.varcs.getString(var7[var20]); // L: 355
												Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var22; // L: 356
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 359
												class151.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]); // L: 360
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 363
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 364
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 365
												if (var37 != null) { // L: 366
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 369
													var39 = WorldMapDecoration.field2816.getTitleGroupValue(var7[var20]); // L: 370
													if (var39 == null) { // L: 371
														Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 372
													} else {
														Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var39; // L: 375
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 379
														throw new IllegalStateException(); // L: 389
													}

													var39 = SoundCache.field327.method7099(var7[var20]); // L: 380
													if (var39 == null) { // L: 381
														Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 382
													} else {
														Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var39; // L: 385
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 282
										Script var36 = Message.getScript(var13); // L: 283
										int[] var15 = new int[var36.localIntCount]; // L: 284
										String[] var16 = new String[var36.localStringCount]; // L: 285

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 286
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (TaskHandler.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 287
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										TaskHandler.Interpreter_intStackSize -= var36.intArgumentCount; // L: 288
										GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 289
										ScriptFrame var23 = new ScriptFrame(); // L: 290
										var23.script = var4; // L: 291
										var23.pc = var20; // L: 292
										var23.intLocals = Interpreter.Interpreter_intLocals; // L: 293
										var23.stringLocals = Interpreter.Interpreter_stringLocals; // L: 294
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 295
										var4 = var36; // L: 296
										var6 = var36.opcodes; // L: 297
										var7 = var36.intOperands; // L: 298
										var20 = -1; // L: 299
										Interpreter.Interpreter_intLocals = var15; // L: 300
										Interpreter.Interpreter_stringLocals = var16; // L: 301
									}
								}
							}
						} catch (Exception var31) { // L: 409
							var9 = true; // L: 410
							StringBuilder var27 = new StringBuilder(30); // L: 412
							var27.append("").append(var4.key).append(" "); // L: 413

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 414
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8); // L: 415
							class359.RunException_sendStackTrace(var27.toString(), var31); // L: 416
							var30 = false;
							break label951;
						}
					} finally {
						if (var30) {
							while (Interpreter.field841.size() > 0) {
								class93 var19 = (class93)Interpreter.field841.remove(0); // L: 421
								ArchiveLoader.widgetDefaultMenuAction(var19.method2444(), var19.method2449(), var19.method2445(), var19.method2446(), "");
							}

							if (Interpreter.field831) { // L: 424
								Interpreter.field831 = false; // L: 425
								class181.method3547(); // L: 426
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								class359.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field841.size() > 0) {
						class93 var34 = (class93)Interpreter.field841.remove(0);
						ArchiveLoader.widgetDefaultMenuAction(var34.method2444(), var34.method2449(), var34.method2445(), var34.method2446(), ""); // L: 422
					}

					if (Interpreter.field831) {
						Interpreter.field831 = false;
						class181.method3547();
					}

					if (!var9 && var2 > 0 && var10 >= var2) { // L: 428
						class359.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 429
					}

					return; // L: 400
				}

				while (Interpreter.field841.size() > 0) {
					class93 var41 = (class93)Interpreter.field841.remove(0);
					ArchiveLoader.widgetDefaultMenuAction(var41.method2444(), var41.method2449(), var41.method2445(), var41.method2446(), "");
				}

				if (Interpreter.field831) {
					Interpreter.field831 = false;
					class181.method3547();
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					class359.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return; // L: 220
			}

			while (Interpreter.field841.size() > 0) { // L: 420
				class93 var26 = (class93)Interpreter.field841.remove(0);
				ArchiveLoader.widgetDefaultMenuAction(var26.method2444(), var26.method2449(), var26.method2445(), var26.method2446(), "");
			}

			if (Interpreter.field831) {
				Interpreter.field831 = false;
				class181.method3547();
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				class359.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	} // L: 132 432

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lji;",
		garbageValue = "1218682147"
	)
	public static PacketBufferNode method4876() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 47
			var0 = new PacketBufferNode(); // L: 48
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 51
		}

		var0.clientPacket = null; // L: 54
		var0.clientPacketLength = 0; // L: 55
		var0.packetBuffer = new PacketBuffer(5000); // L: 56
		return var0; // L: 57
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1519897333"
	)
	static final void method4875(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 11811
		if (var0 != class260.clientPreferences.method2335()) { // L: 11812
			if (class260.clientPreferences.method2335() == 0 && Client.currentTrackGroupId != -1) { // L: 11813
				FriendsChatManager.method6678(MouseHandler.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 11814
				Client.playingJingle = false; // L: 11815
			} else if (var0 == 0) { // L: 11817
				LoginPacket.method5207(); // L: 11818
				Client.playingJingle = false; // L: 11819
			} else {
				KeyHandler.method314(var0); // L: 11821
			}

			class260.clientPreferences.method2357(var0); // L: 11822
		}

	} // L: 11824
}
