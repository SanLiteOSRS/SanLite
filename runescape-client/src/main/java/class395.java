import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public final class class395 implements Comparable {
	@ObfuscatedName("aj")
	Object field4491;
	@ObfuscatedName("al")
	Object field4489;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -1933173505781394141L
	)
	long field4488;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 5893522670368200607L
	)
	long field4490;

	class395(Object var1, Object var2) {
		this.field4491 = var1; // L: 10
		this.field4489 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpn;B)I",
		garbageValue = "119"
	)
	int method7431(class395 var1) {
		if (this.field4490 < var1.field4490) {
			return -1; // L: 15
		} else {
			return this.field4490 > var1.field4490 ? 1 : 0; // L: 16 17
		}
	}

	public int compareTo(Object var1) {
		return this.method7431((class395)var1);
	}

	public int hashCode() {
		return this.field4489.hashCode(); // L: 28
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class395) { // L: 22
			return this.field4489.equals(((class395)var1).field4489);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhv;",
		garbageValue = "120"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferTotalQuantityComparator.KitDefinition_archive.takeFile(3, var0); // L: 31
			var1 = new KitDefinition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	static void method7439() {
		Client.mouseLastLastPressedTimeMillis = 1L; // L: 2622
		class212.mouseRecorder.index = 0; // L: 2623
		Varps.hasFocus = true; // L: 2624
		Client.hadFocus = true; // L: 2625
		Client.field622 = -1L; // L: 2626
		class36.reflectionChecks = new IterableNodeDeque(); // L: 2628
		Client.packetWriter.clearBuffer(); // L: 2630
		Client.packetWriter.packetBuffer.offset = 0; // L: 2631
		Client.packetWriter.serverPacket = null; // L: 2632
		Client.packetWriter.field1388 = null; // L: 2633
		Client.packetWriter.field1389 = null; // L: 2634
		Client.packetWriter.field1390 = null; // L: 2635
		Client.packetWriter.serverPacketLength = 0; // L: 2636
		Client.packetWriter.field1383 = 0; // L: 2637
		Client.rebootTimer = 0; // L: 2638
		Client.logoutTimer = 0; // L: 2639
		Client.hintArrowType = 0; // L: 2640
		class60.method1159(); // L: 2641
		MouseHandler.MouseHandler_idleCycles = 0; // L: 2643
		class133.method3039(); // L: 2645
		Client.isItemSelected = 0; // L: 2646
		Client.isSpellSelected = false; // L: 2647
		Client.soundEffectCount = 0; // L: 2648
		Client.camAngleY = 0; // L: 2649
		Client.oculusOrbState = 0; // L: 2650
		Language.field4294 = null; // L: 2651
		Client.minimapState = 0; // L: 2652
		Client.field720 = -1; // L: 2653
		Client.destinationX = 0; // L: 2654
		Client.destinationY = 0; // L: 2655
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2656
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2657
		Client.npcCount = 0; // L: 2658
		DefaultsGroup.method7760(); // L: 2659

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2660
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 65536; ++var0) { // L: 2661
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2662
		Client.projectiles.clear(); // L: 2663
		Client.graphicsObjects.clear(); // L: 2664

		for (var0 = 0; var0 < 4; ++var0) { // L: 2665
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2666
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2667
					Client.groundItems[var0][var4][var2] = null; // L: 2668
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2672
		class6.friendSystem.clear(); // L: 2673

		for (var0 = 0; var0 < VarpDefinition.field1890; ++var0) { // L: 2674
			VarpDefinition var1 = GameEngine.VarpDefinition_get(var0); // L: 2675
			if (var1 != null) { // L: 2676
				Varps.Varps_temp[var0] = 0; // L: 2677
				Varps.Varps_main[var0] = 0; // L: 2678
			}
		}

		class248.varcs.clearTransient(); // L: 2681
		Client.followerIndex = -1; // L: 2682
		if (Client.rootInterface != -1) { // L: 2683
			class289.method5486(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2684
			class17.closeInterface(var3, true); // L: 2685
		}

		Client.rootInterface = -1; // L: 2687
		Client.interfaceParents = new NodeHashTable(8); // L: 2688
		Client.meslayerContinueWidget = null; // L: 2689
		class60.method1159(); // L: 2690
		Client.playerAppearance.method5784((int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2691

		for (var0 = 0; var0 < 8; ++var0) { // L: 2692
			Client.playerMenuActions[var0] = null; // L: 2693
			Client.playerOptionsPriorities[var0] = false; // L: 2694
		}

		class206.method4067(); // L: 2696
		Client.isLoading = true; // L: 2697

		for (var0 = 0; var0 < 100; ++var0) { // L: 2698
			Client.field722[var0] = true;
		}

		PacketBufferNode var5 = UserComparator9.getPacketBufferNode(ClientPacket.field3068, Client.packetWriter.isaacCipher); // L: 2701
		var5.packetBuffer.writeByte(class7.getWindowedMode()); // L: 2702
		var5.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2703
		var5.packetBuffer.writeShort(class143.canvasHeight); // L: 2704
		Client.packetWriter.addNode(var5); // L: 2705
		ReflectionCheck.friendsChatManager = null; // L: 2707
		WorldMapCacheName.guestClanSettings = null; // L: 2708
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2709
		class19.guestClanChannel = null; // L: 2710
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2711

		for (var0 = 0; var0 < 8; ++var0) { // L: 2712
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		Projectile.grandExchangeEvents = null; // L: 2713
	} // L: 2714
}
