import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
public class class518 implements class372 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	public static final class518 field5129;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	public static final class518 field5122;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	static final class518 field5123;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	static final class518 field5124;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	static final class518 field5125;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	static final class518 field5121;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 62680137
	)
	final int field5126;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -439985583
	)
	final int field5128;

	static {
		field5129 = new class518(4, 0); // L: 8
		field5122 = new class518(0, 2); // L: 9
		field5123 = new class518(2, 5); // L: 10
		field5124 = new class518(5, 6); // L: 11
		field5125 = new class518(3, 7); // L: 12
		field5121 = new class518(1, 8); // L: 13
	}

	class518(int var1, int var2) {
		this.field5126 = var1; // L: 18
		this.field5128 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "748601950"
	)
	public boolean method9394() {
		return this == field5122; // L: 28
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5128; // L: 24
	}
}
