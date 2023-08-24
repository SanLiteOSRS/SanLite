import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lco;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1615403795
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 72
	} // L: 75

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lco;",
		garbageValue = "100"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 78

		for (int var6 = this.count; var6 > 0; --var6) { // L: 79
			if (var6 != 100) { // L: 80
				this.messages[var6] = this.messages[var6 - 1]; // L: 81
			}
		}

		if (var5 == null) { // L: 83
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 85
			var5.removeDual(); // L: 86
			var5.set(var1, var2, var4, var3); // L: 87
		}

		this.messages[0] = var5; // L: 89
		if (this.count < 100) { // L: 90
			++this.count;
		}

		return var5; // L: 91
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;",
		garbageValue = "-1297953730"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 95 96
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1659980687"
	)
	@Export("size")
	int size() {
		return this.count; // L: 100
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "818523875"
	)
	static void method2199() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "130826002"
	)
	static boolean method2190() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1490
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1491
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1492
				if (!var0.isLoaded()) {
					return false; // L: 1493
				}

				++Client.archiveLoadersDone; // L: 1494
			}

			return true; // L: 1496
		} else {
			return true; // L: 1495
		}
	}
}
