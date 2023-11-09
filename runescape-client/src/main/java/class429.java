import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public class class429 implements class434 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrn;"
	)
	public final class465 field4697;

	@ObfuscatedSignature(
		descriptor = "(Lry;)V"
	)
	class429(class466 var1) {
		this.field4697 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lqn;)V"
	)
	public class429(class430 var1) {
		this(new class466(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "1758"
	)
	public int method8280(int var1) {
		return this.field4697.vmethod8746(var1); // L: 18
	}
}
