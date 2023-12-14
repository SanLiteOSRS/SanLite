import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cm")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("wd")
	@ObfuscatedGetter(
		intValue = 1860064437
	)
	@Export("foundItemIndex")
	static int foundItemIndex;

	ApproximateRouteStrategy() {
	} // L: 13080

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIILiw;I)Z",
		garbageValue = "729664573"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 13084
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ldo;Ldt;IIB)V",
		garbageValue = "113"
	)
	static void method1246(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args; // L: 127
		class517.Interpreter_intStackSize = 0; // L: 128
		class127.Interpreter_stringStackSize = 0; // L: 129
		int var5 = -1; // L: 130
		int[] var6 = var1.opcodes; // L: 131
		int[] var7 = var1.intOperands; // L: 132
		byte var8 = -1; // L: 133
		Interpreter.Interpreter_frameDepth = 0; // L: 134
		Interpreter.field846 = false; // L: 135
		boolean var9 = false; // L: 136
		int var10 = 0; // L: 137
		boolean var29 = false;

		label933: {
			label934: {
				try {
					int var13;
					try {
						var29 = true; // L: 139
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount]; // L: 140
						int var11 = 0; // L: 141
						class60.Interpreter_stringLocals = new String[var1.localStringCount]; // L: 142
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

								class60.Interpreter_stringLocals[var12++] = var20; // L: 160
							}
						}

						Interpreter.field849 = var0.field1063; // L: 164

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

								var14 = class149.method3270(var32, var1, var34); // L: 389
								switch(var14) { // L: 390
								case 0:
									var29 = false;
									break label933;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException(); // L: 397
								}
							} else if (var32 == 0) { // L: 170
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7[var5]; // L: 171
							} else if (var32 == 1) { // L: 174
								var13 = var7[var5]; // L: 175
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 176
							} else if (var32 == 2) { // L: 179
								var13 = var7[var5]; // L: 180
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 181
								Projectile.changeGameOptions(var13); // L: 182
							} else if (var32 == 3) { // L: 185
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var1.stringOperands[var5]; // L: 186
							} else if (var32 == 6) { // L: 189
								var5 += var7[var5]; // L: 190
							} else if (var32 == 7) { // L: 193
								class517.Interpreter_intStackSize -= 2; // L: 194
								if (Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]) { // L: 195
									var5 += var7[var5];
								}
							} else if (var32 == 8) { // L: 198
								class517.Interpreter_intStackSize -= 2; // L: 199
								if (Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]) { // L: 200
									var5 += var7[var5];
								}
							} else if (var32 == 9) { // L: 203
								class517.Interpreter_intStackSize -= 2; // L: 204
								if (Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]) { // L: 205
									var5 += var7[var5];
								}
							} else if (var32 == 10) { // L: 208
								class517.Interpreter_intStackSize -= 2; // L: 209
								if (Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]) { // L: 210
									var5 += var7[var5];
								}
							} else if (var32 == 21) { // L: 213
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 215
								var1 = var39.script; // L: 216
								var6 = var1.opcodes; // L: 217
								var7 = var1.intOperands; // L: 218
								var5 = var39.pc; // L: 219
								Interpreter.Interpreter_intLocals = var39.intLocals; // L: 220
								class60.Interpreter_stringLocals = var39.stringLocals; // L: 221
							} else if (var32 == 25) { // L: 224
								var13 = var7[var5]; // L: 225
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = HealthBar.getVarbit(var13); // L: 226
							} else if (var32 == 27) { // L: 229
								var13 = var7[var5]; // L: 230
								class306.method5910(var13, Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 231
							} else if (var32 == 31) { // L: 234
								class517.Interpreter_intStackSize -= 2; // L: 235
								if (Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]) { // L: 236
									var5 += var7[var5];
								}
							} else if (var32 == 32) { // L: 239
								class517.Interpreter_intStackSize -= 2; // L: 240
								if (Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]) { // L: 241
									var5 += var7[var5];
								}
							} else if (var32 == 33) { // L: 244
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]]; // L: 245
							} else if (var32 == 34) { // L: 248
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 249
							} else if (var32 == 35) { // L: 252
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = class60.Interpreter_stringLocals[var7[var5]]; // L: 253
							} else if (var32 == 36) { // L: 256
								class60.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 257
							} else if (var32 == 37) { // L: 260
								var13 = var7[var5]; // L: 261
								class127.Interpreter_stringStackSize -= var13; // L: 262
								var20 = WallObject.method5819(Interpreter.Interpreter_stringStack, class127.Interpreter_stringStackSize, var13); // L: 263
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var20; // L: 264
							} else if (var32 == 38) { // L: 267
								--class517.Interpreter_intStackSize; // L: 268
							} else if (var32 == 39) { // L: 271
								--class127.Interpreter_stringStackSize; // L: 272
							} else {
								int var17;
								if (var32 != 40) { // L: 275
									if (var32 == 42) { // L: 298
										Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class176.varcs.getInt(var7[var5]); // L: 299
									} else if (var32 == 43) { // L: 302
										class176.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 303
									} else if (var32 == 44) { // L: 306
										var13 = var7[var5] >> 16; // L: 307
										var14 = var7[var5] & 65535; // L: 308
										int var23 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 309
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
										var14 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 321
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 322
											throw new RuntimeException(); // L: 323
										}

										Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 325
									} else if (var32 == 46) { // L: 328
										var13 = var7[var5]; // L: 329
										class517.Interpreter_intStackSize -= 2; // L: 330
										var14 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 331
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 332
											throw new RuntimeException(); // L: 333
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 335
									} else {
										String var21;
										if (var32 == 47) { // L: 338
											var21 = class176.varcs.getStringOld(var7[var5]); // L: 339
											if (var21 == null) { // L: 340
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var21; // L: 341
										} else if (var32 == 48) { // L: 344
											class176.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]); // L: 345
										} else if (var32 == 49) { // L: 348
											var21 = class176.varcs.getString(var7[var5]); // L: 349
											Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var21; // L: 350
										} else if (var32 == 50) { // L: 353
											class176.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]); // L: 354
										} else if (var32 == 60) { // L: 357
											IterableNodeHashTable var37 = var1.switches[var7[var5]]; // L: 358
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 359
											if (var36 != null) { // L: 360
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) { // L: 363
												var38 = Timer.field4599.getTitleGroupValue(var7[var5]); // L: 364
												if (var38 == null) { // L: 365
													Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 366
												} else {
													Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var38; // L: 369
												}
											} else {
												if (var32 != 76) { // L: 373
													throw new IllegalStateException(); // L: 383
												}

												var38 = Client.field677.method8529(var7[var5]); // L: 374
												if (var38 == null) { // L: 375
													Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 376
												} else {
													Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var38; // L: 379
												}
											}
										}
									}
								} else {
									var13 = var7[var5]; // L: 276
									Script var35 = HealthBarUpdate.getScript(var13); // L: 277
									int[] var15 = new int[var35.localIntCount]; // L: 278
									String[] var16 = new String[var35.localStringCount]; // L: 279

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) { // L: 280
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (class517.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) { // L: 281
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class127.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									class517.Interpreter_intStackSize -= var35.intArgumentCount; // L: 282
									class127.Interpreter_stringStackSize -= var35.stringArgumentCount; // L: 283
									ScriptFrame var22 = new ScriptFrame(); // L: 284
									var22.script = var1; // L: 285
									var22.pc = var5; // L: 286
									var22.intLocals = Interpreter.Interpreter_intLocals; // L: 287
									var22.stringLocals = class60.Interpreter_stringLocals; // L: 288
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 289
									var1 = var35; // L: 290
									var6 = var35.opcodes; // L: 291
									var7 = var35.intOperands; // L: 292
									var5 = -1; // L: 293
									Interpreter.Interpreter_intLocals = var15; // L: 294
									class60.Interpreter_stringLocals = var16; // L: 295
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
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace(var26.toString(), var30); // L: 410
						var29 = false;
						break label934;
					}
				} finally {
					if (var29) {
						while (Interpreter.field847.size() > 0) {
							class102 var19 = (class102)Interpreter.field847.remove(0); // L: 415
							FloorOverlayDefinition.widgetDefaultMenuAction(var19.method2734(), var19.method2730(), var19.method2731(), var19.method2732(), "");
						}

						if (Interpreter.field846) { // L: 418
							Interpreter.field846 = false; // L: 419
							class520.method9190(); // L: 420
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							GrandExchangeOfferWorldComparator.RunException_sendStackTrace("Warning: Script " + var1.field974 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field847.size() > 0) {
					class102 var40 = (class102)Interpreter.field847.remove(0);
					FloorOverlayDefinition.widgetDefaultMenuAction(var40.method2734(), var40.method2730(), var40.method2731(), var40.method2732(), "");
				}

				if (Interpreter.field846) {
					Interpreter.field846 = false;
					class520.method9190();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					GrandExchangeOfferWorldComparator.RunException_sendStackTrace("Warning: Script " + var1.field974 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return; // L: 214
			}

			while (Interpreter.field847.size() > 0) { // L: 414
				class102 var25 = (class102)Interpreter.field847.remove(0);
				FloorOverlayDefinition.widgetDefaultMenuAction(var25.method2734(), var25.method2730(), var25.method2731(), var25.method2732(), "");
			}

			if (Interpreter.field846) {
				Interpreter.field846 = false;
				class520.method9190();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				GrandExchangeOfferWorldComparator.RunException_sendStackTrace("Warning: Script " + var1.field974 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return; // L: 426
		}

		while (Interpreter.field847.size() > 0) {
			class102 var33 = (class102)Interpreter.field847.remove(0);
			FloorOverlayDefinition.widgetDefaultMenuAction(var33.method2734(), var33.method2730(), var33.method2731(), var33.method2732(), ""); // L: 416
		}

		if (Interpreter.field846) {
			Interpreter.field846 = false;
			class520.method9190();
		}

		if (!var9 && var3 > 0 && var10 >= var3) { // L: 422
			GrandExchangeOfferWorldComparator.RunException_sendStackTrace("Warning: Script " + var1.field974 + " finished at op count " + var10 + " of max " + var2, (Throwable)null); // L: 423
		}

	} // L: 392

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1367539098"
	)
	static int method1251(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2828
			class517.Interpreter_intStackSize -= 2; // L: 2829
			var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 2830
			var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2831
			EnumComposition var10 = ObjectComposition.getEnum(var3); // L: 2832
			if (var10.outputType != 's') { // L: 2833
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2834
				if (var9 == var10.keys[var6]) { // L: 2835
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2836
					var10 = null; // L: 2837
					break;
				}
			}

			if (var10 != null) { // L: 2841
				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2842
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2844
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2870
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2871
				EnumComposition var4 = ObjectComposition.getEnum(var3); // L: 2872
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.size(); // L: 2873
				return 1; // L: 2874
			} else {
				return 2; // L: 2876
			}
		} else {
			class517.Interpreter_intStackSize -= 4; // L: 2845
			var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 2846
			var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2847
			int var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 2848
			var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 3]; // L: 2849
			EnumComposition var7 = ObjectComposition.getEnum(var5); // L: 2850
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2851
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2856
					if (var6 == var7.keys[var8]) { // L: 2857
						if (var9 == 115) { // L: 2858
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2859
						}

						var7 = null; // L: 2860
						break;
					}
				}

				if (var7 != null) { // L: 2864
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.defaultStr; // L: 2865
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2866
					}
				}

				return 1; // L: 2868
			} else {
				if (var9 == 115) { // L: 2852
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2853
				}

				return 1; // L: 2854
			}
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2097312971"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4542
	}
}
