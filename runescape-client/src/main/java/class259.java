import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("is")
public class class259 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1948790821
	)
	static int field2903;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "28"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class33.reflectionChecks.last(); // L: 31
		if (var1 != null) { // L: 32
			int var2 = var0.offset; // L: 33
			var0.writeInt(var1.id); // L: 34

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 35
				if (var1.creationErrors[var3] != 0) { // L: 36
					var0.writeByte(var1.creationErrors[var3]); // L: 37
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 41
						Field var5;
						int var6;
						if (var4 == 0) { // L: 42
							var5 = var1.fields[var3]; // L: 43
							var6 = Reflection.getInt(var5, (Object)null); // L: 44
							var0.writeByte(0); // L: 45
							var0.writeInt(var6); // L: 46
						} else if (var4 == 1) { // L: 48
							var5 = var1.fields[var3]; // L: 49
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 50
							var0.writeByte(0); // L: 51
						} else if (var4 == 2) { // L: 53
							var5 = var1.fields[var3]; // L: 54
							var6 = var5.getModifiers(); // L: 55
							var0.writeByte(0); // L: 56
							var0.writeInt(var6); // L: 57
						}

						Method var25;
						if (var4 != 3) { // L: 59
							if (var4 == 4) { // L: 79
								var25 = var1.methods[var3]; // L: 80
								var6 = var25.getModifiers(); // L: 81
								var0.writeByte(0); // L: 82
								var0.writeInt(var6); // L: 83
							}
						} else {
							var25 = var1.methods[var3]; // L: 60
							byte[][] var10 = var1.arguments[var3]; // L: 61
							Object[] var7 = new Object[var10.length]; // L: 62

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 63
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 64
								var7[var8] = var9.readObject(); // L: 65
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 67
							if (var11 == null) { // L: 68
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 69
								var0.writeByte(1); // L: 70
								var0.writeLong(((Number)var11).longValue()); // L: 71
							} else if (var11 instanceof String) { // L: 73
								var0.writeByte(2); // L: 74
								var0.writeStringCp1252NullTerminated((String)var11); // L: 75
							} else {
								var0.writeByte(4); // L: 77
							}
						}
					} catch (ClassNotFoundException var13) { // L: 86
						var0.writeByte(-10); // L: 87
					} catch (InvalidClassException var14) { // L: 89
						var0.writeByte(-11); // L: 90
					} catch (StreamCorruptedException var15) { // L: 92
						var0.writeByte(-12); // L: 93
					} catch (OptionalDataException var16) { // L: 95
						var0.writeByte(-13); // L: 96
					} catch (IllegalAccessException var17) { // L: 98
						var0.writeByte(-14); // L: 99
					} catch (IllegalArgumentException var18) { // L: 101
						var0.writeByte(-15); // L: 102
					} catch (InvocationTargetException var19) { // L: 104
						var0.writeByte(-16); // L: 105
					} catch (SecurityException var20) { // L: 107
						var0.writeByte(-17); // L: 108
					} catch (IOException var21) { // L: 110
						var0.writeByte(-18); // L: 111
					} catch (NullPointerException var22) { // L: 113
						var0.writeByte(-19); // L: 114
					} catch (Exception var23) { // L: 116
						var0.writeByte(-20); // L: 117
					} catch (Throwable var24) { // L: 119
						var0.writeByte(-21); // L: 120
					}
				}
			}

			var0.writeCrc(var2); // L: 123
			var1.remove(); // L: 124
		}
	} // L: 125

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqy;IB)V",
		garbageValue = "-89"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 191
		if (var2) { // L: 192
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 193
		Player var4 = Client.players[var1]; // L: 194
		if (var3 == 0) { // L: 195
			if (var2) { // L: 196
				var4.field1111 = false; // L: 197
			} else if (Client.localPlayerIndex == var1) { // L: 200
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class300.baseX * 64 + var4.pathX[0] >> 13 << 14) + (Message.baseY * 64 + var4.pathY[0] >> 13); // L: 201
				if (var4.field1164 != -1) { // L: 202
					Players.Players_orientations[var1] = var4.field1164;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 203
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 204
				Client.players[var1] = null; // L: 205
				if (var0.readBits(1) != 0) { // L: 206
					WorldMapSectionType.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 209
				var5 = var0.readBits(3); // L: 210
				var6 = var4.pathX[0]; // L: 211
				var7 = var4.pathY[0]; // L: 212
				if (var5 == 0) { // L: 213
					--var6; // L: 214
					--var7; // L: 215
				} else if (var5 == 1) { // L: 217
					--var7;
				} else if (var5 == 2) { // L: 218
					++var6; // L: 219
					--var7; // L: 220
				} else if (var5 == 3) { // L: 222
					--var6;
				} else if (var5 == 4) { // L: 223
					++var6;
				} else if (var5 == 5) { // L: 224
					--var6; // L: 225
					++var7; // L: 226
				} else if (var5 == 6) { // L: 228
					++var7;
				} else if (var5 == 7) { // L: 229
					++var6; // L: 230
					++var7; // L: 231
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 233
					var4.resetPath(var6, var7); // L: 234
					var4.field1111 = false; // L: 235
				} else if (var2) { // L: 237
					var4.field1111 = true; // L: 238
					var4.tileX = var6; // L: 239
					var4.tileY = var7; // L: 240
				} else {
					var4.field1111 = false; // L: 243
					var4.method2230(var6, var7, Players.field1294[var1]); // L: 244
				}

			} else if (var3 == 2) { // L: 248
				var5 = var0.readBits(4); // L: 249
				var6 = var4.pathX[0]; // L: 250
				var7 = var4.pathY[0]; // L: 251
				if (var5 == 0) { // L: 252
					var6 -= 2; // L: 253
					var7 -= 2; // L: 254
				} else if (var5 == 1) { // L: 256
					--var6; // L: 257
					var7 -= 2; // L: 258
				} else if (var5 == 2) { // L: 260
					var7 -= 2;
				} else if (var5 == 3) { // L: 261
					++var6; // L: 262
					var7 -= 2; // L: 263
				} else if (var5 == 4) { // L: 265
					var6 += 2; // L: 266
					var7 -= 2; // L: 267
				} else if (var5 == 5) { // L: 269
					var6 -= 2; // L: 270
					--var7; // L: 271
				} else if (var5 == 6) { // L: 273
					var6 += 2; // L: 274
					--var7; // L: 275
				} else if (var5 == 7) { // L: 277
					var6 -= 2;
				} else if (var5 == 8) { // L: 278
					var6 += 2;
				} else if (var5 == 9) { // L: 279
					var6 -= 2; // L: 280
					++var7; // L: 281
				} else if (var5 == 10) { // L: 283
					var6 += 2; // L: 284
					++var7; // L: 285
				} else if (var5 == 11) { // L: 287
					var6 -= 2; // L: 288
					var7 += 2; // L: 289
				} else if (var5 == 12) { // L: 291
					--var6; // L: 292
					var7 += 2; // L: 293
				} else if (var5 == 13) { // L: 295
					var7 += 2;
				} else if (var5 == 14) { // L: 296
					++var6; // L: 297
					var7 += 2; // L: 298
				} else if (var5 == 15) { // L: 300
					var6 += 2; // L: 301
					var7 += 2; // L: 302
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 304
					var4.resetPath(var6, var7); // L: 305
					var4.field1111 = false; // L: 306
				} else if (var2) { // L: 308
					var4.field1111 = true; // L: 309
					var4.tileX = var6; // L: 310
					var4.tileY = var7; // L: 311
				} else {
					var4.field1111 = false; // L: 314
					var4.method2230(var6, var7, Players.field1294[var1]); // L: 315
				}

			} else {
				var5 = var0.readBits(1); // L: 319
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 320
					var6 = var0.readBits(12); // L: 321
					var7 = var6 >> 10; // L: 322
					var8 = var6 >> 5 & 31; // L: 323
					if (var8 > 15) { // L: 324
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 325
					if (var9 > 15) { // L: 326
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 327
					var11 = var9 + var4.pathY[0]; // L: 328
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 329
						var4.resetPath(var10, var11); // L: 330
						var4.field1111 = false; // L: 331
					} else if (var2) { // L: 333
						var4.field1111 = true; // L: 334
						var4.tileX = var10; // L: 335
						var4.tileY = var11; // L: 336
					} else {
						var4.field1111 = false; // L: 339
						var4.method2230(var10, var11, Players.field1294[var1]); // L: 340
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 342
					if (Client.localPlayerIndex == var1) { // L: 343
						FriendSystem.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 346
					var7 = var6 >> 28; // L: 347
					var8 = var6 >> 14 & 16383; // L: 348
					var9 = var6 & 16383; // L: 349
					var10 = (class300.baseX * 64 + var8 + var4.pathX[0] & 16383) - class300.baseX * 64; // L: 350
					var11 = (Message.baseY * 64 + var9 + var4.pathY[0] & 16383) - Message.baseY * 64; // L: 351
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 352
						if (var2) { // L: 356
							var4.field1111 = true; // L: 357
							var4.tileX = var10; // L: 358
							var4.tileY = var11; // L: 359
						} else {
							var4.field1111 = false; // L: 362
							var4.method2230(var10, var11, Players.field1294[var1]); // L: 363
						}
					} else {
						var4.resetPath(var10, var11); // L: 353
						var4.field1111 = false; // L: 354
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 365
					if (Client.localPlayerIndex == var1) { // L: 366
						FriendSystem.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 198 207 246 317 344 367

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)V",
		garbageValue = "1905012149"
	)
	static final void method5188(Actor var0) {
		var0.isWalking = false; // L: 4281
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != -1) { // L: 4282
			var1 = class14.SequenceDefinition_get(var0.movementSequence); // L: 4283
			if (var1 != null) { // L: 4284
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4285
					++var0.movementFrameCycle; // L: 4286
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 4287
						var0.movementFrameCycle = 1; // L: 4288
						++var0.movementFrame; // L: 4289
						class93.method2443(var1, var0.movementFrame, var0.x, var0.y); // L: 4290
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 4292
						if (var1.frameCount > 0) { // L: 4293
							var0.movementFrame -= var1.frameCount; // L: 4294
							if (var1.field2174) { // L: 4295
								++var0.field1141;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2174 && var0.field1141 >= var1.field2166) { // L: 4296
								var0.movementFrameCycle = 0; // L: 4297
								var0.movementFrame = 0; // L: 4298
								var0.field1141 = 0; // L: 4299
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4303
							var0.movementFrame = 0; // L: 4304
						}

						class93.method2443(var1, var0.movementFrame, var0.x, var0.y); // L: 4306
					}
				} else if (var1.isCachedModelIdSet()) { // L: 4309
					++var0.movementFrame; // L: 4310
					var2 = var1.method3812(); // L: 4311
					if (var0.movementFrame < var2) { // L: 4312
						AttackOption.method2468(var1, var0.movementFrame, var0.x, var0.y); // L: 4313
					} else {
						if (var1.frameCount > 0) { // L: 4316
							var0.movementFrame -= var1.frameCount; // L: 4317
							if (var1.field2174) { // L: 4318
								++var0.field1141;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2174 && var0.field1141 >= var1.field2166) { // L: 4319
								var0.movementFrame = 0; // L: 4320
								var0.movementFrameCycle = 0; // L: 4321
								var0.field1141 = 0; // L: 4322
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4326
							var0.movementFrame = 0; // L: 4327
						}

						AttackOption.method2468(var1, var0.movementFrame, var0.x, var0.y); // L: 4329
					}
				} else {
					var0.movementSequence = -1; // L: 4332
				}
			} else {
				var0.movementSequence = -1; // L: 4334
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1178) { // L: 4336
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0; // L: 4337
			}

			int var4 = class13.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4338
			if (var4 != -1) { // L: 4339
				SequenceDefinition var5 = class14.SequenceDefinition_get(var4); // L: 4340
				if (var5 != null && var5.frameIds != null && !var5.isCachedModelIdSet()) { // L: 4341
					++var0.field1201; // L: 4342
					if (var0.spotAnimationFrame < var5.frameIds.length && var0.field1201 > var5.frameLengths[var0.spotAnimationFrame]) { // L: 4343
						var0.field1201 = 1; // L: 4344
						++var0.spotAnimationFrame; // L: 4345
						class93.method2443(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4346
					}

					if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) { // L: 4348 4349
						var0.spotAnimation = -1;
					}
				} else if (var5.isCachedModelIdSet()) { // L: 4352
					++var0.spotAnimationFrame; // L: 4353
					int var3 = var5.method3812(); // L: 4354
					if (var0.spotAnimationFrame < var3) { // L: 4355
						AttackOption.method2468(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4356
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var3) { // L: 4359
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4362
				}
			} else {
				var0.spotAnimation = -1; // L: 4364
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4366
			var1 = class14.SequenceDefinition_get(var0.sequence); // L: 4367
			if (var1.field2173 == 1 && var0.field1203 > 0 && var0.field1194 <= Client.cycle && var0.field1166 < Client.cycle) { // L: 4368 4369
				var0.sequenceDelay = 1; // L: 4370
				return; // L: 4371
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4375
			var1 = class14.SequenceDefinition_get(var0.sequence); // L: 4376
			if (var1 != null) { // L: 4377
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4378
					++var0.sequenceFrameCycle; // L: 4379
					if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 4380
						var0.sequenceFrameCycle = 1; // L: 4381
						++var0.sequenceFrame; // L: 4382
						class93.method2443(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4383
					}

					if (var0.sequenceFrame >= var1.frameIds.length) { // L: 4385
						var0.sequenceFrame -= var1.frameCount; // L: 4386
						++var0.field1174; // L: 4387
						if (var0.field1174 >= var1.field2166) { // L: 4388
							var0.sequence = -1; // L: 4389
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 4391
							class93.method2443(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4395
						} else {
							var0.sequence = -1; // L: 4392
						}
					}

					var0.isWalking = var1.field2167; // L: 4398
				} else if (var1.isCachedModelIdSet()) { // L: 4400
					++var0.sequenceFrame; // L: 4401
					var2 = var1.method3812(); // L: 4402
					if (var0.sequenceFrame < var2) { // L: 4403
						AttackOption.method2468(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4404
					} else {
						var0.sequenceFrame -= var1.frameCount; // L: 4407
						++var0.field1174; // L: 4408
						if (var0.field1174 >= var1.field2166) { // L: 4409
							var0.sequence = -1; // L: 4410
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) { // L: 4412
							AttackOption.method2468(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4416
						} else {
							var0.sequence = -1; // L: 4413
						}
					}
				} else {
					var0.sequence = -1; // L: 4420
				}
			} else {
				var0.sequence = -1; // L: 4422
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4424
			--var0.sequenceDelay;
		}

	} // L: 4425
}
