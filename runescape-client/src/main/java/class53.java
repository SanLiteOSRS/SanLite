import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
public class class53 extends Node {
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -977763419
	)
	static int field350;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	class47 field351;

	public class53() {
		this.field351 = null; // L: 9
	} // L: 10

	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) { // L: 13
			this.field351 = new class47(var1, (RawSound)null); // L: 16
		}
	} // L: 14 17

	@ObfuscatedSignature(
		descriptor = "(Lbt;)V"
	)
	public class53(RawSound var1) {
		this.field351 = new class47((VorbisSample)null, var1); // L: 20
	} // L: 21

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-925391311"
	)
	public boolean method1096() {
		return this.field351 == null; // L: 24
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lbt;",
		garbageValue = "1961444927"
	)
	public RawSound method1095() {
		if (this.field351 != null && this.field351.field316.tryLock()) { // L: 28
			RawSound var1;
			try {
				var1 = this.method1097(); // L: 31
			} finally {
				this.field351.field316.unlock(); // L: 34
			}

			return var1; // L: 36
		} else {
			return null; // L: 38
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lbt;",
		garbageValue = "-96589694"
	)
	public RawSound method1094() {
		if (this.field351 != null) { // L: 42
			this.field351.field316.lock(); // L: 43

			RawSound var1;
			try {
				var1 = this.method1097(); // L: 46
			} finally {
				this.field351.field316.unlock(); // L: 49
			}

			return var1; // L: 51
		} else {
			return null; // L: 53
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lbt;",
		garbageValue = "-1970113950"
	)
	RawSound method1097() {
		if (this.field351.field317 == null) { // L: 57
			this.field351.field317 = this.field351.field315.toRawSound((int[])null); // L: 58
			this.field351.field315 = null; // L: 59
		}

		return this.field351.field317; // L: 61
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1624794329"
	)
	static void method1110() {
		Client.mouseLastLastPressedTimeMillis = 1L; // L: 2603
		Message.mouseRecorder.index = 0; // L: 2604
		class357.hasFocus = true; // L: 2605
		Client.hadFocus = true; // L: 2606
		Client.field638 = -1L; // L: 2607
		class36.reflectionChecks = new IterableNodeDeque(); // L: 2609
		Client.packetWriter.clearBuffer(); // L: 2611
		Client.packetWriter.packetBuffer.offset = 0; // L: 2612
		Client.packetWriter.serverPacket = null; // L: 2613
		Client.packetWriter.field1414 = null; // L: 2614
		Client.packetWriter.field1409 = null; // L: 2615
		Client.packetWriter.field1416 = null; // L: 2616
		Client.packetWriter.serverPacketLength = 0; // L: 2617
		Client.packetWriter.field1412 = 0; // L: 2618
		Client.rebootTimer = 0; // L: 2619
		Client.logoutTimer = 0; // L: 2620
		Client.hintArrowType = 0; // L: 2621
		class160.method3434(); // L: 2622
		WorldMapEvent.method5097(0); // L: 2623
		LoginScreenAnimation.method2531(); // L: 2624
		Client.isItemSelected = 0; // L: 2625
		Client.isSpellSelected = false; // L: 2626
		Client.soundEffectCount = 0; // L: 2627
		Client.camAngleY = 0; // L: 2628
		Client.titleLoadingStage = 0; // L: 2629
		MidiPcmStream.field3456 = null; // L: 2630
		Client.minimapState = 0; // L: 2631
		Client.field601 = -1; // L: 2632
		Client.destinationX = 0; // L: 2633
		Client.destinationY = 0; // L: 2634
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2635
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2636
		Client.npcCount = 0; // L: 2637
		Players.Players_count = 0; // L: 2639

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2640
			Players.field1357[var0] = null; // L: 2641
			Players.field1356[var0] = class228.field2409; // L: 2642
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 2645
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 65536; ++var0) { // L: 2646
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2647
		Client.projectiles.clear(); // L: 2648
		Client.graphicsObjects.clear(); // L: 2649

		for (var0 = 0; var0 < 4; ++var0) { // L: 2650
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2651
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2652
					Client.groundItems[var0][var4][var2] = null; // L: 2653
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2657
		class12.friendSystem.clear(); // L: 2658
		if (VarpDefinition.field1815 > 5000) { // L: 2659
		}

		for (var0 = 0; var0 < VarpDefinition.field1815; ++var0) { // L: 2660
			VarpDefinition var1 = FloorOverlayDefinition.VarpDefinition_get(var0); // L: 2661
			if (var1 != null) { // L: 2662
				Varps.Varps_temp[var0] = 0; // L: 2663
				Varps.Varps_main[var0] = 0; // L: 2664
			}
		}

		class176.varcs.clearTransient(); // L: 2667
		Client.followerIndex = -1; // L: 2668
		if (Client.rootInterface != -1) { // L: 2669
			HealthBarDefinition.field1877.method6283(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2670
			class302.closeInterface(var3, true); // L: 2671
		}

		Client.rootInterface = -1; // L: 2673
		Client.interfaceParents = new NodeHashTable(8); // L: 2674
		Client.meslayerContinueWidget = null; // L: 2675
		class160.method3434(); // L: 2676
		Client.playerAppearance.method6314((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2677

		for (var0 = 0; var0 < 8; ++var0) { // L: 2678
			Client.playerMenuActions[var0] = null; // L: 2679
			Client.playerOptionsPriorities[var0] = false; // L: 2680
		}

		class59.method1185(); // L: 2682
		Client.field498 = true; // L: 2683

		for (var0 = 0; var0 < 100; ++var0) { // L: 2684
			Client.field708[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) { // L: 2686
			PacketBufferNode var5 = class113.getPacketBufferNode(ClientPacket.field3209, Client.packetWriter.isaacCipher); // L: 2688
			var5.packetBuffer.writeByte(ApproximateRouteStrategy.getWindowedMode()); // L: 2689
			var5.packetBuffer.writeShort(Language.canvasWidth); // L: 2690
			var5.packetBuffer.writeShort(class47.canvasHeight); // L: 2691
			Client.packetWriter.addNode(var5); // L: 2692
		}

		class20.friendsChatManager = null; // L: 2694
		class478.guestClanSettings = null; // L: 2695
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2696
		ItemContainer.guestClanChannel = null; // L: 2697
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2698

		for (var0 = 0; var0 < 8; ++var0) { // L: 2699
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class6.grandExchangeEvents = null; // L: 2700
		Client.field494 = false; // L: 2701
	} // L: 2702

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "50042051"
	)
	static void method1111() {
		if (Client.isSpellSelected) { // L: 10222
			Widget var0 = HealthBarDefinition.field1877.method6279(class348.field3826, Client.field534); // L: 10223
			if (var0 != null && var0.onTargetLeave != null) { // L: 10224
				ScriptEvent var1 = new ScriptEvent(); // L: 10225
				var1.widget = var0; // L: 10226
				var1.args = var0.onTargetLeave; // L: 10227
				class157.runScriptEvent(var1); // L: 10228
			}

			Client.field654 = -1; // L: 10230
			Client.isSpellSelected = false; // L: 10231
			class159.invalidateWidget(var0); // L: 10232
		}
	} // L: 10233
}
