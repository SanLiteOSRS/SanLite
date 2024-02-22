import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hx")
public class class193 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2030;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2026;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2027;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2028;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2029;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2025;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2031;
	@ObfuscatedName("bj")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;

	static {
		field2030 = new class193(0, class207.field2283); // L: 4
		field2026 = new class193(1, class207.field2280); // L: 5
		field2027 = new class193(2, class207.field2279); // L: 6
		field2028 = new class193(3, class207.field2287); // L: 7
		field2029 = new class193(4, class207.field2284); // L: 8
		field2025 = new class193(5, class207.field2281); // L: 9
		field2031 = new class193(6, class207.field2285); // L: 10
	}

	@ObfuscatedSignature(
		descriptor = "(ILhz;)V"
	)
	class193(int var1, class207 var2) {
	} // L: 12

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "268030870"
	)
	static boolean method3782(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104; // L: 18
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1788920585"
	)
	public static void method3781() {
		synchronized(ArchiveDiskActionHandler.field4365) { // L: 120
			if (ArchiveDiskActionHandler.field4362 != 0) { // L: 121
				ArchiveDiskActionHandler.field4362 = 1; // L: 122
				ArchiveDiskActionHandler.field4363 = true; // L: 123

				try {
					ArchiveDiskActionHandler.field4365.wait(); // L: 125
				} catch (InterruptedException var3) { // L: 127
				}
			}

		}
	} // L: 130

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "15"
	)
	static int method3783(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1045
			var0 -= 1000; // L: 1046
			var3 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1047
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 1049
		}

		UserComparator5.invalidateWidget(var3); // L: 1050
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1051
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1071
				var3.modelType = 2; // L: 1072
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1073
				return 1; // L: 1074
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1076
				var3.modelType = 3; // L: 1077
				var3.modelId = VarpDefinition.localPlayer.appearance.getChatHeadId(); // L: 1078
				return 1; // L: 1079
			} else if (var0 == 1207) { // L: 1081
				boolean var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1082
				class14.method161(var3, VarpDefinition.localPlayer.appearance, var7); // L: 1083
				return 1; // L: 1084
			} else if (var0 == 1208) { // L: 1086
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1087
				if (var3.field3774 == null) { // L: 1088
					throw new RuntimeException(""); // L: 1089
				} else {
					UserComparator8.method2942(var3, var4); // L: 1091
					return 1; // L: 1092
				}
			} else if (var0 == 1209) { // L: 1094
				Interpreter.Interpreter_intStackSize -= 2; // L: 1095
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1096
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1097
				if (var3.field3774 == null) { // L: 1098
					throw new RuntimeException(""); // L: 1099
				} else {
					class158.method3402(var3, var4, var5); // L: 1101
					return 1; // L: 1102
				}
			} else if (var0 == 1210) { // L: 1104
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1105
				if (var3.field3774 == null) { // L: 1106
					throw new RuntimeException(""); // L: 1107
				} else {
					WorldMapElement.method3580(var3, VarpDefinition.localPlayer.appearance.field3665, var4); // L: 1109
					return 1; // L: 1110
				}
			} else {
				return 2; // L: 1112
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1052
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1053
			var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1054
			var3.itemId = var4; // L: 1055
			var3.itemQuantity = var5; // L: 1056
			ItemComposition var6 = ArchiveDiskActionHandler.ItemComposition_get(var4); // L: 1057
			var3.modelAngleX = var6.xan2d; // L: 1058
			var3.modelAngleY = var6.yan2d; // L: 1059
			var3.modelAngleZ = var6.zan2d; // L: 1060
			var3.modelOffsetX = var6.offsetX2d; // L: 1061
			var3.modelOffsetY = var6.offsetY2d; // L: 1062
			var3.modelZoom = var6.zoom2d; // L: 1063
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1064
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 1065
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1066
			}

			if (var3.field3781 > 0) { // L: 1067
				var3.modelZoom = var3.modelZoom * 32 / var3.field3781;
			} else if (var3.rawWidth > 0) { // L: 1068
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1069
		}
	}
}
