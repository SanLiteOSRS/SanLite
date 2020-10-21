import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("StudioGame")
public enum StudioGame implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lis;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lis;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lis;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lis;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lis;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lis;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("x")
	@Export("name")
	public final String name;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1491225247
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "1502336414"
	)
	public static boolean method4230(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}
}
