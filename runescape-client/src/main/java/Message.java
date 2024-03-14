import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1514907991
	)
	@Export("count")
	int count;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1401588309
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 998416035
	)
	@Export("type")
	int type;
	@ObfuscatedName("ai")
	@Export("sender")
	String sender;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("az")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("ao")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "69"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = Canvas.method297(); // L: 23
		this.cycle = Client.cycle; // L: 24
		this.type = var1; // L: 25
		this.sender = var2; // L: 26
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored(); // L: 31
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "119"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "208878207"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 39
			this.fillIsFromFriend(); // L: 40
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 42
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1920713807"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = InterfaceParent.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "672649016"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 50
	} // L: 51

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "45"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 54
			this.fillIsFromIgnored(); // L: 55
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 57
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-680498803"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = InterfaceParent.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 61
	} // L: 62

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1347419036"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) { // L: 65
			this.senderUsername = new Username(class433.method8127(this.sender), FriendLoginUpdate.loginType);
		} else {
			this.senderUsername = null; // L: 66
		}

	} // L: 67

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1995268723"
	)
	public static void method1184() {
		ByteArrayPool.field4646.clear(); // L: 44
		ByteArrayPool.field4646.add(100); // L: 45
		ByteArrayPool.field4646.add(5000); // L: 46
		ByteArrayPool.field4646.add(10000); // L: 47
		ByteArrayPool.field4646.add(30000); // L: 48
	} // L: 49

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-163061365"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 27
		if (var4 == null) { // L: 28
			var4 = new ChatChannel(); // L: 29
			Messages.Messages_channels.put(var0, var4); // L: 30
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 32
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 33
		Messages.Messages_queue.add(var5); // L: 34
		Client.chatCycle = Client.cycleCntr; // L: 35
	} // L: 36

	@ObfuscatedName("ao")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 81
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-215564897"
	)
	static void method1182() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 348
			Login.currentLoginField = 1; // L: 349
		} else {
			Login.currentLoginField = 0; // L: 352
		}

	} // L: 354

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	static void method1173() {
		Client.mouseLastLastPressedTimeMillis = -1L; // L: 2765
		if (ByteArrayPool.mouseRecorder != null) { // L: 2766
			ByteArrayPool.mouseRecorder.index = 0; // L: 2767
		}

		class423.hasFocus = true; // L: 2769
		Client.field567 = true; // L: 2770
		Client.field583 = -1L; // L: 2771
		class36.reflectionChecks = new IterableNodeDeque(); // L: 2773
		Client.packetWriter.clearBuffer(); // L: 2775
		Client.packetWriter.packetBuffer.offset = 0; // L: 2776
		Client.packetWriter.serverPacket = null; // L: 2777
		Client.packetWriter.field1423 = null; // L: 2778
		Client.packetWriter.field1435 = null; // L: 2779
		Client.packetWriter.field1424 = null; // L: 2780
		Client.packetWriter.serverPacketLength = 0; // L: 2781
		Client.packetWriter.field1432 = 0; // L: 2782
		Client.rebootTimer = 0; // L: 2783
		Client.logoutTimer = 0; // L: 2784
		Client.field542 = 0; // L: 2785
		Client.menuOptionsCount = 0; // L: 2787
		Client.isMenuOpen = false; // L: 2788
		Archive.method7069(0); // L: 2790
		ClientPreferences.method2638(); // L: 2791
		Client.isItemSelected = 0; // L: 2792
		Client.isSpellSelected = false; // L: 2793
		Client.soundEffectCount = 0; // L: 2794
		Client.camAngleY = 0; // L: 2795
		Client.oculusOrbState = 0; // L: 2796
		MilliClock.field2352 = null; // L: 2797
		Client.minimapState = 0; // L: 2798
		Client.field772 = -1; // L: 2799
		Client.destinationX = 0; // L: 2800
		Client.destinationY = 0; // L: 2801
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2802
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2803
		Client.npcCount = 0; // L: 2804
		class94.method2450(); // L: 2805

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2806
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 65536; ++var0) { // L: 2807
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2808
		Client.projectiles.clear(); // L: 2809
		Client.graphicsObjects.clear(); // L: 2810

		for (var0 = 0; var0 < 4; ++var0) { // L: 2811
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2812
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2813
					Client.groundItems[var0][var4][var2] = null; // L: 2814
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2818
		InterfaceParent.friendSystem.clear(); // L: 2819
		if (VarpDefinition.field1855 > 5000) { // L: 2820
		}

		if (Client.field718) { // L: 2821
			TaskHandler.method4204(); // L: 2822
		} else {
			for (var0 = 0; var0 < VarpDefinition.field1855; ++var0) { // L: 2825
				VarpDefinition var1 = class148.VarpDefinition_get(var0); // L: 2826
				if (var1 != null) { // L: 2827
					Varps.Varps_temp[var0] = 0; // L: 2828
					Varps.Varps_main[var0] = 0; // L: 2829
				}
			}
		}

		if (ScriptFrame.varcs != null) { // L: 2833
			ScriptFrame.varcs.clearTransient();
		}

		Client.followerIndex = -1; // L: 2834
		if (Client.rootInterface != -1) { // L: 2835
			ArchiveLoader.field1070.method6434(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2836
			SecureRandomFuture.closeInterface(var3, true); // L: 2837
		}

		Client.rootInterface = -1; // L: 2839
		Client.interfaceParents = new NodeHashTable(8); // L: 2840
		Client.meslayerContinueWidget = null; // L: 2841
		Client.menuOptionsCount = 0; // L: 2843
		Client.isMenuOpen = false; // L: 2844
		Client.playerAppearance.method6468((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2846

		for (var0 = 0; var0 < 8; ++var0) { // L: 2847
			Client.playerMenuActions[var0] = null; // L: 2848
			Client.playerOptionsPriorities[var0] = false; // L: 2849
		}

		PendingSpawn.method2459(); // L: 2851
		Client.field610 = true; // L: 2852

		for (var0 = 0; var0 < 100; ++var0) { // L: 2853
			Client.field816[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) { // L: 2855
			PacketBufferNode var5 = ViewportMouse.getPacketBufferNode(ClientPacket.field3177, Client.packetWriter.isaacCipher); // L: 2857
			var5.packetBuffer.writeByte(AbstractUserComparator.getWindowedMode()); // L: 2858
			var5.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2859
			var5.packetBuffer.writeShort(WorldMapArea.canvasHeight); // L: 2860
			Client.packetWriter.addNode(var5); // L: 2861
		}

		Projectile.friendsChatManager = null; // L: 2863
		class223.guestClanSettings = null; // L: 2864
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2865
		class316.guestClanChannel = null; // L: 2866
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2867

		for (var0 = 0; var0 < 8; ++var0) { // L: 2868
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		FileSystem.grandExchangeEvents = null; // L: 2869
	} // L: 2870
}
