import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("at")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1554238267
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field1377;
	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnn;",
		garbageValue = "1346140648"
	)
	static class343[] method2772() {
		return new class343[]{class343.field3838, class343.field3837}; // L: 35
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	static void method2771() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 312
			if (class10.clientPreferences.method2529() != null) { // L: 313
				Login.Login_username = class10.clientPreferences.method2529(); // L: 314
				Client.Login_isUsernameRemembered = true; // L: 315
			} else {
				Client.Login_isUsernameRemembered = false; // L: 317
			}

		}
	} // L: 318

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)V",
		garbageValue = "-648264388"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field722) { // L: 12097
			Client.field723[var0.rootIndex] = true; // L: 12098
		}

	} // L: 12100
}
