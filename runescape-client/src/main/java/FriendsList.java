import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
@Implements("FriendsList")
public class FriendsList extends NameableContainer {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 305365899
	)
	int field4613;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lsl;)V"
	)
	public FriendsList(LoginType var1) {
		super(400); // L: 18
		this.field4613 = 1; // L: 14
		this.friendLoginUpdates = new LinkDeque(); // L: 15
		this.loginType = var1; // L: 19
	} // L: 20

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lqh;",
		garbageValue = "-76"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Friend(); // L: 24
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqh;",
		garbageValue = "24"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 29
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lur;ZI)Z",
		garbageValue = "1535970692"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1); // L: 33
		if (var3 == null) { // L: 34
			return false;
		} else {
			return !var2 || var3.world != 0; // L: 35
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "715795535"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 40
				boolean var3 = var1.readUnsignedByte() == 1; // L: 41
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 42
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 43
				int var6 = var1.readUnsignedShort(); // L: 44
				int var7 = var1.readUnsignedByte(); // L: 45
				int var8 = var1.readUnsignedByte(); // L: 46
				boolean var9 = (var8 & 2) != 0; // L: 47
				boolean var10 = (var8 & 1) != 0; // L: 48
				if (var6 > 0) { // L: 49
					var1.readStringCp1252NullTerminated(); // L: 50
					var1.readUnsignedByte(); // L: 51
					var1.readInt(); // L: 52
				}

				var1.readStringCp1252NullTerminated(); // L: 54
				if (var4 != null && var4.hasCleanName()) { // L: 55
					Friend var11 = (Friend)this.getByCurrentUsername(var4); // L: 56
					if (var3) { // L: 57
						Friend var12 = (Friend)this.getByCurrentUsername(var5); // L: 58
						if (var12 != null && var12 != var11) { // L: 59
							if (var11 != null) { // L: 60
								this.remove(var12); // L: 61
							} else {
								var11 = var12; // L: 64
							}
						}
					}

					if (var11 != null) { // L: 68
						this.changeName(var11, var4, var5); // L: 69
						if (var6 != var11.world) { // L: 70
							boolean var14 = true; // L: 71

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) { // L: 72
								if (var13.username.equals(var4)) { // L: 73
									if (var6 != 0 && var13.world == 0) { // L: 74
										var13.remove(); // L: 75
										var14 = false; // L: 76
									} else if (var6 == 0 && var13.world != 0) { // L: 78
										var13.remove(); // L: 79
										var14 = false; // L: 80
									}
								}
							}

							if (var14) { // L: 84
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) { // L: 87
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5); // L: 88
					}

					if (var6 != var11.world) { // L: 91
						var11.int2 = ++this.field4613 - 1; // L: 92
						if (var11.world == -1 && var6 == 0) { // L: 93
							var11.int2 = -(var11.int2 * -129953703) * 1942829033;
						}

						var11.world = var6; // L: 94
					}

					var11.rank = var7; // L: 96
					var11.field4624 = var9; // L: 97
					var11.field4625 = var10; // L: 98
					continue; // L: 99
				}

				throw new IllegalStateException();
			}

			this.sort(); // L: 100
			return; // L: 101
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldw;Ldr;IIB)V",
		garbageValue = "-89"
	)
	static void method7850(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args; // L: 125
		Interpreter.Interpreter_intStackSize = 0; // L: 126
		class179.Interpreter_stringStackSize = 0; // L: 127
		int var5 = -1; // L: 128
		int[] var6 = var1.opcodes; // L: 129
		int[] var7 = var1.intOperands; // L: 130
		byte var8 = -1; // L: 131
		Interpreter.Interpreter_frameDepth = 0; // L: 132
		Interpreter.field871 = false; // L: 133
		boolean var9 = false; // L: 134
		int var10 = 0; // L: 135
		boolean var29 = false;

		label932: {
			label933: {
				try {
					int var13;
					try {
						var29 = true; // L: 137
						IntHashTable.Interpreter_intLocals = new int[var1.localIntCount]; // L: 138
						int var11 = 0; // L: 139
						class11.Interpreter_stringLocals = new String[var1.localStringCount]; // L: 140
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

								IntHashTable.Interpreter_intLocals[var11++] = var14; // L: 153
							} else if (var4[var13] instanceof String) { // L: 155
								var20 = (String)var4[var13]; // L: 156
								if (var20.equals("event_opbase")) { // L: 157
									var20 = var0.targetName;
								}

								class11.Interpreter_stringLocals[var12++] = var20; // L: 158
							}
						}

						Interpreter.field867 = var0.field1077; // L: 162

						label919:
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

								var14 = class74.method2094(var32, var1, var34); // L: 387
								switch(var14) { // L: 388
								case 0:
									var29 = false;
									break label919;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException(); // L: 391
								}
							} else if (var32 == 0) { // L: 168
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var5]; // L: 169
							} else if (var32 == 1) { // L: 172
								var13 = var7[var5]; // L: 173
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 174
							} else if (var32 == 2) { // L: 177
								var13 = var7[var5]; // L: 178
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 179
								Varcs.changeGameOptions(var13); // L: 180
							} else if (var32 == 3) { // L: 183
								Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var1.stringOperands[var5]; // L: 184
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
									break label933;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 213
								var1 = var39.script; // L: 214
								var6 = var1.opcodes; // L: 215
								var7 = var1.intOperands; // L: 216
								var5 = var39.pc; // L: 217
								IntHashTable.Interpreter_intLocals = var39.intLocals; // L: 218
								class11.Interpreter_stringLocals = var39.stringLocals; // L: 219
							} else if (var32 == 25) { // L: 222
								var13 = var7[var5]; // L: 223
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.getVarbit(var13); // L: 224
							} else if (var32 == 27) { // L: 227
								var13 = var7[var5]; // L: 228
								LoginPacket.method5768(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 229
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
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = IntHashTable.Interpreter_intLocals[var7[var5]]; // L: 243
							} else if (var32 == 34) { // L: 246
								IntHashTable.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 247
							} else if (var32 == 35) { // L: 250
								Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = class11.Interpreter_stringLocals[var7[var5]]; // L: 251
							} else if (var32 == 36) { // L: 254
								class11.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 255
							} else if (var32 == 37) { // L: 258
								var13 = var7[var5]; // L: 259
								class179.Interpreter_stringStackSize -= var13; // L: 260
								var20 = Tiles.method2268(Interpreter.Interpreter_stringStack, class179.Interpreter_stringStackSize, var13); // L: 261
								Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var20; // L: 262
							} else if (var32 == 38) { // L: 265
								--Interpreter.Interpreter_intStackSize; // L: 266
							} else if (var32 == 39) { // L: 269
								--class179.Interpreter_stringStackSize; // L: 270
							} else {
								int var17;
								if (var32 != 40) { // L: 273
									if (var32 == 42) { // L: 296
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class144.varcs.getInt(var7[var5]); // L: 297
									} else if (var32 == 43) { // L: 300
										class144.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 301
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
											var21 = class144.varcs.getStringOld(var7[var5]); // L: 337
											if (var21 == null) { // L: 338
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var21; // L: 339
										} else if (var32 == 48) { // L: 342
											class144.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]); // L: 343
										} else if (var32 == 49) { // L: 346
											var21 = class144.varcs.getString(var7[var5]); // L: 347
											Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var21; // L: 348
										} else if (var32 == 50) { // L: 351
											class144.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]); // L: 352
										} else if (var32 == 60) { // L: 355
											IterableNodeHashTable var37 = var1.switches[var7[var5]]; // L: 356
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 357
											if (var36 != null) { // L: 358
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) { // L: 361
												var38 = class305.field3406.getTitleGroupValue(var7[var5]); // L: 362
												if (var38 == null) { // L: 363
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 364
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38; // L: 367
												}
											} else {
												if (var32 != 76) { // L: 371
													throw new IllegalStateException(); // L: 381
												}

												var38 = class72.field895.method8294(var7[var5]); // L: 372
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
									Script var35 = class465.getScript(var13); // L: 275
									int[] var15 = new int[var35.localIntCount]; // L: 276
									String[] var16 = new String[var35.localStringCount]; // L: 277

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) { // L: 278
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) { // L: 279
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class179.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									Interpreter.Interpreter_intStackSize -= var35.intArgumentCount; // L: 280
									class179.Interpreter_stringStackSize -= var35.stringArgumentCount; // L: 281
									ScriptFrame var22 = new ScriptFrame(); // L: 282
									var22.script = var1; // L: 283
									var22.pc = var5; // L: 284
									var22.intLocals = IntHashTable.Interpreter_intLocals; // L: 285
									var22.stringLocals = class11.Interpreter_stringLocals; // L: 286
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 287
									var1 = var35; // L: 288
									var6 = var35.opcodes; // L: 289
									var7 = var35.intOperands; // L: 290
									var5 = -1; // L: 291
									IntHashTable.Interpreter_intLocals = var15; // L: 292
									class11.Interpreter_stringLocals = var16; // L: 293
								}
							}
						}
					} catch (Exception var30) { // L: 401
						var9 = true; // L: 402
						StringBuilder var26 = new StringBuilder(30); // L: 404
						var26.append("").append(var1.key).append(" "); // L: 405

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 406
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8); // L: 407
						MusicPatchNode.RunException_sendStackTrace(var26.toString(), var30); // L: 408
						var29 = false;
						break label932;
					}
				} finally {
					if (var29) {
						while (Interpreter.field866.size() > 0) {
							class102 var19 = (class102)Interpreter.field866.remove(0); // L: 413
							class33.widgetDefaultMenuAction(var19.method2698(), var19.method2699(), var19.method2703(), var19.method2711(), "");
						}

						if (Interpreter.field871) { // L: 416
							Interpreter.field871 = false; // L: 417
							SoundCache.method880(); // L: 418
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							MusicPatchNode.RunException_sendStackTrace("Warning: Script " + var1.field985 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field866.size() > 0) {
					class102 var33 = (class102)Interpreter.field866.remove(0);
					class33.widgetDefaultMenuAction(var33.method2698(), var33.method2699(), var33.method2703(), var33.method2711(), ""); // L: 414
				}

				if (Interpreter.field871) {
					Interpreter.field871 = false;
					SoundCache.method880();
				}

				if (!var9 && var3 > 0 && var10 >= var3) { // L: 420
					MusicPatchNode.RunException_sendStackTrace("Warning: Script " + var1.field985 + " finished at op count " + var10 + " of max " + var2, (Throwable)null); // L: 421
				}

				return; // L: 396
			}

			while (Interpreter.field866.size() > 0) {
				class102 var40 = (class102)Interpreter.field866.remove(0);
				class33.widgetDefaultMenuAction(var40.method2698(), var40.method2699(), var40.method2703(), var40.method2711(), "");
			}

			if (Interpreter.field871) {
				Interpreter.field871 = false;
				SoundCache.method880();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				MusicPatchNode.RunException_sendStackTrace("Warning: Script " + var1.field985 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return; // L: 212
		}

		while (Interpreter.field866.size() > 0) { // L: 412
			class102 var25 = (class102)Interpreter.field866.remove(0);
			class33.widgetDefaultMenuAction(var25.method2698(), var25.method2699(), var25.method2703(), var25.method2711(), "");
		}

		if (Interpreter.field871) {
			Interpreter.field871 = false;
			SoundCache.method880();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			MusicPatchNode.RunException_sendStackTrace("Warning: Script " + var1.field985 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	} // L: 424
}
