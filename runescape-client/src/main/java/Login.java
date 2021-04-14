import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("Login")
public class Login {
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		signature = "Lcm;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1122392293
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "[Low;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1338288751
	)
	static int field1018;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lci;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1015989971
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1156735553
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("a")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1968264881
	)
	static int field993;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1162562217
	)
	static int field994;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -233331579
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ad")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("af")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ao")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("ai")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("av")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("az")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("an")
	static boolean field1003;
	@ObfuscatedName("ah")
	static boolean field1012;
	@ObfuscatedName("br")
	static boolean field1005;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -819418163
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bt")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -2104276991
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1497007259
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1387381071
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = 5781312275370513963L
	)
	static long field991;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		longValue = -4852859935044639761L
	)
	static long field1016;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field993 = -1;
		field994 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field1003 = false;
		field1012 = false;
		field1005 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class124();
		field991 = -1L;
		field1016 = -1L;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Lke;",
		garbageValue = "-1050375469"
	)
	public static FloorOverlayDefinition method1968(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Lne;",
		garbageValue = "283131350"
	)
	public static class373 method1969(int var0) {
		int var1 = class371.field4124[var0];
		if (var1 == 1) {
			return class373.field4126;
		} else if (var1 == 2) {
			return class373.field4128;
		} else {
			return var1 == 3 ? class373.field4134 : null;
		}
	}

	@ObfuscatedName("u")
	public static int method1967(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}
}
