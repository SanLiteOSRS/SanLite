import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ij")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = -352309529
	)
	static int field2360;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1383397639
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1293075401
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -631269217
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 2797168509688990323L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -302273965
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1889722857"
	)
	static final int method4162(int var0, int var1) {
		int var2 = Varcs.method2717(45365 + var0, 91923 + var1, 4) - 128 + (Varcs.method2717(var0 + 10294, 37821 + var1, 2) - 128 >> 1) + (Varcs.method2717(var0, var1, 1) - 128 >> 2); // L: 935
		var2 = (int)((double)var2 * 0.3D) + 35; // L: 936
		if (var2 < 10) { // L: 937
			var2 = 10;
		} else if (var2 > 60) { // L: 938
			var2 = 60;
		}

		return var2; // L: 939
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "15567612"
	)
	static int method4161(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3946
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3947
			Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ParamComposition.ItemComposition_get(var3).name; // L: 3948
			return 1; // L: 3949
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3951
				Interpreter.Interpreter_intStackSize -= 2; // L: 3952
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3953
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3954
				var5 = ParamComposition.ItemComposition_get(var3); // L: 3955
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 3956
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 3957
				}

				return 1; // L: 3958
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3960
				Interpreter.Interpreter_intStackSize -= 2; // L: 3961
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3962
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3963
				var5 = ParamComposition.ItemComposition_get(var3); // L: 3964
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 3965
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 3966
				}

				return 1; // L: 3967
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3969
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3970
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ParamComposition.ItemComposition_get(var3).price; // L: 3971
				return 1; // L: 3972
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3974
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3975
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ParamComposition.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 3976
				return 1; // L: 3977
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3979
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3980
					var4 = ParamComposition.ItemComposition_get(var3); // L: 3981
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 3982
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3983
					}

					return 1; // L: 3984
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3986
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3987
					var4 = ParamComposition.ItemComposition_get(var3); // L: 3988
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 3989
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3990
					}

					return 1; // L: 3991
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3993
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3994
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ParamComposition.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 3995
					return 1; // L: 3996
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3998
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3999
					var4 = ParamComposition.ItemComposition_get(var3); // L: 4000
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4001
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4002
					}

					return 1; // L: 4003
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4005
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4006
					var4 = ParamComposition.ItemComposition_get(var3); // L: 4007
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4008
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4009
					}

					return 1; // L: 4010
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4012
					String var7 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 4013
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4014
					PendingSpawn.findItemDefinitions(var7, var6 == 1); // L: 4015
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class323.foundItemIdCount; // L: 4016
					return 1; // L: 4017
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4019
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4024
						class173.foundItemIndex = 0; // L: 4025
						return 1; // L: 4026
					} else if (var0 == 4213) { // L: 4028
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4029
						var6 = ParamComposition.ItemComposition_get(var3).getShiftClickIndex(); // L: 4030
						if (var6 == -1) { // L: 4031
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 4032
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6 + 1; // L: 4035
						}

						return 1; // L: 4037
					} else if (var0 == 4214) { // L: 4039
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4040
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ParamComposition.ItemComposition_get(var3).maleModel; // L: 4041
						return 1; // L: 4042
					} else if (var0 == 4215) { // L: 4044
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4045
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ParamComposition.ItemComposition_get(var3).maleModel1; // L: 4046
						return 1; // L: 4047
					} else if (var0 == 4216) { // L: 4049
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4050
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ParamComposition.ItemComposition_get(var3).maleModel2; // L: 4051
						return 1; // L: 4052
					} else if (var0 == 4217) { // L: 4054
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4055
						var4 = ParamComposition.ItemComposition_get(var3); // L: 4056
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.field2227; // L: 4057
						return 1; // L: 4058
					} else {
						return 2; // L: 4060
					}
				} else {
					if (GrandExchangeEvents.foundItemIds != null && class173.foundItemIndex < class323.foundItemIdCount) { // L: 4020
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeEvents.foundItemIds[++class173.foundItemIndex - 1] & '\uffff'; // L: 4021
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4022
				}
			}
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	static boolean method4160() {
		return (Client.drawPlayerNames & 2) != 0; // L: 5009
	}
}
