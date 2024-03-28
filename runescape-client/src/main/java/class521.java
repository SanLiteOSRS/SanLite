import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uj")
final class class521 implements class518 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lur;B)V",
		garbageValue = "-69"
	)
	public void vmethod9136(Object var1, Buffer var2) {
		this.method9101((Long)var1, var2); // L: 35
	} // L: 36

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)Ljava/lang/Object;",
		garbageValue = "1753636582"
	)
	public Object vmethod9133(Buffer var1) {
		return var1.readLong(); // L: 31
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lur;B)V",
		garbageValue = "121"
	)
	void method9101(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 26
	} // L: 27
}
