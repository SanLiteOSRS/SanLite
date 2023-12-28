import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qj")
public class class426 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "777593325"
	)
	static int method7946(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1014
			var0 -= 1000; // L: 1015
			var3 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1016
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : HealthBar.field1302; // L: 1018
		}

		class159.invalidateWidget(var3); // L: 1019
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1020
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1040
				var3.modelType = 2; // L: 1041
				var3.modelId = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1042
				return 1; // L: 1043
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1045
				var3.modelType = 3; // L: 1046
				var3.modelId = class229.localPlayer.appearance.getChatHeadId(); // L: 1047
				return 1; // L: 1048
			} else if (var0 == 1207) { // L: 1050
				boolean var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 1051
				class18.method290(var3, class229.localPlayer.appearance, var7); // L: 1052
				return 1; // L: 1053
			} else if (var0 == 1208) { // L: 1055
				var4 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1056
				if (var3.field3717 == null) { // L: 1057
					throw new RuntimeException(""); // L: 1058
				} else {
					AbstractWorldMapData.method4899(var3, var4); // L: 1060
					return 1; // L: 1061
				}
			} else if (var0 == 1209) { // L: 1063
				class517.Interpreter_intStackSize -= 2; // L: 1064
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 1065
				var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 1066
				if (var3.field3717 == null) { // L: 1067
					throw new RuntimeException(""); // L: 1068
				} else {
					class306.method5915(var3, var4, var5); // L: 1070
					return 1; // L: 1071
				}
			} else if (var0 == 1210) { // L: 1073
				var4 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1074
				if (var3.field3717 == null) { // L: 1075
					throw new RuntimeException(""); // L: 1076
				} else {
					class302.method5906(var3, class229.localPlayer.appearance.field3600, var4); // L: 1078
					return 1; // L: 1079
				}
			} else {
				return 2; // L: 1081
			}
		} else {
			class517.Interpreter_intStackSize -= 2; // L: 1021
			var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 1022
			var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 1023
			var3.itemId = var4; // L: 1024
			var3.itemQuantity = var5; // L: 1025
			ItemComposition var6 = class214.ItemComposition_get(var4); // L: 1026
			var3.modelAngleX = var6.xan2d; // L: 1027
			var3.modelAngleY = var6.yan2d; // L: 1028
			var3.modelAngleZ = var6.zan2d; // L: 1029
			var3.modelOffsetX = var6.offsetX2d; // L: 1030
			var3.modelOffsetY = var6.offsetY2d; // L: 1031
			var3.modelZoom = var6.zoom2d; // L: 1032
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1033
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 1034
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1035
			}

			if (var3.field3684 > 0) { // L: 1036
				var3.modelZoom = var3.modelZoom * 32 / var3.field3684;
			} else if (var3.rawWidth > 0) { // L: 1037
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1038
		}
	}
}
