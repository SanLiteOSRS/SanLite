import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ljd;"
	)
	field3468(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ljd;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ljd;"
	)
	field3469(2, 2);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1248334161
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -543417639
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
