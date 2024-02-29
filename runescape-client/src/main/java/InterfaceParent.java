import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1605215703
	)
	@Export("group")
	int group;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -407242107
	)
	@Export("type")
	int type;
	@ObfuscatedName("al")
	boolean field1087;

	InterfaceParent() {
		this.field1087 = false; // L: 8
	} // L: 10

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "93"
	)
	static void method2350() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 31
			if (var0.stream1 != null) { // L: 32
				SceneTilePaint.pcmStreamMixer.removeSubStream(var0.stream1); // L: 33
				var0.stream1 = null; // L: 34
			}

			if (var0.stream2 != null) { // L: 36
				SceneTilePaint.pcmStreamMixer.removeSubStream(var0.stream2); // L: 37
				var0.stream2 = null; // L: 38
			}
		}

		ObjectSound.objectSounds.clear(); // L: 41
	} // L: 42

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lun;II)V",
		garbageValue = "-692553453"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 201
		if (var2) { // L: 202
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 203
		Player var4 = Client.players[var1]; // L: 204
		if (var3 == 0) { // L: 205
			if (var2) { // L: 206
				var4.field1147 = false; // L: 207
			} else if (Client.localPlayerIndex == var1) { // L: 210
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (Projectile.baseX * 64 + var4.pathX[0] >> 13 << 14) + (GameEngine.baseY * 8 + var4.pathY[0] >> 13); // L: 211
				if (var4.field1242 != -1) { // L: 212
					Players.Players_orientations[var1] = var4.field1242;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 213
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 214
				Client.players[var1] = null; // L: 215
				if (var0.readBits(1) != 0) { // L: 216
					class182.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 219
				var5 = var0.readBits(3); // L: 220
				var6 = var4.pathX[0]; // L: 221
				var7 = var4.pathY[0]; // L: 222
				if (var5 == 0) { // L: 223
					--var6; // L: 224
					--var7; // L: 225
				} else if (var5 == 1) { // L: 227
					--var7;
				} else if (var5 == 2) { // L: 228
					++var6; // L: 229
					--var7; // L: 230
				} else if (var5 == 3) { // L: 232
					--var6;
				} else if (var5 == 4) { // L: 233
					++var6;
				} else if (var5 == 5) { // L: 234
					--var6; // L: 235
					++var7; // L: 236
				} else if (var5 == 6) { // L: 238
					++var7;
				} else if (var5 == 7) { // L: 239
					++var6; // L: 240
					++var7; // L: 241
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 243
					var4.resetPath(var6, var7); // L: 244
					var4.field1147 = false; // L: 245
				} else if (var2) { // L: 247
					var4.field1147 = true; // L: 248
					var4.tileX = var6; // L: 249
					var4.tileY = var7; // L: 250
				} else {
					var4.field1147 = false; // L: 253
					var4.method2433(var6, var7, Players.field1378[var1]); // L: 254
				}

			} else if (var3 == 2) { // L: 258
				var5 = var0.readBits(4); // L: 259
				var6 = var4.pathX[0]; // L: 260
				var7 = var4.pathY[0]; // L: 261
				if (var5 == 0) { // L: 262
					var6 -= 2; // L: 263
					var7 -= 2; // L: 264
				} else if (var5 == 1) { // L: 266
					--var6; // L: 267
					var7 -= 2; // L: 268
				} else if (var5 == 2) { // L: 270
					var7 -= 2;
				} else if (var5 == 3) { // L: 271
					++var6; // L: 272
					var7 -= 2; // L: 273
				} else if (var5 == 4) { // L: 275
					var6 += 2; // L: 276
					var7 -= 2; // L: 277
				} else if (var5 == 5) { // L: 279
					var6 -= 2; // L: 280
					--var7; // L: 281
				} else if (var5 == 6) { // L: 283
					var6 += 2; // L: 284
					--var7; // L: 285
				} else if (var5 == 7) { // L: 287
					var6 -= 2;
				} else if (var5 == 8) { // L: 288
					var6 += 2;
				} else if (var5 == 9) { // L: 289
					var6 -= 2; // L: 290
					++var7; // L: 291
				} else if (var5 == 10) { // L: 293
					var6 += 2; // L: 294
					++var7; // L: 295
				} else if (var5 == 11) { // L: 297
					var6 -= 2; // L: 298
					var7 += 2; // L: 299
				} else if (var5 == 12) { // L: 301
					--var6; // L: 302
					var7 += 2; // L: 303
				} else if (var5 == 13) { // L: 305
					var7 += 2;
				} else if (var5 == 14) { // L: 306
					++var6; // L: 307
					var7 += 2; // L: 308
				} else if (var5 == 15) { // L: 310
					var6 += 2; // L: 311
					var7 += 2; // L: 312
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 314
					if (var2) { // L: 318
						var4.field1147 = true; // L: 319
						var4.tileX = var6; // L: 320
						var4.tileY = var7; // L: 321
					} else {
						var4.field1147 = false; // L: 324
						var4.method2433(var6, var7, Players.field1378[var1]); // L: 325
					}
				} else {
					var4.resetPath(var6, var7); // L: 315
					var4.field1147 = false; // L: 316
				}

			} else {
				var5 = var0.readBits(1); // L: 329
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 330
					var6 = var0.readBits(12); // L: 331
					var7 = var6 >> 10; // L: 332
					var8 = var6 >> 5 & 31; // L: 333
					if (var8 > 15) { // L: 334
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 335
					if (var9 > 15) { // L: 336
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 337
					var11 = var9 + var4.pathY[0]; // L: 338
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 339
						if (var2) { // L: 343
							var4.field1147 = true; // L: 344
							var4.tileX = var10; // L: 345
							var4.tileY = var11; // L: 346
						} else {
							var4.field1147 = false; // L: 349
							var4.method2433(var10, var11, Players.field1378[var1]); // L: 350
						}
					} else {
						var4.resetPath(var10, var11); // L: 340
						var4.field1147 = false; // L: 341
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 352
					if (Client.localPlayerIndex == var1) { // L: 353
						class473.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 356
					var7 = var6 >> 28; // L: 357
					var8 = var6 >> 14 & 16383; // L: 358
					var9 = var6 & 16383; // L: 359
					var10 = (Projectile.baseX * 64 + var8 + var4.pathX[0] & 16383) - Projectile.baseX * 64; // L: 360
					var11 = (GameEngine.baseY * 8 + var9 + var4.pathY[0] & 16383) - GameEngine.baseY * 8; // L: 361
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 362
						var4.resetPath(var10, var11); // L: 363
						var4.field1147 = false; // L: 364
					} else if (var2) { // L: 366
						var4.field1147 = true; // L: 367
						var4.tileX = var10; // L: 368
						var4.tileY = var11; // L: 369
					} else {
						var4.field1147 = false; // L: 372
						var4.method2433(var10, var11, Players.field1378[var1]); // L: 373
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 375
					if (Client.localPlayerIndex == var1) { // L: 376
						class473.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 208 217 256 327 354 377
}
