import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("u")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("c")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("w")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("z")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("j")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("a")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1952462401
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lba;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -473119647
	)
	static int field836;
	@ObfuscatedName("k")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("v")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("e")
	static boolean field831;
	@ObfuscatedName("s")
	static boolean field840;
	@ObfuscatedName("i")
	static ArrayList field841;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 192809765
	)
	static int field844;
	@ObfuscatedName("aj")
	static final double field843;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 83
		Interpreter_arrays = new int[5][5000]; // L: 84
		Interpreter_intStack = new int[1000]; // L: 85
		Interpreter_stringStack = new String[1000]; // L: 87
		Interpreter_frameDepth = 0; // L: 89
		Interpreter_frames = new ScriptFrame[50]; // L: 90
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 96
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 99
		field831 = false; // L: 102
		field840 = false; // L: 103
		field841 = new ArrayList(); // L: 104
		field844 = 0; // L: 105
		field843 = Math.log(2.0D); // L: 109
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "122"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 23
		if (var4 == null) { // L: 24
			var4 = new ChatChannel(); // L: 25
			Messages.Messages_channels.put(var0, var4); // L: 26
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 28
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 29
		Messages.Messages_queue.add(var5); // L: 30
		Client.chatCycle = Client.cycleCntr; // L: 31
	} // L: 32
}
