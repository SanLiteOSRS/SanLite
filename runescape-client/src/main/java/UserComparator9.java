import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("ai")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqd;Lqd;B)I",
		garbageValue = "-61"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-620091668"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 178
			int var6 = (var0 + var1) / 2; // L: 179
			int var7 = var0; // L: 180
			World var8 = class16.World_worlds[var6]; // L: 181
			class16.World_worlds[var6] = class16.World_worlds[var1]; // L: 182
			class16.World_worlds[var1] = var8; // L: 183

			for (int var9 = var0; var9 < var1; ++var9) { // L: 184
				World var11 = class16.World_worlds[var9]; // L: 186
				int var12 = EnumComposition.compareWorlds(var11, var8, var2, var3); // L: 188
				int var10;
				if (var12 != 0) { // L: 189
					if (var3) { // L: 190
						var10 = -var12; // L: 191
					} else {
						var10 = var12; // L: 195
					}
				} else if (var4 == -1) { // L: 199
					var10 = 0; // L: 200
				} else {
					int var13 = EnumComposition.compareWorlds(var11, var8, var4, var5); // L: 203
					if (var5) { // L: 204
						var10 = -var13;
					} else {
						var10 = var13; // L: 205
					}
				}

				if (var10 <= 0) { // L: 207
					World var14 = class16.World_worlds[var9]; // L: 208
					class16.World_worlds[var9] = class16.World_worlds[var7]; // L: 209
					class16.World_worlds[var7++] = var14; // L: 210
				}
			}

			class16.World_worlds[var1] = class16.World_worlds[var7]; // L: 214
			class16.World_worlds[var7] = var8; // L: 215
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 216
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 217
		}

	} // L: 219

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1868859225"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2794
		if (var0 == -3) { // L: 2797
			class156.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2798
			class156.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2799
			class156.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2800
			ObjectSound.method1926(3); // L: 2801
			Login.field927 = 1; // L: 2802
		} else if (var0 == 4) { // L: 2804
			CollisionMap.method4318(0); // L: 2805
		} else if (var0 == 5) { // L: 2807
			Login.field927 = 2; // L: 2808
			class156.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2809
		} else if (var0 == 68) { // L: 2811
			if (!Client.field509) { // L: 2812
				Client.field509 = true; // L: 2813
				class405.method7622(); // L: 2814
				return; // L: 2815
			}

			class156.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2818
		} else if (!Client.onMobile && var0 == 6) { // L: 2821
			class156.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2822
		} else if (var0 == 7) { // L: 2824
			class156.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2825
			class156.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2826
			class156.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2827
			class156.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2828
			class156.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2829
			class156.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2830
			class156.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2831
			class156.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2832
			class156.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now."); // L: 2833
			ObjectSound.method1926(33); // L: 2834
		} else if (var0 == 17) { // L: 2836
			class156.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 2837
			CollisionMap.method4318(1); // L: 2838
		} else if (var0 == 19) { // L: 2840
			class156.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2841
			class156.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2842
			class156.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2843
			class156.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2844
			class156.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2845
			class156.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2846
			class156.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2847
			class156.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class156.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game."); // L: 2848
		} else if (var0 == 32) { // L: 2849
			CollisionMap.method4318(2); // L: 2850
		} else if (var0 == 37) { // L: 2852
			class156.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2853
			class156.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 2854
			ObjectSound.method1926(8); // L: 2855
		} else {
			if (var0 == 56) { // L: 2857
				class156.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2858
				AttackOption.method2723(11); // L: 2859
				return; // L: 2860
			}

			if (var0 == 57) { // L: 2862
				class156.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2863
				AttackOption.method2723(11); // L: 2864
				return; // L: 2865
			}

			if (var0 == 61) { // L: 2867
				class156.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2868
				ObjectSound.method1926(7); // L: 2869
			} else {
				if (var0 == 62) { // L: 2871
					AttackOption.method2723(10); // L: 2872
					ObjectSound.method1926(9); // L: 2873
					class156.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2874
					return; // L: 2875
				}

				if (var0 == 63) { // L: 2877
					AttackOption.method2723(10); // L: 2878
					ObjectSound.method1926(9); // L: 2879
					class156.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2880
					return; // L: 2881
				}

				if (var0 == 65 || var0 == 67) { // L: 2883
					AttackOption.method2723(10); // L: 2884
					ObjectSound.method1926(9); // L: 2885
					class156.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2886
					return; // L: 2887
				}

				if (var0 == 71) { // L: 2889
					AttackOption.method2723(10); // L: 2890
					ObjectSound.method1926(7); // L: 2891
					class156.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2892
				} else if (var0 == 73) { // L: 2894
					AttackOption.method2723(10); // L: 2895
					ObjectSound.method1926(6); // L: 2896
					class156.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2897
				} else if (var0 == 72) { // L: 2899
					AttackOption.method2723(10); // L: 2900
					ObjectSound.method1926(32); // L: 2901
				} else {
					class156.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2903
				}
			}
		}

		AttackOption.method2723(10); // L: 2904
		int var4 = Login.loginIndex; // L: 2908
		boolean var5 = var4 != var1; // L: 2910
		if (!var5 && Client.field539.method9357()) { // L: 2911
			ObjectSound.method1926(9); // L: 2912
		}

	} // L: 2914
}
