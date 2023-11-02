import java.util.Arrays;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("da")
	static boolean field3427;
	@ObfuscatedName("ac")
	byte[] field3420;
	@ObfuscatedName("al")
	byte[] field3418;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -618668773
	)
	int field3419;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1136181051
	)
	int field3425;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1078343365
	)
	int field3417;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -15797553
	)
	int field3421;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -438322831
	)
	int field3423;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -526087587
	)
	int field3424;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1354169945
	)
	int field3426;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "15"
	)
	static void method5929(boolean var0) {
		byte var1 = 0; // L: 1276
		boolean var2 = class91.clientPreferences.method2562() >= Client.field717; // L: 1279
		if (!var2) { // L: 1281
			var1 = 12; // L: 1282
		} else if (class159.client.method1768() || class159.client.isOtlTokenRequesterInitialized() || class159.client.method1248()) { // L: 1284
			var1 = 10; // L: 1285
		}

		GameEngine.method647(var1); // L: 1287
		if (var0) { // L: 1288
			Login.Login_username = ""; // L: 1289
			Login.Login_password = ""; // L: 1290
			ClientPreferences.field1295 = 0; // L: 1291
			class186.otp = ""; // L: 1292
		}

		class188.method3619(); // L: 1294
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1296
			Login.currentLoginField = 1; // L: 1297
		} else {
			Login.currentLoginField = 0; // L: 1300
		}

	} // L: 1303

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method5928() {
		Client.mouseLastLastPressedTimeMillis = 1L; // L: 2687
		class233.mouseRecorder.index = 0; // L: 2688
		class25.hasFocus = true; // L: 2689
		Client.hadFocus = true; // L: 2690
		Client.field760 = -1L; // L: 2691
		class36.reflectionChecks = new IterableNodeDeque(); // L: 2693
		Client.packetWriter.clearBuffer(); // L: 2695
		Client.packetWriter.packetBuffer.offset = 0; // L: 2696
		Client.packetWriter.serverPacket = null; // L: 2697
		Client.packetWriter.field1431 = null; // L: 2698
		Client.packetWriter.field1420 = null; // L: 2699
		Client.packetWriter.field1433 = null; // L: 2700
		Client.packetWriter.serverPacketLength = 0; // L: 2701
		Client.packetWriter.field1429 = 0; // L: 2702
		Client.rebootTimer = 0; // L: 2703
		Client.logoutTimer = 0; // L: 2704
		Client.hintArrowType = 0; // L: 2705
		class91.method2347(); // L: 2706
		class138.method3081(0); // L: 2707
		Messages.Messages_channels.clear(); // L: 2709
		Messages.Messages_hashTable.clear(); // L: 2710
		Messages.Messages_queue.clear(); // L: 2711
		Messages.Messages_count = 0; // L: 2712
		Client.isItemSelected = 0; // L: 2714
		Client.isSpellSelected = false; // L: 2715
		Client.soundEffectCount = 0; // L: 2716
		Client.camAngleY = 0; // L: 2717
		Client.oculusOrbState = 0; // L: 2718
		DecorativeObject.field2871 = null; // L: 2719
		Client.minimapState = 0; // L: 2720
		Client.field763 = -1; // L: 2721
		Client.destinationX = 0; // L: 2722
		Client.destinationY = 0; // L: 2723
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2724
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2725
		Client.npcCount = 0; // L: 2726
		class11.method112(); // L: 2727

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2728
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 65536; ++var0) { // L: 2729
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2730
		Client.projectiles.clear(); // L: 2731
		Client.graphicsObjects.clear(); // L: 2732

		for (var0 = 0; var0 < 4; ++var0) { // L: 2733
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2734
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2735
					Client.groundItems[var0][var4][var2] = null; // L: 2736
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2740
		InvDefinition.friendSystem.clear(); // L: 2741
		if (VarpDefinition.field1924 > 5000) { // L: 2742
		}

		for (var0 = 0; var0 < VarpDefinition.field1924; ++var0) { // L: 2743
			VarpDefinition var1 = class150.VarpDefinition_get(var0); // L: 2744
			if (var1 != null) { // L: 2745
				Varps.Varps_temp[var0] = 0; // L: 2746
				Varps.Varps_main[var0] = 0; // L: 2747
			}
		}

		class33.varcs.clearTransient(); // L: 2750
		Client.followerIndex = -1; // L: 2751
		if (Client.rootInterface != -1) { // L: 2752
			class33.field184.method6243(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2753
			ArchiveDisk.closeInterface(var3, true); // L: 2754
		}

		Client.rootInterface = -1; // L: 2756
		Client.interfaceParents = new NodeHashTable(8); // L: 2757
		Client.meslayerContinueWidget = null; // L: 2758
		class91.method2347(); // L: 2759
		Client.playerAppearance.method6267((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2760

		for (var0 = 0; var0 < 8; ++var0) { // L: 2761
			Client.playerMenuActions[var0] = null; // L: 2762
			Client.playerOptionsPriorities[var0] = false; // L: 2763
		}

		Tile.method4515(); // L: 2765
		Client.field531 = true; // L: 2766

		for (var0 = 0; var0 < 100; ++var0) { // L: 2767
			Client.field739[var0] = true;
		}

		class517.method9051(); // L: 2768
		class358.friendsChatManager = null; // L: 2769
		VerticalAlignment.guestClanSettings = null; // L: 2770
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2771
		ClanChannelMember.guestClanChannel = null; // L: 2772
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2773

		for (var0 = 0; var0 < 8; ++var0) { // L: 2774
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		Varps.grandExchangeEvents = null; // L: 2775
		Client.field615 = false; // L: 2776
	} // L: 2777
}
