import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("s")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2125602271
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	static ClanSettings field1326;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method2451() {
		if (Client.oculusOrbState == 1) { // L: 12229
			Client.field484 = true; // L: 12230
		}

	} // L: 12232
}
