import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cp")
public class class82 {
	@ObfuscatedName("f")
	static final BigInteger field983;
	@ObfuscatedName("o")
	static final BigInteger field982;

	static {
		field983 = new BigInteger("10001", 16);
		field982 = new BigInteger("db1dc3067a0e86b4ab98b9ac9b5b63c8c4981b479a87444e15b890655ad1aed0c16d9e923d9f8742cb779d26d01e9fc0335277a63f3d5d290b3197201f8da3a906a88e147cb818ce1712f76ba6cdd796c3802e14a2c7f7834391703c81e923733301425d60a1a972e72806439d82d77cf3cc274125e7046d41a25e2376cffb8f", 16);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-489476877"
	)
	static void method1924() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			KeyHandler.KeyHandler_keyCodes[186] = 57;
			KeyHandler.KeyHandler_keyCodes[187] = 27;
			KeyHandler.KeyHandler_keyCodes[188] = 71;
			KeyHandler.KeyHandler_keyCodes[189] = 26;
			KeyHandler.KeyHandler_keyCodes[190] = 72;
			KeyHandler.KeyHandler_keyCodes[191] = 73;
			KeyHandler.KeyHandler_keyCodes[192] = 58;
			KeyHandler.KeyHandler_keyCodes[219] = 42;
			KeyHandler.KeyHandler_keyCodes[220] = 74;
			KeyHandler.KeyHandler_keyCodes[221] = 43;
			KeyHandler.KeyHandler_keyCodes[222] = 59;
			KeyHandler.KeyHandler_keyCodes[223] = 28;
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71;
			KeyHandler.KeyHandler_keyCodes[45] = 26;
			KeyHandler.KeyHandler_keyCodes[46] = 72;
			KeyHandler.KeyHandler_keyCodes[47] = 73;
			KeyHandler.KeyHandler_keyCodes[59] = 57;
			KeyHandler.KeyHandler_keyCodes[61] = 27;
			KeyHandler.KeyHandler_keyCodes[91] = 42;
			KeyHandler.KeyHandler_keyCodes[92] = 74;
			KeyHandler.KeyHandler_keyCodes[93] = 43;
			KeyHandler.KeyHandler_keyCodes[192] = 28;
			KeyHandler.KeyHandler_keyCodes[222] = 58;
			KeyHandler.KeyHandler_keyCodes[520] = 59;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "1857383054"
	)
	static int method1923(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "1669467265"
	)
	static int method1922(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4 + var3;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4 * var3;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else if (var0 == ScriptOpcodes.INTERPOLATE) {
			class16.Interpreter_intStackSize -= 5;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3];
			int var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 4];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5);
			return 1;
		} else if (var0 == ScriptOpcodes.ADDPERCENT) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100;
			return 1;
		} else if (var0 == ScriptOpcodes.SETBIT) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 | 1 << var4;
			return 1;
		} else if (var0 == ScriptOpcodes.CLEARBIT) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
			return 1;
		} else if (var0 == ScriptOpcodes.TESTBIT) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.MOD) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 % var4;
			return 1;
		} else if (var0 == ScriptOpcodes.POW) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			if (var3 == 0) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.INVPOW) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			if (var3 == 0) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else {
				switch(var4) {
				case 0:
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
					break;
				case 1:
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3;
					break;
				case 2:
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
					break;
				case 3:
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
					break;
				case 4:
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
					break;
				default:
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
				}

				return 1;
			}
		} else if (var0 == ScriptOpcodes.AND) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 & var4;
			return 1;
		} else if (var0 == ScriptOpcodes.OR) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 | var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SCALE) {
			class16.Interpreter_intStackSize -= 3;
			long var9 = (long)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			long var11 = (long)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			long var13 = (long)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11);
			return 1;
		} else {
			return 2;
		}
	}
}
