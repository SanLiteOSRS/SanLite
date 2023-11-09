import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class137 extends class139 {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1690262715
	)
	static int field1639;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 2074990388668468489L
	)
	long field1640;
	@ObfuscatedName("w")
	String field1638;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lex;)V"
	)
	class137(class142 var1) {
		this.this$0 = var1;
		this.field1640 = -1L;
		this.field1638 = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;S)V",
		garbageValue = "-5782"
	)
	void vmethod3394(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset; // L: 81
			this.field1640 = var1.readLong(); // L: 82
		}

		this.field1638 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "-26"
	)
	void vmethod3393(ClanSettings var1) {
		var1.method3230(this.field1640, this.field1638, 0); // L: 88
	} // L: 89

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IS)Lgo;",
		garbageValue = "387"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 72
		if (var1 != null) { // L: 73
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 74
			var1 = new NPCComposition(); // L: 75
			var1.id = var0; // L: 76
			if (var2 != null) { // L: 77
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 78
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 79
			return var1; // L: 80
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lru;II)V",
		garbageValue = "-1171621468"
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
				var4.field1132 = false; // L: 205
			} else if (Client.localPlayerIndex == var1) { // L: 208
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (Client.baseY * 64 + var4.pathY[0] >> 13) + (ParamComposition.baseX * 64 + var4.pathX[0] >> 13 << 14); // L: 209
				if (var4.field1195 != -1) { // L: 210
					Players.Players_orientations[var1] = var4.field1195;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 211
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 212
				Client.players[var1] = null; // L: 213
				if (var0.readBits(1) != 0) { // L: 214
					class285.updateExternalPlayer(var0, var1);
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
					var4.field1132 = false; // L: 243
				} else if (var2) { // L: 245
					var4.field1132 = true; // L: 246
					var4.tileX = var6; // L: 247
					var4.tileY = var7; // L: 248
				} else {
					var4.field1132 = false; // L: 251
					var4.method2361(var6, var7, Players.field1340[var1]); // L: 252
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
						var4.field1132 = true; // L: 317
						var4.tileX = var6; // L: 318
						var4.tileY = var7; // L: 319
					} else {
						var4.field1132 = false; // L: 322
						var4.method2361(var6, var7, Players.field1340[var1]); // L: 323
					}
				} else {
					var4.resetPath(var6, var7); // L: 313
					var4.field1132 = false; // L: 314
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
						var4.field1132 = false; // L: 339
					} else if (var2) { // L: 341
						var4.field1132 = true; // L: 342
						var4.tileX = var10; // L: 343
						var4.tileY = var11; // L: 344
					} else {
						var4.field1132 = false; // L: 347
						var4.method2361(var10, var11, Players.field1340[var1]); // L: 348
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 350
					if (Client.localPlayerIndex == var1) { // L: 351
						class103.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 354
					var7 = var6 >> 28; // L: 355
					var8 = var6 >> 14 & 16383; // L: 356
					var9 = var6 & 16383; // L: 357
					var10 = (ParamComposition.baseX * 64 + var8 + var4.pathX[0] & 16383) - ParamComposition.baseX * 64; // L: 358
					var11 = (Client.baseY * 64 + var9 + var4.pathY[0] & 16383) - Client.baseY * 64; // L: 359
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 360
						var4.resetPath(var10, var11); // L: 361
						var4.field1132 = false; // L: 362
					} else if (var2) { // L: 364
						var4.field1132 = true; // L: 365
						var4.tileX = var10; // L: 366
						var4.tileY = var11; // L: 367
					} else {
						var4.field1132 = false; // L: 370
						var4.method2361(var10, var11, Players.field1340[var1]); // L: 371
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 373
					if (Client.localPlayerIndex == var1) { // L: 374
						class103.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 206 215 254 325 352 375
}
