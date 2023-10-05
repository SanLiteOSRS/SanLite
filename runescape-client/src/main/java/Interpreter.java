import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ax")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ah")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("ar")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("ab")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -527981427
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("av")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 772033927
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lcn;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	static ClanChannel field876;
	@ObfuscatedName("ai")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("ae")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("aq")
	static boolean field882;
	@ObfuscatedName("az")
	static boolean field883;
	@ObfuscatedName("at")
	static ArrayList field886;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 804295643
	)
	static int field878;
	@ObfuscatedName("by")
	static final double field884;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 73
		Interpreter_arrays = new int[5][5000]; // L: 74
		Interpreter_intStack = new int[1000]; // L: 75
		Interpreter_stringStack = new String[1000]; // L: 77
		Interpreter_frameDepth = 0; // L: 79
		Interpreter_frames = new ScriptFrame[50]; // L: 80
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 86
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 89
		field882 = false; // L: 92
		field883 = false; // L: 93
		field886 = new ArrayList(); // L: 94
		field878 = 0; // L: 95
		field884 = Math.log(2.0D); // L: 99
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)V",
		garbageValue = "1932379586"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		ArchiveDisk.runScript(var0, 500000, 475000); // L: 106
	} // L: 107

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1205286290"
	)
	static final void method2071(int var0, int var1) {
		if (class33.field184.method6242(var0)) { // L: 11984
			ClientPacket.runComponentCloseListeners(class33.field184.field3587[var0], var1); // L: 11985
		}
	} // L: 11986
}
