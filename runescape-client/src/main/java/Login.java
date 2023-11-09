import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cb")
@Implements("Login")
public class Login {
	@ObfuscatedName("aj")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 645381677
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lum;"
	)
	static IndexedSprite[] field915;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1626454505
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1138606675
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("ak")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1823491029
	)
	static int field938;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1900804473
	)
	static int field927;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -686932225
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cg")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ci")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cf")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cx")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cm")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("co")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1613965717
	)
	static int field918;
	@ObfuscatedName("cd")
	static String[] field936;
	@ObfuscatedName("cn")
	static String field937;
	@ObfuscatedName("cr")
	static boolean field914;
	@ObfuscatedName("cq")
	static boolean field940;
	@ObfuscatedName("ct")
	static boolean field917;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 937827455
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dg")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1929697533
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -52664771
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1833693703
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		longValue = 5424461616927671099L
	)
	static long field948;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		longValue = 850772186286499895L
	)
	static long field949;
	@ObfuscatedName("dz")
	static String[] field950;
	@ObfuscatedName("da")
	static String[] field951;
	@ObfuscatedName("dd")
	static String[] field925;

	static {
		xPadding = 0; // L: 50
		loginBoxX = xPadding + 202; // L: 69
		Login_loadingPercent = 10; // L: 71
		Login_loadingText = ""; // L: 72
		field938 = -1; // L: 93
		field927 = 1; // L: 96
		loginIndex = 0; // L: 100
		Login_response0 = ""; // L: 101
		Login_response1 = ""; // L: 102
		Login_response2 = ""; // L: 103
		Login_response3 = ""; // L: 104
		Login_username = ""; // L: 105
		Login_password = ""; // L: 106
		field918 = 0; // L: 108
		field936 = new String[8]; // L: 109
		field937 = ""; // L: 114
		field914 = false; // L: 121
		field940 = false; // L: 122
		field917 = true; // L: 125
		currentLoginField = 0; // L: 126
		worldSelectOpen = false; // L: 130
		hoveredWorldIndex = -1; // L: 138
		worldSelectPage = 0; // L: 139
		worldSelectPagesCount = 0; // L: 140
		new DecimalFormat("##0.00"); // L: 143
		new class134();
		field948 = -1L; // L: 151
		field949 = -1L; // L: 152
		field950 = new String[]{"title.jpg"}; // L: 155
		field951 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 158
		field925 = new String[]{"logo_speedrunning"}; // L: 161
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhb;",
		garbageValue = "24"
	)
	public static VarbitComposition method2150(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 28
		if (var1 != null) { // L: 29
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 30
			var1 = new VarbitComposition(); // L: 31
			if (var2 != null) { // L: 32
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0); // L: 33
			return var1; // L: 34
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "1701961158"
	)
	static int method2151(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1819
			var3 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1820
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1821
			return 1; // L: 1822
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1824
			var3 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1825
			if (var3.itemId != -1) { // L: 1826
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1827
			}

			return 1; // L: 1828
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1830
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1831
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1832
			if (var4 != null) { // L: 1833
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1834
			}

			return 1; // L: 1835
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1837
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1838
			return 1; // L: 1839
		} else if (var0 == 2707) { // L: 1841
			var3 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1842
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6460() ? 1 : 0; // L: 1843
			return 1; // L: 1844
		} else if (var0 == 2708) { // L: 1846
			var3 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1847
			return class10.method119(var3); // L: 1848
		} else if (var0 == 2709) { // L: 1850
			var3 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1851
			return class47.method888(var3); // L: 1852
		} else {
			return 2; // L: 1854
		}
	}
}
