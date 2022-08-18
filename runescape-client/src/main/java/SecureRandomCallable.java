import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bl")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;

	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return LoginScreenAnimation.method2306(); // L: 46
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1733340953"
	)
	public static int method2126(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "7"
	)
	static char method2122(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0; // L: 61 62
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "57"
	)
	static Date method2118() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1131
		var0.setLenient(false); // L: 1132
		StringBuilder var1 = new StringBuilder(); // L: 1133
		String[] var2 = Login.field901; // L: 1135

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1136
			String var4 = var2[var3]; // L: 1137
			if (var4 == null) { // L: 1139
				PendingSpawn.method2249("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1140
				return null; // L: 1141
			}

			var1.append(var4); // L: 1143
		}

		var1.append("12"); // L: 1147
		return var0.parse(var1.toString()); // L: 1148
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "-1171730535"
	)
	static int method2120(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 2720
			if (guestClanSettings != null) { // L: 2721
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1; // L: 2722
				WorldMapDecoration.field2816 = guestClanSettings; // L: 2723
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2725
			}

			return 1; // L: 2726
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 2728
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2729
				if (Client.currentClanSettings[var3] != null) { // L: 2730
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1; // L: 2731
					WorldMapDecoration.field2816 = Client.currentClanSettings[var3]; // L: 2732
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2734
				}

				return 1; // L: 2735
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 2737
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = WorldMapDecoration.field2816.name; // L: 2738
				return 1; // L: 2739
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 2741
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.allowGuests ? 1 : 0; // L: 2742
				return 1; // L: 2743
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 2745
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1631; // L: 2746
				return 1; // L: 2747
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 2749
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1619; // L: 2750
				return 1; // L: 2751
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 2753
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1632; // L: 2754
				return 1; // L: 2755
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 2757
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1621; // L: 2758
				return 1; // L: 2759
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 2761
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.memberCount; // L: 2762
				return 1; // L: 2763
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 2765
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2766
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = WorldMapDecoration.field2816.memberNames[var3]; // L: 2767
				return 1; // L: 2768
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 2770
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2771
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.memberRanks[var3]; // L: 2772
				return 1; // L: 2773
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 2775
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.bannedMemberCount; // L: 2776
				return 1; // L: 2777
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 2779
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2780
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = WorldMapDecoration.field2816.bannedMemberNames[var3]; // L: 2781
				return 1; // L: 2782
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 2784
					TaskHandler.Interpreter_intStackSize -= 3; // L: 2785
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 2786
					var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 2787
					var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 2788
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.method2975(var3, var6, var5); // L: 2789
					return 1; // L: 2790
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 2792
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.currentOwner; // L: 2793
					return 1; // L: 2794
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 2796
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1630; // L: 2797
					return 1; // L: 2798
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 2800
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.method3042(Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]); // L: 2801
					return 1; // L: 2802
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 2804
					Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.getSortedMembers()[Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1]]; // L: 2805
					return 1; // L: 2806
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 2808
					TaskHandler.Interpreter_intStackSize -= 2; // L: 2809
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 2810
					var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 2811
					class341.method6285(var6, var3); // L: 2812
					return 1; // L: 2813
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 2815
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2816
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1627[var3]; // L: 2817
					return 1; // L: 2818
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 2820
						TaskHandler.Interpreter_intStackSize -= 3; // L: 2821
						var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 2822
						boolean var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1] == 1; // L: 2823
						var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 2824
						Coord.method5543(var5, var3, var4); // L: 2825
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 2827
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2828
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.field2816.field1622[var3] ? 1 : 0; // L: 2829
						return 1; // L: 2830
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 2832
						if (class17.guestClanChannel != null) { // L: 2833
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1; // L: 2834
							class390.field4425 = class17.guestClanChannel; // L: 2835
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2837
						}

						return 1; // L: 2838
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 2840
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2841
						if (Client.currentClanChannels[var3] != null) { // L: 2842
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1; // L: 2843
							class390.field4425 = Client.currentClanChannels[var3]; // L: 2844
							Interpreter.field836 = var3; // L: 2845
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2847
						}

						return 1; // L: 2848
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 2850
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class390.field4425.name; // L: 2851
						return 1; // L: 2852
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 2854
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class390.field4425.field1672; // L: 2855
						return 1; // L: 2856
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 2858
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class390.field4425.field1676; // L: 2859
						return 1; // L: 2860
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 2862
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class390.field4425.method3117(); // L: 2863
						return 1; // L: 2864
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 2866
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2867
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class390.field4425.members.get(var3)).username.getName(); // L: 2868
						return 1; // L: 2869
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 2871
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2872
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((ClanChannelMember)class390.field4425.members.get(var3)).rank; // L: 2873
						return 1; // L: 2874
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 2876
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2877
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((ClanChannelMember)class390.field4425.members.get(var3)).world; // L: 2878
						return 1; // L: 2879
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 2881
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2882
						WorldMapLabel.method4977(Interpreter.field836, var3); // L: 2883
						return 1; // L: 2884
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 2886
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class390.field4425.method3119(Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]); // L: 2887
						return 1; // L: 2888
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 2890
						Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1] = class390.field4425.getSortedMembers()[Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1]]; // L: 2891
						return 1; // L: 2892
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 2894
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = SoundCache.field327 != null ? 1 : 0; // L: 2895
						return 1; // L: 2896
					} else {
						return 2; // L: 2898
					}
				}
			}
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1214633459"
	)
	static final void method2125() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3637
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3638
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3639
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3651
				if (var1 == null) { // L: 3652
					Object var10000 = null; // L: 3653
					var1 = SoundEffect.readSoundEffect(WorldMapArchiveLoader.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3654
						continue;
					}

					int[] var12 = Client.queuedSoundEffectDelays; // L: 3655
					var12[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3656
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3662
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3664
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3665
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3666
						int var5 = var4 * 128 + 64 - class28.localPlayer.x; // L: 3667
						if (var5 < 0) { // L: 3668
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3669
						int var7 = var6 * 128 + 64 - class28.localPlayer.y; // L: 3670
						if (var7 < 0) { // L: 3671
							var7 = -var7;
						}

						int var8 = var5 + var7 - 128; // L: 3672
						if (var8 > var3) { // L: 3673
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3674
							continue; // L: 3675
						}

						if (var8 < 0) { // L: 3677
							var8 = 0;
						}

						var2 = (var3 - var8) * class260.clientPreferences.method2329() / var3; // L: 3678
					} else {
						var2 = class260.clientPreferences.method2348(); // L: 3680
					}

					if (var2 > 0) { // L: 3681
						RawSound var9 = var1.toRawSound().resample(Tiles.decimator); // L: 3682
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3683
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3684
						StructComposition.pcmStreamMixer.addSubStream(var10); // L: 3685
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3687
				}
			} else {
				--Client.soundEffectCount; // L: 3640

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3641
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3642
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3643
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3644
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3645
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3646
				}

				--var0; // L: 3648
			}
		}

		if (Client.playingJingle && !Varcs.method2546()) { // L: 3690
			if (class260.clientPreferences.method2335() != 0 && Client.currentTrackGroupId != -1) { // L: 3691
				FriendsChatManager.method6678(MouseHandler.archive6, Client.currentTrackGroupId, 0, class260.clientPreferences.method2335(), false);
			}

			Client.playingJingle = false; // L: 3692
		}

	} // L: 3694
}
