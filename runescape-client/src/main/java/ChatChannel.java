import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	static SpritePixels[] field1041;
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 330495129
	)
	static int field1045;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lcy;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1578030201
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 94
	} // L: 97

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcy;",
		garbageValue = "-677760097"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 100

		for (int var6 = this.count; var6 > 0; --var6) { // L: 101
			if (var6 != 100) { // L: 102
				this.messages[var6] = this.messages[var6 - 1]; // L: 103
			}
		}

		if (var5 == null) { // L: 105
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 107
			var5.removeDual(); // L: 108
			var5.set(var1, var2, var4, var3); // L: 109
		}

		this.messages[0] = var5; // L: 111
		if (this.count < 100) { // L: 112
			++this.count;
		}

		return var5; // L: 113
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcy;",
		garbageValue = "-48"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 117 118
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	@Export("size")
	int size() {
		return this.count; // L: 122
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lun;II)V",
		garbageValue = "1624657620"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 72
		Players.Players_pendingUpdateCount = 0; // L: 73
		class198.method3835(var0); // L: 74

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 76
			int var4 = Players.Players_pendingUpdateIndices[var3]; // L: 77
			Player var5 = Client.players[var4]; // L: 78
			int var6 = var0.readUnsignedByte(); // L: 79
			if ((var6 & 16) != 0) { // L: 80
				var6 += var0.readUnsignedByte() << 8;
			}

			if ((var6 & 2048) != 0) {
				var6 += var0.readUnsignedByte() << 16; // L: 81
			}

			GameBuild.method6999(var0, var4, var5, var6); // L: 82
		}

		if (var0.offset - var2 != var1) { // L: 85
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 86
		}
	} // L: 88

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-361858122"
	)
	static void method2249() {
		MenuAction.otp.trim(); // L: 1142
		if (MenuAction.otp.length() != 6) { // L: 1143
			class114.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 1144
		} else {
			class36.field247 = Integer.parseInt(MenuAction.otp); // L: 1147
			MenuAction.otp = ""; // L: 1148
			ScriptEvent.method2361(true); // L: 1149
			class114.setLoginResponseString("", "Connecting to server...", ""); // L: 1150
			Interpreter.method2106(20); // L: 1151
		}
	} // L: 1145 1152
}
