import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public enum class337 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field3794(0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field3792(1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field3791(2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field3793(3),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field3795(4);

	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 193105733
	)
	final int field3796;

	class337(int var3) {
		this.field3796 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3796; // L: 19
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "654212430"
	)
	static int method6628(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F)); // L: 4373
	}
}
