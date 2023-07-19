import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
final class class503 implements class498 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltl;B)V",
		garbageValue = "14"
	)
	public void vmethod8920(Object var1, Buffer var2) {
		this.method8923((String)var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)Ljava/lang/Object;",
		garbageValue = "2141508732"
	)
	public Object vmethod8919(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 45
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ltl;I)V",
		garbageValue = "-1498504539"
	)
	void method8923(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 40
	} // L: 41
}
