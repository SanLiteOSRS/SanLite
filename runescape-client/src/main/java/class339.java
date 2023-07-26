import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nf")
public class class339 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)D",
		garbageValue = "-121"
	)
	static double method6629(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D; // L: 29
		if (var3 > 0.0D && var3 < 1.0D) { // L: 30
			double var5;
			double var7;
			switch(var2) { // L: 33
			case 0:
				return var3; // L: 101
			case 1:
				return 1.0D - Math.cos(3.141592653589793D * var3 / 2.0D); // L: 57
			case 2:
				return Math.sin(3.141592653589793D * var3 / 2.0D); // L: 35
			case 3:
				return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D; // L: 66
			case 4:
				return var3 * var3; // L: 97
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3); // L: 86
			case 6:
				return var3 < 0.5D ? var3 * var3 * 2.0D : 1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D) / 2.0D; // L: 105
			case 7:
				return var3 * var3 * var3; // L: 55
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D); // L: 109
			case 9:
				return var3 < 0.5D ? var3 * var3 * 4.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 3.0D) / 2.0D; // L: 107
			case 10:
				return var3 * var3 * var3 * var3; // L: 72
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D); // L: 70
			case 12:
				return var3 < 0.5D ? var3 * var3 * 8.0D * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D; // L: 82
			case 13:
				return var3 * var3 * var3 * var3 * var3; // L: 59
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D); // L: 99
			case 15:
				return var3 < 0.5D ? var3 * var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D; // L: 84
			case 16:
				return Math.pow(2.0D, var3 * 10.0D - 10.0D); // L: 111
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var3); // L: 88
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 10.0D + var3 * 20.0D) / 2.0D : (2.0D - Math.pow(2.0D, 10.0D + var3 * -20.0D)) / 2.0D; // L: 95
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D)); // L: 68
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D)); // L: 103
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D)) + 1.0D) / 2.0D; // L: 74
			case 22:
				var5 = 1.70158D; // L: 50
				var7 = 2.70158D; // L: 51
				return var3 * 2.70158D * var3 * var3 - var3 * 1.70158D * var3; // L: 52
			case 23:
				var5 = 1.70158D; // L: 38
				var7 = 2.70158D; // L: 39
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D); // L: 40
			case 24:
				var5 = 1.70158D; // L: 77
				var7 = 2.5949095D; // L: 78
				return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(2.0D * var3 - 2.0D, 2.0D) * (2.5949095D + (2.0D * var3 - 2.0D) * 3.5949095D) + 2.0D) / 2.0D; // L: 79
			case 25:
				var5 = 2.0943951023931953D; // L: 91
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((var3 * 10.0D - 10.75D) * 2.0943951023931953D); // L: 92
			case 26:
				var5 = 2.0943951023931953D; // L: 62
				return Math.pow(2.0D, -10.0D * var3) * Math.sin(2.0943951023931953D * (10.0D * var3 - 0.75D)) + 1.0D; // L: 63
			case 27:
				var5 = 1.3962634015954636D; // L: 44
				var7 = Math.sin(1.3962634015954636D * (var3 * 20.0D - 11.125D)); // L: 45
				return var3 < 0.5D ? -(Math.pow(2.0D, 20.0D * var3 - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + -20.0D * var3) * var7 / 2.0D + 1.0D; // L: 46
			default:
				return var3; // L: 113
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D; // L: 31
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-626946368"
	)
	static int method6628(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 4015
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4016
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class125.ItemComposition_get(var3).name; // L: 4017
			return 1; // L: 4018
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 4020
				Interpreter.Interpreter_intStackSize -= 2; // L: 4021
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4022
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4023
				var5 = class125.ItemComposition_get(var3); // L: 4024
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 4025
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4026
				}

				return 1; // L: 4027
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 4029
				Interpreter.Interpreter_intStackSize -= 2; // L: 4030
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4031
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4032
				var5 = class125.ItemComposition_get(var3); // L: 4033
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 4034
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4035
				}

				return 1; // L: 4036
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 4038
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4039
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class125.ItemComposition_get(var3).price; // L: 4040
				return 1; // L: 4041
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 4043
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4044
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class125.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 4045
				return 1; // L: 4046
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 4048
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4049
					var4 = class125.ItemComposition_get(var3); // L: 4050
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 4051
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4052
					}

					return 1; // L: 4053
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 4055
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4056
					var4 = class125.ItemComposition_get(var3); // L: 4057
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 4058
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4059
					}

					return 1; // L: 4060
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 4062
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4063
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class125.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 4064
					return 1; // L: 4065
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 4067
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4068
					var4 = class125.ItemComposition_get(var3); // L: 4069
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4070
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4071
					}

					return 1; // L: 4072
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4074
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4075
					var4 = class125.ItemComposition_get(var3); // L: 4076
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4077
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4078
					}

					return 1; // L: 4079
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4081
					String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 4082
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4083
					class146.findItemDefinitions(var7, var6 == 1); // L: 4084
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = JagexCache.foundItemIdCount; // L: 4085
					return 1; // L: 4086
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4088
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4093
						ClanSettings.foundItemIndex = 0; // L: 4094
						return 1; // L: 4095
					} else if (var0 == 4213) { // L: 4097
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4098
						var6 = class125.ItemComposition_get(var3).getShiftClickIndex(); // L: 4099
						if (var6 == -1) { // L: 4100
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 4101
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6 + 1; // L: 4104
						}

						return 1; // L: 4106
					} else if (var0 == 4214) { // L: 4108
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4109
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class125.ItemComposition_get(var3).maleModel; // L: 4110
						return 1; // L: 4111
					} else if (var0 == 4215) { // L: 4113
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4114
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class125.ItemComposition_get(var3).maleModel1; // L: 4115
						return 1; // L: 4116
					} else if (var0 == 4216) { // L: 4118
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4119
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class125.ItemComposition_get(var3).maleModel2; // L: 4120
						return 1; // L: 4121
					} else if (var0 == 4217) { // L: 4123
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4124
						var4 = class125.ItemComposition_get(var3); // L: 4125
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.field2240; // L: 4126
						return 1; // L: 4127
					} else {
						return 2; // L: 4129
					}
				} else {
					if (MouseRecorder.foundItemIds != null && ClanSettings.foundItemIndex < JagexCache.foundItemIdCount) { // L: 4089
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseRecorder.foundItemIds[++ClanSettings.foundItemIndex - 1] & '\uffff'; // L: 4090
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4091
				}
			}
		}
	}
}
