import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("s")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("j")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("i")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("n")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("k")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 371814983
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lbl;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("u")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("x")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("q")
	static boolean field851;
	@ObfuscatedName("d")
	static boolean field866;
	@ObfuscatedName("e")
	static ArrayList field864;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 555404067
	)
	static int field861;
	@ObfuscatedName("ai")
	static final double field862;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 80
		Interpreter_arrays = new int[5][5000]; // L: 81
		Interpreter_intStack = new int[1000]; // L: 82
		Interpreter_stringStack = new String[1000]; // L: 84
		Interpreter_frameDepth = 0; // L: 86
		Interpreter_frames = new ScriptFrame[50]; // L: 87
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 93
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 96
		field851 = false; // L: 99
		field866 = false; // L: 100
		field864 = new ArrayList(); // L: 101
		field861 = 0; // L: 102
		field862 = Math.log(2.0D); // L: 106
	}
}
