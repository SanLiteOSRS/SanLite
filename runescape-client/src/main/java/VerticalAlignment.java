import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lit;"
	)
	field3221(1, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lit;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lit;"
	)
	field3225(2, 2);

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		signature = "Lhq;"
	)
	static Widget field3226;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1300403611
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -496509631
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
