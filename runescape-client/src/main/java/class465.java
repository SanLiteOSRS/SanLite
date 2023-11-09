import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public class class465 {
	@ObfuscatedName("as")
	static final int[] field4791;
	@ObfuscatedName("am")
	static final int[] field4792;

	static {
		field4791 = new int[2048]; // L: 16
		field4792 = new int[2048]; // L: 17
		double var0 = 0.0030679615757712823D; // L: 20

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 21
			field4791[var2] = (int)(65536.0D * Math.sin((double)var2 * var0)); // L: 22
			field4792[var2] = (int)(65536.0D * Math.cos((double)var2 * var0)); // L: 23
		}

	} // L: 25

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Ldr;",
		garbageValue = "-540716633"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class359.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = SpriteMask.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}
}
