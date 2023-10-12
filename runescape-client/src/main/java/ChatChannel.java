import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -1313145805
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lcr;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 679923983
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 79
	} // L: 82

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lcr;",
		garbageValue = "-1"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 85

		for (int var6 = this.count; var6 > 0; --var6) { // L: 86
			if (var6 != 100) { // L: 87
				this.messages[var6] = this.messages[var6 - 1]; // L: 88
			}
		}

		if (var5 == null) { // L: 90
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 92
			var5.removeDual(); // L: 93
			var5.set(var1, var2, var4, var3); // L: 94
		}

		this.messages[0] = var5; // L: 96
		if (this.count < 100) { // L: 97
			++this.count;
		}

		return var5; // L: 98
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lcr;",
		garbageValue = "-1861075879"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 102 103
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1856127113"
	)
	@Export("size")
	int size() {
		return this.count; // L: 107
	}
}
