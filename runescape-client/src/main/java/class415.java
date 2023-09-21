import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
public class class415 extends class421 {
	@ObfuscatedSignature(
		descriptor = "(Lqm;)V"
	)
	public class415(class421 var1) {
		super(var1); // L: 8
		super.field4572 = "SwapSongTask"; // L: 9
	} // L: 10

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		if (class319.field3433.size() > 1 && class319.field3433.get(0) != null && ((class331)class319.field3433.get(0)).field3538.isReady() && class319.field3433.get(1) != null && ((class331)class319.field3433.get(1)).field3538.isReady()) { // L: 14
			class331 var1 = (class331)class319.field3433.get(0); // L: 15
			class319.field3433.set(0, class319.field3433.get(1)); // L: 16
			class319.field3433.set(1, var1); // L: 17
		}

		return true; // L: 19
	}
}
