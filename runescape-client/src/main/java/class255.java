import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class255 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class255 field2990;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class255 field2989;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1233360633
	)
	@Export("value")
	final int value;

	static {
		field2990 = new class255(0); // L: 4
		field2989 = new class255(1); // L: 5
	}

	class255(int var1) {
		this.value = var1; // L: 9
	} // L: 10
}
