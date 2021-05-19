import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public class class22 extends class14 {
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -518379391
	)
	int field187;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class22(class2 var1) {
		this.this$0 = var1;
		this.field187 = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field187 = var1.readUnsignedShort();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method157(this.field187);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)Ljava/lang/String;",
		garbageValue = "3"
	)
	public static String method299(Buffer var0) {
		return ServerPacket.method4314(var0, 32767);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1565593981"
	)
	static int method290(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) {
			if (var0 == 3702) {
				++WorldMapCacheName.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--WorldMapCacheName.Interpreter_intStackSize;
			--class13.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "38"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) {
			class44.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class44.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class44.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			Login.loginIndex = 3;
			Login.field997 = 1;
		} else if (var0 == 4) {
			UserComparator7.method2455(0);
		} else if (var0 == 5) {
			Login.field997 = 2;
			class44.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) {
			if (var0 == 7) {
				class44.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) {
				class44.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) {
				class44.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) {
				class44.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) {
				class44.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) {
				class44.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) {
				class44.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) {
				class44.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) {
				class44.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) {
				class44.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) {
				UserComparator7.method2455(1);
			} else if (var0 == 19) {
				class44.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) {
				class44.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) {
				class44.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) {
				class44.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) {
				class44.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) {
				class44.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) {
				class44.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) {
				class44.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) {
				class44.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				class44.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) {
				class44.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) {
				class44.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) {
				Login.loginIndex = 8;
			} else {
				if (var0 == 56) {
					class44.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
					Client.updateGameState(11);
					return;
				}

				if (var0 == 57) {
					class44.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
					Client.updateGameState(11);
					return;
				}

				if (var0 == 61) {
					Login.loginIndex = 7;
				} else {
					class44.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		} else {
			class44.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		}

		Client.updateGameState(10);
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1530715236"
	)
	static final void method297() {
		Client.field822 = Client.cycleCntr;
		Script.field1055 = true;
	}
}
