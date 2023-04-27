import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public abstract class class273 implements class275 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1813265095
	)
	protected int field3071;

	@ObfuscatedSignature(
		descriptor = "(Lmr;Lnx;I)V"
	)
	protected class273(StudioGame var1, Language var2, int var3) {
		this.field3071 = var3; // L: 10
	} // L: 11

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-975091517"
	)
	static void method5614() {
		ByteArrayPool.field4472.clear(); // L: 61
		ByteArrayPool.field4472.add(100); // L: 62
		ByteArrayPool.field4472.add(5000); // L: 63
		ByteArrayPool.field4472.add(10000); // L: 64
		ByteArrayPool.field4472.add(30000); // L: 65
	} // L: 66
}
