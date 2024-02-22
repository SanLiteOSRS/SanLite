import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ix")
public class class218 extends class224 {
	@ObfuscatedName("aq")
	String field2356;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lit;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class218(class221 var1, String var2, String var3) {
		super(var1, var2); // L: 314
		this.this$0 = var1; // L: 313
		this.field2356 = var3; // L: 315
	} // L: 316

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2105911105"
	)
	public int vmethod4366() {
		return 1; // L: 319
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public String vmethod4367() {
		return this.field2356; // L: 324
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Laa;I)Lai;",
		garbageValue = "2106914703"
	)
	public static class3 method4251(class6 var0) {
		switch(var0.field10) { // L: 9
		case 0:
			return new class0(); // L: 12
		default:
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1932952799"
	)
	static int method4260(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Lfm;",
		garbageValue = "1672829103"
	)
	static class141 method4258(int var0) {
		class141 var1 = (class141)class356.findEnumerated(class4.method20(), var0); // L: 110
		if (var1 == null) {
			var1 = class141.field1649; // L: 111
		}

		return var1; // L: 112
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "84"
	)
	static int method4259(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 4064
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4065
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ArchiveDiskActionHandler.ItemComposition_get(var3).name; // L: 4066
			return 1; // L: 4067
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 4069
				Interpreter.Interpreter_intStackSize -= 2; // L: 4070
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4071
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4072
				var5 = ArchiveDiskActionHandler.ItemComposition_get(var3); // L: 4073
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 4074
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 4075
				}

				return 1; // L: 4076
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 4078
				Interpreter.Interpreter_intStackSize -= 2; // L: 4079
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4080
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4081
				var5 = ArchiveDiskActionHandler.ItemComposition_get(var3); // L: 4082
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 4083
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 4084
				}

				return 1; // L: 4085
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 4087
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4088
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemComposition_get(var3).price; // L: 4089
				return 1; // L: 4090
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 4092
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4093
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 4094
				return 1; // L: 4095
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 4097
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4098
					var4 = ArchiveDiskActionHandler.ItemComposition_get(var3); // L: 4099
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 4100
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4101
					}

					return 1; // L: 4102
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 4104
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4105
					var4 = ArchiveDiskActionHandler.ItemComposition_get(var3); // L: 4106
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 4107
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4108
					}

					return 1; // L: 4109
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 4111
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4112
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 4113
					return 1; // L: 4114
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 4116
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4117
					var4 = ArchiveDiskActionHandler.ItemComposition_get(var3); // L: 4118
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4119
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4120
					}

					return 1; // L: 4121
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4123
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4124
					var4 = ArchiveDiskActionHandler.ItemComposition_get(var3); // L: 4125
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4126
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4127
					}

					return 1; // L: 4128
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4130
					String var7 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 4131
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4132
					WorldMapID.findItemDefinitions(var7, var6 == 1); // L: 4133
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class207.foundItemIdCount; // L: 4134
					return 1; // L: 4135
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4137
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4142
						GameObject.foundItemIndex = 0; // L: 4143
						return 1; // L: 4144
					} else if (var0 == 4213) { // L: 4146
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4147
						var6 = ArchiveDiskActionHandler.ItemComposition_get(var3).getShiftClickIndex(); // L: 4148
						if (var6 == -1) { // L: 4149
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 4150
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6 + 1; // L: 4153
						}

						return 1; // L: 4155
					} else if (var0 == 4214) { // L: 4157
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4158
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemComposition_get(var3).maleModel; // L: 4159
						return 1; // L: 4160
					} else if (var0 == 4215) { // L: 4162
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4163
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemComposition_get(var3).maleModel1; // L: 4164
						return 1; // L: 4165
					} else if (var0 == 4216) { // L: 4167
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4168
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemComposition_get(var3).maleModel2; // L: 4169
						return 1; // L: 4170
					} else if (var0 == 4217) { // L: 4172
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4173
						var4 = ArchiveDiskActionHandler.ItemComposition_get(var3); // L: 4174
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.field2210; // L: 4175
						return 1; // L: 4176
					} else {
						return 2; // L: 4178
					}
				} else {
					if (class73.foundItemIds != null && GameObject.foundItemIndex < class207.foundItemIdCount) { // L: 4138
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class73.foundItemIds[++GameObject.foundItemIndex - 1] & '\uffff'; // L: 4139
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4140
				}
			}
		}
	}
}
