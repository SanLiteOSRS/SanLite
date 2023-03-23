import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class157 {
	@ObfuscatedName("do")
	static boolean field1742;
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "[Lsn;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -7475800268284802223L
	)
	long field1747;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -6641352063649809363L
	)
	long field1744;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	IterableNodeDeque field1743;

	@ObfuscatedSignature(
		descriptor = "(Lsy;)V"
	)
	public class157(Buffer var1) {
		this.field1744 = -1L; // L: 10
		this.field1743 = new IterableNodeDeque(); // L: 11
		this.method3302(var1); // L: 19
	} // L: 20

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "257726987"
	)
	void method3302(Buffer var1) {
		this.field1747 = var1.readLong(); // L: 23
		this.field1744 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class152(this);
			} else if (var2 == 4) {
				var3 = new class163(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class148(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class146(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class153(this);
			}

			((class156)var3).vmethod3353(var1); // L: 34
			this.field1743.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgn;I)V",
		garbageValue = "1833930837"
	)
	public void method3303(ClanChannel var1) {
		if (this.field1747 == var1.key && this.field1744 == var1.field1757) { // L: 41
			for (class156 var2 = (class156)this.field1743.last(); var2 != null; var2 = (class156)this.field1743.previous()) { // L: 42
				var2.vmethod3354(var1); // L: 43
			}

			++var1.field1757; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsq;II)Z",
		garbageValue = "537506847"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 378
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 379
			if (var0.readBits(1) != 0) { // L: 380
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 381
			var4 = var0.readBits(13); // L: 382
			boolean var12 = var0.readBits(1) == 1; // L: 383
			if (var12) { // L: 384
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 385
				throw new RuntimeException(); // L: 386
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 388
				var11.index = var1; // L: 389
				if (Players.field1335[var1] != null) { // L: 390
					var11.read(Players.field1335[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 391
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 392
				var7 = Players.Players_regions[var1]; // L: 393
				var8 = var7 >> 28; // L: 394
				var9 = var7 >> 14 & 255; // L: 395
				var10 = var7 & 255; // L: 396
				var11.pathTraversed[0] = Players.field1332[var1]; // L: 397
				var11.plane = (byte)var8; // L: 398
				var11.resetPath((var9 << 13) + var3 - GameEngine.baseX * 64, (var10 << 13) + var4 - class178.baseY * 64); // L: 399
				var11.field1111 = false; // L: 400
				return true; // L: 401
			}
		} else if (var2 == 1) { // L: 403
			var3 = var0.readBits(2); // L: 404
			var4 = Players.Players_regions[var1]; // L: 405
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 406
			return false; // L: 407
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 409
				var3 = var0.readBits(5); // L: 410
				var4 = var3 >> 3; // L: 411
				var5 = var3 & 7; // L: 412
				var6 = Players.Players_regions[var1]; // L: 413
				var7 = (var6 >> 28) + var4 & 3; // L: 414
				var8 = var6 >> 14 & 255; // L: 415
				var9 = var6 & 255; // L: 416
				if (var5 == 0) { // L: 417
					--var8; // L: 418
					--var9; // L: 419
				}

				if (var5 == 1) { // L: 421
					--var9;
				}

				if (var5 == 2) { // L: 422
					++var8; // L: 423
					--var9; // L: 424
				}

				if (var5 == 3) { // L: 426
					--var8;
				}

				if (var5 == 4) { // L: 427
					++var8;
				}

				if (var5 == 5) { // L: 428
					--var8; // L: 429
					++var9; // L: 430
				}

				if (var5 == 6) { // L: 432
					++var9;
				}

				if (var5 == 7) { // L: 433
					++var8; // L: 434
					++var9; // L: 435
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 437
				return false; // L: 438
			} else {
				var3 = var0.readBits(18); // L: 440
				var4 = var3 >> 16; // L: 441
				var5 = var3 >> 8 & 255; // L: 442
				var6 = var3 & 255; // L: 443
				var7 = Players.Players_regions[var1]; // L: 444
				var8 = (var7 >> 28) + var4 & 3; // L: 445
				var9 = var5 + (var7 >> 14) & 255; // L: 446
				var10 = var6 + var7 & 255; // L: 447
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 448
				return false; // L: 449
			}
		}
	}
}
