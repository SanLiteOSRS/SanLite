import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 126674031
	)
	static int field2367;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1353393005
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1211820087
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 561058861
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2034469349
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIILir;I)Z",
		garbageValue = "23201528"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lha;",
		garbageValue = "-6"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 19
			var1 = new InvDefinition(); // L: 20
			if (var2 != null) { // L: 21
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)Lsz;",
		garbageValue = "2001868404"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return ScriptEvent.worldMap; // L: 732
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2078991643"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2909
		if (var0 == -3) { // L: 2912
			UrlRequest.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2913
			UrlRequest.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2914
			UrlRequest.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2915
			class14.method171(3); // L: 2916
			Login.field895 = 1; // L: 2917
		} else if (var0 == 4) { // L: 2919
			class178.method3499(0); // L: 2920
		} else if (var0 == 5) { // L: 2922
			Login.field895 = 2; // L: 2923
			UrlRequest.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2924
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2926
			if (var0 == 7) { // L: 2929
				UrlRequest.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2930
				UrlRequest.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2931
				UrlRequest.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2932
				UrlRequest.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2933
				UrlRequest.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2934
				UrlRequest.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2935
				UrlRequest.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2936
				UrlRequest.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2937
				UrlRequest.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now."); // L: 2938
				class14.method171(33); // L: 2939
			} else if (var0 == 17) { // L: 2941
				UrlRequest.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
			} else if (var0 == 18) { // L: 2942
				class178.method3499(1); // L: 2943
			} else if (var0 == 19) { // L: 2945
				UrlRequest.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2946
				UrlRequest.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2947
				UrlRequest.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2948
				UrlRequest.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2949
				UrlRequest.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2950
				UrlRequest.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2951
				UrlRequest.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 2952
				UrlRequest.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2953
				UrlRequest.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) { // L: 2954
				class178.method3499(2); // L: 2955
			} else if (var0 == 37) { // L: 2957
				UrlRequest.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2958
				UrlRequest.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2959
				class14.method171(8); // L: 2960
			} else {
				if (var0 == 56) { // L: 2962
					UrlRequest.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2963
					class47.method867(11); // L: 2964
					return; // L: 2965
				}

				if (var0 == 57) { // L: 2967
					UrlRequest.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2968
					class47.method867(11); // L: 2969
					return; // L: 2970
				}

				if (var0 == 61) { // L: 2972
					UrlRequest.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2973
					class14.method171(7); // L: 2974
				} else {
					if (var0 == 62) { // L: 2976
						class47.method867(10); // L: 2977
						class14.method171(9); // L: 2978
						UrlRequest.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2979
						return; // L: 2980
					}

					if (var0 == 63) { // L: 2982
						class47.method867(10); // L: 2983
						class14.method171(9); // L: 2984
						UrlRequest.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2985
						return; // L: 2986
					}

					if (var0 == 65 || var0 == 67) { // L: 2988
						class47.method867(10); // L: 2989
						class14.method171(9); // L: 2990
						UrlRequest.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2991
						return; // L: 2992
					}

					if (var0 == 71) { // L: 2994
						class47.method867(10); // L: 2995
						class14.method171(7); // L: 2996
						UrlRequest.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2997
					} else if (var0 == 73) { // L: 2999
						class47.method867(10); // L: 3000
						class14.method171(6); // L: 3001
						UrlRequest.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 3002
					} else if (var0 == 72) { // L: 3004
						class47.method867(10); // L: 3005
						class14.method171(32); // L: 3006
					} else {
						UrlRequest.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 3008
					}
				}
			}
		} else {
			UrlRequest.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2927
		}

		class47.method867(10); // L: 3009
		int var4 = Login.loginIndex; // L: 3013
		boolean var5 = var4 != var1; // L: 3015
		if (!var5 && Client.field522.method9253()) { // L: 3016
			class14.method171(9); // L: 3017
		}

	} // L: 3019
}
