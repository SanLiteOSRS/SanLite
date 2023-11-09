import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 498103363
	)
	@Export("canvasWidth")
	public static int canvasWidth;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;I)I",
		garbageValue = "-1467178768"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1); // L: 69
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 73
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 77
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1454802245"
	)
	public static int method6890(int var0) {
		if (var0 > 0) { // L: 222
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 223 224
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2107301035"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2859
		if (var0 == -3) { // L: 2862
			Actor.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2863
			Actor.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2864
			Actor.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2865
			class328.method6115(3); // L: 2866
			Login.field930 = 1; // L: 2867
		} else if (var0 == 4) { // L: 2869
			class328.method6115(14); // L: 2871
			Login.field929 = 0; // L: 2872
		} else if (var0 == 5) { // L: 2875
			Login.field930 = 2; // L: 2876
			Actor.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2877
		} else if (var0 == 68) { // L: 2879
			if (!Client.field527) { // L: 2880
				Client.field527 = true; // L: 2881
				InterfaceParent.method2277(); // L: 2882
				return; // L: 2883
			}

			Actor.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2886
		} else if (!Client.onMobile && var0 == 6) { // L: 2889
			Actor.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2890
		} else if (var0 == 7) { // L: 2892
			Actor.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2893
			Actor.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2894
			Actor.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2895
			Actor.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2896
			Actor.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2897
			Actor.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2898
			Actor.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2899
			Actor.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2900
			Actor.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now."); // L: 2901
			class328.method6115(33); // L: 2902
		} else if (var0 == 17) { // L: 2904
			Actor.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 2905
			class328.method6115(14); // L: 2907
			Login.field929 = 1; // L: 2908
		} else if (var0 == 19) { // L: 2911
			Actor.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2912
			Actor.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2913
			Actor.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2914
			Actor.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2915
			Actor.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2916
			Actor.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2917
			Actor.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2918
			Actor.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 2919
			Actor.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) { // L: 2920
			class328.method6115(14); // L: 2922
			Login.field929 = 2; // L: 2923
		} else if (var0 == 37) { // L: 2926
			Actor.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2927
			Actor.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 2928
			class328.method6115(8); // L: 2929
		} else {
			if (var0 == 56) { // L: 2931
				Actor.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2932
				class129.method2989(11); // L: 2933
				return; // L: 2934
			}

			if (var0 == 57) { // L: 2936
				Actor.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2937
				class129.method2989(11); // L: 2938
				return; // L: 2939
			}

			if (var0 == 61) { // L: 2941
				Actor.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2942
				class328.method6115(7); // L: 2943
			} else {
				if (var0 == 62) { // L: 2945
					class129.method2989(10); // L: 2946
					class328.method6115(9); // L: 2947
					Actor.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2948
					return; // L: 2949
				}

				if (var0 == 63) { // L: 2951
					class129.method2989(10); // L: 2952
					class328.method6115(9); // L: 2953
					Actor.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2954
					return; // L: 2955
				}

				if (var0 == 65 || var0 == 67) { // L: 2957
					class129.method2989(10); // L: 2958
					class328.method6115(9); // L: 2959
					Actor.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2960
					return; // L: 2961
				}

				if (var0 == 71) { // L: 2963
					class129.method2989(10); // L: 2964
					class328.method6115(7); // L: 2965
					Actor.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2966
				} else if (var0 == 73) { // L: 2968
					class129.method2989(10); // L: 2969
					class328.method6115(6); // L: 2970
					Actor.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2971
				} else if (var0 == 72) { // L: 2973
					class129.method2989(10); // L: 2974
					class328.method6115(32); // L: 2975
				} else {
					Actor.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2977
				}
			}
		}

		class129.method2989(10); // L: 2978
		boolean var3 = var1 != class93.method2370(); // L: 2979
		if (!var3 && Client.field556.method9394()) { // L: 2980
			class328.method6115(9); // L: 2981
		}

	} // L: 2983

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "8"
	)
	static final void method6892(boolean var0) {
		if (var0) { // L: 3104
			Client.field555 = Login.field943 ? class139.field1628 : class139.field1630; // L: 3105
		} else {
			Client.field555 = class150.clientPreferences.method2540(Login.Login_username) ? class139.field1634 : class139.field1629; // L: 3108
		}

	} // L: 3110
}
