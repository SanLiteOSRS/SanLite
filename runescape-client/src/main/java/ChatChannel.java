import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("am")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = -1740315277
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lco;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 155057355
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 99
	} // L: 102

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lco;",
		garbageValue = "-32049458"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 105

		for (int var6 = this.count; var6 > 0; --var6) { // L: 106
			if (var6 != 100) { // L: 107
				this.messages[var6] = this.messages[var6 - 1]; // L: 108
			}
		}

		if (var5 == null) { // L: 110
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 112
			var5.removeDual(); // L: 113
			var5.set(var1, var2, var4, var3); // L: 114
		}

		this.messages[0] = var5; // L: 116
		if (this.count < 100) { // L: 117
			++this.count;
		}

		return var5; // L: 118
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;",
		garbageValue = "-438279470"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 122 123
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "92"
	)
	@Export("size")
	int size() {
		return this.count; // L: 127
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "805641788"
	)
	static int method2135(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field846 - 7.0D) * 256.0D); // L: 4377
	}
}
