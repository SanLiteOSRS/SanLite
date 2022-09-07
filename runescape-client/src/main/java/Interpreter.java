import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("v")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("c")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("q")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("i")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("k")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("n")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1584311727
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Lbu;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	static ClanChannel field826;
	@ObfuscatedName("p")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("e")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("x")
	static boolean field820;
	@ObfuscatedName("f")
	static boolean field816;
	@ObfuscatedName("t")
	static ArrayList field831;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1905581353
	)
	static int field830;
	@ObfuscatedName("av")
	static final double field824;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static GameBuild field834;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 84
		Interpreter_arrays = new int[5][5000]; // L: 85
		Interpreter_intStack = new int[1000]; // L: 86
		Interpreter_stringStack = new String[1000]; // L: 88
		Interpreter_frameDepth = 0; // L: 90
		Interpreter_frames = new ScriptFrame[50]; // L: 91
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 97
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 100
		field820 = false; // L: 103
		field816 = false; // L: 104
		field831 = new ArrayList(); // L: 105
		field830 = 0; // L: 106
		field824 = Math.log(2.0D); // L: 110
	}
}
