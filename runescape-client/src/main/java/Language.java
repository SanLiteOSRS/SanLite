import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@pc
@mb
@ObfuscatedName("oa")
@Implements("Language")
public class Language implements class386 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field4435;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -1015843523
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("ab")
	final String field4431;
	@ObfuscatedName("am")
	@Export("language")
	final String language;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 314658107
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4446, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4446, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4446, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4446, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4441, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4441, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4446, 6, "MX"); // L: 18
		Language[] var0 = method7155(); // L: 25
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lor;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4431 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-351070004"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 73
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1873739638"
	)
	static int method7161(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1596579775"
	)
	public static void method7159() {
		class191.archive7.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)[Loa;",
		garbageValue = "-24301"
	)
	static Language[] method7155() {
		return new Language[]{Language_ES, Language_PT, Language_FR, Language_NL, Language_EN, Language_DE, Language_ES_MX}; // L: 42
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Loa;",
		garbageValue = "1742943694"
	)
	public static Language method7160(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null; // L: 67 68
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lcv;B)V",
		garbageValue = "0"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1990
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1991
			Calendar.method6761(var0.isMembersOnly()); // L: 1992
		}

		if (var0.properties != Client.worldProperties) { // L: 1994
			TextureProvider.method4884(class199.field2010, var0.properties); // L: 1995
		}

		MouseHandler.worldHost = var0.host; // L: 1997
		Client.worldId = var0.id; // L: 1998
		Client.worldProperties = var0.properties; // L: 1999
		UserComparator3.field1471 = var0.field833; // L: 2000
		ObjectComposition.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2001
		class363.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2002
		class164.currentPort = ObjectComposition.worldPort; // L: 2003
	} // L: 2004

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(IIIILud;Lmp;B)V",
		garbageValue = "-9"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12542
		if (var6 > 4225 && var6 < 90000) { // L: 12543
			int var7 = Client.camAngleY & 2047; // L: 12544
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12545
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12546
			int var10 = var3 * var8 + var9 * var2 >> 16; // L: 12547
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12548
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12549
			int var14 = var5.width / 2 - 25; // L: 12550
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12551
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12552
			byte var17 = 20; // L: 12553
			ParamComposition.redHintArrowSprite.method9687(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12554
		} else {
			SecureRandomFuture.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12556
		}

	} // L: 12557
}
