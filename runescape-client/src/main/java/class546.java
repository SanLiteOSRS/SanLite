import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vj")
public enum class546 implements class391 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	field5316(1, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	field5317(2, 2);

	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 541242953
	)
	public final int field5318;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1100883877
	)
	final int field5319;

	class546(int var3, int var4) {
		this.field5318 = var3; // L: 19
		this.field5319 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5319; // L: 25
	}
}
