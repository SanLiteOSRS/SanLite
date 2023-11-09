import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ar")
public class class32 {
	@ObfuscatedName("h")
	public static Applet field182;
	@ObfuscatedName("e")
	public static String field183;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1450599729
	)
	static int field191;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	static {
		field182 = null; // L: 10
		field183 = ""; // L: 11
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "567247801"
	)
	public static long method461(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48); // L: 23
			}

			if (var1 >= 177917621779460413L) { // L: 24
				break;
			}
		}

		while (var1 % 37L == 0L && 0L != var1) { // L: 26
			var1 /= 37L;
		}

		return var1; // L: 27
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "115056037"
	)
	public static void method468(int var0) {
		if (class286.musicPlayerStatus != 0) { // L: 44
			class467.musicTrackVolume = var0;
		} else {
			class251.midiPcmStream.setPcmStreamVolume(var0); // L: 45
		}

	} // L: 46

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1648061781"
	)
	static void method459() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-316408933"
	)
	static int method466(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1042
		Widget var4;
		if (var0 >= 2000) { // L: 1044
			var0 -= 1000; // L: 1045
			var4 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1046
			var3 = false; // L: 1047
		} else {
			var4 = var2 ? class190.scriptDotWidget : class360.field4354; // L: 1049
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1050
			var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] - 1; // L: 1051
			if (var11 >= 0 && var11 <= 9) { // L: 1052
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 1056
				return 1; // L: 1057
			} else {
				--Interpreter.Interpreter_stringStackSize; // L: 1053
				return 1; // L: 1054
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1059
				class87.Interpreter_intStackSize -= 2; // L: 1060
				var11 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 1061
				var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 1062
				var4.parent = AttackOption.getWidgetChild(var11, var6); // L: 1063
				return 1; // L: 1064
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1066
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 1067
				return 1; // L: 1068
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1070
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1071
				return 1; // L: 1072
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1074
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1075
				return 1; // L: 1076
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1078
				var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1079
				return 1; // L: 1080
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1082
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1083
				return 1; // L: 1084
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1086
				var4.actions = null; // L: 1087
				return 1; // L: 1088
			} else if (var0 == 1308) { // L: 1090
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 1091
				return 1; // L: 1092
			} else if (var0 == 1309) { // L: 1094
				--class87.Interpreter_intStackSize; // L: 1095
				return 1; // L: 1096
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1098
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1128
						class87.Interpreter_intStackSize -= 2; // L: 1129
						var5 = 10; // L: 1130
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]}; // L: 1131
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]}; // L: 1132
						class18.Widget_setKey(var4, var5, var8, var9); // L: 1133
						return 1; // L: 1134
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1136
						class87.Interpreter_intStackSize -= 3; // L: 1137
						var11 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] - 1; // L: 1138
						var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 1139
						var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 1140
						if (var11 >= 0 && var11 <= 9) { // L: 1141
							class9.Widget_setKeyRate(var4, var11, var6, var7); // L: 1144
							return 1; // L: 1145
						} else {
							throw new RuntimeException(); // L: 1142
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1147
						var5 = 10; // L: 1148
						var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1149
						var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1150
						class9.Widget_setKeyRate(var4, var5, var6, var7); // L: 1151
						return 1; // L: 1152
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1154
						--class87.Interpreter_intStackSize; // L: 1155
						var11 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] - 1; // L: 1156
						if (var11 >= 0 && var11 <= 9) { // L: 1157
							GrandExchangeOfferTotalQuantityComparator.Widget_setKeyIgnoreHeld(var4, var11); // L: 1160
							return 1; // L: 1161
						} else {
							throw new RuntimeException(); // L: 1158
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1163
						var5 = 10; // L: 1164
						GrandExchangeOfferTotalQuantityComparator.Widget_setKeyIgnoreHeld(var4, var5); // L: 1165
						return 1; // L: 1166
					} else {
						return 2; // L: 1168
					}
				} else {
					byte[] var10 = null; // L: 1099
					var8 = null; // L: 1100
					if (var3) { // L: 1101
						class87.Interpreter_intStackSize -= 10; // L: 1102

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class87.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1104 1105
						}

						if (var7 > 0) { // L: 1107
							var10 = new byte[var7 / 2]; // L: 1108
							var8 = new byte[var7 / 2]; // L: 1109

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1110
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class87.Interpreter_intStackSize]; // L: 1111
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class87.Interpreter_intStackSize + 1]; // L: 1112
							}
						}
					} else {
						class87.Interpreter_intStackSize -= 2; // L: 1117
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]}; // L: 1118
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]}; // L: 1119
					}

					var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] - 1; // L: 1121
					if (var7 >= 0 && var7 <= 9) { // L: 1122
						class18.Widget_setKey(var4, var7, var10, var8); // L: 1125
						return 1; // L: 1126
					} else {
						throw new RuntimeException(); // L: 1123
					}
				}
			}
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2002926472"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = GraphicsObject.method2024(); // L: 2581
		if (var0 == -3) { // L: 2582
			TaskHandler.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2583
			TaskHandler.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2584
			TaskHandler.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2585
			class12.method155(3); // L: 2586
			Login.field928 = 1; // L: 2587
		} else if (var0 == 4) { // L: 2589
			DevicePcmPlayerProvider.method320(0); // L: 2590
		} else if (var0 == 5) { // L: 2592
			Login.field928 = 2; // L: 2593
			TaskHandler.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2594
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2596
			if (var0 == 7) { // L: 2599
				TaskHandler.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2600
				TaskHandler.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2601
				TaskHandler.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2602
				TaskHandler.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2603
				TaskHandler.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2604
				TaskHandler.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2605
				TaskHandler.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2606
				TaskHandler.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2607
				TaskHandler.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 2608
				TaskHandler.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
			} else if (var0 == 18) { // L: 2609
				DevicePcmPlayerProvider.method320(1); // L: 2610
			} else if (var0 == 19) { // L: 2612
				TaskHandler.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2613
				TaskHandler.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2614
				TaskHandler.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2615
				TaskHandler.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2616
				TaskHandler.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2617
				TaskHandler.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2618
				TaskHandler.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) {
				TaskHandler.setLoginResponseString("", "Service unavailable.", ""); // L: 2619
			} else if (var0 == 31) { // L: 2620
				TaskHandler.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) { // L: 2621
				DevicePcmPlayerProvider.method320(2); // L: 2622
			} else if (var0 == 37) { // L: 2624
				TaskHandler.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2625
				TaskHandler.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2626
				class12.method155(8); // L: 2627
			} else {
				if (var0 == 56) { // L: 2629
					TaskHandler.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2630
					class140.method3102(11); // L: 2631
					return; // L: 2632
				}

				if (var0 == 57) { // L: 2634
					TaskHandler.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2635
					class140.method3102(11); // L: 2636
					return; // L: 2637
				}

				if (var0 == 61) { // L: 2639
					TaskHandler.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2640
					class12.method155(7); // L: 2641
				} else {
					if (var0 == 62) { // L: 2643
						class140.method3102(10); // L: 2644
						class12.method155(9); // L: 2645
						TaskHandler.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2646
						return; // L: 2647
					}

					if (var0 == 63) { // L: 2649
						class140.method3102(10); // L: 2650
						class12.method155(9); // L: 2651
						TaskHandler.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2652
						return; // L: 2653
					}

					if (var0 == 65 || var0 == 67) { // L: 2655
						class140.method3102(10); // L: 2656
						class12.method155(9); // L: 2657
						TaskHandler.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2658
						return; // L: 2659
					}

					if (var0 == 71) { // L: 2661
						class140.method3102(10); // L: 2662
						class12.method155(7); // L: 2663
						TaskHandler.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2664
					} else if (var0 == 73) { // L: 2666
						class140.method3102(10); // L: 2667
						class12.method155(6); // L: 2668
						TaskHandler.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2669
					} else if (var0 == 72) { // L: 2671
						class140.method3102(10); // L: 2672
						class12.method155(26); // L: 2673
					} else {
						TaskHandler.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2675
					}
				}
			}
		} else {
			TaskHandler.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2597
		}

		class140.method3102(10); // L: 2676
		boolean var2 = var1 != GraphicsObject.method2024(); // L: 2677
		if (!var2 && Client.field640.method8841()) { // L: 2678
			class12.method155(9); // L: 2679
		}

	} // L: 2681

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-941365461"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = AttackOption.getWidgetChild(var0, var1); // L: 9835
		if (var4 != null && var4.onTargetEnter != null) { // L: 9836
			ScriptEvent var5 = new ScriptEvent(); // L: 9837
			var5.widget = var4; // L: 9838
			var5.args = var4.onTargetEnter; // L: 9839
			WorldMapElement.runScriptEvent(var5); // L: 9840
		}

		Client.selectedSpellItemId = var3; // L: 9842
		Client.isSpellSelected = true; // L: 9843
		class358.selectedSpellWidget = var0; // L: 9844
		Client.selectedSpellChildIndex = var1; // L: 9845
		class21.selectedSpellFlags = var2; // L: 9846
		class69.invalidateWidget(var4); // L: 9847
	} // L: 9848
}
