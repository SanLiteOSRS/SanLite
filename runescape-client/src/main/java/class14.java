import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("am")
public class class14 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1185576571
	)
	final int field71;
	@ObfuscatedName("al")
	final String field70;
	@ObfuscatedName("ac")
	final ThreadFactory field73;
	@ObfuscatedName("ab")
	final ThreadPoolExecutor field72;

	public class14(String var1, int var2, int var3) {
		this.field70 = var1; // L: 15
		this.field71 = var2; // L: 16
		this.field73 = new class16(this); // L: 17
		this.field72 = this.method167(var3); // L: 18
	} // L: 19

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-5"
	)
	final ThreadPoolExecutor method167(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field71), this.field73); // L: 22
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lak;S)Lag;",
		garbageValue = "15032"
	)
	public class18 method165(class10 var1) {
		if (this.field72.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field72.getCorePoolSize() + " Queue capacity " + this.field71); // L: 27
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field72.submit(new class19(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "40"
	)
	public final void method176() {
		try {
			this.field72.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ldx;III)V",
		garbageValue = "-1914250793"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 117
		Script var4;
		int var20;
		if (Skills.isWorldMapEvent(var0.type)) { // L: 119
			InvDefinition.worldMapEvent = (WorldMapEvent)var3[0]; // L: 120
			WorldMapElement var5 = class123.WorldMapElement_get(InvDefinition.worldMapEvent.mapElement); // L: 121
			var4 = GrandExchangeOfferNameComparator.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 122
		} else {
			var20 = (Integer)var3[0]; // L: 125
			var4 = SecureRandomCallable.getScript(var20); // L: 126
		}

		if (var4 != null) { // L: 128
			Interpreter.Interpreter_intStackSize = 0; // L: 131
			HealthBar.Interpreter_stringStackSize = 0; // L: 132
			var20 = -1; // L: 133
			int[] var6 = var4.opcodes; // L: 134
			int[] var7 = var4.intOperands; // L: 135
			byte var8 = -1; // L: 136
			Interpreter.Interpreter_frameDepth = 0; // L: 137
			Interpreter.field835 = false; // L: 138
			boolean var9 = false; // L: 139
			int var10 = 0; // L: 140
			boolean var30 = false;

			label954: {
				label955: {
					try {
						int var13;
						try {
							var30 = true; // L: 142
							Interpreter.Interpreter_intLocals = new int[var4.localIntCount]; // L: 143
							int var11 = 0; // L: 144
							Interpreter.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 145
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

									Interpreter.Interpreter_stringLocals[var12++] = var21; // L: 163
								}
							}

							Interpreter.field838 = var0.field1051; // L: 167

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

									var14 = class7.method40(var33, var4, var35); // L: 392
									switch(var14) { // L: 393
									case 0:
										var30 = false;
										break label954;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 398
									}
								} else if (var33 == ScriptOpcodes.ICONST) { // L: 173
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var20]; // L: 174
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 177
									var13 = var7[var20]; // L: 178
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 179
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 182
									var13 = var7[var20]; // L: 183
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 184
									class159.changeGameOptions(var13); // L: 185
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 188
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 189
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 192
									var20 += var7[var20]; // L: 193
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 196
									Interpreter.Interpreter_intStackSize -= 2; // L: 197
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 198
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 201
									Interpreter.Interpreter_intStackSize -= 2; // L: 202
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 203
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 206
									Interpreter.Interpreter_intStackSize -= 2; // L: 207
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 208
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 211
									Interpreter.Interpreter_intStackSize -= 2; // L: 212
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 213
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 216
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 218
									var4 = var40.script; // L: 219
									var6 = var4.opcodes; // L: 220
									var7 = var4.intOperands; // L: 221
									var20 = var40.pc; // L: 222
									Interpreter.Interpreter_intLocals = var40.intLocals; // L: 223
									Interpreter.Interpreter_stringLocals = var40.stringLocals; // L: 224
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 227
									var13 = var7[var20]; // L: 228
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class17.getVarbit(var13); // L: 229
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 232
									var13 = var7[var20]; // L: 233
									MouseRecorder.method2275(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 234
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 237
									Interpreter.Interpreter_intStackSize -= 2; // L: 238
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 239
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 242
									Interpreter.Interpreter_intStackSize -= 2; // L: 243
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 244
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 247
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]]; // L: 248
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 251
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 252
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 255
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]]; // L: 256
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 259
									Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 260
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 263
									var13 = var7[var20]; // L: 264
									HealthBar.Interpreter_stringStackSize -= var13; // L: 265
									var21 = class364.method6855(Interpreter.Interpreter_stringStack, HealthBar.Interpreter_stringStackSize, var13); // L: 266
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var21; // L: 267
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 270
									--Interpreter.Interpreter_intStackSize; // L: 271
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 274
									--HealthBar.Interpreter_stringStackSize; // L: 275
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 278
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 301
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class248.varcs.getInt(var7[var20]); // L: 302
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 305
											class248.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 306
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 309
											var13 = var7[var20] >> 16; // L: 310
											var14 = var7[var20] & 65535; // L: 311
											int var24 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 312
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
											var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 324
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 325
												throw new RuntimeException(); // L: 326
											}

											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 328
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 331
											var13 = var7[var20]; // L: 332
											Interpreter.Interpreter_intStackSize -= 2; // L: 333
											var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 334
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 335
												throw new RuntimeException(); // L: 336
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 338
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 341
												var22 = class248.varcs.getStringOld(var7[var20]); // L: 342
												if (var22 == null) { // L: 343
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var22; // L: 344
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 347
												class248.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]); // L: 348
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 351
												var22 = class248.varcs.getString(var7[var20]); // L: 352
												Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var22; // L: 353
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 356
												class248.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]); // L: 357
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 360
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 361
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 362
												if (var37 != null) { // L: 363
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 366
													var39 = class366.field4338.getTitleGroupValue(var7[var20]); // L: 367
													if (var39 == null) { // L: 368
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 369
													} else {
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var39; // L: 372
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 376
														throw new IllegalStateException(); // L: 386
													}

													var39 = class188.field1958.method7934(var7[var20]); // L: 377
													if (var39 == null) { // L: 378
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 379
													} else {
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var39; // L: 382
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 279
										Script var36 = SecureRandomCallable.getScript(var13); // L: 280
										int[] var15 = new int[var36.localIntCount]; // L: 281
										String[] var16 = new String[var36.localStringCount]; // L: 282

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 283
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 284
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (HealthBar.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										Interpreter.Interpreter_intStackSize -= var36.intArgumentCount; // L: 285
										HealthBar.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 286
										ScriptFrame var23 = new ScriptFrame(); // L: 287
										var23.script = var4; // L: 288
										var23.pc = var20; // L: 289
										var23.intLocals = Interpreter.Interpreter_intLocals; // L: 290
										var23.stringLocals = Interpreter.Interpreter_stringLocals; // L: 291
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 292
										var4 = var36; // L: 293
										var6 = var36.opcodes; // L: 294
										var7 = var36.intOperands; // L: 295
										var20 = -1; // L: 296
										Interpreter.Interpreter_intLocals = var15; // L: 297
										Interpreter.Interpreter_stringLocals = var16; // L: 298
									}
								}
							}
						} catch (Exception var31) { // L: 406
							var9 = true; // L: 407
							StringBuilder var27 = new StringBuilder(30); // L: 409
							var27.append("").append(var4.key).append(" "); // L: 410

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 411
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8); // L: 412
							class364.RunException_sendStackTrace(var27.toString(), var31); // L: 413
							var30 = false;
							break label955;
						}
					} finally {
						if (var30) {
							while (Interpreter.field837.size() > 0) {
								class99 var19 = (class99)Interpreter.field837.remove(0); // L: 418
								class333.widgetDefaultMenuAction(var19.method2631(), var19.method2632(), var19.method2635(), var19.method2634(), "");
							}

							if (Interpreter.field835) { // L: 421
								Interpreter.field835 = false; // L: 422
								class240.method4792(); // L: 423
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								class364.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field837.size() > 0) {
						class99 var41 = (class99)Interpreter.field837.remove(0);
						class333.widgetDefaultMenuAction(var41.method2631(), var41.method2632(), var41.method2635(), var41.method2634(), "");
					}

					if (Interpreter.field835) {
						Interpreter.field835 = false;
						class240.method4792();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						class364.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return; // L: 217
				}

				while (Interpreter.field837.size() > 0) { // L: 417
					class99 var26 = (class99)Interpreter.field837.remove(0);
					class333.widgetDefaultMenuAction(var26.method2631(), var26.method2632(), var26.method2635(), var26.method2634(), "");
				}

				if (Interpreter.field835) {
					Interpreter.field835 = false;
					class240.method4792();
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					class364.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return; // L: 429
			}

			while (Interpreter.field837.size() > 0) {
				class99 var34 = (class99)Interpreter.field837.remove(0);
				class333.widgetDefaultMenuAction(var34.method2631(), var34.method2632(), var34.method2635(), var34.method2634(), ""); // L: 419
			}

			if (Interpreter.field835) {
				Interpreter.field835 = false;
				class240.method4792();
			}

			if (!var9 && var2 > 0 && var10 >= var2) { // L: 425
				class364.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 426
			}

		}
	} // L: 129 395

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "265895051"
	)
	static void method173(int var0) {
		if (var0 != Login.loginIndex) { // L: 2222
			Login.loginIndex = var0; // L: 2223
		}
	} // L: 2224

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "-91"
	)
	static int method175(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 5043
			boolean var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 5044
			class140.method3106(var3); // L: 5045
			return 1; // L: 5046
		} else {
			return 2; // L: 5048
		}
	}
}
