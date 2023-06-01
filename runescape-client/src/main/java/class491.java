import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
final class class491 implements class486 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltc;B)V",
		garbageValue = "1"
	)
	public void vmethod8848(Object var1, Buffer var2) {
		this.method8845((String)var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)Ljava/lang/Object;",
		garbageValue = "680641218"
	)
	public Object vmethod8847(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 45
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ltc;B)V",
		garbageValue = "7"
	)
	void method8845(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 40
	} // L: 41
}
