import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public class class291 {
	@ObfuscatedName("wa")
	@Export("foundItemIds")
	static short[] foundItemIds;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lhk;",
		garbageValue = "-1334552164"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamComposition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 27
			var1 = new ParamComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 30
			ParamComposition.ParamComposition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltf;IB)V",
		garbageValue = "1"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 190
		if (var2) { // L: 191
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 192
		Player var4 = Client.players[var1]; // L: 193
		if (var3 == 0) { // L: 194
			if (var2) { // L: 195
				var4.field1138 = false; // L: 196
			} else if (Client.localPlayerIndex == var1) { // L: 199
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class9.baseY * 64 + var4.pathY[0] >> 13) + (class166.baseX * 64 + var4.pathX[0] >> 13 << 14); // L: 200
				if (var4.field1218 != -1) { // L: 201
					Players.Players_orientations[var1] = var4.field1218;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 202
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 203
				Client.players[var1] = null; // L: 204
				if (var0.readBits(1) != 0) { // L: 205
					LoginScreenAnimation.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 208
				var5 = var0.readBits(3); // L: 209
				var6 = var4.pathX[0]; // L: 210
				var7 = var4.pathY[0]; // L: 211
				if (var5 == 0) { // L: 212
					--var6; // L: 213
					--var7; // L: 214
				} else if (var5 == 1) { // L: 216
					--var7;
				} else if (var5 == 2) { // L: 217
					++var6; // L: 218
					--var7; // L: 219
				} else if (var5 == 3) { // L: 221
					--var6;
				} else if (var5 == 4) { // L: 222
					++var6;
				} else if (var5 == 5) { // L: 223
					--var6; // L: 224
					++var7; // L: 225
				} else if (var5 == 6) { // L: 227
					++var7;
				} else if (var5 == 7) { // L: 228
					++var6; // L: 229
					++var7; // L: 230
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 232
					var4.resetPath(var6, var7); // L: 233
					var4.field1138 = false; // L: 234
				} else if (var2) { // L: 236
					var4.field1138 = true; // L: 237
					var4.tileX = var6; // L: 238
					var4.tileY = var7; // L: 239
				} else {
					var4.field1138 = false; // L: 242
					var4.method2358(var6, var7, Players.field1363[var1]); // L: 243
				}

			} else if (var3 == 2) { // L: 247
				var5 = var0.readBits(4); // L: 248
				var6 = var4.pathX[0]; // L: 249
				var7 = var4.pathY[0]; // L: 250
				if (var5 == 0) { // L: 251
					var6 -= 2; // L: 252
					var7 -= 2; // L: 253
				} else if (var5 == 1) { // L: 255
					--var6; // L: 256
					var7 -= 2; // L: 257
				} else if (var5 == 2) { // L: 259
					var7 -= 2;
				} else if (var5 == 3) { // L: 260
					++var6; // L: 261
					var7 -= 2; // L: 262
				} else if (var5 == 4) { // L: 264
					var6 += 2; // L: 265
					var7 -= 2; // L: 266
				} else if (var5 == 5) { // L: 268
					var6 -= 2; // L: 269
					--var7; // L: 270
				} else if (var5 == 6) { // L: 272
					var6 += 2; // L: 273
					--var7; // L: 274
				} else if (var5 == 7) { // L: 276
					var6 -= 2;
				} else if (var5 == 8) { // L: 277
					var6 += 2;
				} else if (var5 == 9) { // L: 278
					var6 -= 2; // L: 279
					++var7; // L: 280
				} else if (var5 == 10) { // L: 282
					var6 += 2; // L: 283
					++var7; // L: 284
				} else if (var5 == 11) { // L: 286
					var6 -= 2; // L: 287
					var7 += 2; // L: 288
				} else if (var5 == 12) { // L: 290
					--var6; // L: 291
					var7 += 2; // L: 292
				} else if (var5 == 13) { // L: 294
					var7 += 2;
				} else if (var5 == 14) { // L: 295
					++var6; // L: 296
					var7 += 2; // L: 297
				} else if (var5 == 15) { // L: 299
					var6 += 2; // L: 300
					var7 += 2; // L: 301
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 303
					var4.resetPath(var6, var7); // L: 304
					var4.field1138 = false; // L: 305
				} else if (var2) { // L: 307
					var4.field1138 = true; // L: 308
					var4.tileX = var6; // L: 309
					var4.tileY = var7; // L: 310
				} else {
					var4.field1138 = false; // L: 313
					var4.method2358(var6, var7, Players.field1363[var1]); // L: 314
				}

			} else {
				var5 = var0.readBits(1); // L: 318
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 319
					var6 = var0.readBits(12); // L: 320
					var7 = var6 >> 10; // L: 321
					var8 = var6 >> 5 & 31; // L: 322
					if (var8 > 15) { // L: 323
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 324
					if (var9 > 15) { // L: 325
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 326
					var11 = var9 + var4.pathY[0]; // L: 327
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 328
						if (var2) { // L: 332
							var4.field1138 = true; // L: 333
							var4.tileX = var10; // L: 334
							var4.tileY = var11; // L: 335
						} else {
							var4.field1138 = false; // L: 338
							var4.method2358(var10, var11, Players.field1363[var1]); // L: 339
						}
					} else {
						var4.resetPath(var10, var11); // L: 329
						var4.field1138 = false; // L: 330
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 341
					if (Client.localPlayerIndex == var1) { // L: 342
						BuddyRankComparator.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 345
					var7 = var6 >> 28; // L: 346
					var8 = var6 >> 14 & 16383; // L: 347
					var9 = var6 & 16383; // L: 348
					var10 = (class166.baseX * 64 + var8 + var4.pathX[0] & 16383) - class166.baseX * 64; // L: 349
					var11 = (class9.baseY * 64 + var9 + var4.pathY[0] & 16383) - class9.baseY * 64; // L: 350
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 351
						var4.resetPath(var10, var11); // L: 352
						var4.field1138 = false; // L: 353
					} else if (var2) { // L: 355
						var4.field1138 = true; // L: 356
						var4.tileX = var10; // L: 357
						var4.tileY = var11; // L: 358
					} else {
						var4.field1138 = false; // L: 361
						var4.method2358(var10, var11, Players.field1363[var1]); // L: 362
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 364
					if (Client.localPlayerIndex == var1) { // L: 365
						BuddyRankComparator.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 197 206 245 316 343 366

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1972090925"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5772
		int var4 = var1 >> 7; // L: 5773
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5774
			int var5 = var2; // L: 5775
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5776
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5777
			int var7 = var1 & 127; // L: 5778
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7; // L: 5779
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5780
			return var7 * var9 + var8 * (128 - var7) >> 7; // L: 5781
		} else {
			return 0;
		}
	}
}
