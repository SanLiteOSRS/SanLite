import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
public class class421 extends class425 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -5194633085651282499L
	)
	long field4615;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -677822171
	)
	int field4616;

	@ObfuscatedSignature(
		descriptor = "(Lqe;I)V"
	)
	public class421(class425 var1, int var2) {
		super(var1); // L: 8
		this.field4616 = var2; // L: 9
		super.field4627 = "DelayFadeTask"; // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		if (this.field4615 < (long)this.field4616) { // L: 15
			++this.field4615; // L: 16
			return false; // L: 17
		} else {
			return true; // L: 19
		}
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(II)Luz;",
		garbageValue = "1916440406"
	)
	static class525 method7998(int var0) {
		class525 var1 = (class525)Client.Widget_cachedFonts.get((long)var0); // L: 12990
		if (var1 == null) { // L: 12991
			var1 = new class525(class150.field1703, var0); // L: 12992
		}

		return var1; // L: 12994
	}
}
