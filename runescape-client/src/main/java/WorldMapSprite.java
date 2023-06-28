import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("an")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1695191644"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64]; // L: 19
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-86"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = class135.method3048(); // L: 2864
		if (var0 == -3) { // L: 2865
			class478.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2866
			class478.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2867
			class478.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2868
			class390.method7249(3); // L: 2869
			Login.field929 = 1; // L: 2870
		} else if (var0 == 4) { // L: 2872
			class390.method7249(14); // L: 2874
			Login.field925 = 0; // L: 2875
		} else if (var0 == 5) { // L: 2878
			Login.field929 = 2; // L: 2879
			class478.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2880
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) { // L: 2882
			class478.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2883
		} else if (var0 == 7) { // L: 2885
			class478.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2886
			class478.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2887
			class478.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2888
			class478.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2889
			class478.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2890
			class478.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2891
			class478.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2892
			class478.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2893
			class478.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now."); // L: 2894
			class390.method7249(33); // L: 2895
		} else if (var0 == 17) { // L: 2897
			class478.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 2898
			class390.method7249(14); // L: 2900
			Login.field925 = 1; // L: 2901
		} else if (var0 == 19) { // L: 2904
			class478.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2905
			class478.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2906
			class478.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2907
			class478.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2908
			class478.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2909
			class478.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2910
			class478.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2911
			class478.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 2912
			class478.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) { // L: 2913
			class390.method7249(14); // L: 2915
			Login.field925 = 2; // L: 2916
		} else if (var0 == 37) { // L: 2919
			class478.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2920
			class478.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 2921
			class390.method7249(8); // L: 2922
		} else {
			if (var0 == 56) { // L: 2924
				class478.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2925
				UserComparator8.method2855(11); // L: 2926
				return; // L: 2927
			}

			if (var0 == 57) { // L: 2929
				class478.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2930
				UserComparator8.method2855(11); // L: 2931
				return; // L: 2932
			}

			if (var0 == 61) { // L: 2934
				class478.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2935
				class390.method7249(7); // L: 2936
			} else {
				if (var0 == 62) { // L: 2938
					UserComparator8.method2855(10); // L: 2939
					class390.method7249(9); // L: 2940
					class478.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2941
					return; // L: 2942
				}

				if (var0 == 63) { // L: 2944
					UserComparator8.method2855(10); // L: 2945
					class390.method7249(9); // L: 2946
					class478.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2947
					return; // L: 2948
				}

				if (var0 == 65 || var0 == 67) { // L: 2950
					UserComparator8.method2855(10); // L: 2951
					class390.method7249(9); // L: 2952
					class478.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2953
					return; // L: 2954
				}

				if (var0 == 71) { // L: 2956
					UserComparator8.method2855(10); // L: 2957
					class390.method7249(7); // L: 2958
					class478.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2959
				} else if (var0 == 73) { // L: 2961
					UserComparator8.method2855(10); // L: 2962
					class390.method7249(6); // L: 2963
					class478.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2964
				} else if (var0 == 72) { // L: 2966
					UserComparator8.method2855(10); // L: 2967
					class390.method7249(32); // L: 2968
				} else {
					class478.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2970
				}
			}
		}

		UserComparator8.method2855(10); // L: 2971
		boolean var2 = var1 != class135.method3048(); // L: 2972
		if (!var2 && Client.field633.method9212()) { // L: 2973
			class390.method7249(9); // L: 2974
		}

	} // L: 2976
}
