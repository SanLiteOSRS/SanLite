import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("us")
public class class531 implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	public static final class531 field5197;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	public static final class531 field5192;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	static final class531 field5193;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	static final class531 field5191;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	static final class531 field5195;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	static final class531 field5194;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 517363145
	)
	final int field5196;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1989572265
	)
	final int field5198;

	static {
		field5197 = new class531(1, 0); // L: 8
		field5192 = new class531(3, 2); // L: 9
		field5193 = new class531(4, 5); // L: 10
		field5191 = new class531(2, 6); // L: 11
		field5195 = new class531(0, 7); // L: 12
		field5194 = new class531(5, 8); // L: 13
	}

	class531(int var1, int var2) {
		this.field5196 = var1; // L: 18
		this.field5198 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1094976837"
	)
	public boolean method9577() {
		return this == field5192; // L: 28
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5198; // L: 24
	}
}
