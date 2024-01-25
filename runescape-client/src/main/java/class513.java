import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
public class class513 extends class471 implements class297 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	final AbstractArchive field5093;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	final DemotingHashTable field5094;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1015548917
	)
	final int field5095;

	@ObfuscatedSignature(
		descriptor = "(Lnd;ILol;Low;)V"
	)
	public class513(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field5094 = new DemotingHashTable(64); // L: 15
		this.field5093 = var4; // L: 20
		this.field5095 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lsf;",
		garbageValue = "1192439178"
	)
	protected class473 vmethod9206(int var1) {
		synchronized(this.field5094) { // L: 26
			class472 var2 = (class472)this.field5094.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method9200(var1); // L: 29
				this.field5094.method5911(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsr;",
		garbageValue = "1"
	)
	class472 method9200(int var1) {
		byte[] var2 = this.field5093.takeFile(this.field5095, var1); // L: 37
		class472 var3 = new class472(var1); // L: 38
		if (var2 != null) {
			var3.method8669(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1557143999"
	)
	public void method9202() {
		synchronized(this.field5094) { // L: 44
			this.field5094.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class512(this); // L: 51
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luo;II)V",
		garbageValue = "790487425"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 220
		if (var2) { // L: 221
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 222
		Player var4 = Client.players[var1]; // L: 223
		if (var3 == 0) { // L: 224
			if (var2) { // L: 225
				var4.field1124 = false; // L: 226
			} else if (Client.localPlayerIndex == var1) { // L: 229
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (WorldMapScaleHandler.baseY * 64 + var4.pathY[0] >> 13) + (HealthBarDefinition.baseX * 64 + var4.pathX[0] >> 13 << 14); // L: 230
				if (var4.field1208 != -1) { // L: 231
					Players.Players_orientations[var1] = var4.field1208;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 232
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 233
				Client.players[var1] = null; // L: 234
				if (var0.readBits(1) != 0) { // L: 235
					Players.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 238
				var5 = var0.readBits(3); // L: 239
				var6 = var4.pathX[0]; // L: 240
				var7 = var4.pathY[0]; // L: 241
				if (var5 == 0) { // L: 242
					--var6; // L: 243
					--var7; // L: 244
				} else if (var5 == 1) { // L: 246
					--var7;
				} else if (var5 == 2) { // L: 247
					++var6; // L: 248
					--var7; // L: 249
				} else if (var5 == 3) { // L: 251
					--var6;
				} else if (var5 == 4) { // L: 252
					++var6;
				} else if (var5 == 5) { // L: 253
					--var6; // L: 254
					++var7; // L: 255
				} else if (var5 == 6) { // L: 257
					++var7;
				} else if (var5 == 7) { // L: 258
					++var6; // L: 259
					++var7; // L: 260
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 262
					var4.resetPath(var6, var7); // L: 263
					var4.field1124 = false; // L: 264
				} else if (var2) { // L: 266
					var4.field1124 = true; // L: 267
					var4.tileX = var6; // L: 268
					var4.tileY = var7; // L: 269
				} else {
					var4.field1124 = false; // L: 272
					var4.method2429(var6, var7, Players.field1348[var1]); // L: 273
				}

			} else if (var3 == 2) { // L: 277
				var5 = var0.readBits(4); // L: 278
				var6 = var4.pathX[0]; // L: 279
				var7 = var4.pathY[0]; // L: 280
				if (var5 == 0) { // L: 281
					var6 -= 2; // L: 282
					var7 -= 2; // L: 283
				} else if (var5 == 1) { // L: 285
					--var6; // L: 286
					var7 -= 2; // L: 287
				} else if (var5 == 2) { // L: 289
					var7 -= 2;
				} else if (var5 == 3) { // L: 290
					++var6; // L: 291
					var7 -= 2; // L: 292
				} else if (var5 == 4) { // L: 294
					var6 += 2; // L: 295
					var7 -= 2; // L: 296
				} else if (var5 == 5) { // L: 298
					var6 -= 2; // L: 299
					--var7; // L: 300
				} else if (var5 == 6) { // L: 302
					var6 += 2; // L: 303
					--var7; // L: 304
				} else if (var5 == 7) { // L: 306
					var6 -= 2;
				} else if (var5 == 8) { // L: 307
					var6 += 2;
				} else if (var5 == 9) { // L: 308
					var6 -= 2; // L: 309
					++var7; // L: 310
				} else if (var5 == 10) { // L: 312
					var6 += 2; // L: 313
					++var7; // L: 314
				} else if (var5 == 11) { // L: 316
					var6 -= 2; // L: 317
					var7 += 2; // L: 318
				} else if (var5 == 12) { // L: 320
					--var6; // L: 321
					var7 += 2; // L: 322
				} else if (var5 == 13) { // L: 324
					var7 += 2;
				} else if (var5 == 14) { // L: 325
					++var6; // L: 326
					var7 += 2; // L: 327
				} else if (var5 == 15) { // L: 329
					var6 += 2; // L: 330
					var7 += 2; // L: 331
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 333
					var4.resetPath(var6, var7); // L: 334
					var4.field1124 = false; // L: 335
				} else if (var2) { // L: 337
					var4.field1124 = true; // L: 338
					var4.tileX = var6; // L: 339
					var4.tileY = var7; // L: 340
				} else {
					var4.field1124 = false; // L: 343
					var4.method2429(var6, var7, Players.field1348[var1]); // L: 344
				}

			} else {
				var5 = var0.readBits(1); // L: 348
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 349
					var6 = var0.readBits(12); // L: 350
					var7 = var6 >> 10; // L: 351
					var8 = var6 >> 5 & 31; // L: 352
					if (var8 > 15) { // L: 353
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 354
					if (var9 > 15) { // L: 355
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 356
					var11 = var9 + var4.pathY[0]; // L: 357
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 358
						if (var2) { // L: 362
							var4.field1124 = true; // L: 363
							var4.tileX = var10; // L: 364
							var4.tileY = var11; // L: 365
						} else {
							var4.field1124 = false; // L: 368
							var4.method2429(var10, var11, Players.field1348[var1]); // L: 369
						}
					} else {
						var4.resetPath(var10, var11); // L: 359
						var4.field1124 = false; // L: 360
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 371
					if (Client.localPlayerIndex == var1) { // L: 372
						class113.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 375
					var7 = var6 >> 28; // L: 376
					var8 = var6 >> 14 & 16383; // L: 377
					var9 = var6 & 16383; // L: 378
					var10 = (HealthBarDefinition.baseX * 64 + var8 + var4.pathX[0] & 16383) - HealthBarDefinition.baseX * 64; // L: 379
					var11 = (WorldMapScaleHandler.baseY * 64 + var9 + var4.pathY[0] & 16383) - WorldMapScaleHandler.baseY * 64; // L: 380
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 381
						var4.resetPath(var10, var11); // L: 382
						var4.field1124 = false; // L: 383
					} else if (var2) { // L: 385
						var4.field1124 = true; // L: 386
						var4.tileX = var10; // L: 387
						var4.tileY = var11; // L: 388
					} else {
						var4.field1124 = false; // L: 391
						var4.method2429(var10, var11, Players.field1348[var1]); // L: 392
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 394
					if (Client.localPlayerIndex == var1) { // L: 395
						class113.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 227 236 275 346 373 396
}
