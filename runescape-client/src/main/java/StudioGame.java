import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ic")
@Implements("StudioGame")
public enum StudioGame implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1725294085
	)
	public static int field3135;
	@ObfuscatedName("n")
	@Export("name")
	public final String name;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1088922919
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1020902177"
	)
	public static void method4185() {
		ParamComposition.ParamDefinition_cached.clear();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "211481230"
	)
	static int method4186(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				VarcInt.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
				var5 = SecureRandomCallable.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				VarcInt.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
				var5 = SecureRandomCallable.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var6;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					var6 = SecureRandomCallable.ItemDefinition_get(var3);
					if (var6.noteTemplate == -1 && var6.note >= 0) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.note;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					var6 = SecureRandomCallable.ItemDefinition_get(var3);
					if (var6.noteTemplate >= 0 && var6.note >= 0) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.note;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					var6 = SecureRandomCallable.ItemDefinition_get(var3);
					if (var6.placeholderTemplate == -1 && var6.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					var6 = SecureRandomCallable.ItemDefinition_get(var3);
					if (var6.placeholderTemplate >= 0 && var6.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					WorldMapSection1.findItemDefinitions(var7, var4 == 1);
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = PacketBufferNode.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						NetCache.foundItemIndex = 0;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (UrlRequest.foundItemIds != null && NetCache.foundItemIndex < PacketBufferNode.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = UrlRequest.foundItemIds[++NetCache.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		signature = "(Lhe;B)Ljava/lang/String;",
		garbageValue = "-113"
	)
	static String method4183(Widget var0) {
		if (ServerPacket.method3667(FaceNormal.getWidgetClickMask(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
