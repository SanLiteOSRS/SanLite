import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("ParamComposition_cached")
	static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("ac")
	@Export("type")
	char type;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -58366445
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("an")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ao")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1889600271"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 31

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-1831159851"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.decodeNext(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsy;IB)V",
		garbageValue = "42"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			this.type = WorldMapRegion.method5007(var1.readByte()); // L: 43
		} else if (var2 == 2) { // L: 45
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false; // L: 46
		} else if (var2 == 5) { // L: 47
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 49

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "102"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 52
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IS)Lhh;",
		garbageValue = "-6691"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 88
		if (var1 != null) { // L: 89
			return var1;
		} else {
			byte[] var2 = class290.ItemComposition_archive.takeFile(10, var0); // L: 90
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

			if (!VarcInt.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 98
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
						ParamComposition var5 = class153.getParamDefinition((int)var4.key); // L: 114
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldv;",
		garbageValue = "-1627747805"
	)
	static class88[] method3791() {
		return new class88[]{class88.field1077, class88.field1081, class88.field1080, class88.field1078, class88.field1082, class88.field1083}; // L: 17
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)I",
		garbageValue = "-2088637092"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex); // L: 12070
		return var1 != null ? var1.integer : var0.flags; // L: 12071 12072
	}
}
