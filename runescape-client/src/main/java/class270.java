import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class class270 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	static final class270 field3033;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	static final class270 field3032;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 155777273
	)
	@Export("value")
	final int value;

	static {
		field3033 = new class270(0); // L: 4
		field3032 = new class270(1); // L: 5
	}

	class270(int var1) {
		this.value = var1; // L: 9
	} // L: 10
}
