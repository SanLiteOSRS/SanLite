import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static GameBuild field1207;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1242546393
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -333746695
	)
	@Export("health")
	int health;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1619212285
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 620561973
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2027546548"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lku;II)V",
		garbageValue = "-2006263821"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3445 == null) { // L: 1030
			throw new RuntimeException(); // L: 1031
		} else {
			if (var0.field3514 == null) { // L: 1033
				var0.field3514 = new int[var0.field3445.length]; // L: 1034
			}

			var0.field3514[var1] = Integer.MAX_VALUE; // L: 1036
		}
	} // L: 1037

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1835802021"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1798
		Login.Login_response2 = var1; // L: 1799
		Login.Login_response3 = var2; // L: 1800
	} // L: 1801

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-623463912"
	)
	static void method2274() {
		Client.mouseLastLastPressedTimeMillis = 1L; // L: 2737
		class309.mouseRecorder.index = 0; // L: 2738
		class125.hasFocus = true; // L: 2739
		Client.hadFocus = true; // L: 2740
		Client.field725 = -1L; // L: 2741
		class33.reflectionChecks = new IterableNodeDeque(); // L: 2743
		Client.packetWriter.clearBuffer(); // L: 2745
		Client.packetWriter.packetBuffer.offset = 0; // L: 2746
		Client.packetWriter.serverPacket = null; // L: 2747
		Client.packetWriter.field1339 = null; // L: 2748
		Client.packetWriter.field1338 = null; // L: 2749
		Client.packetWriter.field1333 = null; // L: 2750
		Client.packetWriter.serverPacketLength = 0; // L: 2751
		Client.packetWriter.field1332 = 0; // L: 2752
		Client.rebootTimer = 0; // L: 2753
		Client.logoutTimer = 0; // L: 2754
		Client.hintArrowType = 0; // L: 2755
		ItemComposition.method3712(); // L: 2756
		MouseHandler.MouseHandler_idleCycles = 0; // L: 2758
		class17.method262(); // L: 2760
		Client.isItemSelected = 0; // L: 2761
		Client.isSpellSelected = false; // L: 2762
		Client.soundEffectCount = 0; // L: 2763
		Client.camAngleY = 0; // L: 2764
		Client.oculusOrbState = 0; // L: 2765
		class302.field3596 = null; // L: 2766
		Client.minimapState = 0; // L: 2767
		Client.field518 = -1; // L: 2768
		Client.destinationX = 0; // L: 2769
		Client.destinationY = 0; // L: 2770
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2771
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2772
		Client.npcCount = 0; // L: 2773
		class129.method2905(); // L: 2774

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2775
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) { // L: 2776
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2777
		Client.projectiles.clear(); // L: 2778
		Client.graphicsObjects.clear(); // L: 2779

		for (var0 = 0; var0 < 4; ++var0) { // L: 2780
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2781
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2782
					Client.groundItems[var0][var4][var2] = null; // L: 2783
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2787
		MusicPatchPcmStream.friendSystem.clear(); // L: 2788

		for (var0 = 0; var0 < VarpDefinition.field1811; ++var0) { // L: 2789
			VarpDefinition var1 = MouseRecorder.VarpDefinition_get(var0); // L: 2790
			if (var1 != null) { // L: 2791
				Varps.Varps_temp[var0] = 0; // L: 2792
				Varps.Varps_main[var0] = 0; // L: 2793
			}
		}

		class151.varcs.clearTransient(); // L: 2796
		Client.followerIndex = -1; // L: 2797
		if (Client.rootInterface != -1) { // L: 2798
			DecorativeObject.method4514(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2799
			Canvas.closeInterface(var3, true); // L: 2800
		}

		Client.rootInterface = -1; // L: 2802
		Client.interfaceParents = new NodeHashTable(8); // L: 2803
		Client.meslayerContinueWidget = null; // L: 2804
		ItemComposition.method3712(); // L: 2805
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2806

		for (var0 = 0; var0 < 8; ++var0) { // L: 2807
			Client.playerMenuActions[var0] = null; // L: 2808
			Client.playerOptionsPriorities[var0] = false; // L: 2809
		}

		class127.method2888(); // L: 2811
		Client.isLoading = true; // L: 2812

		for (var0 = 0; var0 < 100; ++var0) { // L: 2813
			Client.field610[var0] = true;
		}

		Calendar.method5510(); // L: 2814
		class13.friendsChatManager = null; // L: 2815
		SecureRandomCallable.guestClanSettings = null; // L: 2816
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2817
		class17.guestClanChannel = null; // L: 2818
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2819

		for (var0 = 0; var0 < 8; ++var0) { // L: 2820
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class302.grandExchangeEvents = null; // L: 2821
	} // L: 2822
}
