import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public class class302 {
	@ObfuscatedName("v")
	public static char[] field3743;
	@ObfuscatedName("n")
	static char[] field3742;
	@ObfuscatedName("f")
	static char[] field3744;
	@ObfuscatedName("y")
	static int[] field3746;
	@ObfuscatedName("r")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;

	static {
		field3743 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3743[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3743[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3743[var0] = (char)(var0 + 48 - 52);
		}

		field3743[62] = '+';
		field3743[63] = '/';
		field3742 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3742[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3742[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3742[var0] = (char)(var0 + 48 - 52);
		}

		field3742[62] = '*';
		field3742[63] = '-';
		field3744 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3744[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3744[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3744[var0] = (char)(var0 + 48 - 52);
		}

		field3744[62] = '-';
		field3744[63] = '_';
		field3746 = new int[128];

		for (var0 = 0; var0 < field3746.length; ++var0) {
			field3746[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3746[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3746[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3746[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3746;
		field3746[43] = 62;
		var2[42] = 62;
		int[] var1 = field3746;
		field3746[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1106369714"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			ObjectComposition.clientPreferences.roofsHidden = !ObjectComposition.clientPreferences.roofsHidden;
			TileItem.savePreferences();
			if (ObjectComposition.clientPreferences.roofsHidden) {
				World.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				World.addGameMessage(99, "", "Roofs will only be removed selectively");
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
				class243.worldMap.showCoord = !class243.worldMap.showCoord;
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
				NetFileRequest.method4912();
			}
		}

		PacketBufferNode var1 = class21.getPacketBufferNode(ClientPacket.field2610, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
