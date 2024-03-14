import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public enum class370 implements class390 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4326(-1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4320(0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4321(1),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4322(2);

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1892902383
	)
	final int field4323;

	class370(int var3) {
		this.field4323 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4323; // L: 20
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-377082167"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}
}
