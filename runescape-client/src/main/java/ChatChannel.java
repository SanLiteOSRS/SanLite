import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lbv;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1171646571
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 95
	} // L: 98

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbv;",
		garbageValue = "1717245391"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lbv;",
		garbageValue = "-370186174"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 118 119
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1046620565"
	)
	@Export("size")
	int size() {
		return this.count; // L: 123
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Ley;",
		garbageValue = "-58"
	)
	static class131 method2152(int var0) {
		class131[] var1 = new class131[]{class131.field1621, class131.field1612, class131.field1613, class131.field1614, class131.field1615, class131.field1616, class131.field1620, class131.field1618, class131.field1622}; // L: 124
		class131 var2 = (class131)World.findEnumerated(var1, var0); // L: 126
		if (var2 == null) { // L: 127
			var2 = class131.field1622;
		}

		return var2; // L: 128
	}
}
