import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1821044063
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1154647963
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ao")
	boolean field1431;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1134596027
	)
	int field1432;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -160467177
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	ServerPacket field1423;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	ServerPacket field1435;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	ServerPacket field1424;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1431 = true; // L: 22
		this.field1432 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2027798148"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset);
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
				this.bufferSize -= var1.index; // L: 44
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lmn;I)V",
		garbageValue = "2058430044"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrr;I)V",
		garbageValue = "1072013587"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-69"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2144845367"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lrr;",
		garbageValue = "-815838134"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-1568893992"
	)
	public static void method2892(AbstractArchive var0) {
		class528.VarcInt_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "-283981484"
	)
	public static void method2891(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) { // L: 35
			class321.field3478.clear(); // L: 38
			class321.field3481.clear(); // L: 39
			PendingSpawn.method2458(var5); // L: 40
			MusicPatchNode2.method6109(var0, var5); // L: 41
			if (!class321.field3478.isEmpty()) { // L: 42
				ScriptFrame.method1158(var1, var2, var3, var4); // L: 45
				class321.field3481.add(new class418((class425)null)); // L: 46
				class321.field3481.add(new class427((class425)null, class321.field3480, class321.field3475, class321.field3477)); // L: 47
				ArrayList var6 = new ArrayList(); // L: 48
				var6.add(new class422(new class424((class425)null, 0, true, class321.field3486))); // L: 49
				if (!class321.field3474.isEmpty()) { // L: 50
					ArrayList var7 = new ArrayList(); // L: 51
					var7.add(new class421(new class426((class425)null, var6), class321.field3485)); // L: 52
					ArrayList var8 = WorldMapLabelSize.method4627(); // L: 53
					var7.add(new class421(new class423(new class420((class425)null, var8), 0, false, class321.field3476), class321.field3483)); // L: 54
					class321.field3481.add(new class426((class425)null, var7)); // L: 55
				} else {
					class321.field3481.add(new class421((class425)null, class321.field3485)); // L: 58
					class321.field3481.add(new class426((class425)null, var6)); // L: 59
				}

			}
		}
	} // L: 36 43 61

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lda;Ldc;IIB)V",
		garbageValue = "122"
	)
	static void method2893(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args; // L: 128
		Interpreter.Interpreter_intStackSize = 0; // L: 129
		class60.Interpreter_stringStackSize = 0; // L: 130
		int var5 = -1; // L: 131
		int[] var6 = var1.opcodes; // L: 132
		int[] var7 = var1.intOperands; // L: 133
		byte var8 = -1; // L: 134
		Interpreter.Interpreter_frameDepth = 0; // L: 135
		Interpreter.field893 = false; // L: 136
		boolean var9 = false; // L: 137
		int var10 = 0; // L: 138
		boolean var29 = false;

		label937: {
			label938: {
				try {
					int var13;
					try {
						var29 = true; // L: 140
						class520.Interpreter_intLocals = new int[var1.localIntCount]; // L: 141
						int var11 = 0; // L: 142
						Interpreter.Interpreter_stringLocals = new String[var1.localStringCount]; // L: 143
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) { // L: 144
							if (var4[var13] instanceof Integer) { // L: 145
								var14 = (Integer)var4[var13]; // L: 146
								if (var14 == -2147483647) { // L: 147
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) { // L: 148
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) { // L: 149
									var14 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var14 == -2147483644) { // L: 150
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) { // L: 151
									var14 = var0.widget != null ? var0.widget.childIndex : -1;
								}

								if (var14 == -2147483642) { // L: 152
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) { // L: 153
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
								}

								if (var14 == -2147483640) { // L: 154
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) { // L: 155
									var14 = var0.keyPressed;
								}

								class520.Interpreter_intLocals[var11++] = var14; // L: 156
							} else if (var4[var13] instanceof String) { // L: 158
								var20 = (String)var4[var13]; // L: 159
								if (var20.equals("event_opbase")) { // L: 160
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20; // L: 161
							}
						}

						Interpreter.field896 = var0.field1102; // L: 165

						while (true) {
							++var10; // L: 167
							if (var10 > var2) { // L: 168
								throw new RuntimeException();
							}

							++var5; // L: 169
							int var32 = var6[var5];
							if (var32 >= 100) { // L: 170
								boolean var34;
								if (var1.intOperands[var5] == 1) { // L: 388
									var34 = true;
								} else {
									var34 = false; // L: 389
								}

								var14 = Canvas.method296(var32, var1, var34); // L: 390
								switch(var14) { // L: 391
								case 0:
									var29 = false;
									break label937;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException(); // L: 398
								}
							} else if (var32 == 0) { // L: 171
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var5]; // L: 172
							} else if (var32 == 1) { // L: 175
								var13 = var7[var5]; // L: 176
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 177
							} else if (var32 == 2) { // L: 180
								var13 = var7[var5]; // L: 181
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 182
								FriendSystem.changeGameOptions(var13); // L: 183
							} else if (var32 == 3) { // L: 186
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var1.stringOperands[var5]; // L: 187
							} else if (var32 == 6) { // L: 190
								var5 += var7[var5]; // L: 191
							} else if (var32 == 7) { // L: 194
								Interpreter.Interpreter_intStackSize -= 2; // L: 195
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 196
									var5 += var7[var5];
								}
							} else if (var32 == 8) { // L: 199
								Interpreter.Interpreter_intStackSize -= 2; // L: 200
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 201
									var5 += var7[var5];
								}
							} else if (var32 == 9) { // L: 204
								Interpreter.Interpreter_intStackSize -= 2; // L: 205
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 206
									var5 += var7[var5];
								}
							} else if (var32 == 10) { // L: 209
								Interpreter.Interpreter_intStackSize -= 2; // L: 210
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 211
									var5 += var7[var5];
								}
							} else if (var32 == 21) { // L: 214
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 216
								var1 = var39.script; // L: 217
								var6 = var1.opcodes; // L: 218
								var7 = var1.intOperands; // L: 219
								var5 = var39.pc; // L: 220
								class520.Interpreter_intLocals = var39.intLocals; // L: 221
								Interpreter.Interpreter_stringLocals = var39.stringLocals; // L: 222
							} else if (var32 == 25) { // L: 225
								var13 = var7[var5]; // L: 226
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class332.getVarbit(var13); // L: 227
							} else if (var32 == 27) { // L: 230
								var13 = var7[var5]; // L: 231
								class130.method3072(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 232
							} else if (var32 == 31) { // L: 235
								Interpreter.Interpreter_intStackSize -= 2; // L: 236
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 237
									var5 += var7[var5];
								}
							} else if (var32 == 32) { // L: 240
								Interpreter.Interpreter_intStackSize -= 2; // L: 241
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 242
									var5 += var7[var5];
								}
							} else if (var32 == 33) { // L: 245
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class520.Interpreter_intLocals[var7[var5]]; // L: 246
							} else if (var32 == 34) { // L: 249
								class520.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 250
							} else if (var32 == 35) { // L: 253
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]]; // L: 254
							} else if (var32 == 36) { // L: 257
								Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 258
							} else if (var32 == 37) { // L: 261
								var13 = var7[var5]; // L: 262
								class60.Interpreter_stringStackSize -= var13; // L: 263
								var20 = PacketBufferNode.method6049(Interpreter.Interpreter_stringStack, class60.Interpreter_stringStackSize, var13); // L: 264
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var20; // L: 265
							} else if (var32 == 38) { // L: 268
								--Interpreter.Interpreter_intStackSize; // L: 269
							} else if (var32 == 39) { // L: 272
								--class60.Interpreter_stringStackSize; // L: 273
							} else {
								int var17;
								if (var32 != 40) { // L: 276
									if (var32 == 42) { // L: 299
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.varcs.getInt(var7[var5]); // L: 300
									} else if (var32 == 43) { // L: 303
										ScriptFrame.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 304
									} else if (var32 == 44) { // L: 307
										var13 = var7[var5] >> 16; // L: 308
										var14 = var7[var5] & 65535; // L: 309
										int var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 310
										if (var23 < 0 || var23 > 5000) { // L: 311
											throw new RuntimeException(); // L: 312
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23; // L: 314
										byte var24 = -1; // L: 315
										if (var14 == 105) { // L: 316
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) { // L: 317
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) { // L: 320
										var13 = var7[var5]; // L: 321
										var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 322
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 323
											throw new RuntimeException(); // L: 324
										}

										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 326
									} else if (var32 == 46) { // L: 329
										var13 = var7[var5]; // L: 330
										Interpreter.Interpreter_intStackSize -= 2; // L: 331
										var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 332
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 333
											throw new RuntimeException(); // L: 334
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 336
									} else {
										String var21;
										if (var32 == 47) { // L: 339
											var21 = ScriptFrame.varcs.getStringOld(var7[var5]); // L: 340
											if (var21 == null) { // L: 341
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var21; // L: 342
										} else if (var32 == 48) { // L: 345
											ScriptFrame.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]); // L: 346
										} else if (var32 == 49) { // L: 349
											var21 = ScriptFrame.varcs.getString(var7[var5]); // L: 350
											Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var21; // L: 351
										} else if (var32 == 50) { // L: 354
											ScriptFrame.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]); // L: 355
										} else if (var32 == 60) { // L: 358
											IterableNodeHashTable var37 = var1.switches[var7[var5]]; // L: 359
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 360
											if (var36 != null) { // L: 361
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) { // L: 364
												var38 = class53.field363.getTitleGroupValue(var7[var5]); // L: 365
												if (var38 == null) { // L: 366
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 367
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38; // L: 370
												}
											} else {
												if (var32 != 76) { // L: 374
													throw new IllegalStateException(); // L: 384
												}

												var38 = class73.field920.method8720(var7[var5]); // L: 375
												if (var38 == null) { // L: 376
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 377
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38; // L: 380
												}
											}
										}
									}
								} else {
									var13 = var7[var5]; // L: 277
									Script var35 = GrandExchangeOfferOwnWorldComparator.getScript(var13); // L: 278
									int[] var15 = new int[var35.localIntCount]; // L: 279
									String[] var16 = new String[var35.localStringCount]; // L: 280

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) { // L: 281
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) { // L: 282
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class60.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									Interpreter.Interpreter_intStackSize -= var35.intArgumentCount; // L: 283
									class60.Interpreter_stringStackSize -= var35.stringArgumentCount; // L: 284
									ScriptFrame var22 = new ScriptFrame(); // L: 285
									var22.script = var1; // L: 286
									var22.pc = var5; // L: 287
									var22.intLocals = class520.Interpreter_intLocals; // L: 288
									var22.stringLocals = Interpreter.Interpreter_stringLocals; // L: 289
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 290
									var1 = var35; // L: 291
									var6 = var35.opcodes; // L: 292
									var7 = var35.intOperands; // L: 293
									var5 = -1; // L: 294
									class520.Interpreter_intLocals = var15; // L: 295
									Interpreter.Interpreter_stringLocals = var16; // L: 296
								}
							}
						}
					} catch (Exception var30) { // L: 404
						var9 = true; // L: 405
						StringBuilder var26 = new StringBuilder(30); // L: 407
						var26.append("").append(var1.key).append(" "); // L: 408

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 409
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8); // L: 410
						class315.RunException_sendStackTrace(var26.toString(), var30); // L: 411
						var29 = false;
						break label938;
					}
				} finally {
					if (var29) {
						while (Interpreter.field895.size() > 0) {
							class103 var19 = (class103)Interpreter.field895.remove(0); // L: 416
							class185.widgetDefaultMenuAction(var19.method2733(), var19.method2748(), var19.method2734(), var19.method2735(), "");
						}

						if (Interpreter.field893) { // L: 419
							Interpreter.field893 = false; // L: 420
							class272.method5372(); // L: 421
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class315.RunException_sendStackTrace("Warning: Script " + var1.field1028 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field895.size() > 0) {
					class103 var40 = (class103)Interpreter.field895.remove(0);
					class185.widgetDefaultMenuAction(var40.method2733(), var40.method2748(), var40.method2734(), var40.method2735(), "");
				}

				if (Interpreter.field893) {
					Interpreter.field893 = false;
					class272.method5372();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class315.RunException_sendStackTrace("Warning: Script " + var1.field1028 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return; // L: 215
			}

			while (Interpreter.field895.size() > 0) { // L: 415
				class103 var25 = (class103)Interpreter.field895.remove(0);
				class185.widgetDefaultMenuAction(var25.method2733(), var25.method2748(), var25.method2734(), var25.method2735(), "");
			}

			if (Interpreter.field893) {
				Interpreter.field893 = false;
				class272.method5372();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class315.RunException_sendStackTrace("Warning: Script " + var1.field1028 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return; // L: 427
		}

		while (Interpreter.field895.size() > 0) {
			class103 var33 = (class103)Interpreter.field895.remove(0);
			class185.widgetDefaultMenuAction(var33.method2733(), var33.method2748(), var33.method2734(), var33.method2735(), ""); // L: 417
		}

		if (Interpreter.field893) {
			Interpreter.field893 = false;
			class272.method5372();
		}

		if (!var9 && var3 > 0 && var10 >= var3) { // L: 423
			class315.RunException_sendStackTrace("Warning: Script " + var1.field1028 + " finished at op count " + var10 + " of max " + var2, (Throwable)null); // L: 424
		}

	} // L: 393
}
