import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("b")
	@Export("SpriteBuffer_yOffsets")
	static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Low;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("k")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("g")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("h")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("n")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("m")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -196314347
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -309937971
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "[Lbg;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lp;"
	)
	static class3 field941;
	@ObfuscatedName("z")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("i")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("w")
	static boolean field944;
	@ObfuscatedName("s")
	static boolean field946;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1409766351
	)
	static int field950;
	@ObfuscatedName("ag")
	static final double field934;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		signature = "Low;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field944 = false;
		field946 = false;
		field950 = 0;
		field934 = Math.log(2.0D);
	}
}
