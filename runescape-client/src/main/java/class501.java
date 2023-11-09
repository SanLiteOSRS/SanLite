import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ts")
final class class501 implements class498 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltl;B)V",
		garbageValue = "14"
	)
	public void vmethod8920(Object var1, Buffer var2) {
		this.method8877((Long)var1, var2); // L: 35
	} // L: 36

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)Ljava/lang/Object;",
		garbageValue = "2141508732"
	)
	public Object vmethod8919(Buffer var1) {
		return var1.readLong(); // L: 31
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Ltl;I)V",
		garbageValue = "1917362454"
	)
	void method8877(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 26
	} // L: 27
}
