import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public class class316 extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 691610307
	)
	int field3499;
	@ObfuscatedName("an")
	BitSet field3500;

	class316(int var1) {
		this.field3499 = var1; // L: 11
		this.field3500 = new BitSet(128); // L: 12
	} // L: 13

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "233"
	)
	static int method5952(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}
}
