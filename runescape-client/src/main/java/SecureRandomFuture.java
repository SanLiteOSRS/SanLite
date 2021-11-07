import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("i")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("w")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1642436388"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "-11"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1350647812"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) {
			class1.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class1.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class1.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			class275.method5201(3);
			Login.field865 = 1;
		} else if (var0 == 4) {
			class275.method5201(14);
			Login.field866 = 0;
		} else if (var0 == 5) {
			Login.field865 = 2;
			class1.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) {
			if (var0 == 7) {
				class1.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) {
				class1.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) {
				class1.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) {
				class1.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) {
				class1.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) {
				class1.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) {
				class1.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) {
				class1.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) {
				class1.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) {
				class1.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) {
				class275.method5201(14);
				Login.field866 = 1;
			} else if (var0 == 19) {
				class1.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) {
				class1.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) {
				class1.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) {
				class1.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) {
				class1.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) {
				class1.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) {
				class1.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) {
				class1.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) {
				class1.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				class1.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) {
				class1.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) {
				class1.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) {
				class275.method5201(8);
			} else {
				if (var0 == 56) {
					class1.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
					WorldMapData_1.updateGameState(11);
					return;
				}

				if (var0 == 57) {
					class1.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
					WorldMapData_1.updateGameState(11);
					return;
				}

				if (var0 == 61) {
					class275.method5201(7);
				} else {
					if (var0 == 62) {
						WorldMapData_1.updateGameState(10);
						class275.method5201(9);
						class1.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
						return;
					}

					if (var0 == 63) {
						WorldMapData_1.updateGameState(10);
						class275.method5201(9);
						class1.setLoginResponseString("You were signed out.", "Please sign in again.", "");
						return;
					}

					if (var0 == 65 || var0 == 67) {
						WorldMapData_1.updateGameState(10);
						class275.method5201(9);
						class1.setLoginResponseString("Failed to login.", "Please try again.", "");
						return;
					}

					class1.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		} else {
			class1.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		}

		WorldMapData_1.updateGameState(10);
		if (Client.field500.method7220()) {
			class275.method5201(9);
		}

	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "75"
	)
	static final void method1979(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
			if (Client.showMouseOverText) {
				int var2 = Client.menuOptionsCount - 1;
				String var4;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) {
					var4 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) {
					var4 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var4 = class392.method6873(var2);
				}

				if (Client.menuOptionsCount > 2) {
					var4 = var4 + MouseHandler.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				Login.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
			}
		}
	}
}
