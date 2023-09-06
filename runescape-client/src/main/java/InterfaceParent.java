import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ds")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2086760251
	)
	@Export("group")
	int group;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2035314843
	)
	@Export("type")
	int type;
	@ObfuscatedName("ao")
	boolean field1081;

	InterfaceParent() {
		this.field1081 = false; // L: 8
	} // L: 10

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1893248685"
	)
	public static int method2279(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 25
			int var6 = var3; // L: 26
			var3 = var4; // L: 27
			var4 = var6; // L: 28
		}

		var2 &= 3; // L: 30
		if (var2 == 0) { // L: 31
			return var1;
		} else if (var2 == 1) { // L: 32
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 33
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-612957518"
	)
	static int method2277(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1004
			var0 -= 1000; // L: 1005
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1006
		} else {
			var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 1008
		}

		class218.invalidateWidget(var3); // L: 1009
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1010
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1030
				var3.modelType = 2; // L: 1031
				var3.modelId = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1032
				return 1; // L: 1033
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1035
				var3.modelType = 3; // L: 1036
				var3.modelId = VarbitComposition.localPlayer.appearance.getChatHeadId(); // L: 1037
				return 1; // L: 1038
			} else if (var0 == 1207) { // L: 1040
				boolean var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 1041
				class160.method3278(var3, VarbitComposition.localPlayer.appearance, var7); // L: 1042
				return 1; // L: 1043
			} else if (var0 == 1208) { // L: 1045
				var4 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1046
				if (var3.field3704 == null) { // L: 1047
					throw new RuntimeException(""); // L: 1048
				} else {
					ReflectionCheck.method710(var3, var4); // L: 1050
					return 1; // L: 1051
				}
			} else if (var0 == 1209) { // L: 1053
				SoundCache.Interpreter_intStackSize -= 2; // L: 1054
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 1055
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 1056
				if (var3.field3704 == null) { // L: 1057
					throw new RuntimeException(""); // L: 1058
				} else {
					Tiles.method2242(var3, var4, var5); // L: 1060
					return 1; // L: 1061
				}
			} else if (var0 == 1210) { // L: 1063
				var4 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1064
				if (var3.field3704 == null) { // L: 1065
					throw new RuntimeException(""); // L: 1066
				} else {
					class135.method3052(var3, VarbitComposition.localPlayer.appearance.field3572, var4); // L: 1068
					return 1; // L: 1069
				}
			} else {
				return 2; // L: 1071
			}
		} else {
			SoundCache.Interpreter_intStackSize -= 2; // L: 1011
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 1012
			var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 1013
			var3.itemId = var4; // L: 1014
			var3.itemQuantity = var5; // L: 1015
			ItemComposition var6 = InvDefinition.ItemComposition_get(var4); // L: 1016
			var3.modelAngleX = var6.xan2d; // L: 1017
			var3.modelAngleY = var6.yan2d; // L: 1018
			var3.modelAngleZ = var6.zan2d; // L: 1019
			var3.modelOffsetX = var6.offsetX2d; // L: 1020
			var3.modelOffsetY = var6.offsetY2d; // L: 1021
			var3.modelZoom = var6.zoom2d; // L: 1022
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1023
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 1024
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1025
			}

			if (var3.field3702 > 0) { // L: 1026
				var3.modelZoom = var3.modelZoom * 32 / var3.field3702;
			} else if (var3.rawWidth > 0) { // L: 1027
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1028
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "-104"
	)
	static int method2276(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 5115
			boolean var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 5116
			SecureRandomFuture.method2151(var3); // L: 5117
			return 1; // L: 5118
		} else {
			return 2; // L: 5120
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	static void method2278() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 5055
			class92.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 5056
		}

	} // L: 5058
}
