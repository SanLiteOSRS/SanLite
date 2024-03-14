import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
public class class419 extends class425 {
	@ObfuscatedSignature(
		descriptor = "(Lqe;)V"
	)
	public class419(class425 var1) {
		super(var1); // L: 8
		super.field4627 = "SwapSongTask"; // L: 9
	} // L: 10

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		if (class321.field3474.size() > 1 && class321.field3474.get(0) != null && ((class333)class321.field3474.get(0)).field3594.isReady() && class321.field3474.get(1) != null && ((class333)class321.field3474.get(1)).field3594.isReady()) { // L: 14
			class333 var1 = (class333)class321.field3474.get(0); // L: 15
			class321.field3474.set(0, class321.field3474.get(1)); // L: 16
			class321.field3474.set(1, var1); // L: 17
		}

		return true; // L: 19
	}
}
