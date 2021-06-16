import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3160(0, 0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3147(1, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3148(2, 0),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3170(3, 0),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3150(9, 2),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3149(4, 1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3152(5, 1),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3158(6, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3151(7, 1),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3155(8, 1),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3156(12, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3157(13, 2),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3166(14, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3159(15, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3146(16, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3161(17, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3162(18, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3163(19, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3164(20, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3165(21, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3154(10, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3167(11, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3168(22, 3);

	@ObfuscatedName("gn")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1689741145
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "10"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) {
			CollisionMap.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			CollisionMap.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			CollisionMap.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			Login.loginIndex = 3;
			Login.field1012 = 1;
		} else if (var0 == 4) {
			Login.loginIndex = 12;
			Login.field1011 = 0;
		} else if (var0 == 5) {
			Login.field1012 = 2;
			CollisionMap.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) {
			if (var0 == 7) {
				CollisionMap.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) {
				CollisionMap.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) {
				CollisionMap.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) {
				CollisionMap.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) {
				CollisionMap.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) {
				CollisionMap.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) {
				CollisionMap.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) {
				CollisionMap.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) {
				CollisionMap.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) {
				CollisionMap.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) {
				Login.loginIndex = 12;
				Login.field1011 = 1;
			} else if (var0 == 19) {
				CollisionMap.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) {
				CollisionMap.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) {
				CollisionMap.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) {
				CollisionMap.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) {
				CollisionMap.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) {
				CollisionMap.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) {
				CollisionMap.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) {
				CollisionMap.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) {
				CollisionMap.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				CollisionMap.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) {
				CollisionMap.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) {
				CollisionMap.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) {
				Login.loginIndex = 8;
			} else {
				if (var0 == 56) {
					CollisionMap.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
					Projectile.updateGameState(11);
					return;
				}

				if (var0 == 57) {
					CollisionMap.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
					Projectile.updateGameState(11);
					return;
				}

				if (var0 == 61) {
					Login.loginIndex = 7;
				} else {
					CollisionMap.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		} else {
			CollisionMap.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		}

		Projectile.updateGameState(10);
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "618302230"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field839 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (class302.getWindowedMode() == 1) {
			class1.client.setMaxCanvasSize(765, 503);
		} else {
			class1.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			BufferedSink.method5992();
		}

	}
}
