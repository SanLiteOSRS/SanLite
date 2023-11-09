import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public abstract class class412 extends class259 implements class470 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	@Export("World_worlds")
	static World[] World_worlds;

	@ObfuscatedSignature(
		descriptor = "(Llq;Lmo;I)V"
	)
	protected class412(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Loz;",
		garbageValue = "-481589875"
	)
	protected abstract class414 vmethod8207(int var1);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2043084628"
	)
	public int method7748() {
		return super.field2969; // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "40"
	)
	public Object vmethod8697(int var1) {
		class414 var2 = this.vmethod8207(var1); // L: 24
		return var2 != null && var2.method7770() ? var2.method7771() : null; // L: 25 26
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)Lrj;",
		garbageValue = "1744196611"
	)
	public class471 method7747(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class414 var3 = this.vmethod8207(var2); // L: 31
		class471 var4 = new class471(var2); // L: 32
		Class var5 = var3.field4598.field4833; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field4930 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4930 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field4930 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class466.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class466 var6 = (class466)var5.newInstance(); // L: 39
				var6.method8671(var1); // L: 40
				var4.field4930 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lqk;II)Z",
		garbageValue = "1077691495"
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
				if (Players.field1315[var1] != null) { // L: 382
					var11.read(Players.field1315[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 383
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 384
				var7 = Players.Players_regions[var1]; // L: 385
				var8 = var7 >> 28; // L: 386
				var9 = var7 >> 14 & 255; // L: 387
				var10 = var7 & 255; // L: 388
				var11.pathTraversed[0] = Players.field1314[var1]; // L: 389
				var11.plane = (byte)var8; // L: 390
				var11.resetPath((var9 << 13) + var3 - class26.baseX * 64, (var10 << 13) + var4 - class158.baseY * 64); // L: 391
				var11.field1116 = false; // L: 392
				return true; // L: 393
			}
		} else if (var2 == 1) { // L: 395
			var3 = var0.readBits(2); // L: 396
			var4 = Players.Players_regions[var1]; // L: 397
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 398
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
