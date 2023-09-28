import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fs")
public class class133 implements class386 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class133 field1571;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class133 field1569;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class133 field1563;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class133 field1564;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class133 field1565;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class133 field1566;
	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1289801539
	)
	final int field1567;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 570543627
	)
	final int field1562;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1920225209
	)
	final int field1561;

	static {
		field1571 = new class133(0, 0, (String)null, 0); // L: 14
		field1569 = new class133(1, 1, (String)null, 9); // L: 15
		field1563 = new class133(2, 2, (String)null, 3); // L: 16
		field1564 = new class133(3, 3, (String)null, 6); // L: 17
		field1565 = new class133(4, 4, (String)null, 1); // L: 18
		field1566 = new class133(5, 5, (String)null, 3); // L: 19
	}

	class133(int var1, int var2, String var3, int var4) {
		this.field1567 = var1; // L: 25
		this.field1562 = var2; // L: 26
		this.field1561 = var4; // L: 27
	} // L: 28

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1562; // L: 46
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2025897930"
	)
	int method3048() {
		return this.field1561; // L: 41
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1116623065"
	)
	static final boolean method3059(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 203
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 204
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 205
			if (var7 > var0 && var7 > var1 && var7 > var2) { // L: 206
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 207
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 208
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 209
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 210
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "-605983244"
	)
	public static final void method3060(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 47
			PcmPlayer.field306 = var0; // L: 48
			class306.PcmPlayer_stereo = var1; // L: 49
			class225.field2372 = var2; // L: 50
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 51

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "941581685"
	)
	static int method3058(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2299
			Interpreter.Interpreter_intStackSize -= 3; // L: 2300
			GraphicsDefaults.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 2301
			return 1; // L: 2302
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2304
				Interpreter.Interpreter_intStackSize -= 5; // L: 2305
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2306
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2307
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2308
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2309
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 2310
				ArrayList var15 = new ArrayList(); // L: 2311
				var15.add(var3); // L: 2312
				class202.method3764(var15, var4, var5, var6, var7); // L: 2313
				return 1; // L: 2314
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2316
				Interpreter.Interpreter_intStackSize -= 2; // L: 2317
				class437.method7924(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 2318
				return 1; // L: 2319
			} else {
				class92 var10;
				class91 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2321
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2433
						if (var0 == 3211) { // L: 2542
							return 1; // L: 2543
						} else if (var0 == 3216) { // L: 2545
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2546
							var4 = 0; // L: 2547
							class92 var19 = (class92)SequenceDefinition.findEnumerated(class141.method3128(), var3); // L: 2548
							if (var19 != null) { // L: 2549
								var4 = var19 != class92.field1111 ? 1 : 0; // L: 2550
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 2552
							return 1; // L: 2553
						} else if (var0 == 3218) { // L: 2555
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2556
							var4 = 0; // L: 2557
							class91 var13 = (class91)SequenceDefinition.findEnumerated(class95.method2412(), var3); // L: 2558
							if (var13 != null) { // L: 2559
								var4 = var13 != class91.field1106 ? 1 : 0; // L: 2560
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 2562
							return 1; // L: 2563
						} else if (var0 != 3217 && var0 != 3219) { // L: 2565
							if (var0 == 3220) { // L: 2640
								Interpreter.Interpreter_intStackSize -= 2; // L: 2641
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2642
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2643
								ItemComposition.method4136(var3, var4); // L: 2644
								return 1; // L: 2645
							} else if (var0 == 3221) { // L: 2647
								Interpreter.Interpreter_intStackSize -= 6; // L: 2648
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2649
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2650
								var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2651
								var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2652
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 2653
								int var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 2654
								ArrayList var9 = new ArrayList(); // L: 2655
								var9.add(var3); // L: 2656
								var9.add(var4); // L: 2657
								class202.method3764(var9, var5, var6, var7, var8); // L: 2658
								return 1; // L: 2659
							} else if (var0 == 3222) { // L: 2661
								Interpreter.Interpreter_intStackSize -= 4; // L: 2662
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2663
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2664
								var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2665
								var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2666
								class206.method3837(var3, var4, var5, var6); // L: 2667
								return 1; // L: 2668
							} else {
								return 2; // L: 2670
							}
						} else {
							var10 = class92.field1111; // L: 2566
							var11 = class91.field1106; // L: 2567
							var16 = true; // L: 2568
							boolean var17 = true; // L: 2569
							if (var0 == 3217) { // L: 2570
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2571
								var10 = (class92)SequenceDefinition.findEnumerated(class141.method3128(), var7); // L: 2572
								if (var10 == null) { // L: 2573
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2574
								}
							}

							if (var0 == 3219) { // L: 2577
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2578
								var11 = (class91)SequenceDefinition.findEnumerated(class95.method2412(), var7); // L: 2579
								if (var11 == null) { // L: 2580
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2581
								}
							}

							String var12;
							byte var18;
							if (var11 == class91.field1106) { // L: 2584
								switch(var10.field1114) { // L: 2585
								case 1:
								case 2:
								case 3:
									var18 = 0; // L: 2602
									var6 = 1; // L: 2603
									break; // L: 2604
								case 4:
									var18 = 0; // L: 2588
									var6 = Integer.MAX_VALUE; // L: 2589
									break;
								case 5:
									var18 = 0; // L: 2594
									var6 = 100; // L: 2595
									break; // L: 2596
								default:
									var12 = String.format("Unkown device option: %s.", var10.toString()); // L: 2608
									throw new RuntimeException(var12); // L: 2609
								}
							} else {
								switch(var11.field1101) { // L: 2614
								case 1:
									var18 = 0; // L: 2617
									var6 = 1; // L: 2618
									break; // L: 2619
								case 2:
								case 3:
								case 4:
									var18 = 0; // L: 2630
									var6 = 100; // L: 2631
									break;
								default:
									var12 = String.format("Unkown game option: %s.", var11.toString()); // L: 2623
									throw new RuntimeException(var12); // L: 2624
								}
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var18; // L: 2636
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2637
							return 1; // L: 2638
						}
					} else {
						var10 = class92.field1111; // L: 2434
						var11 = class91.field1106; // L: 2435
						var16 = false; // L: 2436
						if (var0 == 3214) { // L: 2437
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2438
							var10 = (class92)SequenceDefinition.findEnumerated(class141.method3128(), var6); // L: 2439
							if (var10 == null) { // L: 2440
								throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2441
							}
						}

						if (var0 == 3215) { // L: 2444
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2445
							var11 = (class91)SequenceDefinition.findEnumerated(class95.method2412(), var6); // L: 2446
							if (var11 == null) { // L: 2447
								throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2448
							}
						}

						if (var0 == 3210) { // L: 2451
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2452
							var10 = (class92)SequenceDefinition.findEnumerated(class141.method3128(), var6); // L: 2453
							if (var10 == null) { // L: 2454
								var11 = (class91)SequenceDefinition.findEnumerated(class95.method2412(), var6); // L: 2455
								if (var11 == null) { // L: 2456
									throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2457
								}
							}
						} else if (var0 == 3182) { // L: 2461
							var10 = class92.field1113; // L: 2462
						} else if (var0 == 3204) { // L: 2464
							var11 = class91.field1100; // L: 2465
						} else if (var0 == 3206) { // L: 2467
							var11 = class91.field1102; // L: 2468
						} else if (var0 == 3208) { // L: 2470
							var11 = class91.field1107; // L: 2471
						}

						if (var11 == class91.field1106) { // L: 2473
							switch(var10.field1114) { // L: 2474
							case 1:
								var5 = class91.clientPreferences.method2504() ? 1 : 0; // L: 2492
								break; // L: 2493
							case 2:
								var5 = class91.clientPreferences.method2503() ? 1 : 0; // L: 2477
								break;
							case 3:
								var5 = class91.clientPreferences.method2523() ? 1 : 0; // L: 2482
								break; // L: 2483
							case 4:
								var5 = class91.clientPreferences.method2564(); // L: 2487
								break; // L: 2488
							case 5:
								var5 = FaceNormal.method4845(); // L: 2502
								break; // L: 2503
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2497
								throw new RuntimeException(var14); // L: 2498
							}
						} else {
							switch(var11.field1101) { // L: 2508
							case 1:
								var5 = class91.clientPreferences.method2502() ? 1 : 0; // L: 2511
								break; // L: 2512
							case 2:
								var6 = class91.clientPreferences.method2515(); // L: 2516
								var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2517
								break; // L: 2518
							case 3:
								var6 = class91.clientPreferences.method2517(); // L: 2522
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2523
								break; // L: 2524
							case 4:
								var6 = class91.clientPreferences.method2589(); // L: 2528
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2529
								break; // L: 2530
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2534
								throw new RuntimeException(var14); // L: 2535
							}
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 2539
						return 1; // L: 2540
					}
				} else {
					var10 = class92.field1111; // L: 2322
					var11 = class91.field1106; // L: 2323
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2324
					if (var0 == 3212) { // L: 2325
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2326
						var10 = (class92)SequenceDefinition.findEnumerated(class141.method3128(), var6); // L: 2327
						if (var10 == null) { // L: 2328
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2329
						}
					}

					if (var0 == 3213) { // L: 2332
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2333
						var11 = (class91)SequenceDefinition.findEnumerated(class95.method2412(), var6); // L: 2334
						if (var11 == null) { // L: 2335
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2336
						}
					}

					if (var0 == 3209) { // L: 2339
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2340
						var10 = (class92)SequenceDefinition.findEnumerated(class141.method3128(), var6); // L: 2341
						if (var10 == null) { // L: 2342
							var11 = (class91)SequenceDefinition.findEnumerated(class95.method2412(), var6); // L: 2343
							if (var11 == null) { // L: 2344
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2345
							}
						}
					} else if (var0 == 3181) { // L: 2349
						var10 = class92.field1113; // L: 2350
					} else if (var0 == 3203) { // L: 2352
						var11 = class91.field1100; // L: 2353
					} else if (var0 == 3205) { // L: 2355
						var11 = class91.field1102; // L: 2356
					} else if (var0 == 3207) { // L: 2358
						var11 = class91.field1107; // L: 2359
					}

					if (var11 == class91.field1106) { // L: 2361
						switch(var10.field1114) { // L: 2362
						case 1:
							class91.clientPreferences.method2531(var5 == 1); // L: 2375
							break; // L: 2376
						case 2:
							class91.clientPreferences.method2505(var5 == 1); // L: 2370
							break;
						case 3:
							class91.clientPreferences.method2573(var5 == 1); // L: 2391
							break; // L: 2392
						case 4:
							if (var5 < 0) { // L: 2380
								var5 = 0;
							}

							class91.clientPreferences.method2516(var5); // L: 2381
							break; // L: 2382
						case 5:
							FontName.method8851(var5); // L: 2386
							break; // L: 2387
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2365
							throw new RuntimeException(var14); // L: 2366
						}
					} else {
						switch(var11.field1101) { // L: 2397
						case 1:
							class91.clientPreferences.method2558(var5 == 1); // L: 2426
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2419
							var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2420
							JagexCache.method3540(var6); // L: 2421
							break; // L: 2422
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2400
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2401
							FloorOverlayDefinition.method4148(var6); // L: 2402
							break; // L: 2403
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2412
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2413
							class198.method3736(var6); // L: 2414
							break; // L: 2415
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2407
							throw new RuntimeException(var14); // L: 2408
						}
					}

					return 1; // L: 2431
				}
			}
		}
	}
}
