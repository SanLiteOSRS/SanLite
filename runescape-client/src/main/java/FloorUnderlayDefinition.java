import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hr")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field2051;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	static EvictingDualNodeHashTable field2052;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1608387249
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -15852369
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1337199371
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1272806225
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1369949511
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		field2052 = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	} // L: 18

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb); // L: 32
	} // L: 33

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "9"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 37
			if (var3 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var3, var2); // L: 39
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;III)V",
		garbageValue = "663810639"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 44
			this.rgb = var1.readMedium();
		}

	} // L: 46

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "642049246"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 49
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 50
		double var6 = (double)(var1 & 255) / 256.0D; // L: 51
		double var8 = var2; // L: 52
		if (var4 < var2) { // L: 53
			var8 = var4;
		}

		if (var6 < var8) { // L: 54
			var8 = var6;
		}

		double var10 = var2; // L: 55
		if (var4 > var2) { // L: 56
			var10 = var4;
		}

		if (var6 > var10) { // L: 57
			var10 = var6;
		}

		double var12 = 0.0D; // L: 58
		double var14 = 0.0D; // L: 59
		double var16 = (var8 + var10) / 2.0D; // L: 60
		if (var10 != var8) { // L: 61
			if (var16 < 0.5D) { // L: 62
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 63
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 64
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 65
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 66
			}
		}

		var12 /= 6.0D; // L: 68
		this.saturation = (int)(var14 * 256.0D); // L: 69
		this.lightness = (int)(256.0D * var16); // L: 70
		if (this.saturation < 0) { // L: 71
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 72
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 73
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 74
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 75
			this.hueMultiplier = (int)(var14 * (1.0D - var16) * 512.0D);
		} else {
			this.hueMultiplier = (int)(var16 * var14 * 512.0D); // L: 76
		}

		if (this.hueMultiplier < 1) { // L: 77
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier); // L: 78
	} // L: 79

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)J",
		garbageValue = "-6"
	)
	public static long method3815(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0]; // L: 48
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "16"
	)
	static int method3816(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2329
			Interpreter.Interpreter_intStackSize -= 3; // L: 2330
			class134.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 2331
			return 1; // L: 2332
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2334
				Interpreter.Interpreter_intStackSize -= 5; // L: 2335
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2336
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2337
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2338
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2339
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 2340
				ArrayList var15 = new ArrayList(); // L: 2341
				var15.add(var3); // L: 2342
				class136.method3141(var15, var4, var5, var6, var7); // L: 2343
				return 1; // L: 2344
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2346
				Interpreter.Interpreter_intStackSize -= 2; // L: 2347
				class7.method39(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 2348
				return 1; // L: 2349
			} else {
				class91 var10;
				class90 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2351
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2463
						if (var0 == 3211) { // L: 2572
							return 1; // L: 2573
						} else if (var0 == 3216) { // L: 2575
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2576
							var4 = 0; // L: 2577
							class91 var19 = (class91)class356.findEnumerated(Friend.method8300(), var3); // L: 2578
							if (var19 != null) { // L: 2579
								var4 = var19 != class91.field1130 ? 1 : 0; // L: 2580
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 2582
							return 1; // L: 2583
						} else if (var0 == 3218) { // L: 2585
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2586
							var4 = 0; // L: 2587
							class90 var13 = (class90)class356.findEnumerated(class207.method4106(), var3); // L: 2588
							if (var13 != null) { // L: 2589
								var4 = var13 != class90.field1116 ? 1 : 0; // L: 2590
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 2592
							return 1; // L: 2593
						} else if (var0 != 3217 && var0 != 3219) { // L: 2595
							if (var0 == 3220) { // L: 2670
								Interpreter.Interpreter_intStackSize -= 2; // L: 2671
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2672
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2673
								class169.method3521(var3, var4); // L: 2674
								return 1; // L: 2675
							} else if (var0 == 3221) { // L: 2677
								Interpreter.Interpreter_intStackSize -= 6; // L: 2678
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2679
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2680
								var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2681
								var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2682
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 2683
								int var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 2684
								ArrayList var9 = new ArrayList(); // L: 2685
								var9.add(var3); // L: 2686
								var9.add(var4); // L: 2687
								class136.method3141(var9, var5, var6, var7, var8); // L: 2688
								return 1; // L: 2689
							} else if (var0 == 3222) { // L: 2691
								Interpreter.Interpreter_intStackSize -= 4; // L: 2692
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2693
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2694
								var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2695
								var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2696
								class75.method2121(var3, var4, var5, var6); // L: 2697
								return 1; // L: 2698
							} else {
								return 2; // L: 2700
							}
						} else {
							var10 = class91.field1130; // L: 2596
							var11 = class90.field1116; // L: 2597
							var16 = true; // L: 2598
							boolean var17 = true; // L: 2599
							if (var0 == 3217) { // L: 2600
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2601
								var10 = (class91)class356.findEnumerated(Friend.method8300(), var7); // L: 2602
								if (var10 == null) { // L: 2603
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2604
								}
							}

							if (var0 == 3219) { // L: 2607
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2608
								var11 = (class90)class356.findEnumerated(class207.method4106(), var7); // L: 2609
								if (var11 == null) { // L: 2610
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2611
								}
							}

							String var12;
							byte var18;
							if (var11 == class90.field1116) { // L: 2614
								switch(var10.field1129) { // L: 2615
								case 1:
								case 2:
								case 3:
									var18 = 0; // L: 2620
									var6 = 1; // L: 2621
									break;
								case 4:
									var18 = 0; // L: 2637
									var6 = Integer.MAX_VALUE; // L: 2638
									break; // L: 2639
								case 5:
									var18 = 0; // L: 2631
									var6 = 100; // L: 2632
									break; // L: 2633
								default:
									var12 = String.format("Unkown device option: %s.", var10.toString()); // L: 2626
									throw new RuntimeException(var12); // L: 2627
								}
							} else {
								switch(var11.field1120) { // L: 2644
								case 1:
									var18 = 0; // L: 2647
									var6 = 1; // L: 2648
									break; // L: 2649
								case 2:
								case 3:
								case 4:
									var18 = 0; // L: 2660
									var6 = 100; // L: 2661
									break;
								default:
									var12 = String.format("Unkown game option: %s.", var11.toString()); // L: 2653
									throw new RuntimeException(var12); // L: 2654
								}
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var18; // L: 2666
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2667
							return 1; // L: 2668
						}
					} else {
						var10 = class91.field1130; // L: 2464
						var11 = class90.field1116; // L: 2465
						var16 = false; // L: 2466
						if (var0 == 3214) { // L: 2467
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2468
							var10 = (class91)class356.findEnumerated(Friend.method8300(), var6); // L: 2469
							if (var10 == null) { // L: 2470
								throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2471
							}
						}

						if (var0 == 3215) { // L: 2474
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2475
							var11 = (class90)class356.findEnumerated(class207.method4106(), var6); // L: 2476
							if (var11 == null) { // L: 2477
								throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2478
							}
						}

						if (var0 == 3210) { // L: 2481
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2482
							var10 = (class91)class356.findEnumerated(Friend.method8300(), var6); // L: 2483
							if (var10 == null) { // L: 2484
								var11 = (class90)class356.findEnumerated(class207.method4106(), var6); // L: 2485
								if (var11 == null) { // L: 2486
									throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2487
								}
							}
						} else if (var0 == 3182) { // L: 2491
							var10 = class91.field1128; // L: 2492
						} else if (var0 == 3204) { // L: 2494
							var11 = class90.field1122; // L: 2495
						} else if (var0 == 3206) { // L: 2497
							var11 = class90.field1117; // L: 2498
						} else if (var0 == 3208) { // L: 2500
							var11 = class90.field1118; // L: 2501
						}

						if (var11 == class90.field1116) { // L: 2503
							switch(var10.field1129) { // L: 2504
							case 1:
								var5 = class30.clientPreferences.method2533() ? 1 : 0; // L: 2507
								break;
							case 2:
								var5 = class30.clientPreferences.method2580() ? 1 : 0; // L: 2512
								break; // L: 2513
							case 3:
								var5 = class30.clientPreferences.method2637() ? 1 : 0; // L: 2522
								break; // L: 2523
							case 4:
								var5 = class30.clientPreferences.method2526(); // L: 2527
								break; // L: 2528
							case 5:
								var5 = Frames.method5635(); // L: 2532
								break; // L: 2533
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2517
								throw new RuntimeException(var14); // L: 2518
							}
						} else {
							switch(var11.field1120) { // L: 2538
							case 1:
								var5 = class30.clientPreferences.method2635() ? 1 : 0; // L: 2552
								break; // L: 2553
							case 2:
								var6 = class30.clientPreferences.method2544(); // L: 2563
								var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2564
								break;
							case 3:
								var6 = class30.clientPreferences.method2622(); // L: 2557
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2558
								break; // L: 2559
							case 4:
								var6 = class30.clientPreferences.method2572(); // L: 2541
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2542
								break; // L: 2543
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2547
								throw new RuntimeException(var14); // L: 2548
							}
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 2569
						return 1; // L: 2570
					}
				} else {
					var10 = class91.field1130; // L: 2352
					var11 = class90.field1116; // L: 2353
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2354
					if (var0 == 3212) { // L: 2355
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2356
						var10 = (class91)class356.findEnumerated(Friend.method8300(), var6); // L: 2357
						if (var10 == null) { // L: 2358
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2359
						}
					}

					if (var0 == 3213) { // L: 2362
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2363
						var11 = (class90)class356.findEnumerated(class207.method4106(), var6); // L: 2364
						if (var11 == null) { // L: 2365
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2366
						}
					}

					if (var0 == 3209) { // L: 2369
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2370
						var10 = (class91)class356.findEnumerated(Friend.method8300(), var6); // L: 2371
						if (var10 == null) { // L: 2372
							var11 = (class90)class356.findEnumerated(class207.method4106(), var6); // L: 2373
							if (var11 == null) { // L: 2374
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2375
							}
						}
					} else if (var0 == 3181) { // L: 2379
						var10 = class91.field1128; // L: 2380
					} else if (var0 == 3203) { // L: 2382
						var11 = class90.field1122; // L: 2383
					} else if (var0 == 3205) { // L: 2385
						var11 = class90.field1117; // L: 2386
					} else if (var0 == 3207) { // L: 2388
						var11 = class90.field1118; // L: 2389
					}

					if (var11 == class90.field1116) { // L: 2391
						switch(var10.field1129) { // L: 2392
						case 1:
							class30.clientPreferences.method2532(var5 == 1); // L: 2405
							break; // L: 2406
						case 2:
							class30.clientPreferences.method2534(var5 == 1); // L: 2395
							break;
						case 3:
							class30.clientPreferences.method2563(var5 == 1); // L: 2410
							break; // L: 2411
						case 4:
							if (var5 < 0) { // L: 2420
								var5 = 0;
							}

							class30.clientPreferences.method2564(var5); // L: 2421
							break; // L: 2422
						case 5:
							class182.method3660(var5); // L: 2415
							break; // L: 2416
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2400
							throw new RuntimeException(var14); // L: 2401
						}
					} else {
						switch(var11.field1120) { // L: 2427
						case 1:
							class30.clientPreferences.method2530(var5 == 1); // L: 2437
							break; // L: 2438
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2430
							var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2431
							SpriteMask.method6399(var6); // L: 2432
							break; // L: 2433
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2449
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2450
							SoundCache.method831(var6); // L: 2451
							break; // L: 2452
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2442
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2443
							class222.method4344(var6); // L: 2444
							break; // L: 2445
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2456
							throw new RuntimeException(var14); // L: 2457
						}
					}

					return 1; // L: 2461
				}
			}
		}
	}
}
