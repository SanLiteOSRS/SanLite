import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("StudioGame")
public enum StudioGame implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lik;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lik;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lik;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lik;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lik;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lik;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("k")
	@Export("name")
	public final String name;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1622621893
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
