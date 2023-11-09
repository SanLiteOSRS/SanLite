import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
final class class489 implements class486 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltc;B)V",
		garbageValue = "1"
	)
	public void vmethod8848(Object var1, Buffer var2) {
		this.method8815((Long)var1, var2); // L: 35
	} // L: 36

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)Ljava/lang/Object;",
		garbageValue = "680641218"
	)
	public Object vmethod8847(Buffer var1) {
		return var1.readLong(); // L: 31
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Ltc;I)V",
		garbageValue = "1144104676"
	)
	void method8815(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 26
	} // L: 27
}
