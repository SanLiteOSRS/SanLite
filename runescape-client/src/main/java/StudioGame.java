import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("StudioGame")
public enum StudioGame implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("k")
	@Export("name")
	public final String name;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 136753843
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Lkt;",
		garbageValue = "830101671"
	)
	public static HitSplatDefinition method4391(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
