import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("df")
public enum class124 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1519(3, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1522(0, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1521(1, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1520(4, 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1523(2, 4);

	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1199083661
	)
	public final int field1524;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2124972105
	)
	@Export("id")
	final int id;

	class124(int var3, int var4) {
		this.field1524 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "123"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 193
			return true;
		} else if (var0 >= 160 && var0 <= 255) { // L: 194
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 195
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1560947837"
	)
	static int method2768(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2289
			Nameable.Interpreter_intStackSize -= 2; // L: 2290
			var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 2291
			var9 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 2292
			EnumComposition var10 = WorldMapIcon_1.getEnum(var3); // L: 2293
			if (var10.outputType != 's') { // L: 2294
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2295
				if (var9 == var10.keys[var6]) { // L: 2296
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2297
					var10 = null; // L: 2298
					break;
				}
			}

			if (var10 != null) { // L: 2302
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2303
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2305
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2331
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2332
				EnumComposition var4 = WorldMapIcon_1.getEnum(var3); // L: 2333
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.size(); // L: 2334
				return 1; // L: 2335
			} else {
				return 2; // L: 2337
			}
		} else {
			Nameable.Interpreter_intStackSize -= 4; // L: 2306
			var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 2307
			var9 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 2308
			int var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 2309
			var6 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 3]; // L: 2310
			EnumComposition var7 = WorldMapIcon_1.getEnum(var5); // L: 2311
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2312
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2317
					if (var6 == var7.keys[var8]) { // L: 2318
						if (var9 == 115) { // L: 2319
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2320
						}

						var7 = null; // L: 2321
						break;
					}
				}

				if (var7 != null) { // L: 2325
					if (var9 == 115) { // L: 2326
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2327
					}
				}

				return 1; // L: 2329
			} else {
				if (var9 == 115) { // L: 2313
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2314
				}

				return 1; // L: 2315
			}
		}
	}
}
