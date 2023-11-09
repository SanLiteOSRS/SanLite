import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	field1284(2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	field1287(4);

	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1845683863
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12305
	} // L: 12306

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12310
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldt;",
		garbageValue = "-38"
	)
	static class119[] method2359() {
		return new class119[]{class119.field1488, class119.field1490, class119.field1468, class119.field1471, class119.field1472, class119.field1473, class119.field1474, class119.field1475, class119.field1476, class119.field1477, class119.field1478, class119.field1482, class119.field1479, class119.field1481, class119.field1470, class119.field1483, class119.field1480}; // L: 64
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgb;",
		garbageValue = "-16"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 92
		if (var1 != null) { // L: 93
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemComposition_archive.takeFile(10, var0); // L: 94
			var1 = new ItemComposition(); // L: 95
			var1.id = var0; // L: 96
			if (var2 != null) { // L: 97
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 98
			if (var1.noteTemplate != -1) { // L: 99
				var1.genCert(ItemComposition_get(var1.noteTemplate), ItemComposition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 100
				var1.genBought(ItemComposition_get(var1.notedId), ItemComposition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 101
				var1.genPlaceholder(ItemComposition_get(var1.placeholderTemplate), ItemComposition_get(var1.placeholder));
			}

			if (!InterfaceParent.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 102
				var1.name = "Members object"; // L: 103
				var1.isTradable = false; // L: 104

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 105
					var1.groundActions[var3] = null; // L: 106
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 108
					if (var3 != 4) { // L: 109
						var1.inventoryActions[var3] = null; // L: 110
					}
				}

				var1.shiftClickIndex = -2; // L: 113
				var1.team = 0; // L: 114
				if (var1.params != null) { // L: 115
					boolean var6 = false; // L: 116

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 117
						ParamComposition var5 = DesktopPlatformInfoProvider.getParamDefinition((int)var4.key); // L: 118
						if (var5.autoDisable) { // L: 119
							var4.remove();
						} else {
							var6 = true; // L: 120
						}
					}

					if (!var6) {
						var1.params = null; // L: 122
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 125
			return var1; // L: 126
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lkn;S)I",
		garbageValue = "128"
	)
	static int method2360(Widget var0) {
		if (var0.type != 11) { // L: 1249
			Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 1250
			return 1; // L: 1251
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 1253
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var0.method5553(var1); // L: 1254
			return 1; // L: 1255
		}
	}
}
