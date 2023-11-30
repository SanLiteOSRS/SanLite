import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("al")
	static int[] field996;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lco;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2075244397
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 95
	} // L: 98

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lco;",
		garbageValue = "-698368105"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 101

		for (int var6 = this.count; var6 > 0; --var6) { // L: 102
			if (var6 != 100) { // L: 103
				this.messages[var6] = this.messages[var6 - 1]; // L: 104
			}
		}

		if (var5 == null) { // L: 106
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 108
			var5.removeDual(); // L: 109
			var5.set(var1, var2, var4, var3); // L: 110
		}

		this.messages[0] = var5; // L: 112
		if (this.count < 100) { // L: 113
			++this.count;
		}

		return var5; // L: 114
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;",
		garbageValue = "-649876518"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 118 119
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "519230888"
	)
	@Export("size")
	int size() {
		return this.count; // L: 123
	}
}
