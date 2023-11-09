import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
public class class493 implements class356 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	public static final class493 field5048;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	public static final class493 field5044;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static final class493 field5046;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static final class493 field5045;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static final class493 field5047;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static final class493 field5049;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1668238515
	)
	final int field5050;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1588670303
	)
	final int field5051;

	static {
		field5048 = new class493(5, 0); // L: 8
		field5044 = new class493(1, 2); // L: 9
		field5046 = new class493(2, 5); // L: 10
		field5045 = new class493(4, 6); // L: 11
		field5047 = new class493(0, 7); // L: 12
		field5049 = new class493(3, 8); // L: 13
	}

	class493(int var1, int var2) {
		this.field5050 = var1; // L: 18
		this.field5051 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5051; // L: 24
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-228540689"
	)
	public boolean method9347() {
		return this == field5044; // L: 28
	}
}
