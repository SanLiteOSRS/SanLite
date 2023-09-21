import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cl")
public class class76 {
	@ObfuscatedName("ac")
	static final BigInteger field921;
	@ObfuscatedName("al")
	static final BigInteger field922;

	static {
		field921 = new BigInteger("10001", 16); // L: 6
		field922 = new BigInteger("cc90697b065845f69ec9f317c5c2120b275cdf1e7dbc83f9bd6f48b14bc9225b7400ccc4d6942e14ada8e923e99c75bfa6f001f0a92bdbf435c59a0e86120e2526ebdc45626349cbc249b24e878b5eb1a2ff432b56dafa8eb5a6282883286733f87bdb2e843f8848ec651045f7295208ea0627602d4352099e730d2b57905e95", 16); // L: 7
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1393359399"
	)
	static void method2123(int var0) {
		class465.field4784 = var0; // L: 21
		class465.field4783 = new class465[var0]; // L: 22
		class465.field4781 = 0; // L: 23
	} // L: 24

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1583079321"
	)
	public static int method2124(int var0) {
		return class317.field3416[var0]; // L: 51
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "0"
	)
	static int method2125(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1015
			var0 -= 1000; // L: 1016
			var3 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1017
		} else {
			var3 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 1019
		}

		ClanChannelMember.invalidateWidget(var3); // L: 1020
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1021
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1041
				var3.modelType = 2; // L: 1042
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1043
				return 1; // L: 1044
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1046
				var3.modelType = 3; // L: 1047
				var3.modelId = TextureProvider.localPlayer.appearance.getChatHeadId(); // L: 1048
				return 1; // L: 1049
			} else if (var0 == 1207) { // L: 1051
				boolean var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1052
				class366.method6820(var3, TextureProvider.localPlayer.appearance, var7); // L: 1053
				return 1; // L: 1054
			} else if (var0 == 1208) { // L: 1056
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1057
				if (var3.field3734 == null) { // L: 1058
					throw new RuntimeException(""); // L: 1059
				} else {
					class309.method5870(var3, var4); // L: 1061
					return 1; // L: 1062
				}
			} else if (var0 == 1209) { // L: 1064
				Interpreter.Interpreter_intStackSize -= 2; // L: 1065
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1066
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1067
				if (var3.field3734 == null) { // L: 1068
					throw new RuntimeException(""); // L: 1069
				} else {
					UrlRequest.method2875(var3, var4, var5); // L: 1071
					return 1; // L: 1072
				}
			} else if (var0 == 1210) { // L: 1074
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1075
				if (var3.field3734 == null) { // L: 1076
					throw new RuntimeException(""); // L: 1077
				} else {
					UrlRequester.method2842(var3, TextureProvider.localPlayer.appearance.field3611, var4); // L: 1079
					return 1; // L: 1080
				}
			} else {
				return 2; // L: 1082
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1022
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1023
			var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1024
			var3.itemId = var4; // L: 1025
			var3.itemQuantity = var5; // L: 1026
			ItemComposition var6 = class214.ItemComposition_get(var4); // L: 1027
			var3.modelAngleX = var6.xan2d; // L: 1028
			var3.modelAngleY = var6.yan2d; // L: 1029
			var3.modelAngleZ = var6.zan2d; // L: 1030
			var3.modelOffsetX = var6.offsetX2d; // L: 1031
			var3.modelOffsetY = var6.offsetY2d; // L: 1032
			var3.modelZoom = var6.zoom2d; // L: 1033
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1034
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 1035
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1036
			}

			if (var3.field3732 > 0) { // L: 1037
				var3.modelZoom = var3.modelZoom * 32 / var3.field3732;
			} else if (var3.rawWidth > 0) { // L: 1038
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1039
		}
	}
}
