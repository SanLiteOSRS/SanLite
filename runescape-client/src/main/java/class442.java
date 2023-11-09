import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
public class class442 implements class447 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	public final class477 field4721;

	@ObfuscatedSignature(
		descriptor = "(Lsl;)V"
	)
	class442(class478 var1) {
		this.field4721 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lrv;)V"
	)
	public class442(class443 var1) {
		this(new class478(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-75"
	)
	public int method8255(int var1) {
		return this.field4721.vmethod8707(var1); // L: 18
	}
}
