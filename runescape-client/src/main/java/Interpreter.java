import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("ab")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("an")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("ao")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("av")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("aq")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 295942057
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("ar")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1716844447
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lcd;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ay")
	static int[] field840;
	@ObfuscatedName("ag")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("at")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ai")
	static boolean field835;
	@ObfuscatedName("aw")
	static boolean field836;
	@ObfuscatedName("aa")
	static ArrayList field837;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1582577225
	)
	static int field838;
	@ObfuscatedName("bo")
	static final double field839;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 1340082839
	)
	static int field844;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 80
		Interpreter_arrays = new int[5][5000]; // L: 81
		Interpreter_intStack = new int[1000]; // L: 82
		Interpreter_stringStack = new String[1000]; // L: 84
		Interpreter_frameDepth = 0; // L: 86
		Interpreter_frames = new ScriptFrame[50]; // L: 87
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 93
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 96
		field835 = false; // L: 99
		field836 = false; // L: 100
		field837 = new ArrayList(); // L: 101
		field838 = 0; // L: 102
		field839 = Math.log(2.0D); // L: 106
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "732600151"
	)
	static boolean method2027(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) { // L: 1229
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) { // L: 1230
				return true;
			}
		}

		return false; // L: 1232
	}
}
