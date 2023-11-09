import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public class class315 {
	@ObfuscatedName("af")
	public static final short[] field3550;
	@ObfuscatedName("an")
	public static final short[][] field3549;
	@ObfuscatedName("aw")
	public static final short[] field3551;
	@ObfuscatedName("ac")
	public static final short[][] field3552;

	static {
		field3550 = new short[]{6798, 8741, 25238, 4626, 4550}; // L: 4
		field3549 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, -22122, 937, 8130, -13422, 30385}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}}; // L: 5
		field3551 = new short[]{-10304, 9104, -1, -1, -1}; // L: 12
		field3552 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002, -22116, 945, 8144, -13414, 30389}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]}; // L: 13
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "104097029"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = class330.method6582(); // L: 2614
		if (var0 == -3) { // L: 2615
			class205.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2616
			class205.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2617
			class205.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2618
			class129.method3124(3); // L: 2619
			Login.field916 = 1; // L: 2620
		} else if (var0 == 4) { // L: 2622
			class14.method187(0); // L: 2623
		} else if (var0 == 5) { // L: 2625
			Login.field916 = 2; // L: 2626
			class205.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2627
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2629
			if (var0 == 7) { // L: 2632
				class205.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2633
				class205.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2634
				class205.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2635
				class205.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2636
				class205.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2637
				class205.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2638
				class205.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2639
				class205.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2640
				class205.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now."); // L: 2641
				class129.method3124(33); // L: 2642
			} else if (var0 == 17) { // L: 2644
				class205.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
			} else if (var0 == 18) { // L: 2645
				class14.method187(1); // L: 2646
			} else if (var0 == 19) { // L: 2648
				class205.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2649
				class205.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2650
				class205.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2651
				class205.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2652
				class205.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2653
				class205.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2654
				class205.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 2655
				class205.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2656
				class205.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) { // L: 2657
				class14.method187(2); // L: 2658
			} else if (var0 == 37) {
				class205.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", ""); // L: 2660
			} else if (var0 == 38) { // L: 2661
				class205.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2662
				class129.method3124(8); // L: 2663
			} else {
				if (var0 == 56) { // L: 2665
					class205.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2666
					class138.method3208(11); // L: 2667
					return; // L: 2668
				}

				if (var0 == 57) { // L: 2670
					class205.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2671
					class138.method3208(11); // L: 2672
					return; // L: 2673
				}

				if (var0 == 61) { // L: 2675
					class205.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2676
					class129.method3124(7); // L: 2677
				} else {
					if (var0 == 62) { // L: 2679
						class138.method3208(10); // L: 2680
						class129.method3124(9); // L: 2681
						class205.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2682
						return; // L: 2683
					}

					if (var0 == 63) { // L: 2685
						class138.method3208(10); // L: 2686
						class129.method3124(9); // L: 2687
						class205.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2688
						return; // L: 2689
					}

					if (var0 == 65 || var0 == 67) { // L: 2691
						class138.method3208(10); // L: 2692
						class129.method3124(9); // L: 2693
						class205.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2694
						return; // L: 2695
					}

					if (var0 == 71) { // L: 2697
						class138.method3208(10); // L: 2698
						class129.method3124(7); // L: 2699
						class205.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2700
					} else if (var0 == 73) { // L: 2702
						class138.method3208(10); // L: 2703
						class129.method3124(6); // L: 2704
						class205.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2705
					} else if (var0 == 72) { // L: 2707
						class138.method3208(10); // L: 2708
						class129.method3124(32); // L: 2709
					} else {
						class205.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2711
					}
				}
			}
		} else {
			class205.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2630
		}

		class138.method3208(10); // L: 2712
		boolean var2 = var1 != class330.method6582(); // L: 2713
		if (!var2 && Client.field527.method9347()) { // L: 2714
			class129.method3124(9); // L: 2715
		}

	} // L: 2717
}
