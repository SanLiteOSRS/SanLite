import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class125 {
	@ObfuscatedName("ab")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 697776475
	)
	int field1483;
	@ObfuscatedName("ay")
	float field1488;
	@ObfuscatedName("ar")
	float field1484;
	@ObfuscatedName("am")
	float field1482;
	@ObfuscatedName("as")
	float field1486;
	@ObfuscatedName("aj")
	float field1487;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	class125 field1485;

	class125() {
		this.field1484 = Float.MAX_VALUE; // L: 8
		this.field1482 = Float.MAX_VALUE; // L: 9
		this.field1486 = Float.MAX_VALUE; // L: 10
		this.field1487 = Float.MAX_VALUE; // L: 11
	} // L: 14

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;IB)V",
		garbageValue = "25"
	)
	void method2919(Buffer var1, int var2) {
		this.field1483 = var1.readShort(); // L: 17
		this.field1488 = var1.method9094(); // L: 18
		this.field1484 = var1.method9094(); // L: 19
		this.field1482 = var1.method9094(); // L: 20
		this.field1486 = var1.method9094(); // L: 21
		this.field1487 = var1.method9094(); // L: 22
	} // L: 23

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lhc;",
		garbageValue = "-1218756149"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 98
		if (var1 != null) { // L: 99
			return var1;
		} else {
			byte[] var2 = Frames.ItemComposition_archive.takeFile(10, var0); // L: 100
			var1 = new ItemComposition(); // L: 101
			var1.id = var0; // L: 102
			if (var2 != null) { // L: 103
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 104
			if (var1.noteTemplate != -1) { // L: 105
				var1.genCert(ItemComposition_get(var1.noteTemplate), ItemComposition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 106
				var1.genBought(ItemComposition_get(var1.notedId), ItemComposition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 107
				var1.genPlaceholder(ItemComposition_get(var1.placeholderTemplate), ItemComposition_get(var1.placeholder));
			}

			if (!class502.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 108
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) { // L: 109
					var1.name = var1.name + " (Members)"; // L: 110
				}

				var1.isTradable = false; // L: 112

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 113
					var1.groundActions[var3] = null; // L: 114
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 116
					if (var3 != 4) { // L: 117
						var1.inventoryActions[var3] = null; // L: 118
					}
				}

				var1.shiftClickIndex = -2; // L: 121
				var1.team = 0; // L: 122
				if (var1.params != null) { // L: 123
					boolean var6 = false; // L: 124

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 125
						ParamComposition var5 = MusicPatchNode.getParamDefinition((int)var4.key); // L: 126
						if (var5.autoDisable) { // L: 127
							var4.remove();
						} else {
							var6 = true; // L: 128
						}
					}

					if (!var6) { // L: 130
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 133
			return var1; // L: 134
		}
	}
}
