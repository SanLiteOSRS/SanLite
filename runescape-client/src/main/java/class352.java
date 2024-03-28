import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
public class class352 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("huffman")
	static Huffman huffman;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -889199697
	)
	static int field3905;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "0"
	)
	public static byte[] method6813(Object var0, boolean var1) {
		if (var0 == null) { // L: 8
			return null;
		} else if (var0 instanceof byte[]) { // L: 9
			byte[] var6 = (byte[])((byte[])var0); // L: 10
			if (var1) { // L: 11
				int var4 = var6.length; // L: 14
				byte[] var5 = new byte[var4]; // L: 15
				System.arraycopy(var6, 0, var5, 0, var4); // L: 16
				return var5; // L: 19
			} else {
				return var6; // L: 21
			}
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 23
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 24
			return var2.get(); // L: 25
		} else {
			throw new IllegalArgumentException(); // L: 27
		}
	}
}
