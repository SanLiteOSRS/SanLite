import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ge")
public class class159 extends class144 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 8389243064566270675L
	)
	long field1743;
	@ObfuscatedName("ah")
	String field1746;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1871625717
	)
	int field1744;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class159(class147 var1) {
		this.this$0 = var1;
		this.field1743 = -1L; // L: 93
		this.field1746 = null; // L: 94
		this.field1744 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1743 = var1.readLong(); // L: 102
		}

		this.field1746 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1744 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3327(this.field1743, this.field1746, this.field1744); // L: 109
	} // L: 110

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
	)
	static void method3426() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 44
			if (var0.obj != null) { // L: 45
				var0.set();
			}
		}

	} // L: 47

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "404161563"
	)
	static int method3416(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2298
			class517.Interpreter_intStackSize -= 3; // L: 2299
			class460.queueSoundEffect(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]); // L: 2300
			return 1; // L: 2301
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2303
				class517.Interpreter_intStackSize -= 5; // L: 2304
				var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 2305
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2306
				var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 2307
				var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 3]; // L: 2308
				var7 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 4]; // L: 2309
				ArrayList var15 = new ArrayList(); // L: 2310
				var15.add(var3); // L: 2311
				class135.method3152(var15, var4, var5, var6, var7); // L: 2312
				return 1; // L: 2313
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2315
				class517.Interpreter_intStackSize -= 2; // L: 2316
				FileSystem.method4224(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]); // L: 2317
				return 1; // L: 2318
			} else {
				class90 var10;
				class89 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2320
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2432
						if (var0 == 3211) { // L: 2541
							return 1; // L: 2542
						} else if (var0 == 3216) { // L: 2544
							var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2545
							var4 = 0; // L: 2546
							class90 var19 = (class90)class12.findEnumerated(UserComparator3.method2985(), var3); // L: 2547
							if (var19 != null) { // L: 2548
								var4 = var19 != class90.field1092 ? 1 : 0; // L: 2549
							}

							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4; // L: 2551
							return 1; // L: 2552
						} else if (var0 == 3218) { // L: 2554
							var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2555
							var4 = 0; // L: 2556
							class89 var13 = (class89)class12.findEnumerated(HealthBar.method2656(), var3); // L: 2557
							if (var13 != null) { // L: 2558
								var4 = var13 != class89.field1077 ? 1 : 0; // L: 2559
							}

							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4; // L: 2561
							return 1; // L: 2562
						} else if (var0 != 3217 && var0 != 3219) { // L: 2564
							if (var0 == 3220) { // L: 2639
								class517.Interpreter_intStackSize -= 2; // L: 2640
								var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 2641
								var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2642
								WorldMapManager.method4769(var3, var4); // L: 2643
								return 1; // L: 2644
							} else if (var0 == 3221) { // L: 2646
								class517.Interpreter_intStackSize -= 6; // L: 2647
								var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 2648
								var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2649
								var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 2650
								var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 3]; // L: 2651
								var7 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 4]; // L: 2652
								int var8 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 5]; // L: 2653
								ArrayList var9 = new ArrayList(); // L: 2654
								var9.add(var3); // L: 2655
								var9.add(var4); // L: 2656
								class135.method3152(var9, var5, var6, var7, var8); // L: 2657
								return 1; // L: 2658
							} else if (var0 == 3222) { // L: 2660
								class517.Interpreter_intStackSize -= 4; // L: 2661
								var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 2662
								var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2663
								var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 2664
								var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 3]; // L: 2665
								class191.method3758(var3, var4, var5, var6); // L: 2666
								return 1; // L: 2667
							} else {
								return 2; // L: 2669
							}
						} else {
							var10 = class90.field1092; // L: 2565
							var11 = class89.field1077; // L: 2566
							var16 = true; // L: 2567
							boolean var17 = true; // L: 2568
							if (var0 == 3217) { // L: 2569
								var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2570
								var10 = (class90)class12.findEnumerated(UserComparator3.method2985(), var7); // L: 2571
								if (var10 == null) { // L: 2572
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2573
								}
							}

							if (var0 == 3219) { // L: 2576
								var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2577
								var11 = (class89)class12.findEnumerated(HealthBar.method2656(), var7); // L: 2578
								if (var11 == null) { // L: 2579
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2580
								}
							}

							String var12;
							byte var18;
							if (var11 == class89.field1077) { // L: 2583
								switch(var10.field1089) { // L: 2584
								case 1:
								case 2:
								case 3:
									var18 = 0; // L: 2600
									var6 = 1; // L: 2601
									break; // L: 2602
								case 4:
									var18 = 0; // L: 2592
									var6 = Integer.MAX_VALUE; // L: 2593
									break;
								case 5:
									var18 = 0; // L: 2606
									var6 = 100; // L: 2607
									break; // L: 2608
								default:
									var12 = String.format("Unkown device option: %s.", var10.toString()); // L: 2587
									throw new RuntimeException(var12); // L: 2588
								}
							} else {
								switch(var11.field1076) { // L: 2613
								case 1:
									var18 = 0; // L: 2616
									var6 = 1; // L: 2617
									break; // L: 2618
								case 2:
								case 3:
								case 4:
									var18 = 0; // L: 2624
									var6 = 100; // L: 2625
									break; // L: 2626
								default:
									var12 = String.format("Unkown game option: %s.", var11.toString()); // L: 2630
									throw new RuntimeException(var12); // L: 2631
								}
							}

							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var18; // L: 2635
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var6; // L: 2636
							return 1; // L: 2637
						}
					} else {
						var10 = class90.field1092; // L: 2433
						var11 = class89.field1077; // L: 2434
						var16 = false; // L: 2435
						if (var0 == 3214) { // L: 2436
							var6 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2437
							var10 = (class90)class12.findEnumerated(UserComparator3.method2985(), var6); // L: 2438
							if (var10 == null) { // L: 2439
								throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2440
							}
						}

						if (var0 == 3215) { // L: 2443
							var6 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2444
							var11 = (class89)class12.findEnumerated(HealthBar.method2656(), var6); // L: 2445
							if (var11 == null) { // L: 2446
								throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2447
							}
						}

						if (var0 == 3210) { // L: 2450
							var6 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2451
							var10 = (class90)class12.findEnumerated(UserComparator3.method2985(), var6); // L: 2452
							if (var10 == null) { // L: 2453
								var11 = (class89)class12.findEnumerated(HealthBar.method2656(), var6); // L: 2454
								if (var11 == null) { // L: 2455
									throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2456
								}
							}
						} else if (var0 == 3182) { // L: 2460
							var10 = class90.field1086; // L: 2461
						} else if (var0 == 3204) { // L: 2463
							var11 = class89.field1071; // L: 2464
						} else if (var0 == 3206) { // L: 2466
							var11 = class89.field1081; // L: 2467
						} else if (var0 == 3208) { // L: 2469
							var11 = class89.field1075; // L: 2470
						}

						if (var11 == class89.field1077) { // L: 2472
							switch(var10.field1089) { // L: 2473
							case 1:
								var5 = WorldMapIcon_1.clientPreferences.method2543() ? 1 : 0; // L: 2486
								break; // L: 2487
							case 2:
								var5 = WorldMapIcon_1.clientPreferences.method2631() ? 1 : 0; // L: 2501
								break; // L: 2502
							case 3:
								var5 = WorldMapIcon_1.clientPreferences.method2608() ? 1 : 0; // L: 2476
								break;
							case 4:
								var5 = WorldMapIcon_1.clientPreferences.method2604(); // L: 2491
								break; // L: 2492
							case 5:
								var5 = class216.method4235(); // L: 2496
								break; // L: 2497
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2481
								throw new RuntimeException(var14); // L: 2482
							}
						} else {
							switch(var11.field1076) { // L: 2507
							case 1:
								var5 = WorldMapIcon_1.clientPreferences.method2541() ? 1 : 0; // L: 2527
								break; // L: 2528
							case 2:
								var6 = WorldMapIcon_1.clientPreferences.method2554(); // L: 2510
								var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2511
								break; // L: 2512
							case 3:
								var6 = WorldMapIcon_1.clientPreferences.method2556(); // L: 2516
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2517
								break; // L: 2518
							case 4:
								var6 = WorldMapIcon_1.clientPreferences.method2605(); // L: 2532
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2533
								break; // L: 2534
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2522
								throw new RuntimeException(var14); // L: 2523
							}
						}

						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var5; // L: 2538
						return 1; // L: 2539
					}
				} else {
					var10 = class90.field1092; // L: 2321
					var11 = class89.field1077; // L: 2322
					var5 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2323
					if (var0 == 3212) { // L: 2324
						var6 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2325
						var10 = (class90)class12.findEnumerated(UserComparator3.method2985(), var6); // L: 2326
						if (var10 == null) { // L: 2327
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2328
						}
					}

					if (var0 == 3213) { // L: 2331
						var6 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2332
						var11 = (class89)class12.findEnumerated(HealthBar.method2656(), var6); // L: 2333
						if (var11 == null) { // L: 2334
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2335
						}
					}

					if (var0 == 3209) { // L: 2338
						var6 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2339
						var10 = (class90)class12.findEnumerated(UserComparator3.method2985(), var6); // L: 2340
						if (var10 == null) { // L: 2341
							var11 = (class89)class12.findEnumerated(HealthBar.method2656(), var6); // L: 2342
							if (var11 == null) { // L: 2343
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2344
							}
						}
					} else if (var0 == 3181) { // L: 2348
						var10 = class90.field1086; // L: 2349
					} else if (var0 == 3203) { // L: 2351
						var11 = class89.field1071; // L: 2352
					} else if (var0 == 3205) { // L: 2354
						var11 = class89.field1081; // L: 2355
					} else if (var0 == 3207) { // L: 2357
						var11 = class89.field1075; // L: 2358
					}

					if (var11 == class89.field1077) { // L: 2360
						switch(var10.field1089) { // L: 2361
						case 1:
							WorldMapIcon_1.clientPreferences.method2583(var5 == 1); // L: 2390
							break; // L: 2391
						case 2:
							WorldMapIcon_1.clientPreferences.method2571(var5 == 1); // L: 2380
							break; // L: 2381
						case 3:
							WorldMapIcon_1.clientPreferences.method2546(var5 == 1); // L: 2385
							break; // L: 2386
						case 4:
							if (var5 < 0) { // L: 2364
								var5 = 0;
							}

							WorldMapIcon_1.clientPreferences.method2549(var5); // L: 2365
							break;
						case 5:
							class311.method5940(var5); // L: 2375
							break; // L: 2376
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2370
							throw new RuntimeException(var14); // L: 2371
						}
					} else {
						switch(var11.field1076) { // L: 2396
						case 1:
							WorldMapIcon_1.clientPreferences.method2540(var5 == 1); // L: 2399
							break; // L: 2400
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2411
							var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2412
							Decimator.method1153(var6); // L: 2413
							break; // L: 2414
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2418
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2419
							SoundSystem.method868(var6); // L: 2420
							break; // L: 2421
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2404
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2405
							Login.method2198(var6); // L: 2406
							break; // L: 2407
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2425
							throw new RuntimeException(var14); // L: 2426
						}
					}

					return 1; // L: 2430
				}
			}
		}
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "227996304"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field557) { // L: 12189
			Client.field708[var0.rootIndex] = true; // L: 12190
		}

	} // L: 12192
}
