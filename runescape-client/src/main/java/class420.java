import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class420 extends class426 {
	@ObfuscatedSignature(
		descriptor = "(Lqc;)V"
	)
	public class420(class426 var1) {
		super(var1); // L: 8
		super.field4651 = "SwapSongTask"; // L: 9
	} // L: 10

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		if (class321.field3495.size() > 1 && class321.field3495.get(0) != null && ((class333)class321.field3495.get(0)).field3613.isReady() && class321.field3495.get(1) != null && ((class333)class321.field3495.get(1)).field3613.isReady()) { // L: 14
			class333 var1 = (class333)class321.field3495.get(0); // L: 15
			class321.field3495.set(0, class321.field3495.get(1)); // L: 16
			class321.field3495.set(1, var1); // L: 17
		}

		return true; // L: 19
	}
}
