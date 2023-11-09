import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public class class453 {
	@ObfuscatedName("ae")
	static final int[] field4741;
	@ObfuscatedName("ah")
	static final int[] field4746;

	static {
		field4741 = new int[2048];
		field4746 = new int[2048];
		double var0 = 0.0030679615757712823D; // L: 20

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4741[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2)); // L: 22
			field4746[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	} // L: 25

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)I",
		garbageValue = "2080250333"
	)
	static final int method8342(LoginType var0) {
		if (var0 == null) { // L: 16
			return 12; // L: 17
		} else {
			switch(var0.field4938) { // L: 19
			case 2:
				return 20; // L: 23
			default:
				return 12; // L: 21
			}
		}
	}
}
