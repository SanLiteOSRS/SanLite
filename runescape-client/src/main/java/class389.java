import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public final class class389 {
	@ObfuscatedName("aw")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("ay")
	static long[] field4444;
	@ObfuscatedName("jt")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field4444 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field4444.length; ++var0) { // L: 8
			field4444[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V",
		garbageValue = "-811988232"
	)
	static final void method7260(Actor var0) {
		int var2;
		int var3;
		int var4;
		int var6;
		if (var0.targetIndex != -1) { // L: 4449
			Object var1 = null; // L: 4450
			var2 = 65536; // L: 4451
			if (var0.targetIndex < var2) { // L: 4452
				var1 = Client.npcs[var0.targetIndex]; // L: 4453
			} else {
				var1 = Client.players[var0.targetIndex - var2]; // L: 4456
			}

			if (var1 != null) { // L: 4458
				var3 = var0.x - ((Actor)var1).x; // L: 4459
				var4 = var0.y - ((Actor)var1).y; // L: 4460
				if (var3 != 0 || var4 != 0) { // L: 4461
					var6 = (int)(Math.atan2((double)var3, (double)var4) * 325.94932345220167D) & 2047; // L: 4465
					var0.orientation = var6; // L: 4467
				}
			} else if (var0.false0) { // L: 4470
				var0.targetIndex = -1; // L: 4471
				var0.false0 = false; // L: 4472
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1256 > 0) { // L: 4475
			var7 = -1; // L: 4476
			if (var0.field1220 != -1 && var0.field1221 != -1) { // L: 4477
				var2 = var0.field1220 * 128 - AbstractArchive.baseX * 8192 + 64; // L: 4478
				var3 = var0.field1221 * 128 - class148.baseY * 8192 + 64; // L: 4479
				var4 = var0.x - var2; // L: 4480
				int var8 = var0.y - var3; // L: 4481
				if (var4 != 0 || var8 != 0) { // L: 4482
					var6 = (int)(Math.atan2((double)var4, (double)var8) * 325.94932345220167D) & 2047; // L: 4485
					var7 = var6; // L: 4487
				}
			} else if (var0.field1219 != -1) { // L: 4490
				var7 = var0.field1219; // L: 4491
			}

			if (var7 != -1) { // L: 4493
				var0.orientation = var7; // L: 4494
				if (var0.field1222) { // L: 4495
					var0.rotation = var0.orientation; // L: 4496
				}
			}

			var0.method2392(); // L: 4499
		}

		var7 = var0.orientation - var0.rotation & 2047; // L: 4501
		if (var7 != 0) { // L: 4502
			boolean var10 = true; // L: 4503
			boolean var11 = true; // L: 4504
			++var0.field1250; // L: 4505
			var4 = var7 > 1024 ? -1 : 1; // L: 4506
			var0.rotation += var4 * var0.field1251; // L: 4507
			boolean var12 = true; // L: 4508
			if (var7 < var0.field1251 || var7 > 2048 - var0.field1251) { // L: 4509
				var0.rotation = var0.orientation; // L: 4510
				var12 = false; // L: 4511
			}

			if (var0.field1251 > 0 && var0.idleSequence == var0.movementSequence && (var0.field1250 > 25 || var12)) { // L: 4513
				if (var4 == -1 && var0.field1237 != -1) { // L: 4514
					var0.movementSequence = var0.field1237; // L: 4515
				} else if (var4 == 1 && var0.field1190 != -1) { // L: 4517
					var0.movementSequence = var0.field1190; // L: 4518
				} else {
					var0.movementSequence = var0.walkSequence; // L: 4521
				}
			}

			var0.rotation &= 2047; // L: 4525
		} else {
			if (var0.false0) { // L: 4528
				var0.targetIndex = -1; // L: 4529
				var0.false0 = false; // L: 4530
			}

			var0.field1250 = 0; // L: 4532
		}

	} // L: 4534
}
