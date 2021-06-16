import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("Login")
public class Login {
	@ObfuscatedName("e")
	public static String field1026;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1349734719
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1462370461
	)
	public static int field1033;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static IndexedSprite field1005;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -49273179
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1645328707
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("n")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1442132519
	)
	static int field1011;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1846708661
	)
	static int field1012;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1473378055
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ao")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("an")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("al")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("aj")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("ac")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("as")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ax")
	static boolean field1006;
	@ObfuscatedName("ar")
	static boolean field1021;
	@ObfuscatedName("bx")
	static boolean field1022;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1921798817
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bc")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1331628685
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1559013153
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1727886511
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		longValue = -504065340158642831L
	)
	static long field1019;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		longValue = -731103145365599943L
	)
	static long field1031;
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static Widget field1034;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field1011 = -1;
		field1012 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field1006 = false;
		field1021 = false;
		field1022 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class125();
		field1019 = -1L;
		field1031 = -1L;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-461506193"
	)
	public static boolean method2058(int var0) {
		return var0 >= WorldMapDecorationType.field3160.id && var0 <= WorldMapDecorationType.field3170.id || var0 == WorldMapDecorationType.field3150.id;
	}
}
