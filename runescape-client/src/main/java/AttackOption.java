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
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("dy")
@Implements("AttackOption")
public enum AttackOption implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1303(2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1306(4);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -123808189
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12414
	} // L: 12415

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12419
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lew;FI)F",
		garbageValue = "-137382386"
	)
	static float method2646(class127 var0, float var1) {
		if (var0 != null && var0.method2980() != 0) { // L: 20
			if (var1 < (float)var0.field1501[0].field1455) { // L: 23
				return var0.field1499 == class125.field1490 ? var0.field1501[0].field1446 : class181.method3541(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1501[var0.method2980() - 1].field1455) { // L: 29
				return var0.field1512 == class125.field1490 ? var0.field1501[var0.method2980() - 1].field1446 : class181.method3541(var0, var1, false); // L: 30
			} else if (var0.field1498) {
				return var0.field1501[0].field1446;
			} else {
				class122 var2 = var0.method2978(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) {
					return 0.0F;
				} else {
					if ((double)var2.field1449 == 0.0D && (double)var2.field1450 == 0.0D) {
						var3 = true;
					} else if (var2.field1449 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field1450) {
						var4 = true;
					} else if (var2.field1451 != null) {
						if (var0.field1513) {
							float var5 = (float)var2.field1455; // L: 58
							float var9 = var2.field1446;
							float var6 = var2.field1449 * 0.33333334F + var5;
							float var10 = var9 + 0.33333334F * var2.field1450;
							float var8 = (float)var2.field1451.field1455;
							float var12 = var2.field1451.field1446;
							float var7 = var8 - var2.field1451.field1447 * 0.33333334F;
							float var11 = var12 - var2.field1451.field1448 * 0.33333334F;
							if (var0.field1508) { // L: 66
								class145.method3149(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							} else {
								class136.method3075(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							}

							var0.field1513 = false; // L: 72
						}
					} else {
						var3 = true; // L: 76
					}

					if (var3) { // L: 78
						return var2.field1446;
					} else if (var4) {
						return (float)var2.field1455 != var1 && var2.field1451 != null ? var2.field1451.field1446 : var2.field1446;
					} else {
						return var0.field1508 ? Tiles.method2219(var0, var1) : class467.method8462(var0, var1);
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsq;B)V",
		garbageValue = "1"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 31
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsq;II)V",
		garbageValue = "7099921"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 199
		if (var2) { // L: 200
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 201
		Player var4 = Client.players[var1]; // L: 202
		if (var3 == 0) { // L: 203
			if (var2) { // L: 204
				var4.field1111 = false; // L: 205
			} else if (Client.localPlayerIndex == var1) { // L: 208
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class178.baseY * 64 + var4.pathY[0] >> 13) + (GameEngine.baseX * 64 + var4.pathX[0] >> 13 << 14); // L: 209
				if (var4.field1164 != -1) { // L: 210
					Players.Players_orientations[var1] = var4.field1164;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 211
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 212
				Client.players[var1] = null; // L: 213
				if (var0.readBits(1) != 0) { // L: 214
					class157.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 217
				var5 = var0.readBits(3); // L: 218
				var6 = var4.pathX[0]; // L: 219
				var7 = var4.pathY[0]; // L: 220
				if (var5 == 0) { // L: 221
					--var6; // L: 222
					--var7; // L: 223
				} else if (var5 == 1) { // L: 225
					--var7;
				} else if (var5 == 2) { // L: 226
					++var6; // L: 227
					--var7; // L: 228
				} else if (var5 == 3) { // L: 230
					--var6;
				} else if (var5 == 4) { // L: 231
					++var6;
				} else if (var5 == 5) { // L: 232
					--var6; // L: 233
					++var7; // L: 234
				} else if (var5 == 6) { // L: 236
					++var7;
				} else if (var5 == 7) { // L: 237
					++var6; // L: 238
					++var7; // L: 239
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 241
					var4.resetPath(var6, var7); // L: 242
					var4.field1111 = false; // L: 243
				} else if (var2) { // L: 245
					var4.field1111 = true; // L: 246
					var4.tileX = var6; // L: 247
					var4.tileY = var7; // L: 248
				} else {
					var4.field1111 = false; // L: 251
					var4.method2336(var6, var7, Players.field1332[var1]); // L: 252
				}

			} else if (var3 == 2) { // L: 256
				var5 = var0.readBits(4); // L: 257
				var6 = var4.pathX[0]; // L: 258
				var7 = var4.pathY[0]; // L: 259
				if (var5 == 0) { // L: 260
					var6 -= 2; // L: 261
					var7 -= 2; // L: 262
				} else if (var5 == 1) { // L: 264
					--var6; // L: 265
					var7 -= 2; // L: 266
				} else if (var5 == 2) { // L: 268
					var7 -= 2;
				} else if (var5 == 3) { // L: 269
					++var6; // L: 270
					var7 -= 2; // L: 271
				} else if (var5 == 4) { // L: 273
					var6 += 2; // L: 274
					var7 -= 2; // L: 275
				} else if (var5 == 5) { // L: 277
					var6 -= 2; // L: 278
					--var7; // L: 279
				} else if (var5 == 6) { // L: 281
					var6 += 2; // L: 282
					--var7; // L: 283
				} else if (var5 == 7) { // L: 285
					var6 -= 2;
				} else if (var5 == 8) { // L: 286
					var6 += 2;
				} else if (var5 == 9) { // L: 287
					var6 -= 2; // L: 288
					++var7; // L: 289
				} else if (var5 == 10) { // L: 291
					var6 += 2; // L: 292
					++var7; // L: 293
				} else if (var5 == 11) { // L: 295
					var6 -= 2; // L: 296
					var7 += 2; // L: 297
				} else if (var5 == 12) { // L: 299
					--var6; // L: 300
					var7 += 2; // L: 301
				} else if (var5 == 13) { // L: 303
					var7 += 2;
				} else if (var5 == 14) { // L: 304
					++var6; // L: 305
					var7 += 2; // L: 306
				} else if (var5 == 15) { // L: 308
					var6 += 2; // L: 309
					var7 += 2; // L: 310
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 312
					if (var2) { // L: 316
						var4.field1111 = true; // L: 317
						var4.tileX = var6; // L: 318
						var4.tileY = var7; // L: 319
					} else {
						var4.field1111 = false; // L: 322
						var4.method2336(var6, var7, Players.field1332[var1]); // L: 323
					}
				} else {
					var4.resetPath(var6, var7); // L: 313
					var4.field1111 = false; // L: 314
				}

			} else {
				var5 = var0.readBits(1); // L: 327
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 328
					var6 = var0.readBits(12); // L: 329
					var7 = var6 >> 10; // L: 330
					var8 = var6 >> 5 & 31; // L: 331
					if (var8 > 15) { // L: 332
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 333
					if (var9 > 15) { // L: 334
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 335
					var11 = var9 + var4.pathY[0]; // L: 336
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 337
						var4.resetPath(var10, var11); // L: 338
						var4.field1111 = false; // L: 339
					} else if (var2) { // L: 341
						var4.field1111 = true; // L: 342
						var4.tileX = var10; // L: 343
						var4.tileY = var11; // L: 344
					} else {
						var4.field1111 = false; // L: 347
						var4.method2336(var10, var11, Players.field1332[var1]); // L: 348
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 350
					if (Client.localPlayerIndex == var1) { // L: 351
						TaskHandler.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 354
					var7 = var6 >> 28; // L: 355
					var8 = var6 >> 14 & 16383; // L: 356
					var9 = var6 & 16383; // L: 357
					var10 = (GameEngine.baseX * 64 + var8 + var4.pathX[0] & 16383) - GameEngine.baseX * 64; // L: 358
					var11 = (class178.baseY * 64 + var9 + var4.pathY[0] & 16383) - class178.baseY * 64; // L: 359
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 360
						var4.resetPath(var10, var11); // L: 361
						var4.field1111 = false; // L: 362
					} else if (var2) { // L: 364
						var4.field1111 = true; // L: 365
						var4.tileX = var10; // L: 366
						var4.tileY = var11; // L: 367
					} else {
						var4.field1111 = false; // L: 370
						var4.method2336(var10, var11, Players.field1332[var1]); // L: 371
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 373
					if (Client.localPlayerIndex == var1) { // L: 374
						TaskHandler.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 206 215 254 325 352 375
}
