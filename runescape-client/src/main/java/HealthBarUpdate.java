import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1225111563
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1250696899
	)
	@Export("health")
	int health;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2028064551
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2116244499
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "470045969"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhz;",
		garbageValue = "36"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 90
		if (var1 != null) { // L: 91
			return var1;
		} else {
			byte[] var2 = class355.ItemComposition_archive.takeFile(10, var0); // L: 92
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

			if (!FileSystem.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 100
				var1.name = "Members object"; // L: 101
				var1.isTradable = false; // L: 102

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
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
						ParamComposition var5 = class33.getParamDefinition((int)var4.key); // L: 116
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldr;B)V",
		garbageValue = "5"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		PlayerType.runScript(var0, 500000, 475000); // L: 103
	} // L: 104
}
