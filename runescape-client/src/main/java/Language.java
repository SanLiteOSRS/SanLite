import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@mr
@kv
@ObfuscatedName("mo")
@Implements("Language")
public class Language implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lmo;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("d")
	final String field4236;
	@ObfuscatedName("n")
	@Export("language")
	final String language;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1688124031
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4262, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4262, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4262, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4262, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4256, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4256, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4262, 6, "MX"); // L: 18
		Language[] var0 = method6568(); // L: 25
		Language_valuesOrdered = new Language[var0.length]; // L: 26
		Language[] var1 = var0; // L: 28

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 29
			Language var3 = var1[var2]; // L: 30
			if (Language_valuesOrdered[var3.id] != null) { // L: 32
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3;
		}

	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4236 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "43"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 73
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpe;III)I",
		garbageValue = "-1527977638"
	)
	static int method6584(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmo;",
		garbageValue = "12"
	)
	static Language[] method6568() {
		return new Language[]{Language_FR, Language_EN, Language_PT, Language_NL, Language_ES_MX, Language_ES, Language_DE}; // L: 42
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrb;",
		garbageValue = "-837252108"
	)
	@Export("FillMode_values")
	public static class474[] FillMode_values() {
		return new class474[]{class474.SOLID, class474.field4945, class474.field4944}; // L: 15
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lmo;",
		garbageValue = "-200854564"
	)
	public static Language method6580(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null; // L: 67 68
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "1"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = class412.World_worlds[var6]; // L: 180
			class412.World_worlds[var6] = class412.World_worlds[var1]; // L: 181
			class412.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				if (SpotAnimationDefinition.method3600(class412.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) { // L: 184
					World var10 = class412.World_worlds[var9]; // L: 185
					class412.World_worlds[var9] = class412.World_worlds[var7]; // L: 186
					class412.World_worlds[var7++] = var10; // L: 187
				}
			}

			class412.World_worlds[var1] = class412.World_worlds[var7]; // L: 191
			class412.World_worlds[var7] = var8; // L: 192
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 193
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 194
		}

	} // L: 196

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lcl;S)V",
		garbageValue = "128"
	)
	static final void method6579(Actor var0) {
		int var1 = Math.max(1, var0.field1192 - Client.cycle); // L: 4224
		int var2 = var0.field1150 * 128 + var0.field1201 * 64; // L: 4225
		int var3 = var0.field1190 * 128 + var0.field1201 * 64; // L: 4226
		var0.x += (var2 - var0.x) / var1; // L: 4227
		var0.y += (var3 - var0.y) / var1; // L: 4228
		var0.field1172 = 0; // L: 4229
		var0.orientation = var0.field1194; // L: 4230
	} // L: 4231

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	static void method6581() {
		if (Client.renderSelf) { // L: 4736
			class20.addPlayerToScene(class296.localPlayer, false); // L: 4737
		}

	} // L: 4739
}
