import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public class class478 implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	public static final class478 field4996;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	public static final class478 field4992;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	static final class478 field4993;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	static final class478 field4994;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	static final class478 field4995;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	static final class478 field4991;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -821987039
	)
	final int field4997;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1469070037
	)
	final int field4998;

	static {
		field4996 = new class478(3, 0); // L: 8
		field4992 = new class478(1, 2); // L: 9
		field4993 = new class478(5, 5); // L: 10
		field4994 = new class478(2, 6); // L: 11
		field4995 = new class478(0, 7); // L: 12
		field4991 = new class478(4, 8); // L: 13
	}

	class478(int var1, int var2) {
		this.field4997 = var1; // L: 18
		this.field4998 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4998; // L: 24
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "102"
	)
	public boolean method8938() {
		return this == field4992; // L: 28
	}
}
