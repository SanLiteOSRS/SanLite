import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public class class453 {
	@ObfuscatedName("aj")
	static final int[] field4735;
	@ObfuscatedName("ad")
	static final int[] field4733;

	static {
		field4735 = new int[2048]; // L: 16
		field4733 = new int[2048]; // L: 17
		double var0 = 0.0030679615757712823D; // L: 20

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 21
			field4735[var2] = (int)(65536.0D * Math.sin((double)var2 * var0)); // L: 22
			field4733[var2] = (int)(65536.0D * Math.cos((double)var2 * var0)); // L: 23
		}

	} // L: 25

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-27"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (Client.loadInterface(var0)) { // L: 11885
			class210.runComponentCloseListeners(class16.Widget_interfaceComponents[var0], var1); // L: 11886
		}
	} // L: 11887
}
