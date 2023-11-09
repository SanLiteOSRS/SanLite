import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
final class class487 implements class486 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltc;B)V",
		garbageValue = "1"
	)
	public void vmethod8848(Object var1, Buffer var2) {
		this.method8802((Integer)var1, var2); // L: 21
	} // L: 22

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)Ljava/lang/Object;",
		garbageValue = "680641218"
	)
	public Object vmethod8847(Buffer var1) {
		return var1.readInt(); // L: 17
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Ltc;I)V",
		garbageValue = "-241333297"
	)
	void method8802(Integer var1, Buffer var2) {
		var2.writeIntME(var1); // L: 12
	} // L: 13
}
