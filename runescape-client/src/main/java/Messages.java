import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ex")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("aj")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2117975007
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -943031545
	)
	static int field1375;
	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("Ignored_cached")
	static class462 Ignored_cached;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "577265757"
	)
	static int method2762(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2259
			Interpreter.Interpreter_intStackSize -= 3; // L: 2260
			Skills.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 2261
			return 1; // L: 2262
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2264
			Language.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 2265
			return 1; // L: 2266
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2268
			Interpreter.Interpreter_intStackSize -= 2; // L: 2269
			class19.method278(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 2270
			return 1; // L: 2271
		} else {
			class88 var3;
			class87 var4;
			int var5;
			int var6;
			String var12;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2273
				boolean var13;
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2385
					if (var0 == 3211) { // L: 2494
						return 1; // L: 2495
					} else {
						int var9;
						int var10;
						if (var0 == 3216) { // L: 2497
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2498
							var10 = 0; // L: 2499
							class88 var16 = (class88)SpriteMask.findEnumerated(ParamComposition.method3791(), var9); // L: 2500
							if (var16 != null) { // L: 2501
								var10 = var16 != class88.field1083 ? 1 : 0; // L: 2502
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var10; // L: 2504
							return 1; // L: 2505
						} else if (var0 == 3218) { // L: 2507
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2508
							var10 = 0; // L: 2509
							class87 var11 = (class87)SpriteMask.findEnumerated(class122.method2896(), var9); // L: 2510
							if (var11 != null) { // L: 2511
								var10 = var11 != class87.field1069 ? 1 : 0; // L: 2512
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var10; // L: 2514
							return 1; // L: 2515
						} else if (var0 != 3217 && var0 != 3219) { // L: 2517
							return 2; // L: 2592
						} else {
							var3 = class88.field1083; // L: 2518
							var4 = class87.field1069; // L: 2519
							var13 = true; // L: 2520
							boolean var14 = true; // L: 2521
							int var7;
							if (var0 == 3217) { // L: 2522
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2523
								var3 = (class88)SpriteMask.findEnumerated(ParamComposition.method3791(), var7); // L: 2524
								if (var3 == null) { // L: 2525
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2526
								}
							}

							if (var0 == 3219) { // L: 2529
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2530
								var4 = (class87)SpriteMask.findEnumerated(class122.method2896(), var7); // L: 2531
								if (var4 == null) { // L: 2532
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2533
								}
							}

							String var8;
							byte var15;
							if (var4 == class87.field1069) { // L: 2536
								switch(var3.field1079) { // L: 2537
								case 1:
								case 2:
								case 3:
									var15 = 0; // L: 2553
									var6 = 1; // L: 2554
									break; // L: 2555
								case 4:
									var15 = 0; // L: 2540
									var6 = Integer.MAX_VALUE; // L: 2541
									break;
								case 5:
									var15 = 0; // L: 2559
									var6 = 100; // L: 2560
									break; // L: 2561
								default:
									var8 = String.format("Unkown device option: %s.", var3.toString()); // L: 2546
									throw new RuntimeException(var8); // L: 2547
								}
							} else {
								switch(var4.field1073) { // L: 2566
								case 1:
									var15 = 0; // L: 2577
									var6 = 1; // L: 2578
									break; // L: 2579
								case 2:
								case 3:
								case 4:
									var15 = 0; // L: 2571
									var6 = 100; // L: 2572
									break; // L: 2573
								default:
									var8 = String.format("Unkown game option: %s.", var4.toString()); // L: 2583
									throw new RuntimeException(var8); // L: 2584
								}
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var15; // L: 2588
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2589
							return 1; // L: 2590
						}
					}
				} else {
					var3 = class88.field1083; // L: 2386
					var4 = class87.field1069; // L: 2387
					var13 = false; // L: 2388
					if (var0 == 3214) { // L: 2389
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2390
						var3 = (class88)SpriteMask.findEnumerated(ParamComposition.method3791(), var6); // L: 2391
						if (var3 == null) { // L: 2392
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2393
						}
					}

					if (var0 == 3215) { // L: 2396
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2397
						var4 = (class87)SpriteMask.findEnumerated(class122.method2896(), var6); // L: 2398
						if (var4 == null) { // L: 2399
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2400
						}
					}

					if (var0 == 3210) { // L: 2403
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2404
						var3 = (class88)SpriteMask.findEnumerated(ParamComposition.method3791(), var6); // L: 2405
						if (var3 == null) { // L: 2406
							var4 = (class87)SpriteMask.findEnumerated(class122.method2896(), var6); // L: 2407
							if (var4 == null) { // L: 2408
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2409
							}
						}
					} else if (var0 == 3182) { // L: 2413
						var3 = class88.field1082; // L: 2414
					} else if (var0 == 3204) { // L: 2416
						var4 = class87.field1070; // L: 2417
					} else if (var0 == 3206) { // L: 2419
						var4 = class87.field1076; // L: 2420
					} else if (var0 == 3208) { // L: 2422
						var4 = class87.field1072; // L: 2423
					}

					if (var4 == class87.field1069) { // L: 2425
						switch(var3.field1079) { // L: 2426
						case 1:
							var5 = WorldMapSectionType.clientPreferences.method2429() ? 1 : 0; // L: 2454
							break; // L: 2455
						case 2:
							var5 = WorldMapSectionType.clientPreferences.method2445() ? 1 : 0; // L: 2444
							break; // L: 2445
						case 3:
							var5 = WorldMapSectionType.clientPreferences.method2426() ? 1 : 0; // L: 2434
							break;
						case 4:
							var5 = WorldMapSectionType.clientPreferences.method2529(); // L: 2449
							break; // L: 2450
						case 5:
							var5 = NetCache.method6534(); // L: 2439
							break; // L: 2440
						default:
							var12 = String.format("Unkown device option: %s.", var3.toString()); // L: 2429
							throw new RuntimeException(var12); // L: 2430
						}
					} else {
						switch(var4.field1073) { // L: 2460
						case 1:
							var5 = WorldMapSectionType.clientPreferences.method2458() ? 1 : 0; // L: 2480
							break; // L: 2481
						case 2:
							var6 = WorldMapSectionType.clientPreferences.method2440(); // L: 2474
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2475
							break; // L: 2476
						case 3:
							var6 = WorldMapSectionType.clientPreferences.method2442(); // L: 2485
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2486
							break; // L: 2487
						case 4:
							var6 = WorldMapSectionType.clientPreferences.method2463(); // L: 2463
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2464
							break; // L: 2465
						default:
							var12 = String.format("Unkown game option: %s.", var4.toString()); // L: 2469
							throw new RuntimeException(var12); // L: 2470
						}
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 2491
					return 1; // L: 2492
				}
			} else {
				var3 = class88.field1083; // L: 2274
				var4 = class87.field1069; // L: 2275
				var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2276
				if (var0 == 3212) { // L: 2277
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2278
					var3 = (class88)SpriteMask.findEnumerated(ParamComposition.method3791(), var6); // L: 2279
					if (var3 == null) { // L: 2280
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2281
					}
				}

				if (var0 == 3213) { // L: 2284
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2285
					var4 = (class87)SpriteMask.findEnumerated(class122.method2896(), var6); // L: 2286
					if (var4 == null) { // L: 2287
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2288
					}
				}

				if (var0 == 3209) { // L: 2291
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2292
					var3 = (class88)SpriteMask.findEnumerated(ParamComposition.method3791(), var6); // L: 2293
					if (var3 == null) { // L: 2294
						var4 = (class87)SpriteMask.findEnumerated(class122.method2896(), var6); // L: 2295
						if (var4 == null) { // L: 2296
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2297
						}
					}
				} else if (var0 == 3181) { // L: 2301
					var3 = class88.field1082; // L: 2302
				} else if (var0 == 3203) { // L: 2304
					var4 = class87.field1070; // L: 2305
				} else if (var0 == 3205) { // L: 2307
					var4 = class87.field1076; // L: 2308
				} else if (var0 == 3207) { // L: 2310
					var4 = class87.field1072; // L: 2311
				}

				if (var4 == class87.field1069) { // L: 2313
					switch(var3.field1079) { // L: 2314
					case 1:
						WorldMapSectionType.clientPreferences.method2459(var5 == 1); // L: 2327
						break; // L: 2328
					case 2:
						WorldMapSectionType.clientPreferences.method2500(var5 == 1); // L: 2332
						break; // L: 2333
					case 3:
						WorldMapSectionType.clientPreferences.method2523(var5 == 1); // L: 2337
						break; // L: 2338
					case 4:
						if (var5 < 0) { // L: 2342
							var5 = 0;
						}

						WorldMapSectionType.clientPreferences.method2435(var5); // L: 2343
						break; // L: 2344
					case 5:
						Skeleton.method4384(var5); // L: 2322
						break;
					default:
						var12 = String.format("Unkown device option: %s.", var3.toString()); // L: 2317
						throw new RuntimeException(var12); // L: 2318
					}
				} else {
					switch(var4.field1073) { // L: 2349
					case 1:
						WorldMapSectionType.clientPreferences.method2432(var5 == 1); // L: 2364
						break; // L: 2365
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2357
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2358
						class70.method2047(var6); // L: 2359
						break; // L: 2360
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2376
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2377
						ApproximateRouteStrategy.method1201(var6); // L: 2378
						break; // L: 2379
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2369
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2370
						class12.method151(var6); // L: 2371
						break; // L: 2372
					default:
						var12 = String.format("Unkown game option: %s.", var4.toString()); // L: 2352
						throw new RuntimeException(var12); // L: 2353
					}
				}

				return 1; // L: 2383
			}
		}
	}
}
