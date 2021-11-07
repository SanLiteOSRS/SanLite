import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cu")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("b")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1808004397
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 86288183
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "461766541"
	)
	@Export("getModel")
	protected final Model getModel() {
		return TaskHandler.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "26741"
	)
	public static boolean method2316(int var0) {
		return (var0 >> 29 & 1) != 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZS)I",
		garbageValue = "32102"
	)
	static int method2309(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = TaskHandler.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				class14.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
				var5 = TaskHandler.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				class14.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
				var5 = TaskHandler.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = TaskHandler.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = TaskHandler.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					var7 = TaskHandler.ItemDefinition_get(var3);
					if (var7.noteTemplate == -1 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					var7 = TaskHandler.ItemDefinition_get(var3);
					if (var7.noteTemplate >= 0 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = TaskHandler.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					var7 = TaskHandler.ItemDefinition_get(var3);
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					var7 = TaskHandler.ItemDefinition_get(var3);
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var6 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					KeyHandler.findItemDefinitions(var6, var4 == 1);
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Skeleton.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						ClanSettings.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var4 = TaskHandler.ItemDefinition_get(var3).getShiftClickIndex();
						if (var4 == -1) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4;
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4 + 1;
						}

						return 1;
					} else {
						return 2;
					}
				} else {
					if (Language.foundItemIds != null && ClanSettings.foundItemIndex < Skeleton.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Language.foundItemIds[++ClanSettings.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-120"
	)
	static final void method2315() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsInFriendsChat();
		}

	}
}
