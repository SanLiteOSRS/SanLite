import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = 1344045265
	)
	static int field4962;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("az")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 16
	} // L: 17

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIILiw;Lis;Lij;I)Z",
		garbageValue = "-287593620"
	)
	static final boolean method8702(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, class216 var5) {
		int var6 = var5.method4199(); // L: 318
		int var7 = var5.method4216(); // L: 319
		int[][] var8 = var5.method4202(); // L: 320
		int[][] var9 = var5.method4222(); // L: 321
		int[] var10 = var5.method4203(); // L: 322
		int[] var11 = var5.method4204(); // L: 323
		int var12 = var5.method4205(); // L: 324
		int var13 = var0; // L: 325
		int var14 = var1; // L: 326
		int var15 = var6 >> 1; // L: 327
		int var16 = var7 >> 1; // L: 328
		int var17 = var0 - var15; // L: 329
		int var18 = var1 - var16; // L: 330
		var9[var15][var16] = 99; // L: 331
		var8[var15][var16] = 0; // L: 332
		byte var19 = 0; // L: 333
		int var20 = 0; // L: 334
		var10[var19] = var0; // L: 335
		int var26 = var19 + 1; // L: 336
		var11[var19] = var1;
		int[][] var21 = var4.flags; // L: 337

		while (true) {
			label305:
			while (true) {
				int var22;
				int var23;
				int var24;
				int var25;
				do {
					do {
						do {
							label282:
							do {
								if (var20 == var26) { // L: 338
									var5.method4196(var13, var14); // L: 456
									return false; // L: 457
								}

								var13 = var10[var20]; // L: 339
								var14 = var11[var20]; // L: 340
								var20 = var20 + 1 & var12; // L: 341
								var15 = var13 - var17; // L: 342
								var16 = var14 - var18; // L: 343
								var22 = var13 - var4.xInset; // L: 344
								var23 = var14 - var4.yInset; // L: 345
								if (var3.hasArrived(var2, var13, var14, var4)) { // L: 346
									var5.method4196(var13, var14); // L: 347
									return true; // L: 348
								}

								var24 = var8[var15][var16] + 1; // L: 350
								if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 19136782) == 0 && (var21[var22 - 1][var23 + var2 - 1] & 19136824) == 0) { // L: 351 352 353 354
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13 - 1; // L: 358
											var11[var26] = var14; // L: 359
											var26 = var26 + 1 & var12; // L: 360
											var9[var15 - 1][var16] = 2; // L: 361
											var8[var15 - 1][var16] = var24; // L: 362
											break;
										}

										if ((var21[var22 - 1][var25 + var23] & 19136830) != 0) { // L: 356
											break;
										}

										++var25; // L: 355
									}
								}

								if (var15 < var6 - var2 && var9[var15 + 1][var16] == 0 && (var21[var22 + var2][var23] & 19136899) == 0 && (var21[var22 + var2][var23 + var2 - 1] & 19136992) == 0) { // L: 364 365 366 367
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13 + 1; // L: 371
											var11[var26] = var14; // L: 372
											var26 = var26 + 1 & var12; // L: 373
											var9[var15 + 1][var16] = 8; // L: 374
											var8[var15 + 1][var16] = var24; // L: 375
											break;
										}

										if ((var21[var22 + var2][var25 + var23] & 19136995) != 0) { // L: 369
											break;
										}

										++var25; // L: 368
									}
								}

								if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 19136782) == 0 && (var21[var22 + var2 - 1][var23 - 1] & 19136899) == 0) { // L: 377 378 379 380
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13; // L: 384
											var11[var26] = var14 - 1; // L: 385
											var26 = var26 + 1 & var12; // L: 386
											var9[var15][var16 - 1] = 1; // L: 387
											var8[var15][var16 - 1] = var24; // L: 388
											break;
										}

										if ((var21[var22 + var25][var23 - 1] & 19136911) != 0) { // L: 382
											break;
										}

										++var25; // L: 381
									}
								}

								if (var16 < var7 - var2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + var2] & 19136824) == 0 && (var21[var22 + var2 - 1][var23 + var2] & 19136992) == 0) { // L: 390 391 392 393
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13; // L: 397
											var11[var26] = var14 + 1; // L: 398
											var26 = var26 + 1 & var12; // L: 399
											var9[var15][var16 + 1] = 4; // L: 400
											var8[var15][var16 + 1] = var24; // L: 401
											break;
										}

										if ((var21[var25 + var22][var23 + var2] & 19137016) != 0) { // L: 395
											break;
										}

										++var25; // L: 394
									}
								}

								if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23 - 1] & 19136782) == 0) { // L: 403 404 405
									var25 = 1;

									while (true) {
										if (var25 >= var2) {
											var10[var26] = var13 - 1; // L: 410
											var11[var26] = var14 - 1; // L: 411
											var26 = var26 + 1 & var12; // L: 412
											var9[var15 - 1][var16 - 1] = 3; // L: 413
											var8[var15 - 1][var16 - 1] = var24; // L: 414
											break;
										}

										if ((var21[var22 - 1][var25 + (var23 - 1)] & 19136830) != 0 || (var21[var25 + (var22 - 1)][var23 - 1] & 19136911) != 0) { // L: 407 408
											break;
										}

										++var25; // L: 406
									}
								}

								if (var15 < var6 - var2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + var2][var23 - 1] & 19136899) == 0) { // L: 416 417 418
									var25 = 1;

									while (true) {
										if (var25 >= var2) {
											var10[var26] = var13 + 1; // L: 423
											var11[var26] = var14 - 1; // L: 424
											var26 = var26 + 1 & var12; // L: 425
											var9[var15 + 1][var16 - 1] = 9; // L: 426
											var8[var15 + 1][var16 - 1] = var24; // L: 427
											break;
										}

										if ((var21[var22 + var2][var25 + (var23 - 1)] & 19136995) != 0 || (var21[var22 + var25][var23 - 1] & 19136911) != 0) { // L: 420 421
											break;
										}

										++var25; // L: 419
									}
								}

								if (var15 > 0 && var16 < var7 - var2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + var2] & 19136824) == 0) { // L: 429 430 431
									for (var25 = 1; var25 < var2; ++var25) { // L: 432
										if ((var21[var22 - 1][var23 + var25] & 19136830) != 0 || (var21[var25 + (var22 - 1)][var23 + var2] & 19137016) != 0) { // L: 433 434
											continue label282;
										}
									}

									var10[var26] = var13 - 1; // L: 436
									var11[var26] = var14 + 1; // L: 437
									var26 = var26 + 1 & var12; // L: 438
									var9[var15 - 1][var16 + 1] = 6; // L: 439
									var8[var15 - 1][var16 + 1] = var24; // L: 440
								}
							} while(var15 >= var6 - var2); // L: 442
						} while(var16 >= var7 - var2);
					} while(var9[var15 + 1][var16 + 1] != 0); // L: 443
				} while((var21[var22 + var2][var23 + var2] & 19136992) != 0); // L: 444

				for (var25 = 1; var25 < var2; ++var25) { // L: 445
					if ((var21[var22 + var25][var23 + var2] & 19137016) != 0 || (var21[var22 + var2][var23 + var25] & 19136995) != 0) { // L: 446 447
						continue label305;
					}
				}

				var10[var26] = var13 + 1; // L: 449
				var11[var26] = var14 + 1; // L: 450
				var26 = var26 + 1 & var12; // L: 451
				var9[var15 + 1][var16 + 1] = 12; // L: 452
				var8[var15 + 1][var16 + 1] = var24; // L: 453
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIZIB)J",
		garbageValue = "0"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 74
		if (var3) { // L: 75
			var5 |= 65536L;
		}

		return var5; // L: 76
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-80"
	)
	static void method8701(int var0) {
		SequenceDefinition var1 = EnumComposition.SequenceDefinition_get(var0); // L: 12926
		if (var1.isCachedModelIdSet()) { // L: 12927
			if (ClientPreferences.method2552(var1.SequenceDefinition_cachedModelId) == 2) { // L: 12930
				Client.field695.add(var1.SequenceDefinition_cachedModelId); // L: 12931
			}

		}
	} // L: 12928 12933
}
