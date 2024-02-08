import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("Players")
public class Players {
	@ObfuscatedName("af")
	static byte[] field1355;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lir;"
	)
	static class231[] field1348;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	static Buffer[] field1347;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -330310691
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("ag")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1979773207
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("ae")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("aa")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("au")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("an")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 844236579
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("ax")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static Buffer field1351;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	static SpritePixels[] field1346;

	static {
		field1355 = new byte[2048]; // L: 19
		field1348 = new class231[2048]; // L: 20
		field1347 = new Buffer[2048]; // L: 21
		Players_count = 0; // L: 22
		Players_indices = new int[2048]; // L: 23
		Players_emptyIdxCount = 0; // L: 24
		Players_emptyIndices = new int[2048]; // L: 25
		Players_regions = new int[2048]; // L: 26
		Players_orientations = new int[2048]; // L: 27
		Players_targetIndices = new int[2048]; // L: 28
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1351 = new Buffer(new byte[5000]); // L: 31
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)V",
		garbageValue = "-1302012413"
	)
	public static void method2786(class325 var0) {
		if (!class319.field3463.contains(var0)) { // L: 29
			class319.field3463.add(var0); // L: 30
		}

	} // L: 32

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luo;II)Z",
		garbageValue = "-494610009"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 399
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 400
			if (var0.readBits(1) != 0) { // L: 401
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 402
			var4 = var0.readBits(13); // L: 403
			boolean var12 = var0.readBits(1) == 1; // L: 404
			if (var12) { // L: 405
				Players_pendingUpdateIndices[++Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 406
				throw new RuntimeException(); // L: 407
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 409
				var11.index = var1; // L: 410
				if (field1347[var1] != null) { // L: 411
					var11.read(field1347[var1]);
				}

				var11.orientation = Players_orientations[var1]; // L: 412
				var11.targetIndex = Players_targetIndices[var1]; // L: 413
				var7 = Players_regions[var1]; // L: 414
				var8 = var7 >> 28; // L: 415
				var9 = var7 >> 14 & 255; // L: 416
				var10 = var7 & 255; // L: 417
				var11.pathTraversed[0] = field1348[var1]; // L: 418
				var11.plane = (byte)var8; // L: 419
				var11.resetPath((var9 << 13) + var3 - HealthBarDefinition.baseX * 64, (var10 << 13) + var4 - WorldMapScaleHandler.baseY * 64); // L: 420
				var11.field1124 = false; // L: 421
				return true; // L: 422
			}
		} else if (var2 == 1) { // L: 424
			var3 = var0.readBits(2); // L: 425
			var4 = Players_regions[var1]; // L: 426
			Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 427
			return false; // L: 428
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 430
				var3 = var0.readBits(5); // L: 431
				var4 = var3 >> 3; // L: 432
				var5 = var3 & 7; // L: 433
				var6 = Players_regions[var1]; // L: 434
				var7 = (var6 >> 28) + var4 & 3; // L: 435
				var8 = var6 >> 14 & 255; // L: 436
				var9 = var6 & 255; // L: 437
				if (var5 == 0) { // L: 438
					--var8; // L: 439
					--var9; // L: 440
				}

				if (var5 == 1) { // L: 442
					--var9;
				}

				if (var5 == 2) { // L: 443
					++var8; // L: 444
					--var9; // L: 445
				}

				if (var5 == 3) { // L: 447
					--var8;
				}

				if (var5 == 4) { // L: 448
					++var8;
				}

				if (var5 == 5) { // L: 449
					--var8; // L: 450
					++var9; // L: 451
				}

				if (var5 == 6) { // L: 453
					++var9;
				}

				if (var5 == 7) { // L: 454
					++var8; // L: 455
					++var9; // L: 456
				}

				Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 458
				return false; // L: 459
			} else {
				var3 = var0.readBits(18); // L: 461
				var4 = var3 >> 16; // L: 462
				var5 = var3 >> 8 & 255; // L: 463
				var6 = var3 & 255; // L: 464
				var7 = Players_regions[var1]; // L: 465
				var8 = (var7 >> 28) + var4 & 3; // L: 466
				var9 = var5 + (var7 >> 14) & 255; // L: 467
				var10 = var6 + var7 & 255; // L: 468
				Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 469
				return false; // L: 470
			}
		}
	}
}
