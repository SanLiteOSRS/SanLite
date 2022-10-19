import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "2"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-622381156"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("c")
	public static boolean method6222(long var0) {
		boolean var2 = var0 != 0L; // L: 56
		if (var2) { // L: 57
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1; // L: 60
			var2 = !var3; // L: 62
		}

		return var2; // L: 64
	}
}
