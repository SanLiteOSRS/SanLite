import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qi")
public class class439 {
	@ObfuscatedName("ba")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;
	@ObfuscatedName("ay")
	float field4704;
	@ObfuscatedName("an")
	float field4701;
	@ObfuscatedName("ar")
	float field4700;
	@ObfuscatedName("ab")
	float field4703;
	@ObfuscatedName("at")
	float field4702;
	@ObfuscatedName("ax")
	float field4699;
	@ObfuscatedName("al")
	float field4698;
	@ObfuscatedName("aj")
	float field4705;
	@ObfuscatedName("ac")
	float field4706;
	@ObfuscatedName("ag")
	float field4707;
	@ObfuscatedName("ad")
	float field4708;
	@ObfuscatedName("aw")
	float field4709;

	static {
		new class439();
	} // L: 6

	class439() {
		this.method8226(); // L: 22
	} // L: 23

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1000468417"
	)
	void method8226() {
		this.field4709 = 0.0F; // L: 26
		this.field4708 = 0.0F; // L: 27
		this.field4707 = 0.0F; // L: 28
		this.field4705 = 0.0F; // L: 29
		this.field4698 = 0.0F; // L: 30
		this.field4699 = 0.0F; // L: 31
		this.field4703 = 0.0F; // L: 32
		this.field4700 = 0.0F; // L: 33
		this.field4701 = 0.0F; // L: 34
		this.field4706 = 1.0F; // L: 35
		this.field4702 = 1.0F; // L: 36
		this.field4704 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-135504913"
	)
	void method8216(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4701; // L: 43
		float var5 = this.field4702; // L: 44
		float var6 = this.field4705; // L: 45
		float var7 = this.field4708; // L: 46
		this.field4701 = var2 * var4 - this.field4700 * var3; // L: 47
		this.field4700 = this.field4700 * var2 + var4 * var3; // L: 48
		this.field4702 = var5 * var2 - this.field4699 * var3; // L: 49
		this.field4699 = var2 * this.field4699 + var3 * var5; // L: 50
		this.field4705 = var2 * var6 - this.field4706 * var3; // L: 51
		this.field4706 = var3 * var6 + this.field4706 * var2; // L: 52
		this.field4708 = var7 * var2 - this.field4709 * var3; // L: 53
		this.field4709 = this.field4709 * var2 + var7 * var3; // L: 54
	} // L: 55

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1379686549"
	)
	void method8217(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4704; // L: 60
		float var5 = this.field4703; // L: 61
		float var6 = this.field4698; // L: 62
		float var7 = this.field4707; // L: 63
		this.field4704 = this.field4700 * var3 + var2 * var4; // L: 64
		this.field4700 = var2 * this.field4700 - var3 * var4; // L: 65
		this.field4703 = this.field4699 * var3 + var2 * var5; // L: 66
		this.field4699 = this.field4699 * var2 - var3 * var5; // L: 67
		this.field4698 = var6 * var2 + var3 * this.field4706; // L: 68
		this.field4706 = var2 * this.field4706 - var6 * var3; // L: 69
		this.field4707 = var3 * this.field4709 + var7 * var2; // L: 70
		this.field4709 = var2 * this.field4709 - var7 * var3; // L: 71
	} // L: 72

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "87"
	)
	void method8218(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4704; // L: 77
		float var5 = this.field4703; // L: 78
		float var6 = this.field4698; // L: 79
		float var7 = this.field4707; // L: 80
		this.field4704 = var2 * var4 - var3 * this.field4701; // L: 81
		this.field4701 = this.field4701 * var2 + var3 * var4; // L: 82
		this.field4703 = var2 * var5 - this.field4702 * var3; // L: 83
		this.field4702 = this.field4702 * var2 + var3 * var5; // L: 84
		this.field4698 = var6 * var2 - var3 * this.field4705; // L: 85
		this.field4705 = var3 * var6 + this.field4705 * var2; // L: 86
		this.field4707 = var7 * var2 - this.field4708 * var3; // L: 87
		this.field4708 = this.field4708 * var2 + var3 * var7; // L: 88
	} // L: 89

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "924765812"
	)
	void method8219(float var1, float var2, float var3) {
		this.field4707 += var1; // L: 92
		this.field4708 += var2; // L: 93
		this.field4709 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4704 + "," + this.field4703 + "," + this.field4698 + "," + this.field4707 + "\n" + this.field4701 + "," + this.field4702 + "," + this.field4705 + "," + this.field4708 + "\n" + this.field4700 + "," + this.field4699 + "," + this.field4706 + "," + this.field4709; // L: 99
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "1"
	)
	static int method8237(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2284
			class336.Interpreter_intStackSize -= 3; // L: 2285
			Decimator.queueSoundEffect(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]); // L: 2286
			return 1; // L: 2287
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2289
			MusicPatchPcmStream.playSong(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 2290
			return 1; // L: 2291
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2293
			class336.Interpreter_intStackSize -= 2; // L: 2294
			class143.method3111(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]); // L: 2295
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
							var9 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2523
							var10 = 0; // L: 2524
							class90 var16 = (class90)class217.findEnumerated(Login.method2078(), var9); // L: 2525
							if (var16 != null) { // L: 2526
								var10 = var16 != class90.field1081 ? 1 : 0; // L: 2527
							}

							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var10; // L: 2529
							return 1; // L: 2530
						} else if (var0 == 3218) { // L: 2532
							var9 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2533
							var10 = 0; // L: 2534
							class89 var11 = (class89)class217.findEnumerated(class153.method3183(), var9); // L: 2535
							if (var11 != null) { // L: 2536
								var10 = var11 != class89.field1074 ? 1 : 0; // L: 2537
							}

							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var10; // L: 2539
							return 1; // L: 2540
						} else if (var0 != 3217 && var0 != 3219) { // L: 2542
							return 2; // L: 2617
						} else {
							var3 = class90.field1081; // L: 2543
							var4 = class89.field1074; // L: 2544
							var13 = true; // L: 2545
							boolean var14 = true; // L: 2546
							int var7;
							if (var0 == 3217) { // L: 2547
								var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2548
								var3 = (class90)class217.findEnumerated(Login.method2078(), var7); // L: 2549
								if (var3 == null) { // L: 2550
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2551
								}
							}

							if (var0 == 3219) { // L: 2554
								var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2555
								var4 = (class89)class217.findEnumerated(class153.method3183(), var7); // L: 2556
								if (var4 == null) { // L: 2557
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2558
								}
							}

							String var8;
							byte var15;
							if (var4 == class89.field1074) { // L: 2561
								switch(var3.field1084) { // L: 2562
								case 1:
								case 2:
								case 3:
									var15 = 0; // L: 2573
									var6 = 1; // L: 2574
									break; // L: 2575
								case 4:
									var15 = 0; // L: 2565
									var6 = Integer.MAX_VALUE; // L: 2566
									break;
								case 5:
									var15 = 0; // L: 2579
									var6 = 100; // L: 2580
									break; // L: 2581
								default:
									var8 = String.format("Unkown device option: %s.", var3.toString()); // L: 2585
									throw new RuntimeException(var8); // L: 2586
								}
							} else {
								switch(var4.field1070) { // L: 2591
								case 1:
									var15 = 0; // L: 2594
									var6 = 1; // L: 2595
									break; // L: 2596
								case 2:
								case 3:
								case 4:
									var15 = 0; // L: 2607
									var6 = 100; // L: 2608
									break;
								default:
									var8 = String.format("Unkown game option: %s.", var4.toString()); // L: 2600
									throw new RuntimeException(var8); // L: 2601
								}
							}

							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var15; // L: 2613
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var6; // L: 2614
							return 1; // L: 2615
						}
					}
				} else {
					var3 = class90.field1081; // L: 2411
					var4 = class89.field1074; // L: 2412
					var13 = false; // L: 2413
					if (var0 == 3214) { // L: 2414
						var6 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2415
						var3 = (class90)class217.findEnumerated(Login.method2078(), var6); // L: 2416
						if (var3 == null) { // L: 2417
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2418
						}
					}

					if (var0 == 3215) { // L: 2421
						var6 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2422
						var4 = (class89)class217.findEnumerated(class153.method3183(), var6); // L: 2423
						if (var4 == null) { // L: 2424
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2425
						}
					}

					if (var0 == 3210) { // L: 2428
						var6 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2429
						var3 = (class90)class217.findEnumerated(Login.method2078(), var6); // L: 2430
						if (var3 == null) { // L: 2431
							var4 = (class89)class217.findEnumerated(class153.method3183(), var6); // L: 2432
							if (var4 == null) { // L: 2433
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2434
							}
						}
					} else if (var0 == 3182) { // L: 2438
						var3 = class90.field1083; // L: 2439
					} else if (var0 == 3204) { // L: 2441
						var4 = class89.field1067; // L: 2442
					} else if (var0 == 3206) { // L: 2444
						var4 = class89.field1068; // L: 2445
					} else if (var0 == 3208) { // L: 2447
						var4 = class89.field1069; // L: 2448
					}

					if (var4 == class89.field1074) { // L: 2450
						switch(var3.field1084) { // L: 2451
						case 1:
							var5 = WorldMapManager.clientPreferences.method2458() ? 1 : 0; // L: 2454
							break;
						case 2:
							var5 = WorldMapManager.clientPreferences.method2435() ? 1 : 0; // L: 2474
							break; // L: 2475
						case 3:
							var5 = WorldMapManager.clientPreferences.method2434() ? 1 : 0; // L: 2469
							break; // L: 2470
						case 4:
							var5 = WorldMapManager.clientPreferences.method2436(); // L: 2459
							break; // L: 2460
						case 5:
							var5 = Frames.method4692(); // L: 2464
							break; // L: 2465
						default:
							var12 = String.format("Unkown device option: %s.", var3.toString()); // L: 2479
							throw new RuntimeException(var12); // L: 2480
						}
					} else {
						switch(var4.field1070) { // L: 2485
						case 1:
							var5 = WorldMapManager.clientPreferences.method2536() ? 1 : 0; // L: 2511
							break;
						case 2:
							var6 = WorldMapManager.clientPreferences.method2440(); // L: 2499
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2500
							break; // L: 2501
						case 3:
							var6 = WorldMapManager.clientPreferences.method2442(); // L: 2505
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2506
							break; // L: 2507
						case 4:
							var6 = WorldMapManager.clientPreferences.method2444(); // L: 2488
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2489
							break; // L: 2490
						default:
							var12 = String.format("Unkown game option: %s.", var4.toString()); // L: 2494
							throw new RuntimeException(var12); // L: 2495
						}
					}

					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var5; // L: 2516
					return 1; // L: 2517
				}
			} else {
				var3 = class90.field1081; // L: 2299
				var4 = class89.field1074; // L: 2300
				var5 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2301
				if (var0 == 3212) { // L: 2302
					var6 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2303
					var3 = (class90)class217.findEnumerated(Login.method2078(), var6); // L: 2304
					if (var3 == null) { // L: 2305
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2306
					}
				}

				if (var0 == 3213) { // L: 2309
					var6 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2310
					var4 = (class89)class217.findEnumerated(class153.method3183(), var6); // L: 2311
					if (var4 == null) { // L: 2312
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2313
					}
				}

				if (var0 == 3209) { // L: 2316
					var6 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2317
					var3 = (class90)class217.findEnumerated(Login.method2078(), var6); // L: 2318
					if (var3 == null) { // L: 2319
						var4 = (class89)class217.findEnumerated(class153.method3183(), var6); // L: 2320
						if (var4 == null) { // L: 2321
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2322
						}
					}
				} else if (var0 == 3181) { // L: 2326
					var3 = class90.field1083; // L: 2327
				} else if (var0 == 3203) { // L: 2329
					var4 = class89.field1067; // L: 2330
				} else if (var0 == 3205) { // L: 2332
					var4 = class89.field1068; // L: 2333
				} else if (var0 == 3207) { // L: 2335
					var4 = class89.field1069; // L: 2336
				}

				if (var4 == class89.field1074) { // L: 2338
					switch(var3.field1084) { // L: 2339
					case 1:
						WorldMapManager.clientPreferences.method2428(var5 == 1); // L: 2357
						break; // L: 2358
					case 2:
						WorldMapManager.clientPreferences.method2481(var5 == 1); // L: 2352
						break; // L: 2353
					case 3:
						WorldMapManager.clientPreferences.method2432(var5 == 1); // L: 2347
						break; // L: 2348
					case 4:
						if (var5 < 0) { // L: 2367
							var5 = 0;
						}

						WorldMapManager.clientPreferences.method2493(var5); // L: 2368
						break; // L: 2369
					case 5:
						class347.method6647(var5); // L: 2342
						break;
					default:
						var12 = String.format("Unkown device option: %s.", var3.toString()); // L: 2362
						throw new RuntimeException(var12); // L: 2363
					}
				} else {
					switch(var4.field1070) { // L: 2374
					case 1:
						WorldMapManager.clientPreferences.method2426(var5 == 1); // L: 2377
						break; // L: 2378
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2401
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2402
						UserComparator7.method2857(var6); // L: 2403
						break; // L: 2404
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2394
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2395
						class133.method3024(var6); // L: 2396
						break; // L: 2397
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2387
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2388
						class157.method3272(var6); // L: 2389
						break; // L: 2390
					default:
						var12 = String.format("Unkown game option: %s.", var4.toString()); // L: 2382
						throw new RuntimeException(var12); // L: 2383
					}
				}

				return 1; // L: 2408
			}
		}
	}
}
