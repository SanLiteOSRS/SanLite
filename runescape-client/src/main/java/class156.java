import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gw")
public class class156 extends class142 {
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -249560307
	)
	static int field1726;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 888431855
	)
	int field1725;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class156(class145 var1) {
		this.this$0 = var1;
		this.field1725 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	void vmethod3381(Buffer var1) {
		this.field1725 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	void vmethod3382(ClanSettings var1) {
		var1.method3211(this.field1725); // L: 222
	} // L: 223

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "123"
	)
	static int method3294(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2284
			Interpreter.Interpreter_intStackSize -= 3; // L: 2285
			SpriteMask.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 2286
			return 1; // L: 2287
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2289
			MusicPatch.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 2290
			return 1; // L: 2291
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2293
			Interpreter.Interpreter_intStackSize -= 2; // L: 2294
			HealthBarUpdate.method2400(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 2295
			return 1; // L: 2296
		} else {
			class90 var3;
			class89 var4;
			int var5;
			int var6;
			String var12;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2298
				boolean var13;
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2410
					if (var0 == 3211) { // L: 2519
						return 1; // L: 2520
					} else {
						int var9;
						int var10;
						if (var0 == 3216) { // L: 2522
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2523
							var10 = 0; // L: 2524
							class90 var16 = (class90)GameObject.findEnumerated(SoundSystem.method817(), var9); // L: 2525
							if (var16 != null) { // L: 2526
								var10 = var16 != class90.field1091 ? 1 : 0; // L: 2527
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var10; // L: 2529
							return 1; // L: 2530
						} else if (var0 == 3218) { // L: 2532
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2533
							var10 = 0; // L: 2534
							class89 var11 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method6590(), var9); // L: 2535
							if (var11 != null) { // L: 2536
								var10 = var11 != class89.field1082 ? 1 : 0; // L: 2537
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var10; // L: 2539
							return 1; // L: 2540
						} else if (var0 != 3217 && var0 != 3219) { // L: 2542
							return 2; // L: 2617
						} else {
							var3 = class90.field1091; // L: 2543
							var4 = class89.field1082; // L: 2544
							var13 = true; // L: 2545
							boolean var14 = true; // L: 2546
							int var7;
							if (var0 == 3217) { // L: 2547
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2548
								var3 = (class90)GameObject.findEnumerated(SoundSystem.method817(), var7); // L: 2549
								if (var3 == null) { // L: 2550
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2551
								}
							}

							if (var0 == 3219) { // L: 2554
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2555
								var4 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method6590(), var7); // L: 2556
								if (var4 == null) { // L: 2557
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2558
								}
							}

							String var8;
							byte var15;
							if (var4 == class89.field1082) { // L: 2561
								switch(var3.field1095) { // L: 2562
								case 1:
								case 2:
								case 3:
									var15 = 0; // L: 2572
									var6 = 1; // L: 2573
									break;
								case 4:
									var15 = 0; // L: 2584
									var6 = Integer.MAX_VALUE; // L: 2585
									break; // L: 2586
								case 5:
									var15 = 0; // L: 2578
									var6 = 100; // L: 2579
									break; // L: 2580
								default:
									var8 = String.format("Unkown device option: %s.", var3.toString()); // L: 2565
									throw new RuntimeException(var8); // L: 2566
								}
							} else {
								switch(var4.field1086) { // L: 2591
								case 1:
									var15 = 0; // L: 2594
									var6 = 1; // L: 2595
									break; // L: 2596
								case 2:
								case 3:
								case 4:
									var15 = 0; // L: 2602
									var6 = 100; // L: 2603
									break; // L: 2604
								default:
									var8 = String.format("Unkown game option: %s.", var4.toString()); // L: 2608
									throw new RuntimeException(var8); // L: 2609
								}
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var15; // L: 2613
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2614
							return 1; // L: 2615
						}
					}
				} else {
					var3 = class90.field1091; // L: 2411
					var4 = class89.field1082; // L: 2412
					var13 = false; // L: 2413
					if (var0 == 3214) { // L: 2414
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2415
						var3 = (class90)GameObject.findEnumerated(SoundSystem.method817(), var6); // L: 2416
						if (var3 == null) { // L: 2417
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2418
						}
					}

					if (var0 == 3215) { // L: 2421
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2422
						var4 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method6590(), var6); // L: 2423
						if (var4 == null) { // L: 2424
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2425
						}
					}

					if (var0 == 3210) { // L: 2428
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2429
						var3 = (class90)GameObject.findEnumerated(SoundSystem.method817(), var6); // L: 2430
						if (var3 == null) { // L: 2431
							var4 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method6590(), var6); // L: 2432
							if (var4 == null) { // L: 2433
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2434
							}
						}
					} else if (var0 == 3182) { // L: 2438
						var3 = class90.field1094; // L: 2439
					} else if (var0 == 3204) { // L: 2441
						var4 = class89.field1083; // L: 2442
					} else if (var0 == 3206) { // L: 2444
						var4 = class89.field1084; // L: 2445
					} else if (var0 == 3208) { // L: 2447
						var4 = class89.field1085; // L: 2448
					}

					if (var4 == class89.field1082) { // L: 2450
						switch(var3.field1095) { // L: 2451
						case 1:
							var5 = class10.clientPreferences.method2472() ? 1 : 0; // L: 2464
							break; // L: 2465
						case 2:
							var5 = class10.clientPreferences.method2437() ? 1 : 0; // L: 2479
							break; // L: 2480
						case 3:
							var5 = class10.clientPreferences.method2448() ? 1 : 0; // L: 2459
							break; // L: 2460
						case 4:
							var5 = class10.clientPreferences.method2442(); // L: 2454
							break;
						case 5:
							var5 = class60.method1119(); // L: 2474
							break; // L: 2475
						default:
							var12 = String.format("Unkown device option: %s.", var3.toString()); // L: 2469
							throw new RuntimeException(var12); // L: 2470
						}
					} else {
						switch(var4.field1086) { // L: 2485
						case 1:
							var5 = class10.clientPreferences.method2434() ? 1 : 0; // L: 2511
							break;
						case 2:
							var6 = class10.clientPreferences.method2488(); // L: 2493
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2494
							break; // L: 2495
						case 3:
							var6 = class10.clientPreferences.method2445(); // L: 2505
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2506
							break; // L: 2507
						case 4:
							var6 = class10.clientPreferences.method2450(); // L: 2499
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2500
							break; // L: 2501
						default:
							var12 = String.format("Unkown game option: %s.", var4.toString()); // L: 2488
							throw new RuntimeException(var12); // L: 2489
						}
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 2516
					return 1; // L: 2517
				}
			} else {
				var3 = class90.field1091; // L: 2299
				var4 = class89.field1082; // L: 2300
				var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2301
				if (var0 == 3212) { // L: 2302
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2303
					var3 = (class90)GameObject.findEnumerated(SoundSystem.method817(), var6); // L: 2304
					if (var3 == null) { // L: 2305
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2306
					}
				}

				if (var0 == 3213) { // L: 2309
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2310
					var4 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method6590(), var6); // L: 2311
					if (var4 == null) { // L: 2312
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2313
					}
				}

				if (var0 == 3209) { // L: 2316
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2317
					var3 = (class90)GameObject.findEnumerated(SoundSystem.method817(), var6); // L: 2318
					if (var3 == null) { // L: 2319
						var4 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method6590(), var6); // L: 2320
						if (var4 == null) { // L: 2321
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2322
						}
					}
				} else if (var0 == 3181) { // L: 2326
					var3 = class90.field1094; // L: 2327
				} else if (var0 == 3203) { // L: 2329
					var4 = class89.field1083; // L: 2330
				} else if (var0 == 3205) { // L: 2332
					var4 = class89.field1084; // L: 2333
				} else if (var0 == 3207) { // L: 2335
					var4 = class89.field1085; // L: 2336
				}

				if (var4 == class89.field1082) { // L: 2338
					switch(var3.field1095) { // L: 2339
					case 1:
						class10.clientPreferences.method2524(var5 == 1); // L: 2362
						break; // L: 2363
					case 2:
						class10.clientPreferences.method2436(var5 == 1); // L: 2357
						break; // L: 2358
					case 3:
						class10.clientPreferences.method2438(var5 == 1); // L: 2342
						break;
					case 4:
						if (var5 < 0) { // L: 2367
							var5 = 0;
						}

						class10.clientPreferences.method2452(var5); // L: 2368
						break; // L: 2369
					case 5:
						class164.method3366(var5); // L: 2352
						break; // L: 2353
					default:
						var12 = String.format("Unkown device option: %s.", var3.toString()); // L: 2347
						throw new RuntimeException(var12); // L: 2348
					}
				} else {
					switch(var4.field1086) { // L: 2374
					case 1:
						class10.clientPreferences.method2489(var5 == 1); // L: 2389
						break; // L: 2390
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2401
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2402
						class209.method4117(var6); // L: 2403
						break;
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2394
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2395
						ClanChannelMember.method3136(var6); // L: 2396
						break; // L: 2397
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2382
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2383
						class134.method3041(var6); // L: 2384
						break; // L: 2385
					default:
						var12 = String.format("Unkown game option: %s.", var4.toString()); // L: 2377
						throw new RuntimeException(var12); // L: 2378
					}
				}

				return 1; // L: 2408
			}
		}
	}
}
