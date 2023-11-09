import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("StudioGame")
public enum StudioGame implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("al")
	@Export("name")
	public final String name;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1428283497
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 17
		this.id = var5; // L: 18
	} // L: 19

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 22
	}
}
