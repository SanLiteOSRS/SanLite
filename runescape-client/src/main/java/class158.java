import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class158 extends class161 {
	@ObfuscatedName("am")
	static int[][] field1739;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1695262627
	)
	int field1735;
	@ObfuscatedName("al")
	byte field1733;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2077408315
	)
	int field1736;
	@ObfuscatedName("ax")
	String field1737;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class158(class162 var1) {
		this.this$0 = var1;
		this.field1735 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "0"
	)
	void vmethod3405(Buffer var1) {
		var1.readUnsignedByte();
		this.field1735 = var1.readUnsignedShort();
		this.field1733 = var1.readByte();
		this.field1736 = var1.readUnsignedShort(); // L: 138
		var1.readLong();
		this.field1737 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgb;B)V",
		garbageValue = "0"
	)
	void vmethod3411(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1735);
		var2.rank = this.field1733;
		var2.world = this.field1736;
		var2.username = new Username(this.field1737);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Lds;III)V",
		garbageValue = "-1880567886"
	)
	static void method3326(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args; // L: 127
		Interpreter.Interpreter_intStackSize = 0; // L: 128
		class180.Interpreter_stringStackSize = 0; // L: 129
		int var5 = -1; // L: 130
		int[] var6 = var1.opcodes; // L: 131
		int[] var7 = var1.intOperands; // L: 132
		byte var8 = -1; // L: 133
		Interpreter.Interpreter_frameDepth = 0; // L: 134
		Interpreter.field882 = false; // L: 135
		boolean var9 = false; // L: 136
		int var10 = 0; // L: 137
		boolean var29 = false;

		label932: {
			label933: {
				try {
					int var13;
					try {
						var29 = true; // L: 139
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount]; // L: 140
						int var11 = 0; // L: 141
						class160.Interpreter_stringLocals = new String[var1.localStringCount]; // L: 142
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

								Interpreter.Interpreter_intLocals[var11++] = var14; // L: 155
							} else if (var4[var13] instanceof String) { // L: 157
								var20 = (String)var4[var13]; // L: 158
								if (var20.equals("event_opbase")) { // L: 159
									var20 = var0.targetName;
								}

								class160.Interpreter_stringLocals[var12++] = var20; // L: 160
							}
						}

						Interpreter.field878 = var0.field1078; // L: 164

						label919:
						while (true) {
							++var10; // L: 166
							if (var10 > var2) { // L: 167
								throw new RuntimeException();
							}

							++var5; // L: 168
							int var32 = var6[var5];
							if (var32 >= 100) { // L: 169
								boolean var34;
								if (var1.intOperands[var5] == 1) {
									var34 = true;
								} else {
									var34 = false; // L: 388
								}

								var14 = ViewportMouse.method5046(var32, var1, var34);
								switch(var14) {
								case 0:
									var29 = false;
									break label919;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var32 == 0) { // L: 170
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var5]; // L: 171
							} else if (var32 == 1) { // L: 174
								var13 = var7[var5]; // L: 175
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 176
							} else if (var32 == 2) { // L: 179
								var13 = var7[var5]; // L: 180
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 181
								ScriptEvent.changeGameOptions(var13); // L: 182
							} else if (var32 == 3) { // L: 185
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var1.stringOperands[var5]; // L: 186
							} else if (var32 == 6) { // L: 189
								var5 += var7[var5]; // L: 190
							} else if (var32 == 7) { // L: 193
								Interpreter.Interpreter_intStackSize -= 2; // L: 194
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 195
									var5 += var7[var5];
								}
							} else if (var32 == 8) { // L: 198
								Interpreter.Interpreter_intStackSize -= 2; // L: 199
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 200
									var5 += var7[var5];
								}
							} else if (var32 == 9) { // L: 203
								Interpreter.Interpreter_intStackSize -= 2; // L: 204
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 205
									var5 += var7[var5];
								}
							} else if (var32 == 10) { // L: 208
								Interpreter.Interpreter_intStackSize -= 2; // L: 209
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 210
									var5 += var7[var5];
								}
							} else if (var32 == 21) { // L: 213
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break label933;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 215
								var1 = var39.script; // L: 216
								var6 = var1.opcodes; // L: 217
								var7 = var1.intOperands; // L: 218
								var5 = var39.pc; // L: 219
								Interpreter.Interpreter_intLocals = var39.intLocals; // L: 220
								class160.Interpreter_stringLocals = var39.stringLocals; // L: 221
							} else if (var32 == 25) { // L: 224
								var13 = var7[var5]; // L: 225
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class36.getVarbit(var13); // L: 226
							} else if (var32 == 27) { // L: 229
								var13 = var7[var5]; // L: 230
								class130.method3012(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 231
							} else if (var32 == 31) { // L: 234
								Interpreter.Interpreter_intStackSize -= 2; // L: 235
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 236
									var5 += var7[var5];
								}
							} else if (var32 == 32) { // L: 239
								Interpreter.Interpreter_intStackSize -= 2; // L: 240
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 241
									var5 += var7[var5];
								}
							} else if (var32 == 33) { // L: 244
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]]; // L: 245
							} else if (var32 == 34) { // L: 248
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 249
							} else if (var32 == 35) { // L: 252
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class160.Interpreter_stringLocals[var7[var5]]; // L: 253
							} else if (var32 == 36) { // L: 256
								class160.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 257
							} else if (var32 == 37) { // L: 260
								var13 = var7[var5]; // L: 261
								class180.Interpreter_stringStackSize -= var13; // L: 262
								var20 = class316.method5906(Interpreter.Interpreter_stringStack, class180.Interpreter_stringStackSize, var13); // L: 263
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var20; // L: 264
							} else if (var32 == 38) { // L: 267
								--Interpreter.Interpreter_intStackSize; // L: 268
							} else if (var32 == 39) { // L: 271
								--class180.Interpreter_stringStackSize; // L: 272
							} else {
								int var17;
								if (var32 != 40) { // L: 275
									if (var32 == 42) { // L: 298
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class33.varcs.getInt(var7[var5]); // L: 299
									} else if (var32 == 43) { // L: 302
										class33.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 303
									} else if (var32 == 44) { // L: 306
										var13 = var7[var5] >> 16; // L: 307
										var14 = var7[var5] & 65535; // L: 308
										int var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 309
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
										var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 321
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 322
											throw new RuntimeException(); // L: 323
										}

										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 325
									} else if (var32 == 46) { // L: 328
										var13 = var7[var5]; // L: 329
										Interpreter.Interpreter_intStackSize -= 2; // L: 330
										var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 331
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 332
											throw new RuntimeException(); // L: 333
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 335
									} else {
										String var21;
										if (var32 == 47) { // L: 338
											var21 = class33.varcs.getStringOld(var7[var5]); // L: 339
											if (var21 == null) { // L: 340
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var21; // L: 341
										} else if (var32 == 48) { // L: 344
											class33.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]); // L: 345
										} else if (var32 == 49) { // L: 348
											var21 = class33.varcs.getString(var7[var5]); // L: 349
											Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var21; // L: 350
										} else if (var32 == 50) { // L: 353
											class33.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]); // L: 354
										} else if (var32 == 60) { // L: 357
											IterableNodeHashTable var37 = var1.switches[var7[var5]]; // L: 358
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 359
											if (var36 != null) { // L: 360
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) { // L: 363
												var38 = class295.field3108.getTitleGroupValue(var7[var5]); // L: 364
												if (var38 == null) { // L: 365
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 366
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38; // L: 369
												}
											} else {
												if (var32 != 76) { // L: 373
													throw new IllegalStateException(); // L: 383
												}

												var38 = SequenceDefinition.field2316.method8445(var7[var5]); // L: 374
												if (var38 == null) { // L: 375
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 376
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38; // L: 379
												}
											}
										}
									}
								} else {
									var13 = var7[var5]; // L: 276
									Script var35 = KeyHandler.getScript(var13); // L: 277
									int[] var15 = new int[var35.localIntCount]; // L: 278
									String[] var16 = new String[var35.localStringCount]; // L: 279

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) { // L: 280
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) { // L: 281
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class180.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									Interpreter.Interpreter_intStackSize -= var35.intArgumentCount; // L: 282
									class180.Interpreter_stringStackSize -= var35.stringArgumentCount; // L: 283
									ScriptFrame var22 = new ScriptFrame(); // L: 284
									var22.script = var1; // L: 285
									var22.pc = var5; // L: 286
									var22.intLocals = Interpreter.Interpreter_intLocals; // L: 287
									var22.stringLocals = class160.Interpreter_stringLocals; // L: 288
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 289
									var1 = var35; // L: 290
									var6 = var35.opcodes; // L: 291
									var7 = var35.intOperands; // L: 292
									var5 = -1; // L: 293
									Interpreter.Interpreter_intLocals = var15; // L: 294
									class160.Interpreter_stringLocals = var16; // L: 295
								}
							}
						}
					} catch (Exception var30) {
						var9 = true;
						StringBuilder var26 = new StringBuilder(30);
						var26.append("").append(var1.key).append(" "); // L: 407

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8);
						class190.RunException_sendStackTrace(var26.toString(), var30);
						var29 = false;
						break label932;
					}
				} finally {
					if (var29) {
						while (Interpreter.field886.size() > 0) {
							class104 var19 = (class104)Interpreter.field886.remove(0); // L: 415
							TextureProvider.widgetDefaultMenuAction(var19.method2706(), var19.method2695(), var19.method2707(), var19.method2694(), "");
						}

						if (Interpreter.field882) {
							Interpreter.field882 = false;
							GrandExchangeOfferOwnWorldComparator.method1240();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class190.RunException_sendStackTrace("Warning: Script " + var1.field1004 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field886.size() > 0) {
					class104 var33 = (class104)Interpreter.field886.remove(0);
					TextureProvider.widgetDefaultMenuAction(var33.method2706(), var33.method2695(), var33.method2707(), var33.method2694(), "");
				}

				if (Interpreter.field882) {
					Interpreter.field882 = false;
					GrandExchangeOfferOwnWorldComparator.method1240();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class190.RunException_sendStackTrace("Warning: Script " + var1.field1004 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field886.size() > 0) {
				class104 var40 = (class104)Interpreter.field886.remove(0);
				TextureProvider.widgetDefaultMenuAction(var40.method2706(), var40.method2695(), var40.method2707(), var40.method2694(), "");
			}

			if (Interpreter.field882) {
				Interpreter.field882 = false;
				GrandExchangeOfferOwnWorldComparator.method1240();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class190.RunException_sendStackTrace("Warning: Script " + var1.field1004 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return; // L: 214
		}

		while (Interpreter.field886.size() > 0) {
			class104 var25 = (class104)Interpreter.field886.remove(0);
			TextureProvider.widgetDefaultMenuAction(var25.method2706(), var25.method2695(), var25.method2707(), var25.method2694(), "");
		}

		if (Interpreter.field882) {
			Interpreter.field882 = false;
			GrandExchangeOfferOwnWorldComparator.method1240();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class190.RunException_sendStackTrace("Warning: Script " + var1.field1004 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lud;",
		garbageValue = "2006480609"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 385
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 386
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var3 << 42); // L: 387
		SpritePixels var8;
		if (!var5) { // L: 389
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 390
			if (var8 != null) { // L: 391
				return var8;
			}
		}

		ItemComposition var9 = class214.ItemComposition_get(var0); // L: 393
		if (var1 > 1 && var9.countobj != null) { // L: 394
			int var10 = -1; // L: 395

			for (int var11 = 0; var11 < 10; ++var11) { // L: 396
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 397
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 399
				var9 = class214.ItemComposition_get(var10);
			}
		}

		Model var20 = var9.getModel(1); // L: 401
		if (var20 == null) { // L: 402
			return null;
		} else {
			SpritePixels var21 = null; // L: 403
			if (var9.noteTemplate != -1) { // L: 404
				var21 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 405
				if (var21 == null) { // L: 406
					return null;
				}
			} else if (var9.notedId != -1) { // L: 408
				var21 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 409
				if (var21 == null) { // L: 410
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 412
				var21 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 413
				if (var21 == null) { // L: 414
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 416
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 417
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 418
			float[] var15 = Rasterizer2D.field5209; // L: 419
			int[] var16 = new int[4]; // L: 420
			Rasterizer2D.Rasterizer2D_getClipArray(var16); // L: 421
			var8 = new SpritePixels(36, 32); // L: 422
			Rasterizer3D.method4530(var8.pixels, 36, 32, (float[])null); // L: 423
			Rasterizer2D.Rasterizer2D_clear(); // L: 424
			Rasterizer3D.method4535(); // L: 425
			Rasterizer3D.method4534(16, 16); // L: 426
			Rasterizer3D.field2550.field2831 = false; // L: 427
			if (var9.placeholderTemplate != -1) { // L: 428
				var21.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d; // L: 429
			if (var5) { // L: 430
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) { // L: 431
				var17 = (int)(1.04D * (double)var17);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 432
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 433
			var20.calculateBoundsCylinder(); // L: 434
			var20.method4933(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var20.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d); // L: 435
			if (var9.notedId != -1) { // L: 436
				var21.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 437
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 438
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 439
				var8.shadow(var3);
			}

			Rasterizer3D.method4530(var8.pixels, 36, 32, (float[])null); // L: 440
			if (var9.noteTemplate != -1) { // L: 441
				var21.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 442
				class142.ItemComposition_fontPlain11.draw(class481.method8541(var1), 0, 9, 16776960, 1); // L: 443
			}

			if (!var5) { // L: 445
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method4530(var12, var13, var14, var15); // L: 446
			Rasterizer2D.Rasterizer2D_setClipArray(var16); // L: 447
			Rasterizer3D.method4535(); // L: 448
			Rasterizer3D.field2550.field2831 = true; // L: 449
			return var8; // L: 450
		}
	}
}
