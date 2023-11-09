import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ky")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 993818461
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 192640145
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2137123145
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1041584515
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 588126651
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -346385577
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "-474032336"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 18
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 19
		}

		if (var1.regionLowY > this.regionEndY) { // L: 20
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 21
			var1.regionHighY = this.regionEndY;
		}

	} // L: 22

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "509257779"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) { // L: 26
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 29
		} else {
			return false; // L: 27
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-94"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 34
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1978048199"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Lmc;",
		garbageValue = "-1281040923"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 50
			return null; // L: 51
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 53
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2; // L: 54
			return new Coord(this.minPlane, var3, var4); // L: 55
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "47"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 60
		this.planes = var1.readUnsignedByte(); // L: 61
		this.regionStartX = var1.readUnsignedShort(); // L: 62
		this.regionStartY = var1.readUnsignedShort(); // L: 63
		this.regionEndX = var1.readUnsignedShort(); // L: 64
		this.regionEndY = var1.readUnsignedShort(); // L: 65
		this.postRead(); // L: 66
	} // L: 67

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	@Export("postRead")
	void postRead() {
	} // L: 69

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ldy;B)V",
		garbageValue = "21"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		NPC.runScript(var0, 500000, 475000); // L: 106
	} // L: 107

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "-20"
	)
	static int method5524(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2288
			SoundCache.Interpreter_intStackSize -= 3; // L: 2289
			class27.queueSoundEffect(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]); // L: 2290
			return 1; // L: 2291
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2293
				SoundCache.Interpreter_intStackSize -= 5; // L: 2294
				var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 2295
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 2296
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 2297
				var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3]; // L: 2298
				var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 4]; // L: 2299
				ArrayList var15 = new ArrayList(); // L: 2300
				var15.add(var3); // L: 2301
				class157.method3261(var15, var4, var5, var6, var7); // L: 2302
				return 1; // L: 2303
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2305
				SoundCache.Interpreter_intStackSize -= 2; // L: 2306
				Login.method2136(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]); // L: 2307
				return 1; // L: 2308
			} else {
				class90 var10;
				class89 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2310
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2422
						if (var0 == 3211) { // L: 2531
							return 1; // L: 2532
						} else if (var0 == 3216) { // L: 2534
							var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2535
							var4 = 0; // L: 2536
							class90 var19 = (class90)class25.findEnumerated(AbstractWorldMapData.method5454(), var3); // L: 2537
							if (var19 != null) { // L: 2538
								var4 = var19 != class90.field1126 ? 1 : 0; // L: 2539
							}

							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4; // L: 2541
							return 1; // L: 2542
						} else if (var0 == 3218) { // L: 2544
							var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2545
							var4 = 0; // L: 2546
							class89 var13 = (class89)class25.findEnumerated(Varps.method6025(), var3); // L: 2547
							if (var13 != null) { // L: 2548
								var4 = var13 != class89.field1113 ? 1 : 0; // L: 2549
							}

							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4; // L: 2551
							return 1; // L: 2552
						} else if (var0 != 3217 && var0 != 3219) { // L: 2554
							if (var0 == 3220) { // L: 2629
								SoundCache.Interpreter_intStackSize -= 2; // L: 2630
								var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 2631
								var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 2632
								Script.method2180(var3, var4); // L: 2633
								return 1; // L: 2634
							} else if (var0 == 3221) { // L: 2636
								SoundCache.Interpreter_intStackSize -= 6; // L: 2637
								var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 2638
								var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 2639
								var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 2640
								var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3]; // L: 2641
								var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 4]; // L: 2642
								int var8 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 5]; // L: 2643
								ArrayList var9 = new ArrayList(); // L: 2644
								var9.add(var3); // L: 2645
								var9.add(var4); // L: 2646
								class157.method3261(var9, var5, var6, var7, var8); // L: 2647
								return 1; // L: 2648
							} else if (var0 == 3222) { // L: 2650
								SoundCache.Interpreter_intStackSize -= 4; // L: 2651
								var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 2652
								var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 2653
								var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 2654
								var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3]; // L: 2655
								PacketWriter.method2806(var3, var4, var5, var6); // L: 2656
								return 1; // L: 2657
							} else {
								return 2; // L: 2659
							}
						} else {
							var10 = class90.field1126; // L: 2555
							var11 = class89.field1113; // L: 2556
							var16 = true; // L: 2557
							boolean var17 = true; // L: 2558
							if (var0 == 3217) { // L: 2559
								var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2560
								var10 = (class90)class25.findEnumerated(AbstractWorldMapData.method5454(), var7); // L: 2561
								if (var10 == null) { // L: 2562
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2563
								}
							}

							if (var0 == 3219) { // L: 2566
								var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2567
								var11 = (class89)class25.findEnumerated(Varps.method6025(), var7); // L: 2568
								if (var11 == null) { // L: 2569
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2570
								}
							}

							String var12;
							byte var18;
							if (var11 == class89.field1113) { // L: 2573
								switch(var10.field1123) { // L: 2574
								case 1:
								case 2:
								case 3:
									var18 = 0; // L: 2584
									var6 = 1; // L: 2585
									break;
								case 4:
									var18 = 0; // L: 2596
									var6 = Integer.MAX_VALUE; // L: 2597
									break; // L: 2598
								case 5:
									var18 = 0; // L: 2590
									var6 = 100; // L: 2591
									break; // L: 2592
								default:
									var12 = String.format("Unkown device option: %s.", var10.toString()); // L: 2577
									throw new RuntimeException(var12); // L: 2578
								}
							} else {
								switch(var11.field1111) { // L: 2603
								case 1:
									var18 = 0; // L: 2606
									var6 = 1; // L: 2607
									break; // L: 2608
								case 2:
								case 3:
								case 4:
									var18 = 0; // L: 2619
									var6 = 100; // L: 2620
									break;
								default:
									var12 = String.format("Unkown game option: %s.", var11.toString()); // L: 2612
									throw new RuntimeException(var12); // L: 2613
								}
							}

							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var18; // L: 2625
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var6; // L: 2626
							return 1; // L: 2627
						}
					} else {
						var10 = class90.field1126; // L: 2423
						var11 = class89.field1113; // L: 2424
						var16 = false; // L: 2425
						if (var0 == 3214) { // L: 2426
							var6 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2427
							var10 = (class90)class25.findEnumerated(AbstractWorldMapData.method5454(), var6); // L: 2428
							if (var10 == null) { // L: 2429
								throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2430
							}
						}

						if (var0 == 3215) { // L: 2433
							var6 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2434
							var11 = (class89)class25.findEnumerated(Varps.method6025(), var6); // L: 2435
							if (var11 == null) { // L: 2436
								throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2437
							}
						}

						if (var0 == 3210) { // L: 2440
							var6 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2441
							var10 = (class90)class25.findEnumerated(AbstractWorldMapData.method5454(), var6); // L: 2442
							if (var10 == null) { // L: 2443
								var11 = (class89)class25.findEnumerated(Varps.method6025(), var6); // L: 2444
								if (var11 == null) { // L: 2445
									throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2446
								}
							}
						} else if (var0 == 3182) { // L: 2450
							var10 = class90.field1122; // L: 2451
						} else if (var0 == 3204) { // L: 2453
							var11 = class89.field1106; // L: 2454
						} else if (var0 == 3206) { // L: 2456
							var11 = class89.field1109; // L: 2457
						} else if (var0 == 3208) { // L: 2459
							var11 = class89.field1115; // L: 2460
						}

						if (var11 == class89.field1113) { // L: 2462
							switch(var10.field1123) { // L: 2463
							case 1:
								var5 = class449.clientPreferences.method2454() ? 1 : 0; // L: 2471
								break; // L: 2472
							case 2:
								var5 = class449.clientPreferences.method2484() ? 1 : 0; // L: 2476
								break; // L: 2477
							case 3:
								var5 = class449.clientPreferences.method2463() ? 1 : 0; // L: 2466
								break;
							case 4:
								var5 = class449.clientPreferences.method2456(); // L: 2481
								break; // L: 2482
							case 5:
								var5 = PlayerType.method6627(); // L: 2486
								break; // L: 2487
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2491
								throw new RuntimeException(var14); // L: 2492
							}
						} else {
							switch(var11.field1111) { // L: 2497
							case 1:
								var5 = class449.clientPreferences.method2448() ? 1 : 0; // L: 2523
								break;
							case 2:
								var6 = class449.clientPreferences.method2451(); // L: 2511
								var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2512
								break; // L: 2513
							case 3:
								var6 = class449.clientPreferences.method2462(); // L: 2505
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2506
								break; // L: 2507
							case 4:
								var6 = class449.clientPreferences.method2554(); // L: 2517
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2518
								break; // L: 2519
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2500
								throw new RuntimeException(var14); // L: 2501
							}
						}

						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5; // L: 2528
						return 1; // L: 2529
					}
				} else {
					var10 = class90.field1126; // L: 2311
					var11 = class89.field1113; // L: 2312
					var5 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2313
					if (var0 == 3212) { // L: 2314
						var6 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2315
						var10 = (class90)class25.findEnumerated(AbstractWorldMapData.method5454(), var6); // L: 2316
						if (var10 == null) { // L: 2317
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2318
						}
					}

					if (var0 == 3213) { // L: 2321
						var6 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2322
						var11 = (class89)class25.findEnumerated(Varps.method6025(), var6); // L: 2323
						if (var11 == null) { // L: 2324
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2325
						}
					}

					if (var0 == 3209) { // L: 2328
						var6 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2329
						var10 = (class90)class25.findEnumerated(AbstractWorldMapData.method5454(), var6); // L: 2330
						if (var10 == null) { // L: 2331
							var11 = (class89)class25.findEnumerated(Varps.method6025(), var6); // L: 2332
							if (var11 == null) { // L: 2333
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2334
							}
						}
					} else if (var0 == 3181) { // L: 2338
						var10 = class90.field1122; // L: 2339
					} else if (var0 == 3203) { // L: 2341
						var11 = class89.field1106; // L: 2342
					} else if (var0 == 3205) { // L: 2344
						var11 = class89.field1109; // L: 2345
					} else if (var0 == 3207) { // L: 2347
						var11 = class89.field1115; // L: 2348
					}

					if (var11 == class89.field1113) { // L: 2350
						switch(var10.field1123) { // L: 2351
						case 1:
							class449.clientPreferences.method2494(var5 == 1); // L: 2375
							break; // L: 2376
						case 2:
							class449.clientPreferences.method2474(var5 == 1); // L: 2359
							break;
						case 3:
							class449.clientPreferences.method2452(var5 == 1); // L: 2380
							break; // L: 2381
						case 4:
							if (var5 < 0) { // L: 2364
								var5 = 0;
							}

							class449.clientPreferences.method2455(var5); // L: 2365
							break; // L: 2366
						case 5:
							class20.method304(var5); // L: 2370
							break; // L: 2371
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2354
							throw new RuntimeException(var14); // L: 2355
						}
					} else {
						switch(var11.field1111) { // L: 2386
						case 1:
							class449.clientPreferences.method2447(var5 == 1); // L: 2415
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2408
							var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2409
							WorldMapEvent.method5628(var6); // L: 2410
							break; // L: 2411
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2389
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2390
							class385.method7164(var6); // L: 2391
							break; // L: 2392
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2396
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2397
							class14.method161(var6); // L: 2398
							break; // L: 2399
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2403
							throw new RuntimeException(var14); // L: 2404
						}
					}

					return 1; // L: 2420
				}
			}
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1870954980"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3592
			Script.method2180(0, 0); // L: 3593
		} else if (var0 != -1 && !class172.method3457(var0) && class449.clientPreferences.method2451() != 0) { // L: 3595
			ArrayList var1 = new ArrayList(); // L: 3596
			var1.add(new class317(class385.archive11, var0, 0, class449.clientPreferences.method2451(), false)); // L: 3597
			if (Client.playingJingle) { // L: 3598
				class305.field3405.clear(); // L: 3600
				class305.field3405.addAll(var1); // L: 3601
				class270.method5491(0, 100, 100, 0); // L: 3602
			} else {
				class53.method1097(var1, 0, 100, 100, 0, false); // L: 3606
			}
		}

	} // L: 3609
}
