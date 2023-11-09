import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tj")
final class class499 implements class498 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1377588739
	)
	static int field5027;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltl;B)V",
		garbageValue = "14"
	)
	public void vmethod8920(Object var1, Buffer var2) {
		this.method8862((Integer)var1, var2); // L: 21
	} // L: 22

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)Ljava/lang/Object;",
		garbageValue = "2141508732"
	)
	public Object vmethod8919(Buffer var1) {
		return var1.readInt(); // L: 17
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Ltl;I)V",
		garbageValue = "1823901840"
	)
	void method8862(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13
}
