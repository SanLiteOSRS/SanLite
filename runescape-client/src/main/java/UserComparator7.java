import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lqg;I)I",
		garbageValue = "280239649"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1267523279"
	)
	public static int method2860(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 24
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IS)Z",
		garbageValue = "-23255"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 380
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 381
			if (var0.readBits(1) != 0) { // L: 382
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 383
			var4 = var0.readBits(13); // L: 384
			boolean var12 = var0.readBits(1) == 1; // L: 385
			if (var12) { // L: 386
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 387
				throw new RuntimeException(); // L: 388
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 390
				var11.index = var1; // L: 391
				if (Players.field1332[var1] != null) { // L: 392
					var11.read(Players.field1332[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 393
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 394
				var7 = Players.Players_regions[var1]; // L: 395
				var8 = var7 >> 28; // L: 396
				var9 = var7 >> 14 & 255; // L: 397
				var10 = var7 & 255; // L: 398
				var11.pathTraversed[0] = Players.field1328[var1]; // L: 399
				var11.plane = (byte)var8; // L: 400
				var11.resetPath((var9 << 13) + var3 - class213.baseX * 64, (var10 << 13) + var4 - class101.baseY * 64); // L: 401
				var11.field1124 = false; // L: 402
				return true; // L: 403
			}
		} else if (var2 == 1) { // L: 405
			var3 = var0.readBits(2); // L: 406
			var4 = Players.Players_regions[var1]; // L: 407
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 408
			return false; // L: 409
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 411
				var3 = var0.readBits(5); // L: 412
				var4 = var3 >> 3; // L: 413
				var5 = var3 & 7; // L: 414
				var6 = Players.Players_regions[var1]; // L: 415
				var7 = (var6 >> 28) + var4 & 3; // L: 416
				var8 = var6 >> 14 & 255; // L: 417
				var9 = var6 & 255; // L: 418
				if (var5 == 0) { // L: 419
					--var8; // L: 420
					--var9; // L: 421
				}

				if (var5 == 1) { // L: 423
					--var9;
				}

				if (var5 == 2) { // L: 424
					++var8; // L: 425
					--var9; // L: 426
				}

				if (var5 == 3) { // L: 428
					--var8;
				}

				if (var5 == 4) { // L: 429
					++var8;
				}

				if (var5 == 5) { // L: 430
					--var8; // L: 431
					++var9; // L: 432
				}

				if (var5 == 6) { // L: 434
					++var9;
				}

				if (var5 == 7) { // L: 435
					++var8; // L: 436
					++var9; // L: 437
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 439
				return false; // L: 440
			} else {
				var3 = var0.readBits(18); // L: 442
				var4 = var3 >> 16; // L: 443
				var5 = var3 >> 8 & 255; // L: 444
				var6 = var3 & 255; // L: 445
				var7 = Players.Players_regions[var1]; // L: 446
				var8 = (var7 >> 28) + var4 & 3; // L: 447
				var9 = var5 + (var7 >> 14) & 255; // L: 448
				var10 = var7 + var6 & 255; // L: 449
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 450
				return false; // L: 451
			}
		}
	}
}
