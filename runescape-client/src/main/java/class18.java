import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public class class18 {
	@ObfuscatedName("je")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = 1692229567
	)
	static int field95;
	@ObfuscatedName("aw")
	Future field96;
	@ObfuscatedName("ay")
	String field94;

	class18(Future var1) {
		this.field96 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method261(var1);
	} // L: 15

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "57"
	)
	void method261(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field94 = var1;
		if (this.field96 != null) {
			this.field96.cancel(true);
			this.field96 = null;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "33"
	)
	public final String method262() {
		return this.field94;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "7786"
	)
	public boolean method263() {
		return this.field94 != null || this.field96 == null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	public final boolean method260() {
		return this.method263() ? true : this.field96.isDone();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lac;",
		garbageValue = "34"
	)
	public final class20 method265() {
		if (this.method263()) {
			return new class20(this.field94);
		} else if (!this.method260()) {
			return null;
		} else {
			try {
				return (class20)this.field96.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method261(var2);
				return new class20(var2);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;Ljava/lang/String;I)I",
		garbageValue = "2052181437"
	)
	public static int method275(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 14
		int var4 = var1.length(); // L: 17
		byte[] var5 = new byte[var4]; // L: 18

		for (int var6 = 0; var6 < var4; ++var6) { // L: 19
			char var7 = var1.charAt(var6); // L: 20
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 21
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) { // L: 22
				var5[var6] = -128;
			} else if (var7 == 8218) { // L: 23
				var5[var6] = -126;
			} else if (var7 == 402) { // L: 24
				var5[var6] = -125;
			} else if (var7 == 8222) { // L: 25
				var5[var6] = -124;
			} else if (var7 == 8230) { // L: 26
				var5[var6] = -123;
			} else if (var7 == 8224) { // L: 27
				var5[var6] = -122;
			} else if (var7 == 8225) { // L: 28
				var5[var6] = -121;
			} else if (var7 == 710) { // L: 29
				var5[var6] = -120;
			} else if (var7 == 8240) { // L: 30
				var5[var6] = -119;
			} else if (var7 == 352) { // L: 31
				var5[var6] = -118;
			} else if (var7 == 8249) { // L: 32
				var5[var6] = -117;
			} else if (var7 == 338) { // L: 33
				var5[var6] = -116;
			} else if (var7 == 381) { // L: 34
				var5[var6] = -114;
			} else if (var7 == 8216) { // L: 35
				var5[var6] = -111;
			} else if (var7 == 8217) { // L: 36
				var5[var6] = -110;
			} else if (var7 == 8220) { // L: 37
				var5[var6] = -109;
			} else if (var7 == 8221) { // L: 38
				var5[var6] = -108;
			} else if (var7 == 8226) { // L: 39
				var5[var6] = -107;
			} else if (var7 == 8211) {
				var5[var6] = -106; // L: 40
			} else if (var7 == 8212) { // L: 41
				var5[var6] = -105;
			} else if (var7 == 732) { // L: 42
				var5[var6] = -104;
			} else if (var7 == 8482) { // L: 43
				var5[var6] = -103;
			} else if (var7 == 353) { // L: 44
				var5[var6] = -102;
			} else if (var7 == 8250) { // L: 45
				var5[var6] = -101;
			} else if (var7 == 339) { // L: 46
				var5[var6] = -100;
			} else if (var7 == 382) { // L: 47
				var5[var6] = -98;
			} else if (var7 == 376) { // L: 48
				var5[var6] = -97;
			} else {
				var5[var6] = 63; // L: 49
			}
		}

		var0.writeSmartByteShort(var5.length); // L: 54
		var0.offset += class335.huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 55
		return var0.offset - var2; // L: 56
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ldi;Ldc;III)V",
		garbageValue = "-2007406926"
	)
	static void method270(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args; // L: 125
		Interpreter.Interpreter_intStackSize = 0; // L: 126
		Interpreter.Interpreter_stringStackSize = 0; // L: 127
		int var5 = -1; // L: 128
		int[] var6 = var1.opcodes; // L: 129
		int[] var7 = var1.intOperands; // L: 130
		byte var8 = -1; // L: 131
		Interpreter.Interpreter_frameDepth = 0; // L: 132
		Interpreter.field878 = false; // L: 133
		boolean var9 = false; // L: 134
		int var10 = 0; // L: 135
		boolean var29 = false;

		label935: {
			label936: {
				try {
					int var13;
					try {
						var29 = true; // L: 137
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount]; // L: 138
						int var11 = 0; // L: 139
						Interpreter.Interpreter_stringLocals = new String[var1.localStringCount]; // L: 140
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) { // L: 141
							if (var4[var13] instanceof Integer) { // L: 142
								var14 = (Integer)var4[var13]; // L: 143
								if (var14 == -2147483647) { // L: 144
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) { // L: 145
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) { // L: 146
									var14 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var14 == -2147483644) { // L: 147
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) { // L: 148
									var14 = var0.widget != null ? var0.widget.childIndex : -1;
								}

								if (var14 == -2147483642) { // L: 149
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) { // L: 150
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
								}

								if (var14 == -2147483640) { // L: 151
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) { // L: 152
									var14 = var0.keyPressed;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14; // L: 153
							} else if (var4[var13] instanceof String) { // L: 155
								var20 = (String)var4[var13]; // L: 156
								if (var20.equals("event_opbase")) { // L: 157
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20; // L: 158
							}
						}

						Interpreter.field881 = var0.field1074; // L: 162

						while (true) {
							++var10; // L: 164
							if (var10 > var2) { // L: 165
								throw new RuntimeException();
							}

							++var5; // L: 166
							int var32 = var6[var5];
							if (var32 >= 100) { // L: 167
								boolean var34;
								if (var1.intOperands[var5] == 1) { // L: 385
									var34 = true;
								} else {
									var34 = false; // L: 386
								}

								var14 = class142.method3122(var32, var1, var34); // L: 387
								switch(var14) { // L: 388
								case 0:
									var29 = false;
									break label935;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException(); // L: 393
								}
							} else if (var32 == 0) { // L: 168
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var5]; // L: 169
							} else if (var32 == 1) { // L: 172
								var13 = var7[var5]; // L: 173
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 174
							} else if (var32 == 2) { // L: 177
								var13 = var7[var5]; // L: 178
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 179
								MenuAction.changeGameOptions(var13); // L: 180
							} else if (var32 == 3) { // L: 183
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var1.stringOperands[var5]; // L: 184
							} else if (var32 == 6) { // L: 187
								var5 += var7[var5]; // L: 188
							} else if (var32 == 7) { // L: 191
								Interpreter.Interpreter_intStackSize -= 2; // L: 192
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 193
									var5 += var7[var5];
								}
							} else if (var32 == 8) { // L: 196
								Interpreter.Interpreter_intStackSize -= 2; // L: 197
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 198
									var5 += var7[var5];
								}
							} else if (var32 == 9) { // L: 201
								Interpreter.Interpreter_intStackSize -= 2; // L: 202
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 203
									var5 += var7[var5];
								}
							} else if (var32 == 10) { // L: 206
								Interpreter.Interpreter_intStackSize -= 2; // L: 207
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 208
									var5 += var7[var5];
								}
							} else if (var32 == 21) { // L: 211
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break label936;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 213
								var1 = var39.script; // L: 214
								var6 = var1.opcodes; // L: 215
								var7 = var1.intOperands; // L: 216
								var5 = var39.pc; // L: 217
								Interpreter.Interpreter_intLocals = var39.intLocals; // L: 218
								Interpreter.Interpreter_stringLocals = var39.stringLocals; // L: 219
							} else if (var32 == 25) { // L: 222
								var13 = var7[var5]; // L: 223
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = DecorativeObject.getVarbit(var13); // L: 224
							} else if (var32 == 27) { // L: 227
								var13 = var7[var5]; // L: 228
								class164.method3392(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 229
							} else if (var32 == 31) { // L: 232
								Interpreter.Interpreter_intStackSize -= 2; // L: 233
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 234
									var5 += var7[var5];
								}
							} else if (var32 == 32) { // L: 237
								Interpreter.Interpreter_intStackSize -= 2; // L: 238
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 239
									var5 += var7[var5];
								}
							} else if (var32 == 33) { // L: 242
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]]; // L: 243
							} else if (var32 == 34) { // L: 246
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 247
							} else if (var32 == 35) { // L: 250
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]]; // L: 251
							} else if (var32 == 36) { // L: 254
								Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 255
							} else if (var32 == 37) { // L: 258
								var13 = var7[var5]; // L: 259
								Interpreter.Interpreter_stringStackSize -= var13; // L: 260
								var20 = class153.method3222(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var13); // L: 261
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var20; // L: 262
							} else if (var32 == 38) { // L: 265
								--Interpreter.Interpreter_intStackSize; // L: 266
							} else if (var32 == 39) { // L: 269
								--Interpreter.Interpreter_stringStackSize; // L: 270
							} else {
								int var17;
								if (var32 != 40) { // L: 273
									if (var32 == 42) { // L: 296
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PendingSpawn.varcs.getInt(var7[var5]); // L: 297
									} else if (var32 == 43) { // L: 300
										PendingSpawn.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 301
									} else if (var32 == 44) { // L: 304
										var13 = var7[var5] >> 16; // L: 305
										var14 = var7[var5] & 65535; // L: 306
										int var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 307
										if (var23 < 0 || var23 > 5000) { // L: 308
											throw new RuntimeException(); // L: 309
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23; // L: 311
										byte var24 = -1; // L: 312
										if (var14 == 105) { // L: 313
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) { // L: 314
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) { // L: 317
										var13 = var7[var5]; // L: 318
										var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 319
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 320
											throw new RuntimeException(); // L: 321
										}

										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 323
									} else if (var32 == 46) { // L: 326
										var13 = var7[var5]; // L: 327
										Interpreter.Interpreter_intStackSize -= 2; // L: 328
										var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 329
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 330
											throw new RuntimeException(); // L: 331
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 333
									} else {
										String var21;
										if (var32 == 47) { // L: 336
											var21 = PendingSpawn.varcs.getStringOld(var7[var5]); // L: 337
											if (var21 == null) { // L: 338
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21; // L: 339
										} else if (var32 == 48) { // L: 342
											PendingSpawn.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 343
										} else if (var32 == 49) { // L: 346
											var21 = PendingSpawn.varcs.getString(var7[var5]); // L: 347
											Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21; // L: 348
										} else if (var32 == 50) { // L: 351
											PendingSpawn.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 352
										} else if (var32 == 60) { // L: 355
											IterableNodeHashTable var37 = var1.switches[var7[var5]]; // L: 356
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 357
											if (var36 != null) { // L: 358
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) { // L: 361
												var38 = PacketBufferNode.field3212.getTitleGroupValue(var7[var5]); // L: 362
												if (var38 == null) { // L: 363
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 364
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38; // L: 367
												}
											} else {
												if (var32 != 76) { // L: 371
													throw new IllegalStateException(); // L: 381
												}

												var38 = class135.field1600.method8351(var7[var5]); // L: 372
												if (var38 == null) { // L: 373
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 374
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38; // L: 377
												}
											}
										}
									}
								} else {
									var13 = var7[var5]; // L: 274
									Script var35 = Interpreter.getScript(var13); // L: 275
									int[] var15 = new int[var35.localIntCount]; // L: 276
									String[] var16 = new String[var35.localStringCount]; // L: 277

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) { // L: 278
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) { // L: 279
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (Interpreter.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									Interpreter.Interpreter_intStackSize -= var35.intArgumentCount; // L: 280
									Interpreter.Interpreter_stringStackSize -= var35.stringArgumentCount; // L: 281
									ScriptFrame var22 = new ScriptFrame(); // L: 282
									var22.script = var1; // L: 283
									var22.pc = var5; // L: 284
									var22.intLocals = Interpreter.Interpreter_intLocals; // L: 285
									var22.stringLocals = Interpreter.Interpreter_stringLocals; // L: 286
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 287
									var1 = var35; // L: 288
									var6 = var35.opcodes; // L: 289
									var7 = var35.intOperands; // L: 290
									var5 = -1; // L: 291
									Interpreter.Interpreter_intLocals = var15; // L: 292
									Interpreter.Interpreter_stringLocals = var16; // L: 293
								}
							}
						}
					} catch (Exception var30) { // L: 401
						var9 = true; // L: 402
						StringBuilder var26 = new StringBuilder(30); // L: 404
						var26.append("").append(var1.key).append(" "); // L: 405
						var13 = Interpreter.Interpreter_frameDepth - 1; // L: 406

						while (true) {
							if (var13 < 0) {
								var26.append("").append(var8); // L: 407
								class317.RunException_sendStackTrace(var26.toString(), var30); // L: 408
								var29 = false;
								break;
							}

							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							--var13;
						}
					}
				} finally {
					if (var29) {
						while (Interpreter.field880.size() > 0) {
							class102 var19 = (class102)Interpreter.field880.remove(0); // L: 413
							BufferedSource.widgetDefaultMenuAction(var19.method2645(), var19.method2646(), var19.method2647(), var19.method2649(), "");
						}

						if (Interpreter.field878) { // L: 416
							Interpreter.field878 = false; // L: 417
							class390.method7262(); // L: 418
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class317.RunException_sendStackTrace("Warning: Script " + var1.field993 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field880.size() > 0) { // L: 412
					class102 var25 = (class102)Interpreter.field880.remove(0);
					BufferedSource.widgetDefaultMenuAction(var25.method2645(), var25.method2646(), var25.method2647(), var25.method2649(), "");
				}

				if (Interpreter.field878) {
					Interpreter.field878 = false;
					class390.method7262();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class317.RunException_sendStackTrace("Warning: Script " + var1.field993 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return; // L: 424
			}

			while (Interpreter.field880.size() > 0) {
				class102 var40 = (class102)Interpreter.field880.remove(0);
				BufferedSource.widgetDefaultMenuAction(var40.method2645(), var40.method2646(), var40.method2647(), var40.method2649(), "");
			}

			if (Interpreter.field878) {
				Interpreter.field878 = false;
				class390.method7262();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class317.RunException_sendStackTrace("Warning: Script " + var1.field993 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return; // L: 212
		}

		while (Interpreter.field880.size() > 0) {
			class102 var33 = (class102)Interpreter.field880.remove(0);
			BufferedSource.widgetDefaultMenuAction(var33.method2645(), var33.method2646(), var33.method2647(), var33.method2649(), ""); // L: 414
		}

		if (Interpreter.field878) {
			Interpreter.field878 = false;
			class390.method7262();
		}

		if (!var9 && var3 > 0 && var10 >= var3) { // L: 420
			class317.RunException_sendStackTrace("Warning: Script " + var1.field993 + " finished at op count " + var10 + " of max " + var2, (Throwable)null); // L: 421
		}

	} // L: 396

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1361591852"
	)
	static int method274(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 5112
			boolean var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 5113
			class10.method100(var3); // L: 5114
			return 1; // L: 5115
		} else {
			return 2; // L: 5117
		}
	}
}
