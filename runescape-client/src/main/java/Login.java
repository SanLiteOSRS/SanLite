import java.text.DecimalFormat;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("Login")
public class Login {
	@ObfuscatedName("c")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2110313631
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1247885701
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 475750009
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("s")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1828335141
	)
	static int field996;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2142505193
	)
	static int field997;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 820410415
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ak")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ay")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ai")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("aa")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("au")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("as")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ah")
	static boolean field1006;
	@ObfuscatedName("af")
	static boolean field1007;
	@ObfuscatedName("bw")
	static boolean field1008;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1174698339
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bt")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1751069647
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1245392413
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1101245239
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = -1907057503222812431L
	)
	static long field1001;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		longValue = 8210570863350662601L
	)
	static long field1019;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field996 = -1;
		field997 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field1006 = false;
		field1007 = false;
		field1008 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class124();
		field1001 = -1L;
		field1019 = -1L;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "629530002"
	)
	static String method1986() {
		String var0 = "";

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0 = var0 + var2.sender + ':' + var2.text + '\n') {
			var2 = (Message)var1.next();
		}

		return var0;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "([Liv;IIIZI)V",
		garbageValue = "-2026225464"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				class17.alignWidgetSize(var6, var2, var3, var4);
				UserComparator3.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					ApproximateRouteStrategy.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
