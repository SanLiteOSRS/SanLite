import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class214 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	public UrlRequest field2303;
	@ObfuscatedName("ah")
	public float[] field2300;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	final class208 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lic;)V"
	)
	class214(class208 var1) {
		this.this$0 = var1;
		this.field2300 = new float[4]; // L: 330
	} // L: 332

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhv;",
		garbageValue = "-1391716385"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 90
		if (var1 != null) { // L: 91
			return var1;
		} else {
			byte[] var2 = class519.ItemComposition_archive.takeFile(10, var0); // L: 92
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

			if (!class129.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 100
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) { // L: 101
					var1.name = var1.name + " (Members)"; // L: 102
				}

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
						ParamComposition var5 = Frames.getParamDefinition((int)var4.key); // L: 118
						if (var5.autoDisable) { // L: 119
							var4.remove();
						} else {
							var6 = true; // L: 120
						}
					}

					if (!var6) { // L: 122
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 125
			return var1; // L: 126
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2138855763"
	)
	public static int method4227(int var0) {
		return class314.field3402[var0]; // L: 26
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lrq;",
		garbageValue = "1839119171"
	)
	public static class461 method4228() {
		synchronized(class461.field4764) { // L: 28
			if (IgnoreList.field4663 == 0) { // L: 29
				return new class461();
			} else {
				class461.field4764[--IgnoreList.field4663].method8409(); // L: 31
				return class461.field4764[IgnoreList.field4663]; // L: 32
			}
		}
	}
}
