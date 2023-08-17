import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@oj
@mr
@ObfuscatedName("on")
@Implements("Language")
public class Language implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lon;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("ap")
	final String field4382;
	@ObfuscatedName("aa")
	@Export("language")
	final String language;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 459816573
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4393, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4393, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4393, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4393, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4406, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4406, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4393, 6, "MX"); // L: 18
		Language[] var0 = method6939(); // L: 25
		Language_valuesOrdered = new Language[var0.length]; // L: 26
		Language[] var1 = var0; // L: 28

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 29
			Language var3 = var1[var2]; // L: 30
			if (Language_valuesOrdered[var3.id] != null) { // L: 32
				throw new IllegalStateException(); // L: 33
			}

			Language_valuesOrdered[var3.id] = var3; // L: 35
		}

	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Loe;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4382 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "82"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 73
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lon;",
		garbageValue = "-905836833"
	)
	static Language[] method6939() {
		return new Language[]{Language_ES, Language_DE, Language_FR, Language_ES_MX, Language_NL, Language_EN, Language_PT}; // L: 42
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "66381547"
	)
	static void method6952() {
		Tiles.Tiles_minPlane = 99; // L: 45
		Tiles.field1040 = new short[4][104][104]; // L: 46
		class227.field2543 = new short[4][104][104]; // L: 47
		class172.field1855 = new byte[4][104][104]; // L: 48
		ModelData0.field2833 = new byte[4][104][104]; // L: 49
		BufferedNetSocket.field4679 = new int[4][105][105]; // L: 50
		class217.field2409 = new byte[4][105][105]; // L: 51
		class162.field1794 = new int[105][105]; // L: 52
		Fonts.Tiles_hue = new int[104]; // L: 53
		class466.Tiles_saturation = new int[104]; // L: 54
		Tiles.Tiles_lightness = new int[104]; // L: 55
		class128.Tiles_hueMultiplier = new int[104]; // L: 56
		Interpreter.field888 = new int[104]; // L: 57
	} // L: 58

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lon;",
		garbageValue = "-695535703"
	)
	public static Language method6938(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null; // L: 67 68
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "56"
	)
	static final void method6953(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10973
		int var7 = var3 - var1; // L: 10974
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10975
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10976
		int var10 = var8; // L: 10977
		if (var8 < var9) { // L: 10978
			var10 = var9;
		}

		if (var10 != 0) { // L: 10979
			int var11 = (var6 << 16) / var10; // L: 10980
			int var12 = (var7 << 16) / var10; // L: 10981
			if (var12 <= var11) { // L: 10982
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10983
			}

			int var13 = var5 * var12 >> 17; // L: 10984
			int var14 = var5 * var12 + 1 >> 17; // L: 10985
			int var15 = var5 * var11 >> 17; // L: 10986
			int var16 = var5 * var11 + 1 >> 17; // L: 10987
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10988
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10989
			int var17 = var0 + var13; // L: 10990
			int var18 = var0 - var14; // L: 10991
			int var19 = var0 + var6 - var14; // L: 10992
			int var20 = var0 + var13 + var6; // L: 10993
			int var21 = var15 + var1; // L: 10994
			int var22 = var1 - var16; // L: 10995
			int var23 = var7 + var1 - var16; // L: 10996
			int var24 = var15 + var7 + var1; // L: 10997
			Rasterizer3D.method4393(var17, var18, var19); // L: 10998
			Rasterizer3D.method4455(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4); // L: 10999
			Rasterizer3D.method4393(var17, var19, var20); // L: 11000
			Rasterizer3D.method4455(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4); // L: 11001
		}
	} // L: 11002
}
