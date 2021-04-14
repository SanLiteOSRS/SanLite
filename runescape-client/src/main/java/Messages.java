import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("f")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lme;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ljw;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1148627417
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1166914345
	)
	public static int field1377;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(CS)B",
		garbageValue = "252"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "0"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) {
			class9.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class9.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class9.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			Login.loginIndex = 3;
			Login.field994 = 1;
		} else if (var0 == 4) {
			InterfaceParent.method2096(0);
		} else if (var0 == 5) {
			Login.field994 = 2;
			class9.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) {
			class9.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			class9.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			class9.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			class9.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			class9.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			class9.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			class9.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			class9.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			class9.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			class9.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) {
			class9.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
		} else if (var0 == 18) {
			InterfaceParent.method2096(1);
		} else if (var0 == 19) {
			class9.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			class9.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			class9.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			class9.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			class9.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			class9.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class9.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			class9.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class9.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class9.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
		} else if (var0 == 37) {
			class9.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			class9.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			Login.loginIndex = 8;
		} else {
			if (var0 == 56) {
				class9.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				class20.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				class9.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				class20.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				Login.loginIndex = 7;
			} else {
				class9.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
			}
		}

		class20.updateGameState(10);
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "1889624441"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			Login.clientPreferences.roofsHidden = !Login.clientPreferences.roofsHidden;
			Message.savePreferences();
			if (Login.clientPreferences.roofsHidden) {
				class69.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class69.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				UserComparator4.worldMap.showCoord = !UserComparator4.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				HealthBarUpdate.method2181();
			}

			if (var0.equalsIgnoreCase("setclantransmit")) {
				Client.field786 = Client.cycleCntr;
				Client.field800 = Client.cycleCntr;
			}
		}

		PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field2256, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1512801898"
	)
	static final void method2367(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != Login.clientPreferences.musicVolume) {
			if (Login.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) {
				PacketBufferNode.method3898(class8.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.field842 = false;
			} else if (var0 == 0) {
				class232.method4360();
				Client.field842 = false;
			} else if (class210.musicPlayerStatus != 0) {
				class375.musicTrackVolume = var0;
			} else {
				class210.midiPcmStream.setPcmStreamVolume(var0);
			}

			Login.clientPreferences.musicVolume = var0;
			Message.savePreferences();
		}

	}
}
