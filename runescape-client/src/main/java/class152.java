import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fs")
public class class152 extends class160 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1505334263
	)
	int field1722;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	class152(class161 var1) {
		this.this$0 = var1;
		this.field1722 = -1; // L: 84
	} // L: 86

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "33"
	)
	void vmethod3414(Buffer var1) {
		this.field1722 = var1.readUnsignedShort(); // L: 89
		var1.readUnsignedByte(); // L: 90
		if (var1.readUnsignedByte() != 255) { // L: 91
			--var1.offset; // L: 92
			var1.readLong(); // L: 93
		}

	} // L: 95

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgi;B)V",
		garbageValue = "18"
	)
	void vmethod3413(ClanChannel var1) {
		var1.removeMember(this.field1722); // L: 98
	} // L: 99

	@ObfuscatedName("az")
	public static int method3210(int var0, double var1) {
		double var3 = (double)(var0 >> 16 & 255) / 256.0D; // L: 9
		double var5 = (double)(var0 >> 8 & 255) / 256.0D; // L: 10
		double var7 = (double)(var0 & 255) / 256.0D; // L: 11
		var3 = Math.pow(var3, var1); // L: 12
		var5 = Math.pow(var5, var1); // L: 13
		var7 = Math.pow(var7, var1); // L: 14
		int var9 = (int)(256.0D * var3); // L: 15
		int var10 = (int)(256.0D * var5); // L: 16
		int var11 = (int)(256.0D * var7); // L: 17
		return var11 + (var10 << 8) + (var9 << 16) + -16777216; // L: 18
	}

	@ObfuscatedName("an")
	public static boolean method3219(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1; // L: 60
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1618550265"
	)
	static int method3220(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2331
			class19.Interpreter_intStackSize -= 3; // L: 2332
			class151.queueSoundEffect(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]); // L: 2333
			return 1; // L: 2334
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2336
				class19.Interpreter_intStackSize -= 5; // L: 2337
				var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 2338
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2339
				var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 2340
				var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 3]; // L: 2341
				var7 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 4]; // L: 2342
				ArrayList var15 = new ArrayList(); // L: 2343
				var15.add(var3); // L: 2344
				FriendSystem.method1892(var15, var4, var5, var6, var7); // L: 2345
				return 1; // L: 2346
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2348
				class19.Interpreter_intStackSize -= 2; // L: 2349
				class137.method3080(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]); // L: 2350
				return 1; // L: 2351
			} else {
				class91 var10;
				class90 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2353
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2465
						if (var0 == 3211) { // L: 2574
							return 1; // L: 2575
						} else if (var0 == 3216) { // L: 2577
							var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2578
							var4 = 0; // L: 2579
							class91 var19 = (class91)KitDefinition.findEnumerated(class47.method849(), var3); // L: 2580
							if (var19 != null) { // L: 2581
								var4 = var19 != class91.field1120 ? 1 : 0; // L: 2582
							}

							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4; // L: 2584
							return 1; // L: 2585
						} else if (var0 == 3218) { // L: 2587
							var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2588
							var4 = 0; // L: 2589
							class90 var13 = (class90)KitDefinition.findEnumerated(class165.method3400(), var3); // L: 2590
							if (var13 != null) { // L: 2591
								var4 = var13 != class90.field1107 ? 1 : 0; // L: 2592
							}

							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4; // L: 2594
							return 1; // L: 2595
						} else if (var0 != 3217 && var0 != 3219) { // L: 2597
							if (var0 == 3220) { // L: 2672
								class19.Interpreter_intStackSize -= 2; // L: 2673
								var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 2674
								var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2675
								class11.method108(var3, var4); // L: 2676
								return 1; // L: 2677
							} else if (var0 == 3221) { // L: 2679
								class19.Interpreter_intStackSize -= 6; // L: 2680
								var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 2681
								var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2682
								var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 2683
								var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 3]; // L: 2684
								var7 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 4]; // L: 2685
								int var8 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 5]; // L: 2686
								ArrayList var9 = new ArrayList(); // L: 2687
								var9.add(var3); // L: 2688
								var9.add(var4); // L: 2689
								FriendSystem.method1892(var9, var5, var6, var7, var8); // L: 2690
								return 1; // L: 2691
							} else if (var0 == 3222) { // L: 2693
								class19.Interpreter_intStackSize -= 4; // L: 2694
								var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 2695
								var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2696
								var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 2697
								var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 3]; // L: 2698
								WorldMapElement.method3742(var3, var4, var5, var6); // L: 2699
								return 1; // L: 2700
							} else {
								return 2; // L: 2702
							}
						} else {
							var10 = class91.field1120; // L: 2598
							var11 = class90.field1107; // L: 2599
							var16 = true; // L: 2600
							boolean var17 = true; // L: 2601
							if (var0 == 3217) { // L: 2602
								var7 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2603
								var10 = (class91)KitDefinition.findEnumerated(class47.method849(), var7); // L: 2604
								if (var10 == null) { // L: 2605
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2606
								}
							}

							if (var0 == 3219) { // L: 2609
								var7 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2610
								var11 = (class90)KitDefinition.findEnumerated(class165.method3400(), var7); // L: 2611
								if (var11 == null) { // L: 2612
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2613
								}
							}

							String var12;
							byte var18;
							if (var11 == class90.field1107) { // L: 2616
								switch(var10.field1111) { // L: 2617
								case 1:
								case 2:
								case 3:
									var18 = 0; // L: 2633
									var6 = 1; // L: 2634
									break; // L: 2635
								case 4:
									var18 = 0; // L: 2639
									var6 = Integer.MAX_VALUE; // L: 2640
									break; // L: 2641
								case 5:
									var18 = 0; // L: 2625
									var6 = 100; // L: 2626
									break;
								default:
									var12 = String.format("Unkown device option: %s.", var10.toString()); // L: 2620
									throw new RuntimeException(var12); // L: 2621
								}
							} else {
								switch(var11.field1103) { // L: 2646
								case 1:
									var18 = 0; // L: 2662
									var6 = 1; // L: 2663
									break;
								case 2:
								case 3:
								case 4:
									var18 = 0; // L: 2651
									var6 = 100; // L: 2652
									break; // L: 2653
								default:
									var12 = String.format("Unkown game option: %s.", var11.toString()); // L: 2657
									throw new RuntimeException(var12); // L: 2658
								}
							}

							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var18; // L: 2668
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var6; // L: 2669
							return 1; // L: 2670
						}
					} else {
						var10 = class91.field1120; // L: 2466
						var11 = class90.field1107; // L: 2467
						var16 = false; // L: 2468
						if (var0 == 3214) { // L: 2469
							var6 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2470
							var10 = (class91)KitDefinition.findEnumerated(class47.method849(), var6); // L: 2471
							if (var10 == null) { // L: 2472
								throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2473
							}
						}

						if (var0 == 3215) { // L: 2476
							var6 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2477
							var11 = (class90)KitDefinition.findEnumerated(class165.method3400(), var6); // L: 2478
							if (var11 == null) { // L: 2479
								throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2480
							}
						}

						if (var0 == 3210) { // L: 2483
							var6 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2484
							var10 = (class91)KitDefinition.findEnumerated(class47.method849(), var6); // L: 2485
							if (var10 == null) { // L: 2486
								var11 = (class90)KitDefinition.findEnumerated(class165.method3400(), var6); // L: 2487
								if (var11 == null) { // L: 2488
									throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2489
								}
							}
						} else if (var0 == 3182) { // L: 2493
							var10 = class91.field1114; // L: 2494
						} else if (var0 == 3204) { // L: 2496
							var11 = class90.field1100; // L: 2497
						} else if (var0 == 3206) { // L: 2499
							var11 = class90.field1101; // L: 2500
						} else if (var0 == 3208) { // L: 2502
							var11 = class90.field1098; // L: 2503
						}

						if (var11 == class90.field1107) { // L: 2505
							switch(var10.field1111) { // L: 2506
							case 1:
								var5 = NPC.clientPreferences.method2461() ? 1 : 0; // L: 2529
								break; // L: 2530
							case 2:
								var5 = NPC.clientPreferences.method2463() ? 1 : 0; // L: 2524
								break; // L: 2525
							case 3:
								var5 = NPC.clientPreferences.method2466() ? 1 : 0; // L: 2509
								break;
							case 4:
								var5 = NPC.clientPreferences.method2549(); // L: 2534
								break; // L: 2535
							case 5:
								var5 = class171.method3467(); // L: 2519
								break; // L: 2520
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2514
								throw new RuntimeException(var14); // L: 2515
							}
						} else {
							switch(var11.field1103) { // L: 2540
							case 1:
								var5 = NPC.clientPreferences.method2459() ? 1 : 0; // L: 2543
								break; // L: 2544
							case 2:
								var6 = NPC.clientPreferences.method2503(); // L: 2565
								var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2566
								break;
							case 3:
								var6 = NPC.clientPreferences.method2473(); // L: 2559
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2560
								break; // L: 2561
							case 4:
								var6 = NPC.clientPreferences.method2475(); // L: 2548
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2549
								break; // L: 2550
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2554
								throw new RuntimeException(var14); // L: 2555
							}
						}

						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var5; // L: 2571
						return 1; // L: 2572
					}
				} else {
					var10 = class91.field1120; // L: 2354
					var11 = class90.field1107; // L: 2355
					var5 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2356
					if (var0 == 3212) { // L: 2357
						var6 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2358
						var10 = (class91)KitDefinition.findEnumerated(class47.method849(), var6); // L: 2359
						if (var10 == null) { // L: 2360
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2361
						}
					}

					if (var0 == 3213) { // L: 2364
						var6 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2365
						var11 = (class90)KitDefinition.findEnumerated(class165.method3400(), var6); // L: 2366
						if (var11 == null) { // L: 2367
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2368
						}
					}

					if (var0 == 3209) { // L: 2371
						var6 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2372
						var10 = (class91)KitDefinition.findEnumerated(class47.method849(), var6); // L: 2373
						if (var10 == null) { // L: 2374
							var11 = (class90)KitDefinition.findEnumerated(class165.method3400(), var6); // L: 2375
							if (var11 == null) { // L: 2376
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2377
							}
						}
					} else if (var0 == 3181) { // L: 2381
						var10 = class91.field1114; // L: 2382
					} else if (var0 == 3203) { // L: 2384
						var11 = class90.field1100; // L: 2385
					} else if (var0 == 3205) { // L: 2387
						var11 = class90.field1101; // L: 2388
					} else if (var0 == 3207) { // L: 2390
						var11 = class90.field1098; // L: 2391
					}

					if (var11 == class90.field1107) { // L: 2393
						switch(var10.field1111) { // L: 2394
						case 1:
							NPC.clientPreferences.method2538(var5 == 1); // L: 2407
							break; // L: 2408
						case 2:
							NPC.clientPreferences.method2520(var5 == 1); // L: 2397
							break;
						case 3:
							NPC.clientPreferences.method2464(var5 == 1); // L: 2412
							break; // L: 2413
						case 4:
							if (var5 < 0) { // L: 2417
								var5 = 0;
							}

							NPC.clientPreferences.method2558(var5); // L: 2418
							break; // L: 2419
						case 5:
							class185.method3681(var5); // L: 2402
							break; // L: 2403
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2423
							throw new RuntimeException(var14); // L: 2424
						}
					} else {
						switch(var11.field1103) { // L: 2429
						case 1:
							NPC.clientPreferences.method2458(var5 == 1); // L: 2446
							break; // L: 2447
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2451
							var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2452
							InvDefinition.method3706(var6); // L: 2453
							break; // L: 2454
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2432
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2433
							class522.method9128(var6); // L: 2434
							break; // L: 2435
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2439
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2440
							ObjectSound.method1921(var6); // L: 2441
							break; // L: 2442
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2458
							throw new RuntimeException(var14); // L: 2459
						}
					}

					return 1; // L: 2463
				}
			}
		}
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-472926015"
	)
	static void method3221() {
		if (Client.field609 && class133.localPlayer != null) { // L: 12931
			int var0 = class133.localPlayer.pathX[0]; // L: 12932
			int var1 = class133.localPlayer.pathY[0]; // L: 12933
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 12934
				return;
			}

			class185.oculusOrbFocalPointX = class133.localPlayer.x; // L: 12935
			int var2 = Canvas.getTileHeight(class133.localPlayer.x, class133.localPlayer.y, class172.Client_plane) - Client.camFollowHeight; // L: 12936
			if (var2 < FloorUnderlayDefinition.field2198) { // L: 12937
				FloorUnderlayDefinition.field2198 = var2;
			}

			Skeleton.oculusOrbFocalPointY = class133.localPlayer.y; // L: 12938
			Client.field609 = false; // L: 12939
		}

	} // L: 12941
}
