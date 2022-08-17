import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("o")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1010766709
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("j")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BI)Lic;",
		garbageValue = "-202834895"
	)
	static WorldMapSprite method2574(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class147.method3105(var0).pixels); // L: 19 20
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpl;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1561852450"
	)
	static String method2575(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 34
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 35
			return var3 == null ? var2 : (String)var3.obj; // L: 36 37
		}
	}
}
