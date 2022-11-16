import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class281 {
	@ObfuscatedName("a")
	static int[] field3279;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2000940713
	)
	static int field3276;

	static {
		new Object();
		field3279 = new int[33]; // L: 10
		field3279[0] = 0; // L: 13
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3279[var1] = var0 - 1;
			var0 += var0;
		}

	} // L: 19

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Lkn;",
		garbageValue = "361559239"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 226
		int var2 = var0 & 65535; // L: 227
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) { // L: 228
			boolean var3 = WorldMapManager.loadInterface(var1); // L: 229
			if (!var3) { // L: 230
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2]; // L: 232
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;Ljava/lang/String;I)I",
		garbageValue = "1134938260"
	)
	public static int method5418(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 14
		byte[] var3 = class268.method5365(var1); // L: 15
		var0.writeSmartByteShort(var3.length); // L: 16
		var0.offset += class305.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 17
		return var0.offset - var2; // L: 18
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-11481"
	)
	static int method5428(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 63
		if (var1 == null) { // L: 64
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 65 66
		}
	}
}
