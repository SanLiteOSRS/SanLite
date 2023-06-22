import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lcg;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -245649209
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 78
	} // L: 81

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)Lcg;",
		garbageValue = "10654"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 84

		for (int var6 = this.count; var6 > 0; --var6) { // L: 85
			if (var6 != 100) { // L: 86
				this.messages[var6] = this.messages[var6 - 1]; // L: 87
			}
		}

		if (var5 == null) { // L: 89
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 91
			var5.removeDual(); // L: 92
			var5.set(var1, var2, var4, var3); // L: 93
		}

		this.messages[0] = var5; // L: 95
		if (this.count < 100) { // L: 96
			++this.count;
		}

		return var5; // L: 97
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lcg;",
		garbageValue = "-651890081"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 101 102
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "387779060"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "72"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) { // L: 106
			int var3 = var0; // L: 108
			String var2;
			if (var1 && var0 >= 0) { // L: 111
				int var4 = 2; // L: 115

				for (int var5 = var0 / 10; var5 != 0; ++var4) { // L: 116 117 119
					var5 /= 10; // L: 118
				}

				char[] var6 = new char[var4]; // L: 121
				var6[0] = '+'; // L: 122

				for (int var7 = var4 - 1; var7 > 0; --var7) { // L: 123
					int var8 = var3; // L: 124
					var3 /= 10; // L: 125
					int var9 = var8 - var3 * 10; // L: 126
					if (var9 >= 10) { // L: 127
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48); // L: 128
					}
				}

				var2 = new String(var6); // L: 130
			} else {
				var2 = Integer.toString(var0, 10); // L: 112
			}

			return var2; // L: 132
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-24765"
	)
	static void method2159() {
		for (class210 var0 = (class210)Client.field742.last(); var0 != null; var0 = (class210)Client.field742.previous()) { // L: 5188
			var0.remove(); // L: 5189
		}

	} // L: 5191

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1221554668"
	)
	static final void method2157(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12599
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3346()) { // L: 12600
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12601
				if (var2.rank == -1) { // L: 12602
					PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field3146, Client.packetWriter.isaacCipher); // L: 12603
					var3.packetBuffer.writeByte(3 + Widget.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12604
					var3.packetBuffer.writeByte(var0); // L: 12605
					var3.packetBuffer.writeShort(var1); // L: 12606
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12607
					Client.packetWriter.addNode(var3); // L: 12608
				}
			}
		}
	} // L: 12609
}
