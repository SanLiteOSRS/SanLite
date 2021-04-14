import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("g")
	public static short[][] field1086;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "Llj;"
	)
	static Bounds field1084;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "[Lbs;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 93372497
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbs;",
		garbageValue = "20"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];

		for (int var6 = this.count; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}

		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3);
		}

		this.messages[0] = var5;
		if (this.count < 100) {
			++this.count;
		}

		return var5;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Lbs;",
		garbageValue = "1201057009"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(S)I",
		garbageValue = "2861"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1715360982"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		signature = "(Lhu;I)V",
		garbageValue = "-466644748"
	)
	static final void method2017(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field871 == -1) {
				Client.field871 = var0.spriteId2;
				Client.field713 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field871;
			} else {
				var0.spriteId2 = Client.field713;
			}

		} else if (var1 == 325) {
			if (Client.field871 == -1) {
				Client.field871 = var0.spriteId2;
				Client.field713 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field713;
			} else {
				var0.spriteId2 = Client.field871;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
