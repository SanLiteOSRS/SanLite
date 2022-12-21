import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
public class class71 {
	@ObfuscatedName("h")
	static final BigInteger field911;
	@ObfuscatedName("e")
	static final BigInteger field908;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -373657743
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[[Lkd;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive12")
	static Archive archive12;

	static {
		field911 = new BigInteger("10001", 16); // L: 6
		field908 = new BigInteger("ad3d9ce586e8174849a64e9a4c026a0e0b9e654a319951144939f4cc7869cd5660e3ee34d1ef221b4c86970d1370225f8c5c1dd04f2182a7eeaa5227c04f38692a85384e06228c1bf5da9c76971ad9b891964f096fc3a8d2ab6cff41d20a678c81990dce1e9c587798d638f848ade22a1232d9c2452834ec87a43a26c325080f", 16); // L: 7
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "74"
	)
	static final void method2032(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 80
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 81
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 82
					Canvas.field136[0][var5][var4] = 127; // L: 83
					if (var0 == var5 && var5 > 0) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 87
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 91

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-1238835819"
	)
	static int method2033(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class190.scriptDotWidget : class360.field4354; // L: 1297
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1298
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.x; // L: 1299
			return 1; // L: 1300
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1302
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.y; // L: 1303
			return 1; // L: 1304
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1306
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.width; // L: 1307
			return 1; // L: 1308
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1310
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.height; // L: 1311
			return 1; // L: 1312
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1314
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1315
			return 1; // L: 1316
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1318
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.parentId; // L: 1319
			return 1; // L: 1320
		} else {
			return 2; // L: 1322
		}
	}
}
