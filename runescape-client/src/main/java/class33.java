import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class33 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 869620667
	)
	int field201;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -123303623
	)
	int field199;

	class33(int var1, int var2) {
		this.field201 = var1; // L: 14
		this.field199 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lag;I)Z",
		garbageValue = "-384198501"
	)
	boolean method494(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field201) { // L: 20
			case 1:
				return var1.vmethod4135(this.field199); // L: 30
			case 2:
				return var1.vmethod4136(this.field199); // L: 28
			case 3:
				return var1.vmethod4179((char)this.field199); // L: 26
			case 4:
				return var1.vmethod4139(this.field199 == 1); // L: 24
			default:
				return false; // L: 22
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lra;",
		garbageValue = "-483685235"
	)
	static PrivateChatMode[] method495() {
		return new PrivateChatMode[]{PrivateChatMode.field5074, PrivateChatMode.field5072, PrivateChatMode.field5073}; // L: 11
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;IIS)Lnv;",
		garbageValue = "17887"
	)
	public static Font method488(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		if (!Buffer.method8892(var0, var2, var3)) { // L: 68
			return null;
		} else {
			byte[] var5 = var1.takeFile(var2, var3); // L: 70
			Font var4;
			if (var5 == null) { // L: 72
				var4 = null; // L: 73
			} else {
				Font var6 = new Font(var5, class488.SpriteBuffer_xOffsets, ApproximateRouteStrategy.SpriteBuffer_yOffsets, FriendsList.SpriteBuffer_spriteWidths, class132.SpriteBuffer_spriteHeights, class100.SpriteBuffer_spritePalette, class140.SpriteBuffer_pixels); // L: 76
				class100.method2724(); // L: 77
				var4 = var6; // L: 78
			}

			return var4; // L: 80
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "1548132184"
	)
	static int method493(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 432
			return class130.method3087(var0, var1, var2);
		} else if (var0 < 1100) { // L: 433
			return UserComparator9.method2948(var0, var1, var2);
		} else if (var0 < 1200) { // L: 434
			return GrandExchangeOfferOwnWorldComparator.method1209(var0, var1, var2);
		} else if (var0 < 1300) { // L: 435
			return ScriptFrame.method1154(var0, var1, var2);
		} else if (var0 < 1400) { // L: 436
			return GrandExchangeOfferOwnWorldComparator.method1208(var0, var1, var2);
		} else if (var0 < 1500) { // L: 437
			return class139.method3157(var0, var1, var2);
		} else if (var0 < 1600) { // L: 438
			return WorldMapManager.method5198(var0, var1, var2);
		} else if (var0 < 1700) { // L: 439
			return class162.method3392(var0, var1, var2);
		} else if (var0 < 1800) { // L: 440
			return class96.method2687(var0, var1, var2);
		} else if (var0 < 1900) { // L: 441
			return class457.method8459(var0, var1, var2);
		} else if (var0 < 2000) { // L: 442
			return Tiles.method2277(var0, var1, var2);
		} else if (var0 < 2100) { // L: 443
			return UserComparator9.method2948(var0, var1, var2);
		} else if (var0 < 2200) { // L: 444
			return GrandExchangeOfferOwnWorldComparator.method1209(var0, var1, var2);
		} else if (var0 < 2300) { // L: 445
			return ScriptFrame.method1154(var0, var1, var2);
		} else if (var0 < 2400) { // L: 446
			return GrandExchangeOfferOwnWorldComparator.method1208(var0, var1, var2);
		} else if (var0 < 2500) { // L: 447
			return class139.method3157(var0, var1, var2);
		} else if (var0 < 2600) { // L: 448
			return class132.method3090(var0, var1, var2);
		} else if (var0 < 2700) { // L: 449
			return EnumComposition.method3711(var0, var1, var2);
		} else if (var0 < 2800) { // L: 450
			return GrandExchangeOfferOwnWorldComparator.method1205(var0, var1, var2);
		} else if (var0 < 2900) { // L: 451
			return WorldMapSectionType.method5294(var0, var1, var2);
		} else if (var0 < 3000) { // L: 452
			return Tiles.method2277(var0, var1, var2);
		} else if (var0 < 3200) { // L: 453
			return class217.method4444(var0, var1, var2);
		} else if (var0 < 3300) { // L: 454
			return class122.method3027(var0, var1, var2);
		} else if (var0 < 3400) { // L: 455
			return PacketWriter.method2847(var0, var1, var2);
		} else if (var0 < 3500) { // L: 456
			return class151.method3302(var0, var1, var2);
		} else if (var0 < 3600) { // L: 457
			return UserComparator4.method2909(var0, var1, var2);
		} else if (var0 < 3700) { // L: 458
			return class390.method7472(var0, var1, var2);
		} else if (var0 < 3800) { // L: 459
			return StructComposition.method3869(var0, var1, var2);
		} else if (var0 < 3900) { // L: 460
			return DynamicObject.method2207(var0, var1, var2);
		} else if (var0 < 4000) { // L: 461
			return TriBool.method7752(var0, var1, var2);
		} else if (var0 < 4100) { // L: 462
			return class10.method112(var0, var1, var2);
		} else if (var0 < 4200) { // L: 463
			return class160.method3374(var0, var1, var2);
		} else if (var0 < 4300) { // L: 464
			return class6.method45(var0, var1, var2);
		} else if (var0 < 5100) { // L: 465
			return StudioGame.method6441(var0, var1, var2);
		} else if (var0 < 5400) { // L: 466
			return FriendSystem.method1855(var0, var1, var2);
		} else if (var0 < 5600) { // L: 467
			return class101.method2732(var0, var1, var2);
		} else if (var0 < 5700) { // L: 468
			return class217.method4426(var0, var1, var2);
		} else if (var0 < 6300) { // L: 469
			return ServerPacket.method5564(var0, var1, var2);
		} else if (var0 < 6600) { // L: 470
			return class378.method7358(var0, var1, var2);
		} else if (var0 < 6700) { // L: 471
			return WorldMapRectangle.method5329(var0, var1, var2);
		} else if (var0 < 6800) { // L: 472
			return class134.method3126(var0, var1, var2);
		} else if (var0 < 6900) { // L: 473
			return class17.method225(var0, var1, var2);
		} else if (var0 < 7000) { // L: 474
			return PcmPlayer.method837(var0, var1, var2);
		} else if (var0 < 7100) { // L: 475
			return Client.method1634(var0, var1, var2);
		} else if (var0 < 7200) { // L: 476
			return World.method1825(var0, var1, var2);
		} else if (var0 < 7300) { // L: 477
			return CollisionMap.method4213(var0, var1, var2);
		} else if (var0 < 7500) { // L: 478
			return class4.method22(var0, var1, var2);
		} else if (var0 < 7600) { // L: 479
			return ArchiveDisk.method7835(var0, var1, var2);
		} else {
			return var0 < 7700 ? class126.method3074(var0, var1, var2) : 2; // L: 480 481
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1841454557"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 3016
		if (var0 == -3) { // L: 3019
			class70.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 3020
			class70.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 3021
			class70.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 3022
			ReflectionCheck.method696(3); // L: 3023
			Login.field917 = 1; // L: 3024
		} else if (var0 == 4) { // L: 3026
			ReflectionCheck.method696(14); // L: 3028
			Login.field916 = 0; // L: 3029
		} else if (var0 == 5) { // L: 3032
			Login.field917 = 2; // L: 3033
			class70.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 3034
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) { // L: 3036
			class70.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 3037
		} else if (var0 == 7) { // L: 3039
			class70.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 3040
			class70.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 3041
			class70.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 3042
			class70.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 3043
			class70.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 3044
			class70.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 3045
			class70.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 3046
			class70.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 3047
			class70.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) { // L: 3048
			class70.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 3049
			ReflectionCheck.method696(14); // L: 3051
			Login.field916 = 1; // L: 3052
		} else if (var0 == 19) { // L: 3055
			class70.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 3056
			class70.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 3057
			class70.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 3058
			class70.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 3059
			class70.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 3060
			class70.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 3061
			class70.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 3062
			class70.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 3063
			class70.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) { // L: 3064
			ReflectionCheck.method696(14); // L: 3066
			Login.field916 = 2; // L: 3067
		} else if (var0 == 37) { // L: 3070
			class70.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 3071
			class70.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 3072
			ReflectionCheck.method696(8); // L: 3073
		} else {
			if (var0 == 56) { // L: 3075
				class70.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 3076
				class246.method5251(11); // L: 3077
				return; // L: 3078
			}

			if (var0 == 57) { // L: 3080
				class70.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 3081
				class246.method5251(11); // L: 3082
				return; // L: 3083
			}

			if (var0 == 61) { // L: 3085
				class70.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 3086
				ReflectionCheck.method696(7); // L: 3087
			} else {
				if (var0 == 62) { // L: 3089
					class246.method5251(10); // L: 3090
					ReflectionCheck.method696(9); // L: 3091
					class70.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 3092
					return; // L: 3093
				}

				if (var0 == 63) { // L: 3095
					class246.method5251(10); // L: 3096
					ReflectionCheck.method696(9); // L: 3097
					class70.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 3098
					return; // L: 3099
				}

				if (var0 == 65 || var0 == 67) { // L: 3101
					class246.method5251(10); // L: 3102
					ReflectionCheck.method696(9); // L: 3103
					class70.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 3104
					return; // L: 3105
				}

				if (var0 == 71) { // L: 3107
					class246.method5251(10); // L: 3108
					ReflectionCheck.method696(7); // L: 3109
					class70.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 3110
				} else if (var0 == 73) { // L: 3112
					class246.method5251(10); // L: 3113
					ReflectionCheck.method696(6); // L: 3114
					class70.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 3115
				} else if (var0 == 72) { // L: 3117
					class246.method5251(10); // L: 3118
					ReflectionCheck.method696(26); // L: 3119
				} else {
					class70.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 3121
				}
			}
		}

		class246.method5251(10); // L: 3122
		boolean var3 = var1 != class16.method218(); // L: 3123
		if (!var3 && Client.field536.method8938()) { // L: 3124
			ReflectionCheck.method696(9); // L: 3125
		}

	} // L: 3127

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	static void method492(int var0) {
		class148.tempMenuAction = new MenuAction(); // L: 12566
		class148.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 12567
		class148.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 12568
		class148.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 12569
		class148.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 12570
		class148.tempMenuAction.field890 = Client.field655[var0]; // L: 12571
		class148.tempMenuAction.field893 = Client.menuActions[var0]; // L: 12572
		class148.tempMenuAction.action = Client.menuTargets[var0]; // L: 12573
	} // L: 12574
}
