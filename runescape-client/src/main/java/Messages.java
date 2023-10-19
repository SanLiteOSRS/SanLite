import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("ac")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2066815957
	)
	@Export("Messages_count")
	static int Messages_count;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lis;",
		garbageValue = "517783557"
	)
	public static VarbitComposition method2802(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 28
		if (var1 != null) { // L: 29
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 30
			var1 = new VarbitComposition(); // L: 31
			if (var2 != null) { // L: 32
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0); // L: 33
			return var1; // L: 34
		}
	}
}
