import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class196 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class196 field2058;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class196 field2062;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class196 field2059;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class196 field2060;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class196 field2063;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class196 field2061;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class196 field2057;

	static {
		field2058 = new class196(0, class208.field2301); // L: 4
		field2062 = new class196(1, class208.field2299); // L: 5
		field2059 = new class196(2, class208.field2297); // L: 6
		field2060 = new class196(3, class208.field2294); // L: 7
		field2063 = new class196(4, class208.field2302); // L: 8
		field2061 = new class196(5, class208.field2300); // L: 9
		field2057 = new class196(6, class208.field2295); // L: 10
	}

	@ObfuscatedSignature(
		descriptor = "(ILiv;)V"
	)
	class196(int var1, class208 var2) {
	} // L: 12

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltn;II)Z",
		garbageValue = "1041304856"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 410
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 411
			if (var0.readBits(1) != 0) { // L: 412
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 413
			var4 = var0.readBits(13); // L: 414
			boolean var12 = var0.readBits(1) == 1; // L: 415
			if (var12) { // L: 416
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 417
				throw new RuntimeException(); // L: 418
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 420
				var11.index = var1; // L: 421
				if (Players.field1329[var1] != null) { // L: 422
					var11.read(Players.field1329[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 423
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 424
				var7 = Players.Players_regions[var1]; // L: 425
				var8 = var7 >> 28; // L: 426
				var9 = var7 >> 14 & 255; // L: 427
				var10 = var7 & 255; // L: 428
				var11.pathTraversed[0] = Players.field1342[var1]; // L: 429
				var11.plane = (byte)var8; // L: 430
				var11.resetPath((var9 << 13) + var3 - class147.baseX * 64, (var10 << 13) + var4 - ModeWhere.baseY * 64); // L: 431
				var11.field1107 = false; // L: 432
				return true; // L: 433
			}
		} else if (var2 == 1) { // L: 435
			var3 = var0.readBits(2); // L: 436
			var4 = Players.Players_regions[var1]; // L: 437
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 438
			return false; // L: 439
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 441
				var3 = var0.readBits(5); // L: 442
				var4 = var3 >> 3; // L: 443
				var5 = var3 & 7; // L: 444
				var6 = Players.Players_regions[var1]; // L: 445
				var7 = (var6 >> 28) + var4 & 3; // L: 446
				var8 = var6 >> 14 & 255; // L: 447
				var9 = var6 & 255; // L: 448
				if (var5 == 0) { // L: 449
					--var8; // L: 450
					--var9; // L: 451
				}

				if (var5 == 1) { // L: 453
					--var9;
				}

				if (var5 == 2) { // L: 454
					++var8; // L: 455
					--var9; // L: 456
				}

				if (var5 == 3) { // L: 458
					--var8;
				}

				if (var5 == 4) { // L: 459
					++var8;
				}

				if (var5 == 5) { // L: 460
					--var8; // L: 461
					++var9; // L: 462
				}

				if (var5 == 6) { // L: 464
					++var9;
				}

				if (var5 == 7) { // L: 465
					++var8; // L: 466
					++var9; // L: 467
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 469
				return false; // L: 470
			} else {
				var3 = var0.readBits(18); // L: 472
				var4 = var3 >> 16; // L: 473
				var5 = var3 >> 8 & 255; // L: 474
				var6 = var3 & 255; // L: 475
				var7 = Players.Players_regions[var1]; // L: 476
				var8 = (var7 >> 28) + var4 & 3; // L: 477
				var9 = var5 + (var7 >> 14) & 255; // L: 478
				var10 = var6 + var7 & 255; // L: 479
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 480
				return false; // L: 481
			}
		}
	}
}
