import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cp")
public class class103 {
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = 421748945
	)
	static int field1344;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1337;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1330;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1331;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1332;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1333;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1334;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1348;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1336;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1347;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1338;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1339;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1342;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1341;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static final class103 field1340;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -962869657
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 318532311
	)
	int field1343;

	static {
		field1337 = new class103(0); // L: 1889
		field1330 = new class103(1); // L: 1890
		field1331 = new class103(2); // L: 1891
		field1332 = new class103(3); // L: 1892
		field1333 = new class103(4); // L: 1893
		field1334 = new class103(5); // L: 1894
		field1348 = new class103(6); // L: 1895
		field1336 = new class103(7); // L: 1896
		field1347 = new class103(8); // L: 1897
		field1338 = new class103(9); // L: 1898
		field1339 = new class103(10); // L: 1899
		field1342 = new class103(11); // L: 1900
		field1341 = new class103(12); // L: 1901
		field1340 = new class103(13); // L: 1902
	}

	class103(int var1) {
		this.field1343 = var1; // L: 1906
	} // L: 1907

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lca;III)V",
		garbageValue = "-1632793131"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 125
		Script var4;
		int var20;
		if (class417.isWorldMapEvent(var0.type)) { // L: 127
			Decimator.worldMapEvent = (WorldMapEvent)var3[0]; // L: 128
			WorldMapElement var5 = Actor.WorldMapElement_get(Decimator.worldMapEvent.mapElement); // L: 129
			var4 = Login.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 130
		} else {
			var20 = (Integer)var3[0]; // L: 133
			var4 = class159.getScript(var20); // L: 134
		}

		if (var4 != null) { // L: 136
			class379.Interpreter_intStackSize = 0; // L: 139
			class125.Interpreter_stringStackSize = 0; // L: 140
			var20 = -1; // L: 141
			int[] var6 = var4.opcodes; // L: 142
			int[] var7 = var4.intOperands; // L: 143
			byte var8 = -1; // L: 144
			Interpreter.Interpreter_frameDepth = 0; // L: 145
			Interpreter.field849 = false; // L: 146
			boolean var9 = false; // L: 147
			int var10 = 0; // L: 148
			boolean var30 = false;

			label949: {
				label950: {
					try {
						int var13;
						try {
							var30 = true; // L: 150
							Interpreter.Interpreter_intLocals = new int[var4.localIntCount]; // L: 151
							int var11 = 0; // L: 152
							class447.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 153
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) { // L: 154
								if (var3[var13] instanceof Integer) { // L: 155
									var14 = (Integer)var3[var13]; // L: 156
									if (var14 == -2147483647) { // L: 157
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) { // L: 158
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) { // L: 159
										var14 = var0.widget != null ? var0.widget.id : -1;
									}

									if (var14 == -2147483644) { // L: 160
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 161
										var14 = var0.widget != null ? var0.widget.childIndex : -1;
									}

									if (var14 == -2147483642) { // L: 162
										var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
									}

									if (var14 == -2147483641) { // L: 163
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
									}

									if (var14 == -2147483640) { // L: 164
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 165
										var14 = var0.keyPressed;
									}

									Interpreter.Interpreter_intLocals[var11++] = var14; // L: 166
								} else if (var3[var13] instanceof String) { // L: 168
									var21 = (String)var3[var13]; // L: 169
									if (var21.equals("event_opbase")) { // L: 170
										var21 = var0.targetName;
									}

									class447.Interpreter_stringLocals[var12++] = var21; // L: 171
								}
							}

							Interpreter.field839 = var0.field1053; // L: 175

							while (true) {
								++var10; // L: 177
								if (var10 > var1) { // L: 178
									throw new RuntimeException();
								}

								++var20; // L: 179
								int var33 = var6[var20];
								if (var33 >= 100) { // L: 180
									boolean var35;
									if (var4.intOperands[var20] == 1) { // L: 398
										var35 = true;
									} else {
										var35 = false; // L: 399
									}

									var14 = AbstractUserComparator.method7354(var33, var4, var35); // L: 400
									switch(var14) { // L: 401
									case 0:
										var30 = false;
										break label950;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 406
									}
								} else if (var33 == ScriptOpcodes.ICONST) { // L: 181
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7[var20]; // L: 182
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 185
									var13 = var7[var20]; // L: 186
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 187
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 190
									var13 = var7[var20]; // L: 191
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 192
									ClanChannel.changeGameOptions(var13); // L: 193
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 196
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 197
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 200
									var20 += var7[var20]; // L: 201
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 204
									class379.Interpreter_intStackSize -= 2; // L: 205
									if (Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]) { // L: 206
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 209
									class379.Interpreter_intStackSize -= 2; // L: 210
									if (Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]) { // L: 211
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 214
									class379.Interpreter_intStackSize -= 2; // L: 215
									if (Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]) { // L: 216
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 219
									class379.Interpreter_intStackSize -= 2; // L: 220
									if (Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]) { // L: 221
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 224
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break label949;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 226
									var4 = var40.script; // L: 227
									var6 = var4.opcodes; // L: 228
									var7 = var4.intOperands; // L: 229
									var20 = var40.pc; // L: 230
									Interpreter.Interpreter_intLocals = var40.intLocals; // L: 231
									class447.Interpreter_stringLocals = var40.stringLocals; // L: 232
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 235
									var13 = var7[var20]; // L: 236
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Login.getVarbit(var13); // L: 237
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 240
									var13 = var7[var20]; // L: 241
									TriBool.method7466(var13, Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 242
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 245
									class379.Interpreter_intStackSize -= 2; // L: 246
									if (Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]) { // L: 247
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 250
									class379.Interpreter_intStackSize -= 2; // L: 251
									if (Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]) { // L: 252
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 255
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]]; // L: 256
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 259
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 260
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 263
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = class447.Interpreter_stringLocals[var7[var20]]; // L: 264
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 267
									class447.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 268
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 271
									var13 = var7[var20]; // L: 272
									class125.Interpreter_stringStackSize -= var13; // L: 273
									var21 = Coord.method5704(Interpreter.Interpreter_stringStack, class125.Interpreter_stringStackSize, var13); // L: 274
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var21; // L: 275
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 278
									--class379.Interpreter_intStackSize; // L: 279
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 282
									--class125.Interpreter_stringStackSize; // L: 283
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 286
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 309
											Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Projectile.varcs.getInt(var7[var20]); // L: 310
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 313
											Projectile.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 314
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 317
											var13 = var7[var20] >> 16; // L: 318
											var14 = var7[var20] & 65535; // L: 319
											int var24 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 320
											if (var24 < 0 || var24 > 5000) { // L: 321
												throw new RuntimeException(); // L: 322
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24; // L: 324
											byte var25 = -1; // L: 325
											if (var14 == 105) { // L: 326
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) { // L: 327
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) { // L: 330
											var13 = var7[var20]; // L: 331
											var14 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 332
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 333
												throw new RuntimeException(); // L: 334
											}

											Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 336
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 339
											var13 = var7[var20]; // L: 340
											class379.Interpreter_intStackSize -= 2; // L: 341
											var14 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 342
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 343
												throw new RuntimeException(); // L: 344
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 346
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 349
												var22 = Projectile.varcs.getStringOld(var7[var20]); // L: 350
												if (var22 == null) { // L: 351
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var22; // L: 352
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 355
												Projectile.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]); // L: 356
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 359
												var22 = Projectile.varcs.getString(var7[var20]); // L: 360
												Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var22; // L: 361
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 364
												Projectile.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]); // L: 365
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 368
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 369
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 370
												if (var37 != null) { // L: 371
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 374
													var39 = class10.field56.getTitleGroupValue(var7[var20]); // L: 375
													if (var39 == null) { // L: 376
														Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 377
													} else {
														Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var39; // L: 380
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 384
														throw new IllegalStateException(); // L: 394
													}

													var39 = class157.field1745.method7743(var7[var20]); // L: 385
													if (var39 == null) { // L: 386
														Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 387
													} else {
														Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var39; // L: 390
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 287
										Script var36 = class159.getScript(var13); // L: 288
										int[] var15 = new int[var36.localIntCount]; // L: 289
										String[] var16 = new String[var36.localStringCount]; // L: 290

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 291
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (class379.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 292
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class125.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										class379.Interpreter_intStackSize -= var36.intArgumentCount; // L: 293
										class125.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 294
										ScriptFrame var23 = new ScriptFrame(); // L: 295
										var23.script = var4; // L: 296
										var23.pc = var20; // L: 297
										var23.intLocals = Interpreter.Interpreter_intLocals; // L: 298
										var23.stringLocals = class447.Interpreter_stringLocals; // L: 299
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 300
										var4 = var36; // L: 301
										var6 = var36.opcodes; // L: 302
										var7 = var36.intOperands; // L: 303
										var20 = -1; // L: 304
										Interpreter.Interpreter_intLocals = var15; // L: 305
										class447.Interpreter_stringLocals = var16; // L: 306
									}
								}
							}
						} catch (Exception var31) { // L: 414
							var9 = true; // L: 415
							StringBuilder var27 = new StringBuilder(30); // L: 417
							var27.append("").append(var4.key).append(" "); // L: 418
							var13 = Interpreter.Interpreter_frameDepth - 1; // L: 419

							while (true) {
								if (var13 < 0) {
									var27.append("").append(var8); // L: 420
									class421.RunException_sendStackTrace(var27.toString(), var31); // L: 421
									var30 = false;
									break;
								}

								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
								--var13;
							}
						}
					} finally {
						if (var30) {
							while (Interpreter.field851.size() > 0) {
								class97 var19 = (class97)Interpreter.field851.remove(0); // L: 426
								class279.widgetDefaultMenuAction(var19.method2520(), var19.method2521(), var19.method2523(), var19.method2524(), "");
							}

							if (Interpreter.field849) { // L: 429
								Interpreter.field849 = false; // L: 430
								class354.method6769(); // L: 431
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								class421.RunException_sendStackTrace("Warning: Script " + var4.field962 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field851.size() > 0) { // L: 425
						class97 var26 = (class97)Interpreter.field851.remove(0);
						class279.widgetDefaultMenuAction(var26.method2520(), var26.method2521(), var26.method2523(), var26.method2524(), "");
					}

					if (Interpreter.field849) {
						Interpreter.field849 = false;
						class354.method6769();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						class421.RunException_sendStackTrace("Warning: Script " + var4.field962 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return; // L: 437
				}

				while (Interpreter.field851.size() > 0) {
					class97 var34 = (class97)Interpreter.field851.remove(0);
					class279.widgetDefaultMenuAction(var34.method2520(), var34.method2521(), var34.method2523(), var34.method2524(), ""); // L: 427
				}

				if (Interpreter.field849) {
					Interpreter.field849 = false;
					class354.method6769();
				}

				if (!var9 && var2 > 0 && var10 >= var2) { // L: 433
					class421.RunException_sendStackTrace("Warning: Script " + var4.field962 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 434
				}

				return; // L: 403
			}

			while (Interpreter.field851.size() > 0) {
				class97 var41 = (class97)Interpreter.field851.remove(0);
				class279.widgetDefaultMenuAction(var41.method2520(), var41.method2521(), var41.method2523(), var41.method2524(), "");
			}

			if (Interpreter.field849) {
				Interpreter.field849 = false;
				class354.method6769();
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				class421.RunException_sendStackTrace("Warning: Script " + var4.field962 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	} // L: 137 225
}
