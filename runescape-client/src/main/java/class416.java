import java.awt.Image;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public class class416 extends class422 {
	@ObfuscatedName("bk")
	static Image field4579;

	@ObfuscatedSignature(
		descriptor = "(Lqd;)V"
	)
	public class416(class422 var1) {
		super(var1); // L: 8
		super.field4597 = "SwapSongTask"; // L: 9
	} // L: 10

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		if (class319.field3459.size() > 1 && class319.field3459.get(0) != null && ((class331)class319.field3459.get(0)).field3582.isReady() && class319.field3459.get(1) != null && ((class331)class319.field3459.get(1)).field3582.isReady()) { // L: 14
			class331 var1 = (class331)class319.field3459.get(0); // L: 15
			class319.field3459.set(0, class319.field3459.get(1)); // L: 16
			class319.field3459.set(1, var1); // L: 17
		}

		return true; // L: 19
	}
}
