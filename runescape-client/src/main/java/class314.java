import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@mz
@ObfuscatedName("md")
public final class class314 {
	@ObfuscatedName("af")
	static final HashMap field3427;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field3428;

	static {
		field3427 = new HashMap(); // L: 11
		java.util.Calendar.getInstance(method6000("Europe/London")); // L: 14
	} // L: 15

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "-127615188"
	)
	static TimeZone method6000(String var0) {
		synchronized(field3427) { // L: 22
			TimeZone var2 = (TimeZone)field3427.get(var0); // L: 23
			if (var2 == null) { // L: 24
				var2 = TimeZone.getTimeZone(var0); // L: 25
				field3427.put(var0, var2); // L: 26
			}

			return var2; // L: 28
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;B)Z",
		garbageValue = "-75"
	)
	static boolean method6005(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance(); // L: 1143
		var1.set(1, var1.get(1) - 13); // L: 1144
		var1.set(5, var1.get(5) + 1); // L: 1145
		var1.set(11, 0); // L: 1146
		var1.set(12, 0); // L: 1147
		var1.set(13, 0); // L: 1148
		var1.set(14, 0); // L: 1149
		Date var2 = var1.getTime(); // L: 1150
		return var0.before(var2); // L: 1151
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "2047821445"
	)
	static int method6006(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 5108
			int var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5109
			NPCComposition var6 = Script.getNpcDefinition(var5); // L: 5110
			Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 5111
			return 1; // L: 5112
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 5114
				UserComparator6.Interpreter_intStackSize -= 2; // L: 5115
				var3 = Script.getNpcDefinition(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]); // L: 5116
				int var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 5117
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.method3738(var4); // L: 5118
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.method3729(var4); // L: 5119
				return 1; // L: 5120
			} else if (var0 == 6765) { // L: 5122
				var3 = Script.getNpcDefinition(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 5123
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0; // L: 5124
				return 1; // L: 5125
			} else {
				return 2; // L: 5127
			}
		}
	}
}
