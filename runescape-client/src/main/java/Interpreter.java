import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("at")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("an")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("ao")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("ab")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("aw")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("al")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -865157543
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lcc;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ap")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("av")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("aq")
	static boolean field872;
	@ObfuscatedName("am")
	static boolean field873;
	@ObfuscatedName("ac")
	static ArrayList field867;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1509184871
	)
	static int field875;
	@ObfuscatedName("bc")
	static final double field876;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static SpritePixels field877;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = -1601607707
	)
	static int field879;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 75
		Interpreter_arrays = new int[5][5000]; // L: 76
		Interpreter_intStack = new int[1000]; // L: 77
		Interpreter_stringStack = new String[1000]; // L: 79
		Interpreter_frameDepth = 0; // L: 81
		Interpreter_frames = new ScriptFrame[50]; // L: 82
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 88
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 91
		field872 = false; // L: 94
		field873 = false; // L: 95
		field867 = new ArrayList(); // L: 96
		field875 = 0; // L: 97
		field876 = Math.log(2.0D); // L: 101
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1697209710"
	)
	static void method2068(int var0, int var1, int var2, int var3) {
		Widget var4 = class243.field2620.method6286(var0, var1); // L: 10132
		if (var4 != null && var4.onTargetEnter != null) { // L: 10133
			ScriptEvent var5 = new ScriptEvent(); // L: 10134
			var5.widget = var4; // L: 10135
			var5.args = var4.onTargetEnter; // L: 10136
			AbstractWorldMapData.runScriptEvent(var5); // L: 10137
		}

		Client.field688 = var3; // L: 10139
		Client.isSpellSelected = true; // L: 10140
		ChatChannel.field1020 = var0; // L: 10141
		Client.field678 = var1; // L: 10142
		class352.field3905 = var2; // L: 10143
		WorldMapData_0.invalidateWidget(var4); // L: 10144
	} // L: 10145

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "1"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		GraphicsObject.method2076(var0, var1, var2, var3, var4, var5, -1, false); // L: 10275
	} // L: 10276
}
