import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jr")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("aw")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1275203471
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -903634309
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("am")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 723197887
	)
	static int field2754;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1007308985
	)
	static int field2755;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 807277257
	)
	static int field2756;
	@ObfuscatedName("ah")
	public static short[] field2762;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1228596433
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("aa")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Llo;",
		garbageValue = "719974539"
	)
	public static class296[] method4947() {
		return new class296[]{class296.field3198, class296.field3194, class296.field3195, class296.field3193, class296.field3197, class296.field3203, class296.field3199, class296.field3200, class296.field3196, class296.field3202, class296.field3201};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-900202219"
	)
	public static int method4930(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lrj;",
		garbageValue = "1976955779"
	)
	public static class450 method4940() {
		synchronized(class450.field4734) { // L: 28
			if (class344.field3852 == 0) { // L: 29
				return new class450();
			} else {
				class450.field4734[--class344.field3852].method8223(); // L: 31
				return class450.field4734[class344.field3852]; // L: 32
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-604436276"
	)
	static int method4923(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2285
			Interpreter.Interpreter_intStackSize -= 3; // L: 2286
			class17.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 2287
			return 1; // L: 2288
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2290
				Interpreter.Interpreter_intStackSize -= 5; // L: 2291
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2292
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2293
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2294
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2295
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 2296
				ArrayList var15 = new ArrayList(); // L: 2297
				var15.add(var3); // L: 2298
				ObjectComposition.method3963(var15, var4, var5, var6, var7); // L: 2299
				return 1; // L: 2300
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2302
				Interpreter.Interpreter_intStackSize -= 2; // L: 2303
				Interpreter.method1995(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 2304
				return 1; // L: 2305
			} else {
				class90 var10;
				class89 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2307
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2419
						if (var0 == 3211) { // L: 2528
							return 1; // L: 2529
						} else if (var0 == 3216) { // L: 2531
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2532
							var4 = 0; // L: 2533
							class90 var19 = (class90)ClientPreferences.findEnumerated(class1.method10(), var3); // L: 2534
							if (var19 != null) { // L: 2535
								var4 = var19 != class90.field1100 ? 1 : 0; // L: 2536
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 2538
							return 1; // L: 2539
						} else if (var0 == 3218) { // L: 2541
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2542
							var4 = 0; // L: 2543
							class89 var13 = (class89)ClientPreferences.findEnumerated(FontName.method8742(), var3); // L: 2544
							if (var13 != null) { // L: 2545
								var4 = var13 != class89.field1097 ? 1 : 0; // L: 2546
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 2548
							return 1; // L: 2549
						} else if (var0 != 3217 && var0 != 3219) { // L: 2551
							if (var0 == 3220) { // L: 2626
								Interpreter.Interpreter_intStackSize -= 2; // L: 2627
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2628
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2629
								RouteStrategy.method4227(var3, var4); // L: 2630
								return 1; // L: 2631
							} else if (var0 == 3221) { // L: 2633
								Interpreter.Interpreter_intStackSize -= 6; // L: 2634
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2635
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2636
								var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2637
								var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2638
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 2639
								int var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 2640
								ArrayList var9 = new ArrayList(); // L: 2641
								var9.add(var3); // L: 2642
								var9.add(var4); // L: 2643
								ObjectComposition.method3963(var9, var5, var6, var7, var8); // L: 2644
								return 1; // L: 2645
							} else if (var0 == 3222) { // L: 2647
								Interpreter.Interpreter_intStackSize -= 4; // L: 2648
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2649
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2650
								var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2651
								var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2652
								class452.method8324(var3, var4, var5, var6); // L: 2653
								return 1; // L: 2654
							} else {
								return 2; // L: 2656
							}
						} else {
							var10 = class90.field1100; // L: 2552
							var11 = class89.field1097; // L: 2553
							var16 = true; // L: 2554
							boolean var17 = true; // L: 2555
							if (var0 == 3217) { // L: 2556
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2557
								var10 = (class90)ClientPreferences.findEnumerated(class1.method10(), var7); // L: 2558
								if (var10 == null) { // L: 2559
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2560
								}
							}

							if (var0 == 3219) { // L: 2563
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2564
								var11 = (class89)ClientPreferences.findEnumerated(FontName.method8742(), var7); // L: 2565
								if (var11 == null) { // L: 2566
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2567
								}
							}

							String var12;
							byte var18;
							if (var11 == class89.field1097) { // L: 2570
								switch(var10.field1104) { // L: 2571
								case 1:
								case 2:
								case 3:
									var18 = 0; // L: 2576
									var6 = 1; // L: 2577
									break;
								case 4:
									var18 = 0; // L: 2582
									var6 = Integer.MAX_VALUE; // L: 2583
									break; // L: 2584
								case 5:
									var18 = 0; // L: 2593
									var6 = 100; // L: 2594
									break; // L: 2595
								default:
									var12 = String.format("Unkown device option: %s.", var10.toString()); // L: 2588
									throw new RuntimeException(var12); // L: 2589
								}
							} else {
								switch(var11.field1094) { // L: 2600
								case 1:
									var18 = 0; // L: 2603
									var6 = 1; // L: 2604
									break; // L: 2605
								case 2:
								case 3:
								case 4:
									var18 = 0; // L: 2611
									var6 = 100; // L: 2612
									break; // L: 2613
								default:
									var12 = String.format("Unkown game option: %s.", var11.toString()); // L: 2617
									throw new RuntimeException(var12); // L: 2618
								}
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var18; // L: 2622
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2623
							return 1; // L: 2624
						}
					} else {
						var10 = class90.field1100; // L: 2420
						var11 = class89.field1097; // L: 2421
						var16 = false; // L: 2422
						if (var0 == 3214) { // L: 2423
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2424
							var10 = (class90)ClientPreferences.findEnumerated(class1.method10(), var6); // L: 2425
							if (var10 == null) { // L: 2426
								throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2427
							}
						}

						if (var0 == 3215) { // L: 2430
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2431
							var11 = (class89)ClientPreferences.findEnumerated(FontName.method8742(), var6); // L: 2432
							if (var11 == null) { // L: 2433
								throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2434
							}
						}

						if (var0 == 3210) { // L: 2437
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2438
							var10 = (class90)ClientPreferences.findEnumerated(class1.method10(), var6); // L: 2439
							if (var10 == null) { // L: 2440
								var11 = (class89)ClientPreferences.findEnumerated(FontName.method8742(), var6); // L: 2441
								if (var11 == null) { // L: 2442
									throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2443
								}
							}
						} else if (var0 == 3182) { // L: 2447
							var10 = class90.field1103; // L: 2448
						} else if (var0 == 3204) { // L: 2450
							var11 = class89.field1091; // L: 2451
						} else if (var0 == 3206) { // L: 2453
							var11 = class89.field1093; // L: 2454
						} else if (var0 == 3208) { // L: 2456
							var11 = class89.field1089; // L: 2457
						}

						if (var11 == class89.field1097) { // L: 2459
							switch(var10.field1104) { // L: 2460
							case 1:
								var5 = class150.clientPreferences.method2467() ? 1 : 0; // L: 2473
								break; // L: 2474
							case 2:
								var5 = class150.clientPreferences.method2469() ? 1 : 0; // L: 2483
								break; // L: 2484
							case 3:
								var5 = class150.clientPreferences.method2546() ? 1 : 0; // L: 2463
								break;
							case 4:
								var5 = class150.clientPreferences.method2461(); // L: 2468
								break; // L: 2469
							case 5:
								var5 = JagexCache.method3521(); // L: 2488
								break; // L: 2489
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2478
								throw new RuntimeException(var14); // L: 2479
							}
						} else {
							switch(var11.field1094) { // L: 2494
							case 1:
								var5 = class150.clientPreferences.method2465() ? 1 : 0; // L: 2509
								break; // L: 2510
							case 2:
								var6 = class150.clientPreferences.method2478(); // L: 2514
								var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2515
								break; // L: 2516
							case 3:
								var6 = class150.clientPreferences.method2480(); // L: 2497
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2498
								break; // L: 2499
							case 4:
								var6 = class150.clientPreferences.method2481(); // L: 2503
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2504
								break; // L: 2505
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2520
								throw new RuntimeException(var14); // L: 2521
							}
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 2525
						return 1; // L: 2526
					}
				} else {
					var10 = class90.field1100; // L: 2308
					var11 = class89.field1097; // L: 2309
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2310
					if (var0 == 3212) { // L: 2311
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2312
						var10 = (class90)ClientPreferences.findEnumerated(class1.method10(), var6); // L: 2313
						if (var10 == null) { // L: 2314
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2315
						}
					}

					if (var0 == 3213) { // L: 2318
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2319
						var11 = (class89)ClientPreferences.findEnumerated(FontName.method8742(), var6); // L: 2320
						if (var11 == null) { // L: 2321
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2322
						}
					}

					if (var0 == 3209) { // L: 2325
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2326
						var10 = (class90)ClientPreferences.findEnumerated(class1.method10(), var6); // L: 2327
						if (var10 == null) { // L: 2328
							var11 = (class89)ClientPreferences.findEnumerated(FontName.method8742(), var6); // L: 2329
							if (var11 == null) { // L: 2330
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2331
							}
						}
					} else if (var0 == 3181) { // L: 2335
						var10 = class90.field1103; // L: 2336
					} else if (var0 == 3203) { // L: 2338
						var11 = class89.field1091; // L: 2339
					} else if (var0 == 3205) { // L: 2341
						var11 = class89.field1093; // L: 2342
					} else if (var0 == 3207) { // L: 2344
						var11 = class89.field1089; // L: 2345
					}

					if (var11 == class89.field1097) { // L: 2347
						switch(var10.field1104) { // L: 2348
						case 1:
							class150.clientPreferences.method2529(var5 == 1); // L: 2366
							break; // L: 2367
						case 2:
							class150.clientPreferences.method2468(var5 == 1); // L: 2377
							break;
						case 3:
							class150.clientPreferences.method2519(var5 == 1); // L: 2351
							break;
						case 4:
							if (var5 < 0) { // L: 2371
								var5 = 0;
							}

							class150.clientPreferences.method2473(var5); // L: 2372
							break; // L: 2373
						case 5:
							UrlRequester.method2823(var5); // L: 2356
							break; // L: 2357
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2361
							throw new RuntimeException(var14); // L: 2362
						}
					} else {
						switch(var11.field1094) { // L: 2383
						case 1:
							class150.clientPreferences.method2464(var5 == 1); // L: 2393
							break; // L: 2394
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2410
							var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2411
							StudioGame.method6652(var6); // L: 2412
							break; // L: 2413
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2403
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2404
							FriendsChatMember.method7938(var6); // L: 2405
							break; // L: 2406
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2386
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2387
							Interpreter.method1966(var6); // L: 2388
							break; // L: 2389
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2398
							throw new RuntimeException(var14); // L: 2399
						}
					}

					return 1; // L: 2417
				}
			}
		}
	}
}
