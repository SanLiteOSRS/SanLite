import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dp")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1792162961
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1704065255
	)
	@Export("health")
	int health;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 695756529
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1345194135
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2011079863"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "2092480098"
	)
	static String method2427(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) { // L: 68
			RunException var2 = (RunException)var0; // L: 69
			var1 = var2.message + " | "; // L: 70
			var0 = var2.throwable; // L: 71
		} else {
			var1 = ""; // L: 73
		}

		StringWriter var12 = new StringWriter(); // L: 74
		PrintWriter var3 = new PrintWriter(var12); // L: 75
		var0.printStackTrace(var3); // L: 76
		var3.close(); // L: 77
		String var4 = var12.toString(); // L: 78
		BufferedReader var5 = new BufferedReader(new StringReader(var4)); // L: 79
		String var6 = var5.readLine(); // L: 80

		while (true) {
			while (true) {
				String var7 = var5.readLine(); // L: 82
				if (var7 == null) { // L: 83
					var1 = var1 + "| " + var6; // L: 101
					return var1; // L: 102
				}

				int var8 = var7.indexOf(40); // L: 84
				int var9 = var7.indexOf(41, var8 + 1); // L: 85
				if (var8 >= 0 && var9 >= 0) { // L: 86
					String var10 = var7.substring(var8 + 1, var9); // L: 87
					int var11 = var10.indexOf(".java:"); // L: 88
					if (var11 >= 0) { // L: 89
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5); // L: 90
						var1 = var1 + var10 + ' '; // L: 91
						continue; // L: 92
					}

					var7 = var7.substring(0, var8); // L: 94
				}

				var7 = var7.trim(); // L: 96
				var7 = var7.substring(var7.lastIndexOf(32) + 1); // L: 97
				var7 = var7.substring(var7.lastIndexOf(9) + 1); // L: 98
				var1 = var1 + var7 + ' '; // L: 99
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1197133658"
	)
	static int method2423(int var0, Script var1, boolean var2) {
		Widget var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1858
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1859
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class273.Widget_unpackTargetMask(UserComparator8.getWidgetFlags(var3)); // L: 1860
			return 1; // L: 1861
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1863
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1870
				if (var3.dataText == null) { // L: 1871
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1872
				}

				return 1; // L: 1873
			} else {
				return 2; // L: 1875
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1864
			--var4; // L: 1865
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1866
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1867
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1868
		}
	}
}
