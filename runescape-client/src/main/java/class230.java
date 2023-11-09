import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public class class230 {
	@ObfuscatedName("hb")
	static int[] field2614;
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 840268625
	)
	int field2622;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 179185367
	)
	int field2620;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2015971899
	)
	int field2613;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -98383431
	)
	int field2616;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1384445201
	)
	int field2615;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1152671771
	)
	int field2611;

	class230(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field2622 = var1; // L: 12
		this.field2620 = var2; // L: 13
		this.field2613 = var3; // L: 14
		this.field2616 = var4; // L: 15
		this.field2615 = var5; // L: 16
		this.field2611 = var6; // L: 17
	} // L: 18

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhj;",
		garbageValue = "1"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 90
		if (var1 != null) { // L: 91
			return var1;
		} else {
			byte[] var2 = Calendar.ItemComposition_archive.takeFile(10, var0); // L: 92
			var1 = new ItemComposition(); // L: 93
			var1.id = var0; // L: 94
			if (var2 != null) { // L: 95
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 96
			if (var1.noteTemplate != -1) { // L: 97
				var1.genCert(ItemComposition_get(var1.noteTemplate), ItemComposition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 98
				var1.genBought(ItemComposition_get(var1.notedId), ItemComposition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 99
				var1.genPlaceholder(ItemComposition_get(var1.placeholderTemplate), ItemComposition_get(var1.placeholder));
			}

			if (!class148.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 100
				var1.name = var1.name + " (Members)"; // L: 101
				var1.isTradable = false; // L: 102

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 103
					var1.groundActions[var3] = null; // L: 104
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 106
					if (var3 != 4) { // L: 107
						var1.inventoryActions[var3] = null; // L: 108
					}
				}

				var1.shiftClickIndex = -2; // L: 111
				var1.team = 0; // L: 112
				if (var1.params != null) { // L: 113
					boolean var6 = false; // L: 114

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 115
						ParamComposition var5 = UserComparator9.getParamDefinition((int)var4.key); // L: 116
						if (var5.autoDisable) { // L: 117
							var4.remove();
						} else {
							var6 = true; // L: 118
						}
					}

					if (!var6) { // L: 120
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 123
			return var1; // L: 124
		}
	}
}
