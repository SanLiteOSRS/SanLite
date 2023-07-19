import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ab")
public class class10 {
	@ObfuscatedName("ai")
	final HttpsURLConnection field53;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	final class419 field50;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	final class9 field47;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	class461 field46;
	@ObfuscatedName("ay")
	boolean field48;
	@ObfuscatedName("ap")
	boolean field49;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 500590479
	)
	int field51;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laz;Lqb;Z)V"
	)
	public class10(URL var1, class9 var2, class419 var3, boolean var4) throws IOException {
		this.field48 = false; // L: 17
		this.field49 = false; // L: 18
		this.field51 = 300000; // L: 19
		if (!var2.method71()) { // L: 26
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method72()); // L: 27
		} else {
			this.field53 = (HttpsURLConnection)var1.openConnection(); // L: 29
			if (!var4) { // L: 30
				this.field53.setSSLSocketFactory(class15.method205()); // L: 31
			}

			this.field47 = var2; // L: 33
			this.field50 = var3 != null ? var3 : new class419(); // L: 34
		}
	} // L: 35

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laz;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class419(), var3); // L: 22
	} // L: 23

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lqb;",
		garbageValue = "2054119236"
	)
	public class419 method90() {
		return this.field50; // L: 38
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lrj;I)V",
		garbageValue = "-96730974"
	)
	public void method97(class461 var1) {
		if (!this.field48) { // L: 42
			if (var1 == null) { // L: 43
				this.field50.method7740("Content-Type"); // L: 44
				this.field46 = null; // L: 45
			} else {
				this.field46 = var1; // L: 48
				if (this.field46.vmethod8369() != null) { // L: 49
					this.field50.method7739(this.field46.vmethod8369()); // L: 50
				} else {
					this.field50.method7745(); // L: 53
				}

			}
		}
	} // L: 46 55

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "152221134"
	)
	void method107() throws ProtocolException {
		if (!this.field48) {
			this.field53.setRequestMethod(this.field47.method72()); // L: 59
			this.field50.method7767(this.field53);
			if (this.field47.method73() && this.field46 != null) {
				this.field53.setDoOutput(true);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();

				try {
					var1.write(this.field46.vmethod8370());
					var1.writeTo(this.field53.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					try {
						var1.close();
					} catch (IOException var10) { // L: 75
						var10.printStackTrace();
					}

				}
			}

			this.field53.setConnectTimeout(this.field51); // L: 80
			this.field53.setInstanceFollowRedirects(this.field49); // L: 81
			this.field48 = true; // L: 82
		}
	} // L: 83

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1258986721"
	)
	boolean method92() throws IOException {
		if (!this.field48) { // L: 86
			this.method107();
		}

		this.field53.connect(); // L: 87
		return this.field53.getResponseCode() == -1; // L: 88
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lae;",
		garbageValue = "-85"
	)
	class20 method93() {
		try {
			if (!this.field48 || this.field53.getResponseCode() == -1) { // L: 93
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 95
			this.field53.disconnect(); // L: 96
			return new class20("Error decoding REST response code: " + var10.getMessage()); // L: 97
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field53); // L: 101
			return var1; // L: 109
		} catch (IOException var8) { // L: 103
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field53.disconnect(); // L: 107
		}

		return var3; // L: 104
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-97"
	)
	public static int method105() {
		return ++MouseHandler.MouseHandler_idleCycles - 1; // L: 51
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "347512461"
	)
	static int method116(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 885
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 886
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)I",
		garbageValue = "-2072696725"
	)
	static int method119(Widget var0) {
		if (var0.type != 11) { // L: 1548
			--class179.Interpreter_stringStackSize; // L: 1549
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 1550
			return 1; // L: 1551
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 1553
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method6461(var1); // L: 1554
			return 1; // L: 1555
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lgv;III)Lbr;",
		garbageValue = "1526834733"
	)
	public static final PcmPlayer method114(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field271 == 0) { // L: 56
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 57
			if (var2 < 256) { // L: 58
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class260.pcmPlayerProvider.player(); // L: 60
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256]; // L: 61
				var3.field280 = var2; // L: 62
				var3.init(); // L: 63
				var3.capacity = (var2 & -1024) + 1024; // L: 64
				if (var3.capacity > 16384) { // L: 65
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 66
				if (PcmPlayer.field274 > 0 && class527.soundSystem == null) { // L: 67
					class527.soundSystem = new SoundSystem(); // L: 68
					class299.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 69
					class299.soundSystemExecutor.scheduleAtFixedRate(class527.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 70
				}

				if (class527.soundSystem != null) { // L: 72
					if (class527.soundSystem.players[var1] != null) { // L: 73
						throw new IllegalArgumentException();
					}

					class527.soundSystem.players[var1] = var3; // L: 74
				}

				return var3; // L: 76
			} catch (Throwable var4) { // L: 78
				return new PcmPlayer(); // L: 79
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "1884227795"
	)
	static int method95(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2285
			Interpreter.Interpreter_intStackSize -= 3; // L: 2286
			class211.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 2287
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
				class1.method7(var15, var4, var5, var6, var7); // L: 2299
				return 1; // L: 2300
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2302
				Interpreter.Interpreter_intStackSize -= 2; // L: 2303
				class406.method7644(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 2304
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
							class90 var19 = (class90)class93.findEnumerated(class101.method2695(), var3); // L: 2534
							if (var19 != null) { // L: 2535
								var4 = var19 != class90.field1105 ? 1 : 0; // L: 2536
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 2538
							return 1; // L: 2539
						} else if (var0 == 3218) { // L: 2541
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2542
							var4 = 0; // L: 2543
							class89 var13 = (class89)class93.findEnumerated(Client.method1573(), var3); // L: 2544
							if (var13 != null) { // L: 2545
								var4 = var13 != class89.field1092 ? 1 : 0; // L: 2546
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 2548
							return 1; // L: 2549
						} else if (var0 != 3217 && var0 != 3219) { // L: 2551
							if (var0 == 3220) { // L: 2626
								Interpreter.Interpreter_intStackSize -= 2; // L: 2627
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2628
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2629
								class90.method2339(var3, var4); // L: 2630
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
								class1.method7(var9, var5, var6, var7, var8); // L: 2644
								return 1; // L: 2645
							} else if (var0 == 3222) { // L: 2647
								Interpreter.Interpreter_intStackSize -= 4; // L: 2648
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2649
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2650
								var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2651
								var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2652
								class1.method5(var3, var4, var5, var6); // L: 2653
								return 1; // L: 2654
							} else {
								return 2; // L: 2656
							}
						} else {
							var10 = class90.field1105; // L: 2552
							var11 = class89.field1092; // L: 2553
							var16 = true; // L: 2554
							boolean var17 = true; // L: 2555
							if (var0 == 3217) { // L: 2556
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2557
								var10 = (class90)class93.findEnumerated(class101.method2695(), var7); // L: 2558
								if (var10 == null) { // L: 2559
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2560
								}
							}

							if (var0 == 3219) { // L: 2563
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2564
								var11 = (class89)class93.findEnumerated(Client.method1573(), var7); // L: 2565
								if (var11 == null) { // L: 2566
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2567
								}
							}

							String var12;
							byte var18;
							if (var11 == class89.field1092) { // L: 2570
								switch(var10.field1107) { // L: 2571
								case 1:
								case 2:
								case 3:
									var18 = 0; // L: 2576
									var6 = 1; // L: 2577
									break;
								case 4:
									var18 = 0; // L: 2588
									var6 = Integer.MAX_VALUE; // L: 2589
									break; // L: 2590
								case 5:
									var18 = 0; // L: 2582
									var6 = 100; // L: 2583
									break; // L: 2584
								default:
									var12 = String.format("Unkown device option: %s.", var10.toString()); // L: 2594
									throw new RuntimeException(var12); // L: 2595
								}
							} else {
								switch(var11.field1095) { // L: 2600
								case 1:
									var18 = 0; // L: 2611
									var6 = 1; // L: 2612
									break; // L: 2613
								case 2:
								case 3:
								case 4:
									var18 = 0; // L: 2605
									var6 = 100; // L: 2606
									break; // L: 2607
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
						var10 = class90.field1105; // L: 2420
						var11 = class89.field1092; // L: 2421
						var16 = false; // L: 2422
						if (var0 == 3214) { // L: 2423
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2424
							var10 = (class90)class93.findEnumerated(class101.method2695(), var6); // L: 2425
							if (var10 == null) { // L: 2426
								throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2427
							}
						}

						if (var0 == 3215) { // L: 2430
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2431
							var11 = (class89)class93.findEnumerated(Client.method1573(), var6); // L: 2432
							if (var11 == null) { // L: 2433
								throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2434
							}
						}

						if (var0 == 3210) { // L: 2437
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2438
							var10 = (class90)class93.findEnumerated(class101.method2695(), var6); // L: 2439
							if (var10 == null) { // L: 2440
								var11 = (class89)class93.findEnumerated(Client.method1573(), var6); // L: 2441
								if (var11 == null) { // L: 2442
									throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2443
								}
							}
						} else if (var0 == 3182) { // L: 2447
							var10 = class90.field1103; // L: 2448
						} else if (var0 == 3204) { // L: 2450
							var11 = class89.field1097; // L: 2451
						} else if (var0 == 3206) { // L: 2453
							var11 = class89.field1093; // L: 2454
						} else if (var0 == 3208) { // L: 2456
							var11 = class89.field1094; // L: 2457
						}

						if (var11 == class89.field1092) { // L: 2459
							switch(var10.field1107) { // L: 2460
							case 1:
								var5 = ScriptFrame.clientPreferences.method2505() ? 1 : 0; // L: 2468
								break;
							case 2:
								var5 = ScriptFrame.clientPreferences.method2507() ? 1 : 0; // L: 2478
								break; // L: 2479
							case 3:
								var5 = ScriptFrame.clientPreferences.method2510() ? 1 : 0; // L: 2483
								break; // L: 2484
							case 4:
								var5 = ScriptFrame.clientPreferences.method2509(); // L: 2473
								break; // L: 2474
							case 5:
								var5 = class252.method5135(); // L: 2488
								break; // L: 2489
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2463
								throw new RuntimeException(var14); // L: 2464
							}
						} else {
							switch(var11.field1095) { // L: 2494
							case 1:
								var5 = ScriptFrame.clientPreferences.method2543() ? 1 : 0; // L: 2503
								break; // L: 2504
							case 2:
								var6 = ScriptFrame.clientPreferences.method2516(); // L: 2497
								var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2498
								break;
							case 3:
								var6 = ScriptFrame.clientPreferences.method2518(); // L: 2508
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2509
								break; // L: 2510
							case 4:
								var6 = ScriptFrame.clientPreferences.method2571(); // L: 2514
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2515
								break; // L: 2516
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2520
								throw new RuntimeException(var14); // L: 2521
							}
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 2525
						return 1; // L: 2526
					}
				} else {
					var10 = class90.field1105; // L: 2308
					var11 = class89.field1092; // L: 2309
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2310
					if (var0 == 3212) { // L: 2311
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2312
						var10 = (class90)class93.findEnumerated(class101.method2695(), var6); // L: 2313
						if (var10 == null) { // L: 2314
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2315
						}
					}

					if (var0 == 3213) { // L: 2318
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2319
						var11 = (class89)class93.findEnumerated(Client.method1573(), var6); // L: 2320
						if (var11 == null) { // L: 2321
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2322
						}
					}

					if (var0 == 3209) { // L: 2325
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2326
						var10 = (class90)class93.findEnumerated(class101.method2695(), var6); // L: 2327
						if (var10 == null) { // L: 2328
							var11 = (class89)class93.findEnumerated(Client.method1573(), var6); // L: 2329
							if (var11 == null) { // L: 2330
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2331
							}
						}
					} else if (var0 == 3181) { // L: 2335
						var10 = class90.field1103; // L: 2336
					} else if (var0 == 3203) { // L: 2338
						var11 = class89.field1097; // L: 2339
					} else if (var0 == 3205) { // L: 2341
						var11 = class89.field1093; // L: 2342
					} else if (var0 == 3207) { // L: 2344
						var11 = class89.field1094; // L: 2345
					}

					if (var11 == class89.field1092) { // L: 2347
						switch(var10.field1107) { // L: 2348
						case 1:
							ScriptFrame.clientPreferences.method2589(var5 == 1); // L: 2372
							break; // L: 2373
						case 2:
							ScriptFrame.clientPreferences.method2566(var5 == 1); // L: 2362
							break; // L: 2363
						case 3:
							ScriptFrame.clientPreferences.method2508(var5 == 1); // L: 2377
							break; // L: 2378
						case 4:
							if (var5 < 0) { // L: 2351
								var5 = 0;
							}

							ScriptFrame.clientPreferences.method2559(var5); // L: 2352
							break;
						case 5:
							SecureRandomCallable.method2272(var5); // L: 2357
							break; // L: 2358
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2367
							throw new RuntimeException(var14); // L: 2368
						}
					} else {
						switch(var11.field1095) { // L: 2383
						case 1:
							ScriptFrame.clientPreferences.method2502(var5 == 1); // L: 2386
							break; // L: 2387
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2391
							var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2392
							WorldMapIcon_0.method5479(var6); // L: 2393
							break; // L: 2394
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2410
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2411
							VarpDefinition.method3688(var6); // L: 2412
							break; // L: 2413
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2398
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2399
							PacketWriter.method2871(var6); // L: 2400
							break; // L: 2401
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2405
							throw new RuntimeException(var14); // L: 2406
						}
					}

					return 1; // L: 2417
				}
			}
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-636779554"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[BuddyRankComparator.Client_plane][var0][var1]; // L: 8604
		if (var2 == null) { // L: 8605
			class173.scene.removeGroundItemPile(BuddyRankComparator.Client_plane, var0, var1); // L: 8606
		} else {
			long var3 = -99999999L; // L: 8609
			TileItem var5 = null; // L: 8610

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8611 8612 8622
				ItemComposition var7 = class141.ItemComposition_get(var6.id); // L: 8613
				long var11 = (long)var7.price; // L: 8614
				if (var7.isStackable == 1) { // L: 8615
					var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity; // L: 8616
				}

				if (var11 > var3) { // L: 8618
					var3 = var11; // L: 8619
					var5 = var6; // L: 8620
				}
			}

			if (var5 == null) { // L: 8624
				class173.scene.removeGroundItemPile(BuddyRankComparator.Client_plane, var0, var1); // L: 8625
			} else {
				var2.addLast(var5); // L: 8628
				TileItem var13 = null; // L: 8629
				TileItem var8 = null; // L: 8630

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8631 8632 8637
					if (var6.id != var5.id) { // L: 8633
						if (var13 == null) { // L: 8634
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 8635
							var8 = var6;
						}
					}
				}

				long var9 = ChatChannel.calculateTag(var0, var1, 3, false, 0); // L: 8639
				class173.scene.newGroundItemPile(BuddyRankComparator.Client_plane, var0, var1, class291.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, BuddyRankComparator.Client_plane), var5, var9, var13, var8); // L: 8640
			}
		}
	} // L: 8607 8626 8641

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Lme;B)Z",
		garbageValue = "-124"
	)
	static final boolean method115(Widget var0) {
		int var1 = var0.contentType; // L: 12403
		if (var1 == 205) { // L: 12404
			Client.logoutTimer = 250; // L: 12405
			return true; // L: 12406
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12408
				var2 = (var1 - 300) / 2; // L: 12409
				var3 = var1 & 1; // L: 12410
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12411
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12413
				var2 = (var1 - 314) / 2; // L: 12414
				var3 = var1 & 1; // L: 12415
				Client.playerAppearance.method6128(var2, var3 == 1); // L: 12416
			}

			if (var1 == 324) { // L: 12418
				Client.playerAppearance.method6158(0);
			}

			if (var1 == 325) { // L: 12419
				Client.playerAppearance.method6158(1);
			}

			if (var1 == 326) { // L: 12420
				PacketBufferNode var4 = class217.getPacketBufferNode(ClientPacket.field3125, Client.packetWriter.isaacCipher); // L: 12422
				Client.playerAppearance.write(var4.packetBuffer); // L: 12423
				Client.packetWriter.addNode(var4); // L: 12424
				return true; // L: 12425
			} else {
				return false; // L: 12427
			}
		}
	}
}
