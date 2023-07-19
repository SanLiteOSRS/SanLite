import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nu")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fl")
	public static String field3969;
	@ObfuscatedName("kq")
	public static String field4158;
	@ObfuscatedName("kr")
	public static String field4159;
	@ObfuscatedName("kz")
	public static String field4160;

	static {
		field3969 = "Please visit the support page for assistance."; // L: 137
		field4158 = ""; // L: 285
		field4159 = "Page has opened in the browser."; // L: 286
		field4160 = ""; // L: 287
	} // L: 330

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)D",
		garbageValue = "-235757613"
	)
	static double method6678(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D; // L: 29
		if (var3 > 0.0D && var3 < 1.0D) { // L: 30
			double var5;
			double var7;
			switch(var2) { // L: 33
			case 0:
				return var3; // L: 98
			case 1:
				return 1.0D - Math.cos(var3 * 3.141592653589793D / 2.0D); // L: 105
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D); // L: 88
			case 3:
				return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D; // L: 84
			case 4:
				return var3 * var3; // L: 111
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3); // L: 94
			case 6:
				return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D) / 2.0D; // L: 92
			case 7:
				return var3 * var3 * var3; // L: 107
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D); // L: 109
			case 9:
				return var3 < 0.5D ? var3 * var3 * 4.0D * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 3.0D) / 2.0D; // L: 39
			case 10:
				return var3 * var3 * var3 * var3; // L: 49
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D); // L: 53
			case 12:
				return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D; // L: 55
			case 13:
				return var3 * var3 * var3 * var3 * var3; // L: 37
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D); // L: 96
			case 15:
				return var3 < 0.5D ? var3 * var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 5.0D) / 2.0D; // L: 86
			case 16:
				return Math.pow(2.0D, var3 * 10.0D - 10.0D); // L: 90
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var3); // L: 82
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 10.0D + 20.0D * var3) / 2.0D : (2.0D - Math.pow(2.0D, -20.0D * var3 + 10.0D)) / 2.0D; // L: 74
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D)); // L: 51
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D)); // L: 47
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D)) + 1.0D) / 2.0D; // L: 35
			case 22:
				var5 = 1.70158D; // L: 42
				var7 = 2.70158D; // L: 43
				return var3 * 2.70158D * var3 * var3 - var3 * 1.70158D * var3; // L: 44
			case 23:
				var5 = 1.70158D; // L: 77
				var7 = 2.70158D; // L: 78
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D); // L: 79
			case 24:
				var5 = 1.70158D; // L: 69
				var7 = 2.5949095D; // L: 70
				return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (7.189819D * var3 - 2.5949095D) / 2.0D : (Math.pow(2.0D * var3 - 2.0D, 2.0D) * (3.5949095D * (2.0D * var3 - 2.0D) + 2.5949095D) + 2.0D) / 2.0D; // L: 71
			case 25:
				var5 = 2.0943951023931953D; // L: 101
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin(2.0943951023931953D * (10.0D * var3 - 10.75D)); // L: 102
			case 26:
				var5 = 2.0943951023931953D; // L: 64
				return Math.pow(2.0D, -10.0D * var3) * Math.sin((10.0D * var3 - 0.75D) * 2.0943951023931953D) + 1.0D; // L: 65
			case 27:
				var5 = 1.3962634015954636D; // L: 58
				var7 = Math.sin((20.0D * var3 - 11.125D) * 1.3962634015954636D); // L: 59
				return var3 < 0.5D ? -(Math.pow(2.0D, 20.0D * var3 - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + var3 * -20.0D) * var7 / 2.0D + 1.0D; // L: 60
			default:
				return var3; // L: 113
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D; // L: 31
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "-1"
	)
	static int method6679(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class184.field1907; // L: 1520
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1521
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1522
			return 1; // L: 1523
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1525
			if (var3.itemId != -1) { // L: 1526
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1527
			}

			return 1; // L: 1528
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1530
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1531
			return 1; // L: 1532
		} else if (var0 == 1707) { // L: 1534
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6460() ? 1 : 0; // L: 1535
			return 1; // L: 1536
		} else if (var0 == 1708) { // L: 1538
			return class10.method119(var3); // L: 1539
		} else {
			return var0 == 1709 ? class47.method888(var3) : 2; // L: 1541 1542 1544
		}
	}
}
