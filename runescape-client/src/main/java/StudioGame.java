import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("StudioGame")
public enum StudioGame implements class386 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ar")
	@Export("name")
	public final String name;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -490511051
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 21
		this.id = var5; // L: 22
	} // L: 23

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-444646790"
	)
	static char method6812(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0; // L: 45 46
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "6526"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class91.method2347(); // L: 9285
		Client.menuActions[0] = "Cancel"; // L: 9286
		Client.menuTargets[0] = ""; // L: 9287
		Client.menuOpcodes[0] = 1006; // L: 9288
		Client.menuShiftClick[0] = false; // L: 9289
		Client.menuOptionsCount = 1; // L: 9290
	} // L: 9291
}
