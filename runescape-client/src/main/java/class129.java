import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public class class129 extends DualNode {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1307484353
	)
	int field1540;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[[Ldb;"
	)
	public class124[][] field1539;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[[Ldb;"
	)
	class124[][] field1538;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	public Skeleton field1541;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 444658097
	)
	int field1542;
	@ObfuscatedName("j")
	boolean field1543;

	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;IZ)V"
	)
	class129(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1539 = null; // L: 14
		this.field1538 = null; // L: 15
		this.field1542 = 0; // L: 17
		this.field1540 = var3; // L: 42
		byte[] var5 = var1.takeFile(this.field1540 >> 16 & 65535, this.field1540 & 65535); // L: 43
		Buffer var6 = new Buffer(var5); // L: 44
		int var7 = var6.readUnsignedByte(); // L: 45
		int var8 = var6.readUnsignedShort(); // L: 46
		byte[] var9;
		if (var4) { // L: 48
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0); // L: 49
		}

		this.field1541 = new Skeleton(var8, var9); // L: 50
		this.method2921(var6, var7); // L: 51
	} // L: 52

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "569723886"
	)
	void method2921(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 55
		var1.readUnsignedShort(); // L: 56
		this.field1542 = var1.readUnsignedByte(); // L: 57
		int var3 = var1.readUnsignedShort(); // L: 58
		this.field1538 = new class124[this.field1541.method4263().method4246()][]; // L: 59
		this.field1539 = new class124[this.field1541.method4262()][]; // L: 60

		for (int var4 = 0; var4 < var3; ++var4) { // L: 61
			int var6 = var1.readUnsignedByte(); // L: 63
			class125[] var7 = new class125[]{class125.field1510, class125.field1503, class125.field1501, class125.field1502, class125.field1499, class125.field1504}; // L: 67
			class125 var8 = (class125)DecorativeObject.findEnumerated(var7, var6); // L: 69
			if (var8 == null) { // L: 70
				var8 = class125.field1510;
			}

			int var13 = var1.readShortSmart(); // L: 74
			class126 var9 = ItemContainer.method2225(var1.readUnsignedByte()); // L: 75
			class124 var10 = new class124(); // L: 76
			var10.method2874(var1, var2); // L: 77
			int var11 = var8.method2901(); // L: 78
			class124[][] var12;
			if (var8 == class125.field1503) { // L: 80
				var12 = this.field1538; // L: 81
			} else {
				var12 = this.field1539; // L: 84
			}

			if (var12[var13] == null) { // L: 86
				var12[var13] = new class124[var11]; // L: 87
			}

			var12[var13][var9.method2907()] = var10; // L: 89
			if (var8 == class125.field1499) { // L: 90
				this.field1543 = true; // L: 91
			}
		}

	} // L: 94

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1403093085"
	)
	public int method2923() {
		return this.field1542; // L: 97
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1355661796"
	)
	public boolean method2928() {
		return this.field1543; // L: 101
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILdi;IIB)V",
		garbageValue = "57"
	)
	public void method2940(int var1, class122 var2, int var3, int var4) {
		class407 var5 = Coord.method5706(); // L: 105
		this.method2925(var5, var3, var2, var1); // L: 106
		this.method2920(var5, var3, var2, var1); // L: 107
		this.method2926(var5, var3, var2, var1); // L: 108
		var2.method2847(var5); // L: 109
		var5.method7695(); // L: 110
	} // L: 111

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lov;ILdi;IB)V",
		garbageValue = "1"
	)
	void method2925(class407 var1, int var2, class122 var3, int var4) {
		float[] var5 = var3.method2845(this.field1542); // L: 114
		float var6 = var5[0]; // L: 115
		float var7 = var5[1]; // L: 116
		float var8 = var5[2]; // L: 117
		if (this.field1538[var2] != null) { // L: 118
			class124 var9 = this.field1538[var2][0]; // L: 119
			class124 var10 = this.field1538[var2][1]; // L: 120
			class124 var11 = this.field1538[var2][2]; // L: 121
			if (var9 != null) { // L: 122
				var6 = var9.method2885(var4);
			}

			if (var10 != null) { // L: 123
				var7 = var10.method2885(var4);
			}

			if (var11 != null) { // L: 124
				var8 = var11.method2885(var4);
			}
		}

		class406 var16 = FriendSystem.method1847(); // L: 126
		var16.method7638(1.0F, 0.0F, 0.0F, var6); // L: 127
		class406 var14 = FriendSystem.method1847(); // L: 128
		var14.method7638(0.0F, 1.0F, 0.0F, var7); // L: 129
		class406 var15 = FriendSystem.method1847(); // L: 130
		var15.method7638(0.0F, 0.0F, 1.0F, var8); // L: 131
		class406 var12 = FriendSystem.method1847(); // L: 132
		var12.method7615(var15); // L: 133
		var12.method7615(var16); // L: 134
		var12.method7615(var14); // L: 135
		class407 var13 = Coord.method5706(); // L: 136
		var13.method7653(var12); // L: 137
		var1.method7652(var13); // L: 138
		var16.method7623(); // L: 139
		var14.method7623(); // L: 140
		var15.method7623(); // L: 141
		var12.method7623(); // L: 142
		var13.method7695(); // L: 143
	} // L: 144

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lov;ILdi;IB)V",
		garbageValue = "-7"
	)
	void method2926(class407 var1, int var2, class122 var3, int var4) {
		float[] var5 = var3.method2834(this.field1542); // L: 147
		float var6 = var5[0]; // L: 148
		float var7 = var5[1]; // L: 149
		float var8 = var5[2]; // L: 150
		if (this.field1538[var2] != null) { // L: 151
			class124 var9 = this.field1538[var2][3]; // L: 152
			class124 var10 = this.field1538[var2][4]; // L: 153
			class124 var11 = this.field1538[var2][5]; // L: 154
			if (var9 != null) { // L: 155
				var6 = var9.method2885(var4);
			}

			if (var10 != null) { // L: 156
				var7 = var10.method2885(var4);
			}

			if (var11 != null) { // L: 157
				var8 = var11.method2885(var4);
			}
		}

		var1.field4566[12] = var6; // L: 159
		var1.field4566[13] = var7; // L: 160
		var1.field4566[14] = var8; // L: 161
	} // L: 162

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lov;ILdi;II)V",
		garbageValue = "-1585869503"
	)
	void method2920(class407 var1, int var2, class122 var3, int var4) {
		float[] var5 = var3.method2835(this.field1542); // L: 165
		float var6 = var5[0]; // L: 166
		float var7 = var5[1]; // L: 167
		float var8 = var5[2]; // L: 168
		if (this.field1538[var2] != null) { // L: 169
			class124 var9 = this.field1538[var2][6]; // L: 170
			class124 var10 = this.field1538[var2][7]; // L: 171
			class124 var11 = this.field1538[var2][8]; // L: 172
			if (var9 != null) { // L: 173
				var6 = var9.method2885(var4);
			}

			if (var10 != null) { // L: 174
				var7 = var10.method2885(var4);
			}

			if (var11 != null) { // L: 175
				var8 = var11.method2885(var4);
			}
		}

		class407 var12 = Coord.method5706(); // L: 177
		var12.method7650(var6, var7, var8); // L: 178
		var1.method7652(var12); // L: 179
		var12.method7695(); // L: 180
	} // L: 181

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)I",
		garbageValue = "-2135954243"
	)
	static int method2946(Widget var0) {
		if (var0.type != 11) { // L: 1537
			Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize - 1] = ""; // L: 1538
			return 1; // L: 1539
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 1541
			Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var0.method6136(var1); // L: 1542
			return 1; // L: 1543
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-849892544"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2828
		if (var0 == -3) { // L: 2831
			MusicPatchNode2.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2832
			MusicPatchNode2.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2833
			MusicPatchNode2.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2834
			GrandExchangeOfferOwnWorldComparator.method1171(3); // L: 2835
			Login.field925 = 1; // L: 2836
		} else if (var0 == 4) { // L: 2838
			GrandExchangeOfferOwnWorldComparator.method1171(14); // L: 2840
			Login.field907 = 0; // L: 2841
		} else if (var0 == 5) { // L: 2844
			Login.field925 = 2; // L: 2845
			MusicPatchNode2.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2846
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2848
			if (var0 == 7) { // L: 2851
				MusicPatchNode2.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2852
				MusicPatchNode2.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2853
				MusicPatchNode2.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2854
				MusicPatchNode2.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2855
				MusicPatchNode2.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2856
				MusicPatchNode2.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2857
				MusicPatchNode2.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2858
				MusicPatchNode2.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2859
				MusicPatchNode2.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 2860
				MusicPatchNode2.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
			} else if (var0 == 18) { // L: 2861
				GrandExchangeOfferOwnWorldComparator.method1171(14); // L: 2863
				Login.field907 = 1; // L: 2864
			} else if (var0 == 19) { // L: 2867
				MusicPatchNode2.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2868
				MusicPatchNode2.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2869
				MusicPatchNode2.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2870
				MusicPatchNode2.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2871
				MusicPatchNode2.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2872
				MusicPatchNode2.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2873
				MusicPatchNode2.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 2874
				MusicPatchNode2.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2875
				MusicPatchNode2.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) { // L: 2876
				GrandExchangeOfferOwnWorldComparator.method1171(14); // L: 2878
				Login.field907 = 2; // L: 2879
			} else if (var0 == 37) { // L: 2882
				MusicPatchNode2.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2883
				MusicPatchNode2.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2884
				GrandExchangeOfferOwnWorldComparator.method1171(8); // L: 2885
			} else {
				if (var0 == 56) { // L: 2887
					MusicPatchNode2.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2888
					class21.method305(11); // L: 2889
					return; // L: 2890
				}

				if (var0 == 57) { // L: 2892
					MusicPatchNode2.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2893
					class21.method305(11); // L: 2894
					return; // L: 2895
				}

				if (var0 == 61) { // L: 2897
					MusicPatchNode2.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2898
					GrandExchangeOfferOwnWorldComparator.method1171(7); // L: 2899
				} else {
					if (var0 == 62) { // L: 2901
						class21.method305(10); // L: 2902
						GrandExchangeOfferOwnWorldComparator.method1171(9); // L: 2903
						MusicPatchNode2.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2904
						return; // L: 2905
					}

					if (var0 == 63) { // L: 2907
						class21.method305(10); // L: 2908
						GrandExchangeOfferOwnWorldComparator.method1171(9); // L: 2909
						MusicPatchNode2.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2910
						return; // L: 2911
					}

					if (var0 == 65 || var0 == 67) { // L: 2913
						class21.method305(10); // L: 2914
						GrandExchangeOfferOwnWorldComparator.method1171(9); // L: 2915
						MusicPatchNode2.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2916
						return; // L: 2917
					}

					if (var0 == 71) { // L: 2919
						class21.method305(10); // L: 2920
						GrandExchangeOfferOwnWorldComparator.method1171(7); // L: 2921
						MusicPatchNode2.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2922
					} else if (var0 == 73) { // L: 2924
						class21.method305(10); // L: 2925
						GrandExchangeOfferOwnWorldComparator.method1171(6); // L: 2926
						MusicPatchNode2.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2927
					} else if (var0 == 72) { // L: 2929
						class21.method305(10); // L: 2930
						GrandExchangeOfferOwnWorldComparator.method1171(26); // L: 2931
					} else {
						MusicPatchNode2.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2933
					}
				}
			}
		} else {
			MusicPatchNode2.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2849
		}

		class21.method305(10); // L: 2934
		int var4 = Login.loginIndex; // L: 2938
		boolean var5 = var1 != var4; // L: 2940
		if (!var5 && Client.field615.method8675()) { // L: 2941
			GrandExchangeOfferOwnWorldComparator.method1171(9); // L: 2942
		}

	} // L: 2944
}
