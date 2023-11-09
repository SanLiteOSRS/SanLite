import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eb")
public class class135 extends class128 {
	@ObfuscatedName("o")
	static int[][] field1587;
	@ObfuscatedName("s")
	boolean field1581;
	@ObfuscatedName("h")
	byte field1585;
	@ObfuscatedName("w")
	byte field1582;
	@ObfuscatedName("v")
	byte field1583;
	@ObfuscatedName("c")
	byte field1584;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class135(class131 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1581 = var1.readUnsignedByte() == 1; // L: 251
		this.field1585 = var1.readByte(); // L: 252
		this.field1582 = var1.readByte(); // L: 253
		this.field1583 = var1.readByte(); // L: 254
		this.field1584 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.allowGuests = this.field1581; // L: 259
		var1.field1606 = this.field1585; // L: 260
		var1.field1599 = this.field1582; // L: 261
		var1.field1615 = this.field1583; // L: 262
		var1.field1610 = this.field1584; // L: 263
	} // L: 264

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	public static void method2871() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 42
	} // L: 43

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1851340095"
	)
	static int method2870(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 2729
			if (FontName.guestClanSettings != null) { // L: 2730
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1; // L: 2731
				Messages.field1326 = FontName.guestClanSettings; // L: 2732
			} else {
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2734
			}

			return 1; // L: 2735
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 2737
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2738
				if (Client.currentClanSettings[var3] != null) { // L: 2739
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1; // L: 2740
					Messages.field1326 = Client.currentClanSettings[var3]; // L: 2741
				} else {
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2743
				}

				return 1; // L: 2744
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 2746
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Messages.field1326.name; // L: 2747
				return 1; // L: 2748
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 2750
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.allowGuests ? 1 : 0; // L: 2751
				return 1; // L: 2752
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 2754
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.field1606; // L: 2755
				return 1; // L: 2756
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 2758
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.field1599; // L: 2759
				return 1; // L: 2760
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 2762
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.field1615; // L: 2763
				return 1; // L: 2764
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 2766
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.field1610; // L: 2767
				return 1; // L: 2768
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 2770
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.memberCount; // L: 2771
				return 1; // L: 2772
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 2774
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2775
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Messages.field1326.memberNames[var3]; // L: 2776
				return 1; // L: 2777
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 2779
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2780
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.memberRanks[var3]; // L: 2781
				return 1; // L: 2782
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 2784
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.bannedMemberCount; // L: 2785
				return 1; // L: 2786
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 2788
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2789
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Messages.field1326.bannedMemberNames[var3]; // L: 2790
				return 1; // L: 2791
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 2793
					Nameable.Interpreter_intStackSize -= 3; // L: 2794
					var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 2795
					var6 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 2796
					var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 2797
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.method2915(var3, var6, var5); // L: 2798
					return 1; // L: 2799
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 2801
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.currentOwner; // L: 2802
					return 1; // L: 2803
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 2805
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.field1608; // L: 2806
					return 1; // L: 2807
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 2809
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.method2901(Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]); // L: 2810
					return 1; // L: 2811
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 2813
					Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize - 1] = Messages.field1326.getSortedMembers()[Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize - 1]]; // L: 2814
					return 1; // L: 2815
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 2817
					Nameable.Interpreter_intStackSize -= 2; // L: 2818
					var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 2819
					var6 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 2820
					UserComparator8.method2554(var6, var3); // L: 2821
					return 1; // L: 2822
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 2824
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2825
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.field1616[var3]; // L: 2826
					return 1; // L: 2827
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 2829
						Nameable.Interpreter_intStackSize -= 3; // L: 2830
						var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 2831
						boolean var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1] == 1; // L: 2832
						var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 2833
						class127.method2792(var5, var3, var4); // L: 2834
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 2836
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2837
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Messages.field1326.field1619[var3] ? 1 : 0; // L: 2838
						return 1; // L: 2839
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 2841
						if (NetCache.guestClanChannel != null) { // L: 2842
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1; // L: 2843
							Interpreter.field826 = NetCache.guestClanChannel; // L: 2844
						} else {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2846
						}

						return 1; // L: 2847
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 2849
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2850
						if (Client.currentClanChannels[var3] != null) { // L: 2851
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1; // L: 2852
							Interpreter.field826 = Client.currentClanChannels[var3]; // L: 2853
							class160.field1744 = var3; // L: 2854
						} else {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2856
						}

						return 1; // L: 2857
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 2859
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Interpreter.field826.name; // L: 2860
						return 1; // L: 2861
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 2863
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Interpreter.field826.field1669; // L: 2864
						return 1; // L: 2865
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 2867
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Interpreter.field826.field1666; // L: 2868
						return 1; // L: 2869
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 2871
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Interpreter.field826.method3046(); // L: 2872
						return 1; // L: 2873
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 2875
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2876
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ((ClanChannelMember)Interpreter.field826.members.get(var3)).username.getName(); // L: 2877
						return 1; // L: 2878
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 2880
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2881
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = ((ClanChannelMember)Interpreter.field826.members.get(var3)).rank; // L: 2882
						return 1; // L: 2883
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 2885
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2886
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = ((ClanChannelMember)Interpreter.field826.members.get(var3)).world; // L: 2887
						return 1; // L: 2888
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 2890
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2891
						DynamicObject.method1954(class160.field1744, var3); // L: 2892
						return 1; // L: 2893
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 2895
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Interpreter.field826.method3056(Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]); // L: 2896
						return 1; // L: 2897
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 2899
						Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize - 1] = Interpreter.field826.getSortedMembers()[Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize - 1]]; // L: 2900
						return 1; // L: 2901
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 2903
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Coord.field3318 != null ? 1 : 0; // L: 2904
						return 1; // L: 2905
					} else {
						return 2; // L: 2907
					}
				}
			}
		}
	}
}
