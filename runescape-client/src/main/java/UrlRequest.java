import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -872465345
	)
	static int field1462;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -713649217
	)
	static int field1464;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ba")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;
	@ObfuscatedName("az")
	final URL field1469;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1353508695
	)
	volatile int field1465;
	@ObfuscatedName("an")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1462 = -1;
		field1464 = -2;
	}

	UrlRequest(URL var1) {
		this.field1465 = field1462;
		this.field1469 = var1; // L: 140
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1465 != field1462;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "599950154"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public String method2857() {
		return this.field1469.toString();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Ldn;III)V",
		garbageValue = "-815822149"
	)
	static void method2845(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args; // L: 129
		class19.Interpreter_intStackSize = 0; // L: 130
		AbstractWorldMapIcon.Interpreter_stringStackSize = 0; // L: 131
		int var5 = -1; // L: 132
		int[] var6 = var1.opcodes; // L: 133
		int[] var7 = var1.intOperands; // L: 134
		byte var8 = -1; // L: 135
		Interpreter.Interpreter_frameDepth = 0; // L: 136
		Interpreter.field872 = false; // L: 137
		boolean var9 = false; // L: 138
		int var10 = 0; // L: 139
		boolean var29 = false;

		label934: {
			label935: {
				try {
					int var13;
					try {
						var29 = true; // L: 141
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount]; // L: 142
						int var11 = 0; // L: 143
						Interpreter.Interpreter_stringLocals = new String[var1.localStringCount]; // L: 144
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) { // L: 145
							if (var4[var13] instanceof Integer) { // L: 146
								var14 = (Integer)var4[var13]; // L: 147
								if (var14 == -2147483647) { // L: 148
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) { // L: 149
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) { // L: 150
									var14 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var14 == -2147483644) { // L: 151
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) { // L: 152
									var14 = var0.widget != null ? var0.widget.childIndex : -1;
								}

								if (var14 == -2147483642) { // L: 153
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) { // L: 154
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
								}

								if (var14 == -2147483640) { // L: 155
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) { // L: 156
									var14 = var0.keyPressed;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14; // L: 157
							} else if (var4[var13] instanceof String) { // L: 159
								var20 = (String)var4[var13]; // L: 160
								if (var20.equals("event_opbase")) { // L: 161
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20; // L: 162
							}
						}

						Interpreter.field875 = var0.field1087; // L: 166

						while (true) {
							++var10; // L: 168
							if (var10 > var2) { // L: 169
								throw new RuntimeException();
							}

							++var5; // L: 170
							int var32 = var6[var5];
							if (var32 >= 100) { // L: 171
								boolean var34;
								if (var1.intOperands[var5] == 1) { // L: 389
									var34 = true;
								} else {
									var34 = false; // L: 390
								}

								var14 = class149.method3186(var32, var1, var34); // L: 391
								switch(var14) { // L: 392
								case 0:
									var29 = false;
									break label934;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException(); // L: 395
								}
							} else if (var32 == 0) { // L: 172
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7[var5]; // L: 173
							} else if (var32 == 1) { // L: 176
								var13 = var7[var5]; // L: 177
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 178
							} else if (var32 == 2) { // L: 181
								var13 = var7[var5]; // L: 182
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 183
								class11.changeGameOptions(var13); // L: 184
							} else if (var32 == 3) { // L: 187
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var1.stringOperands[var5]; // L: 188
							} else if (var32 == 6) { // L: 191
								var5 += var7[var5]; // L: 192
							} else if (var32 == 7) { // L: 195
								class19.Interpreter_intStackSize -= 2; // L: 196
								if (Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]) { // L: 197
									var5 += var7[var5];
								}
							} else if (var32 == 8) { // L: 200
								class19.Interpreter_intStackSize -= 2; // L: 201
								if (Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]) { // L: 202
									var5 += var7[var5];
								}
							} else if (var32 == 9) { // L: 205
								class19.Interpreter_intStackSize -= 2; // L: 206
								if (Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]) { // L: 207
									var5 += var7[var5];
								}
							} else if (var32 == 10) { // L: 210
								class19.Interpreter_intStackSize -= 2; // L: 211
								if (Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]) { // L: 212
									var5 += var7[var5];
								}
							} else if (var32 == 21) { // L: 215
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 217
								var1 = var39.script; // L: 218
								var6 = var1.opcodes; // L: 219
								var7 = var1.intOperands; // L: 220
								var5 = var39.pc; // L: 221
								Interpreter.Interpreter_intLocals = var39.intLocals; // L: 222
								Interpreter.Interpreter_stringLocals = var39.stringLocals; // L: 223
							} else if (var32 == 25) { // L: 226
								var13 = var7[var5]; // L: 227
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = SpotAnimationDefinition.getVarbit(var13); // L: 228
							} else if (var32 == 27) { // L: 231
								var13 = var7[var5]; // L: 232
								class234.method4464(var13, Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 233
							} else if (var32 == 31) { // L: 236
								class19.Interpreter_intStackSize -= 2; // L: 237
								if (Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]) { // L: 238
									var5 += var7[var5];
								}
							} else if (var32 == 32) { // L: 241
								class19.Interpreter_intStackSize -= 2; // L: 242
								if (Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]) { // L: 243
									var5 += var7[var5];
								}
							} else if (var32 == 33) { // L: 246
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]]; // L: 247
							} else if (var32 == 34) { // L: 250
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 251
							} else if (var32 == 35) { // L: 254
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]]; // L: 255
							} else if (var32 == 36) { // L: 258
								Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 259
							} else if (var32 == 37) { // L: 262
								var13 = var7[var5]; // L: 263
								AbstractWorldMapIcon.Interpreter_stringStackSize -= var13; // L: 264
								var20 = AbstractArchive.method7032(Interpreter.Interpreter_stringStack, AbstractWorldMapIcon.Interpreter_stringStackSize, var13); // L: 265
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var20; // L: 266
							} else if (var32 == 38) { // L: 269
								--class19.Interpreter_intStackSize; // L: 270
							} else if (var32 == 39) { // L: 273
								--AbstractWorldMapIcon.Interpreter_stringStackSize; // L: 274
							} else {
								int var17;
								if (var32 != 40) { // L: 277
									if (var32 == 42) { // L: 300
										Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class130.varcs.getInt(var7[var5]); // L: 301
									} else if (var32 == 43) { // L: 304
										class130.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 305
									} else if (var32 == 44) { // L: 308
										var13 = var7[var5] >> 16; // L: 309
										var14 = var7[var5] & 65535; // L: 310
										int var23 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 311
										if (var23 < 0 || var23 > 5000) { // L: 312
											throw new RuntimeException(); // L: 313
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23; // L: 315
										byte var24 = -1; // L: 316
										if (var14 == 105) { // L: 317
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) { // L: 318
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) { // L: 321
										var13 = var7[var5]; // L: 322
										var14 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 323
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 324
											throw new RuntimeException(); // L: 325
										}

										Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 327
									} else if (var32 == 46) { // L: 330
										var13 = var7[var5]; // L: 331
										class19.Interpreter_intStackSize -= 2; // L: 332
										var14 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 333
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 334
											throw new RuntimeException(); // L: 335
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 337
									} else {
										String var21;
										if (var32 == 47) { // L: 340
											var21 = class130.varcs.getStringOld(var7[var5]); // L: 341
											if (var21 == null) { // L: 342
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var21; // L: 343
										} else if (var32 == 48) { // L: 346
											class130.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]); // L: 347
										} else if (var32 == 49) { // L: 350
											var21 = class130.varcs.getString(var7[var5]); // L: 351
											Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var21; // L: 352
										} else if (var32 == 50) { // L: 355
											class130.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]); // L: 356
										} else if (var32 == 60) { // L: 359
											IterableNodeHashTable var37 = var1.switches[var7[var5]]; // L: 360
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 361
											if (var36 != null) { // L: 362
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) { // L: 365
												var38 = class19.field84.getTitleGroupValue(var7[var5]); // L: 366
												if (var38 == null) { // L: 367
													Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 368
												} else {
													Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var38; // L: 371
												}
											} else {
												if (var32 != 76) { // L: 375
													throw new IllegalStateException(); // L: 385
												}

												var38 = PendingSpawn.field1189.method8494(var7[var5]); // L: 376
												if (var38 == null) { // L: 377
													Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 378
												} else {
													Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var38; // L: 381
												}
											}
										}
									}
								} else {
									var13 = var7[var5]; // L: 278
									Script var35 = class128.getScript(var13); // L: 279
									int[] var15 = new int[var35.localIntCount]; // L: 280
									String[] var16 = new String[var35.localStringCount]; // L: 281

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) { // L: 282
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (class19.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) { // L: 283
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (AbstractWorldMapIcon.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									class19.Interpreter_intStackSize -= var35.intArgumentCount; // L: 284
									AbstractWorldMapIcon.Interpreter_stringStackSize -= var35.stringArgumentCount; // L: 285
									ScriptFrame var22 = new ScriptFrame(); // L: 286
									var22.script = var1; // L: 287
									var22.pc = var5; // L: 288
									var22.intLocals = Interpreter.Interpreter_intLocals; // L: 289
									var22.stringLocals = Interpreter.Interpreter_stringLocals; // L: 290
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 291
									var1 = var35; // L: 292
									var6 = var35.opcodes; // L: 293
									var7 = var35.intOperands; // L: 294
									var5 = -1; // L: 295
									Interpreter.Interpreter_intLocals = var15; // L: 296
									Interpreter.Interpreter_stringLocals = var16; // L: 297
								}
							}
						}
					} catch (Exception var30) { // L: 405
						var9 = true; // L: 406
						StringBuilder var26 = new StringBuilder(30); // L: 408
						var26.append("").append(var1.key).append(" "); // L: 409

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 410
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8); // L: 411
						class180.RunException_sendStackTrace(var26.toString(), var30); // L: 412
						var29 = false;
						break label935;
					}
				} finally {
					if (var29) {
						while (Interpreter.field867.size() > 0) {
							class103 var19 = (class103)Interpreter.field867.remove(0); // L: 417
							AbstractArchive.widgetDefaultMenuAction(var19.method2666(), var19.method2658(), var19.method2661(), var19.method2662(), "");
						}

						if (Interpreter.field872) { // L: 420
							Interpreter.field872 = false; // L: 421
							class67.method1200(); // L: 422
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class180.RunException_sendStackTrace("Warning: Script " + var1.field1008 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field867.size() > 0) {
					class103 var40 = (class103)Interpreter.field867.remove(0);
					AbstractArchive.widgetDefaultMenuAction(var40.method2666(), var40.method2658(), var40.method2661(), var40.method2662(), "");
				}

				if (Interpreter.field872) {
					Interpreter.field872 = false;
					class67.method1200();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class180.RunException_sendStackTrace("Warning: Script " + var1.field1008 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return; // L: 216
			}

			while (Interpreter.field867.size() > 0) { // L: 416
				class103 var25 = (class103)Interpreter.field867.remove(0);
				AbstractArchive.widgetDefaultMenuAction(var25.method2666(), var25.method2658(), var25.method2661(), var25.method2662(), "");
			}

			if (Interpreter.field872) {
				Interpreter.field872 = false;
				class67.method1200();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class180.RunException_sendStackTrace("Warning: Script " + var1.field1008 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return; // L: 428
		}

		while (Interpreter.field867.size() > 0) {
			class103 var33 = (class103)Interpreter.field867.remove(0);
			AbstractArchive.widgetDefaultMenuAction(var33.method2666(), var33.method2658(), var33.method2661(), var33.method2662(), ""); // L: 418
		}

		if (Interpreter.field872) {
			Interpreter.field872 = false;
			class67.method1200();
		}

		if (!var9 && var3 > 0 && var10 >= var3) { // L: 424
			class180.RunException_sendStackTrace("Warning: Script " + var1.field1008 + " finished at op count " + var10 + " of max " + var2, (Throwable)null); // L: 425
		}

	} // L: 400

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "-621653841"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? GrandExchangeOfferTotalQuantityComparator.method7088(var0, 10, var1) : Integer.toString(var0); // L: 116 117
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lnt;III)V",
		garbageValue = "881116646"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3950
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3951
				SpriteMask var3 = var0.method6658(class243.field2620, true); // L: 3952
				if (var3 == null) { // L: 3953
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3954
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3955
				if (var3.contains(var4, var5)) { // L: 3956
					var4 -= var3.width / 2; // L: 3957
					var5 -= var3.height / 2; // L: 3958
					int var6 = Client.camAngleY & 2047; // L: 3959
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3960
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3961
					int var9 = var7 * var5 + var8 * var4 >> 11; // L: 3962
					int var10 = var8 * var5 - var4 * var7 >> 11; // L: 3963
					int var11 = var9 + class133.localPlayer.x >> 7; // L: 3964
					int var12 = class133.localPlayer.y - var10 >> 7; // L: 3965
					PacketBufferNode var13 = class425.getPacketBufferNode(ClientPacket.field3208, Client.packetWriter.isaacCipher); // L: 3967
					var13.packetBuffer.writeByte(18); // L: 3968
					var13.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var11); // L: 3969
					var13.packetBuffer.writeByte(Client.field748.method4318(82) ? (Client.field748.method4318(81) ? 2 : 1) : 0); // L: 3970
					var13.packetBuffer.method9398(DevicePcmPlayerProvider.baseY * 64 + var12); // L: 3971
					var13.packetBuffer.writeByte(var4); // L: 3972
					var13.packetBuffer.writeByte(var5); // L: 3973
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3974
					var13.packetBuffer.writeByte(57); // L: 3975
					var13.packetBuffer.writeByte(0); // L: 3976
					var13.packetBuffer.writeByte(0); // L: 3977
					var13.packetBuffer.writeByte(89); // L: 3978
					var13.packetBuffer.writeShort(class133.localPlayer.x); // L: 3979
					var13.packetBuffer.writeShort(class133.localPlayer.y); // L: 3980
					var13.packetBuffer.writeByte(63); // L: 3981
					Client.packetWriter.addNode(var13); // L: 3982
					Client.destinationX = var11; // L: 3983
					Client.destinationY = var12; // L: 3984
				}
			}

		}
	} // L: 3987
}
