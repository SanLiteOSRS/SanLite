import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class149 extends class144 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1032151659
	)
	int field1668;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -872808131
	)
	int field1670;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1260682791
	)
	int field1669;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 601087697
	)
	int field1671;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class149(class147 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		this.field1668 = var1.readInt(); // L: 292
		this.field1671 = var1.readInt(); // L: 293
		this.field1670 = var1.readUnsignedByte(); // L: 294
		this.field1669 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3337(this.field1668, this.field1671, this.field1670, this.field1669); // L: 299
	} // L: 300

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "1206229207"
	)
	public static HitSplatDefinition method3275(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1559513020"
	)
	static int method3270(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 429
			return class47.method898(var0, var1, var2);
		} else if (var0 < 1100) { // L: 430
			return class335.method6300(var0, var1, var2);
		} else if (var0 < 1200) { // L: 431
			return class357.method6861(var0, var1, var2);
		} else if (var0 < 1300) { // L: 432
			return class426.method7946(var0, var1, var2);
		} else if (var0 < 1400) { // L: 433
			return WorldMapRectangle.method4925(var0, var1, var2);
		} else if (var0 < 1500) { // L: 434
			return class1.method11(var0, var1, var2);
		} else if (var0 < 1600) { // L: 435
			return ClanChannelMember.method3248(var0, var1, var2);
		} else if (var0 < 1700) { // L: 436
			return ReflectionCheck.method710(var0, var1, var2);
		} else if (var0 < 1800) { // L: 437
			return class30.method462(var0, var1, var2);
		} else if (var0 < 1900) { // L: 438
			return ItemComposition.method4015(var0, var1, var2);
		} else if (var0 < 2000) { // L: 439
			return UserComparator6.method3019(var0, var1, var2);
		} else if (var0 < 2100) { // L: 440
			return class335.method6300(var0, var1, var2);
		} else if (var0 < 2200) { // L: 441
			return class357.method6861(var0, var1, var2);
		} else if (var0 < 2300) { // L: 442
			return class426.method7946(var0, var1, var2);
		} else if (var0 < 2400) { // L: 443
			return WorldMapRectangle.method4925(var0, var1, var2);
		} else if (var0 < 2500) { // L: 444
			return class1.method11(var0, var1, var2);
		} else if (var0 < 2600) { // L: 445
			return class168.method3514(var0, var1, var2);
		} else if (var0 < 2700) { // L: 446
			return class60.method1190(var0, var1, var2);
		} else if (var0 < 2800) { // L: 447
			return FloorOverlayDefinition.method4035(var0, var1, var2);
		} else if (var0 < 2900) { // L: 448
			return UrlRequester.method2901(var0, var1, var2);
		} else if (var0 < 3000) { // L: 449
			return UserComparator6.method3019(var0, var1, var2);
		} else if (var0 < 3200) { // L: 450
			return World.method1899(var0, var1, var2);
		} else if (var0 < 3300) { // L: 451
			return class159.method3416(var0, var1, var2);
		} else if (var0 < 3400) { // L: 452
			return class463.method8506(var0, var1, var2);
		} else if (var0 < 3500) { // L: 453
			return ApproximateRouteStrategy.method1251(var0, var1, var2);
		} else if (var0 < 3600) { // L: 454
			return RouteStrategy.method4393(var0, var1, var2);
		} else if (var0 < 3700) { // L: 455
			return class350.method6850(var0, var1, var2);
		} else if (var0 < 3800) { // L: 456
			return SequenceDefinition.method4096(var0, var1, var2);
		} else if (var0 < 3900) { // L: 457
			return WorldMapRectangle.method4926(var0, var1, var2);
		} else if (var0 < 4000) { // L: 458
			return Actor.method2495(var0, var1, var2);
		} else if (var0 < 4100) { // L: 459
			return class422.method7905(var0, var1, var2);
		} else if (var0 < 4200) { // L: 460
			return ArchiveDiskAction.method6884(var0, var1, var2);
		} else if (var0 < 4300) { // L: 461
			return ObjectSound.method1973(var0, var1, var2);
		} else if (var0 < 5100) { // L: 462
			return class12.method131(var0, var1, var2);
		} else if (var0 < 5400) { // L: 463
			return class72.method2138(var0, var1, var2);
		} else if (var0 < 5600) { // L: 464
			return SoundSystem.method869(var0, var1, var2);
		} else if (var0 < 5700) { // L: 465
			return UserComparator9.method2987(var0, var1, var2);
		} else if (var0 < 6300) { // L: 466
			return class134.method3148(var0, var1, var2);
		} else if (var0 < 6600) { // L: 467
			return class138.method3161(var0, var1, var2);
		} else if (var0 < 6700) { // L: 468
			return SecureRandomCallable.method2324(var0, var1, var2);
		} else if (var0 < 6800) { // L: 469
			return class344.method6808(var0, var1, var2);
		} else if (var0 < 6900) { // L: 470
			return class17.method248(var0, var1, var2);
		} else if (var0 < 7000) { // L: 471
			return VerticalAlignment.method3753(var0, var1, var2);
		} else if (var0 < 7100) { // L: 472
			return class148.method3265(var0, var1, var2);
		} else if (var0 < 7200) { // L: 473
			return class158.method3412(var0, var1, var2);
		} else if (var0 < 7300) { // L: 474
			return ScriptEvent.method2367(var0, var1, var2);
		} else if (var0 < 7500) { // L: 475
			return class147.method3256(var0, var1, var2);
		} else if (var0 < 7600) { // L: 476
			return class59.method1184(var0, var1, var2);
		} else if (var0 < 7700) { // L: 477
			return class12.method142(var0, var1, var2);
		} else {
			return var0 < 8100 ? ModelData0.method5818(var0, var1, var2) : 2; // L: 478 479
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "379656715"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2743
		if (var0 == -3) { // L: 2746
			class139.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2747
			class139.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2748
			class139.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2749
			UserComparator7.method2966(3); // L: 2750
			Login.field931 = 1; // L: 2751
		} else if (var0 == 4) { // L: 2753
			class129.method3086(0); // L: 2754
		} else if (var0 == 5) { // L: 2756
			Login.field931 = 2; // L: 2757
			class139.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2758
		} else if (var0 == 68) { // L: 2760
			if (!Client.field494) { // L: 2761
				Client.field494 = true; // L: 2762
				ByteArrayPool.method7920(); // L: 2763
				return; // L: 2764
			}

			class139.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2767
		} else if (!Client.onMobile && var0 == 6) { // L: 2770
			class139.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2771
		} else if (var0 == 7) { // L: 2773
			class139.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2774
			class139.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2775
			class139.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2776
			class139.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2777
			class139.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2778
			class139.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2779
			class139.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2780
			class139.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2781
			class139.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now."); // L: 2782
			UserComparator7.method2966(33); // L: 2783
		} else if (var0 == 17) { // L: 2785
			class139.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 2786
			class129.method3086(1); // L: 2787
		} else if (var0 == 19) { // L: 2789
			class139.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2790
			class139.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2791
			class139.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2792
			class139.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2793
			class139.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2794
			class139.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2795
			class139.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2796
			class139.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 2797
			class139.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) { // L: 2798
			class129.method3086(2); // L: 2799
		} else if (var0 == 37) { // L: 2801
			class139.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2802
			class139.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 2803
			UserComparator7.method2966(8); // L: 2804
		} else {
			if (var0 == 56) { // L: 2806
				class139.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2807
				WorldMapSection2.method4516(11); // L: 2808
				return; // L: 2809
			}

			if (var0 == 57) { // L: 2811
				class139.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2812
				WorldMapSection2.method4516(11); // L: 2813
				return; // L: 2814
			}

			if (var0 == 61) { // L: 2816
				class139.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2817
				UserComparator7.method2966(7); // L: 2818
			} else {
				if (var0 == 62) { // L: 2820
					WorldMapSection2.method4516(10); // L: 2821
					UserComparator7.method2966(9); // L: 2822
					class139.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2823
					return; // L: 2824
				}

				if (var0 == 63) { // L: 2826
					WorldMapSection2.method4516(10); // L: 2827
					UserComparator7.method2966(9); // L: 2828
					class139.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2829
					return; // L: 2830
				}

				if (var0 == 65 || var0 == 67) { // L: 2832
					WorldMapSection2.method4516(10); // L: 2833
					UserComparator7.method2966(9); // L: 2834
					class139.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2835
					return; // L: 2836
				}

				if (var0 == 71) { // L: 2838
					WorldMapSection2.method4516(10); // L: 2839
					UserComparator7.method2966(7); // L: 2840
					class139.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2841
				} else if (var0 == 73) { // L: 2843
					WorldMapSection2.method4516(10); // L: 2844
					UserComparator7.method2966(6); // L: 2845
					class139.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2846
				} else if (var0 == 72) { // L: 2848
					WorldMapSection2.method4516(10); // L: 2849
					UserComparator7.method2966(32); // L: 2850
				} else {
					class139.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2852
				}
			}
		}

		WorldMapSection2.method4516(10); // L: 2853
		int var4 = Login.loginIndex; // L: 2857
		boolean var5 = var1 != var4; // L: 2859
		if (!var5 && Client.field526.method9577()) { // L: 2860
			UserComparator7.method2966(9); // L: 2861
		}

	} // L: 2863
}
