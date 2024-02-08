import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("am")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1483704105
	)
	@Export("Messages_count")
	static int Messages_count;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1347462958"
	)
	public static final boolean method2837(char var0) {
		if (Character.isISOControl(var0)) { // L: 28
			return false;
		} else if (WorldMapIcon_0.isAlphaNumeric(var0)) { // L: 29
			return true;
		} else {
			char[] var1 = class509.field5074; // L: 31

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 32
				var3 = var1[var2]; // L: 33
				if (var0 == var3) { // L: 34
					return true;
				}
			}

			var1 = class509.field5076; // L: 38

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 39
				var3 = var1[var2]; // L: 40
				if (var0 == var3) {
					return true; // L: 41
				}
			}

			return false; // L: 44
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1250012045"
	)
	static final void method2849() {
		if (Client.logoutTimer > 0) { // L: 3050
			class189.method3780(); // L: 3051
		} else {
			Client.timer.method8040(); // L: 3054
			class131.method3087(40); // L: 3055
			PlayerType.field4298 = Client.packetWriter.getSocket(); // L: 3056
			Client.packetWriter.removeSocket(); // L: 3057
		}
	} // L: 3052 3058

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	static final void method2850() {
		Client.field706 = Client.cycleCntr; // L: 12471
		VarpDefinition.field1832 = true; // L: 12472
	} // L: 12473
}
