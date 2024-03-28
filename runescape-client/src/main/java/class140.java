import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public enum class140 implements class391 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1661(4, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1657(0, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1656(1, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1659(2, 3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1660(3, 4);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field1658;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 158462547
	)
	public final int field1662;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 579504551
	)
	@Export("id")
	final int id;

	class140(int var3, int var4) {
		this.field1662 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}
}
