import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ab")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ax")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("al")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("aj")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ag")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 508182529
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lci;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("af")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("av")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("az")
	static boolean field835;
	@ObfuscatedName("ak")
	static boolean field833;
	@ObfuscatedName("aa")
	static ArrayList field844;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1144551589
	)
	static int field845;
	@ObfuscatedName("bq")
	static final double field846;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 70
		Interpreter_arrays = new int[5][5000]; // L: 71
		Interpreter_intStack = new int[1000]; // L: 72
		Interpreter_stringStack = new String[1000]; // L: 74
		Interpreter_frameDepth = 0; // L: 76
		Interpreter_frames = new ScriptFrame[50]; // L: 77
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 83
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 86
		field835 = false; // L: 89
		field833 = false; // L: 90
		field844 = new ArrayList(); // L: 91
		field845 = 0; // L: 92
		field846 = Math.log(2.0D); // L: 96
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1405286478"
	)
	static boolean method1986(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104; // L: 16
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1815815289"
	)
	static final int method2034(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 929
		int var4 = var0 & var2 - 1; // L: 930
		int var5 = var1 / var2; // L: 931
		int var6 = var1 & var2 - 1; // L: 932
		int var7 = class294.method5726(var3, var5); // L: 933
		int var8 = class294.method5726(var3 + 1, var5); // L: 934
		int var9 = class294.method5726(var3, var5 + 1); // L: 935
		int var10 = class294.method5726(var3 + 1, var5 + 1); // L: 936
		int var11 = SoundCache.method860(var7, var8, var4, var2); // L: 937
		int var12 = SoundCache.method860(var9, var10, var4, var2); // L: 938
		return SoundCache.method860(var11, var12, var6, var2); // L: 939
	}
}
