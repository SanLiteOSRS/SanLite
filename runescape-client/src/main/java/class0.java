import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class0 implements class3 {
	class0() {
	} // L: 8

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;)Lqq;"
	)
	public Buffer vmethod19(Buffer var1) {
		Buffer var2 = new Buffer(100); // L: 12
		this.method3(var1, var2); // L: 13
		return var2; // L: 14
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;Lqq;)V"
	)
	void method3(Buffer var1, Buffer var2) {
		class8 var3 = new class8(var1); // L: 18
		class5 var4 = new class5(var3); // L: 19

		long var5;
		for (var5 = 0L; !var4.method27(var3.method72(), var3.method71(), var5); ++var5) { // L: 20 21 22
		}

		var2.writeLong(var5); // L: 24
	} // L: 25
}
