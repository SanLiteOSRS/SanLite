import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("du")
public class class125 {
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = 702458805
	)
	static int field1560;
	@ObfuscatedName("h")
	boolean field1547;
	@ObfuscatedName("e")
	boolean field1538;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	class124 field1539;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	class124 field1540;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Ldq;"
	)
	class121[] field1541;
	@ObfuscatedName("q")
	boolean field1557;
	@ObfuscatedName("f")
	float field1543;
	@ObfuscatedName("r")
	float field1544;
	@ObfuscatedName("u")
	float field1545;
	@ObfuscatedName("b")
	float field1559;
	@ObfuscatedName("j")
	float field1537;
	@ObfuscatedName("g")
	float field1548;
	@ObfuscatedName("i")
	float field1549;
	@ObfuscatedName("o")
	float field1550;
	@ObfuscatedName("n")
	float field1551;
	@ObfuscatedName("k")
	float field1552;
	@ObfuscatedName("a")
	boolean field1553;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1591300609
	)
	int field1556;
	@ObfuscatedName("l")
	float[] field1546;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1053774151
	)
	int field1542;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1911231087
	)
	int field1555;
	@ObfuscatedName("p")
	float field1558;
	@ObfuscatedName("d")
	float field1554;

	class125() {
		this.field1553 = true; // L: 24
		this.field1556 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)I",
		garbageValue = "-978416029"
	)
	int method2943(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		ChatChannel.method2152(var1.readUnsignedByte()); // L: 36
		int var5 = var1.readUnsignedByte(); // L: 38
		class124 var6 = (class124)World.findEnumerated(MidiPcmStream.method5640(), var5); // L: 40
		if (var6 == null) { // L: 41
			var6 = class124.field1535;
		}

		this.field1539 = var6; // L: 44
		int var7 = var1.readUnsignedByte(); // L: 46
		class124 var8 = (class124)World.findEnumerated(MidiPcmStream.method5640(), var7); // L: 48
		if (var8 == null) { // L: 49
			var8 = class124.field1535;
		}

		this.field1540 = var8; // L: 52
		this.field1547 = var1.readUnsignedByte() != 0; // L: 53
		this.field1541 = new class121[var3]; // L: 54
		class121 var11 = null;

		int var9;
		for (var9 = 0; var9 < var3; ++var9) {
			class121 var10 = new class121();
			var10.method2884(var1, var2); // L: 58
			this.field1541[var9] = var10; // L: 59
			if (var11 != null) {
				var11.field1501 = var10;
			}

			var11 = var10;
		}

		this.field1542 = this.field1541[0].field1502; // L: 65
		this.field1555 = this.field1541[this.method2947() - 1].field1502; // L: 66
		this.field1546 = new float[this.method2944() + 1]; // L: 68

		for (var9 = this.method2946(); var9 <= this.method2942(); ++var9) { // L: 69
			this.field1546[var9 - this.method2946()] = FloorOverlayDefinition.method3995(this, (float)var9); // L: 70
		}

		this.field1541 = null; // L: 72
		this.field1558 = FloorOverlayDefinition.method3995(this, (float)(this.method2946() - 1)); // L: 74
		this.field1554 = FloorOverlayDefinition.method3995(this, (float)(this.method2942() + 1)); // L: 75
		return var3; // L: 76
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "-121"
	)
	public float method2966(int var1) {
		if (var1 < this.method2946()) { // L: 81
			return this.field1558; // L: 82
		} else {
			return var1 > this.method2942() ? this.field1554 : this.field1546[var1 - this.method2946()]; // L: 84 85 87
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "64"
	)
	int method2946() {
		return this.field1542; // L: 92
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "826348925"
	)
	int method2942() {
		return this.field1555; // L: 96
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1825494223"
	)
	int method2944() {
		return this.method2942() - this.method2946(); // L: 100
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "628644903"
	)
	int method2945(float var1) {
		if (this.field1556 < 0 || (float)this.field1541[this.field1556].field1502 > var1 || this.field1541[this.field1556].field1501 != null && (float)this.field1541[this.field1556].field1501.field1502 <= var1) { // L: 104
			if (var1 >= (float)this.method2946() && var1 <= (float)this.method2942()) { // L: 107
				int var2 = this.method2947(); // L: 110
				int var3 = this.field1556; // L: 111
				if (var2 > 0) { // L: 112
					int var4 = 0; // L: 113
					int var5 = var2 - 1; // L: 114

					do {
						int var6 = var5 + var4 >> 1; // L: 116
						if (var1 < (float)this.field1541[var6].field1502) {
							if (var1 > (float)this.field1541[var6 - 1].field1502) { // L: 118
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1; // L: 123
						} else {
							if (var1 <= (float)this.field1541[var6].field1502) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1541[var6 + 1].field1502) { // L: 127
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1556) { // L: 141
					this.field1556 = var3;
					this.field1553 = true;
				}

				return this.field1556;
			} else {
				return -1; // L: 108
			}
		} else {
			return this.field1556; // L: 105
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(FI)Ldq;",
		garbageValue = "-1470055279"
	)
	class121 method2950(float var1) {
		int var2 = this.method2945(var1);
		return var2 >= 0 && var2 < this.field1541.length ? this.field1541[var2] : null;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1641369395"
	)
	int method2947() {
		return this.field1541 == null ? 0 : this.field1541.length; // L: 159
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lcb;III)V",
		garbageValue = "-1404765395"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 117
		Script var4;
		int var20;
		if (class87.isWorldMapEvent(var0.type)) { // L: 119
			GrandExchangeOfferUnitPriceComparator.worldMapEvent = (WorldMapEvent)var3[0]; // L: 120
			WorldMapElement var5 = JagexCache.WorldMapElement_get(GrandExchangeOfferUnitPriceComparator.worldMapEvent.mapElement); // L: 121
			var4 = KeyHandler.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 122
		} else {
			var20 = (Integer)var3[0]; // L: 125
			var4 = VarbitComposition.getScript(var20); // L: 126
		}

		if (var4 != null) { // L: 128
			class87.Interpreter_intStackSize = 0; // L: 131
			Interpreter.Interpreter_stringStackSize = 0; // L: 132
			var20 = -1; // L: 133
			int[] var6 = var4.opcodes; // L: 134
			int[] var7 = var4.intOperands; // L: 135
			byte var8 = -1; // L: 136
			Interpreter.Interpreter_frameDepth = 0; // L: 137
			Interpreter.field865 = false; // L: 138
			boolean var9 = false; // L: 139
			int var10 = 0; // L: 140
			boolean var30 = false;

			label952: {
				label953: {
					try {
						int var13;
						try {
							var30 = true; // L: 142
							Interpreter.Interpreter_intLocals = new int[var4.localIntCount]; // L: 143
							int var11 = 0; // L: 144
							class415.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 145
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) { // L: 146
								if (var3[var13] instanceof Integer) { // L: 147
									var14 = (Integer)var3[var13]; // L: 148
									if (var14 == -2147483647) { // L: 149
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) { // L: 150
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) { // L: 151
										var14 = var0.widget != null ? var0.widget.id : -1;
									}

									if (var14 == -2147483644) { // L: 152
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 153
										var14 = var0.widget != null ? var0.widget.childIndex : -1;
									}

									if (var14 == -2147483642) { // L: 154
										var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
									}

									if (var14 == -2147483641) { // L: 155
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
									}

									if (var14 == -2147483640) { // L: 156
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 157
										var14 = var0.keyPressed;
									}

									Interpreter.Interpreter_intLocals[var11++] = var14; // L: 158
								} else if (var3[var13] instanceof String) { // L: 160
									var21 = (String)var3[var13]; // L: 161
									if (var21.equals("event_opbase")) { // L: 162
										var21 = var0.targetName;
									}

									class415.Interpreter_stringLocals[var12++] = var21; // L: 163
								}
							}

							Interpreter.field874 = var0.field1084; // L: 167

							while (true) {
								++var10; // L: 169
								if (var10 > var1) { // L: 170
									throw new RuntimeException();
								}

								++var20; // L: 171
								int var33 = var6[var20];
								if (var33 >= 100) { // L: 172
									boolean var35;
									if (var4.intOperands[var20] == 1) { // L: 390
										var35 = true;
									} else {
										var35 = false; // L: 391
									}

									var14 = SecureRandomFuture.method2119(var33, var4, var35); // L: 392
									switch(var14) { // L: 393
									case 0:
										var30 = false;
										break label953;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 396
									}
								} else if (var33 == ScriptOpcodes.ICONST) { // L: 173
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7[var20]; // L: 174
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 177
									var13 = var7[var20]; // L: 178
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 179
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 182
									var13 = var7[var20]; // L: 183
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 184
									MouseRecorder.changeGameOptions(var13); // L: 185
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 188
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 189
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 192
									var20 += var7[var20]; // L: 193
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 196
									class87.Interpreter_intStackSize -= 2; // L: 197
									if (Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]) { // L: 198
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 201
									class87.Interpreter_intStackSize -= 2; // L: 202
									if (Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]) { // L: 203
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 206
									class87.Interpreter_intStackSize -= 2; // L: 207
									if (Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]) { // L: 208
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 211
									class87.Interpreter_intStackSize -= 2; // L: 212
									if (Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]) { // L: 213
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 216
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break label952;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 218
									var4 = var40.script; // L: 219
									var6 = var4.opcodes; // L: 220
									var7 = var4.intOperands; // L: 221
									var20 = var40.pc;
									Interpreter.Interpreter_intLocals = var40.intLocals; // L: 223
									class415.Interpreter_stringLocals = var40.stringLocals;
								} else if (var33 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20]; // L: 228
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class175.getVarbit(var13);
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 232
									var13 = var7[var20]; // L: 233
									Login.method2065(var13, Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 234
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 237
									class87.Interpreter_intStackSize -= 2; // L: 238
									if (Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]) { // L: 239
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 242
									class87.Interpreter_intStackSize -= 2; // L: 243
									if (Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]) { // L: 244
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 247
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]]; // L: 248
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 251
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 252
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 255
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class415.Interpreter_stringLocals[var7[var20]]; // L: 256
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 259
									class415.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 260
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 263
									var13 = var7[var20]; // L: 264
									Interpreter.Interpreter_stringStackSize -= var13; // L: 265
									var21 = Tile.method4311(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var13); // L: 266
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21; // L: 267
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 270
									--class87.Interpreter_intStackSize; // L: 271
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 274
									--Interpreter.Interpreter_stringStackSize; // L: 275
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 278
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 301
											Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = WorldMapArea.varcs.getInt(var7[var20]); // L: 302
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 305
											WorldMapArea.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 306
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 309
											var13 = var7[var20] >> 16; // L: 310
											var14 = var7[var20] & 65535; // L: 311
											int var24 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 312
											if (var24 < 0 || var24 > 5000) { // L: 313
												throw new RuntimeException(); // L: 314
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24; // L: 316
											byte var25 = -1; // L: 317
											if (var14 == 105) { // L: 318
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) { // L: 319
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) { // L: 322
											var13 = var7[var20]; // L: 323
											var14 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 324
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 325
												throw new RuntimeException(); // L: 326
											}

											Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 328
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 331
											var13 = var7[var20]; // L: 332
											class87.Interpreter_intStackSize -= 2; // L: 333
											var14 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 334
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 335
												throw new RuntimeException(); // L: 336
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 338
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 341
												var22 = WorldMapArea.varcs.getStringOld(var7[var20]); // L: 342
												if (var22 == null) { // L: 343
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var22; // L: 344
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 347
												WorldMapArea.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 348
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 351
												var22 = WorldMapArea.varcs.getString(var7[var20]); // L: 352
												Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var22; // L: 353
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 356
												WorldMapArea.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 357
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 360
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 361
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 362
												if (var37 != null) { // L: 363
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 366
													var39 = class126.field1573.getTitleGroupValue(var7[var20]); // L: 367
													if (var39 == null) { // L: 368
														Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 369
													} else {
														Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var39; // L: 372
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 376
														throw new IllegalStateException(); // L: 386
													}

													var39 = LoginScreenAnimation.field1286.method7867(var7[var20]); // L: 377
													if (var39 == null) { // L: 378
														Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 379
													} else {
														Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var39; // L: 382
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 279
										Script var36 = VarbitComposition.getScript(var13); // L: 280
										int[] var15 = new int[var36.localIntCount]; // L: 281
										String[] var16 = new String[var36.localStringCount]; // L: 282

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 283
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (class87.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 284
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (Interpreter.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										class87.Interpreter_intStackSize -= var36.intArgumentCount; // L: 285
										Interpreter.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 286
										ScriptFrame var23 = new ScriptFrame(); // L: 287
										var23.script = var4; // L: 288
										var23.pc = var20; // L: 289
										var23.intLocals = Interpreter.Interpreter_intLocals; // L: 290
										var23.stringLocals = class415.Interpreter_stringLocals; // L: 291
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 292
										var4 = var36; // L: 293
										var6 = var36.opcodes; // L: 294
										var7 = var36.intOperands; // L: 295
										var20 = -1; // L: 296
										Interpreter.Interpreter_intLocals = var15; // L: 297
										class415.Interpreter_stringLocals = var16; // L: 298
									}
								}
							}
						} catch (Exception var31) { // L: 406
							var9 = true; // L: 407
							StringBuilder var27 = new StringBuilder(30); // L: 409
							var27.append("").append(var4.key).append(" "); // L: 410
							var13 = Interpreter.Interpreter_frameDepth - 1; // L: 411

							while (true) {
								if (var13 < 0) {
									var27.append("").append(var8); // L: 412
									class132.RunException_sendStackTrace(var27.toString(), var31); // L: 413
									var30 = false;
									break;
								}

								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
								--var13;
							}
						}
					} finally {
						if (var30) {
							while (Interpreter.field867.size() > 0) {
								class98 var19 = (class98)Interpreter.field867.remove(0); // L: 418
								ModelData0.widgetDefaultMenuAction(var19.method2592(), var19.method2593(), var19.method2594(), var19.method2599(), "");
							}

							if (Interpreter.field865) { // L: 421
								Interpreter.field865 = false; // L: 422
								WorldMapSectionType.method5236(); // L: 423
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								class132.RunException_sendStackTrace("Warning: Script " + var4.field990 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field867.size() > 0) { // L: 417
						class98 var26 = (class98)Interpreter.field867.remove(0);
						ModelData0.widgetDefaultMenuAction(var26.method2592(), var26.method2593(), var26.method2594(), var26.method2599(), "");
					}

					if (Interpreter.field865) {
						Interpreter.field865 = false;
						WorldMapSectionType.method5236();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						class132.RunException_sendStackTrace("Warning: Script " + var4.field990 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return; // L: 429
				}

				while (Interpreter.field867.size() > 0) {
					class98 var34 = (class98)Interpreter.field867.remove(0);
					ModelData0.widgetDefaultMenuAction(var34.method2592(), var34.method2593(), var34.method2594(), var34.method2599(), ""); // L: 419
				}

				if (Interpreter.field865) {
					Interpreter.field865 = false;
					WorldMapSectionType.method5236();
				}

				if (!var9 && var2 > 0 && var10 >= var2) { // L: 425
					class132.RunException_sendStackTrace("Warning: Script " + var4.field990 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 426
				}

				return; // L: 401
			}

			while (Interpreter.field867.size() > 0) {
				class98 var41 = (class98)Interpreter.field867.remove(0);
				ModelData0.widgetDefaultMenuAction(var41.method2592(), var41.method2593(), var41.method2594(), var41.method2599(), "");
			}

			if (Interpreter.field865) {
				Interpreter.field865 = false;
				WorldMapSectionType.method5236();
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				class132.RunException_sendStackTrace("Warning: Script " + var4.field990 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	} // L: 129 217

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lly;III)Lrx;",
		garbageValue = "-16711936"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 55
		boolean var3;
		if (var4 == null) { // L: 56
			var3 = false; // L: 57
		} else {
			VarpDefinition.SpriteBuffer_decode(var4); // L: 60
			var3 = true; // L: 61
		}

		return !var3 ? null : class360.method6967(); // L: 63 64
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)V",
		garbageValue = "-1201081904"
	)
	public static void method2940(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 222
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 224
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 225
			} catch (Exception var3) { // L: 227
			}
		}

	} // L: 229

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ljava/lang/String;",
		garbageValue = "120"
	)
	static final String method2971(int var0, int var1) {
		int var2 = var1 - var0; // L: 10289
		if (var2 < -9) { // L: 10290
			return MouseRecorder.colorStartTag(16711680);
		} else if (var2 < -6) { // L: 10291
			return MouseRecorder.colorStartTag(16723968);
		} else if (var2 < -3) { // L: 10292
			return MouseRecorder.colorStartTag(16740352);
		} else if (var2 < 0) { // L: 10293
			return MouseRecorder.colorStartTag(16756736);
		} else if (var2 > 9) { // L: 10294
			return MouseRecorder.colorStartTag(65280);
		} else if (var2 > 6) { // L: 10295
			return MouseRecorder.colorStartTag(4259584);
		} else if (var2 > 3) { // L: 10296
			return MouseRecorder.colorStartTag(8453888);
		} else {
			return var2 > 0 ? MouseRecorder.colorStartTag(12648192) : MouseRecorder.colorStartTag(16776960); // L: 10297 10298
		}
	}
}
