import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public enum class326 implements class345 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	field4143(-1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	field4140(0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	field4144(1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	field4141(2);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 526450303
	)
	final int field4142;

	class326(int var3) {
		this.field4142 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4142; // L: 20
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Loj;",
		garbageValue = "1"
	)
	public static class410 method6395() {
		synchronized(class410.field4609) { // L: 25
			if (class410.field4608 == 0) { // L: 26
				return new class410();
			} else {
				class410.field4609[--class410.field4608].method7782(); // L: 28
				return class410.field4609[class410.field4608]; // L: 29
			}
		}
	}
}
