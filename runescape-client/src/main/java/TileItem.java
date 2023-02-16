import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1625083761
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -921940105
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1195842737
	)
	int field1323;

	TileItem() {
		this.field1323 = 31; // L: 11
	} // L: 13

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-138937291"
	)
	void method2723(int var1) {
		this.field1323 = var1; // L: 16
	} // L: 17

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhs;",
		garbageValue = "922199662"
	)
	@Export("getModel")
	protected final Model getModel() {
		return ItemComposition_get(this.id).getModel(this.quantity); // L: 27
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "27915480"
	)
	boolean method2712(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 20
			return (this.field1323 & 1 << var1) != 0; // L: 21
		} else {
			return true; // L: 23
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgr;",
		garbageValue = "37"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 88
		if (var1 != null) { // L: 89
			return var1;
		} else {
			byte[] var2 = class4.ItemComposition_archive.takeFile(10, var0); // L: 90
			var1 = new ItemComposition(); // L: 91
			var1.id = var0; // L: 92
			if (var2 != null) { // L: 93
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 94
			if (var1.noteTemplate != -1) { // L: 95
				var1.genCert(ItemComposition_get(var1.noteTemplate), ItemComposition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 96
				var1.genBought(ItemComposition_get(var1.notedId), ItemComposition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 97
				var1.genPlaceholder(ItemComposition_get(var1.placeholderTemplate), ItemComposition_get(var1.placeholder));
			}

			if (!ItemComposition.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 98
				var1.name = "Members object"; // L: 99
				var1.isTradable = false; // L: 100

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 101
					var1.groundActions[var3] = null; // L: 102
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 104
					if (var3 != 4) { // L: 105
						var1.inventoryActions[var3] = null; // L: 106
					}
				}

				var1.shiftClickIndex = -2; // L: 109
				var1.team = 0; // L: 110
				if (var1.params != null) { // L: 111
					boolean var6 = false; // L: 112

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 113
						ParamComposition var5 = ClanChannelMember.getParamDefinition((int)var4.key); // L: 114
						if (var5.autoDisable) { // L: 115
							var4.remove();
						} else {
							var6 = true; // L: 116
						}
					}

					if (!var6) {
						var1.params = null; // L: 118
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 121
			return var1; // L: 122
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lbw;",
		garbageValue = "-702923171"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class88.World_worlds[++World.World_listCount - 1] : null; // L: 252 253
	}
}
