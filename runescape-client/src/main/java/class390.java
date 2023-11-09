import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
public final class class390 {
	@ObfuscatedName("ai")
	final Object field4426;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1020824969
	)
	int field4428;

	class390(Object var1, int var2) {
		this.field4426 = var1; // L: 170
		this.field4428 = var2; // L: 171
	} // L: 172

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IB)V",
		garbageValue = "0"
	)
	static final void method7287(Actor var0, int var1) {
		class216.worldToScreen(var0.x, var0.y, var1); // L: 5738
	} // L: 5739
}
