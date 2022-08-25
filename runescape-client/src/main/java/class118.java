import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class118 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class118 field1464;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class118 field1457;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class118 field1458;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class118 field1459;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class118 field1465;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class118 field1461;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1949909645
	)
	final int field1462;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 458997395
	)
	final int field1463;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -278782955
	)
	final int field1460;

	static {
		field1464 = new class118(0, 0, (String)null, 0); // L: 14
		field1457 = new class118(1, 1, (String)null, 9); // L: 15
		field1458 = new class118(2, 2, (String)null, 3); // L: 16
		field1459 = new class118(3, 3, (String)null, 6); // L: 17
		field1465 = new class118(4, 4, (String)null, 1); // L: 18
		field1461 = new class118(5, 5, (String)null, 3); // L: 19
	}

	class118(int var1, int var2, String var3, int var4) {
		this.field1462 = var1; // L: 25
		this.field1463 = var2; // L: 26
		this.field1460 = var4; // L: 27
	} // L: 28

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-121656532"
	)
	int method2714() {
		return this.field1460; // L: 31
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1463;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lgz;",
		garbageValue = "-1079652854"
	)
	public static VarbitComposition method2721(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 34
			var1 = new VarbitComposition(); // L: 35
			if (var2 != null) { // L: 36
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0); // L: 37
			return var1; // L: 38
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lls;IIIZI)V",
		garbageValue = "1367310887"
	)
	public static void method2713(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class273.musicPlayerStatus = 1; // L: 40
		NetFileRequest.musicTrackArchive = var0; // L: 41
		UrlRequester.musicTrackGroupId = var1; // L: 42
		SceneTilePaint.musicTrackFileId = var2; // L: 43
		class28.musicTrackVolume = var3; // L: 44
		class273.musicTrackBoolean = var4; // L: 45
		class160.pcmSampleLength = 10000; // L: 46
	} // L: 47

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqz;II)Z",
		garbageValue = "721926081"
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
				if (Players.field1308[var1] != null) { // L: 380
					var11.read(Players.field1308[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 381
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 382
				var7 = Players.Players_regions[var1]; // L: 383
				var8 = var7 >> 28; // L: 384
				var9 = var7 >> 14 & 255; // L: 385
				var10 = var7 & 255; // L: 386
				var11.pathTraversed[0] = Players.field1298[var1]; // L: 387
				var11.plane = (byte)var8; // L: 388
				var11.resetPath((var9 << 13) + var3 - Decimator.baseX * 64, (var10 << 13) + var4 - class7.baseY * 64); // L: 389
				var11.field1111 = false; // L: 390
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
}
