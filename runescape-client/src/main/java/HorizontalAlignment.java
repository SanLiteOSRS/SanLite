import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements class390 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	field1950(2, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	field1951(0, 2);

	@ObfuscatedName("ji")
	static byte[][] field1952;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1967956355
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1226860911
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 24
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "628076490"
	)
	public static void method3694() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "537001060"
	)
	static boolean method3688(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1; // L: 1243
	}
}
