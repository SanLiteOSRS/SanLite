import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ep")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("ak")
	static String[] field1458;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -1520919717
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;I)I",
		garbageValue = "-1967044104"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-499305472"
	)
	static int method2972(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2329
			UserComparator6.Interpreter_intStackSize -= 3; // L: 2330
			class365.queueSoundEffect(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]); // L: 2331
			return 1; // L: 2332
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2334
				UserComparator6.Interpreter_intStackSize -= 5; // L: 2335
				var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 2336
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2337
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 2338
				var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3]; // L: 2339
				var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 4]; // L: 2340
				ArrayList var15 = new ArrayList(); // L: 2341
				var15.add(var3); // L: 2342
				Skills.method6928(var15, var4, var5, var6, var7); // L: 2343
				return 1; // L: 2344
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2346
				UserComparator6.Interpreter_intStackSize -= 2; // L: 2347
				class405.method7552(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]); // L: 2348
				return 1; // L: 2349
			} else {
				class90 var10;
				class89 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2351
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2463
						if (var0 == 3211) { // L: 2572
							return 1; // L: 2573
						} else if (var0 == 3216) { // L: 2575
							var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2576
							var4 = 0; // L: 2577
							class90 var19 = (class90)GrandExchangeEvents.findEnumerated(class1.method6(), var3); // L: 2578
							if (var19 != null) { // L: 2579
								var4 = var19 != class90.field1090 ? 1 : 0; // L: 2580
							}

							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4; // L: 2582
							return 1; // L: 2583
						} else if (var0 == 3218) { // L: 2585
							var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2586
							var4 = 0; // L: 2587
							class89 var13 = (class89)GrandExchangeEvents.findEnumerated(ChatChannel.method2271(), var3); // L: 2588
							if (var13 != null) { // L: 2589
								var4 = var13 != class89.field1082 ? 1 : 0; // L: 2590
							}

							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4; // L: 2592
							return 1; // L: 2593
						} else if (var0 != 3217 && var0 != 3219) { // L: 2595
							if (var0 == 3220) { // L: 2670
								UserComparator6.Interpreter_intStackSize -= 2; // L: 2671
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 2672
								var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2673
								Actor.method2488(var3, var4); // L: 2674
								return 1; // L: 2675
							} else if (var0 == 3221) { // L: 2677
								UserComparator6.Interpreter_intStackSize -= 6; // L: 2678
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 2679
								var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2680
								var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 2681
								var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3]; // L: 2682
								var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 4]; // L: 2683
								int var8 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 5]; // L: 2684
								ArrayList var9 = new ArrayList(); // L: 2685
								var9.add(var3); // L: 2686
								var9.add(var4); // L: 2687
								Skills.method6928(var9, var5, var6, var7, var8); // L: 2688
								return 1; // L: 2689
							} else if (var0 == 3222) { // L: 2691
								UserComparator6.Interpreter_intStackSize -= 4; // L: 2692
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 2693
								var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2694
								var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 2695
								var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3]; // L: 2696
								FriendSystem.method1927(var3, var4, var5, var6); // L: 2697
								return 1; // L: 2698
							} else {
								return 2; // L: 2700
							}
						} else {
							var10 = class90.field1090; // L: 2596
							var11 = class89.field1082; // L: 2597
							var16 = true; // L: 2598
							boolean var17 = true; // L: 2599
							if (var0 == 3217) { // L: 2600
								var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2601
								var10 = (class90)GrandExchangeEvents.findEnumerated(class1.method6(), var7); // L: 2602
								if (var10 == null) { // L: 2603
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2604
								}
							}

							if (var0 == 3219) { // L: 2607
								var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2608
								var11 = (class89)GrandExchangeEvents.findEnumerated(ChatChannel.method2271(), var7); // L: 2609
								if (var11 == null) { // L: 2610
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2611
								}
							}

							String var12;
							byte var18;
							if (var11 == class89.field1082) { // L: 2614
								switch(var10.field1093) { // L: 2615
								case 1:
								case 2:
								case 3:
									var18 = 0; // L: 2637
									var6 = 1; // L: 2638
									break; // L: 2639
								case 4:
									var18 = 0; // L: 2629
									var6 = Integer.MAX_VALUE; // L: 2630
									break; // L: 2631
								case 5:
									var18 = 0; // L: 2623
									var6 = 100; // L: 2624
									break;
								default:
									var12 = String.format("Unkown device option: %s.", var10.toString()); // L: 2618
									throw new RuntimeException(var12); // L: 2619
								}
							} else {
								switch(var11.field1083) { // L: 2644
								case 1:
									var18 = 0; // L: 2652
									var6 = 1; // L: 2653
									break; // L: 2654
								case 2:
								case 3:
								case 4:
									var18 = 0; // L: 2660
									var6 = 100; // L: 2661
									break;
								default:
									var12 = String.format("Unkown game option: %s.", var11.toString()); // L: 2647
									throw new RuntimeException(var12); // L: 2648
								}
							}

							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var18; // L: 2666
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6; // L: 2667
							return 1; // L: 2668
						}
					} else {
						var10 = class90.field1090; // L: 2464
						var11 = class89.field1082; // L: 2465
						var16 = false; // L: 2466
						if (var0 == 3214) { // L: 2467
							var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2468
							var10 = (class90)GrandExchangeEvents.findEnumerated(class1.method6(), var6); // L: 2469
							if (var10 == null) { // L: 2470
								throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2471
							}
						}

						if (var0 == 3215) { // L: 2474
							var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2475
							var11 = (class89)GrandExchangeEvents.findEnumerated(ChatChannel.method2271(), var6); // L: 2476
							if (var11 == null) { // L: 2477
								throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2478
							}
						}

						if (var0 == 3210) { // L: 2481
							var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2482
							var10 = (class90)GrandExchangeEvents.findEnumerated(class1.method6(), var6); // L: 2483
							if (var10 == null) { // L: 2484
								var11 = (class89)GrandExchangeEvents.findEnumerated(ChatChannel.method2271(), var6); // L: 2485
								if (var11 == null) { // L: 2486
									throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2487
								}
							}
						} else if (var0 == 3182) { // L: 2491
							var10 = class90.field1092; // L: 2492
						} else if (var0 == 3204) { // L: 2494
							var11 = class89.field1080; // L: 2495
						} else if (var0 == 3206) { // L: 2497
							var11 = class89.field1085; // L: 2498
						} else if (var0 == 3208) { // L: 2500
							var11 = class89.field1078; // L: 2501
						}

						if (var11 == class89.field1082) { // L: 2503
							switch(var10.field1093) { // L: 2504
							case 1:
								var5 = class93.clientPreferences.method2619() ? 1 : 0; // L: 2507
								break;
							case 2:
								var5 = class93.clientPreferences.method2546() ? 1 : 0; // L: 2532
								break; // L: 2533
							case 3:
								var5 = class93.clientPreferences.method2541() ? 1 : 0; // L: 2517
								break; // L: 2518
							case 4:
								var5 = class93.clientPreferences.method2543(); // L: 2527
								break; // L: 2528
							case 5:
								var5 = class89.method2378(); // L: 2522
								break; // L: 2523
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2512
								throw new RuntimeException(var14); // L: 2513
							}
						} else {
							switch(var11.field1083) { // L: 2538
							case 1:
								var5 = class93.clientPreferences.method2535() ? 1 : 0; // L: 2541
								break; // L: 2542
							case 2:
								var6 = class93.clientPreferences.method2597(); // L: 2551
								var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2552
								break; // L: 2553
							case 3:
								var6 = class93.clientPreferences.method2549(); // L: 2557
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2558
								break; // L: 2559
							case 4:
								var6 = class93.clientPreferences.method2551(); // L: 2563
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2564
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2546
								throw new RuntimeException(var14); // L: 2547
							}
						}

						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5; // L: 2569
						return 1; // L: 2570
					}
				} else {
					var10 = class90.field1090; // L: 2352
					var11 = class89.field1082; // L: 2353
					var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2354
					if (var0 == 3212) { // L: 2355
						var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2356
						var10 = (class90)GrandExchangeEvents.findEnumerated(class1.method6(), var6); // L: 2357
						if (var10 == null) { // L: 2358
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2359
						}
					}

					if (var0 == 3213) { // L: 2362
						var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2363
						var11 = (class89)GrandExchangeEvents.findEnumerated(ChatChannel.method2271(), var6); // L: 2364
						if (var11 == null) { // L: 2365
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2366
						}
					}

					if (var0 == 3209) { // L: 2369
						var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2370
						var10 = (class90)GrandExchangeEvents.findEnumerated(class1.method6(), var6); // L: 2371
						if (var10 == null) { // L: 2372
							var11 = (class89)GrandExchangeEvents.findEnumerated(ChatChannel.method2271(), var6); // L: 2373
							if (var11 == null) { // L: 2374
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2375
							}
						}
					} else if (var0 == 3181) { // L: 2379
						var10 = class90.field1092; // L: 2380
					} else if (var0 == 3203) { // L: 2382
						var11 = class89.field1080; // L: 2383
					} else if (var0 == 3205) { // L: 2385
						var11 = class89.field1085; // L: 2386
					} else if (var0 == 3207) { // L: 2388
						var11 = class89.field1078; // L: 2389
					}

					if (var11 == class89.field1082) { // L: 2391
						switch(var10.field1093) { // L: 2392
						case 1:
							class93.clientPreferences.method2536(var5 == 1); // L: 2395
							break;
						case 2:
							class93.clientPreferences.method2589(var5 == 1); // L: 2415
							break; // L: 2416
						case 3:
							class93.clientPreferences.method2568(var5 == 1); // L: 2410
							break; // L: 2411
						case 4:
							if (var5 < 0) { // L: 2420
								var5 = 0;
							}

							class93.clientPreferences.method2542(var5); // L: 2421
							break; // L: 2422
						case 5:
							Huffman.method6901(var5); // L: 2405
							break; // L: 2406
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2400
							throw new RuntimeException(var14); // L: 2401
						}
					} else {
						switch(var11.field1083) { // L: 2427
						case 1:
							class93.clientPreferences.method2577(var5 == 1); // L: 2449
							break; // L: 2450
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2430
							var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2431
							class401.method7500(var6); // L: 2432
							break; // L: 2433
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2442
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2443
							Canvas.method327(var6); // L: 2444
							break; // L: 2445
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2454
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2455
							class165.method3515(var6); // L: 2456
							break; // L: 2457
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2437
							throw new RuntimeException(var14); // L: 2438
						}
					}

					return 1; // L: 2461
				}
			}
		}
	}
}
