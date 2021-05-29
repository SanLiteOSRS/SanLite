import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("v")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 543094313
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Lkj;II)Lkj;",
		garbageValue = "-611336247"
	)
	@Export("findEnumerated")
	public static Enumerated findEnumerated(Enumerated[] var0, int var1) {
		Enumerated[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enumerated var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}
}
