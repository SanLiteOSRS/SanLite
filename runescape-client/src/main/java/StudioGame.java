import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("StudioGame")
public enum StudioGame implements class372 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ag")
	@Export("name")
	public final String name;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1242609261
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 17
		this.id = var5; // L: 18
	} // L: 19

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 22
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static final void method6652(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12248
		if (var0 != class150.clientPreferences.method2478()) { // L: 12249
			label40: {
				if (class150.clientPreferences.method2478() == 0) { // L: 12251
					boolean var1 = !class306.field3398.isEmpty(); // L: 12254
					if (var1) { // L: 12256
						Archive var2 = class13.archive11; // L: 12257
						if (!class306.field3398.isEmpty()) { // L: 12259
							ArrayList var3 = new ArrayList(); // L: 12262
							Iterator var4 = class306.field3398.iterator(); // L: 12263

							while (var4.hasNext()) {
								class318 var5 = (class318)var4.next(); // L: 12264
								var5.field3508 = false; // L: 12266
								var5.field3513 = false; // L: 12267
								var5.field3515 = false; // L: 12268
								var5.field3514 = var2; // L: 12269
								var5.field3510 = var0; // L: 12270
								var5.field3511 = 0.0F; // L: 12271
								var3.add(var5); // L: 12272
							}

							UserComparator4.method2858(var3, class306.field3392, class306.field3402, class306.field3403, class306.field3407, false); // L: 12275
						}

						Client.playingJingle = false; // L: 12277
						break label40;
					}
				}

				if (var0 == 0) { // L: 12281
					RouteStrategy.method4227(0, 0); // L: 12282
					Client.playingJingle = false; // L: 12283
				} else {
					class7.method60(var0); // L: 12285
				}
			}

			class150.clientPreferences.method2528(var0); // L: 12287
		}

	} // L: 12289
}
