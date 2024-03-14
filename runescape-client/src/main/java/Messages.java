import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("aq")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1247673627
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("ak")
	public static short[] field1422;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lcj;Lcj;IZIZB)I",
		garbageValue = "1"
	)
	static int method2863(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = class433.compareWorlds(var0, var1, var2, var3); // L: 200
		if (var6 != 0) { // L: 201
			return var3 ? -var6 : var6; // L: 202
		} else if (var4 == -1) { // L: 205
			return 0;
		} else {
			int var7 = class433.compareWorlds(var0, var1, var4, var5); // L: 206
			return var5 ? -var7 : var7; // L: 207
		}
	}
}
