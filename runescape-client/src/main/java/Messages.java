import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("az")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -165356607
	)
	@Export("Messages_count")
	static int Messages_count;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnu;",
		garbageValue = "563384072"
	)
	static class363[] method2755() {
		return new class363[]{class363.field3974, class363.field3970}; // L: 35
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1807441736"
	)
	static final void method2769(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class243.field2620.method6285(var0)) { // L: 10673
			MusicPatchNode.field3599 = null; // L: 10680
			class20.drawInterface(class243.field2620.field3645[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10681
			if (MusicPatchNode.field3599 != null) { // L: 10682
				class20.drawInterface(MusicPatchNode.field3599, -1412584499, var1, var2, var3, var4, class276.field3040, HealthBarDefinition.field2044, var7); // L: 10683
				MusicPatchNode.field3599 = null; // L: 10684
			}

		} else {
			if (var7 != -1) { // L: 10674
				Client.field732[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10676
					Client.field732[var8] = true;
				}
			}

		}
	} // L: 10678 10686
}
