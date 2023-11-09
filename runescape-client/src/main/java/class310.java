import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class310 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lru;II)V",
		garbageValue = "737284130"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		class85.method2328(var0); // L: 73

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 75
			int var4 = Players.Players_pendingUpdateIndices[var3]; // L: 76
			Player var5 = Client.players[var4]; // L: 77
			int var6 = var0.readUnsignedByte(); // L: 78
			if ((var6 & 64) != 0) { // L: 79
				var6 += var0.readUnsignedByte() << 8;
			}

			HitSplatDefinition.method3902(var0, var4, var5, var6); // L: 80
		}

		if (var0.offset - var2 != var1) { // L: 83
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 84
		}
	} // L: 86

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-435403996"
	)
	static String method6356(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 13216
		if (Client.gameBuild == 1) { // L: 13217
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 13218
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 13219
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 13220
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 13221
			var0 = "local";
		}

		String var3 = ""; // L: 13222
		if (GraphicsDefaults.field4623 != null) { // L: 13223
			var3 = "/p=" + GraphicsDefaults.field4623;
		}

		String var4 = "runescape.com"; // L: 13224
		return var2 + var0 + "." + var4 + "/l=" + class36.clientLanguage + "/a=" + Message.field486 + var3 + "/"; // L: 13225
	}
}
