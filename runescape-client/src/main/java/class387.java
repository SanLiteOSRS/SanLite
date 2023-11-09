import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
public class class387 {
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	static GraphicsDefaults field4432;

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = class466.method8377(); // L: 2762
		if (var0 == -3) { // L: 2763
			class318.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2764
			class318.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2765
			class318.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2766
			PcmPlayer.method838(3); // L: 2767
			Login.field943 = 1; // L: 2768
		} else if (var0 == 4) { // L: 2770
			PcmPlayer.method838(14); // L: 2772
			Login.field942 = 0; // L: 2773
		} else if (var0 == 5) { // L: 2776
			Login.field943 = 2; // L: 2777
			class318.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2778
		} else if (var0 == 68) { // L: 2780
			if (!Client.field537) { // L: 2781
				Client.field537 = true; // L: 2782
				class415.method7708(); // L: 2783
				return; // L: 2784
			}

			class318.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2787
		} else if (!Client.onMobile && var0 == 6) { // L: 2790
			class318.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2791
		} else if (var0 == 7) { // L: 2793
			class318.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2794
			class318.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2795
			class318.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2796
			class318.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2797
			class318.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2798
			class318.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2799
			class318.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2800
			class318.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2801
			class318.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now."); // L: 2802
			PcmPlayer.method838(33); // L: 2803
		} else if (var0 == 17) { // L: 2805
			class318.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 2806
			PcmPlayer.method838(14); // L: 2808
			Login.field942 = 1; // L: 2809
		} else if (var0 == 19) { // L: 2812
			class318.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2813
			class318.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2814
			class318.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2815
			class318.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2816
			class318.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2817
			class318.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2818
			class318.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2819
			class318.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 2820
			class318.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) { // L: 2821
			PcmPlayer.method838(14); // L: 2823
			Login.field942 = 2; // L: 2824
		} else if (var0 == 37) { // L: 2827
			class318.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2828
			class318.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 2829
			PcmPlayer.method838(8); // L: 2830
		} else {
			if (var0 == 56) { // L: 2832
				class318.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2833
				class317.method6014(11); // L: 2834
				return; // L: 2835
			}

			if (var0 == 57) { // L: 2837
				class318.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2838
				class317.method6014(11); // L: 2839
				return; // L: 2840
			}

			if (var0 == 61) { // L: 2842
				class318.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2843
				PcmPlayer.method838(7); // L: 2844
			} else {
				if (var0 == 62) { // L: 2846
					class317.method6014(10); // L: 2847
					PcmPlayer.method838(9); // L: 2848
					class318.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2849
					return; // L: 2850
				}

				if (var0 == 63) { // L: 2852
					class317.method6014(10); // L: 2853
					PcmPlayer.method838(9); // L: 2854
					class318.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2855
					return; // L: 2856
				}

				if (var0 == 65 || var0 == 67) { // L: 2858
					class317.method6014(10); // L: 2859
					PcmPlayer.method838(9); // L: 2860
					class318.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2861
					return; // L: 2862
				}

				if (var0 == 71) { // L: 2864
					class317.method6014(10); // L: 2865
					PcmPlayer.method838(7); // L: 2866
					class318.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2867
				} else if (var0 == 73) { // L: 2869
					class317.method6014(10); // L: 2870
					PcmPlayer.method838(6); // L: 2871
					class318.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2872
				} else if (var0 == 72) { // L: 2874
					class317.method6014(10); // L: 2875
					PcmPlayer.method838(32); // L: 2876
				} else {
					class318.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2878
				}
			}
		}

		class317.method6014(10); // L: 2879
		boolean var2 = var1 != class466.method8377(); // L: 2880
		if (!var2 && Client.field571.method9339()) { // L: 2881
			PcmPlayer.method838(9); // L: 2882
		}

	} // L: 2884
}
