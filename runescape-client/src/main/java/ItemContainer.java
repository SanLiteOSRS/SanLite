import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	static TextureProvider field1036;
	@ObfuscatedName("ap")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("af")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-37"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 23
		if (var4 == null) { // L: 24
			var4 = new ChatChannel(); // L: 25
			Messages.Messages_channels.put(var0, var4); // L: 26
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 28
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 29
		Messages.Messages_queue.add(var5); // L: 30
		Client.chatCycle = Client.cycleCntr; // L: 31
	} // L: 32

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-23"
	)
	public static int method2347(int var0) {
		--var0; // L: 52
		var0 |= var0 >>> 1; // L: 53
		var0 |= var0 >>> 2; // L: 54
		var0 |= var0 >>> 4; // L: 55
		var0 |= var0 >>> 8; // L: 56
		var0 |= var0 >>> 16; // L: 57
		return var0 + 1; // L: 58
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-335792914"
	)
	static void method2350() {
		if (class281.loadWorlds()) { // L: 1985
			Login.worldSelectOpen = true; // L: 1986
			Login.worldSelectPage = 0; // L: 1987
			Login.worldSelectPagesCount = 0; // L: 1988
		}

	} // L: 1990
}
