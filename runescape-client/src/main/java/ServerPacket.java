import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2370;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2351;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2431;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2353;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2354;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2355;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2356;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2357;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2358;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2359;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2432;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2426;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2362;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2363;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2422;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2380;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2366;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2364;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2368;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2369;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2352;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2433;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2367;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2373;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2374;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2428;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2376;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2377;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2378;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2379;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2393;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2392;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2446;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2383;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2384;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2385;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2361;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2387;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2409;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2382;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2413;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2391;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2375;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2372;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2388;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2436;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2396;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2390;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2398;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2399;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2400;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2401;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2402;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2403;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2394;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2405;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2406;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2407;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2408;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2448;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2410;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2411;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2412;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2381;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2414;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2415;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2371;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2417;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2418;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2419;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2395;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2421;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2386;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2423;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2424;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2425;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2416;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2427;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2404;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2350;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2365;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2434;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2430;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2360;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2397;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2435;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2429;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2437;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2438;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2439;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2389;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2441;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2442;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2443;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2444;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2445;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final ServerPacket field2440;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -634167591
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -631403881
	)
	@Export("length")
	public final int length;

	static {
		field2370 = new ServerPacket(0, 14);
		field2351 = new ServerPacket(1, 0);
		field2431 = new ServerPacket(2, -2);
		field2353 = new ServerPacket(3, 2);
		field2354 = new ServerPacket(4, -2);
		field2355 = new ServerPacket(5, 3);
		field2356 = new ServerPacket(6, 6);
		field2357 = new ServerPacket(7, 0);
		field2358 = new ServerPacket(8, 1);
		field2359 = new ServerPacket(9, 2);
		field2432 = new ServerPacket(10, 2);
		field2426 = new ServerPacket(11, -2);
		field2362 = new ServerPacket(12, -2);
		field2363 = new ServerPacket(13, 0);
		field2422 = new ServerPacket(14, 1);
		field2380 = new ServerPacket(15, -2);
		field2366 = new ServerPacket(16, -2);
		field2364 = new ServerPacket(17, 8);
		field2368 = new ServerPacket(18, -2);
		field2369 = new ServerPacket(19, 1);
		field2352 = new ServerPacket(20, 6);
		field2433 = new ServerPacket(21, 4);
		field2367 = new ServerPacket(22, 0);
		field2373 = new ServerPacket(23, 7);
		field2374 = new ServerPacket(24, 1);
		field2428 = new ServerPacket(25, 5);
		field2376 = new ServerPacket(26, -2);
		field2377 = new ServerPacket(27, -2);
		field2378 = new ServerPacket(28, 20);
		field2379 = new ServerPacket(29, 6);
		field2393 = new ServerPacket(30, -1);
		field2392 = new ServerPacket(31, 6);
		field2446 = new ServerPacket(32, 2);
		field2383 = new ServerPacket(33, 1);
		field2384 = new ServerPacket(34, 6);
		field2385 = new ServerPacket(35, -1);
		field2361 = new ServerPacket(36, -2);
		field2387 = new ServerPacket(37, 8);
		field2409 = new ServerPacket(38, 6);
		field2382 = new ServerPacket(39, -1);
		field2413 = new ServerPacket(40, 8);
		field2391 = new ServerPacket(41, 4);
		field2375 = new ServerPacket(42, 6);
		field2372 = new ServerPacket(43, 4);
		field2388 = new ServerPacket(44, 2);
		field2436 = new ServerPacket(45, 4);
		field2396 = new ServerPacket(46, 4);
		field2390 = new ServerPacket(47, 12);
		field2398 = new ServerPacket(48, -1);
		field2399 = new ServerPacket(49, 2);
		field2400 = new ServerPacket(50, 6);
		field2401 = new ServerPacket(51, 0);
		field2402 = new ServerPacket(52, 28);
		field2403 = new ServerPacket(53, 10);
		field2394 = new ServerPacket(54, 6);
		field2405 = new ServerPacket(55, 5);
		field2406 = new ServerPacket(56, -2);
		field2407 = new ServerPacket(57, 2);
		field2408 = new ServerPacket(58, -2);
		field2448 = new ServerPacket(59, 7);
		field2410 = new ServerPacket(60, 0);
		field2411 = new ServerPacket(61, 3);
		field2412 = new ServerPacket(62, 4);
		field2381 = new ServerPacket(63, -2);
		field2414 = new ServerPacket(64, 2);
		field2415 = new ServerPacket(65, 6);
		field2371 = new ServerPacket(66, -1);
		field2417 = new ServerPacket(67, 6);
		field2418 = new ServerPacket(68, -2);
		field2419 = new ServerPacket(69, 0);
		field2395 = new ServerPacket(70, 10);
		field2421 = new ServerPacket(71, -2);
		field2386 = new ServerPacket(72, 4);
		field2423 = new ServerPacket(73, 8);
		field2424 = new ServerPacket(74, -2);
		field2425 = new ServerPacket(75, 5);
		field2416 = new ServerPacket(76, -2);
		field2427 = new ServerPacket(77, 15);
		field2404 = new ServerPacket(78, 5);
		field2350 = new ServerPacket(79, 2);
		field2365 = new ServerPacket(80, 1);
		field2434 = new ServerPacket(81, -1);
		field2430 = new ServerPacket(82, 5);
		field2360 = new ServerPacket(83, 2);
		field2397 = new ServerPacket(84, -2);
		field2435 = new ServerPacket(85, -2);
		field2429 = new ServerPacket(86, -2);
		field2437 = new ServerPacket(87, -2);
		field2438 = new ServerPacket(88, -1);
		field2439 = new ServerPacket(89, -1);
		field2389 = new ServerPacket(90, -1);
		field2441 = new ServerPacket(91, 0);
		field2442 = new ServerPacket(92, 0);
		field2443 = new ServerPacket(93, -2);
		field2444 = new ServerPacket(94, -2);
		field2445 = new ServerPacket(95, -2);
		field2440 = new ServerPacket(96, -2);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-1347419990"
	)
	static final boolean method3902(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(Ljava/net/Socket;IIB)Lli;",
		garbageValue = "37"
	)
	public static AbstractSocket method3901(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-1900201533"
	)
	static final void method3903(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0;
		boolean var4 = false;
		int var5 = -1;
		int var6 = -1;
		int var7 = Players.Players_count;
		int[] var8 = Players.Players_indices;

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) {
			Object var10;
			if (var9 < var7) {
				var10 = Client.players[var8[var9]];
				if (var8[var9] == Client.combatTargetPlayerIndex) {
					var4 = true;
					var5 = var9;
					continue;
				}

				if (var10 == Varcs.localPlayer) {
					var6 = var9;
					continue;
				}
			} else {
				var10 = Client.npcs[Client.npcIndices[var9 - var7]];
			}

			class311.drawActor2d((Actor)var10, var9, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var6 != -1) {
			class311.drawActor2d(Varcs.localPlayer, var6, var0, var1, var2, var3);
		}

		if (var4) {
			class311.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3);
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) {
			int var19 = Client.overheadTextXs[var9];
			int var11 = Client.overheadTextYs[var9];
			int var12 = Client.overheadTextXOffsets[var9];
			int var13 = Client.overheadTextAscents[var9];
			boolean var14 = true;

			while (var14) {
				var14 = false;

				for (int var15 = 0; var15 < var9; ++var15) {
					if (var11 + 2 > Client.overheadTextYs[var15] - Client.overheadTextAscents[var15] && var11 - var13 < Client.overheadTextYs[var15] + 2 && var19 - var12 < Client.overheadTextXs[var15] + Client.overheadTextXOffsets[var15] && var19 + var12 > Client.overheadTextXs[var15] - Client.overheadTextXOffsets[var15] && Client.overheadTextYs[var15] - Client.overheadTextAscents[var15] < var11) {
						var11 = Client.overheadTextYs[var15] - Client.overheadTextAscents[var15];
						var14 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9];
			Client.viewportTempY = Client.overheadTextYs[var9] = var11;
			String var20 = Client.overheadText[var9];
			if (Client.chatEffects == 0) {
				int var16 = 16776960;
				if (Client.overheadTextColors[var9] < 6) {
					var16 = Client.field821[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) {
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) {
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) {
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) {
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) {
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) {
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) {
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var9] == 0) {
					class368.fontBold12.drawCentered(var20, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) {
					class368.fontBold12.drawCenteredWave(var20, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) {
					class368.fontBold12.drawCenteredWave2(var20, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) {
					class368.fontBold12.drawCenteredShake(var20, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) {
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (class368.fontBold12.stringWidth(var20) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					class368.fontBold12.draw(var20, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var9] == 5) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					int var18 = 0;
					if (var17 < 25) {
						var18 = var17 - 25;
					} else if (var17 > 125) {
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class368.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					class368.fontBold12.drawCentered(var20, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				class368.fontBold12.drawCentered(var20, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

	}
}
