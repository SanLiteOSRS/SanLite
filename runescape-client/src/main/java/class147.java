import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class147 extends class143 {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1887192453
	)
	int field1693;
	@ObfuscatedName("ae")
	byte field1692;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class147(class146 var1) {
		this.this$0 = var1;
		this.field1693 = -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1693 = var1.readUnsignedShort();
		this.field1692 = var1.readByte();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3230(this.field1693, this.field1692);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldy;Ldh;III)V",
		garbageValue = "1066790817"
	)
	static void method3132(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args; // L: 127
		SoundCache.Interpreter_intStackSize = 0; // L: 128
		class137.Interpreter_stringStackSize = 0; // L: 129
		int var5 = -1; // L: 130
		int[] var6 = var1.opcodes; // L: 131
		int[] var7 = var1.intOperands; // L: 132
		byte var8 = -1; // L: 133
		Interpreter.Interpreter_frameDepth = 0; // L: 134
		Interpreter.field893 = false; // L: 135
		boolean var9 = false; // L: 136
		int var10 = 0; // L: 137
		boolean var29 = false;

		label931: {
			label932: {
				try {
					int var13;
					try {
						var29 = true; // L: 139
						Varps.Interpreter_intLocals = new int[var1.localIntCount]; // L: 140
						int var11 = 0; // L: 141
						Interpreter.Interpreter_stringLocals = new String[var1.localStringCount]; // L: 142
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) { // L: 143
							if (var4[var13] instanceof Integer) { // L: 144
								var14 = (Integer)var4[var13]; // L: 145
								if (var14 == -2147483647) { // L: 146
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) { // L: 147
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) { // L: 148
									var14 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var14 == -2147483644) { // L: 149
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) { // L: 150
									var14 = var0.widget != null ? var0.widget.childIndex : -1;
								}

								if (var14 == -2147483642) { // L: 151
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) { // L: 152
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
								}

								if (var14 == -2147483640) { // L: 153
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) { // L: 154
									var14 = var0.keyPressed;
								}

								Varps.Interpreter_intLocals[var11++] = var14; // L: 155
							} else if (var4[var13] instanceof String) { // L: 157
								var20 = (String)var4[var13]; // L: 158
								if (var20.equals("event_opbase")) { // L: 159
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20; // L: 160
							}
						}

						Interpreter.field890 = var0.field1093; // L: 164

						label918:
						while (true) {
							++var10; // L: 166
							if (var10 > var2) { // L: 167
								throw new RuntimeException();
							}

							++var5; // L: 168
							int var32 = var6[var5];
							if (var32 >= 100) { // L: 169
								boolean var34;
								if (var1.intOperands[var5] == 1) { // L: 387
									var34 = true;
								} else {
									var34 = false; // L: 388
								}

								var14 = PacketWriter.method2801(var32, var1, var34); // L: 389
								switch(var14) { // L: 390
								case 0:
									var29 = false;
									break label918;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException(); // L: 397
								}
							} else if (var32 == 0) { // L: 170
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7[var5]; // L: 171
							} else if (var32 == 1) { // L: 174
								var13 = var7[var5]; // L: 175
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 176
							} else if (var32 == 2) { // L: 179
								var13 = var7[var5]; // L: 180
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 181
								WorldMapDecoration.changeGameOptions(var13); // L: 182
							} else if (var32 == 3) { // L: 185
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var1.stringOperands[var5]; // L: 186
							} else if (var32 == 6) { // L: 189
								var5 += var7[var5]; // L: 190
							} else if (var32 == 7) { // L: 193
								SoundCache.Interpreter_intStackSize -= 2; // L: 194
								if (Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]) { // L: 195
									var5 += var7[var5];
								}
							} else if (var32 == 8) { // L: 198
								SoundCache.Interpreter_intStackSize -= 2; // L: 199
								if (Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]) { // L: 200
									var5 += var7[var5];
								}
							} else if (var32 == 9) { // L: 203
								SoundCache.Interpreter_intStackSize -= 2; // L: 204
								if (Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]) { // L: 205
									var5 += var7[var5];
								}
							} else if (var32 == 10) { // L: 208
								SoundCache.Interpreter_intStackSize -= 2; // L: 209
								if (Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]) { // L: 210
									var5 += var7[var5];
								}
							} else if (var32 == 21) { // L: 213
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break label932;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 215
								var1 = var39.script; // L: 216
								var6 = var1.opcodes; // L: 217
								var7 = var1.intOperands; // L: 218
								var5 = var39.pc; // L: 219
								Varps.Interpreter_intLocals = var39.intLocals; // L: 220
								Interpreter.Interpreter_stringLocals = var39.stringLocals; // L: 221
							} else if (var32 == 25) { // L: 224
								var13 = var7[var5]; // L: 225
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ClientPreferences.getVarbit(var13); // L: 226
							} else if (var32 == 27) { // L: 229
								var13 = var7[var5]; // L: 230
								Frames.method4723(var13, Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 231
							} else if (var32 == 31) { // L: 234
								SoundCache.Interpreter_intStackSize -= 2; // L: 235
								if (Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]) { // L: 236
									var5 += var7[var5];
								}
							} else if (var32 == 32) { // L: 239
								SoundCache.Interpreter_intStackSize -= 2; // L: 240
								if (Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]) { // L: 241
									var5 += var7[var5];
								}
							} else if (var32 == 33) { // L: 244
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Varps.Interpreter_intLocals[var7[var5]]; // L: 245
							} else if (var32 == 34) { // L: 248
								Varps.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 249
							} else if (var32 == 35) { // L: 252
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]]; // L: 253
							} else if (var32 == 36) { // L: 256
								Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 257
							} else if (var32 == 37) { // L: 260
								var13 = var7[var5]; // L: 261
								class137.Interpreter_stringStackSize -= var13; // L: 262
								var20 = WorldMapID.method5496(Interpreter.Interpreter_stringStack, class137.Interpreter_stringStackSize, var13); // L: 263
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var20; // L: 264
							} else if (var32 == 38) { // L: 267
								--SoundCache.Interpreter_intStackSize; // L: 268
							} else if (var32 == 39) { // L: 271
								--class137.Interpreter_stringStackSize; // L: 272
							} else {
								int var17;
								if (var32 != 40) { // L: 275
									if (var32 == 42) { // L: 298
										Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class25.varcs.getInt(var7[var5]); // L: 299
									} else if (var32 == 43) { // L: 302
										class25.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 303
									} else if (var32 == 44) { // L: 306
										var13 = var7[var5] >> 16; // L: 307
										var14 = var7[var5] & 65535; // L: 308
										int var23 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 309
										if (var23 < 0 || var23 > 5000) { // L: 310
											throw new RuntimeException(); // L: 311
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23; // L: 313
										byte var24 = -1; // L: 314
										if (var14 == 105) { // L: 315
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) { // L: 316
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) { // L: 319
										var13 = var7[var5]; // L: 320
										var14 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 321
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 322
											throw new RuntimeException(); // L: 323
										}

										Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 325
									} else if (var32 == 46) { // L: 328
										var13 = var7[var5]; // L: 329
										SoundCache.Interpreter_intStackSize -= 2; // L: 330
										var14 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 331
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 332
											throw new RuntimeException(); // L: 333
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 335
									} else {
										String var21;
										if (var32 == 47) { // L: 338
											var21 = class25.varcs.getStringOld(var7[var5]); // L: 339
											if (var21 == null) { // L: 340
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var21; // L: 341
										} else if (var32 == 48) { // L: 344
											class25.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]); // L: 345
										} else if (var32 == 49) { // L: 348
											var21 = class25.varcs.getString(var7[var5]); // L: 349
											Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var21; // L: 350
										} else if (var32 == 50) { // L: 353
											class25.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]); // L: 354
										} else if (var32 == 60) { // L: 357
											IterableNodeHashTable var37 = var1.switches[var7[var5]]; // L: 358
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 359
											if (var36 != null) { // L: 360
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) { // L: 363
												var38 = class466.field4802.getTitleGroupValue(var7[var5]); // L: 364
												if (var38 == null) { // L: 365
													Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 366
												} else {
													Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var38; // L: 369
												}
											} else {
												if (var32 != 76) { // L: 373
													throw new IllegalStateException(); // L: 383
												}

												var38 = class139.field1654.method8287(var7[var5]); // L: 374
												if (var38 == null) { // L: 375
													Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 376
												} else {
													Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var38; // L: 379
												}
											}
										}
									}
								} else {
									var13 = var7[var5]; // L: 276
									Script var35 = class133.getScript(var13); // L: 277
									int[] var15 = new int[var35.localIntCount]; // L: 278
									String[] var16 = new String[var35.localStringCount]; // L: 279

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) { // L: 280
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (SoundCache.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) { // L: 281
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class137.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									SoundCache.Interpreter_intStackSize -= var35.intArgumentCount; // L: 282
									class137.Interpreter_stringStackSize -= var35.stringArgumentCount; // L: 283
									ScriptFrame var22 = new ScriptFrame(); // L: 284
									var22.script = var1; // L: 285
									var22.pc = var5; // L: 286
									var22.intLocals = Varps.Interpreter_intLocals; // L: 287
									var22.stringLocals = Interpreter.Interpreter_stringLocals; // L: 288
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 289
									var1 = var35; // L: 290
									var6 = var35.opcodes; // L: 291
									var7 = var35.intOperands; // L: 292
									var5 = -1; // L: 293
									Varps.Interpreter_intLocals = var15; // L: 294
									Interpreter.Interpreter_stringLocals = var16; // L: 295
								}
							}
						}
					} catch (Exception var30) { // L: 403
						var9 = true; // L: 404
						StringBuilder var26 = new StringBuilder(30); // L: 406
						var26.append("").append(var1.key).append(" "); // L: 407

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 408
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8); // L: 409
						Messages.RunException_sendStackTrace(var26.toString(), var30); // L: 410
						var29 = false;
						break label931;
					}
				} finally {
					if (var29) {
						while (Interpreter.field889.size() > 0) {
							class102 var19 = (class102)Interpreter.field889.remove(0); // L: 415
							class47.widgetDefaultMenuAction(var19.method2658(), var19.method2661(), var19.method2652(), var19.method2647(), "");
						}

						if (Interpreter.field893) { // L: 418
							Interpreter.field893 = false; // L: 419
							WorldMapIcon_1.method5076(); // L: 420
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							Messages.RunException_sendStackTrace("Warning: Script " + var1.field1014 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field889.size() > 0) {
					class102 var33 = (class102)Interpreter.field889.remove(0);
					class47.widgetDefaultMenuAction(var33.method2658(), var33.method2661(), var33.method2652(), var33.method2647(), ""); // L: 416
				}

				if (Interpreter.field893) {
					Interpreter.field893 = false;
					WorldMapIcon_1.method5076();
				}

				if (!var9 && var3 > 0 && var10 >= var3) { // L: 422
					Messages.RunException_sendStackTrace("Warning: Script " + var1.field1014 + " finished at op count " + var10 + " of max " + var2, (Throwable)null); // L: 423
				}

				return; // L: 392
			}

			while (Interpreter.field889.size() > 0) {
				class102 var40 = (class102)Interpreter.field889.remove(0);
				class47.widgetDefaultMenuAction(var40.method2658(), var40.method2661(), var40.method2652(), var40.method2647(), "");
			}

			if (Interpreter.field893) {
				Interpreter.field893 = false;
				WorldMapIcon_1.method5076();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				Messages.RunException_sendStackTrace("Warning: Script " + var1.field1014 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return; // L: 214
		}

		while (Interpreter.field889.size() > 0) { // L: 414
			class102 var25 = (class102)Interpreter.field889.remove(0);
			class47.widgetDefaultMenuAction(var25.method2658(), var25.method2661(), var25.method2652(), var25.method2647(), "");
		}

		if (Interpreter.field893) {
			Interpreter.field893 = false;
			WorldMapIcon_1.method5076();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			Messages.RunException_sendStackTrace("Warning: Script " + var1.field1014 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	} // L: 426

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-531661874"
	)
	static void method3137() {
		int var0 = Players.Players_count; // L: 5061
		int[] var1 = Players.Players_indices; // L: 5062

		for (int var2 = 0; var2 < var0; ++var2) { // L: 5063
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 5064
				class92.addPlayerToScene(Client.players[var1[var2]], true); // L: 5065
			}
		}

	} // L: 5067
}
