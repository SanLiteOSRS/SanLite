import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ac")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("au")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("ab")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("aq")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("al")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -964267539
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("aa")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1968816839
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lck;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("am")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("as")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ak")
	static boolean field849;
	@ObfuscatedName("az")
	static boolean field853;
	@ObfuscatedName("ad")
	static ArrayList field837;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1484376709
	)
	static int field852;
	@ObfuscatedName("bi")
	static final double field851;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 70
		Interpreter_arrays = new int[5][5000]; // L: 71
		Interpreter_intStack = new int[1000]; // L: 72
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50]; // L: 77
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 83
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 86
		field849 = false; // L: 89
		field853 = false; // L: 90
		field837 = new ArrayList(); // L: 91
		field852 = 0; // L: 92
		field851 = Math.log(2.0D); // L: 96
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;ZB)V",
		garbageValue = "3"
	)
	public static void method1987(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0; // L: 73
		class157.ObjectDefinition_modelsArchive = var1; // L: 74
		ObjectComposition.ObjectDefinition_isLowDetail = var2; // L: 75
	} // L: 76

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lcl;",
		garbageValue = "1711407599"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class31.World_worlds[++World.World_listCount - 1] : null; // L: 252 253
	}
}
