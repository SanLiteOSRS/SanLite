import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class230 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class230 field2465;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class230 field2458;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class230 field2460;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class230 field2461;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class230 field2462;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class230 field2463;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class230 field2459;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lir;"
	)
	static final class230[] field2468;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1438247315
	)
	final int field2464;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1396607597
	)
	final int field2466;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1101552509
	)
	final int field2467;

	static {
		field2465 = new class230(1, 8, 8); // L: 8
		field2458 = new class230(0, 16, 16); // L: 9
		field2460 = new class230(2, 32, 32); // L: 10
		field2461 = new class230(5, 48, 48); // L: 11
		field2462 = new class230(3, 64, 64); // L: 12
		field2463 = new class230(4, 96, 96); // L: 13
		field2459 = new class230(6, 128, 128); // L: 14
		class230[] var0 = new class230[]{field2458, field2465, field2460, field2462, field2463, field2461, field2459}; // L: 23
		field2468 = var0; // L: 25
		Arrays.sort(field2468, new class235()); // L: 29
	} // L: 30

	class230(int var1, int var2, int var3) {
		this.field2464 = var1; // L: 33
		this.field2466 = var2; // L: 34
		this.field2467 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-71"
	)
	int method4388() {
		return this.field2466 * this.field2467; // L: 39
	}
}
