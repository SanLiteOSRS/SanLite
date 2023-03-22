import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public enum class320 implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	field3704(0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	field3702(1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	field3707(2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	field3705(3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	field3706(4);

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	static Archive field3708;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -832436675
	)
	final int field3703;

	class320(int var3) {
		this.field3703 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3703; // L: 19
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-676660135"
	)
	static void method6305() {
		class150.field1680 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = class110.method2818((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var0 / 16.0F + 0.075F)); // L: 30
			class150.field1680[var0] = var3; // L: 31
			++var0; // L: 29
		}

		var1 = 48; // L: 33

		for (int var5 = var1 / 6; var0 < class150.field1680.length; var1 -= var5) { // L: 34 35 41
			var3 = var0 * 2; // L: 36

			for (int var4 = class110.method2818((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class150.field1680.length; ++var0) { // L: 37 38
				class150.field1680[var0] = var4; // L: 39
			}
		}

	} // L: 43
}
