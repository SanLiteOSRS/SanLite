import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class198 {
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive9")
	static Archive archive9;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2044605112"
	)
	public static void method3737() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 122
		SpotAnimationDefinition.field2120.clear(); // L: 123
	} // L: 124

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "64"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2810
		if (var0 == -3) { // L: 2813
			AbstractWorldMapIcon.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2814
			AbstractWorldMapIcon.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2815
			AbstractWorldMapIcon.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2816
			GameEngine.method647(3); // L: 2817
			Login.field938 = 1; // L: 2818
		} else if (var0 == 4) { // L: 2820
			class27.method393(0); // L: 2821
		} else if (var0 == 5) { // L: 2823
			Login.field938 = 2; // L: 2824
			AbstractWorldMapIcon.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2825
		} else if (var0 == 68) { // L: 2827
			if (!Client.field615) { // L: 2828
				Client.field615 = true; // L: 2829
				class140.method3120(); // L: 2830
				return; // L: 2831
			}

			AbstractWorldMapIcon.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2834
		} else if (!Client.onMobile && var0 == 6) { // L: 2837
			AbstractWorldMapIcon.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2838
		} else if (var0 == 7) { // L: 2840
			AbstractWorldMapIcon.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2841
			AbstractWorldMapIcon.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2842
			AbstractWorldMapIcon.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2843
			AbstractWorldMapIcon.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2844
			AbstractWorldMapIcon.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2845
			AbstractWorldMapIcon.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2846
			AbstractWorldMapIcon.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2847
			AbstractWorldMapIcon.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2848
			AbstractWorldMapIcon.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now."); // L: 2849
			GameEngine.method647(33); // L: 2850
		} else if (var0 == 17) { // L: 2852
			AbstractWorldMapIcon.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 2853
			class27.method393(1); // L: 2854
		} else if (var0 == 19) { // L: 2856
			AbstractWorldMapIcon.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2857
			AbstractWorldMapIcon.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2858
			AbstractWorldMapIcon.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2859
			AbstractWorldMapIcon.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2860
			AbstractWorldMapIcon.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2861
			AbstractWorldMapIcon.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2862
			AbstractWorldMapIcon.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2863
			AbstractWorldMapIcon.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 2864
			AbstractWorldMapIcon.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) { // L: 2865
			class27.method393(2); // L: 2866
		} else if (var0 == 37) { // L: 2868
			AbstractWorldMapIcon.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2869
			AbstractWorldMapIcon.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 2870
			GameEngine.method647(8); // L: 2871
		} else {
			if (var0 == 56) { // L: 2873
				AbstractWorldMapIcon.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2874
				DefaultsGroup.method8263(11); // L: 2875
				return; // L: 2876
			}

			if (var0 == 57) { // L: 2878
				AbstractWorldMapIcon.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2879
				DefaultsGroup.method8263(11); // L: 2880
				return; // L: 2881
			}

			if (var0 == 61) { // L: 2883
				AbstractWorldMapIcon.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2884
				GameEngine.method647(7); // L: 2885
			} else {
				if (var0 == 62) { // L: 2887
					DefaultsGroup.method8263(10); // L: 2888
					GameEngine.method647(9); // L: 2889
					AbstractWorldMapIcon.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2890
					return; // L: 2891
				}

				if (var0 == 63) { // L: 2893
					DefaultsGroup.method8263(10); // L: 2894
					GameEngine.method647(9); // L: 2895
					AbstractWorldMapIcon.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2896
					return; // L: 2897
				}

				if (var0 == 65 || var0 == 67) { // L: 2899
					DefaultsGroup.method8263(10); // L: 2900
					GameEngine.method647(9); // L: 2901
					AbstractWorldMapIcon.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2902
					return; // L: 2903
				}

				if (var0 == 71) { // L: 2905
					DefaultsGroup.method8263(10); // L: 2906
					GameEngine.method647(7); // L: 2907
					AbstractWorldMapIcon.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2908
				} else if (var0 == 73) { // L: 2910
					DefaultsGroup.method8263(10); // L: 2911
					GameEngine.method647(6); // L: 2912
					AbstractWorldMapIcon.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2913
				} else if (var0 == 72) { // L: 2915
					DefaultsGroup.method8263(10); // L: 2916
					GameEngine.method647(32); // L: 2917
				} else {
					AbstractWorldMapIcon.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2919
				}
			}
		}

		DefaultsGroup.method8263(10); // L: 2920
		int var4 = Login.loginIndex; // L: 2924
		boolean var5 = var4 != var1; // L: 2926
		if (!var5 && Client.field559.method9506()) { // L: 2927
			GameEngine.method647(9); // L: 2928
		}

	} // L: 2930

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1161000418"
	)
	static final void method3736(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12284
		class91.clientPreferences.method2518(var0); // L: 12285
	} // L: 12286
}
