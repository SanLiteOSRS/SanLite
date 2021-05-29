import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("Login")
public class Login {
	@ObfuscatedName("n")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 751544539
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2130552221
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -564105319
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("t")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -162991545
	)
	static int field1032;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -519325819
	)
	static int field1039;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -677995589
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("am")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("az")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("av")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("ac")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("at")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("ah")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("aa")
	static boolean field1041;
	@ObfuscatedName("au")
	static boolean field1047;
	@ObfuscatedName("bt")
	static boolean field1043;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1482820819
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bm")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1383104493
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1580902995
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -386301875
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		longValue = -6552387078387254053L
	)
	static long field1050;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		longValue = 6302773758436356871L
	)
	static long field1022;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field1032 = -1;
		field1039 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field1041 = false;
		field1047 = false;
		field1043 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class124();
		field1050 = -1L;
		field1022 = -1L;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-179599940"
	)
	public static void method1951(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var3 = new VarbitComposition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		int var8 = var2.baseVar;
		int var5 = var2.startBit;
		int var6 = var2.endBit;
		int var7 = Varps.Varps_masks[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static void method1941(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1338737271"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-1087727229"
	)
	static int method1937(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			++Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 6950) {
			++class44.Interpreter_intStackSize;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "684555967"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (Clock.loadInterface(var0)) {
			ReflectionCheck.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1);
		}
	}
}
