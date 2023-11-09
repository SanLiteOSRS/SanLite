import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public enum class127 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	field1494(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	field1486(1, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	field1487(2, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	field1488(3, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	field1491(4, 4);

	@ObfuscatedName("ai")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static class442 field1495;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2026322375
	)
	final int field1490;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1210437169
	)
	final int field1489;

	class127(int var3, int var4) {
		this.field1490 = var3; // L: 147
		this.field1489 = var4; // L: 148
	} // L: 149

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1489; // L: 152
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "266"
	)
	static final void method2957(String var0) {
		ParamComposition.method3837(var0 + " is already on your friend list"); // L: 128
	} // L: 129
}
