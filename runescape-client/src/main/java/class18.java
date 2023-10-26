import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ai")
public class class18 {
	@ObfuscatedName("ac")
	Future field98;
	@ObfuscatedName("al")
	String field99;

	class18(Future var1) {
		this.field98 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method268(var1); // L: 14
	} // L: 15

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-979667658"
	)
	void method268(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field99 = var1; // L: 19
		if (this.field98 != null) { // L: 20
			this.field98.cancel(true); // L: 21
			this.field98 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1635207847"
	)
	public final String method269() {
		return this.field99; // L: 27
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method270() {
		return this.field99 != null || this.field98 == null; // L: 31
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1984525165"
	)
	public final boolean method279() {
		return this.method270() ? true : this.field98.isDone(); // L: 35 36
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Law;",
		garbageValue = "374790018"
	)
	public final class20 method272() {
		if (this.method270()) { // L: 40
			return new class20(this.field99);
		} else if (!this.method279()) {
			return null; // L: 41
		} else {
			try {
				return (class20)this.field98.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method268(var2); // L: 48
				return new class20(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "475812037"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 212
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 213
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 214
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 215
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 216
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 217
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 218
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 219
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 220 221
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnm;II)V",
		garbageValue = "913707510"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3752 == null) { // L: 1248
			throw new RuntimeException(); // L: 1249
		} else {
			if (var0.field3689 == null) { // L: 1251
				var0.field3689 = new int[var0.field3752.length]; // L: 1252
			}

			var0.field3689[var1] = Integer.MAX_VALUE; // L: 1254
		}
	} // L: 1255

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "601237968"
	)
	static int method278(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 4029
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4030
			Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class214.ItemComposition_get(var3).name; // L: 4031
			return 1; // L: 4032
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 4034
				Interpreter.Interpreter_intStackSize -= 2; // L: 4035
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4036
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4037
				var5 = class214.ItemComposition_get(var3); // L: 4038
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 4039
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4040
				}

				return 1; // L: 4041
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 4043
				Interpreter.Interpreter_intStackSize -= 2; // L: 4044
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4045
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4046
				var5 = class214.ItemComposition_get(var3); // L: 4047
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 4048
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4049
				}

				return 1; // L: 4050
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 4052
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4053
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).price; // L: 4054
				return 1; // L: 4055
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 4057
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4058
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 4059
				return 1; // L: 4060
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 4062
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4063
					var4 = class214.ItemComposition_get(var3); // L: 4064
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 4065
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4066
					}

					return 1; // L: 4067
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 4069
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4070
					var4 = class214.ItemComposition_get(var3); // L: 4071
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 4072
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4073
					}

					return 1; // L: 4074
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 4076
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4077
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 4078
					return 1; // L: 4079
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 4081
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4082
					var4 = class214.ItemComposition_get(var3); // L: 4083
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4084
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4085
					}

					return 1; // L: 4086
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4088
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4089
					var4 = class214.ItemComposition_get(var3); // L: 4090
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4091
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4092
					}

					return 1; // L: 4093
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4095
					String var7 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 4096
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4097
					FileSystem.findItemDefinitions(var7, var6 == 1); // L: 4098
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SoundSystem.foundItemIdCount; // L: 4099
					return 1; // L: 4100
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4102
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4107
						class317.foundItemIndex = 0; // L: 4108
						return 1; // L: 4109
					} else if (var0 == 4213) { // L: 4111
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4112
						var6 = class214.ItemComposition_get(var3).getShiftClickIndex(); // L: 4113
						if (var6 == -1) { // L: 4114
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 4115
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6 + 1; // L: 4118
						}

						return 1; // L: 4120
					} else if (var0 == 4214) { // L: 4122
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4123
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).maleModel; // L: 4124
						return 1; // L: 4125
					} else if (var0 == 4215) { // L: 4127
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4128
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).maleModel1; // L: 4129
						return 1; // L: 4130
					} else if (var0 == 4216) { // L: 4132
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4133
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).maleModel2; // L: 4134
						return 1; // L: 4135
					} else if (var0 == 4217) { // L: 4137
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4138
						var4 = class214.ItemComposition_get(var3); // L: 4139
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.field2292; // L: 4140
						return 1; // L: 4141
					} else {
						return 2; // L: 4143
					}
				} else {
					if (class138.foundItemIds != null && class317.foundItemIndex < SoundSystem.foundItemIdCount) { // L: 4103
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class138.foundItemIds[++class317.foundItemIndex - 1] & '\uffff'; // L: 4104
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4105
				}
			}
		}
	}
}
