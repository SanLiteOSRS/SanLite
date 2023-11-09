import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
@Implements("StudioGame")
public enum StudioGame implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("av")
	@Export("name")
	public final String name;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 228886145
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 21
		this.id = var5; // L: 22
	} // L: 23

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "375283383"
	)
	public static String method6664(CharSequence var0) {
		int var2 = var0.length(); // L: 187
		char[] var3 = new char[var2]; // L: 189

		for (int var4 = 0; var4 < var2; ++var4) { // L: 190
			var3[var4] = '*';
		}

		String var1 = new String(var3); // L: 191
		return var1; // L: 193
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Ldt;B)V",
		garbageValue = "-13"
	)
	static final void method6669(Actor var0) {
		boolean var1 = var0.field1234 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4434
		if (!var1) { // L: 4435
			SequenceDefinition var2 = class140.SequenceDefinition_get(var0.sequence); // L: 4436
			if (var2 != null && !var2.isCachedModelIdSet()) { // L: 4437
				var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame]; // L: 4441
			} else {
				var1 = true; // L: 4438
			}
		}

		if (var1) { // L: 4444
			int var8 = var0.field1234 - var0.spotAnimation; // L: 4445
			int var3 = Client.cycle - var0.spotAnimation; // L: 4446
			int var4 = var0.field1229 * 128 + var0.field1181 * 64; // L: 4447
			int var5 = var0.field1231 * 128 + var0.field1181 * 64; // L: 4448
			int var6 = var0.field1230 * 128 + var0.field1181 * 64; // L: 4449
			int var7 = var0.field1232 * 128 + var0.field1181 * 64; // L: 4450
			var0.x = (var3 * var6 + var4 * (var8 - var3)) / var8; // L: 4451
			var0.y = (var3 * var7 + var5 * (var8 - var3)) / var8; // L: 4452
		}

		var0.field1251 = 0; // L: 4454
		var0.orientation = var0.field1235; // L: 4455
		var0.rotation = var0.orientation; // L: 4456
	} // L: 4457
}
