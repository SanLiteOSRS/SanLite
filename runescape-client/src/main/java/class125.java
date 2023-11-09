import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class125 {
	@ObfuscatedName("as")
	public static final float field1463;
	@ObfuscatedName("ax")
	public static final float field1467;
	@ObfuscatedName("ap")
	static float[] field1465;
	@ObfuscatedName("ab")
	static float[] field1462;
	@ObfuscatedName("ak")
	public static ThreadPoolExecutor field1468;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 940066811
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	static {
		field1463 = Math.ulp(1.0F); // L: 10
		field1467 = 2.0F * field1463; // L: 11
		field1465 = new float[4]; // L: 12
		field1462 = new float[5]; // L: 13
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldz;Ldd;III)V",
		garbageValue = "2074139136"
	)
	static void method2919(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args; // L: 124
		Interpreter.Interpreter_intStackSize = 0; // L: 125
		class149.Interpreter_stringStackSize = 0; // L: 126
		int var5 = -1; // L: 127
		int[] var6 = var1.opcodes; // L: 128
		int[] var7 = var1.intOperands; // L: 129
		byte var8 = -1; // L: 130
		Interpreter.Interpreter_frameDepth = 0; // L: 131
		Interpreter.field852 = false; // L: 132
		boolean var9 = false; // L: 133
		int var10 = 0; // L: 134
		boolean var29 = false;

		label933: {
			label934: {
				try {
					int var13;
					try {
						var29 = true; // L: 136
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount]; // L: 137
						int var11 = 0; // L: 138
						Interpreter.Interpreter_stringLocals = new String[var1.localStringCount]; // L: 139
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) { // L: 140
							if (var4[var13] instanceof Integer) { // L: 141
								var14 = (Integer)var4[var13]; // L: 142
								if (var14 == -2147483647) { // L: 143
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) { // L: 144
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) { // L: 145
									var14 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var14 == -2147483644) { // L: 146
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) { // L: 147
									var14 = var0.widget != null ? var0.widget.childIndex : -1;
								}

								if (var14 == -2147483642) { // L: 148
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) { // L: 149
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
								}

								if (var14 == -2147483640) { // L: 150
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) { // L: 151
									var14 = var0.keyPressed;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14; // L: 152
							} else if (var4[var13] instanceof String) { // L: 154
								var20 = (String)var4[var13]; // L: 155
								if (var20.equals("event_opbase")) { // L: 156
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20; // L: 157
							}
						}

						Interpreter.field871 = var0.field1068; // L: 161

						label920:
						while (true) {
							++var10; // L: 163
							if (var10 > var2) { // L: 164
								throw new RuntimeException();
							}

							++var5; // L: 165
							int var32 = var6[var5];
							if (var32 >= 100) { // L: 166
								boolean var34;
								if (var1.intOperands[var5] == 1) { // L: 384
									var34 = true;
								} else {
									var34 = false; // L: 385
								}

								var14 = class388.method7212(var32, var1, var34); // L: 386
								switch(var14) { // L: 387
								case 0:
									var29 = false;
									break label920;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException(); // L: 394
								}
							} else if (var32 == 0) { // L: 167
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var5]; // L: 168
							} else if (var32 == 1) { // L: 171
								var13 = var7[var5]; // L: 172
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 173
							} else if (var32 == 2) { // L: 176
								var13 = var7[var5]; // L: 177
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 178
								class393.changeGameOptions(var13); // L: 179
							} else if (var32 == 3) { // L: 182
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var1.stringOperands[var5]; // L: 183
							} else if (var32 == 6) { // L: 186
								var5 += var7[var5]; // L: 187
							} else if (var32 == 7) { // L: 190
								Interpreter.Interpreter_intStackSize -= 2; // L: 191
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 192
									var5 += var7[var5];
								}
							} else if (var32 == 8) { // L: 195
								Interpreter.Interpreter_intStackSize -= 2; // L: 196
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 197
									var5 += var7[var5];
								}
							} else if (var32 == 9) { // L: 200
								Interpreter.Interpreter_intStackSize -= 2; // L: 201
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 202
									var5 += var7[var5];
								}
							} else if (var32 == 10) { // L: 205
								Interpreter.Interpreter_intStackSize -= 2; // L: 206
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 207
									var5 += var7[var5];
								}
							} else if (var32 == 21) { // L: 210
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break label934;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 212
								var1 = var39.script; // L: 213
								var6 = var1.opcodes; // L: 214
								var7 = var1.intOperands; // L: 215
								var5 = var39.pc; // L: 216
								Interpreter.Interpreter_intLocals = var39.intLocals; // L: 217
								Interpreter.Interpreter_stringLocals = var39.stringLocals; // L: 218
							} else if (var32 == 25) { // L: 221
								var13 = var7[var5]; // L: 222
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class343.getVarbit(var13); // L: 223
							} else if (var32 == 27) { // L: 226
								var13 = var7[var5]; // L: 227
								Buffer.method9158(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 228
							} else if (var32 == 31) { // L: 231
								Interpreter.Interpreter_intStackSize -= 2; // L: 232
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 233
									var5 += var7[var5];
								}
							} else if (var32 == 32) { // L: 236
								Interpreter.Interpreter_intStackSize -= 2; // L: 237
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 238
									var5 += var7[var5];
								}
							} else if (var32 == 33) { // L: 241
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]]; // L: 242
							} else if (var32 == 34) { // L: 245
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 246
							} else if (var32 == 35) { // L: 249
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]]; // L: 250
							} else if (var32 == 36) { // L: 253
								Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 254
							} else if (var32 == 37) { // L: 257
								var13 = var7[var5]; // L: 258
								class149.Interpreter_stringStackSize -= var13; // L: 259
								var20 = JagexCache.method3497(Interpreter.Interpreter_stringStack, class149.Interpreter_stringStackSize, var13); // L: 260
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var20; // L: 261
							} else if (var32 == 38) { // L: 264
								--Interpreter.Interpreter_intStackSize; // L: 265
							} else if (var32 == 39) { // L: 268
								--class149.Interpreter_stringStackSize; // L: 269
							} else {
								int var17;
								if (var32 != 40) { // L: 272
									if (var32 == 42) { // L: 295
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseHandler.varcs.getInt(var7[var5]); // L: 296
									} else if (var32 == 43) { // L: 299
										MouseHandler.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 300
									} else if (var32 == 44) { // L: 303
										var13 = var7[var5] >> 16; // L: 304
										var14 = var7[var5] & 65535; // L: 305
										int var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 306
										if (var23 < 0 || var23 > 5000) { // L: 307
											throw new RuntimeException(); // L: 308
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23; // L: 310
										byte var24 = -1; // L: 311
										if (var14 == 105) { // L: 312
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) { // L: 313
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) { // L: 316
										var13 = var7[var5]; // L: 317
										var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 318
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 319
											throw new RuntimeException(); // L: 320
										}

										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 322
									} else if (var32 == 46) { // L: 325
										var13 = var7[var5]; // L: 326
										Interpreter.Interpreter_intStackSize -= 2; // L: 327
										var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 328
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 329
											throw new RuntimeException(); // L: 330
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 332
									} else {
										String var21;
										if (var32 == 47) { // L: 335
											var21 = MouseHandler.varcs.getStringOld(var7[var5]); // L: 336
											if (var21 == null) { // L: 337
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var21; // L: 338
										} else if (var32 == 48) { // L: 341
											MouseHandler.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]); // L: 342
										} else if (var32 == 49) { // L: 345
											var21 = MouseHandler.varcs.getString(var7[var5]); // L: 346
											Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var21; // L: 347
										} else if (var32 == 50) { // L: 350
											MouseHandler.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]); // L: 351
										} else if (var32 == 60) { // L: 354
											IterableNodeHashTable var37 = var1.switches[var7[var5]]; // L: 355
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 356
											if (var36 != null) { // L: 357
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) { // L: 360
												var38 = class309.field3452.getTitleGroupValue(var7[var5]); // L: 361
												if (var38 == null) { // L: 362
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 363
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38; // L: 366
												}
											} else {
												if (var32 != 76) { // L: 370
													throw new IllegalStateException(); // L: 380
												}

												var38 = class127.field1495.method8187(var7[var5]); // L: 371
												if (var38 == null) { // L: 372
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 373
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38; // L: 376
												}
											}
										}
									}
								} else {
									var13 = var7[var5]; // L: 273
									Script var35 = class190.getScript(var13); // L: 274
									int[] var15 = new int[var35.localIntCount]; // L: 275
									String[] var16 = new String[var35.localStringCount]; // L: 276

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) { // L: 277
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) { // L: 278
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class149.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									Interpreter.Interpreter_intStackSize -= var35.intArgumentCount; // L: 279
									class149.Interpreter_stringStackSize -= var35.stringArgumentCount; // L: 280
									ScriptFrame var22 = new ScriptFrame(); // L: 281
									var22.script = var1; // L: 282
									var22.pc = var5; // L: 283
									var22.intLocals = Interpreter.Interpreter_intLocals; // L: 284
									var22.stringLocals = Interpreter.Interpreter_stringLocals; // L: 285
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 286
									var1 = var35; // L: 287
									var6 = var35.opcodes; // L: 288
									var7 = var35.intOperands; // L: 289
									var5 = -1; // L: 290
									Interpreter.Interpreter_intLocals = var15; // L: 291
									Interpreter.Interpreter_stringLocals = var16; // L: 292
								}
							}
						}
					} catch (Exception var30) { // L: 400
						var9 = true; // L: 401
						StringBuilder var26 = new StringBuilder(30); // L: 403
						var26.append("").append(var1.key).append(" "); // L: 404

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 405
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8); // L: 406
						class260.RunException_sendStackTrace(var26.toString(), var30); // L: 407
						var29 = false;
						break label933;
					}
				} finally {
					if (var29) {
						while (Interpreter.field873.size() > 0) {
							class101 var19 = (class101)Interpreter.field873.remove(0); // L: 412
							InvDefinition.widgetDefaultMenuAction(var19.method2628(), var19.method2629(), var19.method2639(), var19.method2631(), "");
						}

						if (Interpreter.field852) { // L: 415
							Interpreter.field852 = false; // L: 416
							class36.method664(); // L: 417
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class260.RunException_sendStackTrace("Warning: Script " + var1.field992 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field873.size() > 0) {
					class101 var33 = (class101)Interpreter.field873.remove(0);
					InvDefinition.widgetDefaultMenuAction(var33.method2628(), var33.method2629(), var33.method2639(), var33.method2631(), ""); // L: 413
				}

				if (Interpreter.field852) {
					Interpreter.field852 = false;
					class36.method664();
				}

				if (!var9 && var3 > 0 && var10 >= var3) { // L: 419
					class260.RunException_sendStackTrace("Warning: Script " + var1.field992 + " finished at op count " + var10 + " of max " + var2, (Throwable)null); // L: 420
				}

				return; // L: 391
			}

			while (Interpreter.field873.size() > 0) {
				class101 var40 = (class101)Interpreter.field873.remove(0);
				InvDefinition.widgetDefaultMenuAction(var40.method2628(), var40.method2629(), var40.method2639(), var40.method2631(), "");
			}

			if (Interpreter.field852) {
				Interpreter.field852 = false;
				class36.method664();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class260.RunException_sendStackTrace("Warning: Script " + var1.field992 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return; // L: 211
		}

		while (Interpreter.field873.size() > 0) { // L: 411
			class101 var25 = (class101)Interpreter.field873.remove(0);
			InvDefinition.widgetDefaultMenuAction(var25.method2628(), var25.method2629(), var25.method2639(), var25.method2631(), "");
		}

		if (Interpreter.field852) {
			Interpreter.field852 = false;
			class36.method664();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class260.RunException_sendStackTrace("Warning: Script " + var1.field992 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	} // L: 423

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1160250297"
	)
	protected static final void method2918() {
		BufferedNetSocket.clock.mark(); // L: 452

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 453
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 454
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0; // L: 455
	} // L: 456
}
