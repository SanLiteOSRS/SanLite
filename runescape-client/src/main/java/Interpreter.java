import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("aj")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ar")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("ag")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("ao")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("aa")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 562302071
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lcu;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ay")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("as")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("ah")
	static boolean field857;
	@ObfuscatedName("ai")
	static boolean field858;
	@ObfuscatedName("ac")
	static ArrayList field849;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 973902255
	)
	static int field860;
	@ObfuscatedName("bg")
	static final double field846;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 74
		Interpreter_arrays = new int[5][5000]; // L: 75
		Interpreter_intStack = new int[1000]; // L: 76
		Interpreter_stringStack = new String[1000]; // L: 78
		Interpreter_frameDepth = 0; // L: 80
		Interpreter_frames = new ScriptFrame[50]; // L: 81
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 87
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 90
		field857 = false; // L: 93
		field858 = false; // L: 94
		field849 = new ArrayList(); // L: 95
		field860 = 0; // L: 96
		field846 = Math.log(2.0D); // L: 100
	}
}
