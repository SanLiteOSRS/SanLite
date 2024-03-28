import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("KeyHandler")
public class KeyHandler {
	@ObfuscatedName("dp")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 92
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-564549382"
	)
	public static void method403(Huffman var0) {
		class352.huffman = var0; // L: 14
	} // L: 15

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2812
		if (var0 == -3) { // L: 2815
			class59.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2816
			class59.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2817
			class59.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2818
			class210.method3930(3); // L: 2819
			Login.field938 = 1; // L: 2820
		} else if (var0 == 4) { // L: 2822
			WorldMapLabelSize.method5240(0); // L: 2823
		} else if (var0 == 5) { // L: 2825
			Login.field938 = 2; // L: 2826
			class59.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2827
		} else if (var0 == 68) { // L: 2829
			if (!Client.isLoading) { // L: 2830
				Client.isLoading = true; // L: 2831
				class441.method7995(); // L: 2832
				return; // L: 2833
			}

			class59.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2836
		} else if (!Client.onMobile && var0 == 6) { // L: 2839
			class59.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2840
		} else if (var0 == 7) { // L: 2842
			class59.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2843
			class59.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2844
			class59.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2845
			class59.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2846
			class59.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2847
			class59.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2848
			class59.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2849
			class59.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2850
			class59.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now."); // L: 2851
			class210.method3930(33); // L: 2852
		} else if (var0 == 17) { // L: 2854
			class59.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 2855
			WorldMapLabelSize.method5240(1); // L: 2856
		} else if (var0 == 19) { // L: 2858
			class59.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2859
			class59.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2860
			class59.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2861
			class59.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2862
			class59.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2863
			class59.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2864
			class59.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2865
			class59.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class59.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game."); // L: 2866
		} else if (var0 == 32) { // L: 2867
			WorldMapLabelSize.method5240(2); // L: 2868
		} else if (var0 == 37) { // L: 2870
			class59.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2871
			class59.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) { // L: 2872
			class59.setLoginResponseString("This world is running a", "closed beta. Please", "use a different world.");
		} else if (var0 == 55) { // L: 2873
			class210.method3930(8); // L: 2874
		} else {
			if (var0 == 56) { // L: 2876
				class59.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2877
				FaceNormal.method4886(11); // L: 2878
				return; // L: 2879
			}

			if (var0 == 57) { // L: 2881
				class59.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2882
				FaceNormal.method4886(11); // L: 2883
				return; // L: 2884
			}

			if (var0 == 61) { // L: 2886
				class59.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2887
				class210.method3930(7); // L: 2888
			} else {
				if (var0 == 62) { // L: 2890
					FaceNormal.method4886(10); // L: 2891
					class210.method3930(9); // L: 2892
					class59.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2893
					return; // L: 2894
				}

				if (var0 == 63) { // L: 2896
					FaceNormal.method4886(10); // L: 2897
					class210.method3930(9); // L: 2898
					class59.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2899
					return; // L: 2900
				}

				if (var0 == 65 || var0 == 67) { // L: 2902
					FaceNormal.method4886(10); // L: 2903
					class210.method3930(9); // L: 2904
					class59.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2905
					return; // L: 2906
				}

				if (var0 == 71) { // L: 2908
					FaceNormal.method4886(10); // L: 2909
					class210.method3930(7); // L: 2910
					class59.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2911
				} else if (var0 == 73) { // L: 2913
					FaceNormal.method4886(10); // L: 2914
					class210.method3930(6); // L: 2915
					class59.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2916
				} else if (var0 == 72) { // L: 2918
					FaceNormal.method4886(10); // L: 2919
					class210.method3930(32); // L: 2920
				} else {
					class59.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2922
				}
			}
		}

		FaceNormal.method4886(10); // L: 2923
		int var4 = Login.loginIndex; // L: 2927
		boolean var5 = var4 != var1; // L: 2929
		if (!var5 && Client.field810.method9558()) { // L: 2930
			class210.method3930(9); // L: 2931
		}

	} // L: 2933
}
