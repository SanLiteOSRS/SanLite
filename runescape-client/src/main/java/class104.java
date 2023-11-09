import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public class class104 {
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 1403697419
	)
	static int field1398;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1400;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1383;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1385;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1386;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1391;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1388;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1389;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1390;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1395;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1392;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1394;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1387;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1393;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static final class104 field1396;
	@ObfuscatedName("ij")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2067595591
	)
	int field1397;

	static {
		field1400 = new class104(0); // L: 2385
		field1383 = new class104(1); // L: 2386
		field1385 = new class104(2); // L: 2387
		field1386 = new class104(3); // L: 2388
		field1391 = new class104(4); // L: 2389
		field1388 = new class104(5); // L: 2390
		field1389 = new class104(6); // L: 2391
		field1390 = new class104(7); // L: 2392
		field1395 = new class104(8); // L: 2393
		field1392 = new class104(9); // L: 2394
		field1394 = new class104(10); // L: 2395
		field1387 = new class104(11); // L: 2396
		field1393 = new class104(12); // L: 2397
		field1396 = new class104(13); // L: 2398
	}

	class104(int var1) {
		this.field1397 = var1; // L: 2402
	} // L: 2403

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1882053186"
	)
	static void method2650() {
		Client.mouseLastLastPressedTimeMillis = 1L; // L: 2488
		class271.mouseRecorder.index = 0; // L: 2489
		PacketBuffer.hasFocus = true; // L: 2490
		Client.hadFocus = true; // L: 2491
		Client.field679 = -1L; // L: 2492
		class37.reflectionChecks = new IterableNodeDeque(); // L: 2494
		Client.packetWriter.clearBuffer(); // L: 2496
		Client.packetWriter.packetBuffer.offset = 0; // L: 2497
		Client.packetWriter.serverPacket = null; // L: 2498
		Client.packetWriter.field1431 = null; // L: 2499
		Client.packetWriter.field1432 = null; // L: 2500
		Client.packetWriter.field1433 = null; // L: 2501
		Client.packetWriter.serverPacketLength = 0; // L: 2502
		Client.packetWriter.field1420 = 0; // L: 2503
		Client.rebootTimer = 0; // L: 2504
		Client.logoutTimer = 0; // L: 2505
		Client.hintArrowType = 0; // L: 2506
		WorldMapSectionType.method5230(); // L: 2507
		Player.method2333(0); // L: 2508
		class319.method6378(); // L: 2509
		Client.isItemSelected = 0; // L: 2510
		Client.isSpellSelected = false; // L: 2511
		Client.soundEffectCount = 0; // L: 2512
		Client.camAngleY = 0; // L: 2513
		Client.oculusOrbState = 0; // L: 2514
		GameEngine.field241 = null; // L: 2515
		Client.minimapState = 0; // L: 2516
		Client.field619 = -1; // L: 2517
		Client.destinationX = 0; // L: 2518
		Client.destinationY = 0; // L: 2519
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2520
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2521
		Client.npcCount = 0; // L: 2522
		Language.method6695(); // L: 2523

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2524
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 65536; ++var0) { // L: 2525
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2526
		Client.projectiles.clear(); // L: 2527
		Client.graphicsObjects.clear(); // L: 2528

		for (var0 = 0; var0 < 4; ++var0) { // L: 2529
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2530
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2531
					Client.groundItems[var0][var4][var2] = null; // L: 2532
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2536
		DefaultsGroup.friendSystem.clear(); // L: 2537

		for (var0 = 0; var0 < VarpDefinition.field1922; ++var0) { // L: 2538
			VarpDefinition var1 = class109.VarpDefinition_get(var0); // L: 2539
			if (var1 != null) { // L: 2540
				Varps.Varps_temp[var0] = 0; // L: 2541
				Varps.Varps_main[var0] = 0; // L: 2542
			}
		}

		WorldMapArea.varcs.clearTransient(); // L: 2545
		Client.followerIndex = -1; // L: 2546
		if (Client.rootInterface != -1) { // L: 2547
			HitSplatDefinition.method3850(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2548
			class9.closeInterface(var3, true); // L: 2549
		}

		Client.rootInterface = -1; // L: 2551
		Client.interfaceParents = new NodeHashTable(8); // L: 2552
		Client.meslayerContinueWidget = null; // L: 2553
		WorldMapSectionType.method5230(); // L: 2554
		Client.playerAppearance.method5850((int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2555

		for (var0 = 0; var0 < 8; ++var0) { // L: 2556
			Client.playerMenuActions[var0] = null; // L: 2557
			Client.playerOptionsPriorities[var0] = false; // L: 2558
		}

		class32.method459(); // L: 2560
		Client.isLoading = true; // L: 2561

		for (var0 = 0; var0 < 100; ++var0) { // L: 2562
			Client.field731[var0] = true;
		}

		PacketBufferNode var5 = class136.getPacketBufferNode(ClientPacket.field3057, Client.packetWriter.isaacCipher); // L: 2565
		var5.packetBuffer.writeByte(Message.getWindowedMode()); // L: 2566
		var5.packetBuffer.writeShort(CollisionMap.canvasWidth); // L: 2567
		var5.packetBuffer.writeShort(Language.canvasHeight); // L: 2568
		Client.packetWriter.addNode(var5); // L: 2569
		class281.friendsChatManager = null; // L: 2571
		class20.guestClanSettings = null; // L: 2572
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2573
		VarcInt.guestClanChannel = null; // L: 2574
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2575

		for (var0 = 0; var0 < 8; ++var0) { // L: 2576
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		ItemContainer.grandExchangeEvents = null; // L: 2577
	} // L: 2578
}
