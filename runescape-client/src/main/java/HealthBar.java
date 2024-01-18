import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = -1778066565
	)
	static int field1296;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lgd;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-600017305"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) { // L: 27
				var5 = var7;
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ldo;",
		garbageValue = "1806626844"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1638250969"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method7364(); // L: 55
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "-51"
	)
	static char method2654(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-835116985"
	)
	public static int method2644(CharSequence var0) {
		return KitDefinition.method3666(var0, 10, true); // L: 73
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "559859122"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2768
		if (var0 == -3) { // L: 2771
			class142.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2772
			class142.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2773
			class142.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2774
			Actor.method2489(3); // L: 2775
			Login.field916 = 1; // L: 2776
		} else if (var0 == 4) { // L: 2778
			Actor.method2489(14); // L: 2780
			Login.field919 = 0; // L: 2781
		} else if (var0 == 5) { // L: 2784
			Login.field916 = 2; // L: 2785
			class142.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2786
		} else if (var0 == 68) { // L: 2788
			if (!Client.isLoading) { // L: 2789
				Client.isLoading = true; // L: 2790
				class281.method5621(); // L: 2791
				return; // L: 2792
			}

			class142.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2795
		} else if (!Client.onMobile && var0 == 6) { // L: 2798
			class142.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2799
		} else if (var0 == 7) { // L: 2801
			class142.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2802
			class142.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2803
			class142.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2804
			class142.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2805
			class142.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2806
			class142.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2807
			class142.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2808
			class142.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2809
			class142.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now."); // L: 2810
			Actor.method2489(33); // L: 2811
		} else if (var0 == 17) { // L: 2813
			class142.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 2814
			Actor.method2489(14); // L: 2816
			Login.field919 = 1; // L: 2817
		} else if (var0 == 19) { // L: 2820
			class142.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2821
			class142.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2822
			class142.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2823
			class142.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2824
			class142.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2825
			class142.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2826
			class142.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2827
			class142.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 2828
			class142.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) { // L: 2829
			Actor.method2489(14); // L: 2831
			Login.field919 = 2; // L: 2832
		} else if (var0 == 37) { // L: 2835
			class142.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2836
			class142.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 2837
			Actor.method2489(8); // L: 2838
		} else {
			if (var0 == 56) { // L: 2840
				class142.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2841
				class131.method3087(11); // L: 2842
				return; // L: 2843
			}

			if (var0 == 57) { // L: 2845
				class142.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2846
				class131.method3087(11); // L: 2847
				return; // L: 2848
			}

			if (var0 == 61) { // L: 2850
				class142.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2851
				Actor.method2489(7); // L: 2852
			} else {
				if (var0 == 62) { // L: 2854
					class131.method3087(10); // L: 2855
					Actor.method2489(9); // L: 2856
					class142.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2857
					return; // L: 2858
				}

				if (var0 == 63) { // L: 2860
					class131.method3087(10); // L: 2861
					Actor.method2489(9); // L: 2862
					class142.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2863
					return; // L: 2864
				}

				if (var0 == 65 || var0 == 67) { // L: 2866
					class131.method3087(10); // L: 2867
					Actor.method2489(9); // L: 2868
					class142.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2869
					return; // L: 2870
				}

				if (var0 == 71) { // L: 2872
					class131.method3087(10); // L: 2873
					Actor.method2489(7); // L: 2874
					class142.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2875
				} else if (var0 == 73) { // L: 2877
					class131.method3087(10); // L: 2878
					Actor.method2489(6); // L: 2879
					class142.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2880
				} else if (var0 == 72) { // L: 2882
					class131.method3087(10); // L: 2883
					Actor.method2489(32); // L: 2884
				} else {
					class142.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2886
				}
			}
		}

		class131.method3087(10); // L: 2887
		int var4 = Login.loginIndex; // L: 2891
		boolean var5 = var1 != var4; // L: 2893
		if (!var5 && Client.field626.method9672()) { // L: 2894
			Actor.method2489(9); // L: 2895
		}

	} // L: 2897
}
