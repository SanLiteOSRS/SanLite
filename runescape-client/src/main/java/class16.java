import java.util.Arrays;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class16 implements ThreadFactory {
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -1764055819
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("az")
	final ThreadGroup field73;
	@ObfuscatedName("ah")
	final AtomicInteger field69;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lar;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field69 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field73 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field73, var1, this.this$0.field62 + "-rest-request-" + this.field69.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1178901688"
	)
	public static void method203() {
		HealthBarDefinition.NpcDefinition_cachedModels.clear(); // L: 77
		HealthBarDefinition.field2046.clear(); // L: 78
	} // L: 79

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1853050140"
	)
	static void method204() {
		Client.mouseLastLastPressedTimeMillis = -1L; // L: 2690
		if (Tiles.mouseRecorder != null) { // L: 2691
			Tiles.mouseRecorder.index = 0; // L: 2692
		}

		WorldMapManager.hasFocus = true; // L: 2694
		Client.field527 = true; // L: 2695
		Client.field753 = -1L; // L: 2696
		Clock.method3690(); // L: 2697
		Client.packetWriter.clearBuffer(); // L: 2698
		Client.packetWriter.packetBuffer.offset = 0; // L: 2699
		Client.packetWriter.serverPacket = null; // L: 2700
		Client.packetWriter.field1444 = null; // L: 2701
		Client.packetWriter.field1446 = null; // L: 2702
		Client.packetWriter.field1447 = null; // L: 2703
		Client.packetWriter.serverPacketLength = 0; // L: 2704
		Client.packetWriter.field1442 = 0; // L: 2705
		Client.rebootTimer = 0; // L: 2706
		Client.logoutTimer = 0; // L: 2707
		Client.field529 = 0; // L: 2708
		Client.menuOptionsCount = 0; // L: 2710
		Client.isMenuOpen = false; // L: 2711
		UserComparator4.method2861(0); // L: 2713
		Messages.Messages_channels.clear(); // L: 2715
		Messages.Messages_hashTable.clear(); // L: 2716
		Messages.Messages_queue.clear(); // L: 2717
		Messages.Messages_count = 0; // L: 2718
		Client.isItemSelected = 0; // L: 2720
		Client.isSpellSelected = false; // L: 2721
		Client.soundEffectCount = 0; // L: 2722
		Client.camAngleY = 0; // L: 2723
		Client.oculusOrbState = 0; // L: 2724
		class135.field1621 = null; // L: 2725
		Client.minimapState = 0; // L: 2726
		Client.field756 = -1; // L: 2727
		Client.destinationX = 0; // L: 2728
		Client.destinationY = 0; // L: 2729
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2730
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2731
		Client.npcCount = 0; // L: 2732
		Players.Players_count = 0; // L: 2734

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2735
			Players.field1395[var0] = null; // L: 2736
			Players.field1383[var0] = class233.field2486; // L: 2737
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 2740
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 65536; ++var0) { // L: 2741
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2742
		Client.projectiles.clear(); // L: 2743
		Client.graphicsObjects.clear(); // L: 2744

		for (var0 = 0; var0 < 4; ++var0) { // L: 2745
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2746
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2747
					Client.groundItems[var0][var4][var2] = null; // L: 2748
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2752
		class334.friendSystem.clear(); // L: 2753
		if (class183.field1945 > 5000) { // L: 2754
		}

		if (Client.field788) { // L: 2755
			Arrays.fill(Varps.Varps_temp, 0); // L: 2757
			Arrays.fill(Varps.Varps_main, 0); // L: 2758
		} else {
			for (var0 = 0; var0 < class183.field1945; ++var0) { // L: 2762
				VarpDefinition var1 = UserComparator8.VarpDefinition_get(var0); // L: 2763
				if (var1 != null) { // L: 2764
					Varps.Varps_temp[var0] = 0; // L: 2765
					Varps.Varps_main[var0] = 0; // L: 2766
				}
			}
		}

		if (class130.varcs != null) { // L: 2770
			class130.varcs.clearTransient();
		}

		Client.followerIndex = -1; // L: 2771
		if (Client.rootInterface != -1) { // L: 2772
			class243.field2620.method6283(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2773
			FloorUnderlayDefinition.closeInterface(var3, true); // L: 2774
		}

		Client.rootInterface = -1; // L: 2776
		Client.interfaceParents = new NodeHashTable(8); // L: 2777
		Client.meslayerContinueWidget = null; // L: 2778
		Client.menuOptionsCount = 0; // L: 2780
		Client.isMenuOpen = false; // L: 2781
		Client.playerAppearance.method6322((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2783

		for (var0 = 0; var0 < 8; ++var0) { // L: 2784
			Client.playerMenuActions[var0] = null; // L: 2785
			Client.playerOptionsPriorities[var0] = false; // L: 2786
		}

		class159.method3344(); // L: 2788
		Client.field521 = true; // L: 2789

		for (var0 = 0; var0 < 100; ++var0) { // L: 2790
			Client.field732[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) { // L: 2792
			PacketBufferNode var5 = class425.getPacketBufferNode(ClientPacket.field3278, Client.packetWriter.isaacCipher); // L: 2794
			var5.packetBuffer.writeByte(class36.getWindowedMode()); // L: 2795
			var5.packetBuffer.writeShort(class148.canvasWidth); // L: 2796
			var5.packetBuffer.writeShort(class342.canvasHeight); // L: 2797
			Client.packetWriter.addNode(var5); // L: 2798
		}

		class143.friendsChatManager = null; // L: 2800
		class511.guestClanSettings = null; // L: 2801
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2802
		class19.guestClanChannel = null; // L: 2803
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2804

		for (var0 = 0; var0 < 8; ++var0) { // L: 2805
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class233.grandExchangeEvents = null; // L: 2806
	} // L: 2807
}
