import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ab")
public class class41 {
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 641219975
	)
	static int field302;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		signature = "Lil;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = 725701035
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("gb")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-335068840"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class195.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!class58.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = class58.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				class195.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (class9.Widget_interfaceComponents[var0] == null) {
					class9.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (class9.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = class58.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							class9.Widget_interfaceComponents[var0][var2] = new Widget();
							class9.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								class9.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								class9.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				class195.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "1680484143"
	)
	static int method602(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4 + var3;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4 * var3;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else if (var0 == ScriptOpcodes.INTERPOLATE) {
			VarcInt.Interpreter_intStackSize -= 5;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3];
			int var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 4];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
			return 1;
		} else if (var0 == ScriptOpcodes.ADDPERCENT) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100;
			return 1;
		} else if (var0 == ScriptOpcodes.SETBIT) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 | 1 << var4;
			return 1;
		} else if (var0 == ScriptOpcodes.CLEARBIT) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
			return 1;
		} else if (var0 == ScriptOpcodes.TESTBIT) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.MOD) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 % var4;
			return 1;
		} else if (var0 == ScriptOpcodes.POW) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			if (var3 == 0) {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
			} else {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.INVPOW) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			if (var3 == 0) {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else {
				switch(var4) {
				case 0:
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
					break;
				case 1:
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3;
					break;
				case 2:
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
					break;
				case 3:
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
					break;
				case 4:
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
					break;
				default:
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
				}

				return 1;
			}
		} else if (var0 == ScriptOpcodes.AND) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 & var4;
			return 1;
		} else if (var0 == ScriptOpcodes.OR) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 | var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SCALE) {
			VarcInt.Interpreter_intStackSize -= 3;
			long var9 = (long)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			long var11 = (long)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			long var13 = (long)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11);
			return 1;
		} else {
			return 2;
		}
	}
}
