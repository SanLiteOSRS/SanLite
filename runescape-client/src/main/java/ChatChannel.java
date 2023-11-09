import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lcp;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 207818565
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 78
	} // L: 81

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcp;",
		garbageValue = "1928901058"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lcp;",
		garbageValue = "1053537467"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 101 102
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1747018348"
	)
	@Export("size")
	int size() {
		return this.count; // L: 106
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "115414530"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 72
		if (var3) { // L: 73
			var5 |= 65536L;
		}

		return var5; // L: 74
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class36.logOut(); // L: 2931
		switch(var0) { // L: 2932
		case 1:
			class387.method7272(); // L: 2935
			break;
		case 2:
			ObjectSound.method1926(24); // L: 2941
			class156.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 2942
		}

	} // L: 2947
}
