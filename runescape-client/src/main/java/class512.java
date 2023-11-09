import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
public enum class512 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	field5099(1, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	field5100(2, 2);

	@ObfuscatedName("cd")
	static String field5098;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1590997735
	)
	public final int field5101;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1109288009
	)
	final int field5103;

	class512(int var3, int var4) {
		this.field5101 = var3; // L: 19
		this.field5103 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5103; // L: 25
	}
}
