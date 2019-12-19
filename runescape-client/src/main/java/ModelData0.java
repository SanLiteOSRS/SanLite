import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		signature = "Lky;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;

	ModelData0() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "-54"
	)
	public static int method3266(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)[Llg;",
		garbageValue = "-19364585"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field3850, FillMode.SOLID, FillMode.field3853};
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-21"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) {
			AbstractWorldMapData.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			AbstractWorldMapData.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			AbstractWorldMapData.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			Login.loginIndex = 3;
			Login.field1181 = 1;
		} else if (var0 == 4) {
			Login.loginIndex = 12;
			Login.field1167 = 0;
		} else if (var0 == 5) {
			Login.field1181 = 2;
			AbstractWorldMapData.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) {
			AbstractWorldMapData.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			AbstractWorldMapData.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			AbstractWorldMapData.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			AbstractWorldMapData.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			AbstractWorldMapData.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			AbstractWorldMapData.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			AbstractWorldMapData.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			AbstractWorldMapData.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			AbstractWorldMapData.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			AbstractWorldMapData.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) {
			AbstractWorldMapData.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
		} else if (var0 == 18) {
			Login.loginIndex = 12;
			Login.field1167 = 1;
		} else if (var0 == 19) {
			AbstractWorldMapData.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			AbstractWorldMapData.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			AbstractWorldMapData.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			AbstractWorldMapData.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			AbstractWorldMapData.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			AbstractWorldMapData.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			AbstractWorldMapData.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			AbstractWorldMapData.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			AbstractWorldMapData.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			AbstractWorldMapData.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
		} else if (var0 == 37) {
			AbstractWorldMapData.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			AbstractWorldMapData.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			Login.loginIndex = 8;
		} else {
			if (var0 == 56) {
				AbstractWorldMapData.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				class195.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				AbstractWorldMapData.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				class195.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				Login.loginIndex = 7;
			} else {
				AbstractWorldMapData.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
			}
		}

		class195.updateGameState(10);
	}
}
