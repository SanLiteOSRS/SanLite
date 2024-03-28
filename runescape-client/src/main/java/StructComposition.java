import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ic")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-773989151"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-1881267204"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 33
			if (var2 == 0) { // L: 34
				return; // L: 37
			}

			this.decodeNext(var1, var2); // L: 35
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-1202559377"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = SecureRandomFuture.readStringIntParameters(var1, this.params); // L: 40
		}

	} // L: 42

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1873696311"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class220.method4074(this.params, var1, var2); // L: 45
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1598806128"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class27.method400(this.params, var1, var2); // L: 49
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1466896003"
	)
	static int method4035(int var0, int var1) {
		if (var0 == -2) { // L: 15
			return 12345678;
		} else if (var0 == -1) { // L: 16
			if (var1 < 0) { // L: 17
				var1 = 0;
			} else if (var1 > 127) { // L: 20
				var1 = 127; // L: 21
			}

			var1 = 127 - var1; // L: 23
			return var1; // L: 24
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 26
			if (var1 < 2) { // L: 27
				var1 = 2;
			} else if (var1 > 126) { // L: 28
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 29
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1954977689"
	)
	public static int method4042(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public static void method4041() {
		synchronized(ArchiveDiskActionHandler.field4365) { // L: 114
			if (ArchiveDiskActionHandler.field4360 != 0) { // L: 115
				ArchiveDiskActionHandler.field4360 = 1; // L: 116
				ArchiveDiskActionHandler.field4358 = true; // L: 117

				try {
					ArchiveDiskActionHandler.field4365.wait(); // L: 119
				} catch (InterruptedException var3) { // L: 121
				}
			}

		}
	} // L: 124

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZS)I",
		garbageValue = "-20558"
	)
	static int method4031(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 4070
			var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4071
			Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = class10.ItemComposition_get(var3).name; // L: 4072
			return 1; // L: 4073
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 4075
				class19.Interpreter_intStackSize -= 2; // L: 4076
				var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4077
				var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4078
				var5 = class10.ItemComposition_get(var3); // L: 4079
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 4080
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4081
				}

				return 1; // L: 4082
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 4084
				class19.Interpreter_intStackSize -= 2; // L: 4085
				var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4086
				var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4087
				var5 = class10.ItemComposition_get(var3); // L: 4088
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 4089
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4090
				}

				return 1; // L: 4091
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 4093
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4094
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class10.ItemComposition_get(var3).price; // L: 4095
				return 1; // L: 4096
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 4098
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4099
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class10.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 4100
				return 1; // L: 4101
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 4103
					var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4104
					var4 = class10.ItemComposition_get(var3); // L: 4105
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 4106
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3; // L: 4107
					}

					return 1; // L: 4108
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 4110
					var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4111
					var4 = class10.ItemComposition_get(var3); // L: 4112
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 4113
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3; // L: 4114
					}

					return 1; // L: 4115
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 4117
					var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4118
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class10.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 4119
					return 1; // L: 4120
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 4122
					var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4123
					var4 = class10.ItemComposition_get(var3); // L: 4124
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4125
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3; // L: 4126
					}

					return 1; // L: 4127
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4129
					var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4130
					var4 = class10.ItemComposition_get(var3); // L: 4131
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4132
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3; // L: 4133
					}

					return 1; // L: 4134
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4136
					String var7 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4137
					var6 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4138
					ArchiveDiskActionHandler.findItemDefinitions(var7, var6 == 1); // L: 4139
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = ReflectionCheck.foundItemIdCount; // L: 4140
					return 1; // L: 4141
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4143
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4148
						class333.foundItemIndex = 0; // L: 4149
						return 1; // L: 4150
					} else if (var0 == 4213) { // L: 4152
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4153
						var6 = class10.ItemComposition_get(var3).getShiftClickIndex(); // L: 4154
						if (var6 == -1) { // L: 4155
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var6; // L: 4156
						} else {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var6 + 1; // L: 4159
						}

						return 1; // L: 4161
					} else if (var0 == 4214) { // L: 4163
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4164
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class10.ItemComposition_get(var3).maleModel; // L: 4165
						return 1; // L: 4166
					} else if (var0 == 4215) { // L: 4168
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4169
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class10.ItemComposition_get(var3).maleModel1; // L: 4170
						return 1; // L: 4171
					} else if (var0 == 4216) { // L: 4173
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4174
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class10.ItemComposition_get(var3).field2326; // L: 4175
						return 1; // L: 4176
					} else if (var0 == 4217) { // L: 4178
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4179
						var4 = class10.ItemComposition_get(var3); // L: 4180
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.field2325; // L: 4181
						return 1; // L: 4182
					} else if (var0 == 4218) { // L: 4184
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4185
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = class10.ItemComposition_get(var3).field2334; // L: 4186
						return 1; // L: 4187
					} else {
						return 2; // L: 4189
					}
				} else {
					if (class59.foundItemIds != null && class333.foundItemIndex < ReflectionCheck.foundItemIdCount) { // L: 4144
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class59.foundItemIds[++class333.foundItemIndex - 1] & '\uffff'; // L: 4145
					} else {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4146
				}
			}
		}
	}
}
