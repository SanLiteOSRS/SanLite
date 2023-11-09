import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dc")
public class class122 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1091024745
	)
	public final int field1491;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	public class122 field1500;
	@ObfuscatedName("v")
	float[][] field1488;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lpb;"
	)
	final class417[] field1489;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Lpb;"
	)
	class417[] field1490;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lpb;"
	)
	class417[] field1495;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	class417 field1496;
	@ObfuscatedName("n")
	boolean field1493;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	class417 field1494;
	@ObfuscatedName("k")
	boolean field1486;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	class417 field1487;
	@ObfuscatedName("r")
	float[][] field1497;
	@ObfuscatedName("b")
	float[][] field1498;
	@ObfuscatedName("m")
	float[][] field1492;

	@ObfuscatedSignature(
		descriptor = "(ILrd;Z)V"
	)
	public class122(int var1, Buffer var2, boolean var3) {
		this.field1496 = new class417(); // L: 13
		this.field1493 = true; // L: 14
		this.field1494 = new class417(); // L: 15
		this.field1486 = true; // L: 16
		this.field1487 = new class417(); // L: 17
		this.field1491 = var2.readShort(); // L: 23
		this.field1489 = new class417[var1]; // L: 24
		this.field1490 = new class417[this.field1489.length]; // L: 25
		this.field1495 = new class417[this.field1489.length]; // L: 26
		this.field1488 = new float[this.field1489.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1489.length; ++var4) { // L: 28
			this.field1489[var4] = new class417(var2, var3); // L: 29
			this.field1488[var4][0] = var2.method8764(); // L: 30
			this.field1488[var4][1] = var2.method8764(); // L: 31
			this.field1488[var4][2] = var2.method8764(); // L: 32
		}

		this.method3013(); // L: 34
	} // L: 35

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1603384529"
	)
	void method3013() {
		this.field1497 = new float[this.field1489.length][3];
		this.field1498 = new float[this.field1489.length][3];
		this.field1492 = new float[this.field1489.length][3];
		class417 var1;
		synchronized(class417.field4641) {
			if (class417.field4643 == 0) { // L: 44
				var1 = new class417();
			} else {
				class417.field4641[--class417.field4643].method7964(); // L: 46
				var1 = class417.field4641[class417.field4643]; // L: 47
			}
		}

		class417 var2 = var1; // L: 51

		for (int var5 = 0; var5 < this.field1489.length; ++var5) { // L: 52
			class417 var4 = this.method2998(var5); // L: 53
			var2.method7915(var4); // L: 54
			var2.method7922(); // L: 55
			this.field1497[var5] = var2.method7912(); // L: 56
			this.field1498[var5][0] = var4.field4644[12]; // L: 57
			this.field1498[var5][1] = var4.field4644[13]; // L: 58
			this.field1498[var5][2] = var4.field4644[14]; // L: 59
			this.field1492[var5] = var4.method7924(); // L: 60
		}

		var2.method7908(); // L: 62
	} // L: 63

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lpb;",
		garbageValue = "1996728703"
	)
	class417 method2998(int var1) {
		return this.field1489[var1]; // L: 66
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lpb;",
		garbageValue = "714615016"
	)
	class417 method3015(int var1) {
		if (this.field1490[var1] == null) { // L: 70
			this.field1490[var1] = new class417(this.method2998(var1)); // L: 71
			if (this.field1500 != null) { // L: 72
				this.field1490[var1].method7914(this.field1500.method3015(var1)); // L: 73
			} else {
				this.field1490[var1].method7914(class417.field4646); // L: 76
			}
		}

		return this.field1490[var1]; // L: 79
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpb;",
		garbageValue = "-28"
	)
	class417 method3017(int var1) {
		if (this.field1495[var1] == null) { // L: 83
			this.field1495[var1] = new class417(this.method3015(var1)); // L: 84
			this.field1495[var1].method7922(); // L: 85
		}

		return this.field1495[var1]; // L: 87
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I)V",
		garbageValue = "832632914"
	)
	void method3000(class417 var1) {
		this.field1496.method7915(var1); // L: 91
		this.field1493 = true; // L: 92
		this.field1486 = true; // L: 93
	} // L: 94

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lpb;",
		garbageValue = "1963000555"
	)
	class417 method3001() {
		return this.field1496; // L: 97
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lpb;",
		garbageValue = "1304604327"
	)
	class417 method3005() {
		if (this.field1493) { // L: 101
			this.field1494.method7915(this.method3001()); // L: 102
			if (this.field1500 != null) { // L: 103
				this.field1494.method7914(this.field1500.method3005()); // L: 104
			}

			this.field1493 = false; // L: 106
		}

		return this.field1494; // L: 108
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpb;",
		garbageValue = "20"
	)
	public class417 method3003(int var1) {
		if (this.field1486) { // L: 112
			this.field1487.method7915(this.method3017(var1)); // L: 113
			this.field1487.method7914(this.method3005()); // L: 114
			this.field1486 = false; // L: 115
		}

		return this.field1487; // L: 117
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1657522001"
	)
	float[] method3004(int var1) {
		return this.field1497[var1]; // L: 121
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1874306129"
	)
	float[] method3012(int var1) {
		return this.field1498[var1]; // L: 125
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "38"
	)
	float[] method3006(int var1) {
		return this.field1492[var1]; // L: 129
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lgi;",
		garbageValue = "-1237924055"
	)
	public static HealthBarDefinition method3028(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = class303.HealthBarDefinition_archive.takeFile(33, var0); // L: 39
			var1 = new HealthBarDefinition(); // L: 40
			if (var2 != null) { // L: 41
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0); // L: 42
			return var1; // L: 43
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldx;",
		garbageValue = "-13"
	)
	static class127[] method3029() {
		return new class127[]{class127.field1566, class127.field1559, class127.field1568, class127.field1560, class127.field1562, class127.field1578, class127.field1564, class127.field1565, class127.field1561, class127.field1567, class127.field1563, class127.field1569, class127.field1570, class127.field1571, class127.field1572, class127.field1573, class127.field1574}; // L: 64
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-955503656"
	)
	static void method3030(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 266
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2); // L: 267
		if (var4 != null) { // L: 268
			NetCache.NetCache_pendingWritesQueue.addLast(var4); // L: 269
		}
	} // L: 270

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "593870439"
	)
	static int method3027(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2255
			class302.Interpreter_intStackSize -= 3; // L: 2256
			class275.queueSoundEffect(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]); // L: 2257
			return 1; // L: 2258
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2260
			SpriteMask.playSong(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 2261
			return 1; // L: 2262
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2264
			class302.Interpreter_intStackSize -= 2; // L: 2265
			ScriptEvent.method2321(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]); // L: 2266
			return 1; // L: 2267
		} else {
			class86 var3;
			class85 var4;
			int var5;
			int var6;
			String var7;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2269
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2381
					return var0 == 3211 ? 1 : 2; // L: 2490 2491 2493
				} else {
					var3 = class86.field1095; // L: 2382
					var4 = class85.field1089; // L: 2383
					boolean var8 = false; // L: 2384
					if (var0 == 3214) { // L: 2385
						var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2386
						var3 = (class86)class4.findEnumerated(PacketBufferNode.method5551(), var6); // L: 2387
						if (var3 == null) { // L: 2388
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2389
						}
					}

					if (var0 == 3215) { // L: 2392
						var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2393
						var4 = (class85)class4.findEnumerated(class135.method3131(), var6); // L: 2394
						if (var4 == null) { // L: 2395
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2396
						}
					}

					if (var0 == 3210) { // L: 2399
						var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2400
						var3 = (class86)class4.findEnumerated(PacketBufferNode.method5551(), var6); // L: 2401
						if (var3 == null) { // L: 2402
							var4 = (class85)class4.findEnumerated(class135.method3131(), var6); // L: 2403
							if (var4 == null) { // L: 2404
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2405
							}
						}
					} else if (var0 == 3182) { // L: 2409
						var3 = class86.field1102; // L: 2410
					} else if (var0 == 3204) { // L: 2412
						var4 = class85.field1084; // L: 2413
					} else if (var0 == 3206) { // L: 2415
						var4 = class85.field1092; // L: 2416
					} else if (var0 == 3208) { // L: 2418
						var4 = class85.field1086; // L: 2419
					}

					if (var4 == class85.field1089) { // L: 2421
						switch(var3.field1103) { // L: 2422
						case 1:
							var5 = PacketWriter.clientPreferences.method2484() ? 1 : 0; // L: 2435
							break; // L: 2436
						case 2:
							var5 = PacketWriter.clientPreferences.method2570() ? 1 : 0; // L: 2430
							break; // L: 2431
						case 3:
							var5 = PacketWriter.clientPreferences.method2489() ? 1 : 0; // L: 2425
							break;
						case 4:
							var5 = PacketWriter.clientPreferences.method2491(); // L: 2440
							break;
						case 5:
							var5 = class463.method8510(); // L: 2450
							break; // L: 2451
						default:
							var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2445
							throw new RuntimeException(var7); // L: 2446
						}
					} else {
						switch(var4.field1087) { // L: 2456
						case 1:
							var5 = PacketWriter.clientPreferences.method2572() ? 1 : 0; // L: 2470
							break; // L: 2471
						case 2:
							var6 = PacketWriter.clientPreferences.method2495(); // L: 2475
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2476
							break; // L: 2477
						case 3:
							var6 = PacketWriter.clientPreferences.method2497(); // L: 2459
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2460
							break; // L: 2461
						case 4:
							var6 = PacketWriter.clientPreferences.method2499(); // L: 2481
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2482
							break; // L: 2483
						default:
							var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2465
							throw new RuntimeException(var7); // L: 2466
						}
					}

					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5; // L: 2487
					return 1; // L: 2488
				}
			} else {
				var3 = class86.field1095; // L: 2270
				var4 = class85.field1089; // L: 2271
				var5 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2272
				if (var0 == 3212) { // L: 2273
					var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2274
					var3 = (class86)class4.findEnumerated(PacketBufferNode.method5551(), var6); // L: 2275
					if (var3 == null) { // L: 2276
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2277
					}
				}

				if (var0 == 3213) { // L: 2280
					var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2281
					var4 = (class85)class4.findEnumerated(class135.method3131(), var6); // L: 2282
					if (var4 == null) { // L: 2283
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2284
					}
				}

				if (var0 == 3209) { // L: 2287
					var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2288
					var3 = (class86)class4.findEnumerated(PacketBufferNode.method5551(), var6); // L: 2289
					if (var3 == null) { // L: 2290
						var4 = (class85)class4.findEnumerated(class135.method3131(), var6); // L: 2291
						if (var4 == null) { // L: 2292
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2293
						}
					}
				} else if (var0 == 3181) { // L: 2297
					var3 = class86.field1102; // L: 2298
				} else if (var0 == 3203) { // L: 2300
					var4 = class85.field1084; // L: 2301
				} else if (var0 == 3205) { // L: 2303
					var4 = class85.field1092; // L: 2304
				} else if (var0 == 3207) { // L: 2306
					var4 = class85.field1086; // L: 2307
				}

				if (var4 == class85.field1089) { // L: 2309
					switch(var3.field1103) { // L: 2310
					case 1:
						PacketWriter.clientPreferences.method2483(var5 == 1); // L: 2318
						break; // L: 2319
					case 2:
						PacketWriter.clientPreferences.method2563(var5 == 1); // L: 2323
						break; // L: 2324
					case 3:
						PacketWriter.clientPreferences.method2485(var5 == 1); // L: 2339
						break; // L: 2340
					case 4:
						if (var5 < 0) { // L: 2333
							var5 = 0;
						}

						PacketWriter.clientPreferences.method2490(var5); // L: 2334
						break; // L: 2335
					case 5:
						LoginScreenAnimation.method2463(var5); // L: 2313
						break;
					default:
						var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2328
						throw new RuntimeException(var7); // L: 2329
					}
				} else {
					switch(var4.field1087) { // L: 2345
					case 1:
						PacketWriter.clientPreferences.method2551(var5 == 1); // L: 2355
						break; // L: 2356
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2348
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2349
						Player.method2369(var6); // L: 2350
						break; // L: 2351
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2372
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2373
						class203.method4128(var6); // L: 2374
						break; // L: 2375
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2365
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2366
						NPC.method2678(var6); // L: 2367
						break; // L: 2368
					default:
						var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2360
						throw new RuntimeException(var7); // L: 2361
					}
				}

				return 1; // L: 2379
			}
		}
	}
}
