import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ip")
public class class239 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lip;"
	)
	static final class239 field2869;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lip;"
	)
	static final class239 field2867;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -424452145
	)
	final int field2868;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -814810489
	)
	final int field2870;

	static {
		field2869 = new class239(51, 27, 800, 0, 16, 16);
		field2867 = new class239(25, 28, 800, 656, 40, 40);
	}

	class239(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field2868 = var5;
		this.field2870 = var6;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1990766165"
	)
	public static String method4384(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = Messages.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "-1329941723"
	)
	static int method4385(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class23.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				class16.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
				var5 = class23.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				class16.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
				var5 = class23.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class23.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class23.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var6;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					var6 = class23.ItemDefinition_get(var3);
					if (var6.noteTemplate == -1 && var6.note >= 0) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var6.note;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					var6 = class23.ItemDefinition_get(var3);
					if (var6.noteTemplate >= 0 && var6.note >= 0) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var6.note;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class23.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					var6 = class23.ItemDefinition_get(var3);
					if (var6.placeholderTemplate == -1 && var6.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var6.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					var6 = class23.ItemDefinition_get(var3);
					if (var6.placeholderTemplate >= 0 && var6.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var6.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					WorldMapAreaData.findItemDefinitions(var7, var4 == 1);
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ItemLayer.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						class203.foundItemIndex = 0;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class19.foundItemIds != null && class203.foundItemIndex < ItemLayer.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.foundItemIds[++class203.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
