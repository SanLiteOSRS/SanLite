import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class172 {
	@ObfuscatedName("aj")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("ap")
	@Export("Tiles_hue")
	static int[] Tiles_hue;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILin;Lij;Liq;I)Z",
		garbageValue = "135723678"
	)
	static final boolean method3519(int var0, int var1, RouteStrategy var2, CollisionMap var3, class217 var4) {
		int var5 = var4.method4236(); // L: 367
		int var6 = var4.method4237(); // L: 368
		int[][] var7 = var4.method4260(); // L: 369
		int[][] var8 = var4.method4238(); // L: 370
		int[] var9 = var4.method4240(); // L: 371
		int[] var10 = var4.method4241(); // L: 372
		int var11 = var4.method4242(); // L: 373
		int var12 = var0; // L: 374
		int var13 = var1; // L: 375
		int var14 = var5 >> 1; // L: 376
		int var15 = var6 >> 1; // L: 377
		int var16 = var0 - var14; // L: 378
		int var17 = var1 - var15; // L: 379
		var8[var14][var15] = 99; // L: 380
		var7[var14][var15] = 0; // L: 381
		byte var18 = 0; // L: 382
		int var19 = 0; // L: 383
		var9[var18] = var0; // L: 384
		byte var10001 = var18;
		int var24 = var18 + 1; // L: 385
		var10[var10001] = var1;
		int[][] var20 = var3.flags; // L: 386

		while (var19 != var24) { // L: 389
			var12 = var9[var19]; // L: 390
			var13 = var10[var19]; // L: 391
			var19 = var19 + 1 & var11; // L: 392
			var14 = var12 - var16; // L: 393
			var15 = var13 - var17; // L: 394
			int var21 = var12 - var3.xInset; // L: 395
			int var22 = var13 - var3.yInset; // L: 396
			if (var2.hasArrived(1, var12, var13, var3)) { // L: 397
				var4.method4233(var12, var13); // L: 398
				return true; // L: 399
			}

			int var23 = var7[var14][var15] + 1; // L: 401
			if (var14 > 0 && var8[var14 - 1][var15] == 0 && (var20[var21 - 1][var22] & 19136776) == 0) { // L: 402
				var9[var24] = var12 - 1; // L: 403
				var10[var24] = var13; // L: 404
				var24 = var24 + 1 & var11; // L: 405
				var8[var14 - 1][var15] = 2; // L: 406
				var7[var14 - 1][var15] = var23; // L: 407
			}

			if (var14 < var5 - 1 && var8[var14 + 1][var15] == 0 && (var20[var21 + 1][var22] & 19136896) == 0) { // L: 409
				var9[var24] = var12 + 1; // L: 410
				var10[var24] = var13; // L: 411
				var24 = var24 + 1 & var11; // L: 412
				var8[var14 + 1][var15] = 8; // L: 413
				var7[var14 + 1][var15] = var23; // L: 414
			}

			if (var15 > 0 && var8[var14][var15 - 1] == 0 && (var20[var21][var22 - 1] & 19136770) == 0) { // L: 416
				var9[var24] = var12; // L: 417
				var10[var24] = var13 - 1; // L: 418
				var24 = var24 + 1 & var11; // L: 419
				var8[var14][var15 - 1] = 1; // L: 420
				var7[var14][var15 - 1] = var23; // L: 421
			}

			if (var15 < var6 - 1 && var8[var14][var15 + 1] == 0 && (var20[var21][var22 + 1] & 19136800) == 0) { // L: 423
				var9[var24] = var12; // L: 424
				var10[var24] = var13 + 1; // L: 425
				var24 = var24 + 1 & var11; // L: 426
				var8[var14][var15 + 1] = 4; // L: 427
				var7[var14][var15 + 1] = var23; // L: 428
			}

			if (var14 > 0 && var15 > 0 && var8[var14 - 1][var15 - 1] == 0 && (var20[var21 - 1][var22 - 1] & 19136782) == 0 && (var20[var21 - 1][var22] & 19136776) == 0 && (var20[var21][var22 - 1] & 19136770) == 0) { // L: 430
				var9[var24] = var12 - 1; // L: 431
				var10[var24] = var13 - 1; // L: 432
				var24 = var24 + 1 & var11; // L: 433
				var8[var14 - 1][var15 - 1] = 3; // L: 434
				var7[var14 - 1][var15 - 1] = var23; // L: 435
			}

			if (var14 < var5 - 1 && var15 > 0 && var8[var14 + 1][var15 - 1] == 0 && (var20[var21 + 1][var22 - 1] & 19136899) == 0 && (var20[var21 + 1][var22] & 19136896) == 0 && (var20[var21][var22 - 1] & 19136770) == 0) { // L: 437
				var9[var24] = var12 + 1; // L: 438
				var10[var24] = var13 - 1; // L: 439
				var24 = var24 + 1 & var11; // L: 440
				var8[var14 + 1][var15 - 1] = 9; // L: 441
				var7[var14 + 1][var15 - 1] = var23; // L: 442
			}

			if (var14 > 0 && var15 < var6 - 1 && var8[var14 - 1][var15 + 1] == 0 && (var20[var21 - 1][var22 + 1] & 19136824) == 0 && (var20[var21 - 1][var22] & 19136776) == 0 && (var20[var21][var22 + 1] & 19136800) == 0) { // L: 444
				var9[var24] = var12 - 1; // L: 445
				var10[var24] = var13 + 1; // L: 446
				var24 = var24 + 1 & var11; // L: 447
				var8[var14 - 1][var15 + 1] = 6; // L: 448
				var7[var14 - 1][var15 + 1] = var23; // L: 449
			}

			if (var14 < var5 - 1 && var15 < var6 - 1 && var8[var14 + 1][var15 + 1] == 0 && (var20[var21 + 1][var22 + 1] & 19136992) == 0 && (var20[var21 + 1][var22] & 19136896) == 0 && (var20[var21][var22 + 1] & 19136800) == 0) { // L: 451
				var9[var24] = var12 + 1; // L: 452
				var10[var24] = var13 + 1; // L: 453
				var24 = var24 + 1 & var11; // L: 454
				var8[var14 + 1][var15 + 1] = 12; // L: 455
				var7[var14 + 1][var15 + 1] = var23; // L: 456
			}
		}

		var4.method4233(var12, var13); // L: 459
		return false; // L: 460
	}
}
