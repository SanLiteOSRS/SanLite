import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lgw;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1261963857
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 676828907
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2116142677
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ao")
	@Export("name")
	public String name;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1053455725
	)
	public int field1845;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 448400407
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("an")
	public boolean field1848;
	@ObfuscatedName("ad")
	public boolean field1849;
	@ObfuscatedName("ax")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("aw")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("az")
	int[] field1862;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1648279167
	)
	int field1853;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 790706639
	)
	int field1839;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1729356387
	)
	int field1838;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1937701375
	)
	int field1856;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("ai")
	int[] field1859;
	@ObfuscatedName("ac")
	byte[] field1860;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2068448285
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1848 = true; // L: 24
		this.field1849 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1853 = Integer.MAX_VALUE; // L: 29
		this.field1839 = Integer.MAX_VALUE; // L: 30
		this.field1838 = Integer.MIN_VALUE; // L: 31
		this.field1856 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "677973970"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 52
			if (var2 == 0) { // L: 53
				return; // L: 56
			}

			this.decodeNext(var1, var2); // L: 54
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "1519034890"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method9547();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method9547();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1845 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 67
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field1848 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field1849 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field1862 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field1862[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1859 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1859.length; ++var5) { // L: 83
					this.field1859[var5] = var1.readInt();
				}

				this.field1860 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field1860[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method9547(); // L: 90
				} else if (var2 == 19) { // L: 92
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 93
					var1.readInt(); // L: 94
				} else if (var2 == 22) { // L: 96
					var1.readInt(); // L: 97
				} else if (var2 == 23) { // L: 99
					var1.readUnsignedByte(); // L: 100
					var1.readUnsignedByte(); // L: 101
					var1.readUnsignedByte(); // L: 102
				} else if (var2 == 24) { // L: 104
					var1.readShort(); // L: 105
					var1.readShort(); // L: 106
				} else if (var2 == 25) { // L: 108
					var1.method9547(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1937, HorizontalAlignment.field1935, HorizontalAlignment.HorizontalAlignment_centered}; // L: 117
					this.horizontalAlignment = (HorizontalAlignment)GrandExchangeEvents.findEnumerated(var3, var1.readUnsignedByte()); // L: 119
				} else if (var2 == 30) { // L: 121
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.field2004, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2006}; // L: 124
					this.verticalAlignment = (VerticalAlignment)GrandExchangeEvents.findEnumerated(var7, var1.readUnsignedByte()); // L: 126
				}
			}
		}

	} // L: 129

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	public void method3594() {
		if (this.field1862 != null) { // L: 132
			for (int var1 = 0; var1 < this.field1862.length; var1 += 2) { // L: 133
				if (this.field1862[var1] < this.field1853) { // L: 134
					this.field1853 = this.field1862[var1];
				} else if (this.field1862[var1] > this.field1838) {
					this.field1838 = this.field1862[var1]; // L: 135
				}

				if (this.field1862[var1 + 1] < this.field1839) { // L: 136
					this.field1839 = this.field1862[var1 + 1];
				} else if (this.field1862[var1 + 1] > this.field1856) {
					this.field1856 = this.field1862[var1 + 1]; // L: 137
				}
			}
		}

	} // L: 140

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)Luc;",
		garbageValue = "-341352401"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 143
		return this.getSprite(var2); // L: 144
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Luc;",
		garbageValue = "187846819"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 148
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 149
			if (var2 != null) { // L: 150
				return var2;
			} else {
				var2 = class135.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 151
				if (var2 != null) { // L: 152
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 153
				}

				return var2; // L: 155
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-42590893"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 159
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	static void method3627() {
		Client.mouseLastLastPressedTimeMillis = 1L; // L: 2644
		Canvas.mouseRecorder.index = 0; // L: 2645
		class31.field160 = true; // L: 2646
		Client.field515 = true; // L: 2647
		Client.field741 = -1L; // L: 2648
		class469.method8643(); // L: 2649
		Client.packetWriter.clearBuffer(); // L: 2650
		Client.packetWriter.packetBuffer.offset = 0; // L: 2651
		Client.packetWriter.serverPacket = null; // L: 2652
		Client.packetWriter.field1402 = null; // L: 2653
		Client.packetWriter.field1411 = null; // L: 2654
		Client.packetWriter.field1407 = null; // L: 2655
		Client.packetWriter.serverPacketLength = 0; // L: 2656
		Client.packetWriter.field1399 = 0; // L: 2657
		Client.rebootTimer = 0; // L: 2658
		Client.logoutTimer = 0; // L: 2659
		Client.field513 = 0; // L: 2660
		class16.method219(); // L: 2661
		MouseHandler.MouseHandler_idleCycles = 0; // L: 2663
		HorizontalAlignment.method3713(); // L: 2665
		Client.isItemSelected = 0; // L: 2666
		Client.isSpellSelected = false; // L: 2667
		Client.soundEffectCount = 0; // L: 2668
		Client.camAngleY = 0; // L: 2669
		Client.oculusOrbState = 0; // L: 2670
		Varps.field3599 = null; // L: 2671
		Client.minimapState = 0; // L: 2672
		Client.field732 = -1; // L: 2673
		Client.destinationX = 0; // L: 2674
		Client.destinationY = 0; // L: 2675
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2676
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2677
		Client.npcCount = 0; // L: 2678
		Players.Players_count = 0; // L: 2680

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2681
			Players.field1347[var0] = null; // L: 2682
			Players.field1348[var0] = class231.field2458; // L: 2683
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 2686
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 65536; ++var0) { // L: 2687
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2688
		Client.projectiles.clear(); // L: 2689
		Client.graphicsObjects.clear(); // L: 2690

		for (var0 = 0; var0 < 4; ++var0) { // L: 2691
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2692
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2693
					Client.groundItems[var0][var4][var2] = null; // L: 2694
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2698
		class332.friendSystem.clear(); // L: 2699
		if (AbstractByteArrayCopier.field3856 > 5000) { // L: 2700
		}

		for (var0 = 0; var0 < AbstractByteArrayCopier.field3856; ++var0) { // L: 2701
			VarpDefinition var1 = class128.VarpDefinition_get(var0); // L: 2702
			if (var1 != null) { // L: 2703
				Varps.Varps_temp[var0] = 0; // L: 2704
				Varps.Varps_main[var0] = 0; // L: 2705
			}
		}

		ClientPreferences.varcs.clearTransient(); // L: 2708
		Client.followerIndex = -1; // L: 2709
		if (Client.rootInterface != -1) { // L: 2710
			class380.field4414.method6346(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2711
			class363.closeInterface(var3, true); // L: 2712
		}

		Client.rootInterface = -1; // L: 2714
		Client.interfaceParents = new NodeHashTable(8); // L: 2715
		Client.meslayerContinueWidget = null; // L: 2716
		class16.method219(); // L: 2717
		Client.playerAppearance.method6373((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2718

		for (var0 = 0; var0 < 8; ++var0) { // L: 2719
			Client.playerMenuActions[var0] = null; // L: 2720
			Client.playerOptionsPriorities[var0] = false; // L: 2721
		}

		class10.method89(); // L: 2723
		Client.field690 = true; // L: 2724

		for (var0 = 0; var0 < 100; ++var0) { // L: 2725
			Client.field720[var0] = true;
		}

		Calendar.method6881(); // L: 2726
		ClientPreferences.friendsChatManager = null; // L: 2727
		class113.guestClanSettings = null; // L: 2728
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2729
		UserComparator4.guestClanChannel = null; // L: 2730
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2731

		for (var0 = 0; var0 < 8; ++var0) { // L: 2732
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class380.grandExchangeEvents = null; // L: 2733
		Client.isLoading = false; // L: 2734
	} // L: 2735
}
