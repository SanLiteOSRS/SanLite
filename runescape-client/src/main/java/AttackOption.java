import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dc")
@Implements("AttackOption")
public enum AttackOption implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1356(2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1355(4);

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field1351;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1356865323
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12979
	} // L: 12980

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12984
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "-76"
	)
	static int method2672(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 4018
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4019
			Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = InvDefinition.ItemComposition_get(var3).name; // L: 4020
			return 1; // L: 4021
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 4023
				SoundCache.Interpreter_intStackSize -= 2; // L: 4024
				var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4025
				var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4026
				var5 = InvDefinition.ItemComposition_get(var3); // L: 4027
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 4028
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4029
				}

				return 1; // L: 4030
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 4032
				SoundCache.Interpreter_intStackSize -= 2; // L: 4033
				var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4034
				var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4035
				var5 = InvDefinition.ItemComposition_get(var3); // L: 4036
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 4037
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4038
				}

				return 1; // L: 4039
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 4041
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4042
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = InvDefinition.ItemComposition_get(var3).price; // L: 4043
				return 1; // L: 4044
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 4046
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4047
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = InvDefinition.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 4048
				return 1; // L: 4049
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 4051
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4052
					var4 = InvDefinition.ItemComposition_get(var3); // L: 4053
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 4054
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3; // L: 4055
					}

					return 1; // L: 4056
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 4058
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4059
					var4 = InvDefinition.ItemComposition_get(var3); // L: 4060
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 4061
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3; // L: 4062
					}

					return 1; // L: 4063
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 4065
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4066
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = InvDefinition.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 4067
					return 1; // L: 4068
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 4070
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4071
					var4 = InvDefinition.ItemComposition_get(var3); // L: 4072
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4073
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3; // L: 4074
					}

					return 1; // L: 4075
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4077
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4078
					var4 = InvDefinition.ItemComposition_get(var3); // L: 4079
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4080
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3; // L: 4081
					}

					return 1; // L: 4082
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4084
					String var7 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 4085
					var6 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4086
					class161.findItemDefinitions(var7, var6 == 1); // L: 4087
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = KeyHandler.foundItemIdCount; // L: 4088
					return 1; // L: 4089
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4091
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4096
						class372.foundItemIndex = 0; // L: 4097
						return 1; // L: 4098
					} else if (var0 == 4213) { // L: 4100
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4101
						var6 = InvDefinition.ItemComposition_get(var3).getShiftClickIndex(); // L: 4102
						if (var6 == -1) { // L: 4103
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var6; // L: 4104
						} else {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var6 + 1; // L: 4107
						}

						return 1; // L: 4109
					} else if (var0 == 4214) { // L: 4111
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4112
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = InvDefinition.ItemComposition_get(var3).maleModel; // L: 4113
						return 1; // L: 4114
					} else if (var0 == 4215) { // L: 4116
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4117
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = InvDefinition.ItemComposition_get(var3).maleModel1; // L: 4118
						return 1; // L: 4119
					} else if (var0 == 4216) { // L: 4121
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4122
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = InvDefinition.ItemComposition_get(var3).maleModel2; // L: 4123
						return 1; // L: 4124
					} else if (var0 == 4217) { // L: 4126
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4127
						var4 = InvDefinition.ItemComposition_get(var3); // L: 4128
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.field2235; // L: 4129
						return 1; // L: 4130
					} else {
						return 2; // L: 4132
					}
				} else {
					if (class156.foundItemIds != null && class372.foundItemIndex < KeyHandler.foundItemIdCount) { // L: 4092
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class156.foundItemIds[++class372.foundItemIndex - 1] & '\uffff'; // L: 4093
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4094
				}
			}
		}
	}
}
