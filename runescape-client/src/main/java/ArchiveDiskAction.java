import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 11477361
	)
	@Export("type")
	int type;
	@ObfuscatedName("e")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	} // L: 12

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqx;II)Z",
		garbageValue = "945337988"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 370
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 371
			if (var0.readBits(1) != 0) { // L: 372
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 373
			var4 = var0.readBits(13); // L: 374
			boolean var12 = var0.readBits(1) == 1; // L: 375
			if (var12) { // L: 376
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 377
				throw new RuntimeException(); // L: 378
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 380
				var11.index = var1; // L: 381
				if (Players.field1372[var1] != null) { // L: 382
					var11.read(Players.field1372[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 383
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 384
				var7 = Players.Players_regions[var1]; // L: 385
				var8 = var7 >> 28; // L: 386
				var9 = var7 >> 14 & 255; // L: 387
				var10 = var7 & 255; // L: 388
				var11.pathTraversed[0] = Players.field1379[var1]; // L: 389
				var11.plane = (byte)var8; // L: 390
				var11.resetPath((var9 << 13) + var3 - class154.baseX * 64, (var10 << 13) + var4 - class365.baseY * 64); // L: 391
				var11.field1133 = false; // L: 392
				return true; // L: 393
			}
		} else if (var2 == 1) { // L: 395
			var3 = var0.readBits(2); // L: 396
			var4 = Players.Players_regions[var1]; // L: 397
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 398
			return false; // L: 399
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 401
				var3 = var0.readBits(5); // L: 402
				var4 = var3 >> 3; // L: 403
				var5 = var3 & 7; // L: 404
				var6 = Players.Players_regions[var1]; // L: 405
				var7 = (var6 >> 28) + var4 & 3; // L: 406
				var8 = var6 >> 14 & 255; // L: 407
				var9 = var6 & 255; // L: 408
				if (var5 == 0) { // L: 409
					--var8; // L: 410
					--var9; // L: 411
				}

				if (var5 == 1) { // L: 413
					--var9;
				}

				if (var5 == 2) { // L: 414
					++var8; // L: 415
					--var9; // L: 416
				}

				if (var5 == 3) { // L: 418
					--var8;
				}

				if (var5 == 4) { // L: 419
					++var8;
				}

				if (var5 == 5) { // L: 420
					--var8; // L: 421
					++var9; // L: 422
				}

				if (var5 == 6) { // L: 424
					++var9;
				}

				if (var5 == 7) { // L: 425
					++var8; // L: 426
					++var9; // L: 427
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 429
				return false; // L: 430
			} else {
				var3 = var0.readBits(18); // L: 432
				var4 = var3 >> 16; // L: 433
				var5 = var3 >> 8 & 255; // L: 434
				var6 = var3 & 255; // L: 435
				var7 = Players.Players_regions[var1]; // L: 436
				var8 = (var7 >> 28) + var4 & 3; // L: 437
				var9 = var5 + (var7 >> 14) & 255; // L: 438
				var10 = var6 + var7 & 255; // L: 439
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 440
				return false; // L: 441
			}
		}
	}
}
