import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public class class58 {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1766812037
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		signature = "Lgn;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1957401130"
	)
	public static void method907() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var0 == null) {
				return;
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(IIIIIII)I",
		garbageValue = "1050373784"
	)
	public static int method912(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "101066912"
	)
	public static void method915(int var0) {
		class206.musicPlayerStatus = 1;
		class204.musicTrackArchive = null;
		BuddyRankComparator.musicTrackGroupId = -1;
		class206.musicTrackFileId = -1;
		Tiles.musicTrackVolume = 0;
		class206.musicTrackBoolean = false;
		FaceNormal.pcmSampleLength = var0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIIB)V",
		garbageValue = "1"
	)
	static final void method914(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) {
			for (int var4 = 0; var4 < 8; ++var4) {
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(CLgn;I)I",
		garbageValue = "65536"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "50"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) {
			UrlRequester.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			UrlRequester.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			UrlRequester.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			Login.loginIndex = 3;
			Login.field1213 = 1;
		} else if (var0 == 4) {
			class89.method2130(0);
		} else if (var0 == 5) {
			Login.field1213 = 2;
			UrlRequester.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) {
			UrlRequester.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			UrlRequester.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			UrlRequester.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			UrlRequester.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			UrlRequester.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			UrlRequester.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			UrlRequester.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			UrlRequester.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			UrlRequester.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			UrlRequester.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) {
			UrlRequester.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
		} else if (var0 == 18) {
			Login.loginIndex = 12;
			Login.field1210 = 1;
		} else if (var0 == 19) {
			UrlRequester.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			UrlRequester.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			UrlRequester.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			UrlRequester.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			UrlRequester.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			UrlRequester.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			UrlRequester.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			UrlRequester.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			UrlRequester.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			UrlRequester.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
		} else if (var0 == 37) {
			UrlRequester.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			UrlRequester.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			Login.loginIndex = 8;
		} else {
			if (var0 == 56) {
				UrlRequester.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				CollisionMap.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				UrlRequester.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				CollisionMap.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				Login.loginIndex = 7;
			} else {
				UrlRequester.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
			}
		}

		CollisionMap.updateGameState(10);
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-693784957"
	)
	static final void method913(int var0) {
		if (WorldMapSprite.loadInterface(var0)) {
			Projectile.drawModelComponents(Widget.Widget_interfaceComponents[var0], -1);
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		signature = "(Lbq;ZI)V",
		garbageValue = "-1212325817"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			SecureRandomFuture.method2225(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetClickMasks.first(); var4 != null; var4 = (IntegerNode)Client.widgetClickMasks.next()) {
			if ((long)var2 == (var4.key >> 48 & 65535L)) {
				var4.remove();
			}
		}

		Widget var5 = TileItem.getWidget(var3);
		if (var5 != null) {
			class52.invalidateWidget(var5);
		}

		class2.method24();
		if (Client.rootInterface != -1) {
			ClientPacket.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
