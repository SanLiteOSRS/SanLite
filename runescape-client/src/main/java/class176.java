import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class176 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -179070895
	)
	static int field1854;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	public UrlRequest field1858;
	@ObfuscatedName("an")
	public float[] field1855;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgu;)V"
	)
	class176(class170 var1) {
		this.this$0 = var1;
		this.field1855 = new float[4]; // L: 348
	} // L: 350

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "717205669"
	)
	public static Object method3489(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 25
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-19"
	)
	public static boolean method3488(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 17
	}
}
