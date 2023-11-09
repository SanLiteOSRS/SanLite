import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("wh")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	static final WorldMapID field3029;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	static final WorldMapID field3030;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1780364927
	)
	@Export("value")
	final int value;

	static {
		field3029 = new WorldMapID(0); // L: 4
		field3030 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsq;II)Z",
		garbageValue = "940918989"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 368
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 369
			if (var0.readBits(1) != 0) { // L: 370
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 371
			var4 = var0.readBits(13); // L: 372
			boolean var12 = var0.readBits(1) == 1; // L: 373
			if (var12) { // L: 374
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 375
				throw new RuntimeException(); // L: 376
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 378
				var11.index = var1; // L: 379
				if (Players.field1333[var1] != null) { // L: 380
					var11.read(Players.field1333[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 381
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 382
				var7 = Players.Players_regions[var1]; // L: 383
				var8 = var7 >> 28; // L: 384
				var9 = var7 >> 14 & 255; // L: 385
				var10 = var7 & 255; // L: 386
				var11.pathTraversed[0] = Players.field1332[var1]; // L: 387
				var11.plane = (byte)var8; // L: 388
				var11.resetPath((var9 << 13) + var3 - WorldMapData_0.baseX * 64, (var10 << 13) + var4 - GameObject.baseY * 64); // L: 389
				var11.field1110 = false; // L: 390
				return true; // L: 391
			}
		} else if (var2 == 1) { // L: 393
			var3 = var0.readBits(2); // L: 394
			var4 = Players.Players_regions[var1]; // L: 395
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 396
			return false; // L: 397
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 399
				var3 = var0.readBits(5); // L: 400
				var4 = var3 >> 3; // L: 401
				var5 = var3 & 7; // L: 402
				var6 = Players.Players_regions[var1]; // L: 403
				var7 = (var6 >> 28) + var4 & 3; // L: 404
				var8 = var6 >> 14 & 255; // L: 405
				var9 = var6 & 255; // L: 406
				if (var5 == 0) { // L: 407
					--var8; // L: 408
					--var9; // L: 409
				}

				if (var5 == 1) { // L: 411
					--var9;
				}

				if (var5 == 2) { // L: 412
					++var8; // L: 413
					--var9; // L: 414
				}

				if (var5 == 3) { // L: 416
					--var8;
				}

				if (var5 == 4) { // L: 417
					++var8;
				}

				if (var5 == 5) { // L: 418
					--var8; // L: 419
					++var9; // L: 420
				}

				if (var5 == 6) { // L: 422
					++var9;
				}

				if (var5 == 7) { // L: 423
					++var8; // L: 424
					++var9; // L: 425
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 427
				return false; // L: 428
			} else {
				var3 = var0.readBits(18); // L: 430
				var4 = var3 >> 16; // L: 431
				var5 = var3 >> 8 & 255; // L: 432
				var6 = var3 & 255; // L: 433
				var7 = Players.Players_regions[var1]; // L: 434
				var8 = (var7 >> 28) + var4 & 3; // L: 435
				var9 = var5 + (var7 >> 14) & 255; // L: 436
				var10 = var6 + var7 & 255; // L: 437
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 438
				return false; // L: 439
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lio;",
		garbageValue = "746118634"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 345
		if (var1 != null) { // L: 346
			return var1;
		} else {
			var1 = PendingSpawn.method2360(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 347
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0); // L: 348
			}

			return var1; // L: 349
		}
	}
}
