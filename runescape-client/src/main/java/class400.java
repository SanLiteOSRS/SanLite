import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public class class400 extends class406 {
	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("Ignored_cached")
	static class497 Ignored_cached;

	@ObfuscatedSignature(
		descriptor = "(Lpm;)V"
	)
	public class400(class406 var1) {
		super(var1); // L: 8
		super.field4523 = "SwapSongTask"; // L: 9
	} // L: 10

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		if (class305.field3404.size() > 1 && class305.field3404.get(0) != null && ((class317)class305.field3404.get(0)).field3517.isReady() && class305.field3404.get(1) != null && ((class317)class305.field3404.get(1)).field3517.isReady()) { // L: 14
			class317 var1 = (class317)class305.field3404.get(0); // L: 15
			class305.field3404.set(0, class305.field3404.get(1)); // L: 16
			class305.field3404.set(1, var1); // L: 17
		}

		return true; // L: 19
	}
}
