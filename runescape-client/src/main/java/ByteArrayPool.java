import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1716971903
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1263262813
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -846667261
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 728272335
	)
	static int field4497;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1688696453
	)
	static int field4498;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -248415571
	)
	static int field4503;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 7441005
	)
	static int field4492;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 240950767
	)
	static int field4501;
	@ObfuscatedName("ae")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ah")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ap")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("as")
	static byte[][] field4505;
	@ObfuscatedName("av")
	public static ArrayList field4506;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4497 = 0; // L: 16
		field4498 = 1000; // L: 17
		field4503 = 250; // L: 18
		field4492 = 100; // L: 19
		field4501 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4505 = new byte[50][]; // L: 24
		field4506 = new ArrayList(); // L: 28
		field4506.clear(); // L: 32
		field4506.add(100); // L: 33
		field4506.add(5000); // L: 34
		field4506.add(10000); // L: 35
		field4506.add(30000); // L: 36
		new HashMap();
	} // L: 42

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1059602196"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool_smallCount > 0) { // L: 50
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 51
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 52
			return var4; // L: 53
		} else if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool_mediumCount > 0) { // L: 55
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 56
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 57
			return var4; // L: 58
		} else if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount > 0) { // L: 60
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 61
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 62
			return var4; // L: 63
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4497 > 0) { // L: 65
			var4 = field4505[--field4497]; // L: 66
			field4505[field4497] = null; // L: 67
			return var4; // L: 68
		} else {
			int var2;
			if (class134.ByteArrayPool_arrays != null) { // L: 70
				for (var2 = 0; var2 < ChatChannel.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 71
					if ((ChatChannel.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < ChatChannel.ByteArrayPool_alternativeSizes[var2] && var1) && class306.ByteArrayPool_altSizeArrayCounts[var2] > 0) { // L: 72
						byte[] var3 = class134.ByteArrayPool_arrays[var2][--class306.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 73
						class134.ByteArrayPool_arrays[var2][class306.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 74
						return var3; // L: 75
					}
				}
			}

			if (var1 && ChatChannel.ByteArrayPool_alternativeSizes != null) { // L: 79 80
				for (var2 = 0; var2 < ChatChannel.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 81
					if (var0 <= ChatChannel.ByteArrayPool_alternativeSizes[var2] && class306.ByteArrayPool_altSizeArrayCounts[var2] < class134.ByteArrayPool_arrays[var2].length) { // L: 82
						return new byte[ChatChannel.ByteArrayPool_alternativeSizes[var2]]; // L: 83
					}
				}
			}

			return new byte[var0]; // L: 88
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1446802475"
	)
	static void method7583() {
		Client.mouseLastLastPressedTimeMillis = 1L; // L: 2772
		AttackOption.mouseRecorder.index = 0; // L: 2773
		class148.hasFocus = true; // L: 2774
		Client.hadFocus = true; // L: 2775
		Client.field721 = -1L; // L: 2776
		class36.reflectionChecks = new IterableNodeDeque(); // L: 2778
		Client.packetWriter.clearBuffer(); // L: 2780
		Client.packetWriter.packetBuffer.offset = 0; // L: 2781
		Client.packetWriter.serverPacket = null; // L: 2782
		Client.packetWriter.field1392 = null; // L: 2783
		Client.packetWriter.field1381 = null; // L: 2784
		Client.packetWriter.field1394 = null; // L: 2785
		Client.packetWriter.serverPacketLength = 0; // L: 2786
		Client.packetWriter.field1390 = 0; // L: 2787
		Client.rebootTimer = 0; // L: 2788
		Client.logoutTimer = 0; // L: 2789
		Client.hintArrowType = 0; // L: 2790
		class25.method368(); // L: 2791
		class6.method37(0); // L: 2792
		class332.method6591(); // L: 2793
		Client.isItemSelected = 0; // L: 2794
		Client.isSpellSelected = false; // L: 2795
		Client.soundEffectCount = 0; // L: 2796
		Client.camAngleY = 0; // L: 2797
		Client.oculusOrbState = 0; // L: 2798
		HitSplatDefinition.field2141 = null; // L: 2799
		Client.minimapState = 0; // L: 2800
		Client.field609 = -1; // L: 2801
		Client.destinationX = 0; // L: 2802
		Client.destinationY = 0; // L: 2803
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2804
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2805
		Client.npcCount = 0; // L: 2806
		Players.Players_count = 0; // L: 2808

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2809
			Players.field1329[var0] = null; // L: 2810
			Players.field1342[var0] = class216.field2381; // L: 2811
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 2814
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 65536; ++var0) { // L: 2815
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2816
		Client.projectiles.clear(); // L: 2817
		Client.graphicsObjects.clear(); // L: 2818

		int var1;
		for (var0 = 0; var0 < 4; ++var0) { // L: 2819
			for (var1 = 0; var1 < 104; ++var1) { // L: 2820
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2821
					Client.groundItems[var0][var1][var2] = null; // L: 2822
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2826
		ReflectionCheck.friendSystem.clear(); // L: 2827

		for (var0 = 0; var0 < class516.field5128; ++var0) { // L: 2828
			VarpDefinition var4 = class132.VarpDefinition_get(var0); // L: 2829
			if (var4 != null) { // L: 2830
				Varps.Varps_temp[var0] = 0; // L: 2831
				Varps.Varps_main[var0] = 0; // L: 2832
			}
		}

		Players.varcs.clearTransient(); // L: 2835
		Client.followerIndex = -1; // L: 2836
		if (Client.rootInterface != -1) { // L: 2837
			var0 = Client.rootInterface; // L: 2838
			if (var0 != -1 && WorldMapDecoration.Widget_loadedInterfaces[var0]) { // L: 2840 2841
				ArchiveLoader.Widget_archive.clearFilesGroup(var0); // L: 2842
				if (UserComparator6.Widget_interfaceComponents[var0] != null) { // L: 2843
					for (var1 = 0; var1 < UserComparator6.Widget_interfaceComponents[var0].length; ++var1) { // L: 2844
						if (UserComparator6.Widget_interfaceComponents[var0][var1] != null) { // L: 2845
							UserComparator6.Widget_interfaceComponents[var0][var1] = null; // L: 2846
						}
					}

					UserComparator6.Widget_interfaceComponents[var0] = null; // L: 2849
					WorldMapDecoration.Widget_loadedInterfaces[var0] = false; // L: 2850
				}
			}
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2853
			class10.closeInterface(var3, true); // L: 2854
		}

		Client.rootInterface = -1; // L: 2856
		Client.interfaceParents = new NodeHashTable(8); // L: 2857
		Client.meslayerContinueWidget = null; // L: 2858
		class25.method368(); // L: 2859
		Client.playerAppearance.method6104((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2860

		for (var0 = 0; var0 < 8; ++var0) { // L: 2861
			Client.playerMenuActions[var0] = null; // L: 2862
			Client.playerOptionsPriorities[var0] = false; // L: 2863
		}

		WorldMapSectionType.method5452(); // L: 2865
		Client.field493 = true; // L: 2866

		for (var0 = 0; var0 < 100; ++var0) { // L: 2867
			Client.field693[var0] = true;
		}

		class407.method7663(); // L: 2868
		BZip2State.friendsChatManager = null; // L: 2869
		InterfaceParent.guestClanSettings = null; // L: 2870
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2871
		UserComparator4.guestClanChannel = null; // L: 2872
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2873

		for (var0 = 0; var0 < 8; ++var0) { // L: 2874
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		GraphicsObject.grandExchangeEvents = null; // L: 2875
	} // L: 2876
}
